package org.example.ex17_DataDrivenTesting_POI;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab48_ddt_testng_poi_real {

    public EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver = new EdgeDriver(edgeOptions);

    }

    @Test
    public void test_ddt_testng_poi(String email,String password){

        System.out.println(email + " - "+ password);

        // Here we will write code for Login








    }


    @DataProvider
    public Object[][] getDataxlsx(){
        // READ THE DATA FROM EXCEL FILE
        // GIVE THEM IN THE 2D ARRAY

        return UtilExcel.getTestDataFromExcel("sheet1");
    };





    @AfterTest
    public void closeBrowser(){

    }




}










