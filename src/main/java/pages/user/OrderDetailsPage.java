package pages.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;
import pages.checkout.PaymentsCheckoutPage;

public class OrderDetailsPage extends BasePage {
    public OrderDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='order-infos']")
    private WebElement orderInfoText;
    public String getOrderNumberFromOrderInfo() {
        return orderInfoText.getText();
    }
}
