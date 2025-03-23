package org.example.ex01_Selenium_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {

        // Write the code which will execute the perform the ui

    @Test
    public void test_VerifyVWOLogin(){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());

    }
}
