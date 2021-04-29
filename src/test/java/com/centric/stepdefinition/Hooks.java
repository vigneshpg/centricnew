package com.centric.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.centric.objectrepository.LoginPage;
import com.centric.resources.Commonactions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commonactions {

	Commonactions ca = new Commonactions();


	@Before()
	public void before() throws InterruptedException {

		System.out.println("User launches application");

	}
	//static Scenario scenario;

	@After()
	public void after(Scenario scenario) {

		try{
			if(scenario.isFailed()){

				final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

				scenario.embed(screenshot, "image/png");
				driver.close();
				Thread.sleep(5000);
				//------------------------------Test------------------------------------\\

				//ca.launch(System.getProperty("url"));
				
				ca.launch("http://win16sql19-ccd.centricsoftware.com/");


				//-------------------------------Test-------------------------------------\\  
				LoginPage lp = new LoginPage();
				ca.insertText(lp.getUsername(), "Administrator");
				ca.insertText(lp.getPassword(), "centric8");
				ca.clickjs(lp.getLogin());

				System.out.println("login clicked successfully");

			}else{
				scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
			}}
		catch(Exception e){

		}
		//driver.close();


	}

}
