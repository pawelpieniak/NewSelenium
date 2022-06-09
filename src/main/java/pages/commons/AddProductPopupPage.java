package pages.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.base.BasePage;

public class AddProductPopupPage extends BasePage {
    public AddProductPopupPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='cart-content-btn']//a[contains(@class,'btn')]")
    private WebElement proceedToCheckoutButton;

    public BusketPage goToBasket(){
        wait.until(ExpectedConditions.visibilityOf(proceedToCheckoutButton));
        proceedToCheckoutButton.click();
        return new BusketPage(driver);
    }
}
