package org.example.ex10_File_Upload;

import org.example.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Lab39_ActionClass_Upload_Image_File extends TestCaseBoilerPlate {
    @Test
    public void test_uploading_image_file() {
        driver.get("https://awesomeqa.com/selenium/upload.html");
        WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));

        String working_directory = System.getProperty("user.dir");
        System.out.println(working_directory); // It will give you the wroking directory where the code is present.

        uploadFileInput.sendKeys(working_directory + "/src/test/java/org/example/ex10_File_Upload/TestData.txt");
        driver.findElement(By.name("submit")).click();
        System.out.println("Image Uploaded Successfully!");
    }
}
