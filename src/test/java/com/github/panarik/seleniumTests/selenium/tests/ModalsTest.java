package com.github.panarik.seleniumTests.selenium.tests;

import com.github.panarik.seleniumTests.selenium.controller.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class ModalsTest extends BaseTest {

    @BeforeMethod
    public void init() {
        //run VisualStudio live server plugin for open html page from file
        controller.get("http://127.0.0.1:5500/modals.html");
    }


    @Test
    public void test_alert() {
        WebElement element1 = controller.findElement(By.id("a"));
        element1.click();
        Alert alert = wait.until(alertIsPresent());
        System.out.println(alert.getText());
        alert.accept();
    }

    @Test
    public void test_modal() {
        WebElement element2 = controller.findElement(By.id("b"));
        element2.click(); //run modal window
        Alert modal = wait.until(alertIsPresent());
        modal.sendKeys("test 1234!");
        modal.accept();
        Alert modalFinish = wait.until(alertIsPresent());
        System.out.println(modalFinish.getText());
        modalFinish.accept();
    }

    @Test
    public void test_confirm() {
        WebElement element3 = controller.findElement(By.id("c"));
        element3.click();
        Alert confirm = wait.until(alertIsPresent());
        System.out.println(confirm.getText());
        confirm.dismiss();
    }

}
