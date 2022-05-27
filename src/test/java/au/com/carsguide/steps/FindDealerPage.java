package au.com.carsguide.steps;

import au.com.carsguide.pages.CarDealersPage;
import au.com.carsguide.pages.Homepage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;


import java.util.List;

public class FindDealerPage {
    @And("^I click Find a Dealer$")
    public void iClickFindADealer() {
        new Homepage().clickFindDealer();
    }

    @Then("^I navigate to car-dealers page$")
    public void iNavigateToCarDealersPage() {

    }

    @And("^I should see the dealer names \"([^\"]*)\" are display on page$")
    public void iShouldSeeTheDealerNamesAreDisplayOnPage(String dealersName)  {
        new CarDealersPage().dealerList(dealersName);
    }


    @And("^I should see the dealer names dealersName are display on page$")
    public void iShouldSeeTheDealerNamesDealersNameAreDisplayOnPage(DataTable dataTable) {
        List<String> expectedList = dataTable.asList(String.class);
        for (String data : expectedList) {
            while (new CarDealersPage().dealerList(data)==null) {
                new CarDealersPage().clickOnNextButton();
            }
            Assert.assertEquals("Dealer name not found", data, new CarDealersPage().dealerList(data));
        }
    }



}
