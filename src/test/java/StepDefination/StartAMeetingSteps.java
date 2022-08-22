package StepDefination;

import Pages.HomeScreenPage;
import Pages.LogInPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class StartAMeetingSteps {
    WebDriver driver;

    @Before
    public void browserSteup() {
        System.out.println("Browser steup");
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @When("User logs in to jiomeet website")
    public void user_logs_in_to_jiomeet_website() {
        new LogInPage(driver)
                .userLaunchesTheWebsite()
                .userSelectesSignIp()
                .userEntersUserName()
                .userEntersPassword()
                .Login();
    }
    @Then("User should be in home screen")
    public void user_should_be_in_home_screen() {
        new HomeScreenPage(driver).isUserInHomeScreen();

    }
    @Then("User should be able to see start a meeting option")
    public void user_should_be_able_to_see_start_a_meeting_option() {
        System.out.println("Step 4");

    }
    @When("User selects Start a meeting option")
    public void user_selects_start_a_meeting_option() {
        System.out.println("Step 5");

    }
    @When("User selects confirm start button")
    public void user_selects_confirm_start_button() {
        System.out.println("Step 6");

    }
    @Then("User should be able to start a meeting")
    public void user_should_be_able_to_start_a_meeting() {
        System.out.println("Step 7");

    }

    @After
    public void TearDown(){
        driver.close();
        driver.quit();
    }
}
