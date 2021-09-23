package com.seleniumeasy.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    String SIMPLE_FORM_DEMO_URL = "https://www.seleniumeasy.com/test/basic-first-form-demo.html";

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public void navigatetoSimpleFormDemo(){
        driver.get(SIMPLE_FORM_DEMO_URL);
    }
}
