package com.github.panarik.appiumProject.selenide.tools;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Actions {

    @BeforeMethod
    public void init() {
        open("https://todomvc.com/examples/emberjs/");
    }

    @Test
    public void actions() {
        SelenideElement search = $(byId("new-todo"));
        SelenideElement info = $(byId("info"));
        search.hover();
        search.click();
        search.doubleClick();
        search.contextClick();
        search.setValue("a"); //clear and input
        search.append("bc");
        search.dragAndDropTo(info);
        search.pressEnter();
        search.pressTab();
        search.pressEscape();
        search.scrollTo();
        search.scrollIntoView(true); //the top of the element will be aligned to the top.
        search.scrollIntoView(false); //the bottom of the element will be aligned to the bottom.
//        search.selectOption(0); //Select an option from dropdown list (by index)
//        search.uploadFile(file);
//        search.download();

        //делаем скриншот
        File file = new File("image.png");
        try {
            BufferedImage image = search.screenshotAsImage();
            ImageIO.write(image, "png", file);
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }



    }
}
