package com.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PageDriver {

	WebDriver driver;
	Configuration config;
	public PageDriver(Configuration config){
	this.config = config;
		start();
	}
	public void start(){
		String browser = config.BROWSER;
		switch(browser)
		{
		case "firefox":
			driver = startFirefox();
			break;
		case "chrome":
			driver = startChrome();
			break;
		case "ie":
			driver = startIE();
			break;
		default:
			driver = startHtml();
			break;
		}
		driver.get(config.URL);
		driver.manage().window().maximize();
	}
	public WebDriver startFirefox()
	{
	return new FirefoxDriver();	
	}
	public WebDriver startChrome()
	{
		return new ChromeDriver();
	}
	public WebDriver startIE()
	{
		return new InternetExplorerDriver();
	}
	public WebDriver startHtml()
	{
		return new HtmlUnitDriver();
	}
		
	public void get(String url)
	{
		driver.get(url);
	}
	public WebElement findElemnet(String loc)
	{
		return driver.findElement(Locators.get(loc));
	}
	public String getCurrentUrl()
	{
		return driver.getCurrentUrl();
		
	}
	public void quit()
	{
		driver.quit();
	}
}

