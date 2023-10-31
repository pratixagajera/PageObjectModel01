package org.example;

import junit.framework.Assert;
import org.openqa.selenium.By;

//Electronics is a child of Utils class
public class ElectronicsPage extends Utils
{

    //    create method to verify user is on electronics page
    public void verifyUserShouldBeOnElectronicsPage()
    {
        urlToBe("https://demo.nopcommerce.com/electronics", 10);
    }


    //    create method to verify user should refer product to friend
    public void verifyRegisteredUserShouldBeAbleToReferAProductToAFriend()
    {
        /*locator-by xpath to find electronics button and click on it*/
        clickOnElement(By.xpath("//div[@class = 'header-menu']/ul[contains(@class,'notmobile')]/li/a[@href='/electronics']"));

        /*locator-by link text to find camera & photo option from drop down and click on it*/
        clickOnElement(By.linkText("Camera & photo"));

        /*locator-by link text to find product name and click on it*/
        clickOnElement(By.linkText("Leica T Mirrorless Digital Camera"));

        /*locator-by xpath to find email a friend button to refer it and click on it*/
        clickOnElement(By.xpath("//button[contains(@class, 'email-a-friend')]"));

        /*locator-by xpath to find send email button*/
        waitForClickable(By.xpath("//button[@name = 'send-email']"), 10);

        /*locator-by classname to find friend email field and type email */
        typeText(By.className("friend-email"), "priyasharma@gmail.com");

        /*locator-by xpath to find personal message field and type it*/
        typeText(By.xpath("//textarea[@id ='PersonalMessage']"), "This is very good product");

        /*locator-by xpath to find send email button and click on it*/
        clickOnElement(By.xpath("//button[@name = 'send-email']"));

        /*get text from element use to capture message for successful message send*/
        String successfulMessageSend = getTextFromElement(By.className("result"));
        System.out.println(successfulMessageSend);

        /*test the test case to get result for send message to a friend for refer a product*/
//        Assert.assertEquals(getTextFromElement(By.className("result")), "Your message has been sent.", "Message is not send successfully.");
    }
}
