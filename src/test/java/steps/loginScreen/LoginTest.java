package steps.loginScreen;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
			features = "classpath:features/loginScreen",
			plugin = {"pretty", "html:target/cucumber-html-report"},
			tags = {}		
		)
public class LoginTest {
	
}