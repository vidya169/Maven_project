package Library_Files;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//super class

public class BaseClass 
{
	public WebDriver driver;
	public void initializeBrowser() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12thMaven_Project\\Browser\\chromedriver.exe");
				
	    driver=new ChromeDriver();
	   
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		 driver.get("https://kite.zerodha.com/");
		//driver.get(UtilityClass.getPFData("URL"));		
	}

}

