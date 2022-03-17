package com.github.panarik.appiumProject.selenide.tools;

import static com.codeborne.selenide.Selenide.Wait;
import static com.codeborne.selenide.Selenide.sleep;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class Waiters {

    public void waiters() {
        Wait().until(titleIs("Selenide"));
        sleep(500);

    }

}
