package Module_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AZ3_PwdPage
{
   @FindBy(xpath = "//input[@id='ap_password']") private WebElement pwd;
   @FindBy(xpath = "//input[@id='signInSubmit']") private WebElement SignIn;
   
   AZ3_PwdPage(WebDriver driver)
   {
	  PageFactory.initElements(driver, this); 
   }
   public void enterpassword(String password) 
   {
	   pwd.sendKeys(password);
	
   }
   public void ClickOnSign() 
   {
	SignIn.click();
   }
}
