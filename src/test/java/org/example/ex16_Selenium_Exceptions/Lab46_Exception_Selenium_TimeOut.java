package org.example.ex16_Selenium_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab46_Exception_Selenium_TimeOut {

    public EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver = new EdgeDriver(edgeOptions);
    }

    @Test
    public void test_time_out_exception(){
        System.out.println("start of program");

        driver.get("https://google.com");
        //Explicit wait
        // It will try to find the element at least for the 10 sec
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='abc']")));

        // Find the search box
        WebElement search_inputbox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        search_inputbox.sendKeys("the testing academy");









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


