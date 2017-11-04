package pl.chmielna20.run;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java8.En;
import pl.chmielna20.Main;
import pl.chmielna20.pages.RegisterPage;

public class RegisterStep implements En
{
	RegisterPage register;
	public RegisterStep(){
		Then("Navigate to register page",()->{
			if(Main.driver == null){
				Main.driver = new ChromeDriver();
			}
			register = new RegisterPage(Main.driver);
			register.goToPage();
		});
		
		And("Fill data",()->{
			if(register != null){
				
			register.typeUserFirstName();
			register.typeUserSecondName();
			register.chooseGender();
			register.chooseDayOfBirth();
			register.chooseMonthOfBirth();
			register.chooseYearOfBirth();
			register.typePhoneNumber();
			register.typeEmail();
			register.typePassword();
			register.ConfirmPassword();
			register.clickOnContinueRegulationsCheckbox();
			register.clickOnContinueButton();
			}
			});
	}		
}
