package org.example;

import org.openqa.selenium.WebDriver ;
import org.openqa.selenium.support.ui.LoadableComponent ;

public class BasePage extends LoadableComponent<BasePage> {
    private WebDriver webDriver ;
    private String url ;

    public BasePage(WebDriver webDriver, String url){
        this.webDriver = webDriver ;
        this.url = url ;
        load();
    }

    @Override
    public void load() {
        webDriver.get(url);
    }

    @Override
    public void isLoaded() throws Error {
        if (url.equals(webDriver.getCurrentUrl())){
            return ;
        }
        throw new Error("Wrong webpage is open!") ;
    }
}
