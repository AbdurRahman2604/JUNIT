package com.excelreadwrite.java;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteEx {
	public static void main(String[] args) throws IOException {
		File file=new File("D:\\AR\\SOFTWARE TESTING NOTES\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wk=new XSSFWorkbook(fis);
		// To write in excel
		//Sheet createSheet = wk.createSheet("Sheet2");
		//Row createRow = createSheet.createRow(0);
		//Cell createCell = createRow.createCell(1);
		//createCell.setCellValue("aiite");
		// To update in excel
		Sheet sheet = wk.getSheet("Sheet2");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(1);
		cell.setCellValue("academy");
		FileOutputStream fos=new FileOutputStream(file);
		wk.write(fos);
		wk.close();
}
}