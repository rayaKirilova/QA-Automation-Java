package pomExamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AbvWelcomeTests {

    private static WebDriver webDriver ;
    @BeforeAll
    public static void initiate(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options =  new ChromeOptions() ;
        options.addArguments("Start-Maximized") ;
        options.addArguments("--remote-allow-origins=*");
        webDriver = new ChromeDriver(options) ;
    }

    @AfterAll
    public static void cleanup(){
        webDriver.close() ;
        webDriver.quit() ;
    }

    @Test
    @DisplayName("Test the ABV home page with userId and pass")
    public void withInvalidUserOrPass() {
        // setup
        String user = "abv_user_id" ;
        String pass = "abv_user_password" ;

        // use
        AbvWelcomePage abvWelcomePage = new AbvWelcomePage(webDriver) ;
        abvWelcomePage.enterUserName(user);
        abvWelcomePage.enterPassword(pass);

        // assert
        Assertions.assertTrue(abvWelcomePage.getPageTitle().contains("Вход в АБВ Поща"),
                "The opened page does not contain the expected title!") ;
        Assertions.assertEquals(user, abvWelcomePage.getInputtedUserId());
        Assertions.assertEquals(pass, abvWelcomePage.getInputtedUserPass());

        // used here just for example
        abvWelcomePage.loginEmail() ;

        // Testing by comparing to expected good result and evaluating to false (negative)
        String realError = abvWelcomePage.getError();
        Assertions.assertFalse(realError.equals("No error was found!"));

        //Assertions.assertEquals("Грешен потребител / парола.", abvWelcomePage.getError());
    }
}
