package org.example;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import static org.example.HomePageTest.webDriver;
import static org.example.MyAccountPageTest.myAccountPageUrl;
import static org.example.RegistrationPageTest.userEmail;
import static org.example.RegistrationPageTest.userPass;

public class LogoutTest {

    @When("the user provides email and password")
    public void the_user_provides_email_and_password() {
        webDriver.findElement(By.id("username")).sendKeys(userEmail);
        webDriver.findElement(By.id("password")).sendKeys(userPass);
    }

    @When("the user logs in")
    public void the_user_logs_in() {
        webDriver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click() ;
        System.out.println("Successfully login.");
    }

    @When("the user clicks on Sign out link")
    public void the_user_clicks_on_sign_out_link() {
        try {
            webDriver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]/a"));
            System.out.println("Sign out link is available.");
        } catch (NoSuchElementException exception) {
            System.out.println("There is something wrong with logout link.");
        }
        webDriver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]/a")).click();
    }

}
