package com.github.panarik.appiumProject.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverBase {

    WebDriver setupDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4));
        return driver;
    }

}
