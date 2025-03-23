package org.example.ex02_Selenium_basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestSelenium09 {
    @Description("Open the URL")
    @Test
    public void test_Selenium09() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");

        Assert.assertEquals(driver.getCurrentUrl(), "Expected Title");
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("Title");

        driver.quit();
    }

}