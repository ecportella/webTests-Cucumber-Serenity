package steps.administrationScreen;

import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before
    public void openBrowser() {
        Configuration.startMaximized = true;
        // Configuration.browserSize = "1024x768";
        // Configuration.headless = true;
        Configuration.timeout = 10000;

        open("");
    }

    @After
    public void embedScreenshot(Scenario scenario) {
        
        WebDriverRunner.driver().close();

    }

}