
package fr.dta.spring.annotations.employee.dao;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;



/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *
 * 2017
 * 
 * Classe Abstraite avec un {@link JdbcTemplate} pour les query 
 *
 *
 * AbstractJdbcRepository.java
 */
public abstract class AbstractJdbcRepository {
	
	
	public JdbcTemplate jdbcTemplate;
	
	/**
	 * @param dataSource
	 */
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}

}
