package com.github.panarik.seleniumTests.selenium.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static com.github.panarik.seleniumTests.selenium.controller.BaseTest.controller;

public class AvitoPage {

    public String URL = "https://www.avito.ru";

    /**
     * choose category: 'Transport'.
     */
    public void goToTransport() {
        controller.get().getDriver().findElement(By.xpath("//select[@id='category']")).click();
        controller.get().getDriver().findElement(By.xpath("//select[@id='category']//option[text()='Транспорт']")).click();
    }
}
