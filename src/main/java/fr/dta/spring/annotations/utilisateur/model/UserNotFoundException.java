package fr.dta.spring.annotations.utilisateur.model;


/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *{@link RuntimeException} Exception
 *
 *
 * 2017
 *
 *
 * UserNotFoundException.java
 */
public class UserNotFoundException extends RuntimeException {

	
	/**
	 * UserNotFoundException.java
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/* (non-Javadoc)
	 * @see java.lang.Throwable#getMessage()
	 */
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "L UTILISATEUR N EXISTE PAS ";
	}

}
