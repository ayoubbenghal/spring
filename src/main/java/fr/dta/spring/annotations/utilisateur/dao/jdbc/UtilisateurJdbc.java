package fr.dta.spring.annotations.utilisateur.dao.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import fr.dta.spring.annotations.employee.dao.AbstractJdbcRepository;
import fr.dta.spring.annotations.utilisateur.dao.repository.UtilisateurRepository;
import fr.dta.spring.annotations.utilisateur.model.UserNotFoundException;
import fr.dta.spring.annotations.utilisateur.model.Utilisateur;




 
/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *
 * 2017
 * 
 * 
 * Repository pour les requétes à la base de données
 *
 *
 * UtilisateurJdbc.java
 */
@Repository
//@Profile(value = { "USERJDBC" })

public class UtilisateurJdbc extends AbstractJdbcRepository implements UtilisateurRepository{
	
	

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.utilisateur.dao.repository.UtilisateurRepository#updateUserRole()
	 */
	
	
	/**
	 * Cherche tous les employés qui ont un salaire superieure à 3000 et affecter le role de leur utilisateurs 
	 * 
	 * Le role est Cadre pour ses utilisateur
	 * 
	 */
	@Override
	public void updateUserRole() {
		int count =this.jdbcTemplate.update("UPDATE utilisateur SET role= ? "
				+ "WHERE username IN "
				+ " (SELECT username FROM employee WHERE salary>3000)","CADRE");
		if(count<1) {
			throw new UserNotFoundException();
		}
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.utilisateur.dao.repository.UtilisateurRepository#add(fr.dta.spring.annotations.utilisateur.model.Utilisateur)
	 */
	@Override
	public void add(Utilisateur user) {
		this.jdbcTemplate.update("INSERT INTO utilisateur(username) values (?)",user.getUsername());
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.utilisateur.dao.repository.UtilisateurRepository#getListUser()
	 */
	@Override
	public List<Utilisateur> getListUser() {
		return this.jdbcTemplate.query("select * from utilisateur", new UtilisateurMapper());
		
	
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.utilisateur.dao.repository.UtilisateurRepository#truncateUsers()
	 */
	@Override
	public void truncateUsers() {
		System.out.println("DELETE");
		this.jdbcTemplate.update("delete from utilisateur");
	}
	
	private static final class UtilisateurMapper implements RowMapper<Utilisateur>{

		@Override
		public Utilisateur mapRow(ResultSet rs, int arg1) throws SQLException {
			// TODO Auto-generated method stub
			
			return new Utilisateur(rs.getString("username"), rs.getString("password"), rs.getString("role"));
		}
	
		
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.utilisateur.dao.repository.UtilisateurRepository#addList(java.util.List)
	 */
	@Override
	public void addList(List<Utilisateur> users) {
		System.out.println("ADD");
		users.forEach(user->add(user));
		
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.utilisateur.dao.repository.UtilisateurRepository#updateUserRoleException()
	 */
	/**
	 * Méthode pour faire un test de l'exception qui sera levée 
	 * 
	 * Aucun Employé n'a un salaire superieur à 6000
	 */
	@Override
	public void updateUserRoleException() {

		int count =this.jdbcTemplate.update("UPDATE utilisateur SET role= ? "
				+ "WHERE username IN "
				+ " (SELECT username FROM employee WHERE salary>6000)","CADRE");
		if(count<1) {
			throw new UserNotFoundException();
		}
	
		// TODO Auto-generated method stub
		
	}

}
