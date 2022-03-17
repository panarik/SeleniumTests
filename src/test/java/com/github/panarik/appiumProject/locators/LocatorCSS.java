package com.github.panarik.appiumProject.locators;

public class LocatorCSS {

    /*
    For browsers:
    $$("put_here_css_selector")
     */

    // Types of selectors:
    // single
    public static final String TAG_BODY = "body"; //тег body
    public static final String TAG_DIV = "div"; //тег div
    public static final String ID = "#main"; //find by id
    public static final String CLASS = ".gLFyf"; // find by class
    public static final String ATTRIBUTE = "[role]"; //find by attribute key
    public static final String ATTRIBUTE_VALUE = "[role='main']"; //find by attribute key and value

    // contains
    public static final String ATTRIBUTE_CONTAINS = "[role*='something']"; //attribute key 'role' contains value 'something'
    public static final String ATTRIBUTE_CONTAINS2 = "[title~=flower]"; //attribute key 'title' contains word 'flower'
    public static final String ATTRIBUTE_BEGIN = "[role^='present']"; //attribute key 'role' has begin value 'present'
    public static final String ATTRIBUTE_END = "[role$='some']"; //attribute key 'role' has ending by value 'some'

    // combine
    public static final String CLASS_AND_CLASS = ".name1.name2"; // have class name1 AND class name2
    public static final String ID_CLASS = "#search .g"; // id and className
    public static final String ID_CLASS_ATTRIBUTE1 = "#search .g [data-hveid]"; // фильтры: по id, по классу, по параметру data-hveid
    public static final String ID_CLASS_ATTRIBUTE2 = "#search .g [data-hveid='CAUQAA']"; // фильтры: по id, по классу, по параметру data-hveid
    public static final String CLASS_ATTRIBUTE = ".KxwPGc[data-sfe='true']"; // фильтры: по классу .KxwPGc и параметру data-sfe и значению true

    // OR
    public static final String EQUAL_OR_START = "[lang|=en]"; // attribute 'lang' equal to value 'en' or starting with 'en'

    // not
    public static final String CLASS_NOT = "div:not(.col)"; // список тегов которые не имеют класс "col"
    public static final String ATTRIBUTE_NOT = "a:not(href^='http')"; // список тегов в которых атрибут href не начинается с 'http'
    public static final String CHILD_NOT = "p:empty"; // all <p> element that has no children

    // child
    public static final String CLASS_CHILD = ".name1 .name2"; // в теге с классом name1 ищем тег - любого наследника с классом name2
    public static final String DIV_CHILD = "div p"; // ищем все 'div' теги с наследниками 'p'.
    public static final String DIV_CHILD_NEAREST = "div > p"; // ищем все 'div' теги с НЕПОСРЕДСТВЕННЫМИ наследниками 'p'.
    public static final String CLASS_CHILD_NEAREST = "div[class='name'] > div.g"; // в теге с классом 'name' ищем тег - прямого наследника с классом 'g'
    public static final String CLASS_CHILD2 = "div[class='eKjLze'] div.yuRUbf"; // в теге с классом eKjLze ищем тег - любого наследника с классом yuRUbf
    public static final String CHILD_LI_FIRST = "ul li:first-child"; // во всех ul вывести список всех ПЕРВЫХ child li во всех
    public static final String CHILD_LI_LAST = "ul li:last-child"; // во всех ul вывести список всех ПОСЛЕДНИХ child li во всех
    public static final String CHILD_LI_2 = "ul li:nth-child(2)"; // во всех ul вывести список всех ВТОРЫХ child li во всех

    // by status
    public static final String ACTIVE = "a:active"; // all active link
    public static final String CHECKED = "input:checked"; // all checked <input> elements
    public static final String DEFAULT = "input:default"; // all default <input> elements
    public static final String DISABLED = "input:disabled"; // all disabled <input> elements
    public static final String ENABLED = "input:enabled"; // all enabled <input> elements
    public static final String FOCUS = "input:focus"; // input element which has focus
    public static final String FULLSCREEN = ":fullscreen"; // element that is in full-screen mode
    public static final String HOVER = "a:hover"; // select links on mouse over
    public static final String LINKS_UNVISITED = "a:link"; // selects all unvisited links
    public static final String LINKS_VISITED = "a:visited"; // Selects all visited links
}
