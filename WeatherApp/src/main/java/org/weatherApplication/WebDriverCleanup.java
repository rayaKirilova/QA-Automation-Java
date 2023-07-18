package org.weatherApplication;

import org.openqa.selenium.WebDriver;

public class WebDriverCleanup {
    public static void closeWebDriver(WebDriver webDriver) {
        webDriver.close();
        webDriver.quit();
    }
}
