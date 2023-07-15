package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetElementByXpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions() ;
        options.addArguments("Start-Maximized");
        options.addArguments("--remote-allow-origins=*");

        WebDriver webDriver = new ChromeDriver(options);
        webDriver.get("https://www.w3schools.com/css/css_selectors.asp");
        Thread.sleep(3000);

        // accept cookies button
        webDriver.findElement(By.xpath(" //*[@id=\"accept-choices\"]")).click();
        Thread.sleep(3000);

        // Try it yourself button for CSS exercises
        webDriver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/a")).click();
        Thread.sleep(4000);

        webDriver.close();
        webDriver.quit();
    }
}
