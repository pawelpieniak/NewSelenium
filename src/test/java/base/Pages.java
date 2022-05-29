package base;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import org.testng.annotations.BeforeMethod;
import pages.commons.TopMenuPage;
import pages.user.LoginPage;
import pages.user.RegistrationPage;

import java.util.Locale;

public class Pages extends TestBase {
    public LoginPage loginPage;
    public RegistrationPage registrationPage;
    public TopMenuPage topMenuPage;
    public Faker faker;
    public FakeValuesService fakeValuesService;

    @BeforeMethod
    public void pagesSetup() {
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        topMenuPage = new TopMenuPage(driver);
        faker = new Faker();
        fakeValuesService = new FakeValuesService(new Locale("en-GB"), new RandomService());
    }
}
