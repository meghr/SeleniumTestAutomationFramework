package org.meghraj.pages;

import org.meghraj.driver.DriverManager;
import org.openqa.selenium.By;
import org.w3c.dom.Text;

public final class OragneHRMLoginPage {

    private final By textBox_userName = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
    private final By textBox_password = By.xpath("//input[@class='oxd-input oxd-input--active' and @type='password']");

    private final By button_login = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");

    public OragneHRMLoginPage enterUserName(String username) {
        DriverManager.getDriver().findElement(textBox_userName).sendKeys(username);
        return this;
    }

    public OragneHRMLoginPage enterPassword(String password) {
        DriverManager.getDriver().findElement(textBox_password).sendKeys(password);
        return this;
    }

    public OragneHRMHomePage clickLogin() {
        DriverManager.getDriver().findElement(button_login).click();
        return new OragneHRMHomePage();
    }

}
