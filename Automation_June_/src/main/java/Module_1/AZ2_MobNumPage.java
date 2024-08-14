package Module_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AZ2_MobNumPage 
{
	@FindBy(xpath = "//input[@id='ap_email_login']") private WebElement mobNum;
	@FindBy(xpath = "//input[@type='submit']") private WebElement continuebutton;
	
	AZ2_MobNumPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
	public void EnterMob1(String Num) 
	{
		mobNum.sendKeys(Num);
		
	}
	
	public void ClickOnContinue() 
	{
		continuebutton.click();
	}
	

}
