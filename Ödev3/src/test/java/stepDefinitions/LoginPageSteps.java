package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import util.DriverFactory;

public class LoginPageSteps {
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Then("should see Login Page")
    public void shouldSeeLoginPage() {
        loginPage.checkgirisyap();

        
    }

    @Given("Enes is on Login Page")
    public void enesIsOnLoginPage() {
        loginPage.checkgirisyap();
    }

    @When("click {string} radio button")
    public void clickRadioButton(String button) {
        loginPage.clickradiobutton(button);
        
    }

    @Then("should see {string} title")
    public void shouldSeeTitle(String key5) {

        loginPage.girisyapyazisi(key5);
    }

    @Then("should see {string} radio button")
    public void shouldSeeRadioButton(String button2) {
        loginPage.seeradiobutton(button2);
        
    }

    @Then("should see {string} text on Email")
    public void shouldSeeTextOnEmail(String yazi1) {

        loginPage.seetextonemail(yazi1);
        
    }

    @Then("should see {string} text on Password")
    public void shouldSeeTextOnPassword(String yazi2) {

        loginPage.seetextonpassword(yazi2);
        
    }

    @Then("should see Show Password Icon")
    public void shouldSeeShowPasswordIcon() {
        loginPage.seeshowpasswordicon();
        
    }

    @Then("should see {string} remember me")
    public void shouldSeeRememberMe(String yazi3) {
        loginPage.seerememberme(yazi3);
        
    }

    @Then("should see {string} forgot password")
    public void shouldSeeForgotPassword(String yazi4) {
        loginPage.seeforgotpassword(yazi4);
        
    }

    @Then("should see {string} login button")
    public void shouldSeeLoginButton(String button3) {
        loginPage.seeloginbutton(button3);
        
    }

    @Then("should see Phone Text Box")
    public void shouldSeePhoneTextBox() {
        loginPage.seephonetextbox();
        
    }

    @When("click login button")
    public void clickLoginButton() {
        loginPage.clickloginbutton();

        
    }

    @Then("should see {string} Email Empty message")
    public void shouldSeeEmailEmptyMessage(String yazi5) {
        loginPage.seeemailemptymessage(yazi5);
        
    }

    @Then("should see {string} Password Empty message")
    public void shouldSeePasswordEmptyMessage(String yazi6) {
        loginPage.seepasswordemptymessage(yazi6);
    }

    @When("type Email {string}")
    public void typeEmail(String yazi7) {
        loginPage.typeemail(yazi7);
        
    }

    @Then("should not see Email Empty message")
    public void shouldNotSeeEmailEmptyMessage() {
        loginPage.notseeemailemptymessage();
        
    }

    @When("type Password {string}")
    public void typePassword(String yazi8) {
        loginPage.typepassword(yazi8);
        
    }

    @Then("should not see Password Empty message")
    public void shouldNotSeePasswordEmptyMessage() {
        loginPage.notseepasswordemptymessage();
        
    }

    @When("type Email {string} and click login")
    public void typeEmailAndClickLogin(String yazi9) {
        loginPage.typeemailandclicklogin(yazi9);
        
    }

    @Then("should see {string} Email False message")
    public void shouldSeeEmailFalseMessage(String yazi10) {
        loginPage.seeemailfalsemessage(yazi10);
        
    }

    @When("type Email {string}, Password {string} and click login")
    public void typeEmailPasswordAndClickLogin(String yazi11, String yazi12) {
        loginPage.typeemailpasswordandclicklogin(yazi11,yazi12);
    }

    @Then("should see {string} Login Error message")
    public void shouldSeeLoginErrorMessage(String yazi13) {
        loginPage.seeloginerrormessage(yazi13);

    }
}
