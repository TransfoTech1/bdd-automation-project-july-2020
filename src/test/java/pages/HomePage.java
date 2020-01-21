package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {

    @FindBy(id = "loginLogoutLink")
    private WebElement loginBtn;


    public void validateLoginIsDisplayeAndClickOnLoginButton() {
        //Assert.assertEquals(loginBtn.isDisplayed(),true);
        Assert.assertTrue(loginBtn.isDisplayed());
        loginBtn.click();
    }
}
