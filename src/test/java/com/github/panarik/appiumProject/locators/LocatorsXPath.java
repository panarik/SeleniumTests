package com.github.panarik.appiumProject.locators;


public class LocatorsXPath {

   /*
    * browser command examples: (Ctrl+F)
    *   //$x("//html/body/")
    *   //html/body
    */

    //Unknown
    public static String ANY = "//*"; // any element
    public static String ANY_ATTRIBUTE = "//div[@*]"; // select 'div' with has any attribute

    //single
    public static String body = "//html/body";

    //attribute
    public static String ATTRIBUTE_ID = "//div[@lang]";// find all 'div' with attribute tag 'lang'
    public static String ATTRIBUTE_VALUE_EXACT = "//div[@id ='someId']";// find all 'div' with attribute tag 'id' and value 'someId'
    public static String ATTRIBUTE_VALUE_GREATER = "//div[price>35.00]";// find all 'div' with attribute tag 'price' and value GREATER THAN 35.00

    //Number -th
    public static String NUMBER = "//div[6]"; // search 6-th 'div'
    public static String LAST = "//div[last()]"; // last 'div'
    public static String LAST_1 = "//div[last()-1]"; // last but one 'div'
    public static String FIRST_3 = "//div[position()<3]"; // Selects the first two 'div' elements

    //multiple
    public static String CLASS_MANY = "//li[@class='one two']"; //search li's with classes: one, two
    public static String PATHS_MANY = "//div | //li"; //select all 'div' in the document AND all 'li' int the document

    //child
    public static String CHILD = "//div//li"; // 'div' has CHILD 'li'
    public static String CHILD_NEAREST = "//div/a"; // 'div' has NEAREST CHILD 'a'

    //go to parent
    public static String TO_PARENT_1 = "//span[text()='Владелец: ']/../../../div[2]"; //из первого child с помощью '/..' поднимаемся к родителю. Далее перемещаемся к второму child с помощью /div[2]
    public static String TO_PARENT_2 = "//span[text()='Владелец: ']/parent::div/parent::div/parent::div/div[2]"; //из первого child с помощью '/parent::div' поднимаемся к родителю. Далее перемещаемся к второму child с помощью /div[2]

    //go to sibling
    public static String TO_SIBLING = "//span[text()='Владелец: ']/parent::div/parent::div/following-sibling::div/div/span"; //из первого child с помощью 'following-sibling::div' перемещаемся к соседнему 'div'. Далее спускаемся вниз с помощью '/div/span'

    //Operators and Functions
    public static String EQUAL = "//div[text()=5000]"; // Select elements with the value EQUAL given value.
    public static String LESS = "//div[text()<5000]"; // Select elements with the value LESS than given value.
    public static String OR = "//div[@name='name1' or @lastname='lastname1']"; // Select elements with tag 'name' equal 'name1' OR tag 'lastname' equal 'lastname1'
    public static String AND = "//div[@name='name1' and @lastname='lastname1']"; // Select elements with tag 'name' equal 'name1' AND tag 'lastname' equal 'lastname1'
    public static String EXACT_TEXT = "//h3[text()='Some text']"; // h3 with exact text 'Some text'
    public static String CONTAINS_TEXT = "//h3[(contains(text(),'Some text')]"; // h3 contains text 'Some text'
    public static String CONTAINS_CLASS = "//h3[contains(@class,'some class')]"; // h3 contains piece of class name 'some class'
    public static String STARTS_WITH = "//h3[starts-with(text(),'some text')]"; // h3 those text starts with 'some text'


}
