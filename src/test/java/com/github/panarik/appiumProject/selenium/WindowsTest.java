package com.github.panarik.appiumProject.selenium;

import com.github.panarik.appiumProject.selenium.base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowsTest extends BaseTest {

    private JavascriptExecutor js = (JavascriptExecutor) driver;
    private String window_1; //first browser window
    private String window_2; //second browser window

    @BeforeMethod
    public void init(){
        driver.get("http://127.0.0.1:5500/modals.html");
    }

    @Test
    public void switch_test() throws InterruptedException {
        window_1 = driver.getWindowHandle(); //current window
        js.executeScript("window.open()"); //open new window
        Set<String> list = driver.getWindowHandles(); //get list with all windows names
        //find window_2 from list
        for (String s : list) {
            if (!s.equals(window_1)) window_2 = s;
        }

        Thread.sleep(1000); //debug

        //switch to second window
        driver.switchTo().window(window_2);
        driver.get("http://127.0.0.1:5500/modals.html");

        Thread.sleep(1000); //debug

        //close second window
        driver.close();

        Thread.sleep(1000); //debug

        //switch to first window
        driver.switchTo().window(window_1);

        Thread.sleep(3000); //debug
        driver.close();
    }

}
