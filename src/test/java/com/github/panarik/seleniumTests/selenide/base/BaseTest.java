package com.github.panarik.seleniumTests.selenide.base;

import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;


public class BaseTest {

    @BeforeMethod
    public void init() {
        open("https://www.google.com/");
        element(byName("q")).setValue("selenide").pressEnter();
    }

}
