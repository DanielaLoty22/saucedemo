package base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class addCartTest extends ShareDataSaucedemo{


    @Test
    public void addToCart(){

        WebElement sauceLabsBackPackadd= driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        sauceLabsBackPackadd.click();

    }
}
