package org.meghraj.tests;

import org.meghraj.driver.Driver;
import org.meghraj.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

// we made this class final so that no one can extend it

public final class LoginpageTest extends BaseTest {

    LoginpageTest() {
        // we made this constructor  as private so that no one can create an instance of this class
    }

    @Test
    public void loginTest() {

        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Automation", Keys.ENTER);

    }
}
