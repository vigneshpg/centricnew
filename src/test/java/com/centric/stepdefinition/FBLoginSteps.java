package com.centric.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FBLoginSteps {
	
	static WebDriver driver;
	
	@Given("User launches FB url")
	public void user_launches_FB_url() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable-infobars");
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	   
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		
		driver.findElement(By.id("email")).sendKeys("karthi");
		driver.findElement(By.id("pass")).sendKeys("7865433");
	    
	}

	@When("user enter click on login button")
	public void user_enter_click_on_login_button() {
	    
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

	@Then("user should be navigated into home page")
	public void user_should_be_navigated_into_home_page() {
		
		Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
	    
	}
	
	@When("user enter username and password {string},{string}")
	public void user_enter_username_and_password(String string, String string2) {
		
		driver.findElement(By.id("email")).sendKeys(string);
		driver.findElement(By.id("pass")).sendKeys(string2);
	    
	}

}
