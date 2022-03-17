package com.github.panarik.appiumProject.selenide.selectors;

import com.github.panarik.appiumProject.selenide.base.BaseTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.github.panarik.appiumProject.locators.LocatorCSS.*;

public class SelectorElement extends BaseTest {

    @Test
    public void selectorElement() {
        //один фильтр CSS
        $(TAG_BODY).should(visible);
        $(ID).should(visible);
        $(CLASS_AND_CLASS).should(visible);
        $(ATTRIBUTE).should(visible);

        $(byId("main")).should(visible);//find by attribute id
        $(byClassName("IsZvec")).should(visible); //find by class name (only one class)
        $(byName("q")).should(visible); //find by attribute name
        $(byAttribute("role", "main")).should(visible); //find by attribute role
        $(byText("Картинки")).should(visible); //find by text

        //несколько фильтров
        $(ID_CLASS_ATTRIBUTE1).should(visible);
        $(CLASS_CHILD2).should(visible);
        $(CLASS_CHILD_NEAREST).should(visible); //nearest child
        $(ATTRIBUTE_NOT); // href не начинается с http
        $("#search").findAll(".g").find(attribute("data-hveid", "CAUQAA")).should(visible); // фильтры: по id, по классу, по параметру data-hveid
    }
}
