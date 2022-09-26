package acproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AcceProject1 {

	public XSSFSheet Exelsheet() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Vikram\\Desktop\\Data.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		int columncount = sheet.getRow(0).getLastCellNum();

		System.out.println("total rows:  " + rowcount + "  Total column:  " + columncount);
		XSSFRow celldata=null;
		
		

			 celldata = sheet.getRow(0);

			String testcaseName = celldata.getCell(0).getStringCellValue();
			String Suggetion = celldata.getCell(1).getStringCellValue();
			String Alert = celldata.getCell(2).getStringCellValue();

			System.out.println(testcaseName + " " + Suggetion + " " + Alert);

		
		return sheet;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
