package base;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import pages.checkout.*;
import pages.commons.*;
import pages.user.*;

import java.util.Locale;

public class Pages extends TestBase {
    public LoginPage loginPage;
    public RegistrationPage registrationPage;
    public TopMenuPage topMenuPage;
    public Faker faker;
    public FakeValuesService fakeValuesService;
    public ListOfProductsPage listOfProductsPage;
    public ProductDetailsPage productDetailsPage;
    public AddProductPopupPage addProductPopupPage;
    public BusketPage busketPage;
    public AddressCheckoutPage addressCheckoutPage;
    public CheckoutConfirmationPage checkoutConfirmationPage;
    public PaymentsCheckoutPage paymentsCheckoutPage;
    public PersonalInfoCheckoutPage personalInfoCheckoutPage;
    public ShippingCheckoutPage shippingCheckoutPage;
    public HistoryOfOrdersPage historyOfOrdersPage;
    public MyAccountPage myAccountPage;
    public OrderDetailsPage orderDetailsPage;
    public Actions actions;

    @BeforeMethod
    public void pagesSetup() {
        actions = new Actions(driver);
        addressCheckoutPage = new AddressCheckoutPage(driver);
        checkoutConfirmationPage = new CheckoutConfirmationPage(driver);
        paymentsCheckoutPage = new PaymentsCheckoutPage(driver);
        personalInfoCheckoutPage = new PersonalInfoCheckoutPage(driver);
        shippingCheckoutPage = new ShippingCheckoutPage(driver);
        historyOfOrdersPage = new HistoryOfOrdersPage(driver);
        myAccountPage = new MyAccountPage(driver);
        orderDetailsPage = new OrderDetailsPage(driver);
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        topMenuPage = new TopMenuPage(driver);
        faker = new Faker();
        fakeValuesService = new FakeValuesService(new Locale("en-GB"), new RandomService());
        listOfProductsPage = new ListOfProductsPage(driver);
        productDetailsPage = new ProductDetailsPage(driver);
        addProductPopupPage = new AddProductPopupPage(driver);
        busketPage = new BusketPage(driver);
    }
}
