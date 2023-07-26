package pomExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailWelcomePage extends BasePage {
    private static final String gmailReg = "https://www.google.com/gmail/about/" ;
    private By homePageTitle = By.xpath("/html/body/main/div[1]/div/div/div/div/div[1]/div[1]");
    private By createAccButton = By.xpath("/html/body/main/div[1]/div/div/div/div/div[1]/div[3]/div[1]/a");
    private WebDriver webDriver = super.getWebDriver();

    public GmailWelcomePage(WebDriver webDriver) {
        super(webDriver, gmailReg);
    }

    public void clickCreateAcc() {
        webDriver.findElement(createAccButton).click();
    }

    public String checkHomePageTitle() {
        return webDriver.findElement(homePageTitle).getText();
    }
}
