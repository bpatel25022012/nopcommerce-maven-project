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
    public void enterFirstName(){

        sendTextToElement(firstNameField,"Bhavesh");
    }
    public void enterLastName(){

        sendTextToElement(lastNameField,"Patel");

    }
    public void enterDateOfBirth (){

        sendTextToElement(dateOfBirthDay,"4");

    }
    public void enterMonthOfBirth (){

        sendTextToElement(dateOfBirthMonth,"April");
    }
    public void enterYearOfBirth (){

        sendTextToElement(dateOfBirthYear,"1976");
    }
    public void enterEmailId(){
        sendRandomEmail(emailField);


    }
    public void enterCompanyName(){

        sendTextToElement(companyNameFiled,"BestInTesting Ltd.");
    }
    public void enterPassword (){
        sendRandomPassword(passwordFiled);

    }
    public void enterConfirmPassword (){

        sendRandomPasswordToNextField(conPasswordFiled);



    }
    public void clickOnRegistrationBtn(){

        clickonElement(registerBtn);
    }
    public String getRegistrationText(){

        return getTextFromElement(registrationMessage);
    }
}
