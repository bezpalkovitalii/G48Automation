package Tests.UI;

import io.qameta.allure.*;
import org.junit.Test;

import static helpers.ExcelHelper.readDataFromExcelFile;
import static helpers.ExcelHelper.writeToExcelFileAndGet;

@Owner("Bezpalko")
@Severity(SeverityLevel.CRITICAL)

public class SomeTest {

    @Test
    public void readDataSomeExcel() {
        readDataFromExcelFile(System.getProperty("user.dir") + "\\src\\test\\resources\\test_data\\fileExcel.xls",
                "Sheet1").forEach(System.out::println);
    }

    @Test
    public void writeToExcel() {
        writeToExcelFileAndGet(System.getProperty("user.dir") + "\\src\\test\\resources\\test_data\\Write.xlsx",
                readDataFromExcelFile(System.getProperty("user.dir") + "\\src\\test\\resources\\test_data\\fileExcel.xls",
                        "Sheet1"));
    }

}
