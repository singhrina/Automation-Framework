package com.base;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.util.Configuration;
import com.util.Locators;
import com.util.PageDriver;

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
