package com.test.blaze.pages;

import Utils.BrowsersUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BlazeMainPage {



    public BlazeMainPage(WebDriver driver){
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//a[@id='itemc']")
    List<WebElement> categories;
    @FindBy(xpath = "//a[contains(text(),'Cart')]")
    WebElement cartButton;




    public void mainPageFunctionality(String option){
        for(WebElement category:categories){
            if(BrowsersUtils.getText(category).equals(option)){
                category.click();break;
            }
        }
    }
    public void cartButtonClick(){
        cartButton.click();
    }

}
