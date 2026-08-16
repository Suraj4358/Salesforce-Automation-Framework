package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyInvalidLogin() {

        driver.get("https://login.salesforce.com");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("test@example.com", "TestPassword123");

        Assert.assertTrue(
                loginPage.isLoginErrorDisplayed(),
                "Login error message was not displayed"
        );
    }
}
