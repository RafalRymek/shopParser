package pl.chmielna20.run;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import pl.chmielna20.Main;
import pl.chmielna20.pages.RegisterPage;

public class RegisterStep 

{
	RegisterPage register;
	
	public RegisterStep(){
		@Then("Navigate to register page"){
			public void gotoPage(){
				registerPage.gotoPage();
			}
		@And("Fill data")
		public void fillData(){
			registerPage.closePopup();
			registerPage.fillData
		}
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
			
	}		
}