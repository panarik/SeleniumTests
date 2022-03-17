package com.github.panarik.appiumProject.selenide.selectors;

import com.github.panarik.appiumProject.selenide.base.BaseTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$$;
import static com.github.panarik.appiumProject.locators.LocatorCSS.*;

public class SelectorCollection extends BaseTest {

    @Test
    public void selectorCollection() {
        $$(ID_CLASS);
        $$(CHILD_LI_FIRST);
        $$(CHILD_LI_LAST);
        $$(CHILD_LI_2);
    }

}
