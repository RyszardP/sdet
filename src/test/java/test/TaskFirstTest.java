package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.JqueryUiAutocompletePage;
import page.JqueryUiMainPage;
import page.JqueryUiSpinnerPage;


public class TaskFirstTest {
    WebDriver firefoxDriver;


    @BeforeMethod(alwaysRun = true)
    public void browserSetup() {
        WebDriverManager.firefoxdriver().setup();
        firefoxDriver = new FirefoxDriver();
        firefoxDriver.manage().window().maximize();
    }

    @Test(description = "Verify left menu bar containing Interactions section")
    public void scenarioInteractionsTest() {
        new JqueryUiMainPage(this.firefoxDriver)
                .openPage("https://jqueryui.com/demos/")
                .checkInteractionsInLeftMenu("Interactions");
    }

    @Test(description = "Verify left menu bar containing Widgets section")
    public void scenarioWidgetsTest() {
        new JqueryUiMainPage(this.firefoxDriver)
                .openPage("https://jqueryui.com/demos/")
                .checkWidgetsInLeftMenu("Widgets");
    }


    @Test(description = "Verify left menu bar containing Effects section")
    public void scenarioEffectsTest() {
        new JqueryUiMainPage(this.firefoxDriver)
                .openPage("https://jqueryui.com/demos/")
                .checkEffectsInLeftMenu("Effects");
    }

    @Test(description = "Verify left menu bar containing Utilities section")
    public void scenarioUtilitiesTest() {
        new JqueryUiMainPage(this.firefoxDriver)
                .openPage("https://jqueryui.com/demos/")
                .checkUtilitiesInLeftMenu("Utilities");
    }

    @Test(description = "Verify value in spinner page")
    public void scenarioWithSpinnerPageTest() {
        new JqueryUiMainPage(this.firefoxDriver)
                .openPage("https://jqueryui.com/demos/")
                .clickOnSpinnerLink()
                .typeValue("12")
                .clickGetValueButton();


    }

    @Test(description = "just a test")
    public void secondSpinnerScenario(){
        new JqueryUiSpinnerPage(this.firefoxDriver)
                .openPage("https://jqueryui.com/spinner/")
                .typeValue("12");
    }

    @Test(description = "Verify value in Autocomplete page")
    public void scenarioWithAutocompletePageTest() {
        new JqueryUiMainPage(this.firefoxDriver)
                .openPage("https://jqueryui.com/demos/")
                .clickOnAutocompletePage()
                .clickOnTagsField();




    }

    @Test(description = "Test4")
    public void scenarioWithAutocomplete(){
        new JqueryUiAutocompletePage(this.firefoxDriver)
                .openPage("https://jqueryui.com/autocomplete/")
                .typeInTagsField();
    }


   /* @AfterMethod(alwaysRun = true)
    public void afterTestCompleted() {
        firefoxDriver.quit();
       firefoxDriver = null;
    }*/

}
