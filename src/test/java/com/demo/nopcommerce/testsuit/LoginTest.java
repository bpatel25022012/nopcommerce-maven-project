package com.demo.nopcommerce.testsuit;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
Created By Bhavesh
*/
public class LoginTest extends TestBase {

   HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test

    public void verifyUserShouldNavigateToLoginPage(){
        homePage.clickOnLoginLink();
        String expectedText = "Welcome, Please Sign In!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(expectedText, actualText);

    }
    @Test

    public void verifyUserShouldLoginSuccessfully(){
          homePage.clickOnLoginLink();
          loginPage.waitUntilVisibility();
          loginPage.setEmailField();
          loginPage.setPasswordField();
          loginPage.setClickOnLoginButton();
          String expectedText = "Welcome to our store";
          String actualText = loginPage.getLoginPageText();
          Assert.assertEquals(expectedText,actualText);
    }
}
