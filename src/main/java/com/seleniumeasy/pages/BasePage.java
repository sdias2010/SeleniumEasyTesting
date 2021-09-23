package com.seleniumeasy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    WebDriver driver;

    public void click(By byObject){
        driver.findElement(byObject).click();
    }

    public void sendKeys(By byObject, String data){
        driver.findElement(byObject).sendKeys(data);
    }

    public String getKeys(By byObject){
        return driver.findElement(byObject).getText();
    }
}
