package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {

    public static WebDriver driver;
    LoginPage loginPage;


    @Given("^user has opened a web browser and navigated to aa.com$")
    public void user_has_opened_a_web_browser_and_navigated_to_aa_com() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.aa.com");
    }

    @When("^user clicks on the login button from homepage$")
    public void user_clicks_on_the_login_button_from_homepage() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.validateLoginIsDisplayeAndClickOnLoginButton();
    }

    @Then("^login page comes up$")
    public void login_page_comes_up() {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.validateLoginPageDisplayed();
    }

    @Then("^user validates username, last name & password is displayed$")
    public void user_validates_username_last_name_password_is_displayed() {
        loginPage.validateUsernameLastnamePasswordIsDisplayed();
    }

    @Then("^user fills username, last name & password field$")
    public void user_fills_username_last_name_password_field() {
        loginPage.validateUsernameLastnamePasswordIsFilled();
    }

    @Then("^user close the browser$")
    public void user_close_the_browser() {
        driver.quit();
    }

}
