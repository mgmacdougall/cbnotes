package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPage extends PageObject{

    public AlertPage(WebDriver driver){
        super(driver);
    }

    public void dismissAlert(){
        WebElement element = driver.findElement(By.id("alertexamples"));
        element.click();
        driver.switchTo().alert().dismiss();
    }

    public void dismissConfirmDialog(){
        WebElement element = driver.findElement(By.id("confirmexample"));
        element.click();
        driver.switchTo().alert().accept();
    }

    public void dismissPromptDialog(String text){
        WebElement element = driver.findElement(By.id("promptexample"));
        element.click();
        if(text.length()>0){
            driver.switchTo().alert().sendKeys(text);
        }
        driver.switchTo().alert().accept();
    }
}
