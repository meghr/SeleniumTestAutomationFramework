package org.meghraj.pages;

import org.meghraj.driver.DriverManager;
import org.openqa.selenium.By;

public class OragneHRMHomePage {


    private final By userProfileMenu = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p");

    private final By logoutButton = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a");

    public OragneHRMHomePage clickUserProfile() {
        DriverManager.getDriver().findElement(userProfileMenu).click();
        return this;
    }

    public OragneHRMLoginPage clickLogout() {
        DriverManager.getDriver().findElement(logoutButton).click();
        return new OragneHRMLoginPage();
    }
}
