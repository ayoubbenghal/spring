package fr.dta.spring.annotations;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import fr.dta.spring.annotations.employee.model.EmployeeNotFoundException;

@Component
@Aspect
public class AopConfiguration {
	
	@Before("execution(* fr.dta.spring.annotations.employee.service.EmployeeService.*(..))")
	public void getMessageAnnotations() {
		System.out.println("BEFORE EACH METHOD IN SERVICE ANNOTATIONS");
	}
	@Before("execution(* fr.dta.spring.xml.employee.service.EmployeeService.*(..))")
	public void getMessageXML() {
		System.out.println("BEFORE EACH METHODE IN SERVICE XML");
	}
	
	@AfterThrowing(pointcut="execution(* fr.dta.spring.annotations.employee.service.EmployeeService.findBySsn(..))",
			throwing="ex")
	public void getException(EmployeeNotFoundException ex) {
		System.out.println(ex.toString());
	}

}
