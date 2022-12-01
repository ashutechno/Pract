package practicedata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exp2 {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\ASHISH\\Desktop\\Parameterization\\demo.xlsx");
		
		XSSFWorkbook book=new XSSFWorkbook(file);
		
		XSSFSheet sheet=book.getSheet("sheet2");
		
		XSSFRow row=sheet.getRow(0);
		
		XSSFCell col=row.getCell(1);
		
		String str=col.getStringCellValue();
		
		System.out.println(str);
		

	}

}
