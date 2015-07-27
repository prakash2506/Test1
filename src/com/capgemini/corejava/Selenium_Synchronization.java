package com.capgemini.corejava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Selenium;

public class Selenium_Synchronization {

	/**
	 * @param args
	 * @throws Throwable 
	 */
	public static void main(String[] args) throws Throwable {
		
		
		WebDriver driver=new FirefoxDriver();
		
		driver.quit();//close all the opened selenium driver(inactive window)	
		driver.close();//closes only browser closes the opened window by selenium driver(active window)
		driver.findElement(By.id("Email")).sendKeys("prakash2506@gmail.com");
		
		
		driver.get("http://www.gmail.com");		
		
		//Synchronization..............
		//wait can be 3 types here	forcefully wait,implicit,explicit
		//1 like wait in qtp
		Thread.sleep(5000);
		//2 Implicit method like "Browser.Page.exist" method, waits for HTML DOM while navigation from page to another
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//3		explicit wati..wait for some property...
		
		WebDriverWait explicitWait=new WebDriverWait(driver,5);//time defined here...
		try{
			
			explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.id("Emailll")));
			}catch(Exception e){
				
				System.out.println("error" + e.getMessage());
			}
						
		
		explicitWait.until(ExpectedConditions.alertIsPresent());
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("Submit")));
		explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("iddd"));//in sel, need to switch to a frame to work on an element present in it..
		//Synchronization..............
		
		
		
		//code to click ok or cancel of a pop-up
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}





