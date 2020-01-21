package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {

    @FindBy(id = "loginLogoutLink")
    private WebElement loginBtn;

    @FindBy(id = "plan-travel-expander")
    private WebElement planTravel;

    @FindBy(xpath = "//strong[contains(text(),'Taking a trip?')]")
    private WebElement planTravelSubMenu;

    public void validateLoginIsDisplayeAndClickOnLoginButton() {
        //Assert.assertEquals(loginBtn.isDisplayed(),true);
        Assert.assertTrue(loginBtn.isDisplayed());
        loginBtn.click();
    }

    public void validatePlanTravelIsDisplayed() {
        Assert.assertTrue(planTravel.isDisplayed());
    }

    public void clickOnPlanTravel() {
        planTravel.click();
    }

    public void validatePlanTravelSubMenuDisplayed() {
        Assert.assertTrue(planTravelSubMenu.isDisplayed());
        System.out.println(planTravelSubMenu.getText());
    }
}
