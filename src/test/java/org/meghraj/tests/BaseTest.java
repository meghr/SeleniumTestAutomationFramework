package org.meghraj.tests;

import org.meghraj.constants.FrameworkConstant;
import org.meghraj.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected BaseTest() {

    }


    @BeforeMethod
    public void setUp() {

        Driver.initDriver();
    }

    @AfterMethod
    public void tearDown() {
        Driver.quitDriver();
    }
}
