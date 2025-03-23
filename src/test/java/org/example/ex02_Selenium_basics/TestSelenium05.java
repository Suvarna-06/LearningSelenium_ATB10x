package org.example.ex02_Selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestSelenium05 {

    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");

    }
}
