package steps.administrationScreen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import pageObjects.administrationScreen.AdministrationSideMenu;
import pageObjects.administrationScreen.ManageClientsScreen;
import pageObjects.loginScreen.LoginPage;
import pageObjects.mainScreen.MainMenu;

public class ClientSteps {

	@Steps
	LoginPage loginPage;

	@Steps
	MainMenu mainMenu;

	@Steps
	AdministrationSideMenu administrationSideMenu;

	@Steps
	ManageClientsScreen manageClientsScreen;

	@Given("^I am on the administration page$")
	public void i_am_on_the_administration_page() {
		loginPage.signIn("eportella+admin@.com", "123");
		mainMenu.clickAdministrationButton();
	}

	@When("^I select the Clients and Suppliers menu then Clients submenu$")
	public void i_select_the_Clients_and_Suppliers_menu_then_Clients_submenu() {
		administrationSideMenu.clickClientsAndSuppliersButton();
		administrationSideMenu.clickManageClientsOption();
	}

	@When("^I click the New Client button$")
	public void i_click_the_New_Client_button() {
		manageClientsScreen.clickNewClientButton();
	}

	@When("^I fill all of the required fields and finish the registration$")
	public void i_fill_all_of_the_required_fields_and_finish_the_registration() {
		manageClientsScreen.fillNameField("Auto Name");
		manageClientsScreen.fillCodeField("AN");
		manageClientsScreen.fillVatField("123321");
		manageClientsScreen.fillAddressField("Rua dos Sonhos");
		manageClientsScreen.fillCityField("Porto");
		manageClientsScreen.clickAddClientButton();
	}

	@Then("^a new client must be shown on the list with the data filled in the registration$")
	public void a_new_client_must_be_shown_on_the_list_with_the_data_filled_in_the_registration() {
		manageClientsScreen.fillSearchClientField("Auto Name");
		manageClientsScreen.hoverClientItem();
	}

	@When("^I leave the form blank and try to finish the registration$")
	public void i_leave_the_form_blank_and_try_to_finish_the_registration() {
		manageClientsScreen.clickAddClientButton();
	}

	@Then("^the app should alert the user for the required fields$")
	public void the_app_should_alert_the_user_for_the_required_fields() {
		manageClientsScreen.checkErrorMessageValidation();
	}

	@When("^I click the View Client icon from one of the clients from the list$")
	public void i_click_the_View_Client_icon_from_one_of_the_clients_from_the_list() {
		manageClientsScreen.clickClientItem();
	}

	@Then("^all of the information from that client must be shown on a modal$")
	public void all_of_the_information_from_that_client_must_be_shown_on_a_modal() {
		
	}

	@When("^I click the Edit Client icon from one of the clients from the list$")
	public void i_click_the_Edit_Client_icon_from_one_of_the_clients_from_the_list() {
		
	}

	@When("^I change the content of some fields and finish the edition$")
	public void i_change_the_content_of_some_fields_and_finish_the_edition() {
		
	}

	@Then("^the edited client must be shown on the list with the data updated$")
	public void the_edited_client_must_be_shown_on_the_list_with_the_data_updated() {
		
	}

	@When("^I click the Delete Client icon from one of the clients from the list$")
	public void i_click_the_Delete_Client_icon_from_one_of_the_clients_from_the_list() {
		
	}

	@When("^I confirm that I want to delete this client$")
	public void i_confirm_that_I_want_to_delete_this_client() {
		
	}

	@Then("^the client must be removed from the list$")
	public void the_client_must_be_removed_from_the_list() {
		
	}

}