package org.example.ex14_Relative_locaters;

import org.example.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Lab42_RL_P2  extends TestCaseBoilerPlate {
    @Test
    public void test_RL(){
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();

        //iframe
        driver.switchTo().frame("result");

        WebElement submit= driver.findElement(By.xpath("//form[@id=\"form\"]/button"));
        submit.click();

        // Now hove rover username and inspect and on error also
        WebElement username_element = driver.findElement(By.xpath("//input[@id=\"username\"]"));
        WebElement error_element = driver.findElement(with(By.tagName("small")).below(username_element));

        String error_Text = error_element.getText();
        Assert.assertEquals(error_Text,"Username must be at least 3 characters");
    }
}
