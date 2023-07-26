package pomExamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccTest {
    private static WebDriver webDriver;
    private static final String user = "abv_user_id";
    private static final String pass = "abv_user_pass";
    private static final String tel = "123456789";
    private static final String gName = "Mark";
    private static final String sName = "Jefferson";
    private static final String gender = "male";
    private static final int bDay = 20;
    private static final int bMonth = 7;
    private static final int bYear = 1999;

    @BeforeAll
    public static void initiate() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("Start-Maximized");
        options.addArguments("--remote-allow-origins=*");
        webDriver = new ChromeDriver(options);
    }

//    @AfterAll
//    public static void cleanup() {
//        webDriver.close();
//        webDriver.quit();
//    }

    @Test
    @DisplayName("Fail to create a new user using the registration form")
    public void failToCreateNewUser() {
        CreateAccountPage createAccountPage = new CreateAccountPage(webDriver);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        createAccountPage.addUserId(user);
        createAccountPage.addPassword(pass);
        createAccountPage.confirmPassword(pass);

        // Add missing tel number method
        createAccountPage.addFirstName(gName);
        createAccountPage.addLastName(sName);

        if(gender.equalsIgnoreCase("Male")) {
            createAccountPage.selectMaleRadio();
        } else {
            createAccountPage.selectFemaleRadio();
        }

        createAccountPage.selectedBDay(bDay);
        createAccountPage.selectedBMonth(bMonth);
        createAccountPage.selectedBYear(bYear);
    }
}
