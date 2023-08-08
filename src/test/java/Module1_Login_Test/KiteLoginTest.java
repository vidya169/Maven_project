package Module1_Login_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;



import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.BaseClass;
import Library_Files.UtilityClass;
import Module1_Login.LoginPage1;
import Module1_Login.LoginPage2;
import Module1_Login.home_verify_page;

//sub class or TestClass

public class KiteLoginTest extends BaseClass
{
	LoginPage1 login1;           //declare globally
	LoginPage2 login2;
	home_verify_page home;
	int TCID;
	
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{		
		 initializeBrowser();
		 
		 login1=new LoginPage1(driver);                //initialize locally
		 login2=new LoginPage2(driver);
		 home=new home_verify_page(driver);				
	}
	
	
	@BeforeMethod
	public void loginToApp() throws EncryptedDocumentException, IOException 
	{
		login1.set_LoginPage1_id(UtilityClass.getPFData("UN"));
		login1.set_LoginPage1_pass(UtilityClass.getPFData("PWD"));
		login1.set_LoginPage1_loginn();
		login2.set_LoginPage2_pinn(UtilityClass.getPFData("PIN"));
		login2.set_LoginPage2_confimbtn();	
	}
	
	
	
	@Test
	public void VerifyUserID() throws EncryptedDocumentException, IOException
	{
		TCID=101;
		String actUserID=home.set_home_verify_page_verify_userid();
		String expUserID=UtilityClass.getTD(0, 2);
	Assert.assertEquals(actUserID, expUserID,"Failed: act & exp results are diff");
	
	}
	
	
	@AfterMethod
	public void logoutFromApp(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE) 
		{
			UtilityClass.captureScreenshot(driver, TCID);
		}
				
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.quit();		
	}
	
}