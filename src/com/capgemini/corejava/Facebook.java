package com.capgemini.corejava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {

	public static final String facebook_login_username_id="email";
	@FindBy(id=facebook_login_username_id)
	private WebElement username1;
	
	public static final String facebook_login_password_id="pass";
	@FindBy(id=facebook_login_password_id)
	private WebElement password;
	
	public static final String facebook_login_button_id="u_0_x";
	
	@FindBy(id=facebook_login_button_id)
	private WebElement login;
	
	/*public Facebook(WebDriver driver){
	PageFactory.initElements(driver, Facebook.class);...for initialization on same page
		
	}
	*/

	public  WebElement getusername(){
		return username;
		
	}
	
	public void setusername(String usernamevalue){
		username.sendKeys(usernamevalue);
	}
	
	public  WebElement getpassword(){
		return password;
		
	}
	
	public void setpassword(String pass){
		password.sendKeys(pass);
	}
	
	public void clicklogin(){
		login.click();
	}
	
	public void facebooklogin(String user,String pass){
		setusername(user);
		setpassword(pass);
		clicklogin();
		
		
	}
}


