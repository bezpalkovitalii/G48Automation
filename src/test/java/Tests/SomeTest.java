package Tests;

import org.junit.Test;

import static helpers.ExcelHelper.readDataFromExcelFile;
import static helpers.ExcelHelper.writeToExcelFileAndGet;

public class SomeTest {

    @Test
    public void readDataSomeExcel(){
        readDataFromExcelFile("E:\\QA_Light\\G48_Automation_Bezpalko_№_4\\src\\test\\resources\\test_data\\fileExcel.xls",
                "Sheet1").forEach(System.out::println);
    }

    @Test
    public void writeToExcel(){
        writeToExcelFileAndGet("E:\\QA_Light\\G48_Automation_Bezpalko_№_4\\src\\test\\resources\\test_data\\Write.xlsx",
                readDataFromExcelFile("E:\\QA_Light\\G48_Automation_Bezpalko_№_4\\src\\test\\resources\\test_data\\fileExcel.xls",
                "Sheet1"));
    }

}
