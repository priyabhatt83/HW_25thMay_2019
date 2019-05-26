package Hw_25thMay;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyStepdefs extends Utils{
    
    HomePage homePage = new HomePage();
    Loginpage loginpage = new Loginpage();
    
    @Given("user is on homepage")
    public void userIsOnHomepage() {
        homePage.verifyUserisOnHomePage();
    }

    @When("user click on Log In button")
    public void userClickOnLogInButton() {
        loginpage.clickOnLOGIN();
    }

    @And("user enters invalid {string} and {string}")
    public void userEntersInvalidAnd(String email, String password) {
        loginpage.userShouldNotAbleToLoginSuccessfully(email, password);
    }

    @And("click on login button")
    public void clickOnLoginButton() {
        loginpage.clickOnLonIn();
        
    }

    @Then("User should not able to login successfully")
    public void userShouldNotAbleToLoginSuccessfully() {
       loginpage.loginUnsuccessful();
    }

    @And("user can see {string}")
    public void userCanSee(String errormessage) {
        loginpage.displayErrorMessage(errormessage);
    }
}
