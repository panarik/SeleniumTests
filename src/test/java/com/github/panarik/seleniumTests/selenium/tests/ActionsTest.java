package com.github.panarik.seleniumTests.selenium.tests;

import com.github.panarik.seleniumTests.selenium.tests.base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsTest extends BaseTest {

    @BeforeMethod
    public void getPage() {
        avito.getPage(); // Common step: Open page 'avito.ru'.
    }

    @Test
    public void clickExample() {
        avito.goToPersonalStaff();
    }

    @Test
    public void inputExample() {
        avito
                .search("test 123") // Step 2: Search 'test 123' form search field.
                .deleteAllFromSearchField(); // Step 3: delete all text from search field.
    }

    @Test
    public void actionContextExample() {
        avito.contextClickSearch(); // Step 1: Context click on search field.
    }

    @Test
    public void actionMoveExample() {
        avito.moveToSearch(); // Step 1: Hover search field.
    }

}
