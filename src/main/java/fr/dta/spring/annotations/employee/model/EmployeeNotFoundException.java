package fr.dta.spring.annotations.employee.model;

public class EmployeeNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8450992754185351351L;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "L EMPLOYEE N EXISTE PAS ENSUITE .... ";
	}

}
