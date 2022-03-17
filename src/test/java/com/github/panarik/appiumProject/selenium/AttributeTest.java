package com.github.panarik.appiumProject.selenium;

import com.github.panarik.appiumProject.selenium.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AttributeTest extends BaseTest {

    @BeforeMethod
    public void init() {
        driver.get("https://www.avito.ru");
    }

    @Test
    public void firstAttribute() {
        WebElement linkStaff = driver.findElement(By.xpath("//a[text()='Личные вещи']"));
        Assert.assertEquals(linkStaff.getAttribute("href"), "https://www.avito.ru/moskva/lichnye_veschi");
        Assert.assertEquals(linkStaff.getAttribute("offsetWidth"), "88");
        Assert.assertEquals(linkStaff.getAttribute("offsetHeight"), "15");
    }

    @Test
    public void secondAttribute() {
        goToTransport();
        WebElement selectTransport2 = driver.findElement(By.xpath("//select[@id='category']//option[text()='Транспорт']"));
        Assert.assertEquals(selectTransport2.getAttribute("selected"), "true");
    }
}
