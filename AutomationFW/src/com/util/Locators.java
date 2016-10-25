package com.util;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;



public class Locators{ 
	public static HashMap<String, String> loc = new HashMap<>();

	public static void getElement()
	{
		Properties p = new Properties();
		try {
			FileReader reader = new FileReader("locaters.properties");
			p.load(reader);  
			for(Map.Entry val:p.entrySet())
			{
				String key = (String)val.getKey();
				String value = (String)val.getValue();
				loc.put(key,value);
			}
			} catch (Exception e) {
		
			e.printStackTrace();
			}
		
	}
	public static By get(String key)
	{
	      if(key.contains("_"))
		   {
		   String[]val = key.split("_");
			if(val[0].equals("css"))
			{
			return By.cssSelector(loc.get(key));
			}
			else if(val[0].equals("xpath"))
			{
			return By.xpath(loc.get(key));
			}
			else if(val[0].equals("id"))
			{
			return By.id(loc.get(key));
			}
			else if(val[0].equals("name"))
			{
			return By.name(loc.get(key));
			}if(val[0].equals("link"))
			{
			return By.linkText(loc.get(key));
			}if(val[0].equals("plink"))
			{
			return By.partialLinkText(loc.get(key));
			}if(val[0].equals("class"))
			{
			return By.className(loc.get(key));
			}if(val[0].equals("tag"))
			{
			return By.tagName(loc.get(key));
			}
			}
		   return By.cssSelector(loc.get(key));
	}
	

	
	

}
