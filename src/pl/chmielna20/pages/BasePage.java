package pl.chmielna20.pages;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    private String URL;
    protected WebDriver driver;

    public BasePage(String URL, WebDriver driver) {
        this.URL = URL;
        this.driver = driver;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String uRL) {
        URL = uRL;
    }

}
