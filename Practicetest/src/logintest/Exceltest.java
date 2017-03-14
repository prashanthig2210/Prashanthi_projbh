package logintest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Exceltest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//File f = new File("C:\\Users\\admin\\Downloads\\test.xlsx");
		//FileInputStream fis = new FileInputStream(f);
		
     XSSFWorkbook workbook1 = new XSSFWorkbook("C:\\Users\\admin\\Downloads\\test.xlsx");
     XSSFSheet sheet = workbook1.getSheetAt(0);
      /*int row =sheet.getLastRowNum();
      int column = sheet.getRow(0).getLastCellNum();
      for(int i=0;i<row;i++)
      {
    	  for(int j=0;j<column;j++)
    	  {
    		  System.out.print(sheet.getRow(i).getCell(j).getStringCellValue());
    		  System.out.print("\t");
    		
    	  }
    	  System.out.println("");
      }*/
     
     
      
      for(Row row:sheet)
      {
    	  for(Cell cell : row)
    	  {
    		  System.out.print(cell);
    	      System.out.print("\t");
    		  
      }
      System.out.println(" ");
      

	}
    //  fis.close();
}
}
