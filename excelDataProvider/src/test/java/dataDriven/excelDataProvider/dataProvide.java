package dataDriven.excelDataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class dataProvide {
	
	@Test(dataProvider="driverTest")
	public void testCaseData(String Greetings,String Communication,int id)
	{
		System.out.println(Greetings+Communication+id);
		
	}
	//Multiple sets of data to our test
	//arraypublic
	// 5 Sets of data 
	
	@DataProvider(name="driverTest")
	public Object[][] getData()
	{
		
		Object[][] data = {{"Hello","text",1},{"bye","message",143},{"Solo","Call",453}};
		return data;
	}
	
	

}
