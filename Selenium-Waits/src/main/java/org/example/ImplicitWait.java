package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ImplicitWait {
    private WebDriver webDriver ;
    private int secondsToWait ;

    public ImplicitWait(WebDriver webDriver, int secondsToWait){
        this.webDriver = webDriver ;
        this.secondsToWait = secondsToWait ;
    }

    public String basicImplWait(String webPage) {
        webDriver.get(webPage);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secondsToWait)) ;
        WebElement jsElement = webDriver.findElement(By.xpath("/html/body/pre")) ;
        String jsStringResult = jsElement.getText() ;
        return jsStringResult ;
    }
}
