package Module_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AZ5_AddressPage 
{
	@FindBy(xpath = "//*[@id=\"a-page\"]/div[1]/div/div[3]/div[1]/a/div/div/div/div[2]/h2") private WebElement Address;
	
	AZ5_AddressPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	public void ClickOnAddress()
	{
		Address.click();
		
	}

}
