package pages.checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;
import pages.user.RegistrationPage;

public class PersonalInfoCheckoutPage extends RegistrationPage {
    public PersonalInfoCheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='checkout-guest-form']//button[@name='continue']")
    private WebElement continueBtn;

    public PersonalInfoCheckoutPage continueOrder() {
        click(continueBtn);
        return this;
    }

}
