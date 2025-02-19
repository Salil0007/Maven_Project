package amazon.maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchQuit 
{

	WebDriver driver;
	@BeforeMethod
	public void Launch()
	{
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	}
	
	 @AfterMethod
	public void Quit() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
		
	} 
}
