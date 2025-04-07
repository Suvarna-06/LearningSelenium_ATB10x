package org.example.ex10_Actions_Class;

import org.example.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab35_Action_Class_P2 extends TestCaseBoilerPlate {

    @Test
    public void test_actions() {

        String URL = "https://www.spicejet.com/";
        driver.get(URL);
        driver.manage().window().maximize();
        WebElement source = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));

        Actions actions = new Actions(driver);
        // move to element
        // click on element
        // send keys -> enter BLR

        actions.moveToElement(source).click().sendKeys("BLR").build().perform();


    }
    }
