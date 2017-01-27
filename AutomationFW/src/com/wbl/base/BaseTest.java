package com.wbl.base;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.wbl.helper.Configuration;
import com.wbl.helper.Locators;
import com.wbl.helper.PageDriver;

public abstract class BaseTest {
	public PageDriver  driver;
	
	public static final Configuration config;
	static      
	{
	config = new Configuration();	
	}
	 
	@BeforeSuite
	public void setup()
	{
		this.driver = new PageDriver(config);
     	Locators.getElement();
	} 
	
	@AfterSuite
	public void quit()
	{
		driver.quit();
	}
	}
