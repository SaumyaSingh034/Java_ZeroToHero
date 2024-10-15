package interview_14Oct_2024;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReadData {
    public static void main(String[] args){
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/DataSheet.xlsx");
            readDataFromExcelFile(fis);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static void readDataFromExcelFile(FileInputStream fis){
        try {
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);
            for(Row row : sheet){
                for(Cell cell : row){
                    cell.getStringCellValue();
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
