package amazon.maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart 
{
	WebDriver driver;
	@FindBy(id="add-to-cart-button")
	WebElement addcart;

	public void addcart1() throws InterruptedException 
	{
		Thread.sleep(3000);
		addcart.click();
		
	}
	
	public Addtocart (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
}

