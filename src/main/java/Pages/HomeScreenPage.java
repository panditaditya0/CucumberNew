package Pages;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.an.E;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomeScreenPage {
    WebDriver driver;
    By userName = By.xpath("//h3[contains(text(), 'John Doe')]");

    public HomeScreenPage(WebDriver driver) {
        this.driver = driver;
    }

    public HomeScreenPage isUserInHomeScreen() {

        Assert.isTrue(isElementpresent(userName), "user is not in home page");
        return this;
    }

    private boolean isElementpresent(By locator) {
        try{

            Thread.sleep(2000);
        }catch (Exception e){

        }
        List<WebElement> elements = driver.findElements(locator);
        return elements.size() == 1;
    }
}
