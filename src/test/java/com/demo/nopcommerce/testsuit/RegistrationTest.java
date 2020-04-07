package com.demo.nopcommerce.testsuit;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.RegistrationPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
Created By Bhavesh
*/public class RegistrationTest extends TestBase {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();

    @Test

    public void userShouldNavigateToRegistrationPage(){
        homePage.clickOnRegisterLink();
        String expectedText = "Your Personal Details";
        String actualText = registrationPage.personalDetailsMsg();
        Assert.assertEquals(expectedText,actualText);
    }
@Test
    public void userShouldRegisterSuccessFully(){
        homePage.clickOnRegisterLink();
        registrationPage.clickOnGenderButton();
        registrationPage.enterFirstName();
        registrationPage.enterLastName();
        registrationPage.enterDateOfBirth();
        registrationPage.enterMonthOfBirth();
        registrationPage.enterYearOfBirth();
        registrationPage.enterEmailId();
        registrationPage.enterCompanyName();
        registrationPage.enterPassword();
        registrationPage.enterConfirmPassword();
        registrationPage.clickOnRegistrationBtn();

        String expectedText = "Your registration completed";
        String acctualText = registrationPage.getRegistrationText();
        Assert.assertEquals(expectedText,acctualText);

}

}
