package steps.loginScreen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import pageObjects.loginScreen.LoginPage;

public class LoginSteps {

	@Steps
	LoginPage loginPage;

	@Given("^I am on the login page$")
	public void i_am_on_the_login_page() throws Throwable {
		loginPage.getUrl().equals("https://app.staging..com/adm/");
	}

	@When("^I fill in the email and the password with valid credentials$")
	public void i_fill_in_the_email_and_the_password_with_valid_credentials() throws Throwable {
		loginPage.fillUsername("eportella@.com");
		loginPage.fillPassword("123");
	}

	@When("^I click the login button$")
	public void i_click_the_login_button() throws Throwable {
		loginPage.clickEnterButton();
	}

	@When("^I fill in the email and the password with invalid credentials$")
	public void i_fill_in_the_email_and_the_password_with_invalid_credentials() throws Throwable {
		loginPage.fillUsername("invalid@credential.com");
		loginPage.fillPassword("321");
	}

	@Then("^I should be at the Assets page$")
	public void i_should_be_at_the_Assets_page() throws Throwable {
		loginPage.getUrl().equals("https://app.staging..com/adm/");
	}

	@Then("^I should receive an error message about my credentials$")
	public void i_should_receive_an_error_message_about_my_credentials() throws Throwable {
		loginPage.checkWarnMessage();
	}

}