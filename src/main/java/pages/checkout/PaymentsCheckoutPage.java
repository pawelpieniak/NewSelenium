package pages.checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;
import pages.user.OrderDetailsPage;

public class PaymentsCheckoutPage extends BasePage {
    public PaymentsCheckoutPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@id='payment-option-1']")
    private WebElement paymentOptionCheck;

    @FindBy(xpath = "//input[@id='conditions_to_approve[terms-and-conditions]']")
    private WebElement agreeCheck;
    @FindBy(xpath = "//div[@id='payment-confirmation']//button")
    private WebElement placeOrderBtn;


    public PaymentsCheckoutPage checkPayment() {
        click(paymentOptionCheck);
        return new PaymentsCheckoutPage(driver);
    }

    public PaymentsCheckoutPage setAgree() {
        click(agreeCheck);
        return new PaymentsCheckoutPage(driver);
    }
    public OrderDetailsPage confirm() {
        click(placeOrderBtn);
        return new OrderDetailsPage(driver);
    }
}
