package com.github.panarik.appiumProject.selenium;

import com.github.panarik.appiumProject.selenium.base.BaseTest;
import org.testng.annotations.BeforeMethod;

public class FileInputTest extends BaseTest {

    @BeforeMethod
    public void init() {
        driver.get("https://mdbootstrap.com/docs/b4/jquery/forms/file-input");
    }



}
