package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GithubProjectPage extends PageObject {

    public GithubProjectPage(WebDriver driver){
        super(driver);
    }

    public void openGitHubProject(String projectName, String url){
        driver.get(url + projectName);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("[title='a_random_quote_generator-v1']")).click();
    }

    public int countOfProjects(String url){
        driver.get(url);
        List<WebElement> items = driver.findElements(By.cssSelector(".flex-content-stretch"));
        return items.size();
    }

}
