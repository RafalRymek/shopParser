package pl.chmielna20;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/workspace/chmielna20/resources/features/",
        format = {"pretty", "html:target/report"})

public class Main {

    public static final String BASIC_URL = "https://chmielna20.pl";
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,30);
        driver.manage().window().maximize();
    }

	/*@AfterClass
	public static void finish(){
		if(driver != null)
			driver.close();
	}
*/
}
