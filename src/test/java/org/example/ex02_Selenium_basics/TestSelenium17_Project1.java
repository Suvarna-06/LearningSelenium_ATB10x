package org.example.ex02_Selenium_basics;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestSelenium17_Project1 {

    @Description("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void test_negative_vwo_login() throws Exception {


        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start--maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
//         driver.navigate().to("https://app.vwo.com");
         driver.get("https://app.vwo.com");

//        driver.manage().window().maximize();


        // 1. Find the email input box and enter the email.

//        <input
//        type="email"
//        class="text-input W(100%)"
//        name="username"
//        id="login-username"
//        data-qa="hocewoqisi">

        WebElement emailInputBox =driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");


        // 2. Find the password input box and enter the password
//        <input
//        type="password"
//        class="text-input W(100%)"
//        name="password"
//        id="login-password"
//        data-qa="jobodapuxe"
//        data-gtm-form-interact-field-id="0">
        WebElement passwordInputBox =driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("admin");


        // Find the submit button and click on it
//        <button
//        type="submit"
//        id="js-login-btn"
//        class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)"
//        onclick="login.login(event)"
//        data-qa="sibequkica"
//        >

        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

        Thread.sleep(4000);

        // 4. Find the invalid error message and verify.
        //<div
        // class="notification-box-description"
        // id="js-notification-box-msg"
        // data-qa="rixawilomi">
        // Your email, password, IP address or location did not match</div>

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");


        driver.quit();



    }
}

