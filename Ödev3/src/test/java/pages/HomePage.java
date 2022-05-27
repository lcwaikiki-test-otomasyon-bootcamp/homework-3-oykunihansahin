package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class HomePage {

    By logo = By.cssSelector("a.main-header-logo");
    By ornek = By.cssSelector("[href=\"https://www.lcwaikiki.com/tr-TR/TR/giris\"].header-dropdown-toggle");

    WebDriver driver;
    WebDriverWait wait;
    ElementHelper helper;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.helper = new ElementHelper(driver);
    }

    public void checklogo(){

        helper.checkElementVisible(logo);
    }
    public void clickloginbutton(String name){

        helper.click(ornek);
    }


}
