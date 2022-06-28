package base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginPageTest extends ShareDataSaucedemo {

    @Test
    public void loginTest() {

        WebElement standarduserElement = driver.findElement(By.cssSelector("[placeholder='Username']"));
        String standarduservalue = "standard_user";
        standarduserElement.sendKeys(standarduservalue);

        WebElement passwordElement=driver.findElement(By.cssSelector("[placeholder='Password']"));
        String passwordvalue="secret_sauce";
        passwordElement.sendKeys(passwordvalue);

        WebElement submitElement= driver.findElement(By.cssSelector("[type='submit']"));
        submitElement.click();

        WebElement sauceLabsBackPackadd= driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        sauceLabsBackPackadd.click();

        WebElement clickCartElement = driver.findElement(By.cssSelector(".shopping_cart_badge"));
        clickCartElement.click();

        WebElement checkoutElement= driver.findElement(By.cssSelector(".checkout_button"));
        checkoutElement.click();

        WebElement firstNameElement= driver.findElement(By.id("first-name"));
        String firstNamevalue = "StandardUser";
        firstNameElement.sendKeys(firstNamevalue);

        WebElement lastNameElement= driver.findElement(By.id("last-name"));
        String lastNamevalue= "Tester";
        lastNameElement.sendKeys(lastNamevalue);

        WebElement zipPostalcodeElement= driver.findElement(By.id("postal-code"));
        String zipPostalcodevalue= ("400581");
        zipPostalcodeElement.sendKeys(zipPostalcodevalue);

        WebElement clickContinueElement= driver.findElement(By.id("continue"));
        clickContinueElement.click();

        WebElement clickFinshElement = driver.findElement(By.cssSelector("#finish"));
        clickFinshElement.click();

        WebElement clickBackhomeElement= driver.findElement(By.cssSelector("#back-to-products"));
        clickBackhomeElement.click();

      

    }
}
