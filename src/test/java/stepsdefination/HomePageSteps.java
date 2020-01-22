package stepsdefination;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;

public class HomePageSteps {

    HomePage homePage;

    @When("^user can see plan travel is displayed$")
    public void user_can_see_plan_travel_is_displayed() {
        homePage = PageFactory.initElements(LoginSteps.driver, HomePage.class);
        homePage.validatePlanTravelIsDisplayed();
    }

    @Then("^user clicks on the plan travel$")
    public void user_clicks_on_the_plan_travel() {
        homePage = PageFactory.initElements(LoginSteps.driver, HomePage.class);
        homePage.clickOnPlanTravel();
    }

    @Then("^user validates plan travel submenu displayed$")
    public void user_validates_plan_travel_submenu_displayed() {
        homePage = PageFactory.initElements(LoginSteps.driver, HomePage.class);
        homePage.validatePlanTravelSubMenuDisplayed();
    }


    @When("^user validates book is clicked$")
    public void user_validates_book_is_clicked() {
        homePage = PageFactory.initElements(LoginSteps.driver, HomePage.class);
        homePage.validateBookIsClicked();

    }

    @Then("^user can see round trip and one way options$")
    public void user_can_see_round_trip_and_one_way_options() {
        homePage = PageFactory.initElements(LoginSteps.driver, HomePage.class);
        homePage.validateOneWayAndRoundTripIsDisplayed();
    }

    @Then("^user can click on both of the round trip and one way buttons$")
    public void user_can_click_on_both_of_the_round_trip_and_one_way_buttons() {
        homePage = PageFactory.initElements(LoginSteps.driver, HomePage.class);
        homePage.validateOneWayAndRoundTripIsClickAble();
    }


}
