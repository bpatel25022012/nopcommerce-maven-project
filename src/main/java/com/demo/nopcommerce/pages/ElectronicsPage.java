package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

/*
Created By Bhavesh
*/
public class ElectronicsPage extends Utility {

    By cameraAndPhoto = By.xpath("//h2[@class='title']//a[contains(text(),'Camera & photo')]");
    By cellPhones = By.xpath("//h2[@class='title']//a[contains(text(),'Cell phones')]");
    By others = By.xpath("//h2[@class='title']//a[contains(text(),'Others')]");

    public void clickOnCameraAndPhoto(){

        clickonElement(cameraAndPhoto);
    }
    public void clickOnCellPhones(){

        clickonElement(cellPhones);
    }
    public void clickOnOthers(){

        clickonElement(others);
    }
}
