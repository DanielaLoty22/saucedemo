package base;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShareDataSaucedemo {


        public WebDriver driver;

        @Before
        public void Setup(){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\lotys\\OneDrive\\Desktop\\Azimut\\ChromeDriver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();

        }
        @After
        public void TearDown(){
            //driver.quit();
        }
    }
