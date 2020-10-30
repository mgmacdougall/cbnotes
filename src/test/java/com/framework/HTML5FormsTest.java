package com.framework;

import com.pages.FormsPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Example of how to test a HTML5 page using js calls
public class HTML5FormsTest extends BaseTest {

    @Test
    public void testOfFormEntry() throws InterruptedException {
        driver.get("https://testpages.herokuapp.com/styled/html5-form-test.html");
        FormsPage fp = new FormsPage(driver);
        fp.setColourValue("FF0000");
        fp.setDateValue("2020-03-22");
        fp.submitForm();
        String colorSet = fp.getResultingColorValue();
        assertEquals(colorSet, "#ff0000");
    }
}
