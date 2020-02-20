package steps.administrationScreen;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
			features = "classpath:features/administrationScreen",
			plugin = {"pretty", "html:target/cucumber-html-report"},
			tags = {}
		)
public class AdministrationTest {
	
}