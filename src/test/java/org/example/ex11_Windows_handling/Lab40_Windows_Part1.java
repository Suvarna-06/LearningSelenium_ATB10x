package org.example.ex11_Windows_handling;

import org.example.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class Lab40_Windows_Part1 extends TestCaseBoilerPlate {
    @Test
    public void test_Windows_Handling(){
        String URL =("https://the-internet.herokuapp.com/windows");
        driver.get(URL);
        driver.manage().window().maximize();

        String parent = driver.getWindowHandle();
        System.out.println(parent); // 51BA8E1DB8F18558DCFC6BB3A3EEFC79

        // How to click on th button
        driver.findElement(By.linkText("Click Here")).click();

        // When we click on 'Click Here' button we have two tabs
        Set<String>windowHandles = driver.getWindowHandles();
        System.out.println("Window Handles"+windowHandles); // Window Handles[51BA8E1DB8F18558DCFC6BB3A3EEFC79, 6195CC6459C27D94F6F9B9D1EB043C0D]

        // To switch to 2nd window tab
        for(String handle:windowHandles){
            driver.switchTo().window(handle);
            if(driver.getPageSource().contains("New Window")){
                System.out.println("Test Case Pass");
            }
            driver.switchTo().window(parent); // To switch back to parent Window
        }


    }
}
