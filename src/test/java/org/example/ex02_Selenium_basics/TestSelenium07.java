package org.example.ex02_Selenium_basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.edge.EdgeDriver;


public class TestSelenium07 {
   @Description("Open the URL")
    @Test
    public void test_Selenium07(){
    WebDriver driver = new EdgeDriver();
    driver.get("https://google.com");
       System.out.println(driver.getTitle());
       System.out.println(driver.getCurrentUrl());
       System.out.println(driver.getPageSource());


   }
}
