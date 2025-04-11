package org.example.ex16_Selenium_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab45_Selenium_Exceptions_StaleElement {
    public EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver = new EdgeDriver(edgeOptions);

    }

    @Test
    public void test_selenium_exceptions() {

        driver.get("https://google.com");
        System.out.println("Start of program");

        WebElement search_input_box =driver.findElement(By.id("id=\"APjFqb\""));

           driver.navigate().refresh();
        try {
            search_input_box.sendKeys("the testing academy"+ Keys.ENTER);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("End of program");



    }

    @AfterTest
    public void closeBrowser(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
