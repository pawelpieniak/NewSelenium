package homework;

import base.Pages;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Ex2 extends Pages {

    @Test
    public void shouldSearchProduct(){

        String productNameToSearch = listOfProductsPage.getRandomProductName();

        topMenuPage.searchProduct(productNameToSearch);

        String productNameFound = listOfProductsPage.getProductName(0);

        assertThat(productNameFound).isEqualTo(productNameToSearch);
    }
}
