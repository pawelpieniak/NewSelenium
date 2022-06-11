package pages.checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.base.BasePage;

public class ShippingCheckoutPage extends BasePage {
    public ShippingCheckoutPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//button[@name='confirmDeliveryOption']")
    private WebElement continueBtn;

    public ShippingCheckoutPage confirmShipping() {
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
        click(continueBtn);
        return new ShippingCheckoutPage(driver);
    }
}
