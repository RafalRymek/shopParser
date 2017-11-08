package pl.chmielna20.run;

import org.openqa.selenium.chrome.ChromeDriver;
import pl.chmielna20.Main;
import pl.chmielna20.pages.RegisterPage;

public class RegisterStep 
{
	RegisterPage register;
	public RegisterStep(){
		Then("Navigate to register page",();
				{
			if(Main.driver == null){
				Main.driver = new ChromeDriver();
			}
			register = new RegisterPage(Main.driver);
			register.goToPage();
		};
		
		And ("Fill data",(){
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
			};
	}
	private void And ("Fill data",(){() {
		// TODO Auto-generated method stub
		
	}
	private void Then() {
		// TODO Auto-generated method stub
		
	}		
}
