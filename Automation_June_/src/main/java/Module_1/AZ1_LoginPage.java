package Module_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AZ1_LoginPage 
{
	//step1=declaration
	@FindBy(xpath = "//a[@id='nav-link-accountList']") private WebElement SignIn ;
	
	//step2=initialisation
	AZ1_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//step3=usage
	public void ClickOnSignIn()
	{
		SignIn.click();
		
	}
	
	
	
}
