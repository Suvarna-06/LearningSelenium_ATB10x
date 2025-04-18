package org.example.ex15_Relative_locaters;

import org.example.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Lab41_RL_P1 extends TestCaseBoilerPlate {
    @Test
    public void test_js() {
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement span_element = driver.findElement(By.xpath("//span[normalize-space()='Years of Experience']"));

        driver.findElement(with(By.id("exp-2")).toRightOf(span_element)).click();
    }
}
