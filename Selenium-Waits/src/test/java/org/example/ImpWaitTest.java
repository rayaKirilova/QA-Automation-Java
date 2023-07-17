package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImpWaitTest {
    static WebDriver webDriver ;
    static int secondsToWait = 10 ;
    static String webAddress = "https://reqres.in/api/users?delay3" ;


    @BeforeAll
    public static void initiate() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions() ;
        options.addArguments("Start-Maximized") ;
        options.addArguments("--remote-allow-origins=*");
        webDriver = new ChromeDriver(options) ;
    }

    @AfterAll
    public static void close() {
        webDriver.close() ;
        webDriver.quit() ;
    }

    @Test
    @DisplayName("should fetch element values from a page")
    public void shouldFetchElements() {
        String expectedResult = "charles.morris@reqres.in" ;
        ImplicitWait implicitWait = new ImplicitWait(webDriver, secondsToWait) ;
        String basicReply = implicitWait.basicImplWait(webAddress) ;

        // failed assertion by design - comparison failure, the strings are  ot equal
        // Assertions.assertEquals(expectedResult, basicReply); ;

        // passed test
        Assertions.assertTrue(basicReply.contains(expectedResult)) ;
    }

}
