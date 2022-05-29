package pages.user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;
import pages.commons.TopMenuPage;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@data-link-action='display-register-form']")
    private WebElement goToRegistrationButton;

    public RegistrationPage clickgoToRegistrationButton() {
        click(goToRegistrationButton);
        return new RegistrationPage(driver);
    }

}
