package com.pages;

import com.base.BasePage;
import com.util.PageDriver;

public class LoginPage extends BasePage {
    String user = "id_username";
    String pwd = "id_pwd";
    String submit = "id_login";
    String logout = "id_logout";
   
	
	public LoginPage(PageDriver driver)
   {
    super(driver);
	}
 
   public boolean parformLogin(String uname, String pswd)
   {
	 
	   driver.maximize();
	   driver.findElement(user).sendKeys("uname");
	   driver.findElement(pwd).sendKeys("pswd");
	   driver.findElement(submit).click();
	   
	   return driver.findElement(logout).isDisplayed();

	   
	   
	   
	   
   }
  

}
