package TestLayer;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;

public class LoginPageTest  extends BaseClass{

	@BeforeTest
	public void setup()
	{
		BaseClass.intialize();
	}
	@Test
	public void validateloginfunctionality()
	{
		LoginPage loginpage=new LoginPage();
		
		loginpage.loginpagefunctionality("vijayshri@gmail.com", "vijayshri","pawar","India","Other"
				,"abbc");
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}

}
