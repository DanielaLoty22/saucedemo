package saucedemo.base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class ShareDataSaucedemo {


    public ChromeDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lotys\\OneDrive\\Desktop\\Azimut\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.of(7, ChronoUnit.SECONDS));
        driver.manage().window().maximize();

    }

    @After
    public void tearDown() {
        //driver.quit();
    }
}
