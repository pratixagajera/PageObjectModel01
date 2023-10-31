package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;

//Utils is child of BasePage class
//create class to make reusable methods
public class Utils extends BasePage
{
//    create method for timestamp to create email by locator
    public static String timeStamp()
    {
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        return timeStamp;
    }

//    create method to click on element by locator
    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }

//    create method to type text by locator
    public static void typeText(By by, String text){
        driver.findElement(by).sendKeys(text);
    }

//    create method to get text from element by locator
    public static String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }

//    declare global variable for email
    static String email = "rahulpatel1676" + timeStamp() + "@gmail.com";

//    declare global variable for password
    static String password = "rpatel@1278";

//    create method to find url by locator
    public static void urlToBe(String url, int timeDuration)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeDuration));
        wait.until(ExpectedConditions.urlToBe(url));
    }

    /*method created for wait for clickable*/
    public static void waitForClickable(By by, int time)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    /*method created for wait for disappear*/
    public static void waitForDisappear(By by, int timeout)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.invisibilityOf((WebElement) by));
    }


}
