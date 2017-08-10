package fr.dta.spring.annotations.employee.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import fr.dta.spring.annotations.employee.model.Employee;

@Service
@Scope(value = "prototype")
public class MailService {
	
	private String message;
	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void sendMail(Employee e){
		System.out.println(message);
	}
}
