package Module_1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.UtilityClass;


public class AZ8_TestClass  
{    
	//declare globally
	  AZ1_LoginPage login;
	  AZ2_MobNumPage mob;
	  AZ3_PwdPage pwd;
	  AZ4_HomePage home;
	  AZ5_AddressPage add;
	  AZ6_addInstructionPage instruct;
	  AZ7_ApartmentPage apartment;
	  
	  Sheet sh;
	  
	 
	  @BeforeClass
	  public void OpenBrowser() throws EncryptedDocumentException, IOException 
	{
		
		
	    InitialiseBrowser();
		 
		  login=new AZ1_LoginPage(driver);
		  mob=new AZ2_MobNumPage(driver);
		  pwd=new AZ3_PwdPage(driver);
		  home=new AZ4_HomePage(driver);
		  add=new AZ5_AddressPage(driver);
		  instruct=new AZ6_addInstructionPage(driver);
		  apartment=new AZ7_ApartmentPage(driver);
	}
	  
	  @BeforeMethod
	  public void loginToApp() throws InterruptedException                           //preconditions
, EncryptedDocumentException, IOException
	  {
		  login.ClickOnSignIn();
		  Thread.sleep(1000);
		  mob.EnterMob1(UtilityClass.getDataFromPropertyFile("MobNum"));
		  mob.ClickOnContinue();
		  Thread.sleep(1000);
		  pwd.enterpassword(UtilityClass.getDataFromPropertyFile("pwd"));
		  pwd.ClickOnSign();
		
	 }
	  @Test
	  public void VerifyInstructionClick() 
	  {
		  home.ClickOnMyacc();
		  add.ClickOnAddress();
		  instruct.ClickOnAddInstruction();
		  apartment.ClickOnApartment();
		  
		
	   }
	  @Test
	  public void TC1() 
	  {
		  
		
	}
	  @Test
	  public void TC2() 
	  {
		  
		
	}
	  @Test
	  public void TC3() 
	  {
		  
		
	}
	 
	  @AfterMethod
	  public void LogoutFromApp()
	 {
		
	 }
	  @AfterClass
	  public void Closebrowser() 
	  {
		  driver.quit();
	  }
	
	
}
