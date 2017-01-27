package com.wbl.base;

import com.wbl.helper.PageDriver;

public abstract class BasePage {
	  public PageDriver  driver;
	public BasePage(PageDriver  driver)
	{
		this.driver=driver;
		driver.get("http://www.whiteboxqa.com/");
		}

}
