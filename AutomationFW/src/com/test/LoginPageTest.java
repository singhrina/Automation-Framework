package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import com.base.BaseTest;
import com.pages.LoginPage;
import com.util.ExcelUtil;

public class LoginPageTest extends BaseTest{
	
    LoginPage LP;

    @BeforeClass
    public void Initilize()
    {
    	LP = new LoginPage(driver);
    }
    @DataProvider(name= "user-data")
    public Object [][] getuserdata()
    {
        Object[][] data = ExcelUtil.getuserdata();
    	return data;
    }    
    @Test(dataProvider="user-data")
    public void testLogin(String uname,String pws)
    {
    	
    	AssertJUnit.assertTrue(LP.parformLogin(uname, pws ));
    }
   @AfterClass
	public void  quit()
	{
		driver.quit();
	}

}
