package pl.chmielna20.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import pl.chmielna20.Main;

public class RegisterPage extends BasePage{

	
	private final static String URL = "/register";
   WebDriver driver;
	
	By	 userfirstname=By.id("firstname");
	By usersecondname=By.id("lastname");
	By genderbutton=By.id("genderM");
	By dayofbirth = By.name("day");
	By monthofbirth = By.name("month");
	By yearofbirth = By.name("year");
	By phonenumber = By.name("phone");
	By email = By.id("email");
	By password = By.id("password");
	By passconfirmation = By.id("password_confirmation");
	By regulationsconfirm = By.xpath("//input[@value='1']");
	By continuebutton = By.partialLinkText("Kontynuuj");
	
	String firstName = "Rafa³";
	
	public RegisterPage(WebDriver driver) {
		super(URL, driver);
		this.driver = driver;
	}
	
	public void goToPage(){
		driver.get(Main.BASIC_URL+URL);
	}
	
	public void typeUserFirstName()
	{
		driver.findElement(userfirstname).sendKeys(firstName);
	}
	public void typeUserSecondName()
	{
		driver.findElement(usersecondname).sendKeys("Rym");
	}
	public void chooseGender()
	{
		if(driver.findElement(By.id("sc_behind")).isDisplayed()){
			driver.findElement(By.id("sc_close")).click();
		}
		driver.findElement(genderbutton).click();
	}
	public void chooseDayOfBirth()
	{
		Select selectDay = new Select(driver.findElement(By.id("day")));
		selectDay.selectByIndex(selectDay.getOptions().size()-10);
	}
	public void chooseMonthOfBirth()
	{
		Select selectMonth = new Select(driver.findElement(By.id("month")));
		selectMonth.deselectByVisibleText("7");
	}
	public void chooseYearOfBirth()
	{
		Select selectYear = new Select(driver.findElement(By.id("year")));
		selectYear.deselectByVisibleText("1986");
	}
	public void typePhoneNumber()
	{
		driver.findElement(phonenumber).sendKeys("+48500300300");
	}
	public void typeEmail()
	{
		driver.findElement(email).sendKeys("rymraf@gmail.com");
	}
	public void typePassword()
	{
		driver.findElement(password).sendKeys("dupadupa");
	}
	public void ConfirmPassword()
	{
		driver.findElement(passconfirmation).sendKeys("dupadupa");
	}
	public void clickOnContinueRegulationsCheckbox()
	{
		driver.findElement(regulationsconfirm).click();
	}
	public void clickOnContinueButton()
	{
		driver.findElement(continuebutton).click();
	}	
}
