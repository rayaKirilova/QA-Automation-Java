package org.example;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import static org.example.HomePageTest.webDriver;
import static org.example.MyAccountPageTest.myAccountPageUrl;

public class RegistrationPageTest {

    // the email address and password are public only for testing purposes
    public static String userEmail = "nice_nice_email@qa.com";
    public static String userPass = "494WP7ji!W#N78S1abv5";
    public static String username = userEmail.substring(0, userEmail.indexOf('@'));

    @Given("the user is on My Account page")
    public void the_user_is_on_my_account_page() {
        webDriver.get(myAccountPageUrl);
        Assert.assertEquals(myAccountPageUrl, webDriver.getCurrentUrl());
        System.out.println("This is My Account page.");
    }

    @When("the user is on the registration form section")
    public void the_user_is_on_the_registration_form_section() {
        String registrationFormXpath = "//*[@id=\"customer_login\"]/div[2]/form";
        try {
            webDriver.findElement(By.xpath(registrationFormXpath));
            System.out.println("This is the registration form.");
        } catch (NoSuchElementException exc) {
            System.out.println("Cannot find registration form.");
        }
    }

    @When("the user provides acceptable email and password")
    public void the_user_provides_acceptable_email_and_password() {
        webDriver.findElement(By.id("reg_email")).sendKeys(userEmail);
        webDriver.findElement(By.id("reg_password")).sendKeys(userPass);
    }

    @When("the registration button is available")
    public void the_registration_button_is_available() {
        try {
            webDriver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]"));
            System.out.println("Registration button is available.");
        } catch (NoSuchElementException exception) {
            System.out.println("There is something wrong with registration button.");
        }
    }

    @Then("the user gets message for successfully registration")
    public void the_user_gets_message_for_successfully_registration() {
        webDriver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]")).click();
        webDriver.getCurrentUrl();

        String expectedGreetingMsg = String.format("Hello %s", username);
        String greetingMsg = webDriver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]")).getText();
        Assertions.assertTrue(greetingMsg.contains(expectedGreetingMsg));

        System.out.println("Congratulations! You are successfully registered!");

    }
}
