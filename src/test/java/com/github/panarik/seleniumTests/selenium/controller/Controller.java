package com.github.panarik.seleniumTests.selenium.controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Controller {

    private WebDriver driver; //driver for Selenium tests
    private WebDriverWait wait;

    public WebDriver getDriver() {
        return this.driver;
    }

    public WebDriverWait getWait() {
        return this.wait;
    }

    public void setupDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4));
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

}