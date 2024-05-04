package FileUtility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
 {
	public static String getCellData()
	{
		//we store src/test that particular line first we creac te a xcel in window page and copt to the xcel and past with "resource"option then write the where the cxel store
		//always xcel store in "resources" only
		FileInputStream file= new FileInputStream("./src/test/resources/Selenium.xlsm");
		 Workbook book=WorkbookFactory.create(file);
		 //always import the org.pachi.ss. only
		 Sheet sheet=book.getSheet("register");
		 Row row= sheet.getRow(5);
		 Cell cell=row.getCell(0);
		 
	}
}
}
