package com.test;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.testng.Assert.*;
import com.base.BaseTest;
import com.page.HomePage;

public class HomePageTest extends BaseTest{
	HomePage hp;
	
	@BeforeClass
	public void beforeclass()
	{
		hp = new HomePage(driver);
		hp.open();
	}
	@Test
    public void testLoginLink()
	{
    	assertEquals("http://google.com/login.php,hp.click()");
    }
}

