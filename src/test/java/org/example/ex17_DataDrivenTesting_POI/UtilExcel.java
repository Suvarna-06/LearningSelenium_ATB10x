package org.example.ex17_DataDrivenTesting_POI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UtilExcel {
// Apache POI
// Read the File - TestData.xlsx
//  Workbook Create
//  Sheet
 // Row and Cell
 // 2D Object - getData()

    // File ->Workbook -> Sheet ->Row -> Cell ->[][]
// Why static -> I want to share them with other classes also
    static Workbook book;
    static Sheet sheet;

    // It will give path of the project
    //
    public  static String SHEET_PATH = System.getProperty("user.dir")+"/src/test/resources/TestData.xlsx";

    // Which sheet u want to fetch
    public static Object[][] getTestDataFromExcel(String sheetName){

        // Read the file. Whenever we read a file that is checked exception so
        // Put intry catch block

//        try {
//            FileInputStream file = new FileInputStream(SHEET_PATH);
//        } catch (FileNotFoundException e) {
//            System.out.println("File not Found");
//        }
//
//        // Step 2 . Create a book
//        try {
//            book = WorkbookFactory.create(file);// re
//        } catch (Exception e) {
//            System.out.println("Either file not found");
//        }

        //
        FileInputStream file = null;
        try {
            file = new FileInputStream(SHEET_PATH);
            book = WorkbookFactory.create(file);
            sheet = book.getSheet(sheetName);

        } catch (IOException e) {
            System.out.println("Either File Not Found! or workbook not created!");
        }
        // Excel File is static, static file to stream conversion used by memory
        // memory can only read the stream(continue flow of data)
        // they cannot read the satic file we need to convert static into stream where input/output stream where jvm can use it
        //SHEET_PATH -> static file
        // using this FileInputStream -> converted into stream

        // 2-D data
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

        for(int i =0;i<sheet.getLastRowNum();i++){// 0 to 4
            for(int j =0; j< sheet.getRow(0).getLastCellNum();j++){
                // first row emaul, password -> column name -> skip ->header
                data[i][j]=sheet.getRow(i+1).getCell(j).toString();


            }
        }

        return data;
    }




}
