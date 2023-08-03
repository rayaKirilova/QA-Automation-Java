package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import junit.framework.Assert;
import org.junit.jupiter.api.Assertions;
import io.cucumber.java.*;
import io.cucumber.java.en.*;


public class HomePageTest {
    static WebDriver webDriver;
    private static final String loginHomePage = "https://practice.automationtesting.in/";

    @BeforeAll
    public static void initiate() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("Start-Maximized");
        webDriver = new ChromeDriver(options);
    }

    @AfterAll
    public static void closeWindow() {
        webDriver.close();
        webDriver.quit();
    }

    @Given("the browser is open")
    public void the_browser_is_open() {
        //webDriver.get(loginHomePage);
        boolean windowIsOpen;
        try {
            webDriver.getWindowHandles();
            windowIsOpen = true;
        } catch (WebDriverException exception) {
            windowIsOpen = false;
        }
        Assertions.assertTrue(windowIsOpen, "There were no open browser windows!");
    }

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        webDriver.get(loginHomePage);
        Assert.assertEquals("This is the correct webpage", loginHomePage, webDriver.getCurrentUrl());
    }

    @When("the user is on the slide section")
    public void the_user_is_on_the_slide_section() {
        try {
            String sliderSectionXPath = "//*[@id=\"n2-ss-6\"]";
            webDriver.findElement(By.xpath(sliderSectionXPath));
            System.out.println("This is the slide section. Let's drag and drop and see the pictures!");
        } catch (NoSuchElementException exc) {
            System.out.println("Cannot find this section.");
        }
    }

    @Then("the user discovers three slides")
    public void the_user_discovers_three_slides() {
        WebElement firstElement = webDriver.findElement(By.xpath("//*[@id=\"n2-ss-6\"]/div[1]/div/div/div[1]"));
        WebElement secondElement = webDriver.findElement(By.xpath("//*[@id=\"n2-ss-6\"]/div[1]/div/div/div[2]"));
        WebElement thirdSlide = webDriver.findElement(By.xpath("//*[@id=\"n2-ss-6\"]/div[1]/div/div/div[3]"));

        try {
            webDriver.findElement(By.xpath("//*[@id=\"n2-ss-6\"]/div[1]/div/div/div[1]"));
            webDriver.findElement(By.xpath("//*[@id=\"n2-ss-6\"]/div[1]/div/div/div[2]"));
            webDriver.findElement(By.xpath("//*[@id=\"n2-ss-6\"]/div[1]/div/div/div[3]"));
            System.out.println("There are three slides here.");
        } catch (NoSuchElementException e) {
            System.out.println("There is some error.");
        }
    }
}
