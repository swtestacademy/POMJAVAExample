package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    //*********Constructor*********
    public HomePage (WebDriver driver) {
        super(driver);
    }

    //*********Page Variables*********
    String baseURL = "http://www.n11.com/";

    //*********Web Elements*********
    By signInButtonBy = By.className("btnSignIn");


    //*********Page Methods*********

    //Go to Homepage
    public void goToN11 (){
        driver.get(baseURL);
    }

    //Go to LoginPage
    public void goToLoginPage (){
        click(signInButtonBy);
    }

}
