package fr.dta.spring.annotations.employee.model;


/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *
 * 2017
 * 
 * Exception de type {@link RuntimeException}
 *
 *
 * EmployeeNotFoundException.java
 */
public class EmployeeNotFoundException extends RuntimeException {

	

	/**
	 *EmployeeNotFoundException.java
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 8450992754185351351L;

	/* (non-Javadoc)
	 * @see java.lang.Throwable#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "L EMPLOYEE N EXISTE PAS ENSUITE .... ";
	}

}
