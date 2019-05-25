package EggTimer;

import PageObjects.HomePage;
import PageObjects.TimerPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs {

    HomePage homePage = new HomePage();
    TimerPage timerPage = new TimerPage();

    @Given("^I navigate to url$")
    public void i_navigate_to_url() {
        homePage.verifyElementsDisplayedOnHomePage();
    }

    @When("^I enter \"([^\"]*)\" in start a timer field$")
    public void i_enter_in_start_a_timer_field(String time) {
        homePage.enterTimeAndclickGo(time);
    }

    @When("^I click Go$")
    public void i_click_Go() {
        homePage.clickGo();
    }

    @Then("^I should see the countdown happen every second$")
    public void i_should_see_the_countdown_happen_every_second() {
        timerPage.verifyTimeIsDecreasedByOneSecond();
    }

    @Then("^The remaining time decreases in one-second increments$")
    public void the_remaining_time_decreases_in_one_second_increments() {

    }

}
