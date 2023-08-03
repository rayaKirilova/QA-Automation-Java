package org.example;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;


import static org.example.HomePageTest.webDriver;
import static org.example.RegistrationPageTest.*;

public class LoginPageTest {

    @When("the user is on the login form section")
    public void the_user_is_on_the_login_form_section() {
        String loginFormXpath = "//*[@id=\"customer_login\"]/div[1]/form" ;
        try {
            webDriver.findElement(By.xpath(loginFormXpath));
            System.out.println("This is the login form.");
        } catch (NoSuchElementException exc) {
            System.out.println("Cannot find login form.");
        }
    }

    @When("the user provides correct email and password")
    public void the_user_provides_correct_email_and_password() {
        webDriver.findElement(By.id("username")).sendKeys(userEmail);
        webDriver.findElement(By.id("password")).sendKeys(userPass);
    }

    @When("the login button is available")
    public void the_login_button_is_available() {
        String loginBtnXpath = "//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]" ;
        try {
            webDriver.findElement(By.xpath(loginBtnXpath));
            System.out.println("Login button is available.");
        } catch (NoSuchElementException exception) {
            System.out.println("There is something wrong with login button.");
        }
        webDriver.findElement(By.xpath(loginBtnXpath)).click() ;
    }

    @Then("the user gets message for successfully login")
    public void the_user_gets_message_for_successfully_login() {
        webDriver.getCurrentUrl();

        String expectedGreetingMsg = String.format("Hello %s", username);
        String greetingMsg = webDriver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]")).getText();
        Assertions.assertTrue(greetingMsg.contains(expectedGreetingMsg));

        System.out.println("Successfully login.");
    }

}
