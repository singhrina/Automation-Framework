package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	 static Object [][] data = null;
	public static Object[][] getuserdata()
  {
	try {
		FileInputStream fin = new FileInputStream(new File("userdata.xlsx"));//to read a excel file
		XSSFWorkbook book = new XSSFWorkbook(fin);// excel sheet read into xssfworkbook
		 Sheet sheet = book.getSheetAt(0); // to get the sheet from it
		 book.close();
		int rows = sheet.getLastRowNum();
		data = new Object[rows][2];
		int count = 0;
		for (int i = 1; i<rows;i++)
		{
			Row row = sheet.getRow(i);
			Iterator<Cell> cell =row.cellIterator();
			while (cell.hasNext());
			Cell c = cell.next();
			data [i][count]= c.getStringCellValue();
			count++;
		}
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  return data;
  }
}
