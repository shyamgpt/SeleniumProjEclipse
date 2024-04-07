import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import com.google.common.collect.Table.Cell;

public class WritingExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet0 = workbook.createSheet("First Sheet");
		
//		Row row0 = sheet0.createRow(1);
//		
//		Cell cellA = row0.createCell(0);
//		Cell cellB = row0.createCell(1);
//		
//		cellA.setCellValue("first cell");
//		cellB.setCellValue("second cell");
//		
		
		for(int rows=0; rows<10; rows++) {
			
			Row row = sheet0.createRow(rows);
			for(int cols =0; cols<10; cols++) {
				
				Cell cell = row.createCell(cols);
				cell.setCellValue((int)(Math.random()*100));
			}
		}
		
		//Connecting streams
	
		// This will create a new file at given location-->
		File f = new File("C:\\Users\\Sumit\\Desktop\\Selenium Jars\\filewriting\\myExcelFile.xlsx");
		
		//This will be needed for writing the in the file-->
		FileOutputStream fo = new FileOutputStream(f);
		
		//Here we will reference of workbook to write into it -->
		workbook.write(fo);
		
		
		//Closing streams -->
		fo.close();
		
		
		System.out.println("file created !!!");
		
		
		
		

	}

}
