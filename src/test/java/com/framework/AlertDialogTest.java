package com.framework;

import com.pages.AlertPage;
import org.junit.jupiter.api.Test;

public class AlertDialogTest extends BaseTest {

    @Test
    public void dismissBasicAlert(){
        driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
        AlertPage aPage = new AlertPage(driver);
        aPage.dismissAlert();
    }


    @Test
    public void dismissConfirmationBox(){
        driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
        AlertPage aPage = new AlertPage(driver);
        aPage.dismissConfirmDialog();

    }
    @Test
    public void dismissPromptWithText(){
        driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
        AlertPage aPage = new AlertPage(driver);
        aPage.dismissPromptDialog("this is some text");
    }

}
