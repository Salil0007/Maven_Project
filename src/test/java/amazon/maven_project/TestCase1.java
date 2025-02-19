package amazon.maven_project;

import org.testng.annotations.Test;

public class TestCase1 extends LaunchQuit
{

	@Test
	public void amazon_login_logout() throws InterruptedException
	{
		
		
		Homepage homepage= new Homepage(driver);
		homepage.hoverover(driver);
		homepage.signin();
		homepage.un();
		homepage.Continue();
		homepage.pwd();
		homepage.Continue1();
		homepage.searchbox();
		homepage.accountdetails(driver);
		homepage.signout();
		
		
		
		
	}
}
