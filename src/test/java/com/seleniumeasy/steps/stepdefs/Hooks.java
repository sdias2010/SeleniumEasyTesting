package com.seleniumeasy.steps.stepdefs;

import com.seleniumeasy.SeleniumDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver testDriver = null;

    @Before
    public void beforeTest(){
        //start the browser
        testDriver = new SeleniumDriverManager().getDriver();
        testDriver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        //closing the browser
        testDriver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        testDriver.quit();
    }
}
