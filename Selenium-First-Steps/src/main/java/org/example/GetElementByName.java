package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetElementByName {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("Start-Maximized");
        options.addArguments("--remote-allow-origins=*");

        WebDriver webDriver = new ChromeDriver(options);
        webDriver.get("https://google.com");

        webDriver.findElement(By.id("L2AGLb")).click();
        Thread.sleep(3000);

        WebElement searchBox = webDriver.findElement(By.name("q")) ;
        searchBox.sendKeys("How to work with Selenium", Keys.ENTER);
        Thread.sleep(3000);

        webDriver.findElement(By.name("btnK")).click();
        Thread.sleep(3000);

        webDriver.close();
        webDriver.quit();
    }
}
