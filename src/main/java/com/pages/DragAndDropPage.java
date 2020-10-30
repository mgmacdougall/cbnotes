package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage extends PageObject{

    public DragAndDropPage(WebDriver driver){
        super(driver);
    }

    public void dragTo(){
        WebElement from = driver.findElement(By.id("draggable1"));
        WebElement to = driver.findElement(By.id("draggable2"));
        Actions action = new Actions(driver);
        action.dragAndDrop(from, to).build().perform();
    }

    public void dragToXAndY( int x, int y){
        WebElement from = driver.findElement(By.id("draggable1"));
        Actions action = new Actions(driver);
        action.dragAndDropBy(from, x, y).build().perform();
    }
}
