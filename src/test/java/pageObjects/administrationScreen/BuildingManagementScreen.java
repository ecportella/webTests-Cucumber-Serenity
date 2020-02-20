package pageObjects.administrationScreen;

import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.SelenideElement;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class BuildingManagementScreen extends ScenarioSteps {

    private static final long serialVersionUID = 1L;
    
    //Buildings Management
    private SelenideElement searchLocationField = $x("//a[@id='ui-id-1']");
    private SelenideElement buildingItem(String buildingName) {return $x("//a[contains(text(),"+buildingName+")]");}
    private SelenideElement addBuildingButton = $x("//a[contains(@class,'building')]//span[contains(text(),'Add')]");
    private SelenideElement editBuildingButton = $x("//a[contains(@class,'building')]//span[contains(text(),'Edit')]");
    private SelenideElement removeBuildingButton = $x("//a[contains(@class,'building')]//span[contains(text(),'Remove')]");
    private SelenideElement addFolderButton = $x("//a[contains(@class,'folder')]//span[contains(text(),'Add')]");
    private SelenideElement editFolderButton = $x("//a[contains(@class,'folder')]//span[contains(text(),'Edit')]");
    private SelenideElement removeFolderButton = $x("//a[contains(@class,'folder')]//span[contains(text(),'Remove')]");
    private SelenideElement addLocationButton = $x("//a[contains(@class,'local')]//span[contains(text(),'Add')]");
    private SelenideElement editLocationButton = $x("//a[contains(@class,'local')]//span[contains(text(),'Edit')]");
    private SelenideElement removeLocationButton = $x("//a[contains(@class,'local')]//span[contains(text(),'Remove')]");

    @Step
    public void fillsearchLocationField(String location) {
        searchLocationField.sendKeys(location);
    }

    @Step
    public void clickBuildingItemFromList(String buildingName) {
        buildingItem(buildingName).click();
    }

    @Step
    public void clickAddBuildingButton() {
        addBuildingButton.click();
    }

    @Step
    public void clickEditBuildingButton() {
        editBuildingButton.click();
    }

    @Step
    public void clickRemoveBuildingButton() {
        removeBuildingButton.click();
    }

    @Step
    public void clickAddFolderButton() {
        addFolderButton.click();
    }

    @Step
    public void clickEditFolderButton() {
        editFolderButton.click();
    }

    @Step
    public void clickRemoveFolderButton() {
        removeFolderButton.click();
    }

    @Step
    public void clickAddLocationButton() {
        addLocationButton.click();
    }

    @Step
    public void clickEditLocationButton() {
        editLocationButton.click();
    }

    @Step
    public void clickRemoveLocationButton() {
        removeLocationButton.click();
    }

    @Step
    public void click() {
        
    }

}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
