package chapter4.login;

import chapter4.base.BaseTests;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;


public class LoginTests extends BaseTests {

    @org.testng.annotations.Test
    public void testSuccessfullLogin() {
       LoginPage loginPage =  homePage.clickFormAuthentication();
       loginPage.setUsername("tomsmith");
       loginPage.setPassword("SuperSecretPassword!");
       SecureAreaPage secureAreaPage = loginPage.clickLoginButton();

       secureAreaPage.getAlertText();
       assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),
               "Alert text is incorrect");
    }
}
