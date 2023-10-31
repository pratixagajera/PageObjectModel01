package org.example;

import junit.framework.Assert;
import org.openqa.selenium.By;

public class LoginPage extends Utils
{

    public void verifyUserShouldBeLogInSuccessfully()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("login"));
        /*locator-by xpath to find title on the page*/
        waitForClickable(By.xpath("//div[@class = 'page-title']/h1"), 10);
    }
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
