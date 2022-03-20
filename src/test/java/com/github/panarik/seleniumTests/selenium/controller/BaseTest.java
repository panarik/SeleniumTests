package com.github.panarik.seleniumTests.selenium.controller;

import com.github.panarik.seleniumTests.selenium.model.AvitoPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {

    public static ThreadLocal<Controller> controller; // Controller with drivers.
    public AvitoPage avito; // Model. (pages)

    @BeforeTest
    public void setup() {
        System.out.println("Setup driver.");
        controller.get().setupDriver(); //Setup driver
        avito = new AvitoPage(); // Setup pages.
    }

    /**
     * Configure examples.
     */
    private void config() {
        //Waiters
        controller.get().getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Wait for WebElement
        controller.get().getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4)); // Wait for loading page
        controller.get().getDriver().manage().timeouts().scriptTimeout(Duration.ofSeconds(2)); // Wait for an asynchronous script
    }

    @AfterTest
    public void shutdown() {
        System.out.println("Shutdown driver.");
        controller.get().getDriver().quit();
    }
}
