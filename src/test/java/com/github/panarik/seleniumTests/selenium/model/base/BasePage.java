package com.github.panarik.seleniumTests.selenium.model.base;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

import static com.github.panarik.seleniumTests.selenium.tests.base.BaseTest.controller;

public class BasePage {

    /**
     * Open page.
     * @param pageURL Page URL.
     */
    public void getPage(String pageURL) {
        controller.get().getDriver().get(pageURL);
    }

    /**
     * Click on the web element.
     * @param webItem
     */
    protected void click(WebItem webItem) {
        controller.get().getDriver().findElement(By.xpath(webItem.getXpath())).click();
    }

    protected void search(WebItem webItem, String line) {
        controller.get().getDriver().findElement(By.xpath(webItem.getXpath())).sendKeys(line);
    }

    protected void deleteAll(WebItem webItem) {
        WebElement element = getElement(webItem);
        int sum = element.getAttribute("value").length();
        ArrayList<Keys> keysList = new ArrayList<>();
        for (int i = 0; i<sum; i++) {
            keysList.add(Keys.BACK_SPACE);
        }
        element.sendKeys(keysList.toArray(new Keys[keysList.size()]));
    }

    protected WebElement getElement(WebItem webItem) {
        return controller.get().getDriver().findElement(By.xpath(webItem.getXpath()));
    }

}
