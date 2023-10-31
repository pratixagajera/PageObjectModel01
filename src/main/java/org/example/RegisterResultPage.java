package org.example;

import junit.framework.Assert;
import org.openqa.selenium.By;

//RegisterResultPage is child of Utils class
public class RegisterResultPage extends Utils
{
//    create method to verify user is registered successfully
    public void verifyUserRegisteredSuccessfully()
    {
        /*gettext used to print message*/
        String registrationMessage = getTextFromElement(By.className("result"));
        System.out.println(registrationMessage);

    }

//    create method to open login page
    public void toOpenLoginPage()
    {
        /*clickOnElement use to find locator for log in button*/
        clickOnElement(By.className("ico-login"));
    }
}
