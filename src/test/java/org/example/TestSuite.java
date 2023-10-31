package org.example;

import org.testng.annotations.Test;

//TestSuite is child of BaseTest class
//TestSuite class create to run the testcase
public class TestSuite extends BaseTest
{
//    create object for homepage
    HomePage homePage = new HomePage();
//    create object for register page
    RegisterPage registerPage = new RegisterPage();
//    create object for register result page
    RegisterResultPage registerResultPage = new RegisterResultPage();
//    create object for log in page
    LoginPage loginPage = new LoginPage();
//    create object for electronics page
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
//        click on log in button
        homePage.clickOnLoInButton();
//        enter log in detail
        loginPage.logInDetails();
    }

   @Test
    public void verifyUserShouldReferProductToFried()
    {
//        click on login button
        homePage.clickOnLoInButton();
//        enter log in detail
        loginPage.logInDetails();
//        click on electronics button on home page
        homePage.clickOnElectronicsButton();
//        verify for register page
        electronicsPage.verifyUserShouldBeOnElectronicsPage();
//        select a product and refer to a friend with message
        electronicsPage.verifyRegisteredUserShouldBeAbleToReferAProductToAFriend();
    }
}
