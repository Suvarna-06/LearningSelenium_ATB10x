package org.example.ex13_Javascript_ex;

import org.example.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.Set;
public class Lab40_JS_Code extends TestCaseBoilerPlate {

    @Test
    public void test_js() {
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        // (JavascriptExecutor)driver; --> need to typecaste the driver no need to create the instance (i.e new =)

        JavascriptExecutor js = (JavascriptExecutor) driver;


        // Go down inspect on username
        WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id='userName']"));



//        js.executeScript("argument[0].scrollIntoView(true);",div_to_scroll);
//        js.executeScript("alert(1);");
        // Instead of above i can use the below
        js.executeScript("window.scrollBy(0,1500);");
//        js.executeScript("alert(1);");


        String url = js.executeScript("return document.URL;").toString();
        String title = js.executeScript("return document.title;").toString();

        System.out.println(url);
        System.out.println(title);

        // normal sendKeys -->actions class -> Js.executeScript



    }
}
