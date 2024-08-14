package Library_Files;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass extends BaseClass
{

	//@author name: sayali
		//date:7/03/2024
		//this method is use to get test data from excel sheet
		//need to pass 2 inputs
		
		public static String getTestData(int rowIndex ,int collIndex) throws  IOException
		{
			FileInputStream file=new FileInputStream("C:\\Users\\Sayali\\OneDrive\\Desktop\\New folder\\selenium_Practice.xlsx");
		    Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		   String value = sh.getRow(rowIndex).getCell(collIndex).getStringCellValue();
			return value;
		}
		public static String getDataFromPropertyFile(String key) throws IOException 
		{
			FileInputStream file=new FileInputStream("C:\\Users\\Sayali\\eclipse-workspace\\Automation_June_2024\\src\\POM_DDF_TestNG_BaseClass_UtilityClass_PropertyFile\\June2024.properties");
			Properties p=new Properties();
			p.load(file);
			String value = p.getProperty(key);
			return value;
			
			
		}

}
