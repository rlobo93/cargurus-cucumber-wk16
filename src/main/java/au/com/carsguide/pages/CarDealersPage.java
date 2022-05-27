package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class CarDealersPage extends Utility {
    private static final Logger log = LogManager.getLogger(CarDealersPage.class.getName());

    public CarDealersPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(className = "dealerListing--name")
    //WebElement list;
    List<WebElement> list;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Next')]")
    WebElement nextBtn;





    public String dealerList(String text){
        log.info("Dealer List : " + list.toString() + "<br>");
        for ( WebElement element : list) {
            String str = element.getText();
            if(str.equalsIgnoreCase(text)){
                return str;
            }
        }
        return null;
    }

    public void clickOnNextButton(){
        log.info("Click On Next Button : " + nextBtn.toString() + "<br>");
        clickOnElement(nextBtn);
    }










}
