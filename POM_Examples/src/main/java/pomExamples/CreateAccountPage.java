package pomExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage extends BasePage {
    private static final String registrationPage = "https://passport.abv.bg/app/profiles/registration";
    private WebDriver webDriver = super.getWebDriver();

    // The consent form is not part of the page, but it might be necessary to agree to it
    // @FindBy(id = "didomi-notice-agree-button")
    // WebElement consentToTerms;
    @FindBy(xpath = "/html/body/article/div/div[2]/h2")
    WebElement regPageTitle;
    @FindBy(id = "regformUsername")
    WebElement userIdBox;
    @FindBy(id = "password")
    WebElement userPwdBox;
    @FindBy(id = "password2")
    WebElement userConfPwdBox;
    @FindBy(id = "mobilePhone")
    WebElement userTelNum;
    @FindBy(id = "fname")
    WebElement userFName;
    @FindBy(id = "lname")
    WebElement userLName;
    @FindBy(xpath = "//*[@id=\"regform\"]/div[9]/div/label[1]\n")
    WebElement maleRadio;
    @FindBy(xpath = "//*[@id=\"regform\"]/div[9]/div/label[2]\n")
    WebElement femaleRadio;
    @FindBy(id = "bDay")
    WebElement userBDay;
    @FindBy(id = "bMonth")
    WebElement userBMonth;
    @FindBy(id = "bYear")
    WebElement userBYear;
    @FindBy(xpath = "//*[@id=\"regform\"]/div[11]/div/input")
    WebElement continueButton;

    private String chosenUserPassword;

    public CreateAccountPage(WebDriver webDriver) {
        super(webDriver, registrationPage);
        PageFactory.initElements(super.getWebDriver(), this);
    }

    //ѝЗѝЦ <= Example for forbidden symbols (maybe)
    public void fillElement(WebElement element, String inputText) {
        // Check if encoding is correct
        // Check if it is not an empty string
        // Check if the string is long enough
        // Check if there are forbidden symbols
        element.sendKeys(inputText);
    }

    /*public void acceptTerms() {
        consentToTerms.click();
    }*/

    public String checkPageTitle() {
        return regPageTitle.getText();
    }

    public void addUserId(String userId) {
        fillElement(userIdBox, userId);
    }

    public void addPassword(String userPassword) {
        this.chosenUserPassword = userPassword;
        fillElement(userPwdBox, userPassword);
    }

    public void confirmPassword(String confirmedPass) {
        if (!confirmedPass.equals(chosenUserPassword)) {
            System.out.println("The confirmed password does not match the previously entered one!");
            return;
        }
        fillElement(userConfPwdBox, confirmedPass);
    }

    public void addFirstName(String firstName) {
        fillElement(userFName, firstName);
    }

    public void addLastName(String lastName) {
        fillElement(userLName, lastName);
    }

    public void selectMaleRadio() {
        maleRadio.click();
    }

    public void selectFemaleRadio() {
        femaleRadio.click();
    }

    // SKIP the birthdays for now!

    public void registerAccount() {
        continueButton.click();
    }

    public void selectedBDay(int bDayDate) {
        userBDay.click();
        WebElement selectedBDay = webDriver.findElement(By.xpath("//*[@id=\"bDay\"]/ul/li[" + bDayDate + "]"));
        selectedBDay.click();

        // if the drop-down was a selection we could have used this
        // Select dropBDay = new Select(userBDay) ;
        // dropBDay.selectByIndex(dDayDate - 1);
        // dropBDay.selectByValue(Integer.toString(dDayDate));
    }

    public void selectedBMonth(int bMonth) {
        userBMonth.click();
        WebElement selectedBMonth = webDriver.findElement(By.xpath("//*[@id=\"bMonth\"]/ul/li[" + bMonth + "]"));
        selectedBMonth.click();
    }

    public void selectedBYear(int bYear) {
        if (bYear > 2009 || bYear < 1923) {
            System.out.println("Unsupported birth year. Try another email provider!");
            return;
        }
        userBYear.click();
        int realYearLocation = 2010 - bYear;
        WebElement selectedBYear = webDriver.findElement(By.xpath("//*[@id=\"bYear\"]/ul/li[" + realYearLocation + "]"));
        selectedBYear.click();
    }
}
