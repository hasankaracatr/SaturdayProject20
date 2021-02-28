import org.apache.poi.ss.usermodel.*;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;

public class ExcelReadExample {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\HASAN KARACA\\Downloads\\SheetJS.xlsx");
        Workbook workbook = WorkbookFactory.create(file);
        Sheet sheet1 = workbook.getSheet("Sheet1");
        Row row = sheet1.getRow(4);
        Cell cell = row.getCell(2);
        System.out.println(cell.toString());
        Assert.assertEquals(cell.toString(),"Айше Йылдыз");
    }
}