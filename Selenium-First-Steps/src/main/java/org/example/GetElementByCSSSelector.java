package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetElementByCSSSelector {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions() ;
        options.addArguments("Start-Maximized");
        options.addArguments("--remote-allow-origins=*");

        WebDriver webDriver = new ChromeDriver(options);
        webDriver.get("https://login.yahoo.com");
        Thread.sleep(2000);

       // webDriver.findElement(By.cssSelector("#login-username")).sendKeys("MY_YAHOO_MAIL");
       // webDriver.findElement(By.cssSelector("#login-signin")).click();

        webDriver.findElement(By.cssSelector("button#tpa-google-button")).click();
        Thread.sleep(2000);

        webDriver.close();
        webDriver.quit();
    }
}
