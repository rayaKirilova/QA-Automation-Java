package org.example;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;

import static org.example.HomePageTest.webDriver;


public class MyAccountPageTest {
    public static String myAccountPageUrl = "https://practice.automationtesting.in/my-account/" ;

    @When("the user is on the navigation menu")
    public void the_user_is_on_the_navigation_menu() {
        String navigationMenu = "//*[@id=\"main-nav-wrap\"]";
        try {
            webDriver.findElement(By.xpath(navigationMenu));
            System.out.println("This is the navigation menu.");
        } catch (NoSuchElementException exc) {
            System.out.println("Cannot find menu.");
        }
    }

    @When("the user finds {string} button and clicks on it")
    public void the_user_finds_button_and_clicks_on_it(String string) {
        String myAccountBtnPath = "//*[@id=\"menu-item-50\"]/a";
        String expectedText= "Account" ;

        String elementText = webDriver.findElement(By.xpath(myAccountBtnPath)).getText() ;
        Assertions.assertTrue(elementText.contains(expectedText)) ;

        System.out.println("Let's see My Account page.");
        webDriver.findElement(By.xpath(myAccountBtnPath)).click();

    }

    @Then("the user is taken to the \"My Account\"page")
    public void the_user_is_taken_to_the_my_account_page() {
        webDriver.get(myAccountPageUrl);
        Assert.assertEquals(myAccountPageUrl, webDriver.getCurrentUrl());
        System.out.println("This is My Account page.");
    }
}

