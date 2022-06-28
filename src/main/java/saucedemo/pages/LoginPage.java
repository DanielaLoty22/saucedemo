package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends BasePage {

    private static final By USER_NAME = By.cssSelector("[placeholder='Username']");
    private static final By PASSWORD = By.cssSelector("[placeholder='Password']");
    private static final By SUBMIT = By.cssSelector("[type='submit']");

    public LoginPage(ChromeDriver driver) {
        super(driver);
    }

    public void typeUserName(String userName) {
        driver.findElement(USER_NAME).sendKeys(userName);
    }

    public void typePassword(String password) {
        driver.findElement(PASSWORD).sendKeys(password);
    }

    public void submitForm() {
        driver.findElement(SUBMIT).click();
    }

    public void login(String userName, String password) {
        typeUserName(userName);
        typePassword(password);
        submitForm();
    }
}
