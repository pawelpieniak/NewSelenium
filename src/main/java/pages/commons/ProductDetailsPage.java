package pages.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class ProductDetailsPage extends BasePage {

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='quantity_wanted']")
    private WebElement quantityInput;

    @FindBy(xpath = "//div[contains(@class,'product-quantity')]//button[contains(@class,'bootstrap-touchspin-up')]")
    private WebElement quantityUpButton;

    @FindBy(xpath = "//button[@data-button-action='add-to-cart']")
    private WebElement addToCartButton;


    public ProductDetailsPage setQuantity(int quantity){
        int actualQuantity = Integer.parseInt(quantityInput.getAttribute("value"));
        while (actualQuantity != quantity){
            quantityUpButton.click();
            actualQuantity = Integer.parseInt(quantityInput.getAttribute("value"));
        }
        return this;
    }

    public AddProductPopupPage addProduct(){
        addToCartButton.click();
        return new AddProductPopupPage(driver);
    }

}
