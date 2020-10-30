package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage extends PageObject{
    // Constants for page model
    String userNameLocator = "p-nickname";
    public String HTTPS_GITHUB_COM = "https://github.com/";

    public OverviewPage(WebDriver driver){
        super(driver);
    }

    public String userName(String userName){
        driver.get(HTTPS_GITHUB_COM + userName);
        String result =  driver.findElement(By.className("p-nickname")).getText();
        return result;
    }


}
