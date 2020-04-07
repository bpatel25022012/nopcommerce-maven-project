package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

/*
Created By Bhavesh
*/public class DeskTopPage extends Utility {

    By deskTopText = By.xpath("//h1[contains(text(),'Desktops')]");
    By deskTops = By.xpath("//li[@class='active last']//a[contains(text(),'Desktops')]");

    public String DeskTopPageText(){
        return getTextFromElement(deskTopText);
    }
    public void clickOnDeskTopLink(){
        clickonElement(deskTops);
    }
}

