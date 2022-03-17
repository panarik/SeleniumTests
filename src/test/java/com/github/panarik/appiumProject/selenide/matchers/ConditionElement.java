package com.github.panarik.appiumProject.selenide.matchers;

import com.github.panarik.appiumProject.selenide.base.BaseTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class ConditionElement extends BaseTest {

    @Test
    public void elementCondition() {
        //check static condition
        $(".Q8LRLc").should(exist);
        $(".Q8LRLc").should(visible);
        $(".Q8LRLc").should(hidden);
        $("input").should(readonly); //attribute

        //check condition positive and negative
        $(".Q8LRL1").should(exist);
        $(".Q8LRL1").shouldNot(exist);

        //check condition matcher
        $(".Q8LRLc").shouldHave(matchText("Россия")); //match
        $(".mfMhoc").shouldHave(text("запросы")); //contains
        $(".LC20lb.DKV0Md").shouldHave(selectedText("Selenide: лаконичные и стабильные UI тесты на Java")); //has selected
        $(".yuRUbf").shouldHave(href("https://selenide.org"));
    }
}
