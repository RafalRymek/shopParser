package pl.chmielna20.run;

import org.openqa.selenium.chrome.ChromeDriver;
import pl.chmielna20.Main;
import pl.chmielna20.pages.RegisterPage;

public class RegisterStep2 
{
			RegisterPage register = new RegisterPage(Main.driver);
}
	@Then("Navigate to register page")
	public void goToPage(){
		RegisterPage.goToPage();
}

	@And("Fill data")
	public void fillData(){
	RegisterPage.closePopup();
	RegisterPage.fillData // wszystko po kolej leci
		
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

