package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

/*
Created By Bhavesh
*/
public class HomePage extends Utility {
    By loginLink = By.linkText("Log in");
    By registerLink = By.xpath("//a[@class='ico-register']");
    By wishListLink = By.xpath("//span[@class='wishlist-label']");
    By shoppingCartLink = By.xpath("//span[@class='cart-label']");
    By computersLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]");
    By electronicsLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]");
    By appraelLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel')]");
    By digitalDownloadsLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads')]");
    By booksLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]");
    By jewelryLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]");
    By giftCardLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards')]");

    public void clickOnLoginLink() {

        clickonElement(loginLink);
    }
    public void clickOnRegisterLink() {

        clickonElement(registerLink);
    }
    public void clickOnWishListLink(){

        clickonElement(wishListLink);
    }
    public void clickOnShoppingCartLink(){

        clickonElement(shoppingCartLink);
    }
    public void clickOnComputersLink(){

        clickonElement(computersLink);
    }
    public void clickOnElectronicsLink(){

        clickonElement(electronicsLink);
    }
    public void clickOnApparelLink(){

        clickonElement(appraelLink);
    }
    public void clickOnDigitalDownloadsLink(){

        clickonElement(digitalDownloadsLink);
    }
    public void clickOnBooksLink(){

        clickonElement(booksLink);
    }
    public void clickOnJewelryLink(){

        clickonElement(jewelryLink);
    }
    public void clickOnGiftCardLink(){

        clickonElement(giftCardLink);
    }
}

