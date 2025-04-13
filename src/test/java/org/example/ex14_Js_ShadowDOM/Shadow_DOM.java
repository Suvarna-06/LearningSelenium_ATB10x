package org.example.ex14_Js_ShadowDOM;

import org.example.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.Test;

import static org.example.ex07_WaitHelper.WaitHelpers.waitJVM;

public class Shadow_DOM extends TestCaseBoilerPlate {
    // hidden elements

    @Test
    public void test_Js_shadow_dom(){
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        // Navigate to div to scroll
        JavascriptExecutor js =(JavascriptExecutor) driver;

        WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id='userName']"));

        // Shadow DOM --> js.executeCode
        // the below  25 and 26 won't work because they are under shadow dom so we use js.executeCode
//        WebElement pizza = driver.findElement(By.id("pizza"));
//        pizza.sendKeys("farmhouse");

        // We use this below
        waitJVM(3000);

        WebElement inputboxPizza = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div#app2\").shadowRoot.querySelector(\"#pizza\");");
        inputboxPizza.sendKeys("farmhouse");

    }






}
