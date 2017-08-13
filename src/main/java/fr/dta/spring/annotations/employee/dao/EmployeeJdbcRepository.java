package fr.dta.spring.annotations.employee.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import fr.dta.spring.annotations.employee.model.Employee;
import fr.dta.spring.annotations.employee.repository.EmployeeRepository;




/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *
 * 2017
 * 
 * Repository pour les requétes à la base de données avec un profil JDBC
 *
 *
 * EmployeeJdbcRepository.java
 */
@Repository
@Profile(value = { "JDBC" })
public class EmployeeJdbcRepository extends AbstractJdbcRepository implements EmployeeRepository{

	
	
	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.repository.EmployeeRepository#saveEmployee(fr.dta.spring.annotations.employee.model.Employee)
	 */
	
	
	@Override
	public void saveEmployee(Employee employee) {
		
		
		
		this.jdbcTemplate.update("insert into employee (firstname,lastname) values (?,?)",employee.getPrenom(),employee.getNom());
	}

	
	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.repository.EmployeeRepository#findAllEmployees()
	 */
	@Override
	public List<Employee> findAllEmployees() {
		
		return this.jdbcTemplate.query("select * from employee",new EmployeeMapper());

	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.repository.EmployeeRepository#findBySsn(java.lang.String)
	 */
	@Override
	public Employee findBySsn(String ssn) {
		
		// TODO Auto-generated method stub
		return this.jdbcTemplate.queryForObject("select * from employee where ssn= ?",new EmployeeMapper(),ssn );
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.repository.EmployeeRepository#updateEmployee(fr.dta.spring.annotations.employee.model.Employee)
	 */
	@Override
	public void updateEmployee(Employee employee) {
		this.jdbcTemplate.update("update employee set ssn=?, salary=? where id=?",employee.getIdSecu(),employee.getSalaire(),employee.getId());
		
	}
	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.repository.EmployeeRepository#deleteAll()
	 */
	public void deleteAll() {
		this.jdbcTemplate.update("truncate employee");
		this.jdbcTemplate.update("ALTER SEQUENCE employee_id_seq RESTART WITH 1");
	}
	
	private static final class EmployeeMapper implements RowMapper<Employee>{

		/* (non-Javadoc)
		 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
		 */
		@Override
		public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
			// TODO Auto-generated method stub
			
			return new Employee(rs.getLong("id"), rs.getString("lastname"), rs.getString("firstname"));
		}
	
		
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.repository.EmployeeRepository#saveListEmployee(java.util.List)
	 */
	@Override
	public void saveListEmployee(List<Employee> employees) {
		employees.forEach(employee->saveEmployee(employee));
		
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.repository.EmployeeRepository#updateUserName(fr.dta.spring.annotations.employee.model.Employee)
	 */
	@Override
	public void updateUserName(Employee employee) {
		this.jdbcTemplate.update("UPDATE employee SET username=? where id=?",employee.getUserName(),employee.getId());
		
	}
	
	
		
	

	
	
}
