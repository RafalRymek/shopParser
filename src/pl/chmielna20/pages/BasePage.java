package pl.chmielna20.pages;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    private String URL;
    private WebDriver webDriver;

    public BasePage(String URL, WebDriver driver) {
        this.URL = URL;
        this.webDriver = driver;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String uRL) {
        URL = uRL;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
