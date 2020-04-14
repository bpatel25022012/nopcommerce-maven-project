package com.demo.nopcommerce.testsuit;

import com.demo.nopcommerce.loadproperty.LoadProperty;
import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.RegistrationPage;
import com.demo.nopcommerce.testbase.TestBase;
import com.demo.nopcommerce.utility.Utility;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.demo.nopcommerce.utility.Utility.getRandomString;

/*
Created By Bhavesh
*/

public class RegistrationTest extends TestBase {
    String email = null;
    String email1 = null;
    String password = null;
    String fname = "Bhavesh";
    String lname = "Patel";
    String date = "4";
    String month = "April";
    String year = "1986";
    String compname = "Best In Testing Ltd.";


    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();

    @BeforeTest(groups = {"sanity","smoke","regression"})

    public void setup(){
        email= "Rocky"+ getRandomString(5)+"@gmail.com";
        email1= "Ricky"+getRandomString(4)+"@hotmail.com";
        password = "Rocky"+getRandomString(3);

    }

    @Test (priority = 0,groups = {"sanity"})

    public void userShouldNavigateToRegistrationPage(){
        homePage.clickOnRegisterLink();
        String expectedText = "Your Personal Details";
        String actualText = registrationPage.personalDetailsMsg();
        Assert.assertEquals(expectedText,actualText);
    }
@Test (priority = 1, groups = {"smoke"})
    public void userShouldRegisterSuccessFully(){
        homePage.clickOnRegisterLink();
        registrationPage.clickOnGenderButton();
        registrationPage.enterFirstName(fname);
        registrationPage.enterLastName(lname);
        registrationPage.enterDateOfBirth(date);
        registrationPage.enterMonthOfBirth(month);
        registrationPage.enterYearOfBirth(year);
        registrationPage.enterEmailId(email);
        registrationPage.enterCompanyName(compname);
        registrationPage.enterPassword(password);
        registrationPage.enterConfirmPassword(password);
        registrationPage.clickOnRegistrationBtn();

        String expectedText = "Your registration completed";
        String actualText = registrationPage.getRegistrationText();
        Assert.assertEquals(expectedText,actualText);

}
    @Test (priority = 2,groups = {"regression"})

    public void verifySuccessfullRegistrationPageMessage(){
        homePage.clickOnRegisterLink();
        registrationPage.clickOnGenderButton();
        registrationPage.enterFirstName(fname);
        registrationPage.enterLastName(lname);
        registrationPage.enterDateOfBirth(date);
        registrationPage.enterMonthOfBirth(month);
        registrationPage.enterYearOfBirth(year);
        registrationPage.enterEmailId(email1);
        registrationPage.enterCompanyName(compname);
        registrationPage.enterPassword(password);
        registrationPage.enterConfirmPassword(password);
        registrationPage.clickOnRegistrationBtn();

        String expectedText = "Your registration completed in our store";
        String actualText = registrationPage.getRegistrationText();
        Assert.assertEquals(expectedText,actualText);

    }


}
