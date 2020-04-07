package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

/*
Created By Bhavesh
*/
public class LoginPage extends Utility {

    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginBtn = By.xpath("//input[@class='button-1 login-button']");
    By welcomeText = By.xpath("//div[@class='page-title']//h1");
    By loginPageText = By.xpath("//h2[contains(text(),'Welcome to our store')]");

    public void waitUntilVisibility(){
        waitUntilPresenceOfElementLocated(emailField,20);
    }

    public void setEmailField(){

        sendTextToElement(emailField, "alpha1@gmail.com");
    }

    public void setPasswordField(){

        sendTextToElement(passwordField, "Tiger123");
    }

    public void setClickOnLoginButton(){

        clickonElement(loginBtn);
    }

    public String getWelcomeText(){

        return getTextFromElement(welcomeText);

    }
    public String getLoginPageText(){

        return getTextFromElement(loginPageText);
    }

}
