package Library_Files;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	 WebDriver driver;
	public void InitialiseBrowser() throws IOException 
	{
		driver=new ChromeDriver();
		driver.get(UtilityClass.getDataFromPropertyFile("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		
	}
}
