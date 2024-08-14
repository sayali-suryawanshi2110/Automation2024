package Module_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AZ4_HomePage 
{
	WebDriver driver;
  @FindBy(xpath = "//a[@id='nav-link-accountList']") private WebElement myacc;
  
  
  
  AZ4_HomePage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void ClickOnMyacc()
  {
	myacc.click();
  }

}
