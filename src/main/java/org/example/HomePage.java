package org.example;

import org.openqa.selenium.By;

//HomePage is child of utils class
public class HomePage extends Utils
{

    //    create method to click on register button
    public void clickOnRegisterButton()
    {
        clickOnElement(By.linkText("Register"));
    }

    //    create method to click on log in button
    public  void clickOnLoInButton()
    {
        clickOnElement(By.linkText("Log in"));
    }

    //    create method to click on electronics button
    public void clickOnElectronicsButton()
    {
        clickOnElement(By.linkText("Electronics"));
    }
}
