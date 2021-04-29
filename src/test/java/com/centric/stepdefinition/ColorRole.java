package com.centric.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.centric.objectrepository.ConfigurationPage;
import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.InspectionPage;
import com.centric.objectrepository.MaterialSpecificationPage;
import com.centric.objectrepository.SetupPageTK;
import com.centric.objectrepository.StyleMaterialSamplepage;
import com.centric.resources.Commonactions;

import cucumber.api.java.en.And;

public class ColorRole extends Commonactions {
	Commonactions ca = new Commonactions();
	InspectionPage in = new InspectionPage();
	HomePage hp = new HomePage();
	MaterialSpecificationPage mp = new MaterialSpecificationPage();
	SetupPageTK su = new SetupPageTK();
	StyleMaterialSamplepage sm = new StyleMaterialSamplepage();
	ConfigurationPage co=new ConfigurationPage();


	@And("User Creates ColorROle in Enumeration {string},{string},{string},{string},{string},{string},{string},{string},")
	public void user_Creates_ColorROle_in_Enumeration(String MatFamilyname, String MainThemename, String familyname1, String familyname2, String blue, String red, String Grp1, String Grp2) throws Throwable {

		Commonactions.isElementPresent(hp.getUser_settingsBtn());
		ca.click(hp.getUser_settingsBtn());
		Commonactions.isElementPresent(hp.getSystem_config());
		ca.click(hp.getSystem_config());
		Commonactions.isElementPresent(co.getUser_config());
		ca.click(co.getUser_config());
		Commonactions.isElementPresent(su.getUser_Enumerations());
		ca.click(su.getUser_Enumerations());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(su.getUser_EnumDropBox());
		ca.click(su.getUser_EnumDropBox());
		ca.eleToBeClickable();

		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e1, MatFamilyname);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//label[contains(text(),'MaterialFamily')]")));	
		ca.eleToBeClickable();
		e1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		/*WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e1, MatFamilyname);
		ca.eleToBeClickable();
		Thread.sleep(2000);
		WebElement Materialname = driver.findElement(By.xpath("//span[contains(text(),'MaterialFamily')]//parent::label"));
		ca.click(Materialname);
		e1.sendKeys(Keys.TAB);*/
		ca.eleToBeClickable();
		System.out.println("Enumeration dropdown values selected: "+MatFamilyname);


		/*WebElement Materialfamily = driver.findElement(By.xpath("(//td[contains(text(),'MaterialFamily')]//preceding-sibling::td)//input"));
		ca.click(Materialfamily);*/
		try{
		Commonactions.isElementPresent(su.getUser_NewEnumValue());
		ca.click(su.getUser_NewEnumValue());
		}catch (Exception e) {
			
			Commonactions.isElementPresent(sm.getEnumFamChkBx());
			ca.click(sm.getEnumFamChkBx());
			Commonactions.isElementPresent(su.getUser_NewEnumValue());
			ca.click(su.getUser_NewEnumValue());
			
		}	
		Commonactions.isElementPresent(su.getUser_NewEnumName());
		ca.insertText(su.getUser_NewEnumName(),familyname1);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		ca.click(su.getUser_NewEnumValue());
		Commonactions.isElementPresent(su.getUser_NewEnumName());
		ca.insertText(su.getUser_NewEnumName(),familyname2);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Family-01, Family-02 created");

	/*	boolean displayed01 = driver.findElement(By.xpath("//*[text()='Family-01']//parent::td[contains(@data-csi-heading,'LocaleName')]")).isDisplayed();
		boolean displayed02 = driver.findElement(By.xpath("//*[text()='Family-02']//parent::td[contains(@data-csi-heading,'LocaleName')]")).isDisplayed();

		if(displayed01==true)
		{
			WebElement family01 = driver.findElement(By.xpath("//*[text()='Family-01']//parent::td[contains(@data-csi-heading,'LocaleName')]"));
			ca.click(family01);
			ca.eleToBeClickable();
			WebElement e3 = ca.activeElement();
			ca.eleToBeClickable();
			e3.sendKeys(Keys.DELETE);
			ca.eleToBeClickable();
			ca.insertText(e3, blue);
			ca.eleToBeClickable();
		}
		if(displayed02==true)
		{
			WebElement family02 = driver.findElement(By.xpath("//*[text()='Family-02']//parent::td[contains(@data-csi-heading,'LocaleName')]"));
			ca.click(family02);
			ca.eleToBeClickable();
			WebElement e4 = ca.activeElement();
			ca.eleToBeClickable();
			e4.sendKeys(Keys.DELETE);
			ca.eleToBeClickable();
			ca.insertText(e4, red);
			ca.eleToBeClickable();
			System.out.println("ColorRole Blue and Red created");
		}*/

		
		ca.click(su.getUser_EnumDropBox());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(su.getUser_Enumerations());
		ca.click(su.getUser_Enumerations());
		ca.eleToBeClickable();
		ca.click(su.getUser_EnumDropBox());
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e2, MainThemename);
		ca.eleToBeClickable();
		WebElement Themename = driver.findElement(By.xpath("//span[contains(text(),'ThemeMainMaterialGroup')]//parent::label"));
		ca.click(Themename);
		ca.eleToBeClickable();
		e1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		
		
		WebElement Theme = driver.findElement(By.xpath("(//td[contains(text(),'Theme')]//preceding-sibling::td)//input"));
		ca.click(Theme);
		ca.eleToBeClickable();


		Commonactions.isElementPresent(su.getUser_NewEnumValue());
		ca.click(su.getUser_NewEnumValue());
		Commonactions.isElementPresent(su.getUser_NewEnumName());
		ca.insertText(su.getUser_NewEnumName(),Grp1);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		ca.click(su.getUser_NewEnumValue());
		Commonactions.isElementPresent(su.getUser_NewEnumName());
		ca.insertText(su.getUser_NewEnumName(),Grp2);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Theme Group01, Group02 created");

	}
}