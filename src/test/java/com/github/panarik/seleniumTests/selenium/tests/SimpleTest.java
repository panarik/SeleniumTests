package com.github.panarik.seleniumTests.selenium.tests;

import com.github.panarik.seleniumTests.selenium.controller.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static com.github.panarik.seleniumTests.locators.LocatorCSS.*;

public class SimpleTest extends BaseTest {

    @BeforeMethod
    public void init() {
        controller.get("https://www.google.com");
    }

    @Test
    public void test1() {
        WebElement input = controller.findElement(By.name("q"));
        input.sendKeys("selenium");
        input.sendKeys(Keys.ENTER);

        //ToDo: ??
//        WebElement resultNumberSix = driver.findElement(By.xpath(TAG_CLASS_NUMBER));
        WebElement body = controller.findElement(By.cssSelector(TAG_BODY)); //по тегу
        List<WebElement> role = controller.findElements(By.cssSelector(ATTRIBUTE)); //список по параметру
        WebElement className = controller.findElement(By.className("className"));
        WebElement id = controller.findElement(By.id("id"));
        WebElement linkText = controller.findElement(By.linkText("linkText")); //exact text
        WebElement name = controller.findElement(By.name("linkText")); //attribute name
        WebElement tagName = controller.findElement(By.tagName("tagName")); //attribute tagName



        Assert.assertTrue(input.isDisplayed());
        Assert.assertTrue(body.isDisplayed());
    }
}
