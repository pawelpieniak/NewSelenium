package pages.commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;
import pages.user.LoginPage;

public class TopMenuPage extends BasePage {

    public TopMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='_desktop_user_info']")
    private WebElement signInButton;

    public LoginPage clickToSignIn() {
        click(signInButton);
        return new LoginPage(driver);
    }

}
