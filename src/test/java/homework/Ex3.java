package homework;

import base.Pages;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Ex3 extends Pages {

    @Test
    public void shouldDeleteProduct(){

        String productName = "HUMMINGBIRD T-SHIRT";
        listOfProductsPage.openProductDetails(productName);
        productDetailsPage
                .setQuantity(3)
                .addProduct();
        addProductPopupPage.goToBasket();

        assertThat(busketPage.getNameOfProduct()).isEqualTo(productName);
        assertThat(busketPage.getQuantity()).isEqualTo(3);
        assertThat(busketPage.getPrice()).isEqualTo("$19.12");
        assertThat(busketPage.getTotalPrice()).isEqualTo("$57.36");

        busketPage.clickToDeleteButton();

        assertThat(busketPage.getNoItemsText()).isEqualTo("There are no more items in your cart");
    }
}
