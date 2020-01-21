package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage {

    @FindBy(xpath = "//h1")
    private WebElement loginText;

    @FindBy(id = "loginId")
    private WebElement username;

    @FindBy(id = "lastName")
    private WebElement lastname;

    @FindBy(id = "password")
    private WebElement password;


    public void validateLoginPageDisplayed() {
        String data = loginText.getText();
        Assert.assertEquals(data, "Log in");
    }

    public void validateUsernameLastnamePasswordIsDisplayed() {
        Assert.assertTrue(username.isDisplayed());
        Assert.assertTrue(lastname.isDisplayed());
        Assert.assertTrue(password.isDisplayed());
    }

    public void validateUsernameLastnamePasswordIsFilled() {
        username.sendKeys("test123");
        lastname.sendKeys("test123");
        password.sendKeys("test123");
    }
}
