package com.github.panarik.seleniumTests.selenium.tests.base;

import com.github.panarik.seleniumTests.selenium.controller.Controller;
import com.github.panarik.seleniumTests.selenium.model.AvitoPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import static com.github.panarik.seleniumTests.selenium.controller.Controller.getDriver;

public class BaseTest {

    public AvitoPage avito; // Model. (pages)

    @BeforeTest
    public void setup() {
        System.out.println("Setup driver.");
        Controller.setupDriver(); //Setup driver
        avito = new AvitoPage(); // Setup pages.
    }

    /**
     * Configure examples.
     */
    private void config() {
        //Waiters
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Wait for WebElement
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4)); // Wait for loading page
        getDriver().manage().timeouts().scriptTimeout(Duration.ofSeconds(2)); // Wait for an asynchronous script
    }

    @AfterTest
    public void shutdown() {
        System.out.println("Shutdown driver.");
        getDriver().quit();
    }

}
