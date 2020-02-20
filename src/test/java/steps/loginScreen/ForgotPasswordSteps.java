package steps.loginScreen;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import pageObjects.loginScreen.LoginPage;

public class ForgotPasswordSteps {

	@Steps
	LoginPage loginPage;

	@When("^I click the forgot your password link$")
	public void i_click_the_forgot_your_password_link() {
		loginPage.clickForgotPassword();
	}

	@When("^I fill the email field in the recovery page$")
	public void i_fill_the_email_field_in_the_recovery_page() {
		loginPage.fillEmailToRecovery("eportella+admin@.com");
	}

	@Then("^an email should be sent to me with instructions to recover my password$")
	public void an_email_should_be_sent_to_me_with_instructions_to_recover_my_password() {
		loginPage.checkRecoverySuccessMessage();
	}

	@Then("^a message of non existing email should be shown$")
	public void a_message_of_non_existing_email_should_be_shown() {
		loginPage.checkRecoveryFailedMessage();
	}

}