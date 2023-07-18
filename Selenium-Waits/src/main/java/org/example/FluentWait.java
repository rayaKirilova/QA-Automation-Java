package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class FluentWait {
    private WebDriver webDriver ;
    private int secondsToWait ;
    private int pollingIntervals ;

    public FluentWait(WebDriver webDriver, int secondsToWait, int pollingIntervals){
        this.webDriver= webDriver ;
        this.secondsToWait = secondsToWait ;

        if (pollingIntervals > 2){
            this.pollingIntervals = 2 ;
        } else {
            this.pollingIntervals = pollingIntervals ;
        }
    }

    public String basicFluentWait() {
        Wait<WebDriver> wait = new FluentWait<>(webDriver)
                .withTimeout(Duration.ofSeconds(secondsToWait))
                .pollingEvery(Duration.ofSeconds(pollingIntervals))
                .ignoring(Exception.class) ;

        return "Result" ;
    }

}
