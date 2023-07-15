package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ExampleById {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup() ;
        ChromeOptions options = new ChromeOptions() ;
        options.addArguments("Start-Maximized" );
        options.addArguments("--remote-allow-origins=*");

        WebDriver webDriver = new ChromeDriver(options) ;
        webDriver.get("https://practice.automationtesting.in/my-account/") ;
        Thread.sleep(2000);

       // WebElement registerBox = webDriver.findElement(By.id("reg_email")) ;
       // registerBox.sendKeys("RANDOM_EMAIL@TEST.COM", Keys.ENTER);

        // short syntax for finding element
        webDriver.findElement(By.id("reg_email")).sendKeys("RANDOM_EMAIL@TEST.COM", Keys.ENTER);
        Thread.sleep(2000);

        webDriver.close() ;
        webDriver.quit() ;
    }
}
