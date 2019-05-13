package DynamicDataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelToDataProvider 
{
	ExcelApiTest eat = null;
	String xlFilePath = "F:\\NEW_WORKSPACE\\Demo\\JavaBooks.xlsx";
	String sheetName = "Sheet1";
	
	@Test(dataProvider= "userData")
	public void fillUserForm(String bookname, String authorName, String copies)
	{
		System.out.println("BOOK NAME: " + bookname);
		System.out.println("AUTHOR NAME: " + authorName);
		System.out.println("No. of Copies: " + copies);
		
		System.out.println("************************************************");
		
	}
	
	@DataProvider(name = "userData")
	public Object [][] userFormData() throws Exception
	{
		Object [] [] data = testdata(xlFilePath, sheetName);
		return data;
	}
	
	public Object [] [] testdata(String xlFilePath, String sheetName) throws Exception
	{
		Object [][] excelData = null;
		eat = new ExcelApiTest(xlFilePath);
		
		int rows = eat.getRowCount(sheetName);
		int column = eat.getColumnCount(sheetName);
		
		excelData = new Object[rows-1][column];
		
		for(int i = 1 ;i<rows;i++)
		{
			for(int j = 0; i<column;j++)
			{
				excelData[i-1][j] = eat.getCellData(sheetName, j, i);
			}
		}
		return excelData;
	}
}
