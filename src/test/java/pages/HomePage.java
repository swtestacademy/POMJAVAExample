package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    //*********Constructor*********
    public HomePage (WebDriver driver, WebDriverWait wait) {
        //BasePage'imdeki driver ve wait'imi buraya da taşımış oldum.
        super(driver, wait);
    }

    //*********Page Variables*********
    String baseURL = "http://www.n11.com/";

    //*********Web Elements*********
    String signInButtonClass = "btnSignIn";


    //*********Page Methods*********

    //Anasayfayı Açma Methodu
    public void goToN11 (){
        driver.get(baseURL);
        //driver.navigate().to(baseURL)
    }

    //LoginSayfasına Gitme Methodu
    public void goToLoginPage (){
        click(By.className(signInButtonClass));
    }


}
