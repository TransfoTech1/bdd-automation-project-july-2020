package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class HomePage {

    @FindBy(id = "loginLogoutLink")
    private WebElement loginBtn;

    @FindBy(id = "plan-travel-expander")
    private WebElement planTravel;

    @FindBy(xpath = "//strong[contains(text(),'Taking a trip?')]")
    private WebElement planTravelSubMenu;

    @FindBy(id = "flightRadio")
    private WebElement flightRadioBtn;

    @FindBy(xpath = "//input[@type='radio']")
    private List<WebElement> radioButtons;

    @FindBy(xpath = "//label[@for=\"flightSearchForm.tripType.roundTrip\"]")
    private WebElement roundTrip;

    @FindBy(xpath = "//label[@for=\"flightSearchForm.tripType.oneWay\"]")
    private WebElement oneWay;


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

    public void validateBookIsClicked() {
        Assert.assertTrue(flightRadioBtn.isDisplayed());
        String value = flightRadioBtn.getAttribute("value");
        Assert.assertEquals(value, "flight");
    }

    public void validateOneWayAndRoundTripIsDisplayed() {

        for (int i = 0; i < radioButtons.size(); i++) {
            String value = radioButtons.get(i).getAttribute("value");
            if (value.equalsIgnoreCase("roundTrip") || value.equalsIgnoreCase("oneWay")) {
                Assert.assertTrue(radioButtons.get(i).isDisplayed());
            }
        }
    }

    public void validateOneWayAndRoundTripIsClickAble() {
        for (int i = 0; i < radioButtons.size(); i++) {
            String value = radioButtons.get(i).getAttribute("value");
            if (value.equalsIgnoreCase("roundTrip")) {
                oneWay.click();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (value.equalsIgnoreCase("oneWay")) {
                roundTrip.click();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
