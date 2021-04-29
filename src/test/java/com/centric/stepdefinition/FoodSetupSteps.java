package com.centric.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.centric.objectrepository.BusinessPlanningPage;
import com.centric.objectrepository.ConfigurationPage;
import com.centric.objectrepository.FoodSetupPage;
import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.MaterialSpecificationPage;
import com.centric.objectrepository.MerchandisePage;
import com.centric.objectrepository.PopupPage;
import com.centric.objectrepository.SetupPageTK;
import com.centric.objectrepository.SourcingPage;
import com.centric.objectrepository.StylePage;
import com.centric.objectrepository.UserManagementPage;
import com.centric.objectrepository.WizardPage;
import com.centric.resources.Commonactions;
import com.centric.objectrepository.QualityPage;
import com.centric.objectrepository.InspectionPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FoodSetupSteps extends Commonactions {
	Commonactions ca = new Commonactions();
	HomePage hp = new HomePage();
	ConfigurationPage cp = new ConfigurationPage();
	FoodSetupPage fp= new FoodSetupPage();
	
	
	
	@Then("Navigate to Food Setup and create food config {string}")
	public void navigate_to_Food_Setup_and_create_food_config(String string)throws Throwable {
		String[] allergenname;
		allergenname=string.split(",");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getDatasetup());
		ca.click(hp.getDatasetup());
	
		Commonactions.isElementPresent(hp.getProductQuality());
		ca.click(hp.getProductQuality());
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Food" +Keys.ENTER);
		ca.eleToBeClickable();
		
		/*Commonactions.isElementPresent(fp.getFoodsetup());
		ca.click(fp.getFoodsetup());
		ca.eleToBeClickable();*/
		
		Commonactions.isElementPresent(fp.getFoodallergens());
		ca.click(fp.getFoodallergens());
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(fp.getFoodalleraction());
		ca.click(fp.getFoodalleraction());
		Commonactions.isElementPresent(fp.getFoodallerinput());
		ca.click(fp.getFoodallerinput());
		ca.insertText(fp.getFoodallerinput(),allergenname[0]);
		ca.click(driver.findElement(By.xpath("(//span[text()='Save & New'])")));
		ca.eleToBeClickable();
		
//		Commonactions.isElementPresent(fp.getFoodalleraction());
//		ca.click(fp.getFoodalleraction());
		Commonactions.isElementPresent(fp.getFoodallerinput());
		ca.click(fp.getFoodallerinput());
		ca.insertText(fp.getFoodallerinput(),allergenname[1]);
		ca.click(driver.findElement(By.xpath("(//span[text()='Save & New'])")));
		ca.eleToBeClickable();
		
//		Commonactions.isElementPresent(fp.getFoodalleraction());
//		ca.click(fp.getFoodalleraction());
		Commonactions.isElementPresent(fp.getFoodallerinput());
		ca.click(fp.getFoodallerinput());
		ca.insertText(fp.getFoodallerinput(),allergenname[2]);
		ca.click(driver.findElement(By.xpath("(//span[text()='Save & New'])")));
		ca.eleToBeClickable();
		
//		Commonactions.isElementPresent(fp.getFoodalleraction());
//		ca.click(fp.getFoodalleraction());
		Commonactions.isElementPresent(fp.getFoodallerinput());
		ca.click(fp.getFoodallerinput());
		ca.insertText(fp.getFoodallerinput(),allergenname[3]);
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		ca.eleToBeClickable();
		
		ca.click(fp.getEggusinp());
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a3, "Eggs");
		ca.eleToBeClickable();
		a3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement a4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a4, "Oeuf");
		a4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement a5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a5, "Tamago");
		a5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();		
		
		ca.click(fp.getFishusinp());
		WebElement b3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b3, "Fish");
		ca.eleToBeClickable();
		b3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement b4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b4, "poisson");
		b4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement b5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b5, "Sakana");
		b5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();	
		
		ca.click(fp.getMilkusinp());
		WebElement c3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c3, "Milk");
		ca.eleToBeClickable();
		c3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement c4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c4, "lait");
		c4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement c5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c5, "Miruku");
		c5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();	
		
		ca.click(fp.getWheatusinp());
		WebElement d3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d3, "Wheat");
		ca.eleToBeClickable();
		d3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement d4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d4, "du ble");
		d4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement d5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d5, "Komugi");
		d5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
	}
	
	@Then("Navigate to food claims and Create claims {string}")
	public void navigate_to_food_claims_and_Create_claims(String string)throws Throwable {
		String[] claimnames;
		claimnames=string.split(",");
		
	    Commonactions.isElementPresent(fp.getFoodclaims());
	    ca.click(fp.getFoodclaims());
	    ca.eleToBeClickable();
	    
	    Commonactions.isElementPresent(fp.getFoodclaimaction());
		ca.click(fp.getFoodclaimaction());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(fp.getFoodclaiminput());
		ca.click(fp.getFoodclaiminput());
		ca.insertText(fp.getFoodclaiminput(),claimnames[0]);
		ca.click(driver.findElement(By.xpath("(//span[text()='Save & New'])")));
		ca.eleToBeClickable();
		
//		Commonactions.isElementPresent(fp.getFoodclaimaction());
//		ca.click(fp.getFoodclaimaction());
		Commonactions.isElementPresent(fp.getFoodclaiminput());
		ca.click(fp.getFoodclaiminput());
		ca.insertText(fp.getFoodclaiminput(),claimnames[1]);
		ca.click(driver.findElement(By.xpath("(//span[text()='Save & New'])")));
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(fp.getFoodclaiminput());
		ca.click(fp.getFoodclaiminput());
		ca.insertText(fp.getFoodclaiminput(),claimnames[2]);
		ca.click(driver.findElement(By.xpath("(//span[text()='Save & New'])")));
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(fp.getFoodclaiminput());
		ca.click(fp.getFoodclaiminput());
		ca.insertText(fp.getFoodclaiminput(),claimnames[3]);
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		ca.eleToBeClickable();
		
		ca.click(fp.getSodiumusinp());
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a3, "Sodium");
		ca.eleToBeClickable();
		a3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement a4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a4, "Sodium");
		a4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement a5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a5, "Sodium");
		a5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();		
		
		ca.click(fp.getSugarusinp());
		WebElement b3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b3, "Sugar");
		ca.eleToBeClickable();
		b3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement b4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b4, "du sucre");
		b4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement b5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b5, "Shugā");
		b5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();	
		
		ca.click(fp.getCalciumusinp());
		WebElement c3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c3, "Calcium");
		ca.eleToBeClickable();
		c3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement c4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c4, "Calcium");
		c4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement c5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c5, "Karushiumu");
		c5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();	
		
		ca.click(fp.getFibreusinp());
		WebElement d3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d3, "Fibre");
		ca.eleToBeClickable();
		d3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement d4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d4, "Fibre");
		d4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement d5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d5, "Faiba");
		d5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
	}
	@Then("Navigate to food ingredient create ingredients {string}")
	public void navigate_to_food_ingredient_create_ingredients(String string)throws Throwable {
	    
		String[] ingrenames;
		ingrenames=string.split(",");
		
	    Commonactions.isElementPresent(fp.getFoodingredient());
	    ca.click(fp.getFoodingredient());
	    ca.eleToBeClickable();
	    
	    Commonactions.isElementPresent(fp.getFoodingreaction());
	    ca.click(fp.getFoodingreaction());
	    
	    Commonactions.isElementPresent(fp.getFoodingredinput());
		ca.click(fp.getFoodingredinput());
		ca.insertText(fp.getFoodingredinput(),ingrenames[0]);
		ca.click(driver.findElement(By.xpath("(//span[text()='Save & New'])")));
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(fp.getFoodingredinput());
		ca.click(fp.getFoodingredinput());
		ca.insertText(fp.getFoodingredinput(),ingrenames[1]);
		ca.click(driver.findElement(By.xpath("(//span[text()='Save & New'])")));
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(fp.getFoodingredinput());
		ca.click(fp.getFoodingredinput());
		ca.insertText(fp.getFoodingredinput(),ingrenames[2]);
		ca.click(driver.findElement(By.xpath("(//span[text()='Save & New'])")));
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(fp.getFoodingredinput());
		ca.click(fp.getFoodingredinput());
		ca.insertText(fp.getFoodingredinput(),ingrenames[3]);
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		ca.eleToBeClickable();
		
		ca.click(fp.getPepperusinp());
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a3,"Pepper" );
		ca.eleToBeClickable();
		a3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement a4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a4, "poivre");
		a4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement a5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a5, "Koshō");
		a5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();		
		
		ca.click(fp.getOilusinp());
		WebElement b3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b3, "Oil");
		ca.eleToBeClickable();
		b3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement b4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b4, "huile");
		b4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement b5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b5, "Abura");
		b5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();	
		
		ca.click(fp.getSaltusinp());
		WebElement c3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c3, "Salt");
		ca.eleToBeClickable();
		c3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement c4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c4, "sel");
		c4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement c5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c5, "Shio");
		c5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();	
		
		ca.click(fp.getFlourusinp());
		WebElement d3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d3, "Flour");
		ca.eleToBeClickable();
		d3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement d4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d4, "farine");
		d4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement d5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d5, "Komugiko");
		d5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
	    
	}
	
	@Then("Create food nutrients {string}")
	public void create_food_nutrients(String string)throws Throwable {
		String[] nutrinames;
		nutrinames=string.split(",");
		
	    Commonactions.isElementPresent(fp.getFoodnutri());
	    ca.click(fp.getFoodnutri());
	    ca.eleToBeClickable();
	    
	    Commonactions.isElementPresent(fp.getFoodnutriaction());
	    ca.click(fp.getFoodnutriaction());
	    ca.eleToBeClickable();
	    
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a3, nutrinames[0]);
		ca.eleToBeClickable();
		a3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		ca.click(fp.getFoodnutriaction());
		ca.eleToBeClickable();
		WebElement a4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a4, nutrinames[1]);
		a4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		ca.click(fp.getFoodnutriaction());
		ca.eleToBeClickable();
		WebElement a5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a5, nutrinames[2]);
		a5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();		
		
		ca.click(fp.getFoodnutriaction());
		ca.eleToBeClickable();
		/*ca.click(fp.getOilusinp());
		ca.eleToBeClickable();*/
		WebElement b3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b3, nutrinames[3]);
		ca.eleToBeClickable();
		b3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		ca.click(fp.getMineralusinp());
		ca.eleToBeClickable();
		WebElement d1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d1, "Minerals");
		ca.eleToBeClickable();
		d1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement d2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d2, "les minéraux");
		ca.eleToBeClickable();
		d2.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement d3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d3, "Mineraru");
		ca.eleToBeClickable();
		d3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		ca.click(fp.getProtienusinp());
		ca.eleToBeClickable();
		WebElement f1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(f1, "Protein");
		ca.eleToBeClickable();
		f1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement f2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(f2, "protéines");
		ca.eleToBeClickable();
		f2.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement f3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(f3, "Tanpakushitsu");
		ca.eleToBeClickable();
		f3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		ca.click(fp.getVitaminusinp());
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e1, "Vitamins");
		ca.eleToBeClickable();
		e1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e2, "vitamine");
		ca.eleToBeClickable();
		e2.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement e3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e3, "Bitamin");
		ca.eleToBeClickable();
		e3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		ca.click(fp.getLipidusinp());
		ca.eleToBeClickable();
		WebElement g1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(g1, "Lipids");
		ca.eleToBeClickable();
		g1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement g2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(g2, "lipide");
		ca.eleToBeClickable();
		g2.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		WebElement g3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(g3, "Shishitsu");
		ca.eleToBeClickable();
		g3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
	    
	}
}