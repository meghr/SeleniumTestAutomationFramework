package org.meghraj.tests;

import org.assertj.core.api.Assertions;
import org.meghraj.driver.Driver;
import org.meghraj.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

// we made this class final so that no one can extend it

public final class LoginpageTest extends BaseTest {

    LoginpageTest() {
        // we made this constructor  as private so that no one can create an instance of this class
    }

    @Test
    public void loginTest() {

        DriverManager.getDriver().findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user",Keys.ENTER);
        DriverManager.getDriver().findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce",Keys.ENTER);
        DriverManager.getDriver().findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        String acutalTile = DriverManager.getDriver().getTitle();


        Assertions.assertThat(acutalTile)
                .isEqualTo("Swag Labs")
                .as("Title is Null ").isNotNull();

    }
}
