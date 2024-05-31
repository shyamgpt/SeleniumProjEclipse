package ReadingExcelFileSDET_QA;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("E:\\Selenium Jars\\filewriting\\myExcelFile.xlsx");
		FileInputStream fis  = new FileInputStream(file);
		XSSFWorkbook wbk = new XSSFWorkbook(fis);
		XSSFSheet sheet = wbk.getSheetAt(0);
		
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		
		
		
		for(int r=0; r<=rows; r++) {
			
			XSSFRow row =sheet.getRow(r);
			
			for(int c =0; c<cols;c++) {
				XSSFCell cell = row.getCell(c);
				
				switch(cell.getCellType()) {
				case STRING:
					System.out.println(cell.getStringCellValue());
					break;
					
				case NUMERIC: 
					System.out.println(cell.getNumericCellValue());
					break;
					
				case BOOLEAN:
					System.out.println(cell.getBooleanCellValue());
					break;
					
				}
				
//				data[i][j] = formatter.formatCellValue(cell);
			}
			
			System.out.println();
			
			
		}
//		return data;

	}
	
	/*
	 * package parameterization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGParameterizationExcel {
	
	public static DataFormatter formatter = new DataFormatter();
	
	
	@Test(dataProvider="getData")
	public void testData(String username, String passowrd,String id) {
		System.out.println(username+"----"+passowrd+"-->"+id);
		
	}
	
	//C:\\Users\\Sumit\\Desktop\\Selenium Jars\\filewriting\\myExcelFile.xlsx
	
	
	@DataProvider
	public static Object[][] getData() throws IOException{
		
		File file = new File("C:\\Users\\Sumit\\Desktop\\Selenium Jars\\filewriting\\FileShyam.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wbk = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wbk.getSheetAt(0);
		
		XSSFRow row = sheet.getRow(0);
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		
		int colCount = row.getLastCellNum();
		
		Object[][] data = new Object[rowCount-1][colCount];
		
		for(int i =0; i<rowCount-1; i++) {
			
			row = sheet.getRow(i+1);
			
			for(int j =0; j<colCount; j++) {
				
				XSSFCell cell = row.getCell(j);
				
				
				
				data[i][j] = formatter.formatCellValue(cell);
				
			}
		}
		return data;
		
	}

}

	 * 
	 * 
	 * */

}
