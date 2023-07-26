package pomExamples;

import org.openqa.selenium.WebDriver;

public class BasePage {
    private WebDriver webDriver;

    public BasePage(WebDriver webDriver, String webUrl) {
        this.webDriver = webDriver;
        goToPage(webUrl) ;
    }

    public boolean goToPage(String url) {
        if(!url.startsWith("http://") && !url.startsWith("https://")) {
            System.out.println("Invalid url was supplied!");
            return false;
        }
        //"google.com" <= .get() does not accept url with missing components
        webDriver.get(url);
        return true;
    }

    public int getOpenTabs() {
        return webDriver.getWindowHandles().size();
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
