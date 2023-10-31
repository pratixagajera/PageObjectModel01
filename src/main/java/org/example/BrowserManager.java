package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//BrowserManager is child of Utils class
public class BrowserManager extends Utils
{

    //    create method to open browser
    public void openBrowser()
    {
        System.setProperty(
                "webdriver.chrome.driver",
                "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().fullscreen();
        driver.get("https://demo.nopcommerce.com/");
    }


    //    create method to close browser
    public void closeBrowser()
    {
        driver.quit();
    }
}
