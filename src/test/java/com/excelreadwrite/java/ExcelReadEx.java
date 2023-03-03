package com.excelreadwrite.java;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.time.DateUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadEx {
	public static void main(String[] args) throws IOException  {
		File file=new File("D:\\AR\\SOFTWARE TESTING NOTES\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wk=new XSSFWorkbook(fis);
		Sheet sheet = wk.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(2);
		//System.out.println(cell);
		CellType cellType = cell.getCellType();
		if (cellType==CellType.STRING) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println( stringCellValue);
			}
		else if (cellType==CellType.NUMERIC) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
				String format = sdf.format(dateCellValue);
				System.out.println(format);
				}
			else {
				double numericCellValue = cell.getNumericCellValue();
				System.out.println(numericCellValue);
			}
		}
		}

}
