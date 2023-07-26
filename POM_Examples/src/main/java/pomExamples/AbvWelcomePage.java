package pomExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbvWelcomePage extends BasePage {
    private static final String webUrl = "https://www.abv.bg";
    WebDriver webDriver = super.getWebDriver();

    @FindBy(xpath = "//*[@id=\"loginForm\"]/h2")
    WebElement abvSubTitle;
    @FindBy(id = "username")
    WebElement userInputBox;
    @FindBy(id = "password")
    WebElement passwordInputBox;
    @FindBy(id = "loginBut")
    WebElement loginButton;

    public AbvWelcomePage(WebDriver webDriver) {
        super(webDriver, webUrl);
        PageFactory.initElements(super.getWebDriver(), this);
    }

    public void enterUserName(String userId) {
        userInputBox.sendKeys(userId);
    }

    public void enterPassword(String userPass) {
        passwordInputBox.sendKeys(userPass);
    }

    public void loginEmail() {
        loginButton.click();
    }

    public String getPageTitle() {
        return abvSubTitle.getText();
    }

    public String getInputtedUserId() {
        return userInputBox.getAttribute("value");
    }

    public String getInputtedUserPass() {
        return passwordInputBox.getAttribute("value");
    }

    public String getError() {
        WebElement errorElement;
        try {
            errorElement = webDriver.findElement(By.className("abv-red"));
        } catch (Exception exception) {
            return "No error was found!";
        }
        return errorElement.getText();
    }

}
