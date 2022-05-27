package au.com.carsguide.steps;

import au.com.carsguide.pages.Homepage;
import au.com.carsguide.pages.SearchCarsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuySteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on “buy\\+sell” tab$")
    public void iMouseHoverOnBuySellTab() {
        new Homepage().mouseHoverOnBuyAndSell();
    }

    @And("^I click ‘Search Cars’ link$")
    public void iClickSearchCarsLink() {
        new Homepage().clickSearchCars();
    }

    @Then("^I navigate to ‘new and used car search’ page$")
    public void iNavigateToNewAndUsedCarSearchPage() {
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String Make) {
        new SearchCarsPage().selectMake(Make);
    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String Model) {
        new SearchCarsPage().selectModel(Model);
    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String Location) {
        new SearchCarsPage().selectLocation(Location);
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String Price) {
        new SearchCarsPage().selectPrice(Price);
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new SearchCarsPage().clickFindMyNextCarTab();
    }


    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String make) {
        new SearchCarsPage().verifyMake(make);
    }


    @And("^I click ‘Used’ link$")
    public void iClickUsedLink() {
        new SearchCarsPage().clickOnUsedLink();
    }

    @Then("^I navigate to ‘Used Cars For Sale’ page$")
    public void iNavigateToUsedCarsForSalePage() {
        new SearchCarsPage().navigateToUsedCarsForSale();
    }


}
