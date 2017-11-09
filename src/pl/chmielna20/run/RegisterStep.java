package pl.chmielna20.run;

import cucumber.api.PendingException;
import cucumber.api.java8.En;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.chmielna20.Main;
import pl.chmielna20.pages.RegisterPage;

public class RegisterStep implements En {

    RegisterPage register;

    public RegisterStep() {
        Then("Navigate to register page", () -> {
            register = new RegisterPage(Main.driver,Main.wait);
            register.goToPage();
            Assert.assertEquals(Main.BASIC_URL+register.getURL(),Main.driver.getCurrentUrl());
        });

        And("^Close pop up if displayed$", () -> {
          if(Main.driver.findElement(By.cssSelector("#sc_wrapper")).isDisplayed()){
              Main.driver.findElement(By.cssSelector("#sc_close")).click();
          }
          Assert.assertTrue(!Main.driver.findElement(By.cssSelector("#sc_wrapper")).isDisplayed());
        });
        Then("^Fill the form$", () -> {
            register.waitForFillForm();
            register.typeUserFirstName();
            register.typeEmail();

            register.typeUserLastName();
            register.chooseGender();
            register.typePhoneNumber();
            register.chooseDayOfBirth();
            register.chooseMonthOfBirth();
            register.chooseYearOfBirth();
            register.typePassword();
            register.typeConfirmPassword();
            register.clickOnContinueRegulationsCheckbox();

            register.clickOnContinueRegulationsCheckbox();
        });
    }
}
