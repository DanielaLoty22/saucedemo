package base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class loginTest extends ShareDataSaucedemo {

    @Test
    public void loginPageTest() {

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

    }
}
