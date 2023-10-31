package org.example;

import junit.framework.Assert;
import org.openqa.selenium.By;

public class RegisterResultPage extends Utils
{
    public void verifyUserRegisteredSuccessfully()
    {
        /*gettext used to print message*/
        String registrationMessage = getTextFromElement(By.className("result"));
        System.out.println(registrationMessage);

    }

    public void toOpenLoginPage()
    {
        /*clickOnElement use to find locator for log in button*/
        clickOnElement(By.className("ico-login"));
    }
}
