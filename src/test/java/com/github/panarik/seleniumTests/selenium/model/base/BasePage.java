package com.github.panarik.seleniumTests.selenium.model.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

import static com.github.panarik.seleniumTests.selenium.tests.base.BaseTest.controller;

public class BasePage {

    /**
     * Open page.
     *
     * @param pageURL Page URL.
     */
    public void getPage(String pageURL) {
        getDriver().get(pageURL);
    }

    /**
     * Click on the web element.
     *
     * @param item {@link WebItem} item.
     */
    protected void click(WebItem item) {
        getElement(item).click();
    }

    /**
     * Context click on target WebItem.
     *
     * @param item {@link WebItem} item.
     */
    protected void contextClick(WebItem item) {
        Actions action = new Actions(getDriver());
        action.contextClick(getElement(item)).build().perform();
    }

    /**
     * Move mouse to target WebItem.
     *
     * @param item {@link WebItem} item.
     */
    protected void hoverItem(WebItem item) {
        Actions action = new Actions(getDriver());
        action.moveToElement(getElement(item)).build().perform();
    }

    protected void search(WebItem webItem, String line) {
        getElement(webItem).sendKeys(line);
    }

    protected void deleteAll(WebItem item) {
        WebElement element = getElement(item);
        int sum = element.getAttribute("value").length();
        ArrayList<Keys> keysList = new ArrayList<>();
        for (int i = 0; i < sum; i++) {
            keysList.add(Keys.BACK_SPACE);
        }
        element.sendKeys(keysList.toArray(new Keys[keysList.size()]));
    }

    protected WebElement getElement(WebItem item) {
        return getDriver().findElement(By.xpath(item.getXpath()));
    }

    private WebDriver getDriver() {
        return controller.get().getDriver();
    }

}
