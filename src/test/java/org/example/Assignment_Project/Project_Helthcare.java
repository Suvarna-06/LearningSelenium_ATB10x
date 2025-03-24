package org.example.Assignment_Project;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Project_Helthcare {
    @Description("Open the URL enter valid username and password and verify the current URL changes")
    @Test
    public void test_positive_CURA_Healthcare() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start--maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        // 1. Click on Make Appointment
        //<a
        // id="btn-make-appointment"
        // href="./profile.php#login"
        // class="btn btn-dark btn-lg">
        // Make Appointment
        // </a>

        WebElement bttn = driver.findElement(By.id("btn-make-appointment"));
        bttn.click();


        Thread.sleep(2000);


        // 2.  Find the username input box and enter a Username
            // <input
        // type="text"
        // class="form-control"
        // id="txt-username"
        // name="username"
        // placeholder="Username"
        // value="" autocomplete="off">


        WebElement box_usr =driver.findElement(By.id("txt-username"));
        box_usr.sendKeys("John Doe");

        // 3. Find the password input box and enter a Password
        // <input
        // type="password"
        // class="form-control"
        // id="txt-password"
        // name="password"
        // placeholder="Password"
        // value="" autocomplete="off">
        WebElement box_psw = driver.findElement(By.id("txt-password"));
        box_psw.sendKeys("ThisIsNotAPassword");

        // 4. Find the login button and click
           //<button
        // id="btn-login"
        // type="submit"
        // class="btn btn-default">
        // Login
        // </button>

        WebElement button= driver.findElement(By.id("btn-login"));
        button.click();

        // 5. Open the Appointment page

        // 5. Verify we're on the appointment page
        Thread.sleep(2000); // Wait for page to load
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("#appointment"),
                "URL should contain '#appointment' after successful login");
        driver.quit();







    }
}
