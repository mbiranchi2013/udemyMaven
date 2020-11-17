package excelReadAndWrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("UdemySheet1");
		// XSSFRow row0=sheet.createRow(0);
		// XSSFRow row1=sheet.createRow(1);
		// Cell cellA=row0.createCell(0);
		// cellA.setCellValue("Name");
		// Cell cellB=row0.createCell(1);
		// cellB.setCellValue("Surname");

		// Cell cellC=row1.createCell(0);
		// cellA.setCellValue("Biranchi");
		// Cell cellD=row1.createCell(1);
		// cellB.setCellValue("Panda");
		for (int rows = 0; rows < 10; rows++) {
			Row row = sheet.createRow(rows);
			for (int cols = 0; cols < 10; cols++) {
				Cell cell = row.createCell(cols);
				cell.setCellValue((int) (Math.random() * 100));
			}
		}

		File f = new File("C:\\Users\\PAPU\\Desktop\\newWrite.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		workbook.write(fo);
		fo.close();
		System.out.println("Excel File is Written");
	}

}
