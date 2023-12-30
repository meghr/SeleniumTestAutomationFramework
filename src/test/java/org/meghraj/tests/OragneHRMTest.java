package org.meghraj.tests;

import org.meghraj.pages.OragneHRMHomePage;
import org.meghraj.pages.OragneHRMLoginPage;
import org.testng.annotations.Test;

public final class OragneHRMTest extends BaseTest {

    private OragneHRMTest() {

    }

    @Test
    public void loingLogoutTest() {

        OragneHRMLoginPage oragneHRMLoginPage = new OragneHRMLoginPage();

        oragneHRMLoginPage.enterUserName("Admin")
                .enterPassword("admin123")
                .clickLogin();

        OragneHRMHomePage oragneHRMHomePage = new OragneHRMHomePage();

        oragneHRMHomePage.clickUserProfile()
                .clickLogout();
    }

}
