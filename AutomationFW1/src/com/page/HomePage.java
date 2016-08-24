package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.BasePage;
import com.util.Locators;
import com.util.PageDriver;

public class HomePage extends BasePage{
	
	String loginLink = "id_login-link";
	public HomePage(PageDriver driver)
	{
		super(driver);
}
	public void open()
	{
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
	}
    public String clicklogin()
    {
    driver.findElement((loginLink)).click();
    return driver.getCurrentUrl();
       	
    }
    }