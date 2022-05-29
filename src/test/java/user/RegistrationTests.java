package user;

import base.Pages;
import base.TestBase;
import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import models.SocialTitle;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.commons.TopMenuPage;
import pages.user.LoginPage;
import pages.user.RegistrationPage;

import java.util.Locale;
import static org.assertj.core.api.Assertions.assertThat;

public class RegistrationTests extends Pages {

    @Test
    public void shouldRegisterNewUser(){


        topMenuPage.clickToSignIn();
        loginPage.clickgoToRegistrationButton();

        String firstNameF = faker.name().firstName();
        String lastNameF = faker.name().lastName();
        String email = fakeValuesService.bothify("????##@gmail.com");

        registrationPage
                .selectSocial(SocialTitle.Mr)
                .setRandomFirstName(firstNameF)
                .setRandomLastName(lastNameF)
                .setRandomEmail(email)
                .setPassword("InneH")
                .acceptPolices()
                .acceptRegistration();


        String nameExpected = firstNameF + " " + lastNameF;
        assertThat(topMenuPage.getLoggedInUserName()).isEqualTo(nameExpected);

    }


}
