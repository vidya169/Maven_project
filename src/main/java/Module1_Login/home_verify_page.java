package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home_verify_page {

	
	@FindBy(xpath = "//span[text()='VS6640']")private WebElement verifyid;
	
	public home_verify_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public String set_home_verify_page_verify_userid()
	{
		String actrelt = verifyid.getText();
		return actrelt;
	}
	
}
