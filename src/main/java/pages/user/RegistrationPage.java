package pages.user;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import models.SocialTitle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;
import pages.commons.TopMenuPage;

import java.util.List;
import java.util.Locale;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@name='id_gender']")
    private List<WebElement> socialInput;
    @FindBy(xpath = "//form[@id='customer-form']//input[@name='firstname']")
    private WebElement firstNameInput;
    @FindBy(xpath = "//form[@id='customer-form']//input[@name='lastname']")
    private WebElement lastNameInput;
    @FindBy(xpath = "//form[@id='customer-form']//input[@name='email']")
    private WebElement emailInput;
    @FindBy(xpath = "//form[@id='customer-form']//input[@name='password']")
    private WebElement passwordInput;
    @FindBy(xpath = "//form[@id='customer-form']//input[@name='customer_privacy']")
    private WebElement customer_privacyInput;
    @FindBy(xpath = "//form[@id='customer-form']//input[@name='psgdpr']")
    private WebElement psgdprInput;
    @FindBy(xpath = "//button[@data-link-action='save-customer']")
    private WebElement saveButton;

   /* public RegistrationPage selectSocial() {
        System.out.println("Clicikng: social title");
        socialInput.click();
        return this;
    }*/

    public RegistrationPage selectSocial(SocialTitle socialTitle){
        switch (socialTitle){
            case Mr:
                socialInput.get(0).click();
                break;
            case Mrs:
                socialInput.get(1).click();
                break;
        }
        return this;
    }
    public RegistrationPage setRandomFirstName(String firstName) {
        sendKeys(firstNameInput, firstName);
        return this;
    }
    public RegistrationPage setRandomLastName(String lastName) {
        sendKeys(lastNameInput, lastName);
        return this;
    }
    public RegistrationPage setRandomEmail(String email) {
        sendKeys(emailInput, email);
        return this;
    }
    public RegistrationPage setPassword(String password) {
        sendKeys(passwordInput, password);
        return this;
    }
    public RegistrationPage acceptPolices() {
        click(customer_privacyInput);
        click(psgdprInput);
        return this;
    }
    public TopMenuPage acceptRegistration() {
        click(saveButton);
        return new TopMenuPage(driver);
    }


}


