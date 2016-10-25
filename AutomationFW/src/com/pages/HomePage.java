package com.pages;
import java.util.List;
import org.openqa.selenium.WebElement;
import com.base.BasePage;
import com.util.PageDriver;

public class HomePage extends BasePage {
	String socialLinks = "css_social-links";
	String loginLink = " id_login-link";
	public HomePage(PageDriver  driver)
	{
		super(driver); 
	}
	
	/*public void  OpenPage()   
	{
		driver.get("http://www.whiteboxqa.com/");
		driver.maximize();
	}*/  
	
	 public int countSocialIcons()  
	 {
	 int count=0;
	 driver.maximize();
	 List<WebElement> links = driver.findElements(socialLinks);
     if(!links.isEmpty())
	 {
	 count =links.size(); 
	 }
	 return count;
	 }
	
	 public String ClickLoginButton() 
	 {
		 
		 driver.findElement(loginLink).click();
		return driver.getCurrentUrl(); 
		 
	 }
	
	
}
