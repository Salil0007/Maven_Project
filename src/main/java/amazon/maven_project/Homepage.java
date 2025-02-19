package amazon.maven_project;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	WebDriver driver;
	@FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
	WebElement moverover;
	public void hoverover(WebDriver driver)
	{
		Actions a1= new Actions(driver);
		a1.moveToElement(moverover).perform();
	}
	
	
	@FindBy(xpath = "(//span[.='Sign in'])[1]")
	WebElement Signin;
	public void signin() 
	{
		Signin.click();
	}
	
	@FindBy( name= "email")
	WebElement username;
	public void un() 
	{
		username.sendKeys("9109429439");
	}
	
	@FindBy( id= "continue")
	WebElement next;
	public void Continue() 
	{
		next.click();
	}
	
	@FindBy( name = "password")
	WebElement password;
	public void pwd() 
	{
		password.sendKeys("125272611");
	}
	
	@FindBy( id= "signInSubmit")
	WebElement Next1;
	public void Continue1() 
	{
		Next1.click();
	}
	
	
	@FindBy( id= "twotabsearchtextbox")
	WebElement Searchtextbox;
	public void searchbox() 
	{
		Searchtextbox.sendKeys("Toys"+ Keys.ENTER);
		
		
	}
		
	@FindBy( id= "add-to-cart-button")
	WebElement Addtocart;
	public void addtocart() 
	{
		Addtocart.click();
	}
	
	@FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
	WebElement accdetails;
	public void accountdetails(WebDriver driver) throws InterruptedException
	{
		Actions a2= new Actions(driver);
		a2.moveToElement(accdetails).perform();
		Thread.sleep(3000);
	}
	
	@FindBy( linkText = "Sign Out")
	WebElement Signout;
	public void signout() throws InterruptedException 
	{
		Signout.click();
	}
	
	
	public Homepage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
