package user;

import base.TestBase;
import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import org.testng.annotations.Test;
import pages.commons.TopMenuPage;
import pages.user.LoginPage;
import pages.user.RegistrationPage;

import java.util.Locale;

public class RegistrationTests extends TestBase {

    @Test
    public void shouldRegisterNewUser(){
        Faker faker = new Faker();
        FakeValuesService fakeValuesService = new FakeValuesService(new Locale("en-GB"), new RandomService());

        new TopMenuPage(driver).clickToSignIn();
        new LoginPage(driver).clickgoToRegistrationButton();

        String firstNameF = faker.name().firstName();
        String lastNameF = faker.name().lastName();
        String email = fakeValuesService.bothify("????##@gmail.com");

        new RegistrationPage(driver)
                .selectSocial()
                .setRandomFirstName(firstNameF)
                .setRandomLastName(lastNameF)
                .setRandomEmail(email)
                .setPassword("InneH")
                .acceptPolices()
                .acceptRegistration();

    }
}
