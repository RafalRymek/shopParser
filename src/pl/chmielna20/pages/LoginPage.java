package pl.chmielna20.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pl.chmielna20.Main;
import pl.chmielna20.utils.Utils;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(URL, driver);
	}

	private final static String URL = "/login";

	private final By emailLogin = By.id("email");
	private final By emailPassword = By.id("password");
	private final By loginButton = By.cssSelector("input[value='Zaloguj siê']");

	private String email = Utils.generateEmail();
	private String password = "haslo123";

	public void goToPage() {
		driver.get(Main.BASIC_URL + URL);
	}

	public void typeEmail() {
		System.out.println("\n\n\nTEST\n" + driver.findElement(emailLogin).getText());
		Utils.typeToFiled(driver.findElement(emailLogin), email);
	}

	public void typePassword() {
		Utils.typeToFiled(driver.findElement(emailPassword), password);
	}

	public void clickOnLoginButton() {
		driver.findElement(loginButton).click();
	}
}
