package pl.chmielna20.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import pl.chmielna20.Main;

public class RegisterPage extends BasePage{

	
	private final static String URL = "/register";
   WebDriver driver;
	
	By userFirstName=By.id("firstname");
	By userSecondName=By.id("lastname");
	By genderButton=By.xpath("//*[@id='genderM']");
	By dayOfBirth = By.name("day");
	By monthOfBirth = By.name("month");
	By yearOfBirth = By.name("year");
	By phoneNumber = By.name("phone");
	By email = By.id("email");
	By password = By.id("password");
	By passConfirmation = By.id("password_confirmation");
	By regulationsConfirm = By.xpath("//input[@value='1']");
	By continueButton = By.cssSelector("input[value='Kontunuuj']");
	
			String firstName = "Rafal";
	
	public RegisterPage(WebDriver driver) {
		super(URL, driver);
		this.driver = driver;
	}
	
	public void goToPage(){
		driver.get(Main.BASIC_URL+URL);
	}
	
	public void typeUserFirstName()
	{
		driver.findElement(userFirstName).sendKeys(firstName);
	}
	public void typeUserSecondName()
	{
		driver.findElement(userSecondName).sendKeys("Rym");
	}
	public void chooseGender()
	{
		if(driver.findElement(By.id("sc_behind")).isDisplayed()){
			driver.findElement(By.id("sc_close")).click();
		}
	}
		
		//test
		{driver.findElement(genderButton).click();
		}
		
	public void chooseDayOfBirth()
	{
		Select selectDay = new Select(driver.findElement(By.id("day")));
		selectDay.selectByIndex(selectDay.getOptions().size()-10);
	}
	public void chooseMonthOfBirth()
	{
		Select selectMonth = new Select(driver.findElement(By.id("month")));
		selectMonth.selectByVisibleText("7");
	}
	public void chooseYearOfBirth()
	{
		Select selectYear = new Select(driver.findElement(By.id("year")));
		selectYear.selectByVisibleText("1986");
	}
	public void typePhoneNumber()
	{
		driver.findElement(phoneNumber).sendKeys("500300300");
	}
	public void typeEmail()
	{
		driver.findElement(email).sendKeys("rymraf@gmail.com");
	}
	public void typePassword()
	{
		driver.findElement(password).sendKeys("test123");
	}
	public void ConfirmPassword()
	{
		driver.findElement(passConfirmation).sendKeys("test123");
	}
	public void clickOnContinueRegulationsCheckbox()
	{
		driver.findElement(regulationsConfirm).click();
	}
	public void clickOnContinueButton()
	{
		driver.findElement(continueButton).click();
	}	
}
