package org.example.ex10_Actions_Class;

import org.example.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab38_ActionClass_Drag_and_Drop extends TestCaseBoilerPlate {
    @Test
    public void test_Drag_Drop(){

        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();

        Actions actions= new Actions(driver);

        // To drag and Drop we have to known:
        // Source and Destination
        //(or) From and To
        WebElement from = driver.findElement(By.id("column-a"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement to = driver.findElement(By.id("column-b"));

        actions.dragAndDrop(from,to).build().perform();




    }

}
