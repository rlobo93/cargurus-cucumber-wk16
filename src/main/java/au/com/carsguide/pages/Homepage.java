package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Utility {
    private static final Logger log = LogManager.getLogger(Homepage.class.getName());

    public Homepage() {
        PageFactory.initElements(driver, this);
    }


    //     I mouse hover on “buy+sell” tab
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement mousehoverbuyandsell;

    //     I click ‘Search Cars’ link
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement searchCars;


    public void mouseHoverOnBuyAndSell() {
        log.info("Mouse Hover On Buy And Sell : " + mousehoverbuyandsell.toString() + "<br>");
        mouseHoverToElement(mousehoverbuyandsell);
    }

    public void clickSearchCars() {
        log.info("Click Search Cars : " + searchCars.toString() + "<br>");
        clickOnElement(searchCars);
    }


    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Find a Dealer')]")
    WebElement dealer;

    public void clickFindDealer(){
        log.info("click Find Dealer : " + dealer.toString() + "<br>");
        clickOnElement(dealer);
    }



}
