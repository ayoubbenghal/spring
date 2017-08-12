package fr.dta.spring.annotations.utilisateur.model;

public class UserNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "L UTILISATEUR N EXISTE PAS ";
	}

}
