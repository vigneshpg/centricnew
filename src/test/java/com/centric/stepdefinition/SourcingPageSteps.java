package com.centric.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.MaterialSpecificationPage;
import com.centric.objectrepository.PopupPage;
import com.centric.objectrepository.QualityPage;
import com.centric.objectrepository.SourcingPage;
import com.centric.objectrepository.SpecificationHierarchyPage;
import com.centric.objectrepository.StyleMaterialSamplepage;
import com.centric.objectrepository.UserManagementPage;
import com.centric.resources.Commonactions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SourcingPageSteps extends Commonactions{

	HomePage hp = new HomePage();
	Commonactions ca = new Commonactions();
	MaterialSpecificationPage mp = new MaterialSpecificationPage();
	PopupPage pp = new PopupPage();
	SourcingPage sp = new SourcingPage();


	public static String OG="";

	@When("User creates capability {string},{string},{string} and Operation group {string}")
	public void user_creates_capability_and_Operation_group(String string, String string2, String string3, String string4) throws Throwable {

		OG = string4;

		/*Commonactions.isElementPresent(hp.getSourcingBtn());
        ca.click(hp.getSourcingBtn());
        Commonactions.isElementPresent(sp.getSetup());
        ca.click(sp.getSetup());*/
		Commonactions.isElementPresent(hp.getUser_settingsBtn1());
		ca.click(hp.getUser_settingsBtn1()); 

		System.out.println("Setup tab clicked successfully");

		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Capabilities");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getCapability());
		ca.click(sp.getCapability());
		Commonactions.isElementPresent(sp.getNewCapabilityBtn());
		ca.click(sp.getNewCapabilityBtn());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement activeElement = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(activeElement, string);
		//Commonactions.isElementPresent(sp.getCapExtraColumn());
		// ca.click(sp.getCapExtraColumn());
		activeElement.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		String[] s = string.split("-");
		ca.eleToBeClickable();
		// ca.click(sp.getCapFor());
		ca.eleToBeClickable();
		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e, s[1].trim());
		ca.eleToBeClickable();
		ca.jsMouseOver();

		Commonactions.isElementPresent(sp.getNewCapabilityBtn());
		ca.click(sp.getNewCapabilityBtn());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement activeElement1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(activeElement1, string2);
		//  Commonactions.isElementPresent(sp.getCapExtraColumn());
		//  ca.click(sp.getCapExtraColumn());
		activeElement1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		String[] s1 = string2.split("-");
		Commonactions.isElementPresent(sp.getCapFor());
		//  ca.click(sp.getCapFor());
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e1, s1[1].trim());
		ca.eleToBeClickable();
		ca.jsMouseOver();

		Commonactions.isElementPresent(sp.getNewCapabilityBtn());
		ca.click(sp.getNewCapabilityBtn());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement activeElement2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(activeElement2, string3);
		activeElement2.sendKeys(Keys.TAB);
		//  Commonactions.isElementPresent(sp.getCapExtraColumn());
		//  ca.click(sp.getCapExtraColumn());
		ca.eleToBeClickable();
		String[] s2 = string3.split("-");
		ca.eleToBeClickable();
		// ca.click(sp.getCapFor());
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e2, s2[1].trim());
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(sp.getCopy_shipping());
		ca.click(sp.getCopy_shipping());
		//   Commonactions.isElementPresent(sp.getCapExtraColumn());
		//   ca.click(sp.getCapExtraColumn());
		Commonactions.isElementPresent(sp.getCopy_factory());
		ca.click(sp.getCopy_factory());
		ca.eleToBeClickable();
		WebElement e7 = ca.activeElement();
		ca.eleToBeClickable();
		e7.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		//   Commonactions.isElementPresent(sp.getCapExtraColumn());
		//   ca.click(sp.getCapExtraColumn());
		try
		{
			Commonactions.isElementPresent(hp.getData_Spec());
			ca.click(hp.getData_Spec());
			Commonactions.isElementPresent(sp.getDelete_factory());
			ca.click(sp.getDelete_factory());
			Commonactions.isElementPresent(pp.getDelete_Btn());
			ca.click(pp.getDelete_Btn());}
		catch(Exception c)
		{System.err.println("Unable to Delete factory DOM Load issue for loacting element"); }

		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Operation Groups");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getOperationGroup());
		ca.click(sp.getOperationGroup());
		Commonactions.isElementPresent(sp.getNewOGroupBtn());
		ca.click(sp.getNewOGroupBtn());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement activeElement3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(activeElement3, string4);
		ca.eleToBeClickable();
		activeElement3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Capabilities");
		ca.eleToBeClickable();
		ca.click(sp.getCapability());
		ca.eleToBeClickable();
		for (int i = 1; i <= 4; i++) {
			ca.eleToBeClickable();
			WebElement element = driver.findElement(By.xpath("(//td[@data-csi-heading='RoutingGroup::0'])["+i+"]"));
			ca.eleToBeClickable();
			ca.click(element);
			ca.eleToBeClickable();
			WebElement e5 = ca.activeElement();
			ca.eleToBeClickable();
			ca.insertText(e5, string4);
			ca.eleToBeClickable();
			ca.jsMouseOver();

		}


		System.out.println("Capability & Operating Group created Successfully");

	}

	@When("User creates sub routing {string},{string}")
	public void user_creates_sub_routing(String string, String string2) throws Throwable {

		try{

			ca.eleToBeClickable();
			Commonactions.isElementPresent(hp.getSetupSearch());
			ca.insertText(hp.getSetupSearch(), "Sub Routings");
			ca.eleToBeClickable();

		}catch (Exception excep) {
			// TODO: handle exception
		}

		Commonactions.isElementPresent(sp.getSub_Routing());
		ca.click(sp.getSub_Routing());
		Commonactions.isElementPresent(sp.getNewsubRoutingBtn());
		ca.click(sp.getNewsubRoutingBtn());
		Commonactions.isElementPresent(sp.getSubRoutingvalue());
		ca.insertText(sp.getSubRoutingvalue(), string);
		Commonactions.isElementPresent(sp.getSaveAndGoBtn());
		ca.click(sp.getSaveAndGoBtn());
		Commonactions.isElementPresent(sp.getActivechkbox());
		ca.click(sp.getActivechkbox());
		Commonactions.isElementPresent(sp.getOperatingGroup1());
		ca.click(sp.getOperatingGroup1());
		ca.eleToBeClickable();
		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e, OG);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sp.getAddCapability());
		ca.click(sp.getAddCapability());
		/*	Commonactions.isElementPresent(sp.getSupplierchkBox());
		ca.click(sp.getSupplierchkBox());*/
		Commonactions.isElementPresent(sp.getFactorychkBox());
		ca.click(sp.getFactorychkBox());
		Commonactions.isElementPresent(sp.getShippingPortChkBox());
		ca.click(sp.getShippingPortChkBox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());


		try{
			Commonactions.isElementPresent(hp.getUser_settingsBtn1());
			ca.click(hp.getUser_settingsBtn1()); 

			System.out.println("Setup tab clicked successfully");

			Commonactions.isElementPresent(hp.getData_Spec());
			ca.click(hp.getData_Spec());
			//  ca.eleToBeClickable();
			ca.eleToBeClickable();
			Commonactions.isElementPresent(hp.getSetupSearch());
			ca.insertText(hp.getSetupSearch(), "Sub Routings");
			ca.eleToBeClickable();
			Commonactions.isElementPresent(sp.getSub_Routing());
			ca.click(sp.getSub_Routing());

		}catch (Exception e1) {
			// TODO: handle exception
		}

		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getApproveActionsSR());
		Thread.sleep(1000);
		ca.click(sp.getApproveActionsSR());
		//	Commonactions.isElementPresent(sp.getApprove());
		//	ca.click(sp.getApprove());

		Commonactions.isElementPresent(sp.getNewsubRoutingBtn());
		ca.click(sp.getNewsubRoutingBtn());
		Commonactions.isElementPresent(sp.getSubRoutingvalue());
		ca.insertText(sp.getSubRoutingvalue(), string2);
		Commonactions.isElementPresent(sp.getSaveAndGoBtn());
		ca.click(sp.getSaveAndGoBtn());
		Commonactions.isElementPresent(sp.getActivechkbox());
		ca.click(sp.getActivechkbox());
		Commonactions.isElementPresent(sp.getOperatingGroup1());
		ca.click(sp.getOperatingGroup1());
		ca.eleToBeClickable();
		WebElement e3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e3, OG);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sp.getAddCapabilityDown());
		ca.click(sp.getAddCapabilityDown());
		Commonactions.isElementPresent(sp.getAddSubRouting());
		ca.click(sp.getAddSubRouting());
		Commonactions.isElementPresent(sp.getApprovedChkBox());
		ca.click(sp.getApprovedChkBox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(sp.getSRrefresh());
		ca.click(sp.getSRrefresh());
		Commonactions.isElementPresent(sp.getPlusIcondown());
		ca.click(sp.getPlusIcondown());
		Commonactions.isElementPresent(sp.getDivider());
		ca.click(sp.getDivider());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement activeElement = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(activeElement, "Divider");
		Commonactions.isElementPresent(sp.getSr_extracolumn());
		ca.click(sp.getSr_extracolumn());
		Commonactions.isElementPresent(sp.getPlusIcondown());
		ca.click(sp.getPlusIcondown());
		Commonactions.isElementPresent(sp.getSpecial());
		ca.click(sp.getSpecial());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement activeElement2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(activeElement2, "Special Sub Routing");
		Commonactions.isElementPresent(sp.getSr_extracolumn());
		ca.click(sp.getSr_extracolumn());

		try{
			ca.eleToBeClickable();
			ca.click(hp.getUser_homeBtn()); 

			System.out.println("home tab clicked successfully");
			ca.eleToBeClickable();

		}catch (Exception e2) {
			// TODO: handle exception
		}

		System.out.println("Sub Routing Created successfully");
	}

	static String CntryA,CntryB,CntryC="";

	@When("User creates Country {string},{string},{string}")
	public void user_creates_Country(String string, String string2, String string3) throws Throwable {

		try{

			Commonactions.isElementPresent(hp.getUser_settingsBtn1());
			ca.click(hp.getUser_settingsBtn1()); 

			System.out.println("Setup tab clicked successfully");

			Commonactions.isElementPresent(hp.getData_Spec());
			ca.click(hp.getData_Spec());
			//  ca.eleToBeClickable();
			ca.eleToBeClickable();
			Commonactions.isElementPresent(hp.getSetupSearch());
			ca.insertText(hp.getSetupSearch(), "Countries");
			ca.eleToBeClickable();

		}catch (Exception excep) {
			// TODO: handle exception
		}

		Commonactions.isElementPresent(sp.getCountries());
		ca.click(sp.getCountries());
		Commonactions.isElementPresent(sp.getNewCountriesBtn());
		ca.click(sp.getNewCountriesBtn());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement activeElement = ca.activeElement();
		ca.eleToBeClickable();
		String[] s = string.split("-");
		ca.eleToBeClickable();
		ca.insertText(activeElement, s[0].trim());
		CntryA=s[0].trim();
		Commonactions.isElementPresent(sp.getCntry_extraColumn());
		ca.click(sp.getCntry_extraColumn());
		Commonactions.isElementPresent(sp.getCntryCode());
		ca.click(sp.getCntryCode());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e, s[1].trim());
		Commonactions.isElementPresent(sp.getCntry_extraColumn());
		ca.click(sp.getCntry_extraColumn());
		Commonactions.isElementPresent(sp.getRegion());
		ca.click(sp.getRegion());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e1, s[2].trim());
		Commonactions.isElementPresent(sp.getCntry_extraColumn());
		ca.click(sp.getCntry_extraColumn());

		Commonactions.isElementPresent(sp.getNewCountriesBtn());
		ca.click(sp.getNewCountriesBtn());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement activeElement1 = ca.activeElement();
		ca.eleToBeClickable();
		String[] s1 = string2.split("-");
		ca.eleToBeClickable();
		ca.insertText(activeElement1, s1[0].trim());
		CntryB=s1[0].trim();
		Commonactions.isElementPresent(sp.getCntry_extraColumn());
		ca.click(sp.getCntry_extraColumn());
		ca.eleToBeClickable();
		ca.click(sp.getCntryCode());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e2, s1[1].trim());
		Commonactions.isElementPresent(sp.getCntry_extraColumn());
		ca.click(sp.getCntry_extraColumn());
		Commonactions.isElementPresent(sp.getRegion());
		ca.click(sp.getRegion());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e3, s1[2].trim());
		Commonactions.isElementPresent(sp.getCntry_extraColumn());
		ca.click(sp.getCntry_extraColumn());

		Commonactions.isElementPresent(sp.getNewCountriesBtn());
		ca.click(sp.getNewCountriesBtn());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement activeElement2 = ca.activeElement();
		ca.eleToBeClickable();
		String[] s2 = string3.split("-");
		ca.eleToBeClickable();
		ca.insertText(activeElement2, s2[0].trim());
		CntryC=s2[0].trim();
		Commonactions.isElementPresent(sp.getCntry_extraColumn());
		ca.click(sp.getCntry_extraColumn());
		Commonactions.isElementPresent(sp.getCntryCode());
		ca.click(sp.getCntryCode());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e4, s2[1].trim());
		Commonactions.isElementPresent(sp.getCntry_extraColumn());
		ca.click(sp.getCntry_extraColumn());
		Commonactions.isElementPresent(sp.getRegion());
		ca.click(sp.getRegion());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e5, s2[2].trim());
		Commonactions.isElementPresent(sp.getCntry_extraColumn());
		ca.click(sp.getCntry_extraColumn());

		System.out.println("Country created successfully");
	}

	@When("User creates sales region {string},{string}")
	public void user_creates_sales_region(String string, String string2) throws Throwable {

		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Sales Region Spec");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getSalesRegionSpecs());
		ca.click(sp.getSalesRegionSpecs());
		Commonactions.isElementPresent(sp.getNewSalesReginBtn());
		ca.click(sp.getNewSalesReginBtn());
		Commonactions.isElementPresent(sp.getSalesRegionValue());
		ca.insertText(sp.getSalesRegionValue(), string);
		Commonactions.isElementPresent(sp.getSellingcntryValue());
		ca.click(sp.getSellingcntryValue());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e, CntryA);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']")));
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//th[text()='Secondary Sales Regions']")));
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());

		Commonactions.isElementPresent(sp.getSalesRegionSpecs());
		Thread.sleep(1000);
		ca.click(sp.getSalesRegionSpecs());
		Commonactions.isElementPresent(sp.getNewSalesReginBtn());
		ca.click(sp.getNewSalesReginBtn());
		Commonactions.isElementPresent(sp.getSalesRegionValue());
		ca.insertText(sp.getSalesRegionValue(), string2);
		ca.eleToBeClickable();
		ca.click(sp.getSellingcntryValue());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e1, CntryA);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']")));
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//th[text()='Secondary Sales Regions']")));
		Commonactions.isElementPresent(sp.getSecondarySRValue());
		ca.click(sp.getSecondarySRValue());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e2, string);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//div[@role='option' and @item='1'])[2]")));
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//th[text()='Secondary Sales Regions']")));
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());

		System.out.println("Sales Region created successfully");


	}

	@When("User creates HTS code {string},{string},{string},{string},{string},{string}")
	public void user_creates_HTS_code(String string, String string2, String string3, String string4, String string5, String string6) throws Throwable {

		try{

			Commonactions.isElementPresent(hp.getUser_settingsBtn1());
			ca.click(hp.getUser_settingsBtn1()); 

			System.out.println("Setup tab clicked successfully");

			Commonactions.isElementPresent(hp.getData_Spec());
			ca.click(hp.getData_Spec());
			//  ca.eleToBeClickable();
			ca.eleToBeClickable();
			Commonactions.isElementPresent(hp.getSetupSearch());
			ca.insertText(hp.getSetupSearch(), "HTS Codes");
			ca.eleToBeClickable();

		}catch (Exception excep) {
			// TODO: handle exception
		}

		Commonactions.isElementPresent(sp.getHTSCode());
		ca.click(sp.getHTSCode());
		Commonactions.isElementPresent(sp.getNewHTSCodeBtn());
		ca.click(sp.getNewHTSCodeBtn());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement activeElement = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(activeElement, string);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[contains(@class,'DutyRates')]//span[text()='+']/parent::div")));
		Commonactions.isElementPresent(sp.getDescription());
		ca.click(sp.getDescription());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e, string3);
		//Commonactions.isElementPresent(sp.getDuty());
		try{
			ca.eleToBeClickable();
			//ca.jsScrollPageDown(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));


			for(int j = 1; j <=50; j++ ){
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Duty')]//span[text()='+']/parent::div")));
				if(sp.getDuty().isDisplayed()){

					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Duty')]//span[text()='+']/parent::div")));
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Duty')]//span[text()='+']/parent::div")));

					ca.eleToBeClickable();
					break;
				}
			}
		}catch (Exception exception) {
			// TODO: handle exception
		}
		ca.click(sp.getDuty());
		ca.eleToBeClickable();
		String[] s = string6.split("/");
		//ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys(Keys.DELETE);
		ca.insertText(e1, s[0]);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[contains(@class,'DutyRates')]//span[text()='+']/parent::div")));
		Commonactions.isElementPresent(sp.getFromCountry());
		ca.click(sp.getFromCountry());
		ca.eleToBeClickable();
		String[] s1 = string4.split("/");
		//ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e2, s1[0]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Thread.sleep(1000);
		//ca.click(sp.getToCountry());
		//ca.eleToBeClickable();
		String[] s2 = string5.split("/");
		Thread.sleep(1000);
		WebElement e3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e3, s2[0]);
		ca.eleToBeClickable();
		ca.jsMouseOver();

		Commonactions.isElementPresent(sp.getNewHTSCodeBtn());
		ca.click(sp.getNewHTSCodeBtn());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement activeElement1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(activeElement1, string2);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[contains(@class,'DutyRates')]//span[text()='+']/parent::div")));
		//	Commonactions.isElementPresent(sp.getDescription());
		try{
			ca.eleToBeClickable();
			//ca.jsScrollPageDown(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));


			for(int j = 1; j <=50; j++ ){
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Duty')]//span[text()='-']/parent::div")));
				if(sp.getDescription().isDisplayed()){

					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Duty')]//span[text()='-']/parent::div")));
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Duty')]//span[text()='-']/parent::div")));

					ca.eleToBeClickable();
					break;
				}
			}
		}catch (Exception exception) {
			// TODO: handle exception
		}
		ca.click(sp.getDescription());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e4, string3);
		//Commonactions.isElementPresent(sp.getDuty());
		try{
			ca.eleToBeClickable();
			//ca.jsScrollPageDown(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));


			for(int j = 1; j <=50; j++ ){
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Duty')]//span[text()='+']/parent::div")));
				if(sp.getDuty().isDisplayed()){

					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Duty')]//span[text()='+']/parent::div")));
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Duty')]//span[text()='+']/parent::div")));

					ca.eleToBeClickable();
					break;
				}
			}
		}catch (Exception exception) {
			// TODO: handle exception
		}
		ca.click(sp.getDuty());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e5 = ca.activeElement();
		ca.eleToBeClickable();
		e5.sendKeys(Keys.DELETE);
		//String[] s = string6.split("/");
		ca.insertText(e5, s[1]);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[contains(@class,'DutyRates')]//span[text()='+']/parent::div")));
		Commonactions.isElementPresent(sp.getFromCountry());
		ca.click(sp.getFromCountry());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e6 = ca.activeElement();
		ca.eleToBeClickable();
		//String[] s1 = string4.split("/");
		ca.insertText(e6, s1[1]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		//ca.click(sp.getToCountry());
		//ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e7 = ca.activeElement();
		ca.eleToBeClickable();
		//String[] s2 = string5.split("/");
		ca.insertText(e7, s2[1]);
		ca.eleToBeClickable();
		ca.jsMouseOver();

		System.out.println("HTS Code created successfully");

	}

	@When("User creates container {string},{string},{string},{string}")
	public void user_creates_container(String string, String string2, String string3, String string4) throws Throwable {

		try{

			Commonactions.isElementPresent(hp.getUser_settingsBtn1());
			ca.click(hp.getUser_settingsBtn1()); 

			System.out.println("Setup tab clicked successfully");

			Commonactions.isElementPresent(hp.getData_Spec());
			ca.click(hp.getData_Spec());
			//  ca.eleToBeClickable();
			ca.eleToBeClickable();
			Commonactions.isElementPresent(hp.getSetupSearch());
			ca.insertText(hp.getSetupSearch(), "Shipping Containers");
			ca.eleToBeClickable();

		}catch (Exception excep) {
			// TODO: handle exception
		}

		Commonactions.isElementPresent(sp.getShippingContainer());
		ca.click(sp.getShippingContainer());
		Commonactions.isElementPresent(sp.getNewShipContainerBtn());
		ca.click(sp.getNewShipContainerBtn());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement activeElement = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(activeElement, string+" - 01");
		//Commonactions.isElementPresent(sp.getSC_extraColumn());
		activeElement.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		//	Commonactions.isElementPresent(sp.getMaxVolume());
		//	ca.click(sp.getMaxVolume());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		e.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		String[] s = string2.split("/");
		ca.eleToBeClickable();
		ca.insertText(e, s[0]);
		//Commonactions.isElementPresent(sp.getSC_extraColumn());
		e.sendKeys(Keys.TAB);
		//	Commonactions.isElementPresent(sp.getMaxWeight());
		//	ca.click(sp.getMaxWeight());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		String[] s1 = string3.split("/");
		ca.insertText(e1, s1[0]);
		//Commonactions.isElementPresent(sp.getSC_extraColumn());
		e1.sendKeys(Keys.TAB);
		//	Commonactions.isElementPresent(sp.getPAckingEff());
		//	ca.click(sp.getPAckingEff());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		e2.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		String[] s2 = string4.split("/");
		ca.insertText(e2, s2[0]);
		//Commonactions.isElementPresent(sp.getSC_extraColumn());
		e2.sendKeys(Keys.TAB);

		Commonactions.isElementPresent(sp.getNewShipContainerBtn());
		ca.click(sp.getNewShipContainerBtn());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement activeElement2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(activeElement2, string+" - 02");
		//Commonactions.isElementPresent(sp.getSC_extraColumn());
		activeElement2.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		//	Commonactions.isElementPresent(sp.getMaxVolume());
		//	ca.click(sp.getMaxVolume());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e3 = ca.activeElement();
		ca.eleToBeClickable();
		e3.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		//String[] s = string2.split("/");
		ca.insertText(e3, s[1]);
		//Commonactions.isElementPresent(sp.getSC_extraColumn());
		e3.sendKeys(Keys.TAB);
		//	Commonactions.isElementPresent(sp.getMaxWeight());
		//	ca.click(sp.getMaxWeight());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e4 = ca.activeElement();
		ca.eleToBeClickable();
		e4.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		//String[] s1 = string3.split("/");
		ca.insertText(e4, s1[1]);
		//Commonactions.isElementPresent(sp.getSC_extraColumn());
		e4.sendKeys(Keys.TAB);
		//	Commonactions.isElementPresent(sp.getPAckingEff());
		//	ca.click(sp.getPAckingEff());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e5 = ca.activeElement();
		ca.eleToBeClickable();
		e5.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		//String[] s2 = string4.split("/");
		ca.insertText(e5, s2[1]);
		//Commonactions.isElementPresent(sp.getSC_extraColumn());
		e5.sendKeys(Keys.TAB);

		Commonactions.isElementPresent(sp.getCopy_shipContainer());
		ca.click(sp.getCopy_shipContainer());
		WebElement activeElement3 = ca.activeElement();
		activeElement3.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(sp.getDelete_shipContainer());
		ca.click(sp.getDelete_shipContainer());
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());

		System.out.println("Container created successfully");
	}

	@When("User creates shipping port {string},{string},{string},{string}")
	public void user_creates_shipping_port(String string, String string2, String string3, String string4) throws Throwable {

		try{

			Commonactions.isElementPresent(hp.getUser_settingsBtn1());
			ca.click(hp.getUser_settingsBtn1()); 

			System.out.println("Setup tab clicked successfully");

			Commonactions.isElementPresent(hp.getData_Spec());
			ca.click(hp.getData_Spec());
			//  ca.eleToBeClickable();
			ca.eleToBeClickable();
			Commonactions.isElementPresent(hp.getSetupSearch());
			ca.insertText(hp.getSetupSearch(), "Shipping Ports");
			ca.eleToBeClickable();

		}catch (Exception excep) {
			// TODO: handle exception
		}

		String[] s = string.split("/");
		String[] s1 = string2.split("/");
		String[] s2 = string3.split("/");
		String[] s3 = string4.split("/");

		Commonactions.isElementPresent(sp.getShippingport());
		ca.click(sp.getShippingport());
		Commonactions.isElementPresent(sp.getNewShippingPortBtn());
		ca.click(sp.getNewShippingPortBtn());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement activeElement = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(activeElement, s[0]);
		Commonactions.isElementPresent(sp.getSP_extraColumn());
		ca.click(sp.getSP_extraColumn());
		Commonactions.isElementPresent(sp.getSPcountry());
		ca.click(sp.getSPcountry());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e, s[1]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		//ca.click(sp.getTaxId());
		//ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e1, s[2]);
		Commonactions.isElementPresent(sp.getSP_extraColumn());
		ca.click(sp.getSP_extraColumn());

		Commonactions.isElementPresent(sp.getNewShippingPortBtn());
		ca.click(sp.getNewShippingPortBtn());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement activeElement1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(activeElement1, s1[0]);
		Commonactions.isElementPresent(sp.getSP_extraColumn());
		ca.click(sp.getSP_extraColumn());
		Commonactions.isElementPresent(sp.getSPcountry());
		ca.click(sp.getSPcountry());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e2, s1[1]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		//ca.click(sp.getTaxId());
		//ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e3, s1[2]);
		Commonactions.isElementPresent(sp.getSP_extraColumn());
		ca.click(sp.getSP_extraColumn());

		Commonactions.isElementPresent(sp.getNewShippingPortBtn());
		ca.click(sp.getNewShippingPortBtn());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement activeElement2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(activeElement2, s2[0]);
		Commonactions.isElementPresent(sp.getSP_extraColumn());
		ca.click(sp.getSP_extraColumn());
		Commonactions.isElementPresent(sp.getSPcountry());
		ca.click(sp.getSPcountry());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e4, s2[1]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		//ca.click(sp.getTaxId());
		//ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e5, s2[2]);
		Commonactions.isElementPresent(sp.getSP_extraColumn());
		ca.click(sp.getSP_extraColumn());

		Commonactions.isElementPresent(sp.getNewShippingPortBtn());
		ca.click(sp.getNewShippingPortBtn());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement activeElement3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(activeElement3, s3[0]);
		Commonactions.isElementPresent(sp.getSP_extraColumn());
		ca.click(sp.getSP_extraColumn());
		Commonactions.isElementPresent(sp.getSPcountry());
		ca.click(sp.getSPcountry());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e6 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e6, s3[1]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		//ca.click(sp.getTaxId());
		//ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e7 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e7, s3[2]);
		Commonactions.isElementPresent(sp.getSP_extraColumn());
		ca.click(sp.getSP_extraColumn());

		Commonactions.isElementPresent(sp.getSP_Copy());
		ca.click(sp.getSP_Copy());
		Commonactions.isElementPresent(sp.getSP_extraColumn());
		ca.click(sp.getSP_extraColumn());
		Commonactions.isElementPresent(sp.getSP_Delete());
		Thread.sleep(1000);
		try{
			Commonactions.clickjs(sp.getSP_Delete());
			Commonactions.isElementPresent(pp.getDelete_Btn());
			Commonactions.clickjs(pp.getDelete_Btn());
		}catch (Exception exp) {
			// TODO: handle exception
		}
		System.out.println("Port created successfully");

	}

	@When("User creates shipping rate {string},{string},{string},{string},{string},{string}")
	public void user_creates_shipping_rate(String string, String string2, String string3, String string4, String string5, String string6) throws Throwable {

		try{

			Commonactions.isElementPresent(hp.getUser_settingsBtn1());
			ca.click(hp.getUser_settingsBtn1()); 

			System.out.println("Setup tab clicked successfully");

			Commonactions.isElementPresent(hp.getData_Spec());
			ca.click(hp.getData_Spec());
			//  ca.eleToBeClickable();
			ca.eleToBeClickable();
			Commonactions.isElementPresent(hp.getSetupSearch());
			ca.insertText(hp.getSetupSearch(), "Shipping Rates");
			ca.eleToBeClickable();

		}catch (Exception excep) {
			// TODO: handle exception
		}

		String[] s1 = string3.split("/");
		String[] s2 = string4.split("/");
		String[] s3 = string5.split("/");

		Commonactions.isElementPresent(sp.getShippingRate());
		ca.click(sp.getShippingRate());
		Commonactions.isElementPresent(sp.getNewShippingRateBtn());
		ca.click(sp.getNewShippingRateBtn());
		Commonactions.isElementPresent(sp.getShippingRateValue());
		ca.insertText(sp.getShippingRateValue(), string);
		Commonactions.isElementPresent(sp.getFreightRate());
		ca.insertText(sp.getFreightRate(), s1[0]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(sp.getOrigin());
		ca.click(sp.getOrigin());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e, s2[0]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		//ca.click(sp.getDestination());
		//ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e1, s3[0]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		//	Commonactions.isElementPresent(sp.getContainer());
		try{
			ca.eleToBeClickable();
			//ca.jsScrollPageDown(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));


			for(int j = 1; j <=50; j++ ){
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Shipping')]//span[text()='+']/parent::div")));
				if(sp.getContainer().isDisplayed()){

					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Shipping')]//span[text()='+']/parent::div")));
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Shipping')]//span[text()='+']/parent::div")));

					ca.eleToBeClickable();
					break;
				}
			}
		}catch (Exception exception) {
			// TODO: handle exception
		}
		ca.click(sp.getContainer());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e2, string6+" - 01");
		ca.eleToBeClickable();
		ca.jsMouseOver();

		Commonactions.isElementPresent(sp.getNewShippingRateBtn());
		ca.click(sp.getNewShippingRateBtn());
		Commonactions.isElementPresent(sp.getShippingRateValue());
		ca.insertText(sp.getShippingRateValue(), string2);
		Commonactions.isElementPresent(sp.getFreightRate());
		ca.insertText(sp.getFreightRate(), s1[1]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		try{
			ca.eleToBeClickable();
			//ca.jsScrollPageDown(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));


			for(int j = 1; j <=50; j++ ){
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Shipping')]//span[text()='-']/parent::div")));
				if(sp.getOrigin().isDisplayed()){

					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Shipping')]//span[text()='-']/parent::div")));
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Shipping')]//span[text()='-']/parent::div")));

					ca.eleToBeClickable();
					break;
				}
			}
		}catch (Exception exception) {
			// TODO: handle exception
		}
		ca.click(sp.getOrigin());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e3, s2[1]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		//ca.click(sp.getDestination());
		//ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e4, s3[1]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		//	Commonactions.isElementPresent(sp.getContainer());
		try{
			ca.eleToBeClickable();
			//ca.jsScrollPageDown(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));


			for(int j = 1; j <=50; j++ ){
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Shipping')]//span[text()='+']/parent::div")));
				if(sp.getContainer().isDisplayed()){

					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Shipping')]//span[text()='+']/parent::div")));
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Shipping')]//span[text()='+']/parent::div")));

					ca.eleToBeClickable();
					break;
				}
			}
		}catch (Exception exception) {
			// TODO: handle exception
		}
		ca.click(sp.getContainer());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e5, string6+" - 02");
		ca.eleToBeClickable();
		ca.jsMouseOver();

		Commonactions.isElementPresent(sp.getShippingRateCopy());
		ca.click(sp.getShippingRateCopy());
		Commonactions.isElementPresent(sp.getShippingRateValue());
		ca.insertText(sp.getShippingRateValue(), string2+" - Copy");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(sp.getDeleteshipRate());
		ca.click(sp.getDeleteshipRate());
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());

		System.out.println("Rate created successfully");

	}

	UserManagementPage up = new UserManagementPage();
	StyleMaterialSamplepage sm = new StyleMaterialSamplepage();
	QualityPage qp = new QualityPage();

	@When("User creates routing template {string},{string},{string},{string}")
	public void user_creates_routing_template(String string, String string2, String string3, String string4) throws Throwable {

		Commonactions.isElementPresent(hp.getUser_settingsBtn1());
		ca.click(hp.getUser_settingsBtn1()); 

		System.out.println("Setup tab clicked successfully");

		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());
		//  ca.eleToBeClickable();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Routing Templates");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getTemplate());
		ca.click(sp.getTemplate());

		Commonactions.isElementPresent(sp.getNewRoutingBtn());
		ca.jsScrollPageDown(sp.getNewRoutingBtn());
		Commonactions.isElementPresent(sp.getNewRoutingBtn());
		ca.click(sp.getNewRoutingBtn());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement activeElement = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(activeElement, string);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getRouting_extraColumn());
		ca.click(sp.getRouting_extraColumn());
		Commonactions.isElementPresent(sp.getDescription());
		ca.click(sp.getDescription());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement e7 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e7, string2);
		Commonactions.isElementPresent(sp.getRouting_extraColumn());
		ca.click(sp.getRouting_extraColumn());
		Commonactions.isElementPresent(sp.getNewRoutingCopy());
		ca.click(sp.getNewRoutingCopy());
		Commonactions.isElementPresent(sp.getRouting_extraColumn());
		ca.click(sp.getRouting_extraColumn());
		Commonactions.isElementPresent(sp.getNewRoutingDelete());
		ca.click(sp.getNewRoutingDelete());
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());

		Commonactions.isElementPresent(sp.getRoutTemp_Name());
		ca.click(sp.getRoutTemp_Name());
		Commonactions.isElementPresent(sp.getRouting_AddCapabilty());
		ca.eleToBeClickable();
		ca.click(sp.getRouting_AddCapabilty());
		/*Commonactions.isElementPresent(sp.getSupplierchkBox());
		ca.click(sp.getSupplierchkBox());*/
		Commonactions.isElementPresent(sp.getFactorychkBox());
		ca.click(sp.getFactorychkBox());
		Commonactions.isElementPresent(sp.getShippingPortChkBox());
		ca.click(sp.getShippingPortChkBox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getToolbar());
		ca.click(sp.getToolbar());
		Commonactions.isElementPresent(sp.getAddCapExpand());
		ca.click(sp.getAddCapExpand());
		Commonactions.isElementPresent(sp.getAddSubRouting());
		ca.click(sp.getAddSubRouting());
		Commonactions.isElementPresent(sp.getApprovedChkBox());
		ca.click(sp.getApprovedChkBox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		ca.click(sp.getAddCapExpand());
		Commonactions.isElementPresent(sp.getDivider());		
		ca.click(sp.getDivider());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, string3);
		a.sendKeys(Keys.TAB);
		//Commonactions.isElementPresent(sp.getSr_extracolumn());
		//ca.click(sp.getSr_extracolumn());
		Commonactions.isElementPresent(sp.getRoutingCapCopy());

		ca.click(sp.getRoutingCapCopy());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//td[@data-csi-heading='PcsPerHr::0'])[1]")));
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		a1.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(a1, "10");
		ca.eleToBeClickable();
		a1.sendKeys(Keys.TAB);

		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//td[@data-csi-heading='PcsPerHr::0'])[2]")));
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		a2.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(a2, "15");
		ca.eleToBeClickable();
		a2.sendKeys(Keys.TAB);

		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//td[@data-csi-heading='PcsPerHr::0'])[3]")));
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		a3.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(a3, "20");
		ca.eleToBeClickable();
		a3.sendKeys(Keys.TAB);

		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//td[@data-csi-heading='PcsPerHr::0'])[4]")));
		ca.eleToBeClickable();
		WebElement a4 = ca.activeElement();
		a4.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(a4, "25");
		ca.eleToBeClickable();
		a4.sendKeys(Keys.TAB);

		ca.eleToBeClickable();
		try{
			boolean displayed = driver.findElement(By.xpath("(//td[@data-csi-heading='PcsPerHr::0'])[5]")).isDisplayed();	
			if(displayed==true)
			{
				ca.click(driver.findElement(By.xpath("(//td[@data-csi-heading='PcsPerHr::0'])[5]")));
				ca.eleToBeClickable();
				WebElement a5 = ca.activeElement();
				a5.sendKeys(Keys.DELETE);
				ca.eleToBeClickable();
				ca.insertText(a5, "30");
				ca.eleToBeClickable();
				a5.sendKeys(Keys.TAB);}
		}
		catch(Exception e){}
		//ca.eleToBeClickable();
		//ca.click(sp.getFactories());
		//ca.eleToBeClickable();
		//ca.click(sm.getGoTodialog);
		//ca.eleToBeClickable();
		//ca.click(sp.getFactChkBx());
		//ca.eleToBeClickable();
		//ca.click(mp.getSave_btn1());

		System.out.println("Routing template created successfully");
	}

	@When("User creates quote template {string},{string}")
	public void user_creates_quote_template(String string, String string2) throws Throwable {


		try{
			Commonactions.isElementPresent(hp.getUser_settingsBtn1());
			ca.click(hp.getUser_settingsBtn1()); 

			System.out.println("Setup tab clicked successfully");

			Commonactions.isElementPresent(hp.getData_Spec());
			ca.click(hp.getData_Spec());	
			ca.eleToBeClickable();
			Commonactions.isElementPresent(hp.getSetupSearch());
			ca.insertText(hp.getSetupSearch(), "Supplier Quote Templates");
			ca.eleToBeClickable();

		}catch (Exception excep) {
			// TODO: handle exception
		}



		Commonactions.isElementPresent(sp.getTemplate());
		ca.click(sp.getTemplate());

		Commonactions.isElementPresent(sp.getNewSQTBtn());
		ca.jsScrollPageDown(sp.getNewSQTBtn());
		Commonactions.isElementPresent(sp.getNewSQTBtn());
		Commonactions.clickjs(sp.getNewSQTBtn());
		Commonactions.isElementPresent(sp.getSQTValue());
		ca.insertText(sp.getSQTValue(), string);
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());

		Commonactions.isElementPresent(sp.getQuoteName());
		ca.click(sp.getQuoteName());
		Commonactions.isElementPresent(sp.getHtsQuoteBtn());
		ca.click(sp.getHtsQuoteBtn());
		Commonactions.isElementPresent(sp.getIndiaHtsChkBx());
		ca.click(sp.getIndiaHtsChkBx());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getCost_Scenario());
		ca.click(sp.getCost_Scenario());
		Commonactions.isElementPresent(sp.getManageCostScenario());
		ca.click(sp.getManageCostScenario());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(sp.getQuoteViews());
		Thread.sleep(4000);
		ca.click(sp.getQuoteViews());
		Commonactions.isElementPresent(sp.getQuoteManageViews());
		ca.click(sp.getQuoteManageViews());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "Automation");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getCustomValue());
		ca.click(sp.getCustomValue());
		ca.insertText(sp.getCustomValue(), "Cost Group Attributes");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sp.getFixed());
		ca.click(sp.getFixed());
		Commonactions.isElementPresent(sp.getAdd());
		ca.click(sp.getAdd());
		Commonactions.isElementPresent(sp.getVariable());
		ca.click(sp.getVariable());
		Commonactions.isElementPresent(sp.getAdd());
		ca.click(sp.getAdd());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.jsScrollPageDown(mp.getSave_btn1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());

		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getLabour_rate());
		ca.click(sp.getLabour_rate());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		a.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(a, "15000");
		ca.eleToBeClickable();
		a.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		//	ca.click(sp.getFixed_rate());
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		a1.sendKeys(Keys.DELETE);
		ca.insertText(a1, "4");
		ca.eleToBeClickable();
		a1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		//	ca.click(sp.getVariable_rate());
		//	ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		a2.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(a2, "5");
		ca.eleToBeClickable();
		a2.sendKeys(Keys.TAB);

		Commonactions.isElementPresent(sp.getMaterialCostBtn());
		ca.click(sp.getMaterialCostBtn());
		ca.eleToBeClickable();
		WebElement a4 = ca.activeElement();
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.insertText(a4, string2);
		ca.eleToBeClickable();
		//a4.sendKeys(Keys.TAB);
		//ca.eleToBeClickable();
		ca.jsScrollPageDown(sp.getQty());
		ca.click(sp.getQty());
		ca.eleToBeClickable();
		WebElement a5 = ca.activeElement();
		ca.eleToBeClickable();
		a5.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(a5, "300");
		ca.eleToBeClickable();
		a5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement a6 = ca.activeElement();
		ca.eleToBeClickable();
		a6.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement a7 = ca.activeElement();
		ca.eleToBeClickable();
		a7.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(a7, "100");
		ca.eleToBeClickable();
		a7.sendKeys(Keys.TAB);

		Commonactions.isElementPresent(qp.getCheckDoc());
		ca.click(qp.getCheckDoc());
		Commonactions.isElementPresent(sp.getSupplier_Quote());
		ca.click(sp.getSupplier_Quote());
		ca.eleToBeClickable();
		String text = Commonactions.getText(sp.getFob());
		ca.eleToBeClickable();
		Assert.assertTrue(!text.equals(null));

		System.out.println("Supplier Quote template created successfully");

	}

	static String DPTA,DPTB;

	@Then("User creates data package template in specification {string},{string}")
	public void user_creates_data_package_template_in_specification(String string, String string2) throws Throwable {

		DPTA=string;
		DPTB=string2;
		Commonactions.isElementPresent(hp.getUser_settingsBtn1());
		ca.click(hp.getUser_settingsBtn1()); 

		System.out.println("Setup tab clicked successfully");

		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());	
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Data Package Templates");
		ca.eleToBeClickable();

		Commonactions.isElementPresent(sp.getTemplate());
		ca.click(sp.getTemplate());
		Commonactions.isElementPresent(sp.getDataPacktempBtn());
		ca.click(sp.getDataPacktempBtn());
		Commonactions.isElementPresent(sp.getDPTValue());
		ca.insertText(sp.getDPTValue(), string);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());


		String[] s = string2.split("-");
		Commonactions.isElementPresent(sp.getDataPacktempBtn());
		ca.click(sp.getDataPacktempBtn());
		Commonactions.isElementPresent(sp.getDPTValue());
		ca.insertText(sp.getDPTValue(), string2);
		Commonactions.isElementPresent(sp.getDPTType());
		ca.click(sp.getDPTType());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, s[1].trim());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());

		System.out.println("Data Package template created successfully");

	}

	@Then("User creates supplier request templates {string},{string},{string},{string},{string}")
	public void user_creates_supplier_request_templates(String string, String string2, String string3, String string4, String string5) throws Throwable {

		Commonactions.isElementPresent(hp.getUser_settingsBtn1());
		ca.click(hp.getUser_settingsBtn1()); 

		System.out.println("Setup tab clicked successfully");

		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());	
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Supplier Request Templates");
		ca.eleToBeClickable();

		Commonactions.isElementPresent(sp.getTemplate());
		ca.click(sp.getTemplate());
		//	ca.eleToBeClickable();
		//	ca.click(driver.findElement(By.xpath("(//span[text()='Templates' or @data-csi-tab='SiteLibSupplierItem-SupplierItemSetup'])[2]")));



		Commonactions.isElementPresent(sp.getTempViews());
		ca.click(sp.getTempViews());
		Commonactions.isElementPresent(sp.getTemp_ManViews());
		ca.click(sp.getTemp_ManViews());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "Automation");
		Commonactions.isElementPresent(sp.getInspirationStyleType());
		ca.click(sp.getInspirationStyleType());
		Commonactions.isElementPresent(sp.getAdd());
		ca.click(sp.getAdd());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.jsScrollPageDown(mp.getSave_btn1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());

		ca.eleToBeClickable();
		ca.click(sp.getNewSRTBtn());
		Commonactions.isElementPresent(sp.getSRTValue());
		ca.insertText(sp.getSRTValue(), string);
		Commonactions.isElementPresent(sp.getSRTSuppliersValue());
		ca.click(sp.getSRTSuppliersValue());
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.insertText(e1, string3);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		e1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		//	ca.insertText(a, DPTA);
		ca.insertText(a, "DPT - Style");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sm.getSampleType1());
		ca.click(sm.getSampleType1());
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, string4);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getPlusIcon());
		for (int i = 0; i <= 200; i++) {

			ca.click(sp.getPlusIcon());
			if(sp.getInspirStyleTyevalue().isDisplayed()){
				ca.click(sp.getPlusIcon());
				ca.click(sp.getPlusIcon());
				Commonactions.isElementPresent(sp.getInspirStyleTyevalue());
				ca.click(sp.getInspirStyleTyevalue());
				ca.eleToBeClickable();
				WebElement e7 = ca.activeElement();
				ca.eleToBeClickable();
				Thread.sleep(1000);
				ca.insertText(e7, "Apparel - Color and Size");
				ca.eleToBeClickable();
				ca.jsMouseOver();
				break;
			}


		}

		Commonactions.isElementPresent(sp.getNewSRTBtn());
		ca.click(sp.getNewSRTBtn());
		Commonactions.isElementPresent(sp.getSRTValue());
		ca.insertText(sp.getSRTValue(), string2);
		ca.eleToBeClickable();
		String[] s = string2.split("-");
		ca.eleToBeClickable();
		ca.click(sp.getSRTType());
		ca.eleToBeClickable();
		WebElement e4 = ca.activeElement();
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.insertText(e4, s[1].trim());
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sp.getSRTSuppliersValue());
		ca.click(sp.getSRTSuppliersValue());
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.insertText(e2, string3);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		e2.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		//	ca.insertText(a2, DPTB);
		ca.insertText(a2, "DPT - Material");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sm.getSampleType1());
		ca.click(sm.getSampleType1());
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a3, string5);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());




		System.out.println("Supplier Request Template created successfully");

		//driver.close();

	}

	SpecificationHierarchyPage sk = new SpecificationHierarchyPage();

	@Then("User creates and validates Questions subsection{string}")
	public void user_creates_and_validates_Questions_subsection(String string) throws Throwable {

		Commonactions.isElementPresent(hp.getUser_settingsBtn1());
		ca.click(hp.getUser_settingsBtn1()); 

		System.out.println("Setup tab clicked successfully");

		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());
		//  ca.eleToBeClickable();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Question Subsections");
		ca.eleToBeClickable();

		//	Commonactions.isElementPresent(sp.getReviewsetup());
		//	ca.click(sp.getReviewsetup());
		Commonactions.isElementPresent(sp.getQuestionSetup());
		ca.click(sp.getQuestionSetup());
		Commonactions.isElementPresent(sp.getNewQuestionSubSectionBtn());
		ca.click(sp.getNewQuestionSubSectionBtn());
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e1, "What is the factory condition?");
		//Commonactions.isElementPresent(sp.getReviewsExtraColumn());
		e1.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(sk.getGreater_Icon1());

		ca.click(sk.getGreater_Icon1());
		Commonactions.isElementPresent(sk.getPlus_Icon_1());
		ca.click(sk.getPlus_Icon_1());
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e2, "How the factories machine made?");
		//Commonactions.isElementPresent(sp.getReviewsExtraColumn());
		e2.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		try{
			for(int i = 1; i <=50; i++ ){
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Question')]//span[text()='+']/parent::div")));
				if(sp.getPointspossible1().isDisplayed()){

					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Question')]//span[text()='+']/parent::div")));
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Question')]//span[text()='+']/parent::div")));
					ca.click(sp.getPointspossible1());
					ca.eleToBeClickable();
					break;
				}
			}
		}catch (Exception exception) {
			// TODO: handle exception
		}

		String[] s = string.split("/");
		ca.eleToBeClickable();
		WebElement e3 = ca.activeElement();
		ca.eleToBeClickable();
		e3.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e3, s[0]);
		//Commonactions.isElementPresent(sp.getReviewsExtraColumn());
		e3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();


		ca.click(sp.getPlusicon1());
		ca.eleToBeClickable();
		WebElement e4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e4, "These machines are new one?");
		//Commonactions.isElementPresent(sp.getReviewsExtraColumn());
		e4.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(sk.getGreater_Icon3());
		ca.click(sk.getGreater_Icon3());
		Commonactions.isElementPresent(sp.getPlusicon1());
		ca.click(sp.getPlusicon1());
		ca.eleToBeClickable();
		WebElement e5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e5, "In which country machine are manufactured?");
		//Commonactions.isElementPresent(sp.getReviewsExtraColumn());
		e5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		try{
			for(int i = 1; i <=50; i++ ){
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Question')]//span[text()='+']/parent::div")));
				if(sp.getPointspossible2().isDisplayed()){

					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Question')]//span[text()='+']/parent::div")));
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Question')]//span[text()='+']/parent::div")));
					ca.click(sp.getPointspossible2());
					ca.eleToBeClickable();
					break;
				}
			}
		}catch (Exception exception) {
			// TODO: handle exception
		}
		WebElement e6 = ca.activeElement();
		ca.eleToBeClickable();
		e6.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e6, s[1]);
		//Commonactions.isElementPresent(sp.getReviewsExtraColumn());
		e6.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(sp.getApproveicon1());

		ca.click(sp.getApproveicon1());
		Commonactions.isElementPresent(sp.getApprove1());
		//ca.mouseOver(sp.getApprove1());
		Commonactions.clickjs(sp.getApprove1());
		Commonactions.isElementPresent(sp.getCopy1());

		ca.click(sp.getCopy1());

		try{
			Commonactions.isElementPresent(sp.getReviewsExtraColumn());
			ca.click(sp.getReviewsExtraColumn());

		}catch(Exception w){
			WebElement activeElement = ca.activeElement();
			activeElement.sendKeys(Keys.TAB);
		}
		Commonactions.isElementPresent(sp.getCopy2());
		ca.click(sp.getCopy2());
		try{
			Commonactions.isElementPresent(sp.getReviewsExtraColumn());
			ca.click(sp.getReviewsExtraColumn());

		}catch(Exception w1){
			WebElement activeElement1 = ca.activeElement();
			activeElement1.sendKeys(Keys.TAB);
		}
		Commonactions.isElementPresent(sp.getReviewDelete());
		ca.jsScrollPageDown(sp.getReviewDelete());
		Commonactions.isElementPresent(sp.getReviewDelete());
		Commonactions.clickjs(sp.getReviewDelete());
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());
		Commonactions.isElementPresent(sp.getApproveicon2());

		ca.click(sp.getApproveicon2());
		try{
			Commonactions.isElementPresent(sp.getApprove3());
			//ca.mouseOver(sp.getApprove2());
			Commonactions.clickjs(sp.getApprove3());
		}catch (Exception e) {
			// TODO: handle exception
			//Commonactions.isElementPresent(sp.getApprove2());
			//ca.mouseOver(sp.getApprove2());
			Commonactions.clickjs(sp.getApprove2());
		}
		Commonactions.isElementPresent(sp.getApproveicon3());
		ca.click(sp.getApproveicon3());
		Commonactions.isElementPresent(sp.getApprove3());
		//ca.mouseOver(sp.getApprove3());
		Commonactions.clickjs(sp.getApprove3());
		Commonactions.isElementPresent(sp.getApproveicon2());
		ca.click(sp.getApproveicon2());
		Commonactions.isElementPresent(sp.getQuestionDetail1());
		//ca.mouseOver(sp.getQuestionDetail1());
		Commonactions.clickjs(sp.getQuestionDetail1());
		ca.eleToBeClickable();

		try{
			Commonactions.isElementPresent(sp.getNewSubQuestionBtn());
			ca.click(sp.getNewSubQuestionBtn());
			//Assert.assertTrue(sp.getNewSubQuestionBtn().isDisplayed());
		}catch (Exception exp) {

			System.out.println("sub question button is not available , so expectation met");
			Commonactions.isElementPresent(sp.getClose());
			ca.jsScrollPageDown(sp.getClose());
			Commonactions.isElementPresent(sp.getClose());
			ca.click(sp.getClose());

		}

		Commonactions.isElementPresent(sp.getApproveicon3());
		ca.click(sp.getApproveicon3());
		Commonactions.isElementPresent(sp.getRevise());
		//ca.mouseOver(sp.getRevise());
		Commonactions.clickjs(sp.getRevise());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[contains(@class,'Question')]//span[text()='+']/parent::div")));
		Commonactions.isElementPresent(sp.getApproveicon3());
		ca.click(sp.getApproveicon3());
		Commonactions.isElementPresent(sp.getQuestionDetail2());
		//ca.mouseOver(sp.getQuestionDetail2());
		Commonactions.clickjs(sp.getQuestionDetail2());
		Commonactions.isElementPresent(sp.getNewSubQuestionBtn());
		ca.click(sp.getNewSubQuestionBtn());
		Commonactions.isElementPresent(sp.getSubSectionValue());
		ca.insertText(sp.getSubSectionValue(), "Question details for machine?");
		Commonactions.isElementPresent(sp.getApplicableforreason());
		ca.insertText(sp.getApplicableforreason(), "Yes");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(sp.getClose());
		ca.jsScrollPageDown(sp.getClose());
		Commonactions.isElementPresent(sp.getClose());
		ca.click(sp.getClose());
		Commonactions.isElementPresent(sp.getApproveicon3());
		ca.click(sp.getApproveicon3());
		Commonactions.isElementPresent(sp.getApprove3());
		//ca.mouseOver(sp.getApprove3());
		Commonactions.clickjs(sp.getApprove3());
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Questions");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getQuestions());

		ca.click(sp.getQuestions());
		ca.eleToBeClickable();
		//org.junit.Assert.assertEquals("Displaying 3 results", sp.getDisplayResult().getText());
		ca.eleToBeClickable();

		System.out.println("Questions created successfully");


	}

	@Then("User validates review templates {string}")
	public void user_validates_review_templates(String string) throws Throwable {

		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Review Templates");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getReviewTemplate());
		ca.click(sp.getReviewTemplate());
		Commonactions.isElementPresent(sp.getNewSourcingBtn());
		ca.click(sp.getNewSourcingBtn());
		ca.eleToBeClickable();
		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e, string);
		ca.eleToBeClickable();
		e.sendKeys(Keys.TAB);
		//ca.click(sp.getQuestions()); 
		ca.click(sp.getQuestions());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getReviewTemplate());
		ca.click(sp.getReviewTemplate());
		Commonactions.isElementPresent(sp.getReviewtemp());
		ca.click(sp.getReviewtemp());
		Commonactions.isElementPresent(sp.getSelectdropdown());
		ca.click(sp.getSelectdropdown());
		Commonactions.isElementPresent(sp.getSelectQuestions());
		ca.click(sp.getSelectQuestions());
		Commonactions.isElementPresent(sp.getChkbox());
		ca.click(sp.getChkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());

		Commonactions.isElementPresent(hp.getUser_settingsBtn1());
		ca.click(hp.getUser_settingsBtn1()); 

		System.out.println("Setup tab clicked successfully");

		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());
		//  ca.eleToBeClickable();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Review Templates");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getReviewTemplate());
		ca.click(sp.getReviewTemplate());
		Commonactions.isElementPresent(sp.getApproveActionsRT());
		ca.click(sp.getApproveActionsRT());
		//Commonactions.isElementPresent(sp.getApprove());
		//ca.click(sp.getApprove());

		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn()); 

		System.out.println("Home tab clicked successfully");
		ca.eleToBeClickable();

		System.out.println("Sourcing Review Template created successfully");

	}

	@Then("User creates factory {string},{string},{string},{string},{string}")
	public void user_creates_factory(String string, String string2, String string3, String string4, String string5) throws Throwable {

		try{

			Commonactions.isElementPresent(hp.getSourcingBtn());
			ca.click(hp.getSourcingBtn());
			ca.eleToBeClickable();


		}catch (Exception excep) {
			// TODO: handle exception
		}

		Commonactions.isElementPresent(sp.getFactory());
		ca.click(sp.getFactory());
		Commonactions.isElementPresent(sp.getNewFactoryBtn());
		ca.click(sp.getNewFactoryBtn());
		ca.eleToBeClickable();
		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e, string);
		ca.eleToBeClickable();
		e.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(sp.getPending());
		ca.click(sp.getPending());
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e1, "APPROVED");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		a2.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		// ca.click(driver.findElement(By.xpath("//td[@data-csi-heading='Suppliers::0']")));
		WebElement e6 = ca.activeElement();
		ca.eleToBeClickable();
		e6.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e6, "Supplier");
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']")));
		ca.eleToBeClickable();


		Commonactions.isElementPresent(sp.getPlusIcon_1());

		for (int i = 0; i <= 200; i++) {

			ca.click(sp.getPlusIcon_1());
			if(driver.findElement(By.xpath("//td[@data-csi-act='LeadTime::0']")).isDisplayed()){
				ca.click(sp.getPlusIcon_1());
				ca.click(sp.getPlusIcon_1());
				Commonactions.isElementPresent(sp.getCommision());
				ca.click(sp.getCommision());
				ca.eleToBeClickable();
				WebElement e2 = ca.activeElement();
				ca.eleToBeClickable();
				e2.sendKeys(Keys.DELETE);
				ca.eleToBeClickable();
				ca.insertText(e2, string3);
				Commonactions.isElementPresent(sp.getPlusIcon_1());
				ca.click(sp.getPlusIcon_1());

				ca.eleToBeClickable();
				ca.click(sp.getMinorderamt());
				ca.eleToBeClickable();
				WebElement e3 = ca.activeElement();
				ca.eleToBeClickable();
				e3.sendKeys(Keys.DELETE);
				ca.eleToBeClickable();
				ca.insertText(e3, string4);
				Commonactions.isElementPresent(sp.getPlusIcon_1());
				ca.click(sp.getPlusIcon_1());
				Commonactions.isElementPresent(sp.getMinordersurchage());
				ca.click(sp.getMinordersurchage());
				ca.eleToBeClickable();
				WebElement e4 = ca.activeElement();
				ca.eleToBeClickable();
				e4.sendKeys(Keys.DELETE);
				ca.eleToBeClickable();
				ca.insertText(e4, string5);
				Commonactions.isElementPresent(sp.getPlusIcon_1());
				ca.click(sp.getPlusIcon_1());
				Commonactions.isElementPresent(sp.getVolCapacity());
				ca.click(sp.getVolCapacity());
				ca.eleToBeClickable();
				WebElement e5 = ca.activeElement();
				ca.eleToBeClickable();
				e5.sendKeys(Keys.DELETE);
				ca.eleToBeClickable();
				ca.insertText(e5, string3);
				Commonactions.isElementPresent(sp.getPlusIcon_1());
				ca.click(sp.getPlusIcon_1());
				break;
			}


		}

		for (int i = 0; i <= 100; i++) {

			ca.click(sp.getPlusIcon_1());
			if(driver.findElement(By.xpath("//td[@data-csi-act='PortOfOrigin::0']")).isDisplayed()){
				ca.click(sp.getPlusIcon_1());
				ca.click(sp.getPlusIcon_1());
				Commonactions.isElementPresent(sp.getMOQInitial());
				ca.click(sp.getMOQInitial());
				ca.eleToBeClickable();
				WebElement e9 = ca.activeElement();
				ca.eleToBeClickable();
				e9.sendKeys(Keys.DELETE);
				ca.eleToBeClickable();
				ca.insertText(e9, string4);
				Commonactions.isElementPresent(sp.getPlusIcon_1());
				ca.click(sp.getPlusIcon_1());
				ca.eleToBeClickable();
				Commonactions.isElementPresent(sp.getMOQReorder());
				ca.click(sp.getMOQReorder());
				ca.eleToBeClickable();
				WebElement e7 = ca.activeElement();
				ca.eleToBeClickable();
				e7.sendKeys(Keys.DELETE);
				ca.eleToBeClickable();
				ca.insertText(e7, string4);
				Commonactions.isElementPresent(sp.getPlusIcon_1());
				ca.click(sp.getPlusIcon_1());
				break;
			}
		} 

		Commonactions.isElementPresent(sp.getNewFactoryBtn());
		ca.click(sp.getNewFactoryBtn());
		ca.eleToBeClickable();
		WebElement e8 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e8, string2);
		Commonactions.isElementPresent(sp.getMinusIcon());
		ca.click(sp.getMinusIcon());

		for (int i = 0; i <= 100; i++) {

			ca.click(sp.getMinusIcon());
			if(driver.findElement(By.xpath("//td[@data-csi-act='SupplierNumber::0']")).isDisplayed()){
				ca.click(sp.getMinusIcon());
				ca.click(sp.getMinusIcon());
				Commonactions.isElementPresent(sp.getPending());
				ca.click(sp.getPending());
				ca.eleToBeClickable();
				WebElement e9 = ca.activeElement();
				ca.eleToBeClickable();
				e9.sendKeys(Keys.DELETE);
				ca.eleToBeClickable();
				ca.insertText(e9, "APPROVED");
				ca.eleToBeClickable();
				ca.jsMouseOver();
				ca.eleToBeClickable();
				WebElement a = ca.activeElement();
				ca.eleToBeClickable();
				a.sendKeys(Keys.TAB);
				//ca.click(driver.findElement(By.xpath("//td[@data-csi-heading='Suppliers::0']")));
				ca.eleToBeClickable();
				WebElement e7 = ca.activeElement();
				ca.eleToBeClickable();
				e7.sendKeys(Keys.DELETE);
				ca.eleToBeClickable();
				ca.insertText(e7, "Supplier");
				ca.eleToBeClickable();
				ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']")));
				ca.eleToBeClickable();
				ca.click(sp.getPlusIcon_1());
				break;
			}
		}


		ca.click(sp.getChennai());
		try{
			Commonactions.isElementPresent(sp.getNewContactBtn());
			ca.click(sp.getNewContactBtn());
			//Assert.assertTrue(sp.getNewContactBtn().isDisplayed());

		}catch (Exception ecxp) {

			System.out.println("Contact button is not displayed as expected");


		}

		ca.eleToBeClickable();
		ca.click(hp.getUser_homeBtn()); 

		System.out.println("Home tab clicked successfully");
		ca.eleToBeClickable();

		System.out.println("Factory created successfully");
		ca.eleToBeClickable();

	}

	@Then("User validates factory reviews {string}")
	public void user_validates_factory_reviews(String string) throws Throwable {

		try{

			Commonactions.isElementPresent(hp.getSourcingBtn());
			ca.click(hp.getSourcingBtn());
			ca.eleToBeClickable();


		}catch (Exception excep) {
			// TODO: handle exception
		}

		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getReviews());
		ca.click(sp.getReviews());
		Commonactions.isElementPresent(sp.getFactoryReviews());
		ca.click(sp.getFactoryReviews());
		Commonactions.isElementPresent(sp.getFactoryReviewBtn());
		ca.click(sp.getFactoryReviewBtn());
		Commonactions.isElementPresent(sp.getFactoryvalue());
		ca.insertText(sp.getFactoryvalue(), string);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sp.getFactoryreviewDesc());
		ca.insertText(sp.getFactoryreviewDesc(), "Factory Review - Automation");
		Commonactions.isElementPresent(sp.getSaveandgo());
		ca.click(sp.getSaveandgo());
		Commonactions.isElementPresent(sp.getSubmit());
		ca.click(sp.getSubmit());
		Commonactions.isElementPresent(pp.getOK_Btn());
		ca.click(pp.getOK_Btn());

		ca.eleToBeClickable();
		ca.jsScrollPageDown(driver.findElement(By.xpath("(//td[contains(@data-csi-act,'Response')])[1]")));
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-act,'Response')])[1]")));
		ca.eleToBeClickable();
		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e, "Yes");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.jsScrollPageDown(driver.findElement(By.xpath("(//td[contains(@data-csi-act,'Response')])[2]")));
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-act,'Response')])[2]")));
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e1, "Yes");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.jsScrollPageDown(driver.findElement(By.xpath("(//td[contains(@data-csi-act,'Response')])[3]")));
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-act,'Response')])[3]")));
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e2, "No");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		String percent = driver.findElement(By.xpath("(//td[@data-csi-heading='NotApplicable::2']//following-sibling::td[contains(@data-csi-heading,'PointsScored')])[3]")).getText();
		ca.eleToBeClickable();
		Assert.assertEquals("0.00", percent);
		Commonactions.isElementPresent(sp.getSubmit());
		ca.jsScrollPageUp(sp.getSubmit());
		ca.eleToBeClickable();
		ca.click(sp.getSubmit());
		ca.eleToBeClickable();
		Thread.sleep(50000);
		Commonactions.isElementPresent(sp.getConclusion());
		try{
			ca.click(sp.getConclusion());
			//Commonactions.isElementPresent(sp.getApproveActions());
			ca.click(sp.getApproveActions());
		}catch (Exception except) {
			// TODO: handle exception
		}
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn()); 

		System.out.println("Home tab clicked successfully");
		ca.eleToBeClickable();

		System.out.println("Factory reviews created successfully");



	}

	@Then("User validates supplier reviews")
	public void user_validates_supplier_reviews() throws Throwable {

		try{

			Commonactions.isElementPresent(hp.getSourcingBtn());
			ca.click(hp.getSourcingBtn());
			Commonactions.isElementPresent(sp.getCustomer());


		}catch (Exception excep) {
			// TODO: handle exception
		}

		Commonactions.isElementPresent(sp.getReviews());
		ca.click(sp.getReviews());
		Commonactions.isElementPresent(sp.getSupplierReview());
		ca.click(sp.getSupplierReview());
		Commonactions.isElementPresent(sp.getNewSupplierReview());
		ca.click(sp.getNewSupplierReview());
		Commonactions.isElementPresent(sp.getSupplierValue1());
		ca.insertText(sp.getSupplierValue1(), "Supplier");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sp.getSupplierviewdesc());
		ca.insertText(sp.getSupplierviewdesc(), "Supplier Review - Automation");
		Commonactions.isElementPresent(sp.getSaveandgo());
		ca.click(sp.getSaveandgo());

		ca.eleToBeClickable();
		ca.jsScrollPageDown(driver.findElement(By.xpath("(//td[contains(@data-csi-act,'Response')])[1]")));
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-act,'Response')])[1]")));
		ca.eleToBeClickable();
		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e, "Yes");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.jsScrollPageDown(driver.findElement(By.xpath("(//td[contains(@data-csi-act,'Response')])[2]")));
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-act,'Response')])[2]")));
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e1, "Yes");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.jsScrollPageDown(driver.findElement(By.xpath("(//td[contains(@data-csi-act,'Response')])[3]")));
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-act,'Response')])[3]")));
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e2, "No");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		String percent = driver.findElement(By.xpath("(//td[@data-csi-heading='NotApplicable::2']//following-sibling::td[contains(@data-csi-heading,'PointsScored')])[3]")).getText();
		ca.eleToBeClickable();
		Assert.assertEquals("0.00", percent);
		Commonactions.isElementPresent(sp.getSubmit());
		ca.jsScrollPageUp(sp.getSubmit());
		Commonactions.isElementPresent(sp.getSubmit());
		ca.click(sp.getSubmit());
		ca.eleToBeClickable();
		Thread.sleep(5000);
		Commonactions.isElementPresent(sp.getConclusion());
		try{
			ca.click(sp.getConclusion());
			//	Commonactions.isElementPresent(sp.getApproveActions());
			ca.click(sp.getApproveActions());
		}catch (Exception except) {
			// TODO: handle exception
		}
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn()); 

		System.out.println("Home tab clicked successfully");
		ca.eleToBeClickable();

		System.out.println("Supplier reviews created successfully");


	}

	@When("User creates customer {string},{string},{string}")
	public void user_creates_customer(String string, String string2, String string3) throws Throwable {

		try{

			Commonactions.isElementPresent(hp.getSourcingBtn());
			ca.click(hp.getSourcingBtn());
			Commonactions.isElementPresent(sp.getCustomer());


		}catch (Exception excep) {
			// TODO: handle exception
		}

		String[] s = string.split("-");
		ca.click(sp.getCustomer());
		Commonactions.isElementPresent(sp.getNewCustBtn());
		ca.click(sp.getNewCustBtn());
		Commonactions.isElementPresent(sp.getCustomerValue());
		ca.insertText(sp.getCustomerValue(), s[0].trim());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(sp.getCountry());
		ca.click(sp.getCountry());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, s[1].trim());
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sp.getNewCustBtn());

		String[] s1 = string2.split("-");
		ca.click(sp.getNewCustBtn());
		Commonactions.isElementPresent(sp.getCustomerValue());
		ca.insertText(sp.getCustomerValue(), s1[0].trim());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(sp.getCountry());
		ca.click(sp.getCountry());
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, s1[1].trim());
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sp.getNewCustBtn());

		String[] s2 = string3.split("-");
		ca.click(sp.getNewCustBtn());
		Commonactions.isElementPresent(sp.getCustomerValue());
		ca.insertText(sp.getCustomerValue(), s2[0].trim());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(sp.getCountry());
		ca.click(sp.getCountry());
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a2, s2[1].trim());
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		System.out.println("Customer created successfully");

	}

	@When("User creates Shipment {string},{string},{string}")
	public void user_creates_Shipment(String string, String string2, String string3) throws Throwable {

		try{

			Commonactions.isElementPresent(hp.getSourcingBtn());
			ca.click(hp.getSourcingBtn());
			Commonactions.isElementPresent(sp.getShipment());


		}catch (Exception excep) {
			// TODO: handle exception
		}

		ca.click(sp.getShipment());
		Commonactions.isElementPresent(sp.getNewshipmentBtn());
		ca.click(sp.getNewshipmentBtn());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, string);
		ca.eleToBeClickable();
		a.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		a1.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(sp.getRequesDate());
		ca.click(sp.getRequesDate());
		Commonactions.isElementPresent(sp.getCurrentDate());
		ca.click(sp.getCurrentDate());
		Commonactions.isElementPresent(sp.getConfirmedDate());
		ca.click(sp.getConfirmedDate());


		Commonactions.isElementPresent(sp.getConfiDate1());
		ca.click(sp.getConfiDate1());


		Commonactions.isElementPresent(sp.getShipmentPlus());

		for (int i = 0; i <=50; i++) {

			ca.click(sp.getShipmentPlus());
			if (sp.getShipTo().isDisplayed()) {
				ca.click(sp.getExpecteDate());

				Commonactions.isElementPresent(sp.getExpecDate1());
				ca.click(sp.getExpecDate1());

				Commonactions.isElementPresent(sp.getPortofshipment());
				ca.click(sp.getPortofshipment());
				ca.eleToBeClickable();
				WebElement a2 = ca.activeElement();
				ca.eleToBeClickable();
				ca.insertText(a2, string2);
				ca.eleToBeClickable();
				ca.jsMouseOver();
				break;
			}

		}

		ca.click(sp.getShipmentPlus());
		ca.click(sp.getShipmentPlus());
		ca.click(sp.getShipmentPlus());
		//ca.eleToBeClickable();
		// ca.click(sp.getShipTo());
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a3, string3);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();


		System.out.println("Shipment created successfully");
	}


}
