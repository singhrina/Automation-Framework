package com.util;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PageDriver { 
	                      
	WebDriver driver;
	 Configuration configuration;
	 public PageDriver(Configuration config) 
	 {
		this.configuration = config;	
		initilizebrowser();
	} 
	 
	 public void initilizebrowser()
	 {
		String browser = configuration.BROWSER; 
		switch (browser)
		{
	     case "firefox":
			driver = startFirefox();
			break;
		case "chrome":
			driver = startChrome();
			break;
		case "IE":
			driver = startIE();
			break;
		default:
			driver = startChrome();
			break;
				}
		 driver.get(configuration.URL);
		 driver.manage().window().maximize();
		 }

	public WebDriver startFirefox()
	{
		return new FirefoxDriver();
	}
	public WebDriver startChrome()
	{
		System.setProperty("webDriver.chrome.driver", "lib/chromedriver.exe"); 
		return new ChromeDriver();
	}
	public WebDriver startIE()
	{
		System.setProperty("webDriver.IE.driver", "lib/IEDriverServer.exe"); 
		return new InternetExplorerDriver();
	}
	/*public WebDriver startHtml()
	{
		return new HtmlUnitDriver();
	}*/
	public void get(String url)
	{
		driver.get(url);
	}
	public WebElement findElement(String loc) 
	{
		return driver.findElement(Locators.get(loc));   
	}
	public List<WebElement> findElements(String loc)
	{
		return driver.findElements(Locators.get(loc));
	}
	public String getCurrentUrl()
	{
		return driver.getCurrentUrl();
	}
	public void maximize()
	{
		driver.manage().window().maximize();
	}
	public void quit() 
	{
	driver.quit();
	}

}
