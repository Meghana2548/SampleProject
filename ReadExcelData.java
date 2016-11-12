package ReadExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File scr=new File("D:\\Friendly\\Exceldata\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(scr);
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("Sheet1");
		XSSFRow row=sh.getRow(0);
		XSSFCell cell=row.getCell(0);
		String data =cell.getStringCellValue();
		System.out.println("Data from excel is "+data);
		
		String pass=sh.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data from excel is "+pass);
		
		wb.close();
	}

}
