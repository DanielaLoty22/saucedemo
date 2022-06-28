package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BurgerMenuPage extends BasePage {

    private static final By LOGOUT_BUTTON = By.id("logout_sidebar_link");
    private static final By BURGER_MENU_BUTTON = By.id("react-burger-menu-btn");

    public BurgerMenuPage(ChromeDriver driver) {
        super(driver);
    }

    public void logout() {
        driver.findElement(BURGER_MENU_BUTTON).click();
        driver.findElement(LOGOUT_BUTTON).click();
    }
}
