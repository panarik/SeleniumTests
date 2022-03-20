package com.github.panarik.seleniumTests.selenium.tests;

import com.github.panarik.seleniumTests.selenium.controller.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetTest extends BaseTest {

    @BeforeMethod
    public void init() {
        controller.get("https://www.avito.ru");
    }

    @Test
    public void getText() {
        goToTransport();
        WebElement score = controller.findElement(By.xpath("//span[@class='page-title-count-oYIga']"));
        String s = score.getText();
        System.out.println(s);
        Assert.assertTrue(s.length()>5);
    }

    @Test
    public void getStyles() {
        WebElement stuff = controller.findElement(By.xpath("//a[text()='Личные вещи']"));
        String stuffColor = stuff.getCssValue("color");
        System.out.println(stuffColor);
        Assert.assertEquals(stuffColor, "rgba(0, 156, 240, 1)");
    }

}
