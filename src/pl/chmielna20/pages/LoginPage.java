package pl.chmielna20.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pl.chmielna20.Main;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(URL, driver);
	}
	private final static String URL = "/login";
	   WebDriver driver;
	
		By emailLogin = By.id("email");
		By emailPassword = By.id("password");
		By loginButton = By.cssSelector("input[value='Zaloguj si�']");
		
		{
			driver.get(Main.BASIC_URL+URL);
		}
		public void typeEmail()
		{
			driver.findElement(emailLogin).sendKeys("rafal@gmail.com");
		}
		public void typeEmailPass()
		{
			driver.findElement(emailPassword).sendKeys("demo1234");
		}		
		public void clickOnLoginButton()
		{
			driver.findElement(loginButton).click();
		}
	
	}
