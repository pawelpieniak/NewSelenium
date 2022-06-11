package pages.checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class CheckoutConfirmationPage extends BasePage {
    public CheckoutConfirmationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//section[@id='content-hook_order_confirmation']//h3")
    private WebElement confirmationText;
    @FindBy(xpath = "//div[@id='order-details']//li")
    private WebElement orderNumberText;

    public String getConfirmationText() {
        return confirmationText.getText()
                .substring(1);
    }

    public String getOrderNumber() {
        String orderNumber = orderNumberText.getText()
                .replace("Order reference: ", "");
        return orderNumber;
    }
}
