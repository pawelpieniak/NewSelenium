package pages.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class HistoryOfOrdersPage extends BasePage {
    public HistoryOfOrdersPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//table[contains(@class,'table')]//tbody//th")
    private WebElement orderNumber;
    @FindBy(xpath = "//a[@data-link-action='view-order-details']")
    private WebElement detailsBtn;

    public String getOrderNumber() {
        return orderNumber.getText();
    }
    public HistoryOfOrdersPage goToDetailsFirstOrder(){
        click(detailsBtn);
        return this;
    }
}
