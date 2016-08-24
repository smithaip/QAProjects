package com.page;

import org.openqa.selenium.WebDriver;

import com.base.BasePage;
import com.util.PageDriver;

public class LoginPage  extends BasePage{
	
	String user ="id_username";
	String pwd ="id_pwd";
	String submit ="id_login";
	String logout ="id_logout";

	
	public LoginPage(PageDriver driver)return 
	{
		super(driver);
	}
	public String performLogin(String username,String passwd)

{
		driver.findElemnet(user).sendKeys(username);
		driver.findElemnet(pwd).sendKeys(passwd);
		driver.findElemnet(submit).click();
		driver.findElemnet(logout).isDisplayed();



}
}