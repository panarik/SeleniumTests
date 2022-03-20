package com.github.panarik.seleniumTests.selenium.tests;

import com.github.panarik.seleniumTests.selenium.tests.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class ActionComplexTest extends BaseTest {

    @Test
    public void actionComplex() {
        controller.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
        controller.manage().window().fullscreen();
        WebElement draggable = controller.findElement(By.xpath("//div[@id='draggable']"));
        WebElement droppable = controller.findElement(By.xpath("//div[@id='droppable']"));

        Actions action = new Actions(controller);
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

}
