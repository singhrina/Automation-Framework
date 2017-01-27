package com.wbl.test;
import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.base.BaseTest;
import com.wbl.pages.HomePage;

public class HomePageTest extends BaseTest{

	HomePage HP ;
	
		
	@BeforeClass
	public void Intilize()
	{ 
		 HP = new HomePage(driver); 
    }
	
	@Test
	public void TestcountSocialIcons()
	{
	  int actual =HP.countSocialIcons();
	  assertEquals(4, actual);
	}
	@Test
	public void TestLoginClick()
	{
	 String actual =HP.ClickLoginButton();
	 assertEquals("http://www.whiteboxqa.com/login.php", actual );
	}
	@AfterClass
	public void  quit()
	{
		driver.quit();
	}
	}
	