package org.meghraj.driver;

import org.meghraj.constants.FrameworkConstant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Objects;

public final class Driver {

    private Driver() {

    }

    /*
    This is a class-level variable that holds a WebDriver instance. However, it is not thread-safe.
    In a multi-threaded environment, if multiple threads try to access or modify this variable simultaneously,
    it could lead to unexpected behavior and potential issues.
    */
    private static WebDriver webDriver;


    public static void initDriver() {

        // this check will make sure that at anypoint of time we have only single object of webDriver
        if (Objects.isNull(DriverManager.getDriver())) {
            System.setProperty("webdriver.gecko.driver", FrameworkConstant.getFirefoxDriverPath());
            webDriver = new FirefoxDriver();
            DriverManager.setDriver(webDriver);
            DriverManager.getDriver().get("https://google.com");
        }
    }

    public static void quitDriver() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
