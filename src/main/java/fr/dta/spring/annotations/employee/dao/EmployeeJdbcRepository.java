package fr.dta.spring.annotations.employee.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import fr.dta.spring.annotations.employee.model.Employee;
import fr.dta.spring.annotations.employee.repository.EmployeeRepository;


@Repository
@Profile(value = { "JDBC" })
public class EmployeeJdbcRepository extends AbstractJdbcRepository implements EmployeeRepository{

	@Override
	public void saveEmployee(Employee employee) {
		
		
		
		this.jdbcTemplate.update("insert into employee (firstname,lastname) values (?,?)",employee.getPrenom(),employee.getNom());
	}

	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		
		return this.jdbcTemplate.query("select * from employee",new EmployeeMapper());

	}

	@Override
	public Employee findBySsn(String ssn) {
		
		// TODO Auto-generated method stub
		return this.jdbcTemplate.queryForObject("select * from employee where ssn= ?",new EmployeeMapper(),ssn );
	}

	@Override
	public void updateEmployee(Employee employee) {
		this.jdbcTemplate.update("update employee set ssn=?, salary=? where id=?",employee.getIdSecu(),employee.getSalaire(),employee.getId());
		
	}
	public void deleteAll() {
		this.jdbcTemplate.update("truncate employee");
		this.jdbcTemplate.update("ALTER SEQUENCE employee_id_seq RESTART WITH 1");
	}
	
	private static final class EmployeeMapper implements RowMapper<Employee>{

		@Override
		public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
			// TODO Auto-generated method stub
			
			return new Employee(rs.getLong("id"), rs.getString("lastname"), rs.getString("firstname"));
		}
	
		
	}

	@Override
	public void saveListEmployee(List<Employee> employees) {
		employees.forEach(employee->saveEmployee(employee));
		
	}

	@Override
	public void updateUserName(Employee employee) {
		this.jdbcTemplate.update("UPDATE employee SET username=? where id=?",employee.getUserName(),employee.getId());
		
	}
	
	
		
	

	
	
}
