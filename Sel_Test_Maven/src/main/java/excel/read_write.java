package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class read_write {
	
	@Test
	public void test1() throws IOException
	{
		File f = new File("C:\\Users\\DELL\\Desktop\\Aarush Grade 5\\Debit Card Survey (Responses).xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet xsheet = book.getSheetAt(0);
		int row = xsheet.getLastRowNum();
		System.out.println("number of rows"+row);
		int column=xsheet.getRow(0).getLastCellNum();
		System.out.println("number of columns"+column);
		
		XSSFCell cell = xsheet.getRow(0).getCell(0);
		System.out.println(cell);
		
		System.out.println("all names");
		
		for(int i=0;i<=row;i++)
		{
			XSSFCell namecell= xsheet.getRow(i).getCell(1);
			System.out.println(namecell);
		}
		
		xsheet.getRow(18).createCell(10).setCellValue("sangeetha");
		FileOutputStream fos= new FileOutputStream(f);
		book.write(fos);
		
		
	}

}
