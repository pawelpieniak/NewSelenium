package pages.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class MyAccountPage extends BasePage {
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[@id='history-link']//span")
    private WebElement orderHistoryAndDetails;

    public MyAccountPage goToOrderHistoryAndDetails() {
        click(orderHistoryAndDetails);
        return this;
    }
}
