package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class LoginPage {

    By girisyapyazisi = By.cssSelector("h5.login-form__title");
    By epostaradiobutton = By.cssSelector("[value=\"Email\"]");
    By telefonradiobutton = By.cssSelector("[value=\"Phone\"]");
    By epostaadresinizyazisi = By.cssSelector("[placeholder=\"E-Posta Adresiniz\"]");
    By sifrenizyazisi = By.cssSelector("[placeholder=\"Şifreniz\"]");
    By showpasswordicon = By.cssSelector("img.login-form__show-password-icon--img");
    By remembermetext = By.cssSelector(".checkbox-span");
    By forgotpasswordtext = By.cssSelector("a.login-form__forgot-password-link");
    By girisyaploginbutton = By.cssSelector(".login-form__button.login-form__button--bg-blue");
    By phonetextbox = By.cssSelector(".login-form__phone.text-input");
    By loginbutton = By.cssSelector(".login-form__button.login-form__button--bg-blue");
    By lutfenepostagirinizuyari = By.cssSelector("div.error");
    By lutfensifregirinizuyari = By.cssSelector(".login-form__password .error");
    By email = By.cssSelector("[name=\"email\"]");
    By password = By.cssSelector("[name=\"password\"]");
    By gecerlieposta = By.cssSelector(".input-container .error");
    By epostayadasifreduzeltmesaji = By.cssSelector("p.login-form__header-errors--p");


    WebDriver driver;
    WebDriverWait wait;
    ElementHelper helper;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.helper = new ElementHelper(driver);
    }

    public void checkgirisyap() {

        helper.checkElementVisible(girisyapyazisi);
    }
    public void girisyapyazisi(String key6) {

        helper.checkElementVisible(girisyapyazisi);
    }

    public void clickradiobutton(String button) {

        helper.click(epostaradiobutton);
        helper.click(telefonradiobutton);
    }

    public void seeradiobutton(String key1) {

        helper.checkElementVisible(epostaradiobutton);
        helper.checkElementVisible(telefonradiobutton);

    }
    public void seetextonemail(String key2) {
        helper.checkElementVisible(epostaadresinizyazisi);

    }
    public void seetextonpassword(String key3) {
        helper.checkElementVisible(sifrenizyazisi);

   }
    public void seeshowpasswordicon() {
        helper.checkElementVisible(showpasswordicon);

    }
    public void seerememberme(String key3) {
        helper.checkElementVisible(remembermetext);

    }
    public void seeforgotpassword(String key4) {

        helper.checkElementText(forgotpasswordtext,key4);

    }
    public void seeloginbutton(String key5) {
        helper.checkElementVisible(girisyaploginbutton);

    }
    public void seephonetextbox() {
        helper.checkElementVisible(phonetextbox);

    }
    public void clickloginbutton() {
        helper.click(loginbutton);

    }
    public void seeemailemptymessage(String key6) {
        helper.checkElementText(lutfenepostagirinizuyari,key6);

    }
    public void seepasswordemptymessage(String key7) {
        helper.checkElementText(lutfensifregirinizuyari,key7);

    }
    public void typeemail(String key8) {

        helper.sendKey(email,key8);

    }
    public void notseeemailemptymessage() {
        helper.checkElementInvisible(lutfenepostagirinizuyari);

    }
    public void typepassword(String key9) {

        helper.sendKey(password,key9);

    }
    public void notseepasswordemptymessage() {
        helper.checkElementInvisible(lutfensifregirinizuyari);

    }
    public void typeemailandclicklogin(String key10) {

        helper.sendKey(email,key10);
        helper.click(loginbutton);

    }
    public void seeemailfalsemessage(String key11) {
        helper.checkElementVisible(gecerlieposta);

    }
    public void typeemailpasswordandclicklogin(String key12,String key13) {

        helper.sendKey(email,key12);
        helper.sendKey(password,key13);
        helper.click(loginbutton);

    }
    public void seeloginerrormessage(String key14) {
        helper.checkElementVisible(epostayadasifreduzeltmesaji);

    }

}

