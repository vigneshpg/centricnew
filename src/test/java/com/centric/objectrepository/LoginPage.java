package com.centric.objectrepository;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class LoginPage extends Commonactions{
	
	Commonactions ca=new Commonactions();
	
	public LoginPage() {
		PageFactory.initElements(Commonactions.driver, this);
	}
	
	@FindBy(id = "LoginID")
	private WebElement username;
	
	@FindBy(id = "Password")
	private WebElement password;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	@FindBy(id = "loginButton_label")
	private WebElement login;
	
	
	public void verifyHomePage() throws Throwable {
		
		ca.jsWaitForPageLoad();
		
		Assert.assertTrue(driver.findElement(By.xpath("//span[text()='My Home' or @data-csi-tab='User-MyHome']")).isDisplayed());

	}

}
