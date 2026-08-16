package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifySalesforceLoginPage() {

        driver.get("https://login.salesforce.com");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("test@example.com");
        loginPage.enterPassword("TestPassword123");
        loginPage.clickLogin();
    }
}
