package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest extends BrowserManager
{
    @BeforeMethod
    public void setUp()
    {
        openBrowser();
    }

    @AfterMethod
    public void tearDown()
    {
        closeBrowser();
    }
}
