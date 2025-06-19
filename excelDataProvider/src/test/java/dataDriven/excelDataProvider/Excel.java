package dataDriven.excelDataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel {
	
	@Test
	public void getData() throws IOException
	{
			
		//To Read the data from Excel File with Multidimensional Array
		FileInputStream fis = new FileInputStream("C:\\Users\\Safwan\\Downloads\\TestNG.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("Total Number of Row : " + rowcount);
		
		XSSFRow row = sheet.getRow(0);
		int colcount = row.getLastCellNum();
		System.out.println("Total Number of Column : " +colcount );
		
		Object Data[][] = new Object [rowcount-1][colcount];
		
		for (int i=0;i<rowcount-1;i++)
		{
			System.out.println("Outer Loop Started");
			row = sheet.getRow(i+1);
			
			for (int j=0;j<colcount;j++)
			{
				
				System.out.println(row.getCell(j));
			}
			System.out.println("Outer Loop Ended");
		}
		//return data;
	}

}
