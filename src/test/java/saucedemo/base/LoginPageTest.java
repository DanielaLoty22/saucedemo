package saucedemo.base;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import saucedemo.pages.BurgerMenuPage;
import saucedemo.pages.LoginPage;


@RunWith(DataProviderRunner.class)
public class LoginPageTest extends ShareDataSaucedemo {

    /*
1. Login normal (happy flow)
2. Failed login (user bun, parola gresita)
3. Failed login (user gresit, parola gresita)
4. Can no login with locked out user
5. Slow login, logs the user in eventually
6. problem
 */

    @Test
    public void loginStandardUser() {

        String standarduservalue = "standard_user";
        String passwordvalue="secret_sauce";
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(standarduservalue, passwordvalue);

//        WebElement standarduserElement = driver.findElement(By.cssSelector("[placeholder='Username']"));
//        standarduserElement.sendKeys(standarduservalue);
//
//        WebElement passwordElement=driver.findElement(By.cssSelector("[placeholder='Password']"));
//        passwordElement.sendKeys(passwordvalue);
//
//        WebElement submitElement= driver.findElement(By.cssSelector("[type='submit']"));
//        submitElement.click();

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

    @Test
    public void loginWhateverUser() {
        String standarduservalue = "standard_user2";
        String passwordvalue="secret_sauce2";
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(standarduservalue, passwordvalue);
    }

    @DataProvider
    public static Object[][] userProvider() {
        return new Object[][]{
                    {"standard_user", "secret_sauce"},
                {"standard_user", "pass2"}
        };
    }

    @Test
    @UseDataProvider("userProvider")
    public void testUsers(String userName, String password) {
        System.out.println("username: " + userName + " password: " + password);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(userName, password);
    }

    @After
    public void afterTest() {
        new BurgerMenuPage(driver).logout();
    }
}
