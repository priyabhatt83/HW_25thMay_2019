package Hw_25thMay;

import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Loginpage extends Utils {

    LoadProps loadProps =new LoadProps();


    private By _LogIn =  By.xpath("//a[@class='ico-login']");
    private By _email = By.xpath("//input[@id='Email']");
    private By _password = By.xpath("//input[@id='Password']");
    private By _loginBtn = By.xpath("//input[@value='Log in']");


    //making driver to click on login button to open login page
    public void clickOnLOGIN(){
        clickElementBy(_LogIn);
    }

    // making driver to enter or invalid/blank credential combination
    public void userShouldNotAbleToLoginSuccessfully(String email, String password) {
        enterText(_email, email);
        enterText(_password, password);
    }

    // making driver to click on login button after entering all types of data combination
    public  void clickOnLonIn(){
       clickElementBy(_loginBtn);
    // making driver wait for error message display
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    //checking out that login is unsuccessful
    public void loginUnsuccessful() {
        if (isElementDisplayed(By.linkText("Log in"))) {
            System.out.println("User is not logged in");
        } else {
            System.out.println("User is Logged in");
        }
    }
     //checking error message
     public void displayErrorMessage(String errormessage){
         System.out.println("error message");
         boolean present;
         if (errormessage.contains("No customer account found") || errormessage.contains("The credentials provided are incorrect")
                 || errormessage.contains("Please enter your email"))
         {
             present = true;
         }else{
             present = false;
         }
         Assert.assertTrue(present);
     }
     }






