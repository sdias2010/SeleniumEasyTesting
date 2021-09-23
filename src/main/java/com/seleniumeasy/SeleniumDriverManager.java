package com.seleniumeasy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDriverManager {

    String projectFolderPath = System.getProperty("user.dir");

    WebDriver driver = null;

    static final String browserType = "CHROME";

    public WebDriver getDriver(){
        if(driver == null){
            setupDriver();
        }
        return driver;
    }

    public void setupDriver(){
        switch (browserType){
            case "CHROME":
                driver = setupChromeDriver();
            case "FIREFOX":
               // driver = setupFirefoxDriver();
        }
    }

    private ChromeDriver setupChromeDriver(){

        String chromeDriverPath = projectFolderPath + "/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        return new ChromeDriver();
    }

    private FirefoxDriver setupFirefoxDriver(){

        String firefoxDriverPath = projectFolderPath + "drivers/geckodriver.exe";
        System.setProperty("webdriver.firefox.driver", firefoxDriverPath);
        return new FirefoxDriver();
    }
}
