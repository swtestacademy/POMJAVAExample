package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeClass
    public void setup () {
        //Driver tanımlıyorum. Her test ve page class'ı kullanacak.
        driver = new ChromeDriver();

        //Wait tanımlıyorum. Her test ve page class'ı kullanacak.
        wait = new WebDriverWait(driver,15);

        //Maximize Window
        driver.manage().window().maximize();
    }

    @AfterClass
    public void teardown () {
        driver.quit();
    }
}
