package pages.checkout;

import helpers.RandomHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.base.BasePage;

public class AddressCheckoutPage extends BasePage {
    public AddressCheckoutPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@name='address1']")
    private WebElement addressInput;
    @FindBy(xpath = "//input[@name='city']")
    private WebElement cityInput;
    @FindBy(xpath = "//select[@name='id_state']")
    private WebElement stateSelect;
    @FindBy(xpath = "//input[@name='postcode']")
    private WebElement zipInput;
    @FindBy(xpath = "//button[@name='confirm-addresses']")
    private WebElement continueBtn;


    public AddressCheckoutPage setAddress(String address){
        sendKeys(addressInput,address);
        return this;
    }
    public AddressCheckoutPage setCity(String city){
        sendKeys(cityInput,city);
        return this;
    }
    public AddressCheckoutPage setRandomState(){

        Select select = new Select(stateSelect);
        int quantityOfOptions = select.getAllSelectedOptions().size();
        RandomHelper hp = new RandomHelper();
        select.selectByIndex(hp.getRandomNumber(quantityOfOptions));
        return this;
    }
    public ShippingCheckoutPage confirmAddresses() {
        click(continueBtn);
        return new ShippingCheckoutPage(driver);
    }

    public AddressCheckoutPage setZip(String zip) {
        sendKeys(zipInput,zip);
        return this;
    }
}
