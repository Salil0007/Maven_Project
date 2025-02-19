package amazon.maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage 
{
	WebDriver driver;
	
	@FindBy( id = "add-to-wishlist-button-submit")
	WebElement Addtowishlist;
	public void addwishlist() throws InterruptedException 
	{
		Addtowishlist.click();
		Thread.sleep(3000);
	}
	
	@FindBy( xpath = "(//span[.='Continue shopping'])[1]")
	WebElement Continueshoping;
	public void closewishlist() 
	{
		Continueshoping.click();
	}
	
	
	
	public Productpage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
