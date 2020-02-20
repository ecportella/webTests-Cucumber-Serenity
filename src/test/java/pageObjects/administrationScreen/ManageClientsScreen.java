package pageObjects.administrationScreen;

import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.SelenideElement;

import org.openqa.selenium.Keys;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ManageClientsScreen extends ScenarioSteps {

    private static final long serialVersionUID = 1L;
    
    private SelenideElement newClientButton = $x("//button[@id='administration-client-add-button']");
    private SelenideElement searchClientField = $x("//div[@id='administration-client-table_filter']//input");
    private SelenideElement clientItem = $x("//table[@id='administration-client-table']//tr[@class='odd']");
    private SelenideElement deleteClientItem = $x("//i[@class='fa fa-lg fa-trash-o delete remove-color is-dt-action-icon']");

    private SelenideElement generalTabButton = $x("//a[@id='ui-id-52']");
    private SelenideElement userAssociatedTabButton = $x("//a[@id='ui-id-53']");
    private SelenideElement addClientButton = $x("//span[contains(text(),'Add Client')]");
    private SelenideElement cancelButton = $x("//div[21]//button[2]//span[2]");

    private SelenideElement nameField = $x("//div[@class='common-client-info-geral pure-form']//input[@name='name']");
    private SelenideElement codeField = $x("//div[@class='common-client-info-geral pure-form']//input[@name='code']");
    private SelenideElement vatField = $x("//input[@name='nif']");
    private SelenideElement addressField = $x("//div[@class='common-client-info-geral pure-form']//input[@name='address']");
    private SelenideElement contactsField = $x("//span[@class='select2 select2-container select2-container--default select2-container--above']//input[@class='select2-search__field']");
    private SelenideElement postalCodeField = $x("//div[@class='common-client-info-geral pure-form']//input[@name='postal_code']");
    private SelenideElement cityField = $x("//div[@class='common-client-info-geral pure-form']//input[@name='city']");
    private SelenideElement latitudeField = $x("//tr[@class='table-input-row']//input[@name='latitude']");
    private SelenideElement longitudeField = $x("//tr[@class='table-input-row']//input[@name='longitude']");
    private SelenideElement createBuildingOption = $x("//input[@name='create-building']");

    private SelenideElement responsibleManagerField = $x("//span[@class='select2 select2-container select2-container--default select2-container--below']//input[@placeholder='Search people']");
    private SelenideElement associatedTechniciansField = $x("//div[@id='common-client-dialog-operator-technicians']//input[@placeholder='Search people']");
    
    private SelenideElement errorMessageValidation = $x("//div[@class='noty_body']");

    @Step
    public void clickNewClientButton() {
        newClientButton.click();
    }

    @Step
    public void fillSearchClientField(String client) {
        searchClientField.sendKeys(client);
    }

    @Step
    public void clickClientItem() {
        clientItem.click();
    }

    @Step
    public void hoverClientItem() {
        clientItem.hover();
    }

    @Step
    public void clickDeleteClientItem() {
        deleteClientItem.click();
    }

    @Step
    public void clickGeneralTabButton() {
        generalTabButton.click();
    }

    @Step
    public void clickUserAssociatedTabButton() {
        userAssociatedTabButton.click();
    }

    @Step
    public void clickAddClientButton() {
        addClientButton.click();
    }

    @Step
    public void clickCancelButton() {
        cancelButton.click();
    }

    @Step
    public void fillNameField(String name) {
        nameField.sendKeys(name);
    }

    @Step
    public void fillCodeField(String code) {
        codeField.sendKeys(code);
    }

    @Step
    public void fillVatField(String vat) {
        vatField.sendKeys(vat);
    }

    @Step
    public void fillAddressField(String address) {
        addressField.sendKeys(address);
    }

    @Step
    public void selectContactsField(String contactName) {
        contactsField.sendKeys(contactName);
        contactsField.sendKeys(Keys.ARROW_UP);
        contactsField.sendKeys(Keys.ENTER);
    }

    @Step
    public void fillPostalCodeField(String postalCode) {
        postalCodeField.sendKeys(postalCode);
    }

    @Step
    public void fillCityField(String city) {
        cityField.sendKeys(city);
    }

    @Step
    public void fillLatitudeField(String latitude) {
        latitudeField.sendKeys(latitude);
    }
    
    @Step
    public void fillLongitudeField(String longitude) {
        longitudeField.sendKeys(longitude);
    }

    @Step
    public void clickCreateBuildingOption() {
        createBuildingOption.click();
    }

    @Step
    public void fillResponsibleManagerField(String responsible) {
        responsibleManagerField.sendKeys(responsible);
    }

    @Step
    public void fillAssociatedTechniciansField(String technician) {
        associatedTechniciansField.sendKeys(technician);
    }

    @Step
    public void checkErrorMessageValidation() {
        errorMessageValidation.isDisplayed();
    }

}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
