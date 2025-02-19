package amazon.maven_project;

import org.testng.annotations.Test;

public class Testcase4 extends LaunchQuit
{

	@Test
	public void add_product_in_cart() throws InterruptedException
	{
		Homepage homepage= new Homepage(driver);
		homepage.hoverover(driver);
		homepage.signin();
		homepage.un();
		homepage.Continue();
		homepage.pwd();
		homepage.Continue1();
		homepage.searchbox();
		Addto_Wishlist_page List= new Addto_Wishlist_page(driver);
		List.toys(driver);
		Addtocart cart= new Addtocart(driver);
		cart.addcart1();
		homepage.accountdetails(driver);
		homepage.signout();
		
		
	}
}
