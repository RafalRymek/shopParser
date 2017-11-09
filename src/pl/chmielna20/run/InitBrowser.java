package pl.chmielna20.run;

import cucumber.api.java8.En;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pl.chmielna20.Main;

public class InitBrowser implements En {

    public InitBrowser() {
        Given("Open the Browser", () -> {
            if (Main.driver == null) {
                System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
                Main.driver = new ChromeDriver();
                Main.driver.manage().window().maximize();
            }
            if(Main.wait == null){
                Main.wait = new WebDriverWait(Main.driver,30);
            }
            Assert.assertTrue(Main.driver != null);
            Assert.assertTrue(Main.wait != null);
        });
    }
}
