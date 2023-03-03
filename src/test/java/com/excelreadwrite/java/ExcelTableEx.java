package com.excelreadwrite.java;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelTableEx {
	public static void main(String [] args) throws IOException {
		File file=new File("D:\\AR\\SOFTWARE TESTING NOTES\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wk=new XSSFWorkbook(fis);
		 Sheet sheet = wk.getSheet("Sheet1");
		 int noOfRows = sheet.getPhysicalNumberOfRows();
		 for (int i = 0; i <noOfRows; i++) {
			 Row row = sheet.getRow(i);
			 int noOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j <noOfCells; j++) {
			Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
			if (cellType==CellType.STRING) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			}
			else if (cellType==CellType.NUMERIC) {
				if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();	
				SimpleDateFormat sc=new SimpleDateFormat("dd-MMM-yyyy");
				String format = sc.format(dateCellValue);
				System.out.println(format);
				}
				else {
					double Value = cell.getNumericCellValue();
					long numericValue=(long) Value;
					System.out.println(numericValue);
				}
			}
			
			}
		}
	}

}
