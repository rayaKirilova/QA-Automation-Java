package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement ;
import org.openqa.selenium.support.FindBy ;
import org.openqa.selenium.By ;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginHomePage extends BasePage {
    @FindBy(id = "name")
    WebElement userInputBox ;
    @FindBy(id = "password")
    WebElement passInputBox ;
    @FindBy(id = "login")
    WebElement loginButton ;
    @FindBy(id = "pageLogin")
    WebElement pageTitle ;
    By logoutButton = By.id("logout") ;

    private WebDriver webDriver ;
    private static final String loginHomePage = "https://example.testproject.io/web/";

    public LoginHomePage(WebDriver webDriver){
        super(webDriver,loginHomePage) ;
        this.webDriver = webDriver ;
        PageFactory.initElements(webDriver, this);
    }

    public String getPageTitle() {
       return pageTitle.getText() ;
    }

    public boolean loginButtonIsAvailable(){
        int waitTimer = 5;
        boolean buttonIsActive;
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(waitTimer));
            wait.until(ExpectedConditions.elementToBeClickable(loginButton));
            buttonIsActive = true;
        } catch (WebDriverException exception) {
            buttonIsActive = false;
        }
        return buttonIsActive ;
    }

    public void setUserInput(String userId){
        userInputBox.sendKeys(userId);
    }
    public void setPassInput(String pass){
        passInputBox.sendKeys(pass);
    }

    public String getUserInput() {
        return userInputBox.getAttribute("value") ;
    }

    public boolean loginButtonSuccessfullyClicked(){
        boolean buttonSuccessfullyClicked;
        try {
            loginButton.click();
            buttonSuccessfullyClicked = true;
        } catch (WebDriverException exception) {
            buttonSuccessfullyClicked = false;
        }
        return buttonSuccessfullyClicked ;
    }

    public boolean logoutButtonIsDisplayed(){
       return webDriver.findElement(logoutButton).isDisplayed();
    }


}
