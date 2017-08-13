package alltests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import fr.dta.spring.annotations.employee.test.TestDeleteCreateReadEmployee;
import fr.dta.spring.annotations.employee.test.TestUpdateEmployee;
import fr.dta.spring.annotations.utilisateur.test.TestDeleteCreateReadUser;
import fr.dta.spring.annotations.utilisateur.test.TestUpdateUser;
import fr.dta.spring.xml.test.TestSpringXml;






/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *
 * mvn -Dtest=AllTests test pour un Single Test Run
 * 
 * Teste Directement dans la base de données 
 * 
 * Le classement des tests est important pour ne pas violer les contraintes des clés étrangéres
 * 
 * 
 * 
 * 2017
 */
@RunWith(Suite.class)
@SuiteClasses({TestDeleteCreateReadEmployee.class,TestDeleteCreateReadUser.class,
				TestUpdateEmployee.class,TestUpdateUser.class,TestSpringXml.class})
public class AllTests {

}
