package com.demo.nopcommerce.testsuit;

import com.demo.nopcommerce.loadproperty.LoadProperty;
import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
Created By Bhavesh
*/
public class LoginTest extends TestBase {

    String email = null;
    String password = null;
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @BeforeTest(groups = {"sanity","smoke","regression"})

    public void setUP(){
        email = "alpha12@gmail.com";
        password = "Tiger123";
    }

    @Test (priority = 0,groups = {"sanity"})

    public void verifyUserShouldNavigateToLoginPage(){
        homePage.clickOnLoginLink();
        String expectedText = "Welcome, Please Sign In!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(expectedText, actualText);

    }
    @Test (priority = 1, groups = {"smoke"})

    public void verifyUserShouldLoginSuccessfully(){
          homePage.clickOnLoginLink();
          loginPage.waitUntilVisibility();
          loginPage.enterEmailField(email);
          loginPage.enterPasswordField(password);
          loginPage.setClickOnLoginButton();
          String expectedText = "Welcome to our store";
          String actualText = loginPage.getLoginPageText();
          Assert.assertEquals(expectedText,actualText);
    }
    @Test (priority = 2,groups = {"regression"})

    public void verifySuccessfullLoginPageMessage(){
        homePage.clickOnLoginLink();
        loginPage.waitUntilVisibility();
        loginPage.enterEmailField(email);
        loginPage.enterPasswordField(password);
        loginPage.setClickOnLoginButton();
        String expectedText = "Welcome to our store of UK";
        String actualText = loginPage.getLoginPageText();
        Assert.assertEquals(expectedText,actualText);
    }
}
