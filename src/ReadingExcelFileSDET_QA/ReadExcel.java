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
		
		// Read the file from file path
		File file = new File("E:\\Selenium Jars\\filewriting\\myExcelFile.xlsx");
		
		//Convert file to fileInputStream format(A format which java understand)
		FileInputStream fis  = new FileInputStream(file);
		
		//XSSF (XML SpreadSheet format) --> i.e FileInputStream
		
		//Create a workbook instance holding the reference of fileName.xlsx file
		XSSFWorkbook wbk = new XSSFWorkbook(fis);
		
		// Get desired sheet from workbook
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
					
				default:
					System.out.println("NaN");
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
	
	/*
	 * Code from Real Frame work -->
	 * 
	 * public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}

	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */

}
