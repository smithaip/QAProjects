package com.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;

public class Locators {
	static HashMap<String,String> locators;
	
	public static void readLocators()
	{
		
		Properties prop = new Properties();
		FileReader fr;
		locators = new HashMap<>();
		try {
			fr = new FileReader(new File("locators.properties"));
			prop.load(fr);
			for(Map.Entry val : prop.entrySet())
			{
				String key = (String)val.getKey();
				String value = (String)val.getKey();
				locators.put(key, value);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
public static By get(String key)
{
	if(key.contains("_"))
	{
		String[] val = key.split("_");
		if(val[0].equals("css"))
		{
			return By.cssSelector(locators.get(key));
		}
		else if(val[0].equals("xpath"))
		{
	return By.xpath(locators.get(key));
		}
		else if(val[0].equals("id"))
		{
	return By.id(locators.get(key));
		}
		else if(val[0].equals("name"))
		{
	return By.name(locators.get(key));
		}
		else if(val[0].equals("link"))
		{
	return By.linkText(locators.get(key));
		}
		else if(val[0].equals("plink"))
		{
	return By.partialLinkText(locators.get(key));
		}
		else if(val[0].equals("class"))
		{
	return By.className(locators.get(key));
		}
		else if(val[0].equals("tag"))
		{
	return By.tagName(locators.get(key));
		}
	}
	return By.cssSelector(locators.get(key));

}
}
