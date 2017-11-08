package pl.chmielna20.run;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.chmielna20.Main;
import pl.chmielna20.pages.LoginPage;


public class LoginStep {
	
	private static final WebDriver Webdriver = null;
	LoginPage login;
	public LoginStep();
	@Then("Click the login button")
	public void clickButton(){
	login.clickButton(); 
	}
	@And("Fill the form")
	public void fillTheForm(){
	login.sendKeys //mail, haslo
	}
	@Then("Click login")
	public void clickLoginButton(){
	login.login(); //metoda klikajaca w buttona logowania
	}
		{
			
			if(Main.driver == null){
				Main.driver = new ChromeDriver();
			}
			login = new LoginPage(Main.driver);
			
	

		};

		{
			if(login != null){
				
			login.typeEmail();
			login.typeEmailPass();
			login.clickOnLoginButton();
		
			}
			};
	}		
			
	}

