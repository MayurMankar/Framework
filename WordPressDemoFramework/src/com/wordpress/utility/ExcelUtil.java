package com.wordpress.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	
	//public class UtilIt {
		
		//static Workbook wb ;
		
		//static Sheet sheet;
		
		protected static XSSFWorkbook wb;
		protected static XSSFSheet sheet;
		
		//public static String filePath = "C:\\Users\\P10456619\\eclipse-workspace\\DataProvider_With_Excel" + "\\src\\TestData\\Test_Data_DataProvider.xlsx";
		
		
		public static String filePath = "C:\\Users\\P10462054\\Documents\\Shiv\\Test_Data_DataProvider.xlsx";
		
		
		public static Object[][] ExcelData(String sheetName) throws IOException, EncryptedDocumentException, InvalidFormatException, InvocationTargetException 
		
		
		{
			try {
			
			FileInputStream file = new FileInputStream(filePath);
					
				// wb = 	WorkbookFactory.create(file);
				 
			wb = new XSSFWorkbook(file);
			
				 sheet = wb.getSheet(sheetName);
				 
				 Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
						 
						 
						 for (int i = 0; i < sheet.getLastRowNum(); i++) {
							
							 for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
								
								 
								 data[i][j] = sheet.getRow(i+1).getCell(j).toString();
								 
							}
							 
						}
						 
						 return data;
			
			}
			catch(Exception e2)
			{
				throw new RuntimeException("Unexpected invocation exception :" +e2.getMessage());
				
				
			}
		}

	}

