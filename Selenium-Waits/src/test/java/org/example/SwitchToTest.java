<<<<<<< HEAD
package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwitchToTest {
    static WebDriver webDriver ;

    @BeforeAll
    public static void initiate(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions() ;
        options.addArguments("Start-Maximized") ;
        // options.addArguments("--remote-allow-origins=*");

        webDriver = new ChromeDriver(options) ;
    }

    @AfterAll
    public static void close(){
        //  webDriver.close();
        //  webDriver.quit();
    }

    @Test
    @DisplayName("Should create the correct alert")
    public void createAlertCheck(){
        String expectedResult = "Hello! I am an alert box!" ;
        SwitchTo switchTo = new SwitchTo(webDriver) ;
        String realAlertString = switchTo.createAlert() ;

        // test passed
        Assertions.assertTrue(realAlertString.contains(expectedResult));

        /* test failed - comparison failure with different text
        String falseResult = "Hello! What's your name?" ;
        Assertions.assertTrue(realAlertString.contains(falseResult));
        */

    }
}
=======
package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwitchToTest {
    static WebDriver webDriver ;

    @BeforeAll
    public static void initiate(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions() ;
        options.addArguments("Start-Maximized") ;
        // options.addArguments("--remote-allow-origins=*");

        webDriver = new ChromeDriver(options) ;
    }

    @AfterAll
    public static void close(){
        //  webDriver.close();
        //  webDriver.quit();
    }

    @Test
    @DisplayName("Should create the correct alert")
    public void createAlertCheck(){
        String expectedResult = "Hello! I am an alert box!" ;
        SwitchTo switchTo = new SwitchTo(webDriver) ;
        String realAlertString = switchTo.createAlert() ;

        // test passed
        Assertions.assertTrue(realAlertString.contains(expectedResult));

        /* test failed - comparison failure with different text
        String falseResult = "Hello! What's your name?" ;
        Assertions.assertTrue(realAlertString.contains(falseResult));
        */

    }
}
>>>>>>> origin/main
