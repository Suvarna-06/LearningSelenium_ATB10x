package org.example.ex03_Selenium_Locators;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium19_Mini_Project2 {

//
    @Owner("Pramod")
    @Severity(SeverityLevel.BLOCKER)
    @TmsLink("https://bugz.atlassian.net/browse/BUG-17")
    @Description("Verify that the error message comes with invalid email on signup page.")
    @Test
         public void vwo_free_trial_error_verify(){
            WebDriver driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.get("https://app.vwo.com");

            WebElement a_tag_partial_match=driver.findElement(By.partialLinkText("free"));
            a_tag_partial_match.click();

            System.out.println(driver.getCurrentUrl());

            // This asssertion will verify that the free trial URL contains the "free trail" word in that URL"
            Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

            // GO to vwo free trial and click on Business Email and inspect take id from that
            WebElement email = driver.findElement(By.id("page-v1-step1-email"));
            email.sendKeys("abc");

            WebElement checkbox_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
            checkbox_policy.click();

            // When there is no id,name,class name then, ctlr F and search for tag name by entering //button.
            // This buttonList will give 30 list button
            // in that i want to click on 1st button i.e is 0 so we use Tagname.
            List<WebElement> buttonList = driver.findElements(By.tagName("button"));
            // from the buttonList i want to click on 1st one.
            buttonList.get(0).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        // <div
            // class="C($color-red) Fz($font-size-12)
            // Trsp($Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason">
            // The email address you entered is incorrect.
            // </div>

                List<WebElement> error_msg = driver.findElements(By.className("invalid-reason"));
        //        Assert.assertTrue(error_msg.isDisplayed());
                Assert.assertEquals(error_msg.get(0).getText(),"The email address you entered is incorrect.");
            driver.quit();



        }
    }

