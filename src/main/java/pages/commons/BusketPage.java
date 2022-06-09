package pages.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.base.BasePage;

public class BusketPage extends BasePage {
    public BusketPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@class='product-line-info']/a")
    private WebElement nameOfProduct;
    @FindBy(xpath = "//input[@name='product-quantity-spin']")
    private WebElement quantity;
    @FindBy(xpath = "//div[@class='current-price']/span")
    private WebElement price;
    @FindBy(xpath = "//div[contains(@class,'product-line-grid-right')]//span[@class='product-price']/strong")
    private WebElement totalPrice;
    @FindBy(xpath = "//a[@data-link-action='delete-from-cart']")
    private WebElement deleteButton;
    @FindBy(xpath = "//span[@class='no-items']")
    private WebElement noItemsText;


    public String getNameOfProduct(){
        return nameOfProduct.getText();
    }
    public int getQuantity(){
        int actualQuantity = Integer.parseInt(quantity.getAttribute("value"));
        return actualQuantity;
    }
    public String getPrice(){
        return price.getText();
    }
    public String getTotalPrice(){
        return totalPrice.getText();
    }

    public BusketPage clickToDeleteButton(){
        click(deleteButton);
        return this;
    }
    public String getNoItemsText(){
        wait.until(ExpectedConditions.visibilityOf(noItemsText));
        return noItemsText.getText();
    }
}
