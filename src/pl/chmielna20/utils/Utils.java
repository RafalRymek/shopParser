package pl.chmielna20.utils;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Date;

import static pl.chmielna20.Main.driver;

public class Utils {

    public static String generateEmail(){
        return "rymraf+".concat(String.valueOf(new Date().getTime())).concat("@gmail.com");
    }

    public static void typeToFiled(WebElement webElement, CharSequence charSequence){
        Assert.assertTrue(webElement.isDisplayed());
        webElement.sendKeys(charSequence);
    }

    public static void selectField(By by, int index){
        Assert.assertTrue(driver.findElement(by).isDisplayed());
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
        Assert.assertNotNull(select.getFirstSelectedOption());
    }

    public static void scrollToElement(By by){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(by));
    }
}
