package com.github.panarik.seleniumTests.selenium.tests;

import com.github.panarik.seleniumTests.selenium.tests.base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowsTest extends BaseTest {

    private JavascriptExecutor js = (JavascriptExecutor) controller;
    private String window_1; //first browser window
    private String window_2; //second browser window

    @BeforeMethod
    public void init(){
        controller.get("http://127.0.0.1:5500/modals.html");
    }

    @Test
    public void switch_test() throws InterruptedException {
        window_1 = controller.getWindowHandle(); //current window
        js.executeScript("window.open()"); //open new window
        Set<String> list = controller.getWindowHandles(); //get list with all windows names
        //find window_2 from list
        for (String s : list) {
            if (!s.equals(window_1)) window_2 = s;
        }

        Thread.sleep(1000); //debug

        //switch to second window
        controller.switchTo().window(window_2);
        controller.get("http://127.0.0.1:5500/modals.html");

        Thread.sleep(1000); //debug

        //close second window
        controller.close();

        Thread.sleep(1000); //debug

        //switch to first window
        controller.switchTo().window(window_1);

        Thread.sleep(3000); //debug
        controller.close();
    }

}
