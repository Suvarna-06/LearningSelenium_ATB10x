package org.example.Assignment_Project;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task30th_March_Katalon_Cura_Project {

    private static final Logger log = LoggerFactory.getLogger(Task30th_March_Katalon_Cura_Project.class);

    @Description("Verify the entire Cura Healthcare Service website using Automation")
        @Test
        public void Test_Website() throws Exception{
            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.addArguments("--Incognito");
            edgeOptions.addArguments("--start-maximize");


            // Open the URL
            WebDriver driver= new EdgeDriver(edgeOptions);
            driver.get("https://katalon-demo-cura.herokuapp.com/");

            // Find the Make Appointment button Xpath and perform the click action on it
            WebElement bttn = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
            bttn.click();

            // Find the  username input-box and enter Username
            WebElement usr= driver.findElement(By.xpath("//input[@id='txt-username']"));
            usr.sendKeys("John Doe");

            // Find the password input-box and enter Password
            WebElement psw= driver.findElement(By.xpath("//input[@id='txt-password']"));
            psw.sendKeys("ThisIsNotAPassword");

            // Click on the Login Button
            WebElement btn_log= driver.findElement(By.cssSelector("button[class='btn btn-default']"));
            btn_log.click();

             // Selecting the options(Static dropdown)
            WebElement element_select = driver.findElement(By.id("combo_facility"));
            Select select = new Select(element_select);
            select.selectByVisibleText("Seoul CURA Healthcare Center");
//            also can use
//            Select select = new Select(driver.findElement(By.id("combo_facility")));
//            select.selectByIndex(1);

            // Click on Check Box
            WebElement checkbox = driver.findElement(By.id("chk_hospotal_readmission"));
            checkbox.click();

            // Clicking on radio button
             WebElement radiobutton = driver.findElement(By.cssSelector("input[value='Medicaid']"));
             radiobutton.click();

            //  Locate the calendar input field
            WebElement calendar = driver.findElement(By.id("txt_visit_date"));
            calendar.clear();

            // Enter the desired date
            calendar.sendKeys("10/01/2025");

            WebElement comment=  driver.findElement(By.id("txt_comment"));
            comment.sendKeys("Sandhya");


            // Clicking on the book appointment button.
            WebElement appointment = driver.findElement(By.id("btn-book-appointment"));
            appointment.click();

            // Validating the booking
            WebElement text = driver.findElement(By.xpath("//h2[text()='Appointment Confirmation']"));
            System.out.println("Confirmation message-> " +text.getText());
            Assert.assertEquals(text.getText(),"Appointment Confirmation");


            // Click on menu
                WebElement btn_Menu = driver.findElement(By.xpath("//a[@id='menu-toggle']"));
                btn_Menu.click();

            // Logout the website
            WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
            logout.click();

            Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/");
            System.out.println("User is logged out and the page title is"+driver.getTitle());
            Thread.sleep(10000);

            driver.quit();
        }
    }


