package yelp.Slack;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App {
WebDriver driver;

@Test	
public void Slack(){
	System.setProperty("webdriver.firefox.driver", "C:\\Users\\Home\\Downloads\\geckodriver-v0.14.0-win64\\geckodriver.exe");
	//driver = new ChromeDriver();
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://slack.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//html/body/nav[1]/ul/li[7]/a")).click();
	driver.findElement(By.xpath(".//*[@id='domain']")).sendKeys("ipsnetwork");
	driver.findElement(By.xpath(".//*[@id='page_contents']/form/div/p[3]")).click();
	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("smitha.surekha@gmail.com");
	driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("Innovapath1");
	driver.findElement(By.xpath(".//*[@id='signin_btn']")).click();
	
	}
}

