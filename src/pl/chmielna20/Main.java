package pl.chmielna20;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/workspace/chmielna20/resources/features/" ,
		format = {"pretty","html:target/report"})

public class Main {

	public static WebDriver driver;
	
	public static final String BASIC_URL = "https://chmielna20.pl";
	
	@BeforeClass
	public static void init(){
		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	/*@AfterClass
	public static void finish(){
		if(driver != null)
			driver.close();
	}*/
	
}
