package org.example;

import junit.framework.Assert;
import org.openqa.selenium.By;

//LogInPage is child of Utils class
public class LoginPage extends Utils
{
    //    create method to verify user should log in successfully
    public void verifyUserShouldBeLogInSuccessfully()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("login"));
        /*locator-by xpath to find title on the page*/
        waitForClickable(By.xpath("//div[@class = 'page-title']/h1"), 10);
    }

    //    create method to enter log in details
    public void logInDetails()
    {
        /*locator - by xpath to find email field and type email*/
        typeText(By.xpath("//input[@class ='email']"), email);
        System.out.println(email);

        /*locator - by xpath to find password field and type password*/
        typeText(By.xpath("//input[@class='password']"),password);

        /*locator-by xpath to find log in button and click on it*/
        clickOnElement(By.xpath("//button[contains(@class,'login-button')]"));
    }
}
