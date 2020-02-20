package pageObjects.mainScreen;

import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MainMenu extends ScenarioSteps {
    
    private static final long serialVersionUID = 1L;
    
    private SelenideElement assetsButton = $x("//a[@id='ui-id-1']");
    private SelenideElement worksButton = $x("//a[@id='ui-id-2']");
    private SelenideElement failuresButton = $x("//a[@id='ui-id-3']");
    private SelenideElement requestsButton = $x("//a[@id='ui-id-5']");
    private SelenideElement stockButton = $x("//a[@id='ui-id-6']");
    private SelenideElement ordersButton = $x("//a[@id='ui-id-7']");
    private SelenideElement reportsButton = $x("//a[@id='ui-id-8']");
    private SelenideElement utilitiesButton = $x("//a[@id='ui-id-9']");
    private SelenideElement documentsButton = $x("//a[@id='ui-id-10']");
    private SelenideElement administrationButton = $x("//a[@id='ui-id-11']");
    

    @Step
    public String getUrl() {
        return WebDriverRunner.getWebDriver().getCurrentUrl();
    }

    @Step
    public void clickAssetsButton() {
        assetsButton.click();
    }

    @Step
    public void clickWorksButton() {
        worksButton.click();
    }

    @Step
    public void clickFailuresButton() {
        failuresButton.click();
    }

    @Step
    public void clickRequestsButton() {
        requestsButton.click();
    }

    @Step
    public void clickStockButton() {
        stockButton.click();
    }

    @Step
    public void clickOrdersButton() {
        ordersButton.click();
    }

    @Step
    public void clickReportsButton() {
        reportsButton.click();
    }

    @Step
    public void clickUtilitiesButton() {
        utilitiesButton.click();
    }

    @Step
    public void clickDocumentsButton() {
        documentsButton.click();
    }

    @Step
    public void clickAdministrationButton() {
        administrationButton.click();
    }
    
}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
