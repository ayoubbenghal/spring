package alltests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import fr.dta.spring.annotations.employee.test.TestDeleteCreateReadEmployee;
import fr.dta.spring.annotations.employee.test.TestUpdateEmployee;
import fr.dta.spring.annotations.utilisateur.test.TestDeleteCreateReadUser;
import fr.dta.spring.annotations.utilisateur.test.TestUpdateUser;
import fr.dta.spring.xml.test.TestSpringXml;

@RunWith(Suite.class)
@SuiteClasses({TestDeleteCreateReadEmployee.class,TestDeleteCreateReadUser.class,
				TestUpdateEmployee.class,TestUpdateUser.class,TestSpringXml.class})
public class AllTests {

}
