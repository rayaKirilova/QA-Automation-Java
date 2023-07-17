package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    private final String urlLink = "https://google.com";
    private final String agreeButton = "L2AGLb";
    private final String googleSearchBox = "q";
    private final String firstResultXpath = "//a/h3";
    private WebDriver webDriver;
    private int secondsToWait;

    public ExplicitWait(WebDriver webDriver, int secondsToWait) {
        this.webDriver = webDriver;
        this.secondsToWait = secondsToWait;
    }

    public String firstPageEls() {
        webDriver.get(urlLink);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secondsToWait));
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(secondsToWait));
        webDriver.findElement(By.id(agreeButton)).click();
        WebElement searchButton = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")
                )
        );
        webDriver.findElement(By.name(googleSearchBox)).sendKeys("Yahoo", Keys.ENTER);
       // searchButton.click();

        WebElement firstResult = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath(firstResultXpath)
                )
        );
        String firstResultText = firstResult.getText();
        return firstResultText;
    }
}