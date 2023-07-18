package org.example;

import org.openqa.selenium.* ;

public class SwitchTo {
    private WebDriver webDriver ;
    public SwitchTo(WebDriver webDriver){
        this.webDriver = webDriver ;
    }

    public String createAlert(){
        // Open test page and accpet terms and conditions
        webDriver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        webDriver.findElement(By.id("accept-choices")).click();

        // Change the web drivers focus to the iframe that contains the alert button
        WebElement resultFrame = webDriver.findElement(By.id("iframeResult")) ;
        webDriver.switchTo().frame(resultFrame) ;

        // Create an alert and get the text from the pop-up
        String alertText = "bad alert, handle it!" ;
        webDriver.findElement(By.xpath("/html/body/button")).click() ;
        Alert alert = webDriver.switchTo().alert();
        alertText = alert.getText() ;

        System.out.println("The alert text is: " + alertText) ;

        // Accept the alert
        alert.accept();

        // Return to the parent HTML page
        webDriver.switchTo().parentFrame() ;

        return alertText ;
    }
}
