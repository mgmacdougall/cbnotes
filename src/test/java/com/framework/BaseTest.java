package com.framework;

import com.utils.DriverFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    static WebDriver driver;

    @BeforeAll
    static void setUp() {
        driver = new DriverFactory().getDriver("chrome");
    }

    @AfterAll
    static  void tearDown(){
        driver.close();
    }

}
