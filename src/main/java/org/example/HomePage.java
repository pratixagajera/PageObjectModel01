package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils
{
    public void clickOnRegisterButton()
    {
        clickOnElement(By.linkText("Register"));
    }

    public  void clickOnLoInButton()
    {
        clickOnElement(By.linkText("Log in"));
    }

    public void clickOnElectronicsButton()
    {
        clickOnElement(By.linkText("Electronics"));
    }
}
