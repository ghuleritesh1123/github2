package Webdriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String args[]) throws Exception {
		
		FileInputStream fis = new FileInputStream("C:\\FileExcel\\123.xlsx");
	  
		XSSFWorkbook wb = new XSSFWorkbook(fis);
	   
		XSSFSheet st = wb.getSheet("test");
	    
		System.out.println(st.getSheetName());
	    
		System.out.println(st.getLastRowNum());
	
		System.out.println("Before updating Cell Data "+ st.getRow(1).getCell(1));
		
	    // Write the data to excel file
	    XSSFCell cell =  st.getRow(2).getCell(1);
	    cell.setCellValue("rit111");
	    fis.close();
	    
	    FileOutputStream fileOut = new FileOutputStream("C:\\FileExcel\\123.xlsx");
	    wb.write(fileOut);
	    System.out.println("Updated data after write is done " + cell.getStringCellValue());
	    fileOut.close();
	   
		
	}

}
