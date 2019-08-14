package com.crm.qa.testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class GetTestData {
	
	public static Object[][] getTestData() throws IOException {
		Object [][] data=new Object[2][3];
		File f=new File("C:\\Users\\x243469\\eclipse-workspace\\PageObectPractice\\src\\main\\java\\com\\crm\\qa\\testdata\\CreateNewContact.xlsx");
		
			FileInputStream fis=new FileInputStream(f);
			
				
				Workbook w=new XSSFWorkbook(fis);
				Sheet sheetname= w.getSheet("CreateNewContact");
				 
				for(int i=0;i<sheetname.getLastRowNum();i++) {
					Row r=sheetname.getRow(i+1);
					int rowvalues=r.getLastCellNum();
					
					for(int j=0;j<rowvalues;j++) {
						 data[i][j] =r.getCell(j).getStringCellValue();
						
					}
				}
			
		
		 return data;
	}

}
