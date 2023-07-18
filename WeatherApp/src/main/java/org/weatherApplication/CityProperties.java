package org.weatherApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CityProperties {
    private String cityName ;
    private String countryName ;
    private WebDriver webDriver ;

    private String latitude ;
    private String longitude ;

    public String getLatitude(){
        return latitude ;
    }

    public String getLongitude(){
        return longitude ;
    }

    public CityProperties(WebDriver webDriver, String cityName, String countryName){
        this.webDriver = webDriver ;
        this.cityName = cityName ;
        this.countryName = countryName ;

        this.getCoordinates();
    }

    public void getCoordinates(){
        // Create search string query
        String searchString = cityName + " " + countryName + " " + Constants.COORDINATES ;

        // Get to the Google search page
        webDriver.get(Constants.GOOGLE_HOME_URL);
        webDriver.findElement(By.id(Constants.GOOGLE_AGREE)).click();

        //Enter the created query and search
        WebElement searchButton = webDriver.findElement(By.xpath(Constants.GOOGLE_SEARCH_BUTTON));
        webDriver.findElement(By.name(Constants.GOOGLE_SEARCH_BOX)).sendKeys(searchString, Keys.ENTER);
        try {
            searchButton.click();
        } catch (Exception e) {
            //DO NOTHING!
        }

        // Find the first result and click on the link
        WebElement firstFound = new WebDriverWait(webDriver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.className(Constants.FIRST_SEARCH_RESULT))) ;
        firstFound.click() ;

        //Check if the table containing the LAT and LONG is loaded
        new WebDriverWait(webDriver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constants.TABLE_BODY_XPATH)));

        //Add the collected values to the city properties
        this.latitude = webDriver.findElement(By.xpath(Constants.LAT_XPATH)).getText().replace(",",".");;
        this.longitude = webDriver.findElement(By.xpath(Constants.LONG_XPATH)).getText().replace(",",".");;

    }

}
