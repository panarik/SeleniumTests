package com.github.panarik.appiumProject.selenium;

import com.github.panarik.appiumProject.selenium.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;

public class ActionsTest extends BaseTest {

    @Test
    public void click() {
        driver.get("https://www.avito.ru");
        WebElement section = driver.findElement(By.xpath("//a[text()='Личные вещи']"));
        section.click();
    }

    @Test
    public void input() {
        driver.get("https://www.avito.ru");
        WebElement input = driver.findElement(By.xpath("//input[@data-marker='search-form/suggest']"));
        input.sendKeys("test 123");
        deleteAll(input); //custom input
    }

    @Test
    public void actionContext() {
        driver.get("https://www.avito.ru");
        WebElement input = driver.findElement(By.xpath("//input[@data-marker='search-form/suggest']"));
        Actions menu = new Actions(driver);
        menu
                .contextClick(input)
                .build().perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void actionMove() {
        driver.get("https://www.avito.ru");
        WebElement input = driver.findElement(By.xpath("//input[@data-marker='search-form/suggest']"));
        Actions move = new Actions(driver);
        move.moveToElement(input);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void actionComplex() {
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
        driver.manage().window().fullscreen();
        WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions action = new Actions(driver);
        action
                .moveToElement(draggable)
                .clickAndHold()
                .pause(Duration.ofSeconds(1))
                .moveToElement(droppable)
                .pause(Duration.ofSeconds(1))
                .release()
                .pause(Duration.ofSeconds(1))
                .keyDown(Keys.LEFT_CONTROL)
                .keyDown(Keys.LEFT_SHIFT)
                .keyUp(Keys.LEFT_CONTROL)
                .keyUp(Keys.LEFT_SHIFT)
                .build()
                .perform();
    }

    private void deleteAll(WebElement input) {
        int sum = input.getAttribute("value").length();
        ArrayList<Keys> keysList = new ArrayList<>();
        for (int i = 0; i<sum; i++) {
            keysList.add(Keys.BACK_SPACE);
        }
        input.sendKeys(keysList.toArray(new Keys[keysList.size()]));
    }
}
