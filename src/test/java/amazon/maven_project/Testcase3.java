package amazon.maven_project;

import org.testng.annotations.Test;

public class Testcase3 extends LaunchQuit
{
	@Test
	public void productadd() throws InterruptedException {
		
	
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
	Productpage wish= new Productpage(driver);
	wish.addwishlist();
	wish.closewishlist();
	homepage.accountdetails(driver);
	homepage.signout();
}
}