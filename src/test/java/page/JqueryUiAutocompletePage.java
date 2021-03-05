package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JqueryUiAutocompletePage extends AbstractPage {


    @FindBy(xpath = "//*[@id='tags']")
    private WebElement tagsField;
//<iframe src="/resources/demos/autocomplete/default.html" class="demo-frame"></iframe>

    public JqueryUiAutocompletePage(WebDriver driver) {
        super(driver);
    }

    public JqueryUiAutocompletePage openPage(String url) {
        driver.get(url);
        driver.manage().window().maximize();
        return this;
    }

    public JqueryUiAutocompletePage clickOnTagsField() {
        new WebDriverWait(driver,10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("/html/body/div[2]/div[2]/div/div[1]/iframe")));
        new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(tagsField)).sendKeys("a");
     //   tagsField.click();
//new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(tagsField)).sendKeys("1");
        // wait.until(ExpectedConditions.elementToBeClickable(tagsField));
        //     if (tagsField.isEnabled())
        //   tagsField.click();
//       tagsField.sendKeys("a");
        return this;
    }

    public JqueryUiAutocompletePage typeInTagsField() {
     //   tagsField.sendKeys("a");
        new WebDriverWait(driver,10);
        tagsField.click();
        tagsField.sendKeys("a");
        tagsField.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
        return this;
    }


}
