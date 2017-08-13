package fr.dta.spring.annotations;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import fr.dta.spring.annotations.employee.model.EmployeeNotFoundException;
import fr.dta.spring.annotations.employee.service.EmployeeService;

/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *
 * 2017
 * 
 * 
 * Pour tester les pointcuit pour les chemins définis
 *
 *
 * AopConfiguration.java
 */
@Component
@Aspect
public class AopConfiguration {
	
	/**
	 * 
	 * void
	 * Avant Chaque méthode ayant quelconque paramétre ou retour dans la Class {@linkplain r.dta.spring.annotations.employee.service.EmployeeService}
	 *
	 */
	@Before("execution(* fr.dta.spring.annotations.employee.service.EmployeeService.*(..))")
	public void getMessageAnnotations() {
		System.out.println("BEFORE EACH METHOD IN SERVICE ANNOTATIONS");
	}
	/**
	 * 
	 * void
	 * Avant Chaque méthode ayant quelconque paramétre ou retour dans la Class {@linkplain fr.dta.spring.xml.employee.service.EmployeeService}
	 *
	 */
	@Before("execution(* fr.dta.spring.xml.employee.service.EmployeeService.*(..))")
	public void getMessageXML() {
		System.out.println("BEFORE EACH METHODE IN SERVICE XML");
	}
	
	/**
	 * @param ex
	 * void
	 * Apres une exception qui sera soulevé dans une methode findBySsn avec quelconque paramétre ou retour 
	 * Et qui sera dans dans la classe {@linkplain EmployeeService}
	 *
	 */
	@AfterThrowing(pointcut="execution(* fr.dta.spring.annotations.employee.service.EmployeeService.findBySsn(..))",
			throwing="ex")
	public void getException(EmployeeNotFoundException ex) {
		System.out.println(ex.toString());
	}

}
