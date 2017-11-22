package pl.chmielna20.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pl.chmielna20.Main;
import pl.chmielna20.utils.Utils;

public class RegisterPage extends BasePage {

    private final static String URL = "/register";
    private final WebDriverWait wait;

    private final By userFirstNameBy = By.id("firstname");
    private final By userLastNameBy = By.id("lastname");
    private final By genderButtonBy = By.id("genderM");
    private final By dayOfBirthBy = By.name("day");
    private final By monthOfBirthBy = By.name("month");
    private final By yearOfbirthBy = By.name("year");
    private final By phoneNumberBy = By.name("phone");
    private final By emailBy = By.id("email");
    private final By passwordBy = By.id("password");
    private final By passConfirmationBy = By.id("password_confirmation");
    private final By regulationsConfirmBy = By.cssSelector("#agree");
    private final By continueButtonBy = By.partialLinkText("Kontynuuj");

    private final By fillFormBy = By.cssSelector("#ch20 > div:nth-child(7) > form > div.col-md-8.col-sm-12.col-xs-12");

    private String firstName = "Rafal";
    private String lastName = "Rym";
    private String phoneNumber = "500300300";
    private String email = Utils.generateEmail();
    private String password = "dupadupa";

    public RegisterPage(WebDriver driver,WebDriverWait wait) {
        super(URL, driver);
        this.wait = wait;
    }

    public void waitForFillForm(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(fillFormBy));
    }

    public void goToPage() {
        driver.get(Main.BASIC_URL + URL);
    }

    public void typeUserFirstName() {
        Utils.typeToFiled(driver.findElement(fillFormBy).findElement(userFirstNameBy),firstName);
    }

    public void typeUserLastName() {
        Utils.typeToFiled(driver.findElement(fillFormBy).findElement(userLastNameBy),lastName);
    }

    public void chooseGender() {
        driver.findElement(genderButtonBy).click();
    }

    public void chooseDayOfBirth() {
        Utils.selectField(dayOfBirthBy,1);
    }

    public void chooseMonthOfBirth() {
        Utils.selectField(monthOfBirthBy,1);
    }

    public void chooseYearOfBirth() {
        Utils.selectField(yearOfbirthBy,10);
    }

    public void typePhoneNumber() {
        Utils.typeToFiled(driver.findElement(fillFormBy).findElement(phoneNumberBy),phoneNumber);
    }

    public void typeEmail() {
        System.out.println("\n\n\nTEST\n"+driver.findElement(emailBy).getText());
        Utils.typeToFiled(driver.findElement(fillFormBy).findElement(emailBy),email);
    }

    public void typePassword() {
        Utils.typeToFiled(driver.findElement(fillFormBy).findElement(passwordBy), password);
    }

    public void typeConfirmPassword(){
        Utils.typeToFiled(driver.findElement(fillFormBy).findElement(passConfirmationBy),password);
    }

    public void clickOnContinueRegulationsCheckbox(){
        Utils.scrollToElement(regulationsConfirmBy);
        driver.findElement(regulationsConfirmBy).click();
    }

    public void clickOnContinueButton() {
        driver.findElement(continueButtonBy).click();
    }


}
