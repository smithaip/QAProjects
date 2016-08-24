package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.util.Configuration;
import com.util.PageDriver;

public abstract class BaseTest {
	public PageDriver driver;
	public static final Configuration config;
	static {
		config = new Configuration();
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
	this.driver = new PageDriver(config);
	}
     @AfterSuite
   public void afterSuite()
    {
	   driver.quit();
  }
}

