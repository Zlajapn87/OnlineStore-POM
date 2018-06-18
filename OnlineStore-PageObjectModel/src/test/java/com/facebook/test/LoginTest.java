package com.facebook.test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.FaceBookMainPage;

public class LoginTest {
	
	public WebDriver driver;
	
	FaceBookMainPage fbMainPage;
	
	
	
	@BeforeClass (alwaysRun = true)
	public void setup(){	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Zlaja\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		fbMainPage = PageFactory.initElements(driver, FaceBookMainPage.class);
	}
	
	@AfterClass (alwaysRun = true)
	public void tearDown(){	
		driver.close();
	}
	

	
	
	@Test (groups={"p1"})
	public void loadPage(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(FaceBookMainPage.PAGE_URL);
		Assert.assertEquals(FaceBookMainPage.PAGE_TITLE, driver.getTitle());		
	}
	
	@Test(groups={"p2"}, dependsOnMethods="loadPage")
	public void filloutEmailFld(){
	fbMainPage.setText_EmailLogin("zlajapn@hotmail.com");
	}
	
	@Test(groups={"p2"}, dependsOnMethods="filloutEmailFld")
	public void filloutPasswordFld(){
	fbMainPage.setText_PasswordLogin("pickica123");
	}
	
	@Test(groups={"p1"})
	public void testLoginMainPage(){
		driver.get(FaceBookMainPage.PAGE_URL);
		fbMainPage.setText_EmailLogin("zlajapn@hotmail.com");
		fbMainPage.setText_PasswordLogin("pickica123");
		fbMainPage.clickLoginMain();
		Assert.assertEquals("Facebook", driver.getTitle());
		
	}

}
