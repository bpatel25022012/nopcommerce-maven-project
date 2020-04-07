package com.demo.nopcommerce.testsuit;

import com.demo.nopcommerce.pages.ComputerPage;
import com.demo.nopcommerce.pages.DeskTopPage;
import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
Created By Bhavesh
*/
public class ComputerPageTest extends TestBase {

    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    DeskTopPage deskTopPage = new DeskTopPage();

    @Test

    public void userShouldNavigateToComputersPage(){

        homePage.clickOnComputersLink();
        String expectedText = "Computers";
        String actualText = computerPage.computerPageText();
        Assert.assertEquals(expectedText,actualText);
    }
@Test
    public void userShouldNavigateToDeskTopPage(){
        homePage.clickOnComputersLink();
        computerPage.clickOnDeskTops();
        String expectedText = "Desktops";
        String actualText = deskTopPage.DeskTopPageText();
        Assert.assertEquals(expectedText,actualText);
    }
}


