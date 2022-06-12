package products;

import base.Pages;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CategoryTest extends Pages {

    @Test
    public void shouldVerifyCategories() {

        for (int i = 0; i < topMenuPage.categories.size(); i++) {

            String expectedNameOfCategory = topMenuPage.getNameOfCategory(topMenuPage.categories.get(i));

            topMenuPage.categories.get(i).click();


            String nameOfCategory = listOfProductsPage.getCategoryName();
            int numberOfProducts = listOfProductsPage.numberOfProducts();
            int numberOfExpectedProducts = listOfProductsPage.numberOfExpectedProducts();

            assertThat(expectedNameOfCategory).isEqualTo(nameOfCategory);
            assertThat(numberOfProducts).isEqualTo(numberOfExpectedProducts);
        }
    }

    @Test
    public void shouldVerifyClothesSubcategories() {

        for (int i = 0; i < topMenuPage.clothesSubcategories.size(); i++) {
            List<WebElement> cathegories = topMenuPage.clothesSubcategories;

            actions.moveToElement(topMenuPage.clothesButton2()).perform();

            String expectedNameOfCategory = topMenuPage.getNameOfCategory(cathegories.get(i));

            cathegories.get(i).click();

            String nameOfCategory = listOfProductsPage.getCategoryName();
            int numberOfProducts = listOfProductsPage.numberOfProducts();
            int numberOfExpectedProducts = listOfProductsPage.numberOfExpectedProducts();

            assertThat(expectedNameOfCategory).isEqualTo(nameOfCategory);
            assertThat(numberOfProducts).isEqualTo(numberOfExpectedProducts);
        }
    }

    @Test
    public void shouldVerifyAccessoriesSubcategories() {

        for (int i = 0; i < topMenuPage.accessoriesSubcategories.size(); i++) {
            List<WebElement> cathegories = topMenuPage.accessoriesSubcategories;

            actions.moveToElement(topMenuPage.accessoriesButton2()).perform();

            String expectedNameOfCategory = topMenuPage.getNameOfCategory(cathegories.get(i));

            cathegories.get(i).click();

            String nameOfCategory = listOfProductsPage.getCategoryName();
            int numberOfProducts = listOfProductsPage.numberOfProducts();
            int numberOfExpectedProducts = listOfProductsPage.numberOfExpectedProducts();

            assertThat(expectedNameOfCategory).isEqualTo(nameOfCategory);
            assertThat(numberOfProducts).isEqualTo(numberOfExpectedProducts);
        }
    }
}
