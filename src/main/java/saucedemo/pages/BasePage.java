package saucedemo.pages;

import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BasePage {

    protected final ChromeDriver driver;

    public BasePage(ChromeDriver driver) {
        this.driver = driver;
    }
}
