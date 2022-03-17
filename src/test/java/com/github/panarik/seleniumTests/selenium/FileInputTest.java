package com.github.panarik.seleniumTests.selenium;

import com.github.panarik.seleniumTests.selenium.base.BaseTest;
import org.testng.annotations.BeforeMethod;

public class FileInputTest extends BaseTest {

    @BeforeMethod
    public void init() {
        driver.get("https://mdbootstrap.com/docs/b4/jquery/forms/file-input");
    }



}
