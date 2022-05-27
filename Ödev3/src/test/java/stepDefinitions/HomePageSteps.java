package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import util.DriverFactory;

public class HomePageSteps {

    WebDriver driver = DriverFactory.getDriver();
    HomePage homePage = new HomePage(driver);
    @Given("Enes is on Home page")
    public void enesIsOnHomePage() {

        homePage.checklogo();

           }



    @When("click {string} card in the top right")
    public void clickCardInTheTopRight(String login) {

        homePage.clickloginbutton(login);
    }
}
