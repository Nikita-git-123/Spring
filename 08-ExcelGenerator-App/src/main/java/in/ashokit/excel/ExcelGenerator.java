package in.ashokit.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import in.ashokit.dto.BookDto;

public class ExcelGenerator {
	
	public void generateExcel(List<BookDto> books) throws Exception{
		
		Workbook wb = new XSSFWorkbook();
		
		Sheet sheet = wb.createSheet("StudentData");
		
		Row headerRow = sheet.createRow(0);
		
		headerRow.createCell(0).setCellValue("Id");
		headerRow.createCell(1).setCellValue("Name");
		headerRow.createCell(2).setCellValue("Price");
		
		int dataRowIndex = 1;
		
		for(BookDto b : books) {
			
			Row dataRow = sheet.createRow(dataRowIndex);
			dataRow.createCell(0).setCellValue(b.getBid());
			dataRow.createCell(1).setCellValue(b.getBname());
			dataRow.createCell(2).setCellValue(b.getBprice());
			
			dataRowIndex++;
		}
		
		File f = new File("Books.xlsx");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		fos.close();
		wb.close();
		

	} 

}
