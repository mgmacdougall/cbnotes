package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    static WebDriver driver = null;
     public  WebDriver getDriver(String driverName){
         if(driverName.equals("chrome")){
             System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
             driver = new ChromeDriver();
             ChromeOptions options = new ChromeOptions();
             options.addArguments("start-maximized");
             driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         }
         return driver;
     }
}
