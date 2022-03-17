package com.github.panarik.appiumProject.selenium;

import com.github.panarik.appiumProject.selenium.base.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class WaitTest extends BaseTest {

    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    private WebElement search;

    @BeforeMethod
    public void init() {
    }

    //неявное ожидание
    @Test
    public void test_Implicit_ThreadSleep() {
        driver.get("https://www.easemytrip.com/");
        picDate();
        try {
            Thread.sleep(1000);
            search.click();
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector(".card.fltResult"));
    }

    //неявное ожидание
    @Test
    public void test_Implicit_driverWait() {
        driver.get("https://www.easemytrip.com/");
        picDate();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        search.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.findElement(By.cssSelector(".card.fltResult"));
    }

    //явное ожидание (появления)
    @Test
    public void test_explicit() {
        driver.get("https://www.easemytrip.com");
        driver.manage().window().fullscreen();
        picDate();
        wait.until(visibilityOf(search));
        search.click();
        wait.until(presenceOfElementLocated(By.cssSelector(".card.fltResult")));
    }

    //явное ожидание (исчезновения)
    @Test
    public void test_disappear(){
        driver.get("https://pagination.js.org");
        List<WebElement> elements = driver.findElements(By.xpath("//div[@id='demo1']/div[@class='data-container']//li"));
        List<WebElement> pages = driver.findElements(By.xpath("//div[@class='paginationjs']//li"));
        pages.get(2).click(); //перелистываем на вторую страницу
        wait.until(stalenessOf(elements.get(5))); //ждем пока пропадет первая страница (пятый элемент)
        elements = driver.findElements(By.xpath("//div[@id='demo1']/div[@class='data-container']//li")); //получаем список с обновленной страницы
        for(WebElement e : elements) {
            System.out.print(" :"+e.getText());
        }
        Assert.assertEquals(elements.get(0).getText(), "11");
    }



    private void picDate() {
        search = driver.findElement(By.cssSelector("[value='Search']"));
        //выбираем дату вылета
        driver.findElement(By.id("ddate")).click();
        driver.findElement(By.cssSelector("[id='" + getDate(1) + "/11/2021']")).click();
        //выбираем дату прилета
        driver.findElement(By.id("rdate")).click();
        driver.findElement(By.cssSelector("[id='" + getDate(2) + "/11/2021']")).click();
    }

    private String getDate(int appendDays) {
        DateFormat day = new SimpleDateFormat("dd");
        Calendar calendar = Calendar.getInstance(Locale.ENGLISH);
        calendar.add(Calendar.DAY_OF_MONTH, appendDays);
        String dayOfMonth = day.format(calendar.getTime());
        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);
        int dayOfWeek = (calendar.get(Calendar.DAY_OF_WEEK) - 1);
        Map<Integer, String> weekMap = new HashMap<>();
        weekMap.put(1, "fst");
        weekMap.put(2, "snd");
        weekMap.put(3, "trd");
        weekMap.put(4, "frth");
        weekMap.put(5, "fiv");
        System.out.println("number of week: "+weekOfMonth+", day of month: " + dayOfMonth + ", day of week: " + dayOfWeek);
        return weekMap.get(weekOfMonth)+"_"+dayOfWeek + "_" + dayOfMonth;
    }
}
