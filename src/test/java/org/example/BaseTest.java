package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//BaseTest is child of browserManager class
public class BaseTest extends BrowserManager
{
//    before method to open browser
    @BeforeMethod
    public void setUp()
    {
        openBrowser();
    }

//    after method to close browser
    @AfterMethod
    public void tearDown()
    {
        closeBrowser();
    }
}
