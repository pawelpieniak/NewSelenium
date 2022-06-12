package pages.commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;
import pages.user.LoginPage;

import java.util.List;

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
    @FindBy(xpath = "//div[@class='user-info']//span")
    private WebElement myAccountButton;
    @FindBy(xpath = "//li[@id='category-3']/a")
    private WebElement clothesButton;
    By clothesButton2 = By.xpath("//li[@id='category-3']/a");
    public WebElement clothesButton2(){ return driver.findElement(clothesButton2); }
    @FindBy(xpath = "//li[@id='category-6']/a")
    private WebElement accessoriesButton;

    By accessoriesButton2 = By.xpath("//li[@id='category-6']/a");
    public WebElement accessoriesButton2(){ return driver.findElement(accessoriesButton2); }
    @FindBy(xpath = "//li[@id='category-9']/a")
    private WebElement artButton;
    @FindBy(xpath = "//li[@id='category-4']/a")
    private WebElement menButton;
    @FindBy(xpath = "//li[@id='category-5']/a")
    private WebElement womenButton;
    @FindBy(xpath = "//li[@id='category-7']/a")
    private WebElement stationeryButton;
    @FindBy(xpath = "//li[@id='category-8']/a")
    private WebElement homeAccessoriesButton;

    public List<WebElement> categories = List.of(clothesButton, accessoriesButton, artButton);
    public List<WebElement> clothesSubcategories = List.of(menButton, womenButton);
    public List<WebElement> accessoriesSubcategories = List.of(stationeryButton, homeAccessoriesButton);

    public String getNameOfCategory(WebElement category){
        return category.getText();
    }
    public TopMenuPage goToClothes() {
        click(clothesButton);
        return this;
    }
    public TopMenuPage goToAccessories() {
        click(accessoriesButton);
        return this;
    }
    public TopMenuPage goToArt() {
        click(artButton);
        return this;
    }
    public TopMenuPage goToClothesMen() {
        click(menButton);
        return this;
    }
    public TopMenuPage goToClothesWomen() {
        click(womenButton);
        return this;
    }
    public TopMenuPage goToAccessoriesStationery() {
        click(stationeryButton);
        return this;
    }
    public TopMenuPage goToAccessoriesHomeAccessoriesButton() {
        click(homeAccessoriesButton);
        return this;
    }
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

    public TopMenuPage goToYourAccount() {
        click(myAccountButton);
        return this;
    }

}
