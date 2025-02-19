package amazon.maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchQuit 
{

	WebDriver driver;
	@BeforeMethod
	public void Launch()
	{
		 driver= new EdgeDriver();
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
