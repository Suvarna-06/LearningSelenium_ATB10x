package org.example.ex05_Selenium_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium22_Waits {
        @Description("Verify Ebay Print the prices (iMac)")
        @Test
    public void test_verify_print_imac_price(){
            EdgeDriver driver = new EdgeDriver();
            driver.get("https://app.vwo.com");

            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

}
