package pl.chmielna20.run;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import pl.chmielna20.Main;

public class InitBrowser{
	
	@Given("Open the Browser")
	public void openTheBrowser(){
		if(Main.driver != null){
			System.setProperty("webdriver.chrome.driver", "C:\\workspace\\chromedriver.exe");
			Main.driver = new ChromeDriver();
			Main.driver.manage().window().maximize();
		}
	}
	/*public InitBrowser(){
	Given("Open the Browser",()->{
			if(Main.driver != null){
				System.setProperty("webdriver.chrome.driver", "C:\\workspace\\chromedriver.exe");
				Main.driver = new ChromeDriver();
				Main.driver.manage().window().maximize();
			}
		});
	}	*/
}
