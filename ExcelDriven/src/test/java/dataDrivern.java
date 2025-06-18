import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDrivern {

	public ArrayList<String> getdata(String testcaseName) throws IOException {
		ArrayList<String> a = new ArrayList<String>();

		// File Input Stream for Read file
		FileInputStream fis = new FileInputStream("C:\\Users\\Safwan\\Downloads\\Test Cases.xlsx");

		// To Access the Excel Sheet
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// To Get the number sheet
		int sheets = workbook.getNumberOfSheets();

		// To Reach to the Desired Sheet
		for (int i = 0; i < sheets; i++) {

			if (workbook.getSheetName(i).equalsIgnoreCase("Testdata")) {
				XSSFSheet sheet = workbook.getSheetAt(i);

				// To Iterate through the desired Row

				Iterator<Row> rows = sheet.iterator();// Sheet collection of Row
				Row firstrow = rows.next(); // To Traverse through the 1st Row need to use Next Options
				Iterator<Cell> cells = firstrow.cellIterator();// Row is collection of Cells

				int k = 0;
				int column = 0;
				while (cells.hasNext()) {
					Cell value = cells.next();
					if (value.getStringCellValue().equalsIgnoreCase("TestCases")) {
						// Desired Column
						column = k;

					}
					k++;
				}
				System.out.println(column);

				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName)) {
						// Grab all the data from Purchase Row
						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) {
							
							Cell c = cv.next();
							if(c.getCellType()==CellType.STRING)
							{
							// System.out.println(cv.next().getStringCellValue());
							a.add(c.getStringCellValue());
							}
							else
							{
							a.add(NumberToTextConverter.toText(c.getNumericCellValue()));	
							}
												
						}
					}
					
				}
				
			}

		}
		return a;

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	}
}