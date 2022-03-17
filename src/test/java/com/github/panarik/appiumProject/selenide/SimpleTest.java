package com.github.panarik.appiumProject.selenide;

import com.codeborne.selenide.ElementsCollection;
import com.github.panarik.appiumProject.selenide.base.BaseTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.CollectionCondition.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class SimpleTest extends BaseTest {

    @Test
    public void elements_test() {
        ElementsCollection result = elements("#search .g");
        result  .shouldHave(sizeGreaterThanOrEqual(9))
                .first().shouldHave(text("Selenide: лаконичные и стабильные UI тесты на Java"));
        //Todo: ".r>a" не работает
        result.first().find(".r>a").click();

        Wait().until(titleIs("Selenide"));
    }

}
