package org.example.ex02_Selenium_basics;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class TestSelenium12 {

    @Description("Open the URL")
    @Test
    public void test_Selenium01() throws Exception {
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");


        // Use Navigation Commands
        // driver.get("url") ->Navigate to URL

        // Use navigation Methods
        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        Thread.sleep(5000);

        driver.quit();
    }

}
