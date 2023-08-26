package com.GPN.Utilitys;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;;

public class XLUtilis {
	public FileInputStream fi;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public String path;
	public String Data;
	
	public XLUtilis(String path) {
		this.path=path;
	}
	
	public int GetRowCount(String sheetname) throws IOException {
		fi = new FileInputStream(path);
		workbook = new XSSFWorkbook(fi);
		sheet = workbook.getSheet(sheetname);
		int TotalRow=sheet.getLastRowNum();
		workbook.close();
		fi.close();
		return TotalRow;
	}
	
	public int GetCellCount(String sheetname, int RowNum) throws IOException {
		fi = new FileInputStream(path);
		workbook = new XSSFWorkbook(fi);
		sheet = workbook.getSheet(sheetname);
		row =sheet.getRow(RowNum);
		int TotalColumn=row.getLastCellNum();
		workbook.close();
		fi.close();
		return TotalColumn;
	}
	
	public String GetCellData(String sheetname, int RowNum , int cellNum) throws IOException {
		fi = new FileInputStream(path);
		workbook = new XSSFWorkbook(fi);
		sheet = workbook.getSheet(sheetname);
		row = sheet.getRow(RowNum);
		cell = row.getCell(cellNum);
		DataFormatter formatter = new DataFormatter();	
		try {
		Data = formatter.formatCellValue(cell);
		}
		catch (Exception e) {
		Data = "";
		}
		workbook.close();
		fi.close();
		return Data;
	}
}
