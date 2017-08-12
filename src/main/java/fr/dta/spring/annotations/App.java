package fr.dta.spring.annotations;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//@ImportResource("classpath:database.xml")

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class App {
	
	
	
	
}
