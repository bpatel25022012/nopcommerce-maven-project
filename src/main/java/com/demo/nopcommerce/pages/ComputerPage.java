package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

/*
Created By Bhavesh
*/
public class ComputerPage extends Utility {

    By deskTops = By.xpath("//h2[@class='title']//a[contains(text(),'Desktops')]");
    By noteBooks = By.xpath("//h2[@class='title']//a[contains(text(),'Notebooks')]");
    By softWare =By.xpath("//h2[@class='title']//a[contains(text(),'Software')]");
    By computerPageText = By.xpath("//h1[contains(text(),'Computers')]");


    public void clickOnDeskTops(){
waitUntilPresenceOfElementLocated(deskTops,30);
        clickonElement(deskTops);
    }
    public void clickOnNoteBooks(){

        clickonElement(noteBooks);
    }
    public void clickOnSoftWare(){

        clickonElement(softWare);
    }
    public String computerPageText(){
        return getTextFromElement(computerPageText);
    }
}
