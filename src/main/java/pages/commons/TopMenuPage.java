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

    @FindBy(xpath = "//div[@id='_desktop_user_info']//a[@class='account']/span")
    private WebElement userName;

    @FindBy(xpath = "//div[@id='search_widget']//input[@type='text']")
    private WebElement searchInput;

    @FindBy(xpath = "//div[@id='search_widget']//button")
    private WebElement searchButton;


    public LoginPage clickToSignIn() {
        click(signInButton);
        return new LoginPage(driver);
    }
    public String getLoggedInUserName(){
        return userName.getText();
    }

    public ListOfProductsPage searchProduct(String nameOfProduct){
        searchInput.sendKeys(nameOfProduct);
        searchButton.click();
        return new ListOfProductsPage(driver);
    }

}
