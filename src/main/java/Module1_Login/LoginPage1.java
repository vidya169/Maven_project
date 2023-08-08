package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	@FindBy(xpath = "//input[@id='userid']")private WebElement UID;
	@FindBy(xpath = "//input[@id='password']")private WebElement UPass;
	@FindBy(xpath = "//button[text()='Login ']")private WebElement login;
	
	
	public LoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void set_LoginPage1_id(String id)
	{
	UID.sendKeys(id);
	}
	public void set_LoginPage1_pass(String pass)
	{
		UPass.sendKeys(pass);
	}
	public void set_LoginPage1_loginn() 
	{
		
		login.click();
	}

}

