package fr.dta.spring.annotations.employee.model;

public class EmployeeNotFoundException extends RuntimeException {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "L EMPLOYEE N EXISTE PAS ENSUITE .... ";
	}

}
