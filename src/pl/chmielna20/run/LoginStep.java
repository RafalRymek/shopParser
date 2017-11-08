package pl.chmielna20.run;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.chmielna20.Main;
import pl.chmielna20.pages.LoginPage;


public class LoginStep {
	
	private static final WebDriver Webdriver = null;
	LoginPage login;
	public LoginStep(){
		{
			if(Main.driver == null){
				Main.driver = new ChromeDriver();
			}
			login = new LoginPage(Webdriver);
			login.goToPage();
		};

		{
			if(login == null){
				
			login.typeEmail();
			login.typeEmailPass();
			login.clickOnLoginButton();
		
			}
			};
	}		
			
	}

