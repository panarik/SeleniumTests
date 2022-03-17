package com.github.panarik.seleniumTests.selenide.selectors;

import com.github.panarik.seleniumTests.selenide.base.BaseTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$$;
import static com.github.panarik.seleniumTests.locators.LocatorCSS.*;

public class SelectorCollection extends BaseTest {

    @Test
    public void selectorCollection() {
        $$(ID_CLASS);
        $$(CHILD_LI_FIRST);
        $$(CHILD_LI_LAST);
        $$(CHILD_LI_2);
    }

}
