package fr.dta.spring.annotations.employee.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import fr.dta.spring.annotations.employee.model.Employee;


@Repository
@Profile(value = { "!JDBC" })
public class EmployeeBeanRepository implements EmployeeRepository{
	
	private List<Employee> listEmployees;
	
	
	public EmployeeBeanRepository() {
		
		listEmployees=new ArrayList<>();
		listEmployees.add(new Employee(15L,"AYOUB","BENGHAL"));
		listEmployees.add(new Employee(16L,"IMEN","BENGHAL"));
	}

	@Override
	public void saveEmployee(Employee employee) {
		System.out.println("SAVE");
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findBySsn(String ssn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveListEmployee(List<Employee> employeess) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUserName(Employee employee) {
		// TODO Auto-generated method stub
		
	}

}
