package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// HTML5 form example, containing many objects that are not testable with the ui.
public class FormsPage extends PageObject{

    public FormsPage(WebDriver driver){
        super(driver);
    }

    public void setColourValue(String color){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.document.getElementById(\"colour-picker\").value=\"#"+color+"\"");
    }

    public void setDateValue(String date){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.document.getElementById(\"date-picker\").value=\""+date+"\"");
    }

    public String getColorValue(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js.executeScript("return window.document.getElementById(\"colour-picker\").value").toString();
    }

    public void submitForm(){
        WebElement submitButton = driver.findElement(By.cssSelector("[type=\"submit\"]"));
        submitButton.click();
    }

    public String getResultingColorValue(){
        return driver.findElement(By.id("_valuecolour")).getText();
    }
}
