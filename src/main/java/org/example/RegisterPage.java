package org.example;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends Utils
{

    public void verifyUserIsOnRegisterPage()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("register"));
    }
    public void enterRegistrationDetails()
    {
        waitForClickable(By.name("register-button"), 10);/*wait for clickable method called*/

        /*locator - by id to find gender section and choose one option*/
        clickOnElement(By.id("gender-male"));

        /*locator - by name to find firstanme field and type user detail*/
        typeText(By.name("FirstName"), "Rahul");

        /*locator - by name to find lastname field and type user detail*/
        typeText(By.name("LastName"), "Patel");

        /*locator - by id to find email field and type user detail*/
        typeText(By.id("Email"), email);
        System.out.println(email);


        /*method for selecting date of birth*/
        Select selectDay = new Select(driver.findElement(By.name("DateOfBirthDay")));
        selectDay.selectByVisibleText("10");

        /*method for selecting month */
        Select selectMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        selectMonth.selectByIndex(7);

        /*method for selecting year */
        Select selectYear = new Select(driver.findElement(By.name("DateOfBirthYear")));
        selectYear.selectByValue("1915");

        /*locator - by id to find company field and type user detail*/
        typeText(By.id("Company"), "Zenith");

        /*locator - by name to find password field and type password*/
        System.out.println(password);
        typeText(By.name("Password"), password);

        /*locator - by id to find confirm password field and type confirm password*/
        System.out.println(password);
        typeText(By.id("ConfirmPassword"), password);

        /*locator - by name to find register button and click on it*/
        clickOnElement(By.name("register-button"));
    }

}
