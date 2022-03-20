package com.github.panarik.seleniumTests.selenium.model.base;

public class WebItem {

    private String itemName;
    private String xpath;

    public WebItem(String itemName, String xpath) {
        this.itemName = itemName;
        this.xpath = xpath;
    }

    public String getItemName() {
        return itemName;
    }

    public String getXpath() {
        return xpath;
    }
}
