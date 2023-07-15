package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetElementByPartialLinkText {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions() ;
        options.addArguments("Start-Maximized");
        options.addArguments("--remote-allow-origins=*");

        WebDriver webDriver = new ChromeDriver(options);
        webDriver.get("https://mail.yahoo.com");
        Thread.sleep(3000);

        webDriver.findElement(By.partialLinkText("потребителско")).click();
        Thread.sleep(2000);

        webDriver.close();
        webDriver.quit();
    }
}
