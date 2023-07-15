package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// Example for finding element by Id

public class GetElementById {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("Start-Maximized");

        // allow connections from all origins. I get an error without it
        options.addArguments("--remote-allow-origins=*");

        WebDriver webDriver = new ChromeDriver(options);
        webDriver.get("https://accounts.google.com");
        Thread.sleep(2000);

        WebElement userInputBox = webDriver.findElement(By.id("identifierId"));
        userInputBox.sendKeys("SOME_EMAIL@gmail.com", Keys.ENTER);

        // valid input
        //userInputBox.sendKeys("raya.n.kirilova@gmail.com", Keys.ENTER);
        Thread.sleep(3000);

        webDriver.close();
        webDriver.quit();
    }
}
