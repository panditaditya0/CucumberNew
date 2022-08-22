package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {

    WebDriver driver;
    By SignInButton = By.xpath("//a[contains(text(),'Sign In')]");
    By userNameEditText = By.id("username");
    By passwordEditText = By.id("password");
    By loginButton = By.id("signinButton");


    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    public LogInPage userLaunchesTheWebsite() {
        driver.get("https://rc.jiomeet.jio.com/home");
        return this;
    }

    public LogInPage userSelectesSignIp() {
        driver.findElement(SignInButton).click();
        return this;
    }

    public LogInPage userEntersUserName() {
        driver.findElement(userNameEditText).sendKeys("e2e_izGhn15qRg@getnada.com");
        driver.findElement(By.xpath("//*[contains(text(), 'Proceed')]")).click();
        return this;
    }

    public LogInPage userEntersPassword() {
        driver.findElement(passwordEditText).sendKeys("Passw0rd!");
        return this;
    }

    public LogInPage Login() {
        driver.findElement(loginButton).click();
        return this;
    }

}
