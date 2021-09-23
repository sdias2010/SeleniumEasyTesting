package com.seleniumeasy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SimpleFormDemoPage extends BasePage{

    By txt_usermessage = By.xpath("//input[@id='user-message']");
    By btn_showmessage = By.xpath("//button[contains(text(),'Show Message')]");
    By txt_displaymessage = By.xpath("//span[@id='display']");

    By txt_sum1 = By.xpath("//input[@id='sum1']");
    By txt_sum2 = By.xpath("//input[@id='sum2']");
    By btn_gettotal = By.xpath("//button[contains(text(),'Get Total')]");
    By txt_total = By.cssSelector("#displayvalue");

    public SimpleFormDemoPage(WebDriver driver){
        this.driver=driver;
    }

    public void enterUserMessage(String _userMessage){
        sendKeys(txt_usermessage, _userMessage);
    }

    public void clickShowMessage(){
        click(btn_showmessage);
    }

    public String getDisplayMessage(){
        String displayMessage = getKeys(txt_displaymessage);
        return displayMessage;
    }

    public void entervaluefora(String _valueA){
        sendKeys(txt_sum1, _valueA);
    }

    public void entervalueforb(String _valueB){
        sendKeys(txt_sum2, _valueB);
    }

    public void clickGetTotal(){
        click(btn_gettotal);
    }

    public String getTotalValue(){
        String getTotal = getKeys(txt_total);
        return getTotal;
    }

}
