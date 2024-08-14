package Module_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AZ6_addInstructionPage
{
     @FindBy(xpath = "//div[@class='a-section address-section-with-default']//a[@class='a-link-normal'][normalize-space()='Add delivery instructions']") private WebElement addInstruction;
     
     AZ6_addInstructionPage(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
     public void ClickOnAddInstruction() 
     {
    	 addInstruction.click();
		
	}
}
