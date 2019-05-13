package DynamicDataProvider;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelApiTest 
{
	public FileInputStream fis = null;
	public XSSFWorkbook wb = null;
	public XSSFSheet sht = null;
	public XSSFRow row = null;
	public XSSFCell cell = null;
	
	
	public ExcelApiTest(String excelFilePath) throws Exception
	{
		fis = new FileInputStream(excelFilePath);
		wb = new XSSFWorkbook(fis);
		fis.close();
	}
	
	@SuppressWarnings("deprecation")
	public String getCellData(String sheetName, int colNum, int rowNum)
	{
		
		try 
		{
			sht = wb.getSheet(sheetName);
			row = sht.getRow(rowNum);
			cell = row.getCell(colNum);
			
			if(cell.getCellTypeEnum() == CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else if(cell.getCellTypeEnum() == CellType.NUMERIC || (cell.getCellTypeEnum() == CellType.FORMULA))
			{
				String cellValue = String.valueOf(cell.getNumericCellValue());
				if(HSSFDateUtil.isCellDateFormatted(cell))
				{
					SimpleDateFormat dt = new SimpleDateFormat("dd/mm/yy");
					Date date = cell.getDateCellValue();
					cellValue = dt.format(date);
				}
				return cellValue;
			}
			else if(cell.getCellTypeEnum() == CellType.BLANK)
			{
				return " " ;
			}
			else
			{
			return	String.valueOf(cell.getBooleanCellValue());
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return "No Matching Value..";
		}
		
	}
	
	public int getRowCount(String sheetName)
	   {
		sht = wb.getSheet(sheetName);
	       int rowCount = sht.getLastRowNum()+1;
	       return rowCount;
	   }
	 
	   public int getColumnCount(String sheetName)
	   {
		   sht = wb.getSheet(sheetName);
	       row = sht.getRow(0);
	       int colCount = row.getLastCellNum();
	       return colCount;
	   }

	
}
