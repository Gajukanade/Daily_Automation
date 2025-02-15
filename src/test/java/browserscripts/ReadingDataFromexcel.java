package browserscripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromexcel {
	public static void main(String[] args) throws IOException {
		String excelPath = "D:\\automation jar files\\Book1.xlsx";
		
		FileInputStream fi = new FileInputStream(excelPath);
		
		Workbook workbook =  new XSSFWorkbook(fi);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
		for(int i =0;i<sheet.getLastRowNum();i++) {
			Row row = sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++) {
				Cell cell = row.getCell(j);
				
				System.out.println(cell.toString()+" ");
			}
			System.out.println();
		}
		workbook.close();
		fi.close();
	}

}
