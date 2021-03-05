import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task1 {
    public static void main(String[] args) {
        final String LINK_TO_JQUERY = "https://jqueryui.com/demos";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        By interactionSections = By.xpath("//div[@id='sidebar']/descendant-or-self::*[text()='Interactions']");
        By widgetsSection = By.xpath("//div[@id='sidebar']/descendant-or-self::*[text()='Widgets']");
        By effectsSection = By.xpath("//div[@id='sidebar']/descendant-or-self::*[text()='Effects']");
        By utilitiesSection = By.xpath("//div[@id='sidebar']/descendant-or-self::*[text()='Utilities']");
        driver.get(LINK_TO_JQUERY);

        //Actions select = new Actions(driver);
        //  select.doubleClick((WebElement) interactionSections);

        System.out.println(driver.findElement(interactionSections).isDisplayed() + " side bar contain interactions");
        System.out.println(driver.findElement(widgetsSection).isDisplayed() + " side bar contain Widgets");
        System.out.println(driver.findElement(effectsSection).isDisplayed() + " side bar contain Effects");
        System.out.println(driver.findElement(utilitiesSection).isDisplayed() + " side bar contain Utilities");




/*    public boolean isTextVisible(String text){
        return driver.findElement()
    }*/
    }
}
