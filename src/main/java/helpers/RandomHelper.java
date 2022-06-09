package helpers;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class RandomHelper {
    public static String getRandomEmail(){
        return getRandomText(10) + "@gmail.com";
    }

    public static String getRandomText(){
        return getRandomText(10);
    }

    public static String getRandomText(int count){
        return RandomStringUtils.randomAlphabetic(count);
    }

    private WebElement getRandomElement(List<WebElement> elements) {
        Random rnd = new Random();
        int randomListIndex = rnd.nextInt(elements.size());
        return elements.get(randomListIndex);
    }


}
