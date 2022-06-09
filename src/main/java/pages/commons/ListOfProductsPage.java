package pages.commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

import java.util.List;

public class ListOfProductsPage extends BasePage {
    public ListOfProductsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='product-description']//a")
    private List<WebElement> products;

    public String getRandomProductName(){
        String name = getRandomElement(products).getText();
        return name;
    }

    public String getProductName(int index){
        String name = products.get(index).getText();
        return name;
    }

    public ProductDetailsPage openProductDetails(String nameOfProduct){

        for (int i = 0; i < products.size(); i++) {

            String productName;

            try {
                productName = products.get(i).getText();
            }
            catch(org.openqa.selenium.StaleElementReferenceException ex)
            {
                productName = products.get(i).getText();
            }
            if(productName.equals(nameOfProduct)){
                products.get(i).click();
            }
        }
        return new ProductDetailsPage(driver);
    }

}
