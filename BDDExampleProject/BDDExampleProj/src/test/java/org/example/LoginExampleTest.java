package org.example;

import io.cucumber.java.*;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginExampleTest {
    private static WebDriver webDriver;
    static LoginHomePage loginHomePage ;

    // These are unused in the code, because we get the values from the feature
    private static final String userId = "MyTestId";
    private static final String userPass = "12345";

    @BeforeAll
    public static void initiate() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("Start-Maximized");
        webDriver = new ChromeDriver(options);
        loginHomePage = new LoginHomePage(webDriver) ;
    }

    @AfterAll
    public static void closeWindow() {
        webDriver.close();
        webDriver.quit();
    }

    @Given("the browser is open")
    public void the_browser_is_open() {
        boolean windowIsOpen;
        try {
            loginHomePage.isLoaded();
            windowIsOpen = true;
        } catch (Error error) {
            windowIsOpen = false;
        }
        Assertions.assertTrue(windowIsOpen, "There were no open browser windows!");
    }

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String expectedTitle = "TestProject Example page";
       // String titleId = "pageLogin";
       // WebElement pageTitle = webDriver.findElement(By.id(titleId));

        String titleText = loginHomePage.getPageTitle();
        Assertions.assertTrue(titleText.contains(expectedTitle));
    }

    @Given("the login button is usable")
    public void the_login_button_is_usable() {
        Assertions.assertTrue(loginHomePage.loginButtonIsAvailable(), "The button was not usable!");
    }

    @When("^the user enters their username (.*) and password (.*)$")
    public void the_user_enters_their_credentials(String username, Integer password) {

        loginHomePage.setUserInput(username);
        loginHomePage.setPassInput(password.toString());

        String userInputString = loginHomePage.getUserInput();
        Assertions.assertEquals(username, userInputString.equals(username), "The provided User ID was not expected!");
    }

    @When("the login button is clicked")
    public void the_login_button_is_clicked() {
        Assertions.assertTrue(loginHomePage.loginButtonSuccessfullyClicked(), "The button could not be clicked!");
    }

    @Then("the user is transferred to the login home page")
    public void the_user_is_transferred_to_the_login_home_page() {
        Assertions.assertTrue(
                loginHomePage.logoutButtonIsDisplayed(),
                "Logout button cannot be seen");
    }
}