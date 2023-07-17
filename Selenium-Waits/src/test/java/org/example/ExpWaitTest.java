package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExpWaitTest {
    static WebDriver webDriver;
    static final int secondsToWait = 10;

    @BeforeAll
    public static void initiate() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("Start-Maximized");
        webDriver = new ChromeDriver(options);
    }

    @AfterAll
    public static void close() {
//        webDriver.close();
//        webDriver.quit();
    }

    @Test
    @DisplayName("should fetch the first google result from a search")
    public void shouldFindSearchResults() {
        ExplicitWait explicitWait = new ExplicitWait(webDriver, secondsToWait);
        String firstResultText = explicitWait.firstPageEls();

        // test passed
        Assertions.assertTrue(firstResultText.contains("Yahoo"));
    }
}