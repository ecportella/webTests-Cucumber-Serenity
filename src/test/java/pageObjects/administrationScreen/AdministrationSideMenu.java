package pageObjects.administrationScreen;

import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.SelenideElement;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AdministrationSideMenu extends ScenarioSteps {

    private static final long serialVersionUID = 1L;
    
    private SelenideElement locationsButton = $x("//h3[@id='aclocal']");
    private SelenideElement buildingsOption = $x("//h5[@id='local_building_v2']");
    private SelenideElement locationTypesOption = $x("//h5[@id='local_tipology']");
    private SelenideElement maintenanceButton = $x("//h3[@id='accategory2']");
    private SelenideElement manageOption = $x("//h5[@id='category_admin']");
    private SelenideElement usersAndContactsButton = $x("//h3[@id='acoperator']");
    private SelenideElement usersOption = $x("//h5[@id='operator_add_v2']");
    private SelenideElement contactsOption = $x("//h5[@id='admin-menu-contacts']");
    private SelenideElement specialitiesOption = $x("//h5[@id='operator_technical_skill']");
    private SelenideElement clientsAndSuppliersButton = $x("//h3[@id='acclient']");
    private SelenideElement manageClientsOption = $x("//h5[@id='client_admin_v2']");
    private SelenideElement manageSuppliersOption = $x("//h5[@id='supplier_admin_v2']");
    private SelenideElement costsButton = $x("//h3[@id='accostcenter']");
    private SelenideElement manageCostCenterOption = $x("//h5[@id='cost_center']");
    private SelenideElement manageOtherCostsOption = $x("//h5[@id='other_costs_type']");
    private SelenideElement failuresButton = $x("//h3[@id='acfailure']");
    private SelenideElement areasAndTypesOfFailuresOption = $x("//h5[@id='failure_problem']");
    private SelenideElement pauseReasonsOption = $x("//h5[@id='failure_pause_reason']");
    private SelenideElement prioritiesOption = $x("//h5[@id='failure_priorities']");
    private SelenideElement documentsButton = $x("//h3[@id='acfiles']");
    private SelenideElement documentTypeOption = $x("//h5[@id='file_label']");
    private SelenideElement storeButton = $x("//h3[@id='acmarket']");
    private SelenideElement premiumAppsOption = $x("//h5[@id='market']");
    private SelenideElement integrationOption = $x("//h5[@id='integrations']");
    private SelenideElement entityButton = $x("//h3[@id='acentityconfig']");
    private SelenideElement aboutTheEntityOption = $x("//h5[@id='entity_data']");
    private SelenideElement reportsManagementOption = $x("//h5[@id='entity_report_data']");
    private SelenideElement infraspeakMarketOption = $x("//h5[@id='infraspeak-market']");
    private SelenideElement appsConfigurationsButton = $x("//h3[@id='acappsconfig']");
    private SelenideElement infraspeakDirectOption = $x("//h5[@id='direct_config']");
    private SelenideElement nfcOption = $x("//h5[@id='nfc_config']");
    private SelenideElement slaButton = $x("//h3[@id='acsla']");
    private SelenideElement calendarsOption = $x("//h5[@id='sla-calendars']");
    private SelenideElement slaOption = $x("//h5[@id='sla-configuration']");
    private SelenideElement utilitiesButton = $x("//h3[@id='acutilities']");
    private SelenideElement utilityTypeOption = $x("//h5[@id='utility-type']");
    private SelenideElement utilityMainMeterOption = $x("//h5[@id='utility-main-meter']");

    @Step
    public void clickLocationsButton() {
        locationsButton.click();
    }
    
    @Step
    public void clickBuildingsOption() {
        buildingsOption.click();
    }

    @Step
    public void clickLocationTypesOption() {
        locationTypesOption.click();
    }

    @Step
    public void clickMaintenanceButton() {
        maintenanceButton.click();
    }

    @Step
    public void clickManageOption() {
        manageOption.click();
    }

    @Step
    public void clickUsersAndContactsButton() {
        usersAndContactsButton.click();
    }

    @Step
    public void clickUsersOption() {
        usersOption.click();
    }

    @Step
    public void clickContactsOption() {
        contactsOption.click();
    }

    @Step
    public void clickSpecialitiesOption() {
        specialitiesOption.click();
    }

    @Step
    public void clickClientsAndSuppliersButton() {
        clientsAndSuppliersButton.click();
    }

    @Step
    public void clickManageClientsOption() {
        manageClientsOption.click();
    }

    @Step
    public void clickManageSuppliersOption() {
        manageSuppliersOption.click();
    }

    @Step
    public void clickCostsButton() {
        costsButton.click();
    }

    @Step
    public void clickManageCostCenterOption() {
        manageCostCenterOption.click();
    }

    @Step
    public void clickManageOtherCostsOption() {
        manageOtherCostsOption.click();
    }

    @Step
    public void clickFailuresButton() {
        failuresButton.click();
    }

    @Step
    public void clickAreasAndTypesOfFailuresOption() {
        areasAndTypesOfFailuresOption.click();
    }
    
    @Step
    public void clickPauseReasonsOption() {
        pauseReasonsOption.click();
    }

    @Step
    public void clickPrioritiesOption() {
        prioritiesOption.click();
    }

    @Step
    public void clickDocumentsButton() {
        documentsButton.click();
    }

    @Step
    public void clickDocumentTypeOption() {
        documentTypeOption.click();
    }

    @Step
    public void clickStoreButton() {
        storeButton.click();
    }

    @Step
    public void clickPremiumAppsOption() {
        premiumAppsOption.click();
    }

    @Step
    public void clickIntegrationOption() {
        integrationOption.click();
    }

    @Step
    public void clickEntityButton() {
        entityButton.click();
    }

    @Step
    public void clickAboutTheEntityOption() {
        aboutTheEntityOption.click();
    }

    @Step
    public void clickReportsManagementOption() {
        reportsManagementOption.click();
    }

    @Step
    public void clickInfraspeakMarketOption() {
        infraspeakMarketOption.click();
    }

    @Step
    public void clickAppsConfigurationsButton() {
        appsConfigurationsButton.click();
    }

    @Step
    public void clickInfraspeakDirectOption() {
        infraspeakDirectOption.click();
    }

    @Step
    public void clickNfcOption() {
        nfcOption.click();
    }

    @Step
    public void clickSlaButton() {
        slaButton.click();
    }

    @Step
    public void clickCalendarsOption() {
        calendarsOption.click();
    }

    @Step
    public void clickSlaOption() {
        slaOption.click();
    }

    @Step
    public void clickUtilitiesButton() {
        utilitiesButton.click();
    }

    @Step
    public void clickUtilityTypeOption() {
        utilityTypeOption.click();
    }

    @Step
    public void clickUtilityMainMeterOption() {
        utilityMainMeterOption.click();
    }

}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
