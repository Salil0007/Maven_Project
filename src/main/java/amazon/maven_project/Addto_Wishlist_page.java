package amazon.maven_project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addto_Wishlist_page 
{
	WebDriver driver;
	@FindBy( xpath = "(//span[@class='rush-component s-latency-cf-section']/div/div)[9]")
	WebElement Toys;
	public void toys(WebDriver driver) 
	{
		Toys.click();
		Set <String> s1= driver.getWindowHandles();
        Iterator <String> i1= s1.iterator();
        String id1= i1.next();
        String id2= i1.next();
        
        driver.switchTo().window(id2);
     }
	
	public Addto_Wishlist_page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
