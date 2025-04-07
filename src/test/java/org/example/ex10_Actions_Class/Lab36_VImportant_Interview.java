package org.example.ex10_Actions_Class;

import org.example.TestCaseBoilerPlate;
import org.example.ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static org.example.ex07_WaitHelper.WaitHelpers.waitJVM;

public class Lab36_VImportant_Interview  extends TestCaseBoilerPlate {

    @Test
    public void test_actions_p4(){

        String URL = "https://www.makemytrip.com/";
        driver.get(URL);
        driver.manage().window().maximize();


        // Wait for the popup  to come and click the x icon
        // Xpath ->//span[@data-cy="closeModal"]
        // This popup appears after 1sec so we have to wait before performing the actions

        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
         // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));

        // Or another method is
        WaitHelpers.checkVisibility(driver,By.xpath("//span[@data-cy='closeModal']"));

        // This will Close the Modal
        WebElement model = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        model.click();


        WebElement fromCity = driver.findElement(By.xpath("//input[@data-cy=\"fromCity\"]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(fromCity).click().sendKeys("DEL").build().perform();

        waitJVM(3000);

        // Selecting the city name and matching them with using list
        List<WebElement> list_autocomplete = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));
        // How to alterate over the List ->Using List
        for(WebElement e: list_autocomplete){
                if(e.getText().contains("New Delhi, India")){
                    e.click();
                }
        }
        // It is dynamic auto suggestion that is why we don't use Arrow keys.












    }
}
