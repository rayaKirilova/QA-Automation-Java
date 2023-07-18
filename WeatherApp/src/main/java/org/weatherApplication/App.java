package org.weatherApplication;

import org.openqa.selenium.WebDriver;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Get input from the user
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter a name of a city: ") ;
        String cityName = input.next() ;
        System.out.println("Enter a name of a country: ") ;
        String countryName = input.next() ;
        input.close();

        // Print informative message for the input
        System.out.println("You have selected " + cityName + " in " + countryName + ".");

        // Create the webDriver from the utility method
        WebDriver webDriver = WebDriverGenerator.createWebDriver() ;

        //Create the cityProperties object to contain all necessary data
        CityProperties cityProperties = new CityProperties(webDriver, cityName, countryName);

        //Close the webDriver after it is not needed
        WebDriverCleanup.closeWebDriver(webDriver);

        //Print the coordinates that were found
        System.out.println("Lat:" + cityProperties.getLatitude());
        System.out.println("Long:" + cityProperties.getLongitude());

        // Create the REST call
        WeatherApi weatherApi = new WeatherApi(cityProperties.getLatitude(), cityProperties.getLongitude());
        weatherApi.printHourlyTable();
    }
}
