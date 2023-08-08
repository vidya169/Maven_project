package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	
	@FindBy(xpath = "//input[@id='pin']")private WebElement UPIN;
	@FindBy(xpath = "//button[@type='submit']")private WebElement clickbtn;
	
	
	public  LoginPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void set_LoginPage2_pinn(String pin) 
	{
		UPIN.sendKeys(pin);
		
	}
	public void set_LoginPage2_confimbtn() 
	{
	clickbtn.click();	
	}
	
	
	

}
