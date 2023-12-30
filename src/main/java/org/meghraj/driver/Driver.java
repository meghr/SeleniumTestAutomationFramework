package org.meghraj.driver;

import org.meghraj.constants.FrameworkConstant;
import org.meghraj.utils.ReadPropertyFile;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Objects;

public final class Driver {

    private Driver() {

    }


    public static void initDriver() throws Exception {

        // this check will make sure that at anypoint of time we have only single object of webDriver
        if (Objects.isNull(DriverManager.getDriver())) {
            System.setProperty("webdriver.gecko.driver", FrameworkConstant.getFirefoxDriverPath());

            DriverManager.setDriver(new FirefoxDriver());
            DriverManager.getDriver().get(ReadPropertyFile.get("url"));
        }
    }

    public static void quitDriver() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
