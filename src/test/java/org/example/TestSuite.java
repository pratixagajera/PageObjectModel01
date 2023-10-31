package org.example;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest
{
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    LoginPage loginPage = new LoginPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();


    @Test
    public void verifyUserShouldAbleToRegisterSuccessfully()
    {
//        click on register button
        homePage.clickOnRegisterButton();
//        verify user is on register page
        registerPage.verifyUserIsOnRegisterPage();
//        enter registration detail
        registerPage.enterRegistrationDetails();
//        verify user registered successfully
        registerResultPage.verifyUserRegisteredSuccessfully();

    }

    @Test
    public void verifyUserShouldBeLogInSuccessFully()
    {
        homePage.clickOnLoInButton();
        loginPage.logInDetails();
    }

   @Test
    public void verifyUserShouldReferProductToFried()
    {
        homePage.clickOnLoInButton();
        loginPage.logInDetails();
        homePage.clickOnElectronicsButton();
        electronicsPage.verifyUserShouldBeOnElectronicsPage();
        electronicsPage.verifyRegisteredUserShouldBeAbleToReferAProductToAFriend();
    }
}
