package com.capgemini.corejava;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestNGSampleFromNet {	
	public String URL="http://www.google.com";
	public WebDriver driver;

	@BeforeTest
	void launchBrowser(){
		driver=new FirefoxDriver();	 
		driver.get(URL);
		System.out.println("i am in before test");
	}

	@Test(groups={"smoke","regression"})
	void verifySuccessfulLaunch(){
		String expectedPage="Google";
		String actualPage=driver.getTitle();
		System.out.println(actualPage);
		Assert.assertEquals(actualPage,expectedPage);
		System.out.println("i am in first test");


	}

	@Test(groups={"smoke"})
	public void a(){
		System.out.println("in second test");
		//Assert.fail();
		//System.out.println("check print");

	}
	
	
	@Test
	public void B(){
		System.out.println("in B");
		//Assert.fail();
		//System.out.println("check print");

	}
	
	
	@Test
	public void C(){
		System.out.println("in C");
		//Assert.fail();
		//System.out.println("check print");

	}
	
	
	

	@AfterTest
	void closeBrowser(){
		System.out.println("i am in after test");
		driver.quit();

	}


	@BeforeMethod
	public void beforemethod(){
		System.out.println("Im in before method ");
	} 

	@AfterMethod
	public void aftermethod(){
		System.out.println("Im in after method ");
	} 

}



