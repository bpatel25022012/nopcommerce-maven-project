package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

/*
Created By Bhavesh
*/
public class RegistrationPage extends Utility {

    By personalDetailsText = By.xpath("//strong[contains(text(),'Your Personal Details')]");
    By genderRadioBtn = By.xpath("//span[@class=\"male\"]//input[@type='radio']");
    By firstNameField = By.xpath("//input[@id=\"FirstName\"]");
    By lastNameField = By.xpath("//input[@id=\"LastName\"]");
    By dateOfBirthDay = By.xpath("//select[@name=\"DateOfBirthDay\"]");
    By dateOfBirthMonth = By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    By dateOfBirthYear = By.xpath("//select[@name=\"DateOfBirthYear\"]");
    By emailField = By.xpath("//input[@id=\"Email\"]");
    By companyNameFiled = By.xpath("//input[@id=\"Company\"]");
    By passwordFiled = By.xpath("//input[@id=\"Password\"]");
    By conPasswordFiled = By.xpath("//input[@id=\"ConfirmPassword\"]");
    By registerBtn = By.xpath("//input[@id=\"register-button\"]");
    By registrationMessage = By.xpath("//div[@class=\"result\"]");

    public String personalDetailsMsg(){
        return getTextFromElement(personalDetailsText);

    }
    public void clickOnGenderButton(){

        clickonElement(genderRadioBtn);
    }
    public void enterFirstName(String fname){

        sendTextToElement(firstNameField,fname);
    }
    public void enterLastName(String lname){

        sendTextToElement(lastNameField,lname);

    }
    public void enterDateOfBirth (String date){

        sendTextToElement(dateOfBirthDay,date);

    }
    public void enterMonthOfBirth (String month){

        sendTextToElement(dateOfBirthMonth,month);
    }
    public void enterYearOfBirth (String year){

        sendTextToElement(dateOfBirthYear,year);
    }
    public void enterEmailId(String Email){
        sendTextToElement(emailField,Email);


    }
    public void enterCompanyName(String compname){

        sendTextToElement(companyNameFiled,compname);
    }
    public void enterPassword (String password){
      sendTextToElement(passwordFiled, password);

    }
    public void enterConfirmPassword (String conPassword){

      sendTextToElement(conPasswordFiled,conPassword);



    }
    public void clickOnRegistrationBtn(){

        clickonElement(registerBtn);
    }
    public String getRegistrationText(){

        return getTextFromElement(registrationMessage);
    }
}
