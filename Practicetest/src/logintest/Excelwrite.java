package logintest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelwrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
  File f = new File("C:\\Users\\admin\\Downloads\\excelwrite.xlsx");
  FileInputStream fis =new FileInputStream(f);
  XSSFWorkbook workbook = new XSSFWorkbook(fis);
  XSSFSheet sheet = workbook.getSheetAt(0);
  fis.close();
  sheet.createRow(0).createCell(0).setCellValue("test");
  FileOutputStream fos = new FileOutputStream(f);
  workbook.write(fos);
  fos.close();
	}

}
