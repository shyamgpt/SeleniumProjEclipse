
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//import com.google.common.collect.Table.Cell;

public class ReadingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		//In this we take the file which i have to read
		File f = new File("E:\\Selenium Jars\\filewriting\\myExcelFile.xlsx");
		
		//In this we load the above file -->
        FileInputStream fi = new FileInputStream(f);
        
        
        // Creating the connection with the above file-->
        Workbook workbook = WorkbookFactory.create(fi);
        
        Sheet sheet0 = workbook.getSheetAt(0);
        
//        Row row0 = sheet0.getRow(0);
//        Cell cellA = row0.getCell(0);
//        System.out.println(cellA);
        
        for(Row row : sheet0) {
        	
        	for(Cell cell: row) {
        		
        		switch(cell.getCellType()) 
        		{
        		case STRING:
        			System.out.print(cell.getStringCellValue()+ "\t");
        			break;
        		case NUMERIC:
        			System.out.print(cell.getNumericCellValue()+ "\t");
        			break;
        		case BOOLEAN: 
        			System.out.print(cell.getBooleanCellValue()+ "\t");
        			break;
        		case BLANK:
        			System.out.print("Blank cell"+"\t");
				default:
					break;
        		}
        		
        	}
        	System.out.println();
        }
        
	}

}
