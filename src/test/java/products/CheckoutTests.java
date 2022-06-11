package products;

import base.Pages;
import models.SocialTitle;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CheckoutTests extends Pages {

    @Test
    public void shouldBuyProduct(){

        listOfProductsPage.openProductDetails("HUMMINGBIRD T-SHIRT");

        productDetailsPage.addProduct();

        addProductPopupPage.goToBasket();

        busketPage.proceedToCheckout();

        String firstNameF = faker.name().firstName();
        String lastNameF = faker.name().lastName();
        String email = fakeValuesService.bothify("????##@gmail.com");

        personalInfoCheckoutPage
                .selectSocial(SocialTitle.Mr)
                .setRandomFirstName(firstNameF)
                .setRandomLastName(lastNameF)
                .setRandomEmail(email)
                .setPassword("InneH")
                .acceptPolices();
        personalInfoCheckoutPage.continueOrder();

        addressCheckoutPage
                .setAddress("Adres")
                .setCity("Radom")
                .setRandomState()
                .setZip("12345")
                .confirmAddresses();

        shippingCheckoutPage
                .confirmShipping();

        paymentsCheckoutPage
                .checkPayment()
                .setAgree()
                .confirm();

        String confirmationText = checkoutConfirmationPage.getConfirmationText();

        assertThat(confirmationText).isEqualTo("YOUR ORDER IS CONFIRMED");

        String orderNumber = checkoutConfirmationPage.getOrderNumber();

        topMenuPage.goToYourAccount();

        myAccountPage.goToOrderHistoryAndDetails();

        String orderNumberFromOrderHistory = historyOfOrdersPage.getOrderNumber();

        assertThat(orderNumber).isEqualTo(orderNumberFromOrderHistory);

        historyOfOrdersPage.goToDetailsFirstOrder();

        assertThat(orderDetailsPage.getOrderNumberFromOrderInfo()).contains(orderNumber);


        // ****dla chetnych spr pozostałe szczegoly zamowienia
    }
}
