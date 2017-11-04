package pl.chmielna20.run;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java8.En;
import pl.chmielna20.Main;

public class InitBrowser implements En{
	
	public InitBrowser(){
		Given("Open the Browser",()->{
			if(Main.driver != null){
				System.setProperty("webdriver.chrome.driver", "C:\\workspace\\chromedriver.exe");
				Main.driver = new ChromeDriver();
				Main.driver.manage().window().maximize();
			}
		});
	}	
}
