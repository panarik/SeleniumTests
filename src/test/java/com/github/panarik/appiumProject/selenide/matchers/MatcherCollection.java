package com.github.panarik.appiumProject.selenide.matchers;

import com.codeborne.selenide.ElementsCollection;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Selenide.$$;

public class MatcherCollection {

    @Test
    public void collectionMatcher() {
        ElementsCollection liList = $$("ul li:first-child"); //
        liList.should(size(2));
        liList.should(sizeGreaterThanOrEqual(2));
        liList.first().should();
        liList.should(empty);
    }

}
