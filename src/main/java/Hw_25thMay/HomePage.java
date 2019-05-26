package Hw_25thMay;

import org.openqa.selenium.By;

public class HomePage extends Utils {


    public void verifyUserisOnHomePage() {
        getActualText(By.linkText("Log in"));
        validation("Log in");
        System.out.println("User is on Homepage");


    }
}
