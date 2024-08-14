package Module_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AZ7_ApartmentPage 
{
	@FindBy(xpath = "//button[@id='ma-apartment-type-button-input']") private WebElement apartment;
	 
	AZ7_ApartmentPage(WebDriver driver)

	{
		PageFactory.initElements(driver, this);
	}
	public void ClickOnApartment() 
	{
		apartment.click();
		
	}
}
