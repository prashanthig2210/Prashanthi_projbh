package keyworddriven;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;

public class Testrunner extends Adactin{

	static Keyword keywordobj = new Keyword(); 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		initdriver();
		
	for(Row row:workbook1.getSheet("Testcase"))
	{
		if( row==workbook1.getSheet("Testcase").getRow(0))
			continue;
		String locator = row.getCell(0).getStringCellValue();
		String locatorvalue = row.getCell(1).getStringCellValue();
		String keyword = row.getCell(2).getStringCellValue();
		String parameter;
		if(row.getCell(3)!=null)
			parameter = row.getCell(3).getStringCellValue();
		else
			parameter="";
		Keyword.performAction(locator,locatorvalue,keyword,parameter);
	}
	}
	
	
}
