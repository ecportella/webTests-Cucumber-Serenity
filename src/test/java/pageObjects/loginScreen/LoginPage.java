package pageObjects.loginScreen;

import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginPage extends ScenarioSteps {

    private static final long serialVersionUID = 1L;
    
    private SelenideElement usernameField = $x("//input[@name='user']");
    private SelenideElement passwordField = $x("//input[@name='pass']");
    private SelenideElement enterButton =$x("//button[contains(text(),'Entrar')]");
    private SelenideElement warnMessage = $x("//i[contains(text(),'Os dados de login estão incorretos')]");
    private SelenideElement forgotPassword = $x("//a[contains(text(),'?')]");
    private SelenideElement emailToRecovery = $x("//input[@placeholder='Email']");
    private SelenideElement sendRecoveryEmail = $x("//button[@class='btn btn-lg btn-primary btn-block']");
    private SelenideElement recoverySuccessMessage = $x("//div[@class='alert alert-success']");
    private SelenideElement recoveryFailedMessage = $x("//div[@class='alert alert-danger']");

    @Step
    public String getUrl() {
        return WebDriverRunner.getWebDriver().getCurrentUrl();
    }

    @Step
    public void fillUsername(String user) {
        usernameField.setValue(user);
    }

    @Step
    public void fillPassword(String password) {
        passwordField.setValue(password);
    }

    @Step
    public void clickEnterButton() {
        enterButton.click();
    }

    @Step
    public void checkWarnMessage() {
        warnMessage.isDisplayed();
    }

    @Step
    public void clickForgotPassword() {
        forgotPassword.click();
    }

    @Step
    public void fillEmailToRecovery(String email) {
        emailToRecovery.sendKeys(email);
    }

    @Step
    public void clickSendRecoveryEmail() {
        sendRecoveryEmail.click();
    }

    @Step
    public void checkRecoverySuccessMessage() {
        recoverySuccessMessage.isDisplayed();
    }

    @Step
    public void checkRecoveryFailedMessage() {
        recoveryFailedMessage.isDisplayed();
    }

    public void signIn(String username, String password) {
        fillUsername(username);
        fillPassword(password);
        clickEnterButton();
    }
    
}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
