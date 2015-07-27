package com.capgemini.corejava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebooklogintest {
	
	WebDriver driver= new FirefoxDriver();
	
	Facebook facebookint=PageFactory.initElements(driver, Facebook.class);
  @BeforeTest
  public void openbrowser() {
	  
	  driver.get("http://www.facebook.com");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	  
  }
  
  @AfterTest
  public void teardown(){
	  
	  System.out.println("test finished");
	 // driver.close();
  }
  
  @Test
  public void loginintofacebook(){
	facebookint.facebooklogin("abcd", "sdfsdfsd");
	 // facebookint.setusername("username");
	 // facebookint.setpassword("pass");
	 // facebookint.clicklogin();
	 // facebookint.getusername().getAttribute("name");
	driver.findElement(By.id(Facebook.facebook_login_password_id)).clear();
	 
  }
}
