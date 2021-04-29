package com.centric.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.centric.objectrepository.BusinessPlanningPage;
import com.centric.objectrepository.CollectionMangPage;
import com.centric.objectrepository.ConfigurationPage;
import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.InspectionPage;
import com.centric.objectrepository.MaterialSpecificationPage;
import com.centric.objectrepository.PopupPage;
import com.centric.objectrepository.QualityPage;
import com.centric.objectrepository.SetupPageTK;
import com.centric.objectrepository.SourcingPage;
import com.centric.objectrepository.SpecificationHierarchyPage;
import com.centric.objectrepository.StyleMaterialSamplepage;
import com.centric.objectrepository.StylePage;
import com.centric.objectrepository.StyleandThemePage;
import com.centric.objectrepository.UserManagementPage;
import com.centric.resources.Commonactions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BusinessPlanningSteps extends Commonactions {

	HomePage hp = new HomePage();
	Commonactions ca = new Commonactions();
	MaterialSpecificationPage mp = new MaterialSpecificationPage();
	ConfigurationPage co = new ConfigurationPage();
	PopupPage pp = new PopupPage();
	SourcingPage sp = new SourcingPage();
	QualityPage  qp = new QualityPage();
	StylePage st = new StylePage();
	SetupPageTK su = new SetupPageTK();
	SpecificationHierarchyPage sk = new SpecificationHierarchyPage();
	StyleMaterialSamplepage sm = new StyleMaterialSamplepage();
	StyleandThemePage sat = new StyleandThemePage();
	CollectionMangPage cm = new CollectionMangPage();
	InspectionPage in = new InspectionPage();
	BusinessPlanningPage bp = new BusinessPlanningPage();



	@Then("User creates Business category for Style  {string},{string},{string}")
	public void user_creates_Business_category_for_Style(String stylecategory, String style, String currency) throws Throwable {
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		for (int i = 0; i < 10; i++) {
			//	Commonactions.isElementPresent(in.getPagecontentArrow());
			//	ca.click(in.getPagecontentArrow());
			if(hp.getBusinessPlanningBtn().isDisplayed()){
				Commonactions.isElementPresent(hp.getBusinessPlanningBtn());
				ca.click(hp.getBusinessPlanningBtn());
				break;
			}}
		Commonactions.isElementPresent(bp.getBusinesscategories());
		ca.click(bp.getBusinesscategories());
		Commonactions.isElementPresent(bp.getNewBusinesscatiegoriesbtn());
		ca.click(bp.getNewBusinesscatiegoriesbtn());
		Commonactions.isElementPresent(bp.getBusinesscat());
		insertText(bp.getBusinesscat(), stylecategory);
		System.out.println("Business category Style Created");

		Commonactions.isElementPresent(bp.getProducttype());
		ca.click(bp.getProducttype());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.insertText(a, style);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bp.getCurrency());
		ca.click(bp.getCurrency());
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.insertText(a1, currency);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();
	}

	@Then("User creates Business category for Material {string},{string}")
	public void user_creates_Business_category_for_Material(String materialcategory, String material) throws Throwable {
		Commonactions.isElementPresent(bp.getBusinesscat());
		insertText(bp.getBusinesscat(), materialcategory);
		Commonactions.isElementPresent(bp.getProducttype());
		ca.click(bp.getProducttype());
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.insertText(a2, material);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Business category Material Created");
	}

	@And("User Edit and copy Business category {string},{string}")
	public void user_Edit_and_copy_Business_category(String copymaterial, String editmaterial) throws Throwable {
		Commonactions.isElementPresent(bp.getCopymaterialcategory());
		ca.click(bp.getCopymaterialcategory());
		Commonactions.isElementPresent(bp.getBusinesscat());
		insertText(bp.getBusinesscat(), copymaterial);
		ca.click(mp.getSave_btn1());   
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bp.getEditmaterialcopy());
		ca.click(bp.getEditmaterialcopy());
		Commonactions.isElementPresent(bp.getBusinesscat());
		insertText(bp.getBusinesscat(), editmaterial);
		ca.click(mp.getSave_btn1());   
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bp.getDeletematerialedit());
		ca.click(bp.getDeletematerialedit());
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());
		System.out.println("Business category Copied Edited and Deleted"); 
	}


	@And("create BusinessMarket for Style and Material {string},{string},{string},{string}")
	public void create_BusinessMarket_for_Style_and_Material(String BMvalue1, String Bcode1, String BMvalue2, String Bcode2) throws Throwable {
		Commonactions.isElementPresent(bp.getStylecategoryName());
		ca.click(bp.getStylecategoryName());
		Commonactions.isElementPresent(bp.getBusinessmarketbtn());
		ca.click(bp.getBusinessmarketbtn());
		Commonactions.isElementPresent(bp.getBusinessmarketvalue());
		ca.insertText(bp.getBusinessmarketvalue(), BMvalue1);
		Commonactions.isElementPresent(bp.getBusinessCode());
		ca.insertText(bp.getBusinessCode(), Bcode1);
		ca.click(mp.getSave_btn1());   
		ca.eleToBeClickable();

		/*Commonactions.isElementPresent(bp.getBMSPlit());
		ca.click(bp.getBMSPlit());
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		a3.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(a3, "5");
		ca.eleToBeClickable();*/
		ca.eleToBeClickable();

		ca.click(bp.getBMSPlit());
		ca.eleToBeClickable();
		WebElement a03 = ca.activeElement();
		ca.eleToBeClickable();
		a03.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(a03, "5");
		ca.eleToBeClickable();
		driver.findElement(By.xpath("//div[contains(@class,'Slider')]//span[text()='+']/parent::div")).click();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bp.getBMCountries());
		ca.click(bp.getBMCountries());
		ca.eleToBeClickable();
		ca.click(bp.getIndiacheckbox());
		ca.click(bp.getUScheckbox());
		ca.eleToBeClickable();
		for(int i=0;i<20;i++)
		{
			driver.findElement(By.xpath("//div[contains(@class,'Slider')]//span[text()='+']/parent::div")).click();
		}
		Commonactions.isElementPresent(bp.getBMDefaultcountry());
		ca.click(bp.getBMDefaultcountry());
		ca.eleToBeClickable();
		WebElement a4 = ca.activeElement();
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.insertText(a4, "united");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		for(int i=0;i<20;i++)
		{
			driver.findElement(By.xpath("//div[contains(@class,'Slider')]//span[text()='+']/parent::div")).click();
		}
		Commonactions.isElementPresent(bp.getBMShippingPort());
		ca.click(bp.getBMShippingPort());
		ca.eleToBeClickable();
		ca.click(bp.getChennaiport());
		ca.click(bp.getNewyorkport());
		ca.eleToBeClickable();
		for(int i=0;i<20;i++)
		{
			driver.findElement(By.xpath("//div[contains(@class,'Slider')]//span[text()='+']/parent::div")).click();
		}
		Commonactions.isElementPresent(bp.getBMDefaultPort());
		ca.click(bp.getBMDefaultPort());
		ca.eleToBeClickable();
		WebElement a5 = ca.activeElement();
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.insertText(a5, "New york");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();	
		System.out.println("US Business Market created");

		Commonactions.isElementPresent(bp.getBMCopy());
		ca.click(bp.getBMCopy());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("US Business market copied");
		Commonactions.isElementPresent(bp.getBMDelete());
		ca.click(bp.getBMDelete());
		System.out.println("US Business market Deleted");
		Commonactions.isElementPresent(pp.getDelete_Btn	());
		ca.click(pp.getDelete_Btn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bp.getFinditem());
		ca.click(bp.getFinditem());
		ca.eleToBeClickable();
		WebElement a6 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a6, "Material");
		ca.eleToBeClickable();
		a6.sendKeys(Keys.ENTER);
		ca.eleToBeClickable();



		Commonactions.isElementPresent(bp.getBusinessmarketbtn());
		ca.click(bp.getBusinessmarketbtn());
		Commonactions.isElementPresent(bp.getBusinessmarketvalue());
		ca.insertText(bp.getBusinessmarketvalue(), BMvalue2);
		Commonactions.isElementPresent(bp.getBusinessCode());
		ca.insertText(bp.getBusinessCode(), Bcode2);
		ca.click(mp.getSave_btn1());   
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bp.getBMSPlit());
		ca.click(bp.getBMSPlit());
		ca.eleToBeClickable();
		WebElement a7 = ca.activeElement();
		ca.eleToBeClickable();
		a7.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(a7, "10");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		driver.findElement(By.xpath("//div[contains(@class,'Slider')]//span[text()='+']/parent::div")).click();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bp.getBMCountries());
		ca.click(bp.getBMCountries());
		ca.eleToBeClickable();
		ca.click(bp.getIndiacheckbox());
		ca.click(bp.getUScheckbox());
		ca.eleToBeClickable();
		for(int i=0;i<20;i++)
		{
			driver.findElement(By.xpath("//div[contains(@class,'Slider')]//span[text()='+']/parent::div")).click();
		}
		Commonactions.isElementPresent(bp.getBMDefaultcountry());
		ca.click(bp.getBMDefaultcountry());
		ca.eleToBeClickable();
		WebElement a8 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a8, "India");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		for(int i=0;i<20;i++)
		{
			driver.findElement(By.xpath("//div[contains(@class,'Slider')]//span[text()='+']/parent::div")).click();
		}
		Commonactions.isElementPresent(bp.getBMShippingPort());
		ca.click(bp.getBMShippingPort());
		ca.eleToBeClickable();
		ca.click(bp.getChennaiport());
		ca.click(bp.getMumbaiport());
		ca.click(bp.getNewyorkport());
		ca.eleToBeClickable();
		for(int i=0;i<20;i++)
		{
			driver.findElement(By.xpath("//div[contains(@class,'Slider')]//span[text()='+']/parent::div")).click();
		}
		Commonactions.isElementPresent(bp.getBMDefaultPort());
		ca.click(bp.getBMDefaultPort());
		ca.eleToBeClickable();
		WebElement a9 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a9, "chennai");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();	
		System.out.println("Indian Business Market created");

	}

	@Then("User creates Business Plan for Style {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_creates_Business_Plan_for_Style(String BPstyle, String stylecategory, String curreny, String supplier, String season, String brand, String dept, String collection) throws Throwable {
		ca.click(hp.getUser_homeBtn());
		for (int i = 0; i < 10; i++) {
			//	Commonactions.isElementPresent(in.getPagecontentArrow());
			//	ca.click(in.getPagecontentArrow());
			if(hp.getBusinessPlanningBtn().isDisplayed()){
				Commonactions.isElementPresent(hp.getBusinessPlanningBtn());
				ca.click(hp.getBusinessPlanningBtn());
				break;
			}}

		Commonactions.isElementPresent(bp.getBusinessplan());
		ca.click(bp.getBusinessplan());
		Commonactions.isElementPresent(bp.getBusinessplanbtn());
		ca.click(bp.getBusinessplanbtn());
		Commonactions.isElementPresent(bp.getBPValue());
		ca.insertText(bp.getBPValue(),BPstyle);
		ca.eleToBeClickable();
		ca.insertText(bp.getBPCategory(), stylecategory);
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bp.getBPCurrency());
		ca.eleToBeClickable();
		ca.insertText(bp.getBPCurrency(), curreny);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(bp.getBPSupplier());
		ca.eleToBeClickable();
		ca.insertText(bp.getBPSupplier(), supplier);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bp.getBPSeason());
		ca.insertText(bp.getBPSeason(), season);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bp.getBPBrand());
		ca.insertText(bp.getBPBrand(), brand);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bp.getBPDepartment());
		ca.insertText(bp.getBPDepartment(), dept);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bp.getBPCollection());
		ca.insertText(bp.getBPCollection(), collection);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(qp.getNext());
		ca.click(qp.getNext());
		Commonactions.isElementPresent(bp.getFinishandGo());
		ca.click(bp.getFinishandGo());
		ca.eleToBeClickable();
		System.out.println("plan for style created");
		try{
			WebElement slider = driver.findElement(By.xpath("//div[contains(@class,'BusinessPlanning')]//span[text()='+']/parent::div"));
			for(int i=0;i<100;i++)
			{				
				ca.click(slider);
			}}
		catch(Exception e) 		{System.out.println("+ slider button not worked");		}
		Commonactions.isElementPresent(bp.getTargetvolume());
		ca.click(bp.getTargetvolume());
		ca.eleToBeClickable();
		WebElement a10 = ca.activeElement();
		ca.eleToBeClickable();
		a10.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(a10, "1000");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bp.getTargetmargin());
		//ca.click(bp.getTargetmargin());
		ca.eleToBeClickable();
		WebElement a11 = ca.activeElement();
		ca.eleToBeClickable();
		a11.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(a11, "10");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.click(bp.getBMPRefresh());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bp.getMarketplan());
		ca.click(bp.getMarketplan());
		Commonactions.isElementPresent(bp.getProductplan());
		ca.click(bp.getProductplan());
		ca.click(bp.getProductplanbtn());
		ca.eleToBeClickable();
		WebElement a12 = ca.activeElement();
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.insertText(a12, "place holder");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bp.getProductdescription());
		//ca.click(bp.getProductdescription());
		ca.eleToBeClickable();
		WebElement a13 = ca.activeElement();
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.insertText(a13, "smoke");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bp.getProductplanexpand());
		ca.click(bp.getProductplanexpand());
		Commonactions.isElementPresent(bp.getNewformstyle());
		ca.click(bp.getNewformstyle());
		Commonactions.isElementPresent(cm.getApparelcolorandsizecheckbox());
		ca.click(cm.getApparelcolorandsizecheckbox());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bp.getProductplanexpand());
		ca.click(bp.getProductplanexpand());
		Commonactions.isElementPresent(bp.getStyle_newfromcolorway());
		ca.click(bp.getStyle_newfromcolorway());
		Commonactions.isElementPresent(bp.getVanillaapparelcolor());
		ca.click(bp.getVanillaapparelcolor());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bp.getProductplanexpand());
		ca.click(bp.getProductplanexpand());
		Commonactions.isElementPresent(bp.getStyle_newfromsku());
		ca.click(bp.getStyle_newfromsku());
		Commonactions.isElementPresent(cm.getBluecolorcheckbox());
		ca.click(cm.getBluecolorcheckbox());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bp.getProductplanexpand());
		ca.click(bp.getProductplanexpand());
		Commonactions.isElementPresent(bp.getStyle_newfromsize());
		ca.click(bp.getStyle_newfromsize());
		Commonactions.isElementPresent(cm.getApparelcolorandsizecheckbox());
		ca.click(cm.getApparelcolorandsizecheckbox());
		ca.click(qp.getNext());
		Commonactions.isElementPresent(bp.getSmall());
		ca.click(bp.getSmall());
		ca.click(qp.getFinish());
		Commonactions.isElementPresent(bp.getPPRefresh());
		ca.click(bp.getPPRefresh());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bp.getMarketplan());
		ca.click(bp.getMarketplan());
		Commonactions.isElementPresent(bp.getMarketplanrefresh());
		ca.click(bp.getMarketplanrefresh());
		ca.eleToBeClickable();
		int v[]= {1000,200,500,300,0};
		int n= driver.findElements(By.xpath("//td[contains(@data-csi-heading,'Volume:Child:Forecast')]")).size();
		for(int i=2;i<n;i++)
		{
			String value = String.valueOf(v[i-2]);
			driver.findElement(By.xpath("(//td[contains(@data-csi-heading,'Volume:Child:Forecast')])["+i+"]")).click();
			ca.eleToBeClickable();
			WebElement v1 = ca.activeElement();
			ca.eleToBeClickable();
			v1.sendKeys(Keys.DELETE);
			ca.eleToBeClickable();
			ca.insertText(v1, value);
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();
			ca.click(bp.getMarketplan());
		}
		Commonactions.isElementPresent(bp.getMarketplanrefresh());
		ca.click(bp.getMarketplanrefresh()); 
		System.out.println("plan for style value updated");

	}

	@And("verify the datas in marketplan")
	public void verify_the_datas_in_marketplan() throws Throwable {
		Commonactions.isElementPresent(bp.getProductplan());
		ca.click(bp.getProductplan());
		Commonactions.isElementPresent(bp.getApparelcolrsizename());
		ca.click(bp.getApparelcolrsizename());
		Commonactions.isElementPresent(bp.getColorSizeBP());
		ca.click(bp.getColorSizeBP());
		Commonactions.isElementPresent(bp.getColorSizemarketplan());
		ca.click(bp.getColorSizemarketplan());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bp.getColorSizeMPRefresh());
		ca.click(bp.getColorSizeMPRefresh());
		ca.eleToBeClickable();

		int size = driver.findElements(By.xpath("//td[contains(@data-csi-heading,'Node Name:Child:ProductPlan')]")).size();
		if(size==4)
		{
			System.out.println("All 4 values reflected in Market plan");
		}
		else
		{
			System.out.println("All 4 values not reflected in Market plan");
		}

		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());

		Commonactions.isElementPresent(hp.getBusinessPlanningBtn());
		ca.click(hp.getBusinessPlanningBtn());

		Commonactions.isElementPresent(bp.getBusinessplan());
		ca.click(bp.getBusinessplan());
		Commonactions.isElementPresent(bp.getBusinessplanName());
		ca.click(bp.getBusinessplanName());
		Commonactions.isElementPresent(bp.getPPplaceholder());
		ca.click(bp.getPPplaceholder());
		Commonactions.isElementPresent(bp.getSelectSKU());
		ca.click(bp.getSelectSKU());
		Commonactions.isElementPresent(cm.getGreencolorchecckbox());
		ca.click(cm.getGreencolorchecckbox());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(bp.getPPRefresh());
		ca.click(bp.getPPRefresh());
		Commonactions.isElementPresent(bp.getApparelcolrsizename());
		ca.click(bp.getApparelcolrsizename());
		Commonactions.isElementPresent(bp.getColorSizeBP());
		ca.click(bp.getColorSizeBP());
		Commonactions.isElementPresent(bp.getColorSizemarketplan());
		ca.click(bp.getColorSizemarketplan());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bp.getColorSizeMPRefresh());
		ca.click(bp.getColorSizeMPRefresh());
		ca.eleToBeClickable();

		int size1 = driver.findElements(By.xpath("//td[contains(@data-csi-heading,'Node Name:Child:ProductPlan')]")).size();
		if(size1==5)
		{
			System.out.println("All 5 values reflected in Market plan");
		}
		else
		{
			System.out.println("All 5 values not reflected in Market plan");
		}
	}

	@Then("User creates Business Plan for Material {string},{string},{string},{string}")
	public void user_creates_Business_Plan_for_Material(String BPValue2, String BPCategory2, String currency, String supplier) throws Throwable {
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		//Commonactions.isElementPresent(in.getPagecontentArrow());
		//ca.click(in.getPagecontentArrow());
		Commonactions.isElementPresent(hp.getBusinessPlanningBtn());
		ca.click(hp.getBusinessPlanningBtn());
		Commonactions.isElementPresent(bp.getBusinessplan());
		ca.click(bp.getBusinessplan());
		Commonactions.isElementPresent(bp.getBusinessplanbtn());
		ca.click(bp.getBusinessplanbtn());
		Commonactions.isElementPresent(bp.getBPValue());
		ca.insertText(bp.getBPValue(),BPValue2);
		Commonactions.isElementPresent(bp.getBPCategory());
		ca.insertText(bp.getBPCategory(), BPCategory2);
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bp.getBPCurrency());
		ca.insertText(bp.getBPCurrency(), currency);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bp.getBPSupplier());
		ca.insertText(bp.getBPSupplier(), supplier);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(qp.getNext());
		ca.click(qp.getNext());
		Commonactions.isElementPresent(bp.getFinishandGo());
		ca.click(bp.getFinishandGo());
		System.out.println("plan for material created");


		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//span[@data-csi-tab-name='Plan']")));
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bp.getTargetvolume());
		ca.click(bp.getTargetvolume());
		ca.eleToBeClickable();
		WebElement a14 = ca.activeElement();
		ca.eleToBeClickable();
		a14.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(a14, "100000");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		ca.click(bp.getTargetvolume());
		ca.eleToBeClickable();
		WebElement b14 = ca.activeElement();
		ca.eleToBeClickable();
		b14.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(b14, "100000");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		//Commonactions.isElementPresent(bp.getTargetmargin());
		//ca.click(bp.getTargetmargin());
		//ca.eleToBeClickable();
		WebElement a15 = ca.activeElement();
		ca.eleToBeClickable();
		a15.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(a15, "70");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.click(bp.getBMPRefresh());

		Commonactions.isElementPresent(bp.getMarketplan());
		ca.click(bp.getMarketplan());
		Commonactions.isElementPresent(bp.getProductplan());
		ca.click(bp.getProductplan());
		Commonactions.isElementPresent(bp.getProductplanexpand());
		ca.click(bp.getProductplanexpand());
		Commonactions.isElementPresent(bp.getNewfrommaterial());
		ca.click(bp.getNewfrommaterial());
		Commonactions.isElementPresent(bp.getCottonRayonJerseyCopy());
		ca.click(bp.getCottonRayonJerseyCopy());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bp.getProductplanexpand());
		ca.click(bp.getProductplanexpand());
		Commonactions.isElementPresent(bp.getMaterial_newfromcolor());
		ca.click(bp.getMaterial_newfromcolor());
		Commonactions.isElementPresent(bp.getCottonRayonJerseyCopy());
		ca.click(bp.getCottonRayonJerseyCopy());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bp.getProductplanexpand());
		ca.click(bp.getProductplanexpand());
		Commonactions.isElementPresent(bp.getMaterial_newfromsku());
		ca.click(bp.getMaterial_newfromsku());
		Commonactions.isElementPresent(bp.getCottonRayonJerseyCopy());
		ca.click(bp.getCottonRayonJerseyCopy());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bp.getProductplanexpand());
		ca.click(bp.getProductplanexpand());
		Commonactions.isElementPresent(bp.getMaterial_newfromsize());
		ca.click(bp.getMaterial_newfromsize());
		Commonactions.isElementPresent(bp.getCottonRayonJerseyCopy());
		ca.click(bp.getCottonRayonJerseyCopy());
		ca.click(qp.getNext());
		Commonactions.isElementPresent(bp.getSize30());
		ca.click(bp.getSize30());
		Commonactions.isElementPresent(qp.getFinish());
		ca.click(qp.getFinish());
		Commonactions.isElementPresent(bp.getPPRefresh());
		ca.click(bp.getPPRefresh());
		System.out.println("plan for material value updated");
	}

	SetupPageTK tk = new SetupPageTK();

	@When("User creates Enumeration value in Config_Setup {string},{string},{string}")
	public void user_creates_Enumeration_value_in_Config_Setup(String string, String string2, String string3) throws Throwable {

		String[] A = string.split(",");
		String[] B = string2.split(",");
		String[] C = string3.split(",");

		Commonactions.isElementPresent(hp.getUser_settingsBtn());
		ca.click(hp.getUser_settingsBtn());
		Commonactions.isElementPresent(hp.getSystem_config());
		ca.click(hp.getSystem_config());
		Commonactions.isElementPresent(co.getUser_config());
		ca.click(co.getUser_config());
		Commonactions.isElementPresent(su.getUser_Enumerations());
		ca.click(su.getUser_Enumerations());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bp.getNewEnumBtn());
		ca.click(bp.getNewEnumBtn());
		Commonactions.isElementPresent(bp.getNewEnumListValue());
		ca.insertText(bp.getNewEnumListValue(), A[0]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(tk.getUser_NewEnumValue());
		ca.click(tk.getUser_NewEnumValue());
		Commonactions.isElementPresent(tk.getUser_NewEnumName());
		ca.insertText(tk.getUser_NewEnumName(), A[1]);
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(tk.getUser_NewEnumName());
		ca.insertText(tk.getUser_NewEnumName(), A[2]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();


		Commonactions.isElementPresent(bp.getNewEnumBtn());
		ca.click(bp.getNewEnumBtn());
		Commonactions.isElementPresent(bp.getNewEnumListValue());
		ca.insertText(bp.getNewEnumListValue(), B[0]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bp.getDependson());
		ca.click(bp.getDependson());
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, A[0]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.click(bp.getEnumBvalue());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(tk.getUser_NewEnumValue());
		ca.click(tk.getUser_NewEnumValue());
		Commonactions.isElementPresent(tk.getUser_NewEnumName());
		ca.insertText(tk.getUser_NewEnumName(), B[1]);
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(tk.getUser_NewEnumName());
		ca.insertText(tk.getUser_NewEnumName(), B[2]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		for (int i = 0; i <= 100; i++) {


			ca.click(driver.findElement(By.xpath("//div[contains(text(),'New Enumeration Value')]//following::div[contains(@class,'Slider')]//span[text()='+']/parent::div")));

			if (bp.getEnumValuleDependson().isDisplayed()) {

				ca.click(driver.findElement(By.xpath("//div[contains(text(),'New Enumeration Value')]//following::div[contains(@class,'Slider')]//span[text()='+']/parent::div")));
				ca.click(driver.findElement(By.xpath("//div[contains(text(),'New Enumeration Value')]//following::div[contains(@class,'Slider')]//span[text()='+']/parent::div")));
				break;

			}
		}

		Commonactions.isElementPresent(bp.getEnumValuleDependson());
		ca.click(bp.getEnumValuleDependson());
		Commonactions.isElementPresent(bp.getEnumA1_checkbox());
		ca.click(bp.getEnumA1_checkbox());

		Commonactions.isElementPresent(bp.getNewEnumBtn());
		ca.click(bp.getNewEnumBtn());
		Commonactions.isElementPresent(bp.getNewEnumListValue());
		ca.insertText(bp.getNewEnumListValue(), C[0]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bp.getDependson());
		ca.click(bp.getDependson());
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a2, B[0]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.click(bp.getEnumCvalue());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(tk.getUser_NewEnumValue());
		ca.click(tk.getUser_NewEnumValue());
		Commonactions.isElementPresent(tk.getUser_NewEnumName());
		ca.insertText(tk.getUser_NewEnumName(), C[1]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		for (int i = 0; i <= 100; i++) {


			ca.click(driver.findElement(By.xpath("//div[contains(text(),'New Enumeration Value')]//following::div[contains(@class,'Slider')]//span[text()='+']/parent::div")));

			if (bp.getEnumValuleDependson().isDisplayed()) {

				ca.click(driver.findElement(By.xpath("//div[contains(text(),'New Enumeration Value')]//following::div[contains(@class,'Slider')]//span[text()='+']/parent::div")));
				ca.click(driver.findElement(By.xpath("//div[contains(text(),'New Enumeration Value')]//following::div[contains(@class,'Slider')]//span[text()='+']/parent::div")));
				break;

			}
		}

		Commonactions.isElementPresent(bp.getEnumValuleDependson());
		ca.click(bp.getEnumValuleDependson());
		Commonactions.isElementPresent(bp.getEnumB1_checkbox());
		ca.click(bp.getEnumB1_checkbox());

		System.out.println("Enum value created successfully");

	}

	@Then("User select Style from Business Object {string}")
	public void user_select_Style_from_Business_Object(String string) throws Throwable {

		Commonactions.isElementPresent(bp.getBusinessObject());
		ca.click(bp.getBusinessObject());
		Commonactions.isElementPresent(bp.getBusinessobj_Dropdown());
		ca.click(bp.getBusinessobj_Dropdown());
		Commonactions.isElementPresent(bp.getBusinessObject());
		ca.click(bp.getBusinessObject());
		Commonactions.isElementPresent(bp.getBusinessobj_Dropdown());
		ca.click(bp.getBusinessobj_Dropdown());
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		a2.sendKeys(string);
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bp.getStylecheckbox());
		ca.click(bp.getStylecheckbox());
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		a3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		System.out.println("Style for business object created successfully");
	}

	@Then("User create New Attribute for Enum values {string},{string},{string}")
	public void user_create_New_Attribute_for_Enum_values(String string, String string2, String string3) throws Throwable {

		String[] A = string.split(",");

		Commonactions.isElementPresent(bp.getStylevalue());
		ca.click(bp.getStylevalue());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bp.getNewAttribute());
		ca.click(bp.getNewAttribute());
		Commonactions.isElementPresent(bp.getAttributeName());
		ca.insertText(bp.getAttributeName(), A[0]);
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bp.getAttributeName());
		ca.insertText(bp.getAttributeName(), A[1]);
		Commonactions.isElementPresent(bp.getDisplayName());
		ca.insertText(bp.getDisplayName(), string3);
		Commonactions.isElementPresent(bp.getAttributeType());
		ca.click(bp.getAttributeType());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		a.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(bp.getAttributeType(), "boolean");
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.jsScrollPageDown(bp.getRequired_Checkbox());
		Commonactions.isElementPresent(bp.getRequired_Checkbox());
		ca.click(bp.getRequired_Checkbox());
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bp.getAttributeName());
		ca.insertText(bp.getAttributeName(), A[2]);
		Commonactions.isElementPresent(bp.getAttributeType());
		ca.click(bp.getAttributeType());
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		a1.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(bp.getAttributeType(), string2);
		ca.jsMouseOver();
		Commonactions.isElementPresent(bp.getAttributeSubtype());
		ca.insertText(bp.getAttributeSubtype(), "Enum A");
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bp.getAttributeName());
		ca.insertText(bp.getAttributeName(), A[3]);
		Commonactions.isElementPresent(bp.getAttributeType());
		ca.click(bp.getAttributeType());
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		a2.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(bp.getAttributeType(), string2);
		ca.jsMouseOver();
		Commonactions.isElementPresent(bp.getAttributeSubtype());
		ca.insertText(bp.getAttributeSubtype(), "Enum B");
		ca.jsMouseOver();
		Commonactions.isElementPresent(bp.getAttributeDependon());
		ca.insertText(bp.getAttributeDependon(), A[2]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(bp.getAutofill_checkbox());
		ca.click(bp.getAutofill_checkbox());
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bp.getAttributeName());
		ca.insertText(bp.getAttributeName(), A[4]);
		Commonactions.isElementPresent(bp.getAttributeType());
		ca.click(bp.getAttributeType());
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		a3.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(bp.getAttributeType(), string2);
		ca.jsMouseOver();
		Commonactions.isElementPresent(bp.getAttributeSubtype());
		ca.insertText(bp.getAttributeSubtype(), "Enum C");
		ca.jsMouseOver();
		Commonactions.isElementPresent(bp.getAttributeDependon());
		ca.insertText(bp.getAttributeDependon(), A[3]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(bp.getAutofill_checkbox());
		ca.click(bp.getAutofill_checkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		System.out.println("Style enum created successfully");

	}

	@Then("User Navigates to formDefinition")
	public void user_Navigates_to_formDefinition() {

		//Commonactions.isElementPresent(bp.getStyleAttribute_Arrow());
		//ca.click(bp.getStyleAttribute_Arrow());
		Commonactions.isElementPresent(bp.getFormDefinitionTab());
		ca.click(bp.getFormDefinitionTab());

		System.out.println("Navigates to form definition");

	}

	@Then("Select the Business Object Attributes")
	public void select_the_Business_Object_Attributes() throws Throwable {

		Commonactions.isElementPresent(bp.getSelectAttributes());
		ca.click(bp.getSelectAttributes());
		Commonactions.isElementPresent(bp.getEnum_A_chkbox());
		ca.click(bp.getEnum_A_chkbox());
		Commonactions.isElementPresent(bp.getEnum_B_chkbox());
		ca.click(bp.getEnum_B_chkbox());
		Commonactions.isElementPresent(bp.getEnum_C_chkbox());
		ca.click(bp.getEnum_C_chkbox());
		Commonactions.isElementPresent(bp.getAutoTest_chkbox());
		ca.click(bp.getAutoTest_chkbox());
		Commonactions.isElementPresent(bp.getAutoString_chkbox());
		ca.click(bp.getAutoString_chkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		System.out.println("BO attributes added successfully");

	}

	@Then("User Create New Style in Season {string},{string},{string}")
	public void user_Create_New_Style_in_Season(String season, String stylename, String enumvalue) throws Throwable {

		Commonactions.isElementPresent(hp.getStyleBtn());
		ca.click(hp.getStyleBtn());
		Commonactions.isElementPresent(st.getStyles_Btn());
		ca.click(st.getStyles_Btn());
		Commonactions.isElementPresent(pp.getTStyleBtn());
		ca.click(pp.getTStyleBtn());

		Commonactions.isElementPresent(bp.getStyleSeasonvalue());
		ca.insertText(bp.getStyleSeasonvalue(), season);
		ca.jsMouseOver();
		ca.eleToBeClickable(); ca.eleToBeClickable();
		Commonactions.isElementPresent(qp.getNext());
		ca.click(qp.getNext());
		ca.eleToBeClickable();
		ca.click(bp.getStyleName());
		Commonactions.isElementPresent(bp.getStyleName());
		ca.insertText(bp.getStyleName(), stylename);
		ca.click(bp.getStyleEnumvalue());
		Commonactions.isElementPresent(bp.getStyleEnumvalue());
		ca.insertText(bp.getStyleEnumvalue(), enumvalue);
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bp.getTestedByAuto());
		ca.click(bp.getTestedByAuto());
		Commonactions.isElementPresent(qp.getFinish());
		ca.click(qp.getFinish());
		ca.eleToBeClickable();
		System.out.println("Style created successfully");

	}

	@Then("User Clicks NewStyle and verify created values in BusinessObject")
	public void user_Clicks_NewStyle_and_verify_created_values_in_BusinessObject() throws Throwable {

		Commonactions.isElementPresent(bp.getApparel_BO_Name());
		ca.click(bp.getApparel_BO_Name());
		Commonactions.isElementPresent(bp.getJeans_value());
		ca.click(bp.getJeans_value());

		ca.jsScrollPageDown(bp.getApparel_BOValue());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bp.getNewJeancollectionStyle());
		ca.click(bp.getNewJeancollectionStyle());
		Commonactions.isElementPresent(bp.getStyleEnumvalue());
		ca.insertText(bp.getStyleEnumvalue(), "Test");
		Commonactions.isElementPresent(bp.getTestedByAuto());
		ca.click(bp.getTestedByAuto());
		Commonactions.isElementPresent(in.getCancel());
		ca.click(in.getCancel());

		System.out.println("verified enum and style successfully");


	}

	UserManagementPage up = new UserManagementPage();

	@Then("User Clicks ApparelBO and manage Views")
	public void user_Clicks_ApparelBO_and_manage_Views() throws Throwable {

		Commonactions.isElementPresent(bp.getApparel_BOValue());
		ca.click(bp.getApparel_BOValue());
		Commonactions.isElementPresent(bp.getApparelBOView());
		ca.click(bp.getApparelBOView());
		Commonactions.isElementPresent(bp.getApparelBOManageView());
		ca.click(bp.getApparelBOManageView());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "BO-Custom View");
		Commonactions.isElementPresent(bp.getAssBom());
		ca.click(bp.getAssBom());
		Actions a1 = new Actions(driver);
		for(int i=0;i<10;i++)
		{
			a1.sendKeys(Keys.DOWN).build().perform();	
		}
		Commonactions.isElementPresent(bp.getAutoString());
		ca.click(bp.getAutoString());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());

		Commonactions.isElementPresent(bp.getBrand());
		ca.click(bp.getBrand());
		for(int i=0;i<25;i++)
		{
			a1.sendKeys(Keys.DOWN).build().perform();	
		}
		Commonactions.isElementPresent(bp.getEnumA());
		ca.click(bp.getEnumA());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(bp.getEnumB());
		ca.click(bp.getEnumB());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(bp.getEnumC());
		ca.click(bp.getEnumC());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());

		Commonactions.isElementPresent(bp.getImage());
		ca.click(bp.getImage());
		for(int i=0;i<30;i++)
		{
			a1.sendKeys(Keys.DOWN).build().perform();	
		}
		Commonactions.isElementPresent(bp.getTestbyAutomation());
		ca.click(bp.getTestbyAutomation());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		System.out.println("Custom view for enum created successfully");

	}

	@Then("User Verify that AutoString {string}")
	public void user_Verify_that_AutoString(String string) throws Throwable {


		Commonactions.isElementPresent(bp.getAutoStringvalue());
		ca.click(bp.getAutoStringvalue());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, string);
		ca.eleToBeClickable();
		a.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		System.out.println("Auto string verified successfully");

	}





}
