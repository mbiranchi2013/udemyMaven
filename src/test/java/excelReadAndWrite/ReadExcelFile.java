package excelReadAndWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelFile {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\PAPU\\Desktop\\newWrite.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook workbook = WorkbookFactory.create(fi);
		Sheet sheet = workbook.getSheetAt(0);
		// Row row=sheet.getRow(0);
		// Cell cellA=row.getCell(0);
		// Cell cellB=row.getCell(1);
		// cellC=row.getCell(2);
		// System.out.println("Cell values are:"+cellA+" "+cellB+" " +cellC );
		for (Row row : sheet) {
			for (Cell cell : row) {
				if (cell.getCellType().equals(CellType.STRING)) {
					System.out.print(cell.getStringCellValue()+"\t");
				} else if ((cell.getCellType().equals(CellType.NUMERIC))) {
					System.out.print(cell.getNumericCellValue()+"\t");
				} else if ((cell.getCellType().equals(CellType.BLANK))) {
					System.out.print("Blank"+"\t");
				}
			}
			System.out.println();
		}
fi.close();
	}

}
