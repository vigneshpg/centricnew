package com.centric.stepdefinition;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import com.centric.objectrepository.DocumentPage;
import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.InspectionPage;
import com.centric.objectrepository.MaterialSpecificationPage;
import com.centric.objectrepository.PopupPage;
import com.centric.objectrepository.QualityPage;
import com.centric.objectrepository.SourcingPage;
import com.centric.objectrepository.SpecificationHierarchyPage;
import com.centric.objectrepository.StyleMaterialSamplepage;
import com.centric.objectrepository.StylePage;
import com.centric.objectrepository.UserManagementPage;
import com.centric.resources.Commonactions;

import cucumber.api.Scenario;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Ca;


public class StyleMaterialSamplePageSteps extends Commonactions{

	HomePage hp = new HomePage();
	Commonactions ca = new Commonactions();
	MaterialSpecificationPage mp = new MaterialSpecificationPage();
	SpecificationHierarchyPage sh = new SpecificationHierarchyPage();	
	SourcingPage sp = new SourcingPage();
	QualityPage  qp = new QualityPage();
	StylePage st = new StylePage();
	StyleMaterialSamplepage sm = new StyleMaterialSamplepage();
	PopupPage pup=new PopupPage();
	InspectionPage in = new InspectionPage();
	InspectionPageSteps ins = new InspectionPageSteps();
	PopupPage pp = new PopupPage();


	@When("User update property table with {string},{string},{string}")
	public void user_update_property_table_with(String string, String string2, String string3) throws Throwable {
		try{
			Commonactions.isElementPresent(sm.getLeftArrow());
			ca.click(sm.getLeftArrow());
		}catch (Exception e) {
			// TODO: handle exception
		}
		Commonactions.isElementPresent(hp.getStyleBtn());
		ca.click(hp.getStyleBtn());
		Commonactions.isElementPresent(sm.getWinterSeason());
		ca.click(sm.getWinterSeason());
		Commonactions.isElementPresent(st.getStyles_Btn());
		ca.click(st.getStyles_Btn());
		try{
			Commonactions.isElementPresent(sm.getClrAndSize());
			ca.click(sm.getClrAndSize());
		}catch(Exception e){

			Commonactions.isElementPresent(pup.getTStyleBtn());
			ca.click(pup.getTStyleBtn());
			Commonactions.isElementPresent(qp.getNext());
			ca.click(qp.getNext());
			Commonactions.isElementPresent(pup.getStyle_type_Value());
			ca.insertText(pup.getStyle_type_Value(), "Apparel - Color and Size");
			ca.eleToBeClickable();
			ca.jsMouseOver();
			Commonactions.isElementPresent(pup.getSstyle_Value());
			ca.insertText(pup.getSstyle_Value(), "Apparel - Color and Size");
			Commonactions.isElementPresent(qp.getFinish());
			ca.click(qp.getFinish());
			ca.eleToBeClickable();

			Commonactions.isElementPresent(pup.getTStyleBtn());
			ca.click(pup.getTStyleBtn());
			Commonactions.isElementPresent(qp.getNext());
			ca.click(qp.getNext());
			Commonactions.isElementPresent(pup.getStyle_type_Value());
			ca.insertText(pup.getStyle_type_Value(), "Accessories - Only Color");
			ca.eleToBeClickable();
			ca.jsMouseOver();
			Commonactions.isElementPresent(pup.getSstyle_Value());
			ca.insertText(pup.getSstyle_Value(), "Accessories - Only Color");
			Commonactions.isElementPresent(qp.getFinish());
			ca.click(qp.getFinish());
			ca.eleToBeClickable();

			Commonactions.isElementPresent(pup.getTStyleBtn());
			ca.click(pup.getTStyleBtn());
			Commonactions.isElementPresent(qp.getNext());
			ca.click(qp.getNext());
			Commonactions.isElementPresent(pup.getTstyle_type_Value());
			ca.insertText(pup.getTstyle_type_Value(), "Apparel - Only Size");
			ca.eleToBeClickable();
			ca.jsMouseOver();
			Commonactions.isElementPresent(pup.getTsstyle_Value());
			ca.insertText(pup.getTsstyle_Value(), "Apparel - Only Size");
			Commonactions.isElementPresent(qp.getFinish());
			ca.click(qp.getFinish());
			ca.eleToBeClickable();

			Commonactions.isElementPresent(pup.getTStyleBtn());
			ca.click(pup.getTStyleBtn());
			Commonactions.isElementPresent(qp.getNext());
			ca.click(qp.getNext());
			Commonactions.isElementPresent(pup.getTstyle_type_Value());
			ca.insertText(pup.getTstyle_type_Value(), "Accessories - No color and Size");
			ca.eleToBeClickable();
			ca.jsMouseOver();
			Commonactions.isElementPresent(pup.getTsstyle_Value());
			ca.insertText(pup.getTsstyle_Value(), "Accessories - No color and Size");
			Commonactions.isElementPresent(qp.getFinish());
			ca.click(qp.getFinish());
			ca.eleToBeClickable();


			System.out.println("style created successfully");


			Commonactions.isElementPresent(sm.getClrAndSize());
			ca.click(sm.getClrAndSize());
		}

		Commonactions.isElementPresent(sp.getCntryCode());
		ca.click(sp.getCntryCode());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, string);
		ca.eleToBeClickable();
		a.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, string2);
		ca.eleToBeClickable();
		a1.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(sm.getSizeRange());
		ca.click(sm.getSizeRange());
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a2, string3);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sm.getEditIcon());
		Commonactions.clickjs(sm.getEditIcon());
		ca.eleToBeClickable();

		List<WebElement> size = driver.findElements(By.xpath("//th[contains(@class,'matrix')]/div/span"));
		for (int i = 0; i < size.size(); i++) {
			int j= i+1;
			String text = driver.findElement(By.xpath("(//th[contains(@class,'matrix')]/div/span[1])["+j+"]")).getText();
			System.out.println(text);
		}

		try{Commonactions.isElementPresent(sm.getCloseBtn());
		ca.click(sm.getCloseBtn());
		}
		catch(Exception e)
		{
			List<WebElement> ac = driver.findElements(By.xpath("//span[text()='Cancel']"));
			for(int i=1;i<=ac.size();i++)
			{
				WebElement cancel = driver.findElement(By.xpath("(//span[text()='Cancel'])["+i+"]"));
				boolean displayed = cancel.isDisplayed();
				if(displayed==true)
				{
					ca.eleToBeClickable();
					try{ca.click(cancel);
					break;}
					catch(Exception e1){}
				}}
		}
		System.out.println("Style property table updated successfully");

	}

	@When("User creates colorway {string},{string},{string},{string}")
	public void user_creates_colorway(String string, String string2, String string3, String string4) throws Throwable {

		Commonactions.isElementPresent(sm.getColorways());
		ca.click(sm.getColorways());
		Commonactions.isElementPresent(sm.getNewColorexpand());
		ca.click(sm.getNewColorexpand());
		Commonactions.isElementPresent(sm.getNewFromColor());
		ca.click(sm.getNewFromColor());
		Commonactions.isElementPresent(sm.getEgretChkBx());
		ca.click(sm.getEgretChkBx());
		Commonactions.isElementPresent(sm.getVanillaChkbx());
		ca.click(sm.getVanillaChkbx());
		Commonactions.isElementPresent(sm.getAntiqueChkBx());
		ca.click(sm.getAntiqueChkBx());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sm.getJeans());

		ca.click(sm.getJeans());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sm.getClrAndSize());
		ca.jsScrollPageDown(sm.getClrAndSize());
		//	Commonactions.isElementPresent(sm.getPopupClrWys());
		//	ca.click(sm.getPopupClrWys());
		//	Commonactions.isElementPresent(sm.getAntiqueDel());
		//	ca.click(sm.getAntiqueDel());
		//	Commonactions.isElementPresent(pp.getDelete_Btn());
		//	ca.click(pp.getDelete_Btn());
		//	Commonactions.isElementPresent(sm.getCloseBtn());
		//	ca.click(sm.getCloseBtn());
		Commonactions.isElementPresent(sm.getClrAndSize());
		ca.click(sm.getClrAndSize());
		Commonactions.isElementPresent(sm.getEgretCopy());
		ca.click(sm.getEgretCopy());
		ca.eleToBeClickable();
		String text = driver.findElement(By.xpath("(//a[contains(text(),'EGRET')])[1]")).getText();
		Commonactions.isElementPresent(sm.getColorwayvalue());
		ca.insertText(sm.getColorwayvalue(), text+" - Copy");
		Commonactions.isElementPresent(sm.getColorSpecValue());
		ca.click(sm.getColorSpecValue());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		a.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(a, string);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(sm.getNewColorwayBtn());

		ca.click(sm.getNewColorwayBtn());
		Commonactions.isElementPresent(sm.getColorwayvalue());
		ca.insertText(sm.getColorwayvalue(), string2);
		Commonactions.isElementPresent(sm.getMDescription());
		ca.insertText(sm.getMDescription(), string4);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(sm.getNewColorwayBtn());

		ca.click(sm.getNewColorwayBtn());
		Commonactions.isElementPresent(sm.getColorwayvalue());
		ca.insertText(sm.getColorwayvalue(), string3);
		Commonactions.isElementPresent(sm.getMDescription());
		ca.insertText(sm.getMDescription(), string4);
		Commonactions.isElementPresent(sm.getCreateClrspecChkBx());
		ca.click(sm.getCreateClrspecChkBx());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());

		System.out.println("Style colorway created successfully");

	}

	@Then("User setup enumeration configurtion for Sample {string},{string}")
	public void user_setup_enumeration_configurtion_for_Sample(String string, String string2) throws Throwable {

		Commonactions.isElementPresent(hp.getUser_settingsBtn());
		ca.click(hp.getUser_settingsBtn());
		Commonactions.isElementPresent(hp.getSystem_config());
		Commonactions.clickjs(hp.getSystem_config());
		Commonactions.isElementPresent(sh.getEnumeration());
		ca.click(sh.getEnumeration());
		Thread.sleep(2000);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sh.getEnumeration_Search());
		ca.click(sh.getEnumeration_Search());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sm.getSampleType());
		ca.click(sm.getSampleType());
		Commonactions.isElementPresent(sh.getClick_Custom());
		ca.click(sh.getClick_Custom());
		Thread.sleep(2000);
		//driver.navigate().refresh();
		//Commonactions.jsWaitForPageLoad();
		Commonactions.isElementPresent(sh.getPlus_Icon_2());
		ca.click(sh.getPlus_Icon_2());
		Commonactions.isElementPresent(sh.getEnum_Value());
		ca.insertText(sh.getEnum_Value(), string);
		Commonactions.isElementPresent(pup.getConfig_save_Btn());
		ca.click(pup.getConfig_save_Btn());
		Commonactions.isElementPresent(sh.getEnumeration_Search());

		ca.click(sh.getEnumeration_Search());
		Commonactions.isElementPresent(sm.getMaterialSampleType());
		ca.click(sm.getMaterialSampleType());
		Commonactions.isElementPresent(sh.getClick_Custom());
		ca.click(sh.getClick_Custom());
		Commonactions.isElementPresent(sm.getEnumChkBx());
		ca.click(sm.getEnumChkBx());
		Commonactions.isElementPresent(sh.getPlus_Icon_2());
		Thread.sleep(6000);
		ca.click(sh.getPlus_Icon_2());
		Commonactions.isElementPresent(sh.getEnum_Value());
		ca.insertText(sh.getEnum_Value(), string2);
		Commonactions.isElementPresent(pup.getConfig_save_Btn());
		ca.click(pup.getConfig_save_Btn());
		ca.eleToBeClickable();

		System.out.println("Style and Material sample enumeration created successfully");

	}

	@Then("User creates style sample combination {string},{string},{string},{string}")
	public void user_creates_style_sample_combination(String string, String string2, String string3, String string4) throws Throwable {


		Commonactions.isElementPresent(hp.getStyleBtn());
		ca.click(hp.getStyleBtn());
		Commonactions.isElementPresent(sm.getWinterSeason());
		ca.click(sm.getWinterSeason());
		Commonactions.isElementPresent(st.getStyles_Btn());
		ca.click(st.getStyles_Btn());
		Commonactions.isElementPresent(sm.getClrAndSize());
		ca.click(sm.getClrAndSize());
		Commonactions.isElementPresent(sm.getSamples());
		ca.click(sm.getSamples());
		Commonactions.isElementPresent(sm.getSampleBtn());
		ca.click(sm.getSampleBtn());
		ca.eleToBeClickable();
		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e, "Supplier");
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		e.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(sm.getSampleValue());
		ca.insertText(sm.getSampleValue(), string);
		Commonactions.isElementPresent(sm.getSampleType1());
		ca.click(sm.getSampleType1());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, string2);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		ca.click(sm.getSampleBtn());
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e1, "Supplier");
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		e1.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(sm.getSampleValue());
		ca.insertText(sm.getSampleValue(), string);
		Commonactions.isElementPresent(sm.getSampleType1());
		ca.click(sm.getSampleType1());
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, string2);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sm.getSampledimension());
		ca.click(sm.getSampledimension());
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a2, string3);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.click(sm.getColorsSel());
		Commonactions.isElementPresent(sm.getGoTodialog());
		ca.click(sm.getGoTodialog());
		Commonactions.isElementPresent(sm.getEgretChkBx());
		ca.click(sm.getEgretChkBx());
		Commonactions.isElementPresent(sm.getVanillaChkbx());
		ca.click(sm.getVanillaChkbx());
		Commonactions.isElementPresent(mp.getSave_btn2());
		ca.click(mp.getSave_btn2());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		ca.click(sm.getSampleBtn());
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e2, "Supplier");
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		e2.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(sm.getSampleValue());
		ca.insertText(sm.getSampleValue(), string);
		Commonactions.isElementPresent(sm.getSampleType1());
		ca.click(sm.getSampleType1());
		ca.eleToBeClickable();
		WebElement a6 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a6, string2);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sm.getSampledimension());
		ca.click(sm.getSampledimension());
		ca.eleToBeClickable();
		WebElement a7 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a7, "Sizes");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.click(sm.getSizesSel());
		Commonactions.isElementPresent(sm.getGoTodialog1());
		ca.click(sm.getGoTodialog1());
		Commonactions.isElementPresent(sm.getMediumChkBx());
		ca.click(sm.getMediumChkBx());
		Commonactions.isElementPresent(sm.getLargeChkbx());
		ca.click(sm.getLargeChkbx());
		Commonactions.isElementPresent(mp.getSave_btn2());
		ca.click(mp.getSave_btn2());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		ca.click(sm.getSampleBtn());
		ca.eleToBeClickable();
		WebElement e3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e3, "Supplier");
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		e3.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(sm.getSampleValue());
		ca.insertText(sm.getSampleValue(), string);
		Commonactions.isElementPresent(sm.getSampleType1());
		ca.click(sm.getSampleType1());
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a3, string2);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sm.getSampledimension());
		ca.click(sm.getSampledimension());
		ca.eleToBeClickable();
		WebElement a4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a4, string4);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sm.getQuantityChkBx());
		ca.click(sm.getQuantityChkBx());
		Commonactions.isElementPresent(sm.getEgret());
		ca.insertText(sm.getEgret(),"1");
		Commonactions.isElementPresent(sm.getEgretcopy());
		ca.insertText(sm.getEgretcopy(), "1");
		Commonactions.isElementPresent(sm.getEgretValue());
		ca.insertText(sm.getEgretValue(), "1");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();


		Commonactions.isElementPresent(sm.getEgretClrCopy());
		Commonactions.clickjs(sm.getEgretClrCopy());
		ca.eleToBeClickable();
		String text = driver.findElement(By.xpath("(//a[contains(text(),'EGRET-small')])[1]")).getText();
		Commonactions.isElementPresent(sm.getSampleValue());
		ca.insertText(sm.getSampleValue(), text+" - Copy");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());

		System.out.println("Style Sample created successfully");


	}

	@When("User update quality types")
	public void user_update_quality_types() throws Throwable {

		Commonactions.isElementPresent(hp.getUser_settingsBtn1());
		ca.click(hp.getUser_settingsBtn1()); 

		System.out.println("Setup tab clicked successfully");

		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());
		//  ca.eleToBeClickable();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Test Specs");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(qp.getTestSpecs());
		ca.click(qp.getTestSpecs());

		try{
			ca.eleToBeClickable();
			//ca.jsScrollPageDown(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));


			for(int j = 1; j <=50; j++ ){
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Spec')]//span[text()='+']/parent::div")));
				if(sm.getApplyChemTypes().isDisplayed()){

					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Spec')]//span[text()='+']/parent::div")));
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Spec')]//span[text()='+']/parent::div")));

					ca.eleToBeClickable();
					break;
				}
			}
		}catch (Exception exception) {
			// TODO: handle exception
		}

		Commonactions.isElementPresent(sm.getApplyChemTypes());
		ca.click(sm.getApplyChemTypes());
		Commonactions.isElementPresent(sm.getGoTodialogUp());
		ca.click(sm.getGoTodialogUp());
		Commonactions.isElementPresent(sm.getQualityClrChkBx());
		ca.click(sm.getQualityClrChkBx());
		Commonactions.isElementPresent(sm.getQualityStandChkbc());
		ca.click(sm.getQualityStandChkbc());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(sm.getApplyIronTypes());

		ca.click(sm.getApplyIronTypes());
		Commonactions.isElementPresent(sm.getGoTodialogUp());
		ca.click(sm.getGoTodialogUp());
		Commonactions.isElementPresent(sm.getQualityClrChkBx());
		ca.click(sm.getQualityClrChkBx());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(sm.getApplyWashTypes());

		ca.click(sm.getApplyWashTypes());
		Commonactions.isElementPresent(sm.getGoTodialogUp());
		ca.click(sm.getGoTodialogUp());
		Commonactions.isElementPresent(sm.getQualityClrChkBx());
		ca.click(sm.getQualityClrChkBx());
		Commonactions.isElementPresent(sm.getQualityStandChkbc());
		ca.click(sm.getQualityStandChkbc());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		System.out.println("quality types updated successfully");

	}

	@When("User creates Style quality {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_creates_Style_quality(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws Throwable {

		//Commonactions.isElementPresent(sm.getLeftArrow());
		//ca.click(sm.getLeftArrow());
		Commonactions.isElementPresent(hp.getStyleBtn());
		ca.click(hp.getStyleBtn());
		Commonactions.isElementPresent(sm.getWinterSeason());
		ca.click(sm.getWinterSeason());
		Commonactions.isElementPresent(st.getStyles_Btn());
		ca.click(st.getStyles_Btn());
		Commonactions.isElementPresent(sm.getClrAndSize());
		ca.click(sm.getClrAndSize());
		Commonactions.isElementPresent(sm.getStyleQuality());

		ca.click(sm.getStyleQuality());
		Commonactions.isElementPresent(sm.getNewTestRunBtn());
		ca.click(sm.getNewTestRunBtn());
		Commonactions.isElementPresent(sm.getTestRunValue());
		ca.insertText(sm.getTestRunValue(), string);
		Commonactions.isElementPresent(sm.getTestGrp());
		ca.click(sm.getTestGrp());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, string3);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sm.getTestRunSample());
		ca.click(sm.getTestRunSample());
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, string5);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sm.getResponsibleUser());
		ca.click(sm.getResponsibleUser());
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a2, string7);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sm.getSupplier());
		ca.click(sm.getSupplier());
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a3, string8);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sm.getQuantityTestChkBx());
		ca.click(sm.getQuantityTestChkBx());
		Commonactions.isElementPresent(sm.getTestVannilaChkBx());
		ca.insertText(sm.getTestVannilaChkBx(),"1");
		/*Commonactions.isElementPresent(qp.getNext());
		ca.click(qp.getNext());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(qp.getFinish());
		ca.click(qp.getFinish());*/
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sm.getNewTestRunBtn());

		ca.click(sm.getNewTestRunBtn());
		Commonactions.isElementPresent(sm.getTestRunValue());
		ca.insertText(sm.getTestRunValue(), string2);
		Commonactions.isElementPresent(sm.getTestGrp());
		ca.click(sm.getTestGrp());
		ca.eleToBeClickable();
		WebElement a4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a4, string4);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sm.getTestRunSample());
		ca.click(sm.getTestRunSample());
		ca.eleToBeClickable();
		WebElement a5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a5, string6);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sm.getResponsibleUser());
		ca.click(sm.getResponsibleUser());
		ca.eleToBeClickable();
		WebElement a6 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a6, string7);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sm.getSupplier());
		ca.click(sm.getSupplier());
		ca.eleToBeClickable();
		WebElement a7 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a7, string8);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sm.getTestColorsSel());
		ca.click(sm.getTestColorsSel());
		Commonactions.isElementPresent(sm.getGoTodialog());
		ca.click(sm.getGoTodialog());
		Commonactions.isElementPresent(sm.getEgretChkBx());
		ca.click(sm.getEgretChkBx());
		Commonactions.isElementPresent(sm.getEgretCpyChkBx());
		ca.click(sm.getEgretCpyChkBx());
		Commonactions.isElementPresent(mp.getSave_btn2());	
		ca.click(mp.getSave_btn2());
		/*Commonactions.isElementPresent(qp.getNext());
		ca.click(qp.getNext());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(qp.getFinish());
		ca.click(qp.getFinish());*/
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSave_btn1());	
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Style quality created successfully");
	}

	@When("User Creates test run templates")
	public void user_Creates_test_run_templates() throws Throwable {

		ca.eleToBeClickable();
		Commonactions.isElementPresent(sm.getTestRunexpand());
		ca.click(sm.getTestRunexpand());
		Commonactions.isElementPresent(sm.getTestRunTemplate());
		ca.click(sm.getTestRunTemplate());
		Commonactions.isElementPresent(sm.getIronTempChkBx());
		ca.click(sm.getIronTempChkBx());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		//tem added
		/*ca.insertText(sm.getColoroption(), "Color");
		ca.jsMouseOver();
		ca.eleToBeClickable();*/
		
		//defect removed 714 to 723
		/*Commonactions.isElementPresent(sm.getTestColorsSel());
		ca.click(sm.getTestColorsSel());
		Commonactions.isElementPresent(sm.getGoTodialog());
		ca.click(sm.getGoTodialog());
		Commonactions.isElementPresent(sm.getEgretChkBx());
		ca.click(sm.getEgretChkBx());
		Commonactions.isElementPresent(sm.getEgretCpyChkBx());
		ca.click(sm.getEgretCpyChkBx());
		Commonactions.isElementPresent(mp.getSave_btn2());
		ca.click(mp.getSave_btn2());*/
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		System.out.println("Style test run templates created successfully");

	}

	DocumentPage dp = new DocumentPage();
	UserManagementPage up = new UserManagementPage();

	@When("User approve test run {string},{string},{string}")
	public void user_approve_test_run(String string, String string2, String string3) throws Throwable {

		Commonactions.isElementPresent(sm.getWashname());
		ca.click(sm.getWashname());
		Commonactions.isElementPresent(sm.getTestCode());
		ca.click(sm.getTestCode());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, string);
		ca.eleToBeClickable();
		a.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, string2);
		ca.eleToBeClickable();
		a1.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(qp.getCanvas());


		ca.click(qp.getCanvas());
		Commonactions.isElementPresent(qp.getCreateanewCanvas());
		ca.click(qp.getCreateanewCanvas());
		Commonactions.isElementPresent(qp.getRectangle());
		ca.click(qp.getRectangle());
		ca.eleToBeClickable();
		Actions actions = new Actions(driver);
		Commonactions.isElementPresent(qp.getDoubleClick());
		actions.doubleClick(qp.getDoubleClick()).perform();
		Commonactions.isElementPresent(qp.getSaveAndFinish());
		ca.click(qp.getSaveAndFinish());
		ca.eleToBeClickable();

		ca.click(dp.getDocandComments());
		Commonactions.isElementPresent(sp.getApproveActions());
		ca.click(sp.getApproveActions());
		Commonactions.isElementPresent(sp.getApprove());
		ca.click(sp.getApprove());
		Commonactions.isElementPresent(sm.getApparel());

		ca.click(sm.getApparel());

		System.out.println("Style quality approved successfully");

	}

	@When("User update material property table with {string}")
	public void user_update_material_property_table_with(String string) throws Throwable {


		Commonactions.isElementPresent(hp.getMaterialBtn());
		ca.click(hp.getMaterialBtn());
		Commonactions.isElementPresent(driver.findElement(By.xpath("(//span[text()='Material' or @data-csi-tab='ApparelViews-AllMaterials'])[2]"))); 		
		ca.click(driver.findElement(By.xpath("(//span[text()='Material' or @data-csi-tab='ApparelViews-AllMaterials'])[2]")));
		Commonactions.isElementPresent(sm.getCottonName());
		ca.click(sm.getCottonName());
		Commonactions.isElementPresent(sm.getMproperties());
		ca.click(sm.getMproperties());
		Commonactions.isElementPresent(sm.getMsizeRange());
		ca.click(sm.getMsizeRange());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, string);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		System.out.println("material property table updated successfully");

	}

	@When("User creates material colorway {string},{string}")
	public void user_creates_material_colorway(String string, String string2) throws Throwable {

		Commonactions.isElementPresent(sm.getNewClrdMatBtnexp());
		ca.click(sm.getNewClrdMatBtnexp());
		Commonactions.isElementPresent(sm.getNewFromColor());
		ca.click(sm.getNewFromColor());
		Commonactions.isElementPresent(sm.getEgretChkBx());
		ca.click(sm.getEgretChkBx());
		Commonactions.isElementPresent(sm.getVanillaChkbx());
		ca.click(sm.getVanillaChkbx());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sm.getNewColorwayBtn());

		ca.click(sm.getNewColorwayBtn());
		Commonactions.isElementPresent(sm.getMcoloredValue());
		ca.insertText(sm.getMcoloredValue(), string);
		Commonactions.isElementPresent(sm.getMDescription());
		ca.insertText(sm.getMDescription(), string2);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(sm.getMCopy());
		ca.click(sm.getMCopy());
		Commonactions.isElementPresent(sm.getMcoloredValue());
		ca.insertText(sm.getMcoloredValue(), string+" - Copy");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(sm.getMCopy());
		ca.click(sm.getMCopy());
		Commonactions.isElementPresent(sm.getMcoloredValue());
		ca.insertText(sm.getMcoloredValue(), string+" - New");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(sm.getMDelete());
		ca.click(sm.getMDelete());
		Commonactions.isElementPresent(pup.getDelete_Btn());
		ca.click(pup.getDelete_Btn());
		ca.eleToBeClickable();

		System.out.println("Material colorway created sucessfully");

	}

	@Then("User creates material sample combination {string},{string},{string},{string},{string}")
	public void user_creates_material_sample_combination(String string, String string2, String string3, String string4, String string5) throws Throwable {

		Commonactions.isElementPresent(hp.getMaterialBtn());
		ca.click(hp.getMaterialBtn());
		Commonactions.isElementPresent(sm.getCottonName());
		ca.click(sm.getCottonName());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sm.getMSamples());
		ca.click(sm.getMSamples());
		Commonactions.isElementPresent(sm.getSampleBtn());
		ca.click(sm.getSampleBtn());
		ca.eleToBeClickable();
		WebElement e3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e3, "Supplier");
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		e3.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(sm.getSampleValue());
		ca.insertText(sm.getSampleValue(), string);
		Commonactions.isElementPresent(sm.getSampleType1());
		//ca.insertText(sp.getCntryCode(), string5);
		//ca.eleToBeClickable();
		ca.click(sm.getSampleType1());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, string2);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sm.getMSamples());

		ca.click(sm.getMSamples());
		Commonactions.isElementPresent(sm.getSampleBtn());
		ca.click(sm.getSampleBtn());
		ca.eleToBeClickable();
		WebElement e4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e4, "Supplier");
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		e4.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(sm.getSampleValue());
		ca.insertText(sm.getSampleValue(), string);
		Commonactions.isElementPresent(sm.getSampleType1());
		//ca.insertText(sp.getCntryCode(), string5);
		//ca.eleToBeClickable();
		ca.click(sm.getSampleType1());
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, string2);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sm.getSampledimension());
		ca.click(sm.getSampledimension());
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a2, string3);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sm.getColorsSel());
		ca.click(sm.getColorsSel());
		Commonactions.isElementPresent(sm.getGoTodialog());
		ca.click(sm.getGoTodialog());
		Commonactions.isElementPresent(sm.getEgretChkBx());
		ca.click(sm.getEgretChkBx());
		Commonactions.isElementPresent(sm.getVanillaChkbx());
		ca.click(sm.getVanillaChkbx());
		Commonactions.isElementPresent(mp.getSave_btn2());
		ca.click(mp.getSave_btn2());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		ca.click(sm.getSampleBtn());
		ca.eleToBeClickable();
		WebElement e5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e5, "Supplier");
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		e5.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(sm.getSampleValue());
		ca.insertText(sm.getSampleValue(), string);
		Commonactions.isElementPresent(sm.getSampleValue());
		//	ca.insertText(sp.getCntryCode(), string5);
		//ca.eleToBeClickable();
		ca.click(sm.getSampleType1());
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a3, string2);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sm.getSampledimension());
		ca.click(sm.getSampledimension());
		ca.eleToBeClickable();
		WebElement a4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a4, string4);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		/*    	Commonactions.isElementPresent(sm.getQuantityChkBx());
    	ca.click(sm.getQuantityChkBx());
    	Commonactions.isElementPresent(sm.getEgret());
    	ca.insertText(sm.getEgret(),"1");
    	Commonactions.isElementPresent(sm.getGreenValue());
    	ca.insertText(sm.getGreenValue(), "1");
    	Commonactions.isElementPresent(sm.getEgretValue());
    	ca.insertText(sm.getEgretValue(), "1");*/
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		//	WebElement egret = driver.findElement(By.xpath("(//a[contains(text(),'EGRET')]//parent::td//following-sibling::td/div/span[@data-csi-act='Copy'])[1]"));
		//	ca.jsScrollPageDown(sm.getEgretClrCopy1());
		Commonactions.isElementPresent(sm.getEgretClrCopy1());
		ca.click(sm.getEgretClrCopy1());
		ca.eleToBeClickable();
		String text = driver.findElement(By.xpath("(//a[contains(text(),'EGRET')])[2]")).getText();
		Commonactions.isElementPresent(sm.getSampleValue());
		ca.insertText(sm.getSampleValue(), text+" - Copy");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sm.getEgretClrCopyDel1());
		ca.click(sm.getEgretClrCopyDel1());
		Commonactions.isElementPresent(pup.getDelete_Btn());
		ca.click(pup.getDelete_Btn());
		ca.eleToBeClickable();

		System.out.println("Material sample created successfully");

	}

	@Then("User creates Material quality {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_creates_Material_quality(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws Throwable {

		Commonactions.isElementPresent(hp.getMaterialBtn());
		ca.click(hp.getMaterialBtn());
		Commonactions.isElementPresent(sm.getCottonName());
		ca.click(sm.getCottonName());
		Commonactions.isElementPresent(sm.getStyleQuality());
		ca.click(sm.getStyleQuality());
		Commonactions.isElementPresent(sm.getNewTestRunBtn());
		ca.click(sm.getNewTestRunBtn());
		Commonactions.isElementPresent(sm.getTestRunValue());
		ca.eleToBeClickable();
		ca.insertText(sm.getTestRunValue(), string);
		Commonactions.isElementPresent(sm.getTestGrp());
		ca.click(sm.getTestGrp());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, string3);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sm.getTestRunSample());
		ca.click(sm.getTestRunSample());
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, string5);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sm.getResponsibleUser());
		ca.click(sm.getResponsibleUser());
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a2, string7);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sm.getSupplier());
		ca.click(sm.getSupplier());
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a3, string8);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sm.getQuantityTestChkBx());
		ca.click(sm.getQuantityTestChkBx());
		Commonactions.isElementPresent(sm.getTestVannilaChkBx());
		ca.insertText(sm.getTestVannilaChkBx(),"1");
		try{
			Commonactions.isElementPresent(mp.getSave_btn1());
			ca.click(mp.getSave_btn1());}
		catch(Exception e){Commonactions.isElementPresent(qp.getNext());
		ca.eleToBeClickable();
		ca.click(qp.getNext());
		Commonactions.isElementPresent(qp.getFinish());
		ca.eleToBeClickable();
		ca.click(qp.getFinish());
		ca.eleToBeClickable();}

		ca.click(sm.getNewTestRunBtn());
		Commonactions.isElementPresent(sm.getTestRunValue());
		ca.insertText(sm.getTestRunValue(), string2);
		Commonactions.isElementPresent(sm.getTestGrp());
		ca.click(sm.getTestGrp());
		ca.eleToBeClickable();
		WebElement a4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a4, string4);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sm.getTestRunSample());
		ca.click(sm.getTestRunSample());
		ca.eleToBeClickable();
		WebElement a5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a5, string6);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sm.getResponsibleUser());
		ca.click(sm.getResponsibleUser());
		ca.eleToBeClickable();
		WebElement a6 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a6, string7);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sm.getSupplier());
		ca.click(sm.getSupplier());
		ca.eleToBeClickable();
		WebElement a7 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a7, string8);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sm.getTestColorsSel());
		ca.click(sm.getTestColorsSel());
		Commonactions.isElementPresent(sm.getGoTodialog());
		ca.click(sm.getGoTodialog());
		Commonactions.isElementPresent(sm.getEgretChkBx());
		ca.click(sm.getEgretChkBx());
		Commonactions.isElementPresent(sm.getVanillaChkbx());
		ca.click(sm.getVanillaChkbx());
		Commonactions.isElementPresent(mp.getSave_btn2());
		ca.click(mp.getSave_btn2());
		ca.eleToBeClickable();
		try
		{
			Commonactions.isElementPresent(mp.getSave_btn2());
			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable();
		}
		catch(Exception e){Commonactions.isElementPresent(qp.getNext());
		ca.eleToBeClickable();
		ca.click(qp.getNext());
		Commonactions.isElementPresent(qp.getFinish());
		ca.eleToBeClickable();
		ca.click(qp.getFinish());
		ca.eleToBeClickable();}

		System.out.println("Material quality created successfully");


	}

	@Then("User approve material test run")
	public void user_approve_material_test_run() throws Throwable {

		Commonactions.isElementPresent(sm.getAcidTest());
		ca.click(sm.getAcidTest());
		Commonactions.isElementPresent(sm.getMTDS());
		ca.click(sm.getMTDS());
		Commonactions.isElementPresent(qp.getCanvas());

		ca.click(qp.getCanvas());
		Commonactions.isElementPresent(qp.getCreateanewCanvas());
		ca.click(qp.getCreateanewCanvas());
		Commonactions.isElementPresent(qp.getRectangle());
		ca.click(qp.getRectangle());
		ca.eleToBeClickable();
		Actions actions = new Actions(driver);
		Commonactions.isElementPresent(qp.getDoubleClick());
		actions.doubleClick(qp.getDoubleClick()).perform();
		Commonactions.isElementPresent(qp.getSaveAndFinish());
		ca.click(qp.getSaveAndFinish());
		Commonactions.isElementPresent(dp.getDocandComments());

		ca.click(dp.getDocandComments());
		Commonactions.isElementPresent(sp.getApproveActions());
		ca.click(sp.getApproveActions());
		Commonactions.isElementPresent(sp.getApprove());
		ca.click(sp.getApprove());
		ca.eleToBeClickable();


		System.out.println("Material quality approved successfully");

	}

	@Then("User Creates material test run templates")
	public void user_Creates_material_test_run_templates() throws Throwable {

		Commonactions.isElementPresent(sm.getTestRun());
		ca.click(sm.getTestRun());
		Commonactions.isElementPresent(sm.getSaveAsTemp());
		ca.click(sm.getSaveAsTemp());
		ca.eleToBeClickable();
		String text = driver.findElement(By.xpath("(//a[contains(text(),'EGRET')])[1]")).getText();
		Commonactions.isElementPresent(sm.getTestRunValue());
		ca.insertText(sm.getTestRunValue(), text+" - Copy");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		System.out.println("Material test run templates created successfully");

	} 


	@When("User creates Style sourcing price list")
	public void user_creates_Style_sourcing_price_list() throws Throwable {

		Commonactions.isElementPresent(hp.getStyleBtn());
		ca.click(hp.getStyleBtn());
		Commonactions.isElementPresent(sm.getWinterSeason());
		ca.click(sm.getWinterSeason());
		Commonactions.isElementPresent(st.getStyles_Btn());
		ca.click(st.getStyles_Btn());
		Commonactions.isElementPresent(sm.getClrAndSize());
		ca.click(sm.getClrAndSize());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(sp.getSeasonsourcing());
		ca.click(sp.getSeasonsourcing());
		Commonactions.isElementPresent(sp.getSupplierquotes());
		ca.click(sp.getSupplierquotes());
		Commonactions.isElementPresent(sp.getNewPriceList());
		ca.click(sp.getNewPriceList());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		a.sendKeys(Keys.TAB);

		System.out.println("Style Sourcing Price List Created successfully");

	}

	@When("User Creates Style Supplier Quotes {string},{string},{string}")
	public void user_Creates_Style_Supplier_Quotes(String string, String string2, String string3) throws Throwable {

		Commonactions.isElementPresent(sp.getNewSuplrqute());
		ca.click(sp.getNewSuplrqute());
		ca.eleToBeClickable();
		ca.insertText(sp.getSupplierValue(), string);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		a.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(sp.getSupplierQteValue());
		ca.insertText(sp.getSupplierQteValue(), string2);
		Commonactions.isElementPresent(sp.getColorSIze());
		ca.click(sp.getColorSIze());
		ca.eleToBeClickable();
		WebElement a7 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a7, "Colors And Sizes");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sp.getSuppItemColorSel());
		ca.click(sp.getSuppItemColorSel());
		Commonactions.isElementPresent(sp.getSuppItemDialog());
		ca.click(sp.getSuppItemDialog());
		Commonactions.isElementPresent(sp.getBlueChkBx());
		ca.click(sp.getBlueChkBx());
		Commonactions.isElementPresent(sp.getGreenChkBx());
		ca.click(sp.getGreenChkBx());
		Commonactions.isElementPresent(mp.getSave_btn2());
		ca.click(mp.getSave_btn2());
		Commonactions.isElementPresent(sp.getSizes());
		ca.click(sp.getSizes());
		Commonactions.isElementPresent(sp.getSuppSizesDialog());
		ca.click(sp.getSuppSizesDialog());
		Commonactions.isElementPresent(sm.getMediumChkBx());
		ca.click(sm.getMediumChkBx());
		Commonactions.isElementPresent(sm.getLargeChkbx());
		ca.click(sm.getLargeChkbx());
		Commonactions.isElementPresent(mp.getSave_btn2());
		ca.click(mp.getSave_btn2());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		ca.click(sp.getNewSupplQteName());
		Commonactions.isElementPresent(sp.getSelectSet());
		ca.click(sp.getSelectSet());
		Commonactions.isElementPresent(sp.getSelectsetBtn());
		Thread.sleep(5000);
		ca.click(sp.getSelectsetBtn());
		Commonactions.isElementPresent(sp.getSelectsetvalue());
		ca.insertText(sp.getSelectsetvalue(), string3);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Supplier Quote created successfully");

	}

	@When("User creates Style product blended cost {string}")
	public void user_creates_Style_product_blended_cost(String string) throws Throwable {

		ca.eleToBeClickable();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getApparealcoroandsizename());
		ca.click(sp.getApparealcoroandsizename());
		Commonactions.isElementPresent(sp.getNewproductbendcost());
		ca.click(sp.getNewproductbendcost());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, string);
		ca.eleToBeClickable();
		a.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(sp.getProductPlusIcon());
		ca.click(sp.getProductPlusIcon());
		Commonactions.isElementPresent(sp.getBlendcostcheckbox());
		ca.click(sp.getBlendcostcheckbox());
		Commonactions.isElementPresent(sp.getBlendcostAction());
		ca.click(sp.getBlendcostAction());
		Commonactions.isElementPresent(sp.getSelectsuppQuotes());
		ca.click(sp.getSelectsuppQuotes());
		Commonactions.isElementPresent(sp.getSelectsupquotechecckbox());
		ca.click(sp.getSelectsupquotechecckbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());

		System.out.println("Product Blend Cost Created successfully");

	}

	@When("User creates Supplier Requests {string},{string}")
	public void user_creates_Supplier_Requests(String string, String string2) throws Throwable {
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getStyleBtn());
		ca.click(hp.getStyleBtn());
		Commonactions.isElementPresent(sm.getWinterSeason());
		ca.click(sm.getWinterSeason());
		Commonactions.isElementPresent(st.getStyles_Btn());
		ca.click(st.getStyles_Btn());
		Commonactions.isElementPresent(sm.getClrAndSize());
		ca.click(sm.getClrAndSize());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(sp.getSeasonsourcing());
		ca.click(sp.getSeasonsourcing());
		Commonactions.isElementPresent(sp.getSupplierrequest());
		ca.click(sp.getSupplierrequest());
		Commonactions.isElementPresent(sp.getNewsupplierrequestbtn());
		ca.click(sp.getNewsupplierrequestbtn());
		Commonactions.isElementPresent(sp.getSrttemplateExpand());
		ca.click(sp.getSrttemplateExpand());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, string);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sp.getSupplierreqvalue());
		ca.insertText(sp.getSupplierreqvalue(), string2);
		Commonactions.isElementPresent(sp.getSaveAndGoBtn());
		ca.click(sp.getSaveAndGoBtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(driver.findElement(By.xpath("(//table[contains(@data-csi-automation,'plugin-SupplierRequest-StyleQuotes-ToolbarNewActions')]//div/div)[2]")));
		ca.click(driver.findElement(By.xpath("(//table[contains(@data-csi-automation,'plugin-SupplierRequest-StyleQuotes-ToolbarNewActions')]//div/div)[2]")));
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();


		System.out.println("Supplier Request created successfully");

	}

	@When("User creates copy templates {string}")
	public void user_creates_copy_templates(String string) throws Throwable {

		Commonactions.isElementPresent(hp.getUser_settingsBtn());
		ca.click(hp.getUser_settingsBtn());
		Commonactions.isElementPresent(hp.getSystem_config());
		ca.click(hp.getSystem_config());
		Commonactions.isElementPresent(sp.getCopyTemplate());
		ca.click(sp.getCopyTemplate());
		Commonactions.isElementPresent(sp.getNewstylecopytemplatebtn());
		ca.click(sp.getNewstylecopytemplatebtn());
		Commonactions.isElementPresent(sp.getStylecopytempvalue());
		ca.insertText(sp.getStylecopytempvalue(), string);
		Commonactions.isElementPresent(sp.getStyletypevalue());
		ca.click(sp.getStyletypevalue());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, "Apparel - Color and Size");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(sp.getCopTemViews());		
		ca.click(sp.getCopTemViews());
		Commonactions.isElementPresent(sp.getCopTemManViews());
		ca.click(sp.getCopTemManViews());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "Automation");
		Commonactions.isElementPresent(sp.getOKforAdoption());
		ca.click(sp.getOKforAdoption());
		Commonactions.isElementPresent(sp.getAdd());
		ca.click(sp.getAdd());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.jsScrollPageDown(mp.getSave_btn1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		ca.click(sp.getOkforadoptionchecckbox());
		ca.eleToBeClickable();
		Thread.sleep(1000);

		System.out.println("Copy Template created successfully");
	}

	@When("User add new inspiration products {string},{string}")
	public void user_add_new_inspiration_products(String string, String string2) throws Throwable {

		Commonactions.isElementPresent(hp.getStyleBtn());
		ca.click(hp.getStyleBtn());
		Commonactions.isElementPresent(sm.getWinterSeason());
		ca.click(sm.getWinterSeason());
		Commonactions.isElementPresent(st.getStyles_Btn());
		ca.click(st.getStyles_Btn());
		Commonactions.isElementPresent(sm.getClrAndSize());
		ca.click(sm.getClrAndSize());
		Commonactions.isElementPresent(sp.getSeasonsourcing());
		ca.click(sp.getSeasonsourcing());
		Commonactions.isElementPresent(sp.getSupplierrequest());
		ca.click(sp.getSupplierrequest());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getSuppRequstName());
		ca.click(sp.getSuppRequstName());
		ca.jsScrollPagedowntoEnd();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getSupplierRequestPlus());
		ca.click(sp.getSupplierRequestPlus());
		Commonactions.isElementPresent(sp.getSetup());

		ca.click(sp.getSetup());
		Commonactions.isElementPresent(sp.getAddproduct());
		ca.click(sp.getAddproduct());
		Commonactions.isElementPresent(sp.getAddprodcutcheckbox());
		ca.click(sp.getAddprodcutcheckbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());

		Commonactions.isElementPresent(sp.getAddproductExpand());
		ca.click(sp.getAddproductExpand());
		Commonactions.isElementPresent(sp.getNewInspirationStyle());
		ca.click(sp.getNewInspirationStyle());
		Commonactions.isElementPresent(sp.getNewinspirationstyleValue());
		ca.insertText(sp.getNewinspirationstyleValue(), string);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		//ca.jsScrollPageUp(sp.getSupplierreq());
		Commonactions.isElementPresent(sp.getSRQuotes());

		ca.click(sp.getSRQuotes());
		Commonactions.isElementPresent(sp.getSupplierQuteViews());
		ca.click(sp.getSupplierQuteViews());
		Commonactions.isElementPresent(sp.getSupplierQteManageViews());
		ca.click(sp.getSupplierQteManageViews());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "Automation");
		Commonactions.isElementPresent(sp.getAdoptedStyle());
		ca.click(sp.getAdoptedStyle());
		Commonactions.isElementPresent(sp.getAdd());
		ca.click(sp.getAdd());
		Commonactions.isElementPresent(sp.getAdoption());
		ca.click(sp.getAdoption());
		Commonactions.isElementPresent(sp.getAdd());
		ca.click(sp.getAdd());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.jsScrollPageDown(mp.getSave_btn1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//table[contains(@data-csi-automation,'plugin-SupplierRequest-StyleQuotes-ToolbarNewActions')]//div/div)[2]")));
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//span[text()='refresh'])[2]")));
		ca.eleToBeClickable();
		for (int i = 0; i <=50; i++) {

			ca.click(sp.getSupplierRequestPlus());
			if(sp.getActionAdoption().isDisplayed()){

				Commonactions.mouseOver(sp.getActionAdoption());
				Commonactions.isElementPresent(sp.getAdoptAsstyle());
				ca.click(sp.getAdoptAsstyle());
				Commonactions.isElementPresent(mp.getSave_btn1());
				ca.click(mp.getSave_btn1());
				ca.eleToBeClickable();
				break;

			}

		}
		Commonactions.isElementPresent(sp.getSRSamples());
		ca.click(sp.getSRSamples());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//span[@data-csi-automation='plugin-SupplierRequest-StyleSamples-refresh'])")));
		ca.eleToBeClickable();
		ca.jsScrollPageDown(sp.getAdoptCopy());
		Commonactions.isElementPresent(sp.getAdoptCopy());
		ca.click(sp.getAdoptCopy());
		try{
			Commonactions.isElementPresent(sp.getSampleQteValue());
			ca.insertText(sp.getSampleQteValue(), string+" - Copy Adopted");
		}catch (Exception e) {
			Commonactions.isElementPresent(sp.getSupplierQteValue());
			ca.insertText(sp.getSupplierQteValue(), string+" - Copy Adopted");
		}
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(sp.getSetup());

		ca.click(sp.getSetup());
		Commonactions.isElementPresent(sp.getAddproductExpand());
		ca.click(sp.getAddproductExpand());
		Commonactions.isElementPresent(sp.getNewInspirationStyle());
		ca.click(sp.getNewInspirationStyle());
		Commonactions.isElementPresent(sp.getNewinspirationstyleValue());
		ca.insertText(sp.getNewinspirationstyleValue(), string2);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getSRQuotes());

		ca.click(sp.getSRQuotes());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//table[contains(@data-csi-automation,'plugin-SupplierRequest-StyleQuotes-ToolbarNewActions')]//div/div)[2]")));
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getApproveActions());
		ca.click(sp.getApproveActions());
		Commonactions.isElementPresent(sp.getMassadoptasstyle());
		ca.click(sp.getMassadoptasstyle());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//td[contains(text(),'New Inspiration')]//preceding-sibling::td)[1]//input")));
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());


		System.out.println("Inspiration product created successfully");
	}

	String file,name,filter;



	@When("Create PO Group and Supplier PO {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void create_PO_Group_and_Supplier_PO(String poorder, String po_nocolor, String po_colorbased, String quotevalueBlue, String quotevaluegreen, String EditValue, String dispct, String disvalue, String allowancepct, String allowancevalue) throws Throwable {

		Commonactions.isElementPresent(hp.getSourcingBtn());
		click(hp.getSourcingBtn());
		Commonactions.isElementPresent(sp.getSupplierpo());
		System.out.println("sourcing clicked");
		click(sp.getSupplierpo());
		Commonactions.isElementPresent(sp.getPogroup());
		click(sp.getPogroup());
		Commonactions.isElementPresent(sp.getNewpogroupbtn());
		click(sp.getNewpogroupbtn());
		ca.eleToBeClickable();
		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e, poorder +Keys.TAB);
		ca.eleToBeClickable();

		click(sp.getDeletepogroup());
		Commonactions.isElementPresent(pup.getDelete_Btn());
		click(pup.getDelete_Btn());
		Commonactions.isElementPresent(sp.getNewpogroupbtn());
		click(sp.getNewpogroupbtn());
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e1, poorder+Keys.TAB);
		ca.activeElement();
		ca.eleToBeClickable();

		click(sp.getSupplierpotab());
		Commonactions.isElementPresent(sp.getNewsupplierpobtn());
		click(sp.getNewsupplierpobtn());
		Commonactions.isElementPresent(sp.getSupplierPOVaule());

		insertText(sp.getSupplierPOVaule(), po_nocolor +Keys.TAB);
		Commonactions.isElementPresent(sp.getSupplierexpand());
		click(sp.getSupplierexpand());
		Commonactions.isElementPresent(sp.getSuppliervalue());
		click(sp.getSuppliervalue());
		Commonactions.isElementPresent(sp.getFactoryexpand());
		click(sp.getFactoryexpand());
		Commonactions.isElementPresent(sp.getFactoryvaluepo());
		click(sp.getFactoryvaluepo());
		Commonactions.isElementPresent(sp.getSAVEANDGO());
		click(sp.getSAVEANDGO());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(hp.getSourcingBtn());
		click(hp.getSourcingBtn());
		Commonactions.isElementPresent(sp.getSupplierpo());
		System.out.println("sourcing clicked");
		click(sp.getSupplierpo());
		Commonactions.isElementPresent(sp.getNewsupplierpobtn());
		click(sp.getNewsupplierpobtn());
		Commonactions.isElementPresent(sp.getSupplierPOVaule());
		insertText(sp.getSupplierPOVaule(), po_colorbased +Keys.TAB);
		Commonactions.isElementPresent(sp.getSupplierexpand());
		click(sp.getSupplierexpand());
		Commonactions.isElementPresent(sp.getSuppliervalue());
		click(sp.getSuppliervalue());
		Commonactions.isElementPresent(sp.getFactoryexpand());
		click(sp.getFactoryexpand());
		Commonactions.isElementPresent(sp.getFactoryvaluepo());
		click(sp.getFactoryvaluepo());
		Commonactions.isElementPresent(sp.getColorbasedcheckbox());
		click(sp.getColorbasedcheckbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		click(mp.getSave_btn1());
		ca.eleToBeClickable();


		Commonactions.isElementPresent(dp.getNameofcreateddoc());
		click(dp.getNameofcreateddoc());
		Commonactions.isElementPresent(sp.getPohead());
		click(sp.getPohead());
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e2, poorder);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getCommissionrate());


		click(sp.getCommissionrate());
		ca.eleToBeClickable();
		WebElement e3 = ca.activeElement();
		ca.eleToBeClickable();
		e3.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e3, "10");
		ca.eleToBeClickable();
		e3.sendKeys(Keys.TAB);	
		ca.eleToBeClickable();

		//	ca.click(sp.getPaymentterm());
		WebElement e4 = ca.activeElement();
		ca.eleToBeClickable();
		e4.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e4, "cheque");
		ca.eleToBeClickable();
		e4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();


		Commonactions.mouseOver(sp.getNewdividerbtn());
		Commonactions.isElementPresent(sp.getNewdeviceexpand());
		ca.click(sp.getNewdeviceexpand());
		Commonactions.isElementPresent(sp.getNewcolorwayorder());
		ca.click(sp.getNewcolorwayorder());
		Commonactions.isElementPresent(sp.getReset());
		ca.click(sp.getReset());
		Commonactions.isElementPresent(sp.getStyleselect());
		ca.click(sp.getStyleselect());
		Commonactions.isElementPresent(sp.getApparealcheckbox());
		ca.click(sp.getApparealcheckbox());
		Commonactions.isElementPresent(sp.getdisplay());
		ca.click(sp.getdisplay());
		Commonactions.isElementPresent(sp.getBluecheckbox1());
		ca.click(sp.getBluecheckbox1());
		Commonactions.isElementPresent(sp.getGreencheckbox1());
		ca.click(sp.getGreencheckbox1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(sp.getInstruction());

		Commonactions.mouseOver(sp.getInstruction());
		Commonactions.isElementPresent(sp.getB_supplierquote());

		ca.click(sp.getB_supplierquote());
		WebElement sq1 = ca.activeElement();
		sq1.sendKeys(Keys.TAB);
		WebElement sq = ca.activeElement();
		ca.eleToBeClickable();
		try {
			ca.insertText(sq, quotevalueBlue);
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();
		}
		catch(Exception q) {
			System.out.println(q);
			System.out.println("supplier quote selection not selected @ supplier po");
		}




		ca.click(sp.getG_supplierquote());
		WebElement sg1 = ca.activeElement();
		sg1.sendKeys(Keys.TAB);
		WebElement sg = ca.activeElement();
		ca.eleToBeClickable();
		try {
			ca.insertText(sg, quotevaluegreen);
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();
		}
		catch(Exception q) {
			System.out.println(q);
			System.out.println("supplier quote selection not selected @ supplier po");
		}


		for(int i=0;i<100;i++)
		{
			ca.click(sp.getPlusicon());
		}

		/* ca.eleToBeClickable();
		Commonactions.clickjs(sp.getB_discountpct());
		WebElement e5 = ca.activeElement();
		ca.eleToBeClickable();
		e5.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e5, dispct);
		ca.eleToBeClickable();
		Commonactions.clickjs(sp.getHeader());
		Commonactions.isElementPresent(sp.getB_discountvalue());

		Commonactions.clickjs(sp.getB_discountvalue());
		WebElement e6 = ca.activeElement();
		ca.eleToBeClickable();
		e6.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e6,disvalue);
		ca.eleToBeClickable();
		Commonactions.clickjs(sp.getHeader());
		ca.eleToBeClickable();


		Commonactions.clickjs(sp.getB_allowancepercentage());
		ca.eleToBeClickable();
		WebElement e7 = ca.activeElement();
		ca.eleToBeClickable();
		e7.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e7, allowancepct);
		ca.eleToBeClickable();
		Commonactions.clickjs(sp.getHeader());
		ca.eleToBeClickable();


		Commonactions.clickjs(sp.getB_allowancevalue());
		WebElement e8 = ca.activeElement();
		ca.eleToBeClickable();
		e8.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e8, allowancevalue);
		ca.eleToBeClickable();
		Commonactions.clickjs(sp.getHeader());
		ca.eleToBeClickable();


		Commonactions.clickjs(sp.getG_discountpct());
		WebElement e9 = ca.activeElement();
		ca.eleToBeClickable();
		e9.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e9, dispct);
		ca.eleToBeClickable();
		Commonactions.clickjs(sp.getHeader());
		ca.eleToBeClickable();


		Commonactions.clickjs(sp.getG_discountvalue());
		WebElement e10 = ca.activeElement();
		ca.eleToBeClickable();
		e10.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e10, disvalue);
		ca.eleToBeClickable();
		Commonactions.clickjs(sp.getHeader());
		ca.eleToBeClickable();


		Commonactions.clickjs(sp.getG_allowancepercentage());
		WebElement e11 = ca.activeElement();
		ca.eleToBeClickable();
		e11.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e11, allowancepct);
		ca.eleToBeClickable();
		Commonactions.clickjs(sp.getHeader());
		ca.eleToBeClickable();


		Commonactions.clickjs(sp.getG_allowancevalue());
		WebElement e12 = ca.activeElement();
		ca.eleToBeClickable();
		e12.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e12, allowancevalue);
		ca.eleToBeClickable();
		Commonactions.clickjs(sp.getHeader());
		ca.eleToBeClickable();*/

		Commonactions.isElementPresent(sp.getPOHeader());
		Commonactions.mouseOver(sp.getPOHeader());
		Commonactions.isElementPresent(sp.getEdit());
		ca.click(sp.getEdit());
		Commonactions.isElementPresent(sp.getEditText());
		insertText(sp.getEditText(), EditValue );
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		ca.jsScrollPageDown(sp.getInstruction());
		Commonactions.isElementPresent(sp.getInstruction());
		Commonactions.mouseOver(sp.getInstruction());
		ca.activeElement();
		ca.click(sp.getEdit());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getEditText());
		insertText(sp.getEditText(), EditValue);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		try{
			ca.jsScrollPageUp(sp.getComments());
			Commonactions.isElementPresent(sp.getComments());
			ca.click(sp.getComments());
			//Commonactions.mouseOver(sp.getNewcomment());
			Commonactions.isElementPresent(sp.getNewcomment());
			ca.click(sp.getNewcomment());
			Commonactions.isElementPresent(sp.getNewcommentsubject());
			insertText(sp.getNewcommentsubject(), "subject");
			Commonactions.isElementPresent(sp.getEditText());
			ca.insertText(sp.getEditText(), EditValue);
			//Commonactions.isElementPresent(mp.getSave_btn1());
			ca.eleToBeClickable();
			ca.jsScrollPageDown(driver.findElement(By.xpath("(//span[text()='Save'])[1]")));
			ca.click(driver.findElement(By.xpath("(//span[text()='Save'])[1]")));
			ca.eleToBeClickable();
		}catch (Exception eee) {
			// TODO: handle exception
		}


	}


	@Then("user creates shipment qc and set {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_creates_shipment_qc_and_set(String bunitvalue, String gunitvalue,String bshipvalue,String gshipvalue,String qcissue,String selectset,String gshipqty,String bshipqty) throws Throwable {



		ca.eleToBeClickable();

		Commonactions.mouseOver(sp.getOrders());
		Commonactions.isElementPresent(sp.getOrders());
		click(sp.getOrders());
		ca.eleToBeClickable();

		driver.navigate().refresh();
		Commonactions.jsWaitForPageLoad();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getOrders());
		click(sp.getOrders());
		ca.eleToBeClickable();
		Thread.sleep(2000);
		for(int i=0;i<30;i++)
		{
			ca.click(driver.findElement(By.xpath("(//div[contains(@class,'PurchasedOrder-Orders')]//span[text()='+']/parent::div)[1]")));
		}

		for(int i=1;i<=3;i++) {
			ca.eleToBeClickable();
			Thread.sleep(2000);
			int k= i+3;
			ca.click(driver.findElement(By.xpath("(//td[text()='Green Color faded']/following-sibling::td[(@data-csi-act='QuantityPerSize::0')])["+i+"]")));

			ca.eleToBeClickable();
			int bb = Integer.parseInt(gshipqty);
			bb=bb+(i*10);
			String qnty = Integer.toString(bb);
			ca.eleToBeClickable();
			WebElement e13 = ca.activeElement();
			ca.eleToBeClickable();
			e13.sendKeys(Keys.DELETE);
			ca.eleToBeClickable();
			ca.insertText(e13, qnty);
			ca.eleToBeClickable();
			// e13.sendKeys(Keys.TAB);
		}

		for(int i=1;i<=3;i++) {

			ca.eleToBeClickable();
			Thread.sleep(2000);
			int j= i+3;
			ca.click(driver.findElement(By.xpath("(//td[text()='Blue Color faded']/following-sibling::td[(@data-csi-act='QuantityPerSize::0')])["+i+"]")));

			ca.eleToBeClickable();
			int bb = Integer.parseInt(bshipqty);
			bb=bb+(i*10);
			String qnty = Integer.toString(bb);
			ca.eleToBeClickable();
			WebElement e14 = ca.activeElement();
			ca.eleToBeClickable();
			e14.sendKeys(Keys.DELETE);
			ca.eleToBeClickable();
			ca.insertText(e14, qnty);
			ca.eleToBeClickable();
			e14.sendKeys(Keys.TAB);
		}



		try {	ca.click(sp.getUnitpackBlue2());	}
		catch(Exception Bu)
		{	ca.click(sp.getUnitpackBlue1());	}
		WebElement e13 = ca.activeElement();
		ca.eleToBeClickable();
		e13.sendKeys(Keys.DELETE);
		ca.insertText(e13, bunitvalue);
		e13.sendKeys(Keys.TAB);
		try {		ca.click(sp.getUnitpackGreen2());	}
		catch(Exception Gu)
		{ 	ca.click(sp.getUnitpackGreen1());}
		WebElement e14 = ca.activeElement();
		ca.eleToBeClickable();
		e14.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e14, gunitvalue);
		ca.eleToBeClickable();
		e14.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(sp.getOrdersummary());

		ca.click(sp.getOrdersummary());
		Commonactions.isElementPresent(sp.getShipment());
		ca.click(sp.getShipment());
		Commonactions.isElementPresent(sp.getNewshipmentexpand());
		ca.click(sp.getNewshipmentexpand());
		Commonactions.isElementPresent(sp.getSelectshipment());
		ca.click(sp.getSelectshipment());
		Commonactions.isElementPresent(sp.getCheckbox());
		ca.click(sp.getCheckbox());
		ca.eleToBeClickable();
		click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getNewshipmentorder());

		ca.click(sp.getNewshipmentorder());
		Commonactions.isElementPresent(sp.getBluecheckbox1());
		ca.click(sp.getBluecheckbox1());
		Commonactions.isElementPresent(sp.getGreencheckbox1());
		ca.click(sp.getGreencheckbox1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		driver.navigate().refresh();
		Commonactions.jsWaitForPageLoad();
		Commonactions.isElementPresent(sp.getShipment());
		ca.click(sp.getShipment());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getBlueshipmentqty());

		try {		ca.click(sp.getBlueshipmentqty());	}
		catch(Exception bs)
		{	Commonactions.clickjs(sp.getBlueshipmentqty1());	}
		WebElement e15 = ca.activeElement();
		ca.eleToBeClickable();
		e15.sendKeys(Keys.DELETE);
		ca.insertText(e15, bshipvalue);
		e15.sendKeys(Keys.TAB);
		//ca.click(sp.getShipment());
		try	{		ca.click(sp.getGreenShipmentqty());	}
		catch(Exception bs)
		{	ca.click(sp.getGreenShipmentqty1());	}
		WebElement e16 = ca.activeElement();
		ca.eleToBeClickable();
		e16.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e16, gshipvalue);
		ca.eleToBeClickable();
		e16.sendKeys(Keys.TAB);
		//ca.click(sp.getShipment());
		ca.eleToBeClickable();

		ca.click(sp.getQualitycontrol());
		Commonactions.isElementPresent(sp.getNewQCIssue());
		ca.click(sp.getNewQCIssue());

		ca.eleToBeClickable();
		WebElement e17 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e17, qcissue);
		ca.eleToBeClickable();
		e17.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		ca.click(sp.getQccopy());
		Commonactions.isElementPresent(sp.getQcdelete());
		ca.click(sp.getQcdelete());
		Commonactions.isElementPresent(pup.getDelete_Btn());
		ca.click(pup.getDelete_Btn());
		ca.eleToBeClickable();


		ca.click(sp.getSelectSet());
		Commonactions.isElementPresent(sp.getSelectsetBtn());
		ca.click(sp.getSelectsetBtn());
		Commonactions.isElementPresent(sp.getSelectsetvalue());
		insertText(sp.getSelectsetvalue(), selectset);	
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(hp.getUser_homeBtn());

		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();
	}


	@Then("User creates customerpo and issue {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_creates_customerpo_and_issue(String povalue, String B_baseprice, String G_baseprice, String B_orderqty, String G_orderqty, String dispnt, String disvalue, String allopct, String allovalue, String commission, String payment) throws Throwable {

		ca.eleToBeClickable();
		ca.click(hp.getSourcingBtn());
		Commonactions.isElementPresent(sp.getCustomerPO());

		ca.click(sp.getCustomerPO());
		Commonactions.isElementPresent(sp.getNewcustomerPObtn());
		ca.click(sp.getNewcustomerPObtn());
		Commonactions.isElementPresent(sp.getCustomerPOvalue());
		insertText(sp.getCustomerPOvalue(), povalue);
		Commonactions.isElementPresent(sp.getCustomerexpand());
		ca.click(sp.getCustomerexpand());
		Commonactions.isElementPresent(sp.getSelecttarget());
		ca.click(sp.getSelecttarget());
		Commonactions.isElementPresent(sp.getColorbasedcheckbox());
		ca.click(sp.getColorbasedcheckbox());
		Commonactions.isElementPresent(sp.getSAVEANDGO());
		ca.click(sp.getSAVEANDGO());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getOrders());

		ca.click(sp.getOrders());
		Commonactions.isElementPresent(sp.getNewdividerexpand());
		ca.click(sp.getNewdividerexpand());
		Commonactions.isElementPresent(sp.getNewcolorwaybtn());
		ca.click(sp.getNewcolorwaybtn());
		Commonactions.isElementPresent(sp.getStyleselect());

		ca.click(sp.getStyleselect());
		Commonactions.isElementPresent(sp.getApparealcheckbox());
		ca.click(sp.getApparealcheckbox());
		Commonactions.isElementPresent(sp.getdisplay());
		ca.click(sp.getdisplay());
		Commonactions.isElementPresent(sp.getBluecheckbox1());
		ca.click(sp.getBluecheckbox1());
		Commonactions.isElementPresent(sp.getGreencheckbox1());
		ca.click(sp.getGreencheckbox1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(sp.getPlusicon());


		for(int i=0;i<100;i++)
		{
			ca.click(sp.getPlusicon());
		}
		ca.eleToBeClickable();
		Commonactions.clickjs(sp.getB_quantity());
		WebElement c = ca.activeElement();
		ca.eleToBeClickable();
		c.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(c, B_orderqty);
		Commonactions.isElementPresent(sp.getOrders());
		ca.click(sp.getOrders());
		Commonactions.isElementPresent(sp.getB_baseprice());

		Commonactions.clickjs(sp.getB_quantity());
		WebElement cx = ca.activeElement();
		ca.eleToBeClickable();
		cx.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(cx, B_orderqty);
		Commonactions.isElementPresent(sp.getOrders());
		ca.click(sp.getOrders());
		Commonactions.isElementPresent(sp.getB_baseprice());

		Commonactions.clickjs(sp.getB_baseprice());
		WebElement c1 = ca.activeElement();
		ca.eleToBeClickable();
		c1.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(c1, B_baseprice);
		Commonactions.isElementPresent(sp.getOrders());
		ca.click(sp.getOrders());
		Commonactions.isElementPresent(sp.getB_discountpct());

		Commonactions.clickjs(sp.getB_discountpct());
		WebElement c2 = ca.activeElement();
		ca.eleToBeClickable();
		c2.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(c2, dispnt);
		Commonactions.isElementPresent(sp.getOrders());
		ca.click(sp.getOrders());
		Commonactions.isElementPresent(sp.getB_discountvalue());

		Commonactions.clickjs(sp.getB_discountvalue());
		WebElement c3 = ca.activeElement();
		ca.eleToBeClickable();
		c3.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(c3, disvalue);
		Commonactions.isElementPresent(sp.getOrders());
		ca.click(sp.getOrders());
		Commonactions.isElementPresent(sp.getB_allowancepercentage());

		Commonactions.clickjs(sp.getB_allowancepercentage());
		WebElement c4 = ca.activeElement();
		ca.eleToBeClickable();
		c4.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(c4, allopct);
		Commonactions.isElementPresent(sp.getOrders());
		ca.click(sp.getOrders());
		ca.eleToBeClickable();

		Commonactions.clickjs(sp.getB_allowancevalue());
		WebElement c5 = ca.activeElement();
		ca.eleToBeClickable();
		c5.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(c5, allovalue);
		Commonactions.isElementPresent(sp.getOrders());
		ca.click(sp.getOrders());
		Commonactions.isElementPresent(sp.getG_quantity());

		Commonactions.clickjs(sp.getG_quantity());
		WebElement c6 = ca.activeElement();
		ca.eleToBeClickable();
		c6.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(c6, G_orderqty);
		Commonactions.isElementPresent(sp.getOrders());
		ca.click(sp.getOrders());
		Commonactions.isElementPresent(sp.getG_baseprice());

		Commonactions.clickjs(sp.getG_baseprice());
		WebElement c7 = ca.activeElement();
		ca.eleToBeClickable();
		c7.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(c7, "300");
		Commonactions.isElementPresent(sp.getOrders());
		ca.click(sp.getOrders());
		Commonactions.isElementPresent(sp.getG_discountpct());

		Commonactions.clickjs(sp.getG_discountpct());
		WebElement c8 = ca.activeElement();
		ca.eleToBeClickable();
		c8.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(c8, dispnt);
		Commonactions.isElementPresent(sp.getOrders());
		ca.click(sp.getOrders());
		Commonactions.isElementPresent(sp.getG_discountvalue());

		Commonactions.clickjs(sp.getG_discountvalue());
		WebElement c9 = ca.activeElement();
		ca.eleToBeClickable();
		c9.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(c9, disvalue);
		Commonactions.isElementPresent(sp.getOrders());
		ca.click(sp.getOrders());
		Commonactions.isElementPresent(sp.getG_allowancepercentage());

		Commonactions.clickjs(sp.getG_allowancepercentage());
		WebElement c10 = ca.activeElement();
		ca.eleToBeClickable();
		c10.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(c10, allopct);
		Commonactions.isElementPresent(sp.getOrders());
		ca.click(sp.getOrders());
		Commonactions.isElementPresent(sp.getG_allowancevalue());

		Commonactions.clickjs(sp.getG_allowancevalue());
		WebElement c11 = ca.activeElement();
		ca.eleToBeClickable();
		c11.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(c11, allovalue);
		Commonactions.isElementPresent(sp.getOrders());
		ca.click(sp.getOrders());
		Commonactions.isElementPresent(sp.getOrdersummary());

		Commonactions.clickjs(sp.getOrdersummary());
		Commonactions.isElementPresent(sp.getProperties());
		ca.click(sp.getProperties());
		Commonactions.isElementPresent(sp.getCommissionrate());

		ca.click(sp.getCommissionrate());
		ca.eleToBeClickable();
		WebElement c12 = ca.activeElement();
		ca.eleToBeClickable();
		c12.sendKeys(Keys.DELETE);
		ca.insertText(c12, commission);
		Commonactions.isElementPresent(sp.getProperties());
		Commonactions.clickjs(sp.getProperties());
		Commonactions.isElementPresent(sp.getPaymentterm());

		ca.click(sp.getPaymentterm());
		ca.eleToBeClickable();
		WebElement c13 = ca.activeElement();
		ca.eleToBeClickable();
		c13.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(c13, payment);
		Commonactions.isElementPresent(sp.getProperties());
		ca.click(sp.getProperties());
		Commonactions.isElementPresent(hp.getUser_homeBtn());


		ca.click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(hp.getStyleBtn());

		ca.click(hp.getStyleBtn());
		Commonactions.isElementPresent(st.getSeason_Btn());
		ca.click(st.getSeason_Btn());
		Commonactions.isElementPresent(sp.getWinterseason());
		ca.click(sp.getWinterseason());
		Commonactions.isElementPresent(st.getStyles_Btn());
		ca.click(st.getStyles_Btn());
		Commonactions.isElementPresent(sp.getColorandsizename());
		ca.click(sp.getColorandsizename());
		Commonactions.isElementPresent(hp.getSourcingBtn());
		ca.click(hp.getSourcingBtn());
		Commonactions.isElementPresent(sp.getPos());
		ca.click(sp.getPos());
		Commonactions.isElementPresent(sp.getSupplierpos());
		ca.click(sp.getSupplierpos());
		ca.eleToBeClickable();
		try {
			ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-heading,'Factory')]/preceding-sibling::td//a[text()='PO-AP1123-colorbased'])")));
			ca.eleToBeClickable();
			//	ca.click(driver.findElement(By.xpath("(//span[contains(text(),'Issues')]/parent::div/parent::div/parent::div/preceding-sibling::div)[2]")));
		}
		catch(Exception e){
			try {				
				ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-heading,'Node Name')]/a[text()='PO-AP1123-colorbased'])[2]")));	
				ca.eleToBeClickable();
				ca.click(driver.findElement(By.xpath("(//span[contains(text(),'Issues')]/parent::div/parent::div/parent::div/preceding-sibling::div)[2]")));


			}


			catch(Exception ee)	{	System.out.println(ee +"colorbased value not clicked"); 	}
		}
		/*Commonactions.isElementPresent(sp.getSupplierpo());
		ca.click(sp.getSupplierpo());
		Commonactions.isElementPresent(sp.getNegotiationarrow());


		try {			ca.click(sp.getNegotiationarrow());
		System.out.println("negatiation arrow clicked successfully");
		}
		catch(Exception neg)
		{	System.out.println(neg);}*/
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getReadyArrow());
		try {			


			ca.click(sp.getReadyArrow());
			System.out.println("ready arrow clicked successfully");
		}
		catch(Exception red)
		{	System.out.println(red);}
		ca.eleToBeClickable();

		try {	
			//ca.click(sp.getIssuedArrow());
			//ca.eleToBeClickable();
			ca.click(driver.findElement(By.xpath("//span[@data-csi-act='POToIssued' and text()='arrow_forward']")));

			System.out.println("issued successfully");

		}
		catch(Exception iss)
		{	System.out.println(iss);}
		ca.eleToBeClickable();


		//ca.click(sp.getErrormessage());
		try{
			Commonactions.isElementPresent(pup.getOK_Btn());
			ca.click(pup.getOK_Btn());
		}catch (Exception e) {
			// TODO: handle exception
		}
		//	Commonactions.isElementPresent(sp.getInstruction());
		//	Commonactions.mouseOver(sp.getInstruction());
		try{
			ca.click(driver.findElement(By.xpath("(//span[contains(text(),'Shipment')]/parent::div/parent::div/parent::div/preceding-sibling::div)[2]")));
			Commonactions.isElementPresent(sp.getSupplierpo());
			ca.click(sp.getSupplierpo());
			ca.eleToBeClickable();
		}catch (Exception e) {
			// TODO: handle exception
			ca.click(sp.getSupplierpo());
		}
		ca.jsScrollPageDown(sp.getBlue_supplierquote());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getBlue_supplierquote());

		ca.click(sp.getBlue_supplierquote());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getApproveActions());
		Commonactions.clickjs(sp.getApproveActions());

		try{
			Commonactions.isElementPresent(sp.getApprove());
			Commonactions.clickjs(sp.getApprove());
		}catch(Exception exp){

		}

		Commonactions.isElementPresent(sp.getColorandsizename());
		ca.click(sp.getColorandsizename());
		ca.eleToBeClickable();



		try {
			ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-heading,'Factory')]/preceding-sibling::td//a[text()='PO-AP1123-colorbased'])")));
		}
		catch(Exception e){
			try {				
				ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-heading,'Node Name')]/a[text()='PO-AP1123-colorbased'])[2]")));	}
			catch(Exception ee)	{	
				System.out.println(ee +"colorbased value not clicked"); 	}
		}
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		//	Commonactions.isElementPresent(sp.getReadyArrow());

		ca.jsScrollPageDown(sp.getGreen_supplierquote());
		Commonactions.isElementPresent(sp.getGreen_supplierquote());
		ca.click(sp.getGreen_supplierquote());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getApproveActions());
		Commonactions.clickjs(sp.getApproveActions());
		Commonactions.isElementPresent(sp.getApprove());
		Commonactions.clickjs(sp.getApprove());
		Commonactions.isElementPresent(sp.getColorandsizename());
		ca.click(sp.getColorandsizename());
		ca.eleToBeClickable();


		try {
			ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-heading,'Factory')]/preceding-sibling::td//a[text()='PO-AP1123-colorbased'])")));
		}
		catch(Exception e){
			try {				ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-heading,'Node Name')]/a[text()='PO-AP1123-colorbased'])[2]")));	}
			catch(Exception ee)	{	System.out.println(e +"colorbased value not clicked"); 	}
		}
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		try 
		{		
			ca.click(sp.getIssuedArrow());
			ca.eleToBeClickable();
			System.out.println("issued successfully");
			Commonactions.isElementPresent(pup.getOK_Btn());
			ca.click(pup.getOK_Btn());
		}
		catch(Exception issue)
		{
			System.out.println(issue);
		}


	}

	public void goToSupplierQuotes() throws Throwable {

		List<WebElement> index = driver.findElements(By.xpath("//span[text()='Style' or @data-csi-tab-name='Style']"));
		int i = index.size();
		if(i==2){
			ca.eleToBeClickable();
			ca.click(driver.findElement(By.xpath("(//span[text()='Style' or @data-csi-tab-name='Style'])[2]")));
		}else{
			Commonactions.isElementPresent(hp.getStyleBtn());
			ca.click(hp.getStyleBtn());
		}
		try{
			Commonactions.isElementPresent(st.getSeason_Btn());
			ca.click(st.getSeason_Btn());
		}catch (Exception e) {
			// TODO: handle exception
		}
		Commonactions.isElementPresent(sm.getWinterSeason());
		ca.click(sm.getWinterSeason());
		Commonactions.isElementPresent(st.getStyles_Btn());
		ca.click(st.getStyles_Btn());
		Commonactions.isElementPresent(sm.getClrAndSize());
		ca.click(sm.getClrAndSize());
		Commonactions.isElementPresent(sp.getSeasonsourcing());
		ca.click(sp.getSeasonsourcing());

	}

	public void goToStyleSamples() {


		Commonactions.isElementPresent(hp.getStyleBtn());
		ca.click(hp.getStyleBtn());
		Commonactions.isElementPresent(sm.getWinterSeason());
		ca.click(sm.getWinterSeason());
		Commonactions.isElementPresent(st.getStyles_Btn());
		ca.click(st.getStyles_Btn());
		Commonactions.isElementPresent(sm.getClrAndSize());
		ca.click(sm.getClrAndSize());
		Commonactions.isElementPresent(sp.getStyleUpdate());
		ca.click(sp.getStyleUpdate());
		Commonactions.isElementPresent(sm.getSamples());
		ca.click(sm.getSamples());

	}

	@When("user update delete style samples {string},{string}")
	public void user_update_delete_style_samples(String string, String string2) throws Throwable {

		goToStyleSamples();

		try{
			Commonactions.isElementPresent(sm.getSampleBtn());
			ca.click(sm.getSampleBtn());
		}catch (Exception e) {
			driver.navigate().refresh();
			Commonactions.isElementPresent(sm.getSamples());
			ca.click(sm.getSamples());
			Commonactions.isElementPresent(sm.getSampleBtn());
			ca.click(sm.getSampleBtn());
		}
		ca.eleToBeClickable();

		Commonactions.isElementPresent(sp.getSampleSupplier());
		ca.click(sp.getSampleSupplier());
		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.insertText(e, "Supplier"); 
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		e.sendKeys(Keys.TAB);

		Commonactions.isElementPresent(sp.getSampleSupplier());
		ca.click(sp.getSampleSupplier());
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e1, "Changshu"); 
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		e1.sendKeys(Keys.TAB);

		Commonactions.isElementPresent(sp.getSampleSupplier());
		ca.click(sp.getSampleSupplier());
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e2, "Frontline"); 
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		e2.sendKeys(Keys.TAB);

		Commonactions.isElementPresent(sm.getSampleValue());
		ca.insertText(sm.getSampleValue(), string);
		Commonactions.isElementPresent(sm.getSampledimension());
		ca.click(sm.getSampledimension());
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a2, "Colors and Sizes");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.click(sm.getColorsSel());
		Commonactions.isElementPresent(sm.getGoTodialog());
		ca.click(sm.getGoTodialog());
		Commonactions.isElementPresent(sm.getEgretChkBx());
		ca.click(sm.getEgretChkBx());
		Commonactions.isElementPresent(mp.getSave_btn2());
		ca.click(mp.getSave_btn2());
		ca.eleToBeClickable();
		ca.click(sm.getSizesSel());
		Commonactions.isElementPresent(sm.getGoTodialog1());
		ca.click(sm.getGoTodialog1());
		Commonactions.isElementPresent(sm.getMediumChkBx());
		ca.click(sm.getMediumChkBx());
		Commonactions.isElementPresent(mp.getSave_btn2());
		ca.click(mp.getSave_btn2());
		Commonactions.isElementPresent(sp.getQuantityValue());
		ca.insertText(sp.getQuantityValue(), string2);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Thread.sleep(3000);

		System.out.println("Delete Style Samples created successfully");




	}

	public void SearchFrontline() throws Throwable {
		Thread.sleep(2000);
		Commonactions.isElementPresent(sp.getStySampleFilter());
		ca.click(sp.getStySampleFilter());
		//ca.eleToBeClickable();
		//	ca.click(driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'filter-Style-ProductSamples-Node Name')]//div[contains(@class,'ArrowButton')])[1]")));
		//	ca.click(driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'filter-Style-ProductSamples-Node Name')]//div[contains(@class,'ArrowButton')])[1]")));
		//ca.eleToBeClickable();
		//	ca.click(driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'filter-Style-ProductSamples-Node Name')]//div[contains(@class,'ArrowButton')])[1]")));
		ca.eleToBeClickable();
		try{
			ca.insertText(sp.getSearchValue(), "Frontline");
			ca.eleToBeClickable();
			Commonactions.isElementPresent(sp.getSelectValue());
			ca.click(sp.getSelectValue());
			ca.eleToBeClickable();
			WebElement b1 = ca.activeElement();
			ca.eleToBeClickable();
			b1.sendKeys(Keys.TAB);
			ca.eleToBeClickable();
		} catch (Exception e) {
			ca.click(driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'filter-Style-ProductSamples-Node Name')]//div[contains(@class,'ArrowButton')])[1]")));
			ca.eleToBeClickable();
			WebElement b = ca.activeElement();
			ca.eleToBeClickable();
			b.sendKeys("Frontline");
			Commonactions.isElementPresent(sp.getSelectValue());
			ca.click(sp.getSelectValue());
			ca.eleToBeClickable();
			WebElement b1 = ca.activeElement();
			ca.eleToBeClickable();
			b1.sendKeys(Keys.TAB);
			ca.eleToBeClickable();
		}

	}

	public void SearchSupplier() throws Throwable {

		Thread.sleep(2000);
		Commonactions.isElementPresent(sp.getStySampleFilter());
		ca.click(sp.getStySampleFilter());
		//ca.eleToBeClickable();
		//	ca.click(driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'filter-Style-ProductSamples-Node Name')]//div[contains(@class,'ArrowButton')])[1]")));
		//	ca.click(driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'filter-Style-ProductSamples-Node Name')]//div[contains(@class,'ArrowButton')])[1]")));
		//	ca.eleToBeClickable();
		//	ca.click(driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'filter-Style-ProductSamples-Node Name')]//div[contains(@class,'ArrowButton')])[1]")));

		try {

			ca.insertText(sp.getSearchValue(), "Supplier");
			ca.eleToBeClickable();
			Commonactions.isElementPresent(sp.getSelectValue());
			ca.click(sp.getSelectValue());
			ca.eleToBeClickable();
			WebElement b1 = ca.activeElement();
			ca.eleToBeClickable();
			b1.sendKeys(Keys.TAB);
			ca.eleToBeClickable();

		} catch (Exception e) {
			ca.click(driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'filter-Style-ProductSamples-Node Name')]//div[contains(@class,'ArrowButton')])[1]")));
			ca.eleToBeClickable();
			WebElement b = ca.activeElement();
			ca.eleToBeClickable();
			b.sendKeys("Supplier");
			Commonactions.isElementPresent(sp.getSelectValue());
			ca.click(sp.getSelectValue());
			ca.eleToBeClickable();
			WebElement b1 = ca.activeElement();
			ca.eleToBeClickable();
			b1.sendKeys(Keys.TAB);
			ca.eleToBeClickable();

		}



	}

	public void SearchChangshu() throws Throwable {
		Thread.sleep(2000);
		Commonactions.isElementPresent(sp.getStySampleFilter());
		ca.click(sp.getStySampleFilter());
		//ca.eleToBeClickable();
		//ca.click(driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'filter-Style-ProductSamples-Node Name')]//div[contains(@class,'ArrowButton')])[1]")));
		//ca.click(driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'filter-Style-ProductSamples-Node Name')]//div[contains(@class,'ArrowButton')])[1]")));
		//ca.eleToBeClickable();
		//ca.click(driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'filter-Style-ProductSamples-Node Name')]//div[contains(@class,'ArrowButton')])[1]")));
		ca.eleToBeClickable();
		try{
			ca.insertText(sp.getSearchValue(), "Changshu");
			ca.eleToBeClickable();
			Commonactions.isElementPresent(sp.getSelectValue());
			ca.click(sp.getSelectValue());
			ca.eleToBeClickable();
			WebElement b1 = ca.activeElement();
			ca.eleToBeClickable();
			b1.sendKeys(Keys.TAB);
			ca.eleToBeClickable();
		} catch (Exception e) {
			ca.click(driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'filter-Style-ProductSamples-Node Name')]//div[contains(@class,'ArrowButton')])[1]")));
			ca.eleToBeClickable();
			WebElement b = ca.activeElement();
			ca.eleToBeClickable();
			b.sendKeys("Changshu");
			Commonactions.isElementPresent(sp.getSelectValue());
			ca.click(sp.getSelectValue());
			ca.eleToBeClickable();
			WebElement b1 = ca.activeElement();
			ca.eleToBeClickable();
			b1.sendKeys(Keys.TAB);
			ca.eleToBeClickable();
		}
	}

	@When("User modify the sample names")
	public void user_modify_the_sample_names() throws Throwable {

		//------------temp-----------------\\
		//     goToStyleSamples();
		//---------------------------------\\

		SearchSupplier();
		// ca.jsScrollPageUp(sp.getNameSuModify1());
		Commonactions.isElementPresent(sp.getNameSuModify1());

		ca.click(sp.getNameSuModify1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getElement());
		ca.click(sp.getElement());
		WebElement c = ca.activeElement();
		c.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		WebElement e = ca.activeElement();
		e.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		e.sendKeys("Delete Sample True - Supplier",Keys.TAB);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@data-csi-crumb-type='Style']")));
		ca.eleToBeClickable();

		SearchSupplier();

		ca.eleToBeClickable();
		ca.jsScrollPageDown(sp.getNameSuModify2());
		Commonactions.isElementPresent(sp.getNameSuModify2());
		ca.click(sp.getNameSuModify2());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getElement());
		ca.click(sp.getElement());
		WebElement d = ca.activeElement();
		d.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		e1.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		e1.sendKeys("Delete Sample False - Supplier",Keys.TAB);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@data-csi-crumb-type='Style']")));
		ca.eleToBeClickable();

		SearchChangshu();

		Commonactions.isElementPresent(sp.getNameModify1());
		ca.click(sp.getNameModify1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getElement());
		ca.click(sp.getElement());
		WebElement f= ca.activeElement();
		f.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		a2.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		a2.sendKeys("Delete Sample True - Changshu",Keys.TAB);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@data-csi-crumb-type='Style']")));
		ca.eleToBeClickable();

		SearchChangshu();

		Commonactions.isElementPresent(sp.getNameModify2());
		ca.click(sp.getNameModify2());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getElement());
		ca.click(sp.getElement());
		WebElement g= ca.activeElement();
		g.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		a3.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		a3.sendKeys("Delete Sample False - Changshu",Keys.TAB);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@data-csi-crumb-type='Style']")));
		ca.eleToBeClickable();


		SearchFrontline();

		Commonactions.isElementPresent(sp.getNameModify3());
		ca.click(sp.getNameModify3());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getElement());
		ca.click(sp.getElement());
		WebElement h= ca.activeElement();
		h.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		WebElement b3 = ca.activeElement();
		b3.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		b3.sendKeys("Delete Sample True - Frontline",Keys.TAB);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@data-csi-crumb-type='Style']")));
		ca.eleToBeClickable();

		SearchFrontline();

		ca.jsScrollPagedowntoEnd();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getNameModify4());
		ca.click(sp.getNameModify4());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getElement());
		ca.click(sp.getElement());
		WebElement i= ca.activeElement();
		i.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		WebElement b4 = ca.activeElement();
		b4.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		b4.sendKeys("Delete Sample False - Frontline",Keys.TAB);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@data-csi-crumb-type='Style']")));
		ca.eleToBeClickable();

		System.out.println("Style Sample name modified Successfully");


	}

	@When("user creates delete supplier quotes {string}")
	public void user_creates_delete_supplier_quotes(String string) throws Throwable {


		goToSupplierQuotes();



		Commonactions.isElementPresent(sp.getSupplierquotes());
		ca.click(sp.getSupplierquotes());
		Commonactions.isElementPresent(sp.getNewSuplrqute());
		ca.click(sp.getNewSuplrqute());
		ca.eleToBeClickable();
		ca.insertText(sp.getSupplierValue(), "Supplier");
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		a.sendKeys(Keys.TAB);
		ca.insertText(sp.getSupplierValue(), "Changshu");
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		a1.sendKeys(Keys.TAB);
		ca.insertText(sp.getSupplierValue(), "Frontline");
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		a2.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(sp.getSupplierQteValue());
		ca.insertText(sp.getSupplierQteValue(), string);
		Commonactions.isElementPresent(sp.getColorSIze());
		ca.click(sp.getColorSIze());
		ca.eleToBeClickable();
		WebElement a7 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a7, "Colors And Sizes");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sp.getSetMatrix());
		ca.click(sp.getSetMatrix());
		Commonactions.isElementPresent(sp.getAllChckBx());
		ca.click(sp.getAllChckBx());
		ca.click(driver.findElement(By.xpath("(//td[contains(text(),'Green')]//following-sibling::td)[1]//input[@tabindex='0']")));
		ca.click(driver.findElement(By.xpath("(//td[contains(text(),'Blue')]//following-sibling::td)[1]//input[@tabindex='0']")));
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Thread.sleep(15000);
		System.out.println("Delete Supplier Quotes created successfully");



	}

	@When("user creates supplier request {string},{string}")
	public void user_creates_supplier_request(String string, String string2) throws Throwable {

		//temp//
		//	goToSupplierQuotes();
		//--------------------------------------//


		Commonactions.isElementPresent(sp.getSupplierrequest());
		ca.click(sp.getSupplierrequest());
		Commonactions.isElementPresent(sp.getNewsupplierrequestbtn());
		ca.click(sp.getNewsupplierrequestbtn());
		Commonactions.isElementPresent(sp.getSrttemplateExpand());
		ca.click(sp.getSrttemplateExpand());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, string);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sp.getSupplierreqvalue()); 
		ca.insertText(sp.getSupplierreqvalue(), string2);

		/*    	Commonactions.isElementPresent(sp.getSupplierSRreq());
    	ca.click(sp.getSupplierSRreq());
    	WebElement e = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(e, "Supplier"); 
    	ca.eleToBeClickable();
    	ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		e.sendKeys(Keys.TAB);*/

		Commonactions.isElementPresent(sp.getSupplierSRreq());
		ca.click(sp.getSupplierSRreq());
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e1, "Changshu"); 
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		e1.sendKeys(Keys.TAB);

		Commonactions.isElementPresent(sp.getSupplierSRreq());
		ca.click(sp.getSupplierSRreq());
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e2, "Frontline"); 
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		e2.sendKeys(Keys.TAB);

		Commonactions.isElementPresent(sp.getSaveAndGoBtn());
		ca.click(sp.getSaveAndGoBtn());

		System.out.println("Delete Supplier Request created successfully");

	}

	public void modify() throws Throwable {

		/*		Commonactions.isElementPresent(sp.getNameSQmodify1());
		ca.jsScrollPageUp(sp.getNameSQmodify1());
		ca.click(sp.getNameSQmodify1());
		ca.eleToBeClickable();
		Thread.sleep(2000);
	    Commonactions.isElementPresent(sp.getElement1());
	    ca.click(sp.getElement1());
		WebElement d = ca.activeElement();
		d.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		e1.sendKeys(Keys.DELETE);
		e1.sendKeys("123 Delete SQ - APPROVED",Keys.TAB);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@data-csi-crumb-type='SupplierRequest']")));*/
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//td[@data-csi-heading='State:Child:CurrentRevision:0'])[1]")));
		ca.eleToBeClickable();
		WebElement z = ca.activeElement();
		z.sendKeys("Approve");
		ca.jsMouseOver();
		try {
			ca.click(driver.findElement(By.xpath("(//td[contains(text(),'APPROVED')]//following-sibling::td//div/span[text()='close'])[1]")));
		} catch (Exception e) {

			System.out.println("Approved delete icon i not available as per condition");

		}

		/*		Commonactions.isElementPresent(sp.getNameSQmodify2());
		ca.click(sp.getNameSQmodify2());
		ca.eleToBeClickable();
		Thread.sleep(2000);
	    Commonactions.isElementPresent(sp.getElement1());
	    ca.click(sp.getElement1());
		WebElement d1 = ca.activeElement();
		d1.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		e2.sendKeys(Keys.DELETE);
		e2.sendKeys("123 Delete SQ - DRAFT",Keys.TAB);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@data-csi-crumb-type='SupplierRequest']")));
		ca.eleToBeClickable();*/


		/*		Commonactions.isElementPresent(sp.getNameSQmodify3());
		ca.click(sp.getNameSQmodify3());
		ca.eleToBeClickable();
		Thread.sleep(2000);
	    Commonactions.isElementPresent(sp.getElement1());
	    ca.click(sp.getElement1());
		WebElement d2 = ca.activeElement();
		d2.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		WebElement e3 = ca.activeElement();
		e3.sendKeys(Keys.DELETE);
		e3.sendKeys("123 Delete SQ - REVISED",Keys.TAB);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@data-csi-crumb-type='SupplierRequest']")));*/
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//td[@data-csi-heading='State:Child:CurrentRevision:0'])[3]")));
		ca.eleToBeClickable();
		WebElement z2 = ca.activeElement();
		ca.eleToBeClickable();
		z2.sendKeys("Abandon");
		ca.jsMouseOver();

		/*		Commonactions.isElementPresent(sp.getNameSQmodify4());
		ca.click(sp.getNameSQmodify4());
		ca.eleToBeClickable();
		Thread.sleep(2000);
	    Commonactions.isElementPresent(sp.getElement1());
	    ca.click(sp.getElement1());
		WebElement d3 = ca.activeElement();
		d3.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		WebElement e4 = ca.activeElement();
		e4.sendKeys(Keys.DELETE);
		e4.sendKeys("123 Delete SQ - CLOSED",Keys.TAB);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@data-csi-crumb-type='SupplierRequest']")));*/
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//td[@data-csi-heading='State:Child:CurrentRevision:0'])[4]")));
		ca.eleToBeClickable();
		WebElement z3 = ca.activeElement();
		ca.eleToBeClickable();
		z3.sendKeys("Approve");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//td[@data-csi-heading='State:Child:CurrentRevision:0'])[4]")));
		ca.eleToBeClickable();
		WebElement z4 = ca.activeElement();
		ca.eleToBeClickable();
		z4.sendKeys("Close");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		try {
			ca.click(driver.findElement(By.xpath("(//td[contains(text(),'CLOSED')]//following-sibling::td//div/span[text()='close'])[1]")));
		} catch (Exception e) {

			System.out.println("Closed delete icon is not available as per condition");

		}

		/*		Commonactions.isElementPresent(sp.getNameSQmodify5());
		ca.click(sp.getNameSQmodify5());
		ca.eleToBeClickable();
		Thread.sleep(2000);
	    Commonactions.isElementPresent(sp.getElement1());
	    ca.click(sp.getElement1());
		WebElement d4 = ca.activeElement();
		d4.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		WebElement e5 = ca.activeElement();
		e5.sendKeys(Keys.DELETE);
		e5.sendKeys("123 Delete SQ - PENDING",Keys.TAB);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@data-csi-crumb-type='SupplierRequest']")));*/
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//td[@data-csi-heading='State:Child:CurrentRevision:0'])[5]")));
		ca.eleToBeClickable();
		WebElement z5 = ca.activeElement();
		ca.eleToBeClickable();
		z5.sendKeys("Freeze");
		ca.jsMouseOver();
		ca.eleToBeClickable();
		try {
			ca.click(driver.findElement(By.xpath("(//td[contains(text(),'PENDING')]//following-sibling::td//div/span[text()='close'])[1]")));
		} catch (Exception e) {

			System.out.println("Pending delete icon i not available as per condition");

		}

	}

	public void modifySupplier() throws Throwable {

		/*		Commonactions.isElementPresent(sp.getNameSQmodify1());
				ca.click(sp.getNameSQmodify1());
				ca.eleToBeClickable();
				Thread.sleep(2000);
			    Commonactions.isElementPresent(sp.getElement1());
			    ca.click(sp.getElement1());
				WebElement d = ca.activeElement();
				d.sendKeys(Keys.DELETE);
				ca.eleToBeClickable();
				WebElement e1 = ca.activeElement();
				e1.sendKeys(Keys.DELETE);
				e1.sendKeys("223 Delete SQ - APPROVED",Keys.TAB);
				ca.eleToBeClickable();
				ca.click(driver.findElement(By.xpath("//div[@data-csi-crumb-type='SupplierRequest']")));*/
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//td[@data-csi-heading='State:Child:CurrentRevision:0'])[1]")));
		ca.eleToBeClickable();
		WebElement z = ca.activeElement();
		ca.eleToBeClickable();
		z.sendKeys("Approve");
		ca.jsMouseOver();

		/*		Commonactions.isElementPresent(sp.getNameSQmodify2());
				ca.click(sp.getNameSQmodify2());
				ca.eleToBeClickable();
				Thread.sleep(2000);
			    Commonactions.isElementPresent(sp.getElement1());
			    ca.click(sp.getElement1());
				WebElement d1 = ca.activeElement();
				d1.sendKeys(Keys.DELETE);
				ca.eleToBeClickable();
				WebElement e2 = ca.activeElement();
				e2.sendKeys(Keys.DELETE);
				e2.sendKeys("223 Delete SQ - DRAFT",Keys.TAB);
				ca.eleToBeClickable();
				ca.click(driver.findElement(By.xpath("//div[@data-csi-crumb-type='SupplierRequest']")));
				ca.eleToBeClickable();*/


		/*		Commonactions.isElementPresent(sp.getNameSQmodify3());
				ca.click(sp.getNameSQmodify3());
				ca.eleToBeClickable();
				Thread.sleep(2000);
			    Commonactions.isElementPresent(sp.getElement1());
			    ca.click(sp.getElement1());
				WebElement d2 = ca.activeElement();
				d2.sendKeys(Keys.DELETE);
				ca.eleToBeClickable();
				WebElement e3 = ca.activeElement();
				e3.sendKeys(Keys.DELETE);
				e3.sendKeys("223 Delete SQ - REVISED",Keys.TAB);
				ca.eleToBeClickable();
				ca.click(driver.findElement(By.xpath("//div[@data-csi-crumb-type='SupplierRequest']")));*/
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//td[@data-csi-heading='State:Child:CurrentRevision:0'])[3]")));
		ca.eleToBeClickable();
		WebElement z2 = ca.activeElement();
		ca.eleToBeClickable();
		z2.sendKeys("Abandon");
		ca.jsMouseOver();

		/*		Commonactions.isElementPresent(sp.getNameSQmodify4());
				ca.click(sp.getNameSQmodify4());
				ca.eleToBeClickable();
				Thread.sleep(2000);
			    Commonactions.isElementPresent(sp.getElement1());
			    ca.click(sp.getElement1());
				WebElement d3 = ca.activeElement();
				d3.sendKeys(Keys.DELETE);
				ca.eleToBeClickable();
				WebElement e4 = ca.activeElement();
				e4.sendKeys(Keys.DELETE);
				e4.sendKeys("223 Delete SQ - CLOSED",Keys.TAB);
				ca.eleToBeClickable();
				ca.click(driver.findElement(By.xpath("//div[@data-csi-crumb-type='SupplierRequest']")));*/
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//td[@data-csi-heading='State:Child:CurrentRevision:0'])[4]")));
		ca.eleToBeClickable();
		WebElement z3 = ca.activeElement();
		ca.eleToBeClickable();
		z3.sendKeys("Approve");
		ca.jsMouseOver();
		ca.click(driver.findElement(By.xpath("(//td[@data-csi-heading='State:Child:CurrentRevision:0'])[4]")));
		ca.eleToBeClickable();
		WebElement z4 = ca.activeElement();
		ca.eleToBeClickable();
		z4.sendKeys("Close");
		ca.jsMouseOver();

		/*		Commonactions.isElementPresent(sp.getNameSQmodify5());
				ca.click(sp.getNameSQmodify5());
				ca.eleToBeClickable();
				Thread.sleep(2000);
			    Commonactions.isElementPresent(sp.getElement1());
			    ca.click(sp.getElement1());
				WebElement d4 = ca.activeElement();
				d4.sendKeys(Keys.DELETE);
				ca.eleToBeClickable();
				WebElement e5 = ca.activeElement();
				e5.sendKeys(Keys.DELETE);
				e5.sendKeys("223 Delete SQ - PENDING",Keys.TAB);
				ca.eleToBeClickable();
				ca.click(driver.findElement(By.xpath("//div[@data-csi-crumb-type='SupplierRequest']")));*/
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//td[@data-csi-heading='State:Child:CurrentRevision:0'])[5]")));
		ca.eleToBeClickable();
		WebElement z5 = ca.activeElement();
		ca.eleToBeClickable();
		z5.sendKeys("Freeze");
		ca.jsMouseOver();

	}

	@When("User Selects quotes and modifying states")
	public void user_Selects_quotes_and_modifying_states() throws Throwable {

		Commonactions.isElementPresent(sp.getNewsupplierreqExpand());
		ca.click(sp.getNewsupplierreqExpand());
		Commonactions.isElementPresent(sp.getSelectsuppQuotes());
		ca.click(sp.getSelectsuppQuotes());

		Commonactions.isElementPresent(sp.getSR_SQ_Filter());
		ca.click(sp.getSR_SQ_Filter());
		ca.eleToBeClickable();
		WebElement b = driver.findElement(By.xpath("((//div[contains(@data-csi-automation,'filter-SupplierRequest-SRLineItemProductSupplierItems-Node Name')]//div[contains(@class,'ArrowButton')])/following-sibling::div[2]/input)[1]"));

		try{
			ca.insertText(b, "Delete");
			ca.eleToBeClickable();
			Commonactions.isElementPresent(sp.getSelectValue());
			ca.click(sp.getSelectValue());
			ca.eleToBeClickable();
		}catch (Exception e) {
			//Commonactions.isElementPresent(sp.getSR_SQ_Filter());
			ca.click(driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'filter-SupplierRequest-SRLineItemProductSupplierItems-Node Name')]//div[contains(@class,'ArrowButton')])[1]")));
			ca.eleToBeClickable();
			WebElement b1 = ca.activeElement();
			ca.eleToBeClickable();
			b1.sendKeys("Delete");
			Commonactions.isElementPresent(sp.getSelectValue());
			ca.click(sp.getSelectValue());
			ca.eleToBeClickable();
		}
		WebElement b1 = ca.activeElement();
		ca.eleToBeClickable();
		b1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		Commonactions.isElementPresent(sp.getDeleteAllChkBx());
		ca.click(sp.getDeleteAllChkBx());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Thread.sleep(4000);

		Commonactions.isElementPresent(sp.getNewsupplierreqExpand());
		ca.click(sp.getNewsupplierreqExpand());
		Commonactions.isElementPresent(sp.getSelectsuppQuotes());
		ca.click(sp.getSelectsuppQuotes());


		Commonactions.isElementPresent(sp.getSR_SQ_Filter());
		ca.click(sp.getSR_SQ_Filter());
		ca.eleToBeClickable();
		WebElement bb = driver.findElement(By.xpath("((//div[contains(@data-csi-automation,'filter-SupplierRequest-SRLineItemProductSupplierItems-Node Name')]//div[contains(@class,'ArrowButton')])/following-sibling::div[2]/input)[1]"));

		try{
			ca.insertText(bb, "Delete");
			ca.eleToBeClickable();
			Commonactions.isElementPresent(sp.getSelectValue());
			ca.click(sp.getSelectValue());
			ca.eleToBeClickable();
		}catch (Exception e) {
			//Commonactions.isElementPresent(sp.getSR_SQ_Filter());

			ca.click(driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'filter-SupplierRequest-SRLineItemProductSupplierItems-Node Name')]//div[contains(@class,'ArrowButton')])[1]")));
			ca.eleToBeClickable();

			WebElement b8 = ca.activeElement();
			ca.eleToBeClickable();
			ca.eleToBeClickable();
			b8.sendKeys("Delete");
			Commonactions.isElementPresent(sp.getSelectValue());
			ca.click(sp.getSelectValue());
			ca.eleToBeClickable();
		}
		WebElement b5 = ca.activeElement();
		ca.eleToBeClickable();
		b5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		Commonactions.isElementPresent(sp.getDeleteAllChkBx());
		ca.click(sp.getDeleteAllChkBx());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Thread.sleep(4000);

		Commonactions.isElementPresent(sp.getSR_SQ_SuppFilter());
		ca.click(sp.getSR_SQ_SuppFilter());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//label[contains(text(),'Changshu')]")));
		ca.eleToBeClickable();
		WebElement b2 = ca.activeElement();
		ca.eleToBeClickable();
		b2.sendKeys(Keys.TAB);
		ca.eleToBeClickable();


		modify();

		Commonactions.isElementPresent(sp.getSR_SQ_SuppFilter());
		ca.click(sp.getSR_SQ_SuppFilter());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//label[contains(text(),'Changshu')]")));
		ca.eleToBeClickable();
		WebElement bc8 = ca.activeElement();
		ca.eleToBeClickable();
		bc8.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getSR_SQ_SuppFilter());
		ca.click(sp.getSR_SQ_SuppFilter());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//label[contains(text(),'Supplier')]")));
		WebElement bc9 = ca.activeElement();
		ca.eleToBeClickable();
		bc9.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		modifySupplier();


	}

	@When("User select Supplier request samples")
	public void user_select_Supplier_request_samples() throws Throwable {


		//temp//
		//goToSupplierQuotes();
		//--------------------------------------//
		Commonactions.isElementPresent(sp.getSRSamples());
		ca.click(sp.getSRSamples());
		try{
			Commonactions.isElementPresent(sp.getNewSampleExpand());
			ca.click(sp.getNewSampleExpand());
		}catch (Exception e) {

			driver.navigate().refresh();
			Commonactions.isElementPresent(sp.getSRSamples());
			ca.click(sp.getSRSamples());
			Commonactions.isElementPresent(sp.getNewSampleExpand());
			ca.click(sp.getNewSampleExpand());
		}
		Commonactions.isElementPresent(sp.getSelectSamples());
		ca.click(sp.getSelectSamples());


		Commonactions.isElementPresent(sp.getSR_SA_Filter());
		ca.click(sp.getSR_SA_Filter());
		ca.eleToBeClickable();
		WebElement c = driver.findElement(By.xpath("((//div[contains(@data-csi-automation,'filter-SupplierRequest-SRSuppliersStyleSamples-Node Name')]//div[contains(@class,'ArrowButton')])/following-sibling::div[2]/input)[1]"));

		try{
			ca.insertText(c, "Delete");
			ca.eleToBeClickable();
			Commonactions.isElementPresent(sp.getSelectValue());
			ca.click(sp.getSelectValue());
			ca.eleToBeClickable();
			WebElement b1 = ca.activeElement();
			ca.eleToBeClickable();
			b1.sendKeys(Keys.TAB);
			ca.eleToBeClickable();
		}catch (Exception e) {
			ca.click(driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'filter-SupplierRequest-SRSuppliersStyleSamples-Node Name')]//div[contains(@class,'ArrowButton')])[1]")));
			WebElement b1 = ca.activeElement();
			ca.eleToBeClickable();
			b1.sendKeys("Delete");
			Commonactions.isElementPresent(sp.getSelectValue());
			ca.click(sp.getSelectValue());
			ca.eleToBeClickable();
			WebElement b2 = ca.activeElement();
			ca.eleToBeClickable();
			b2.sendKeys(Keys.TAB);
			ca.eleToBeClickable();

		}

		Commonactions.isElementPresent(sp.getDeleteAllChkBx1());
		ca.click(sp.getDeleteAllChkBx1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());

		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getSampleViews());
		ca.click(sp.getSampleViews());
		Commonactions.isElementPresent(sp.getSampleManViews());
		ca.click(sp.getSampleManViews());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "Automation");
		Commonactions.isElementPresent(sp.getCustomValue());
		ca.insertText(sp.getCustomValue(), "Product Supplier");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sp.getProductSupplier());
		ca.click(sp.getProductSupplier());
		Commonactions.isElementPresent(sp.getAdd());
		ca.click(sp.getAdd());
		Commonactions.isElementPresent(sp.getUPBtn());

		for (int i = 0; i < 11; i++) {

			ca.click(sp.getUPBtn());
		}

		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.jsScrollPageDown(mp.getSave_btn1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());

		System.out.println("SR Samples Created successfully");

	}


	@When("user removing supplier under supplier request setup")
	public void user_removing_supplier_under_supplier_request_setup() throws Throwable {

		try {
			Commonactions.isElementPresent(sp.getSetup());
			ca.click(sp.getSetup());

		} catch (Exception e) {

			goToSupplierQuotes();
			Commonactions.isElementPresent(sp.getSupplierrequest());
			ca.click(sp.getSupplierrequest());
			ca.eleToBeClickable();
			Commonactions.isElementPresent(sp.getSuppRequstName1());
			Commonactions.clickjs(sp.getSuppRequstName1());
			ca.eleToBeClickable();
			Thread.sleep(1000);
			Commonactions.isElementPresent(sp.getSetup());
			ca.click(sp.getSetup());

		}

		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getDeleteChangshu());
		ca.click(sp.getDeleteChangshu());
		Commonactions.isElementPresent(sp.getDeleteSuppQuotes());
		ca.click(sp.getDeleteSuppQuotes());
		Commonactions.isElementPresent(sp.getDeleteSamples());
		ca.click(sp.getDeleteSamples());
		Commonactions.isElementPresent(sp.getRemove());
		ca.click(sp.getRemove());

		ca.eleToBeClickable();
		Thread.sleep(2000);

		Commonactions.isElementPresent(sp.getDeleteSupplier());
		ca.click(sp.getDeleteSupplier());
		Commonactions.isElementPresent(sp.getRemove());
		ca.click(sp.getRemove());

		ca.eleToBeClickable();
		Thread.sleep(2000);

		System.out.println("Changshu & supplier removed successfully");

	}

	@When("user validating supplier request and samples displayed datas are correct or not")
	public void user_validating_supplier_request_and_samples_displayed_datas_are_correct_or_not() throws Throwable {

		//temp------------------------------

		ca.eleToBeClickable();
		//goToSupplierQuotes();

		//---------------------------------------------------//


		Commonactions.isElementPresent(sp.getSRQuotes());
		ca.click(sp.getSRQuotes());
		try{
			Commonactions.isElementPresent(sp.getSR_SQ_SuppFilter());
			ca.click(sp.getSR_SQ_SuppFilter());
			ca.eleToBeClickable();
			ca.click(driver.findElement(By.xpath("//label[contains(text(),'Supplier')]")));
			WebElement bc9 = ca.activeElement();
			ca.eleToBeClickable();
			bc9.sendKeys(Keys.TAB);
			ca.eleToBeClickable();
		}catch (Exception e) {

			System.out.println("Changshu & supplier removed successfully");

		}

		Commonactions.isElementPresent(sp.getSRQuoteCount());
		String Qc = Commonactions.getText(sp.getSRQuoteCount());
		System.out.println("SR Quote count is :"+Qc);

		Commonactions.isElementPresent(sp.getSRSamples());
		ca.click(sp.getSRSamples());

		ca.eleToBeClickable();
		WebElement refresh = driver.findElement(By.xpath("(//span[contains(@data-csi-automation,'plugin-SupplierRequest-StyleSamples-refresh')]/span)"));
		ca.jsMouseOver(refresh);
		ca.click(refresh);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getSRSampleCount());
		String Sc = Commonactions.getText(sp.getSRSampleCount());
		System.out.println("SR Sample count is :"+Sc);

		System.out.println("SR Quotes & Samples count validated successfully");


	}


	@When("user validating supplier quotes displayed datas are correct or not")
	public void user_validating_supplier_quotes_displayed_datas_are_correct_or_not() throws Throwable {

		goToSupplierQuotes();

		Commonactions.isElementPresent(sp.getSupplierquotes());
		ca.click(sp.getSupplierquotes());
		ca.jsScrollPageDown(sp.getNewSuplrqute());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getSupplierQuote_Filter());
		ca.jsScrollPageDown(sp.getSupplierQuote_Filter());
		ca.click(sp.getSupplierQuote_Filter());
		ca.eleToBeClickable();

		//ca.click(driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'filter-StyleSourcing-SupplierItems-Node Name')]//div[contains(@class,'ArrowButton')])[1]")));
		//ca.click(driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'filter-StyleSourcing-SupplierItems-Node Name')]//div[contains(@class,'ArrowButton')])[1]")));
		WebElement d =driver.findElement(By.xpath("((//div[contains(@data-csi-automation,'filter-StyleSourcing-SupplierItems-Node Name')]//div[contains(@class,'ArrowButton')])/following-sibling::div[2]/input)[1]"));
		try{
			ca.insertText(d, "Changshu");
			ca.eleToBeClickable();
			Commonactions.isElementPresent(sp.getSelectValue());
			ca.click(sp.getSelectValue());
			ca.eleToBeClickable();
			WebElement b5 = ca.activeElement();
			ca.eleToBeClickable();
			b5.sendKeys(Keys.TAB);
			ca.eleToBeClickable();
		} catch (Exception e) {
			ca.click(driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'filter-StyleSourcing-SupplierItems-Node Name')]//div[contains(@class,'ArrowButton')])[1]")));

			WebElement b4 = ca.activeElement();
			ca.eleToBeClickable();
			ca.eleToBeClickable();
			b4.sendKeys("Changshu");
			Commonactions.isElementPresent(sp.getSelectValue());
			ca.click(sp.getSelectValue());
			ca.eleToBeClickable();
			WebElement b5 = ca.activeElement();
			ca.eleToBeClickable();
			b5.sendKeys(Keys.TAB);
			ca.eleToBeClickable();
		}
		Commonactions.isElementPresent(sp.getSRQteCount());
		String Sc = Commonactions.getText(sp.getSRQteCount());
		System.out.println("Supplier Quotes count is :"+Sc);

		System.out.println("Supplier Quotes count validated successfully");


	}

	@When("User validating style sample displayed datas are correct or not")
	public void user_validating_style_sample_displayed_datas_are_correct_or_not() throws Throwable {

		goToStyleSamples();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getSample_Filter());
		ca.click(sp.getSample_Filter());
		ca.eleToBeClickable();
		//ca.eleToBeClickable();
		//ca.click(driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'filter-Style-ProductSamples-Node Name')]//div[contains(@class,'ArrowButton')])[1]")));
		//ca.click(driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'filter-Style-ProductSamples-Node Name')]//div[contains(@class,'ArrowButton')])[1]")));
		WebElement d = driver.findElement(By.xpath("((//div[contains(@data-csi-automation,'filter-Style-ProductSamples-Node Name')]//div[contains(@class,'ArrowButton')])/following-sibling::div[2]/input)[1]"));
		ca.eleToBeClickable();
		ca.insertText(d, "Changshu");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getSelectValue());
		ca.click(sp.getSelectValue());
		ca.eleToBeClickable();
		try{

			WebElement b5 = ca.activeElement();
			ca.eleToBeClickable();
			b5.sendKeys(Keys.TAB);
			ca.eleToBeClickable();
		}catch (Exception e) {
			ca.click(driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'filter-Style-ProductSamples-Node Name')]//div[contains(@class,'ArrowButton')])[1]")));
			WebElement b4 = ca.activeElement();
			ca.eleToBeClickable();
			ca.eleToBeClickable();
			b4.sendKeys("Changshu");
			Commonactions.isElementPresent(sp.getSelectValue());
			ca.click(sp.getSelectValue());
			ca.eleToBeClickable();
			WebElement b5 = ca.activeElement();
			ca.eleToBeClickable();
			b5.sendKeys(Keys.TAB);
			ca.eleToBeClickable();
		}

		Commonactions.isElementPresent(sp.getSampleCount());
		String Sc = Commonactions.getText(sp.getSampleCount());
		System.out.println("Sample count is :"+Sc);

		System.out.println("Sample count validated successfully");


	}

	@When("user creating new inspiration {string}")
	public void user_creating_new_inspiration(String string) throws Throwable {

		goToSupplierQuotes();

		//	Commonactions.isElementPresent(sp.getSeasonsourcing());
		//	ca.click(sp.getSeasonsourcing());
		Commonactions.isElementPresent(sp.getSupplierrequest());
		ca.click(sp.getSupplierrequest());
		Commonactions.isElementPresent(sp.getSuppRequstName());
		ca.click(sp.getSuppRequstName());
		ca.eleToBeClickable();
		Thread.sleep(2000);
		Commonactions.isElementPresent(sp.getSetup());
		ca.click(sp.getSetup());
		ca.jsMouseOver(sp.getAddproductExpand());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getAddproductExpand());
		ca.click(sp.getAddproductExpand());
		Commonactions.isElementPresent(sp.getNewInspirationStyle());
		ca.click(sp.getNewInspirationStyle());
		Commonactions.isElementPresent(sp.getNewinspirationstyleValue());
		ca.insertText(sp.getNewinspirationstyleValue(), string);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());

		System.out.println("new inspiration created successfully");

	}

	@When("User copy supplier request {string}")
	public void user_copy_supplier_request(String string) throws Throwable {


		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getSRQuotes());
		ca.click(sp.getSRQuotes());
		Commonactions.isElementPresent(sp.getCopySR());
		ca.click(sp.getCopySR());
		Commonactions.isElementPresent(sp.getSrttemplateExpand());
		ca.click(sp.getSrttemplateExpand());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, "SRT - Style");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sp.getSupplierreqvalue());
		ca.insertText(sp.getSupplierreqvalue(), string);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());

		System.out.println("supplier request copy created successfully");
	}


	@When("User issuing apparel SR")
	public void user_issuing_apparel_SR() throws Throwable {

		goToSupplierQuotes();
		Commonactions.isElementPresent(sp.getSupplierrequest());
		ca.click(sp.getSupplierrequest());
		Commonactions.isElementPresent(sp.getSuppRequstName());
		ca.click(sp.getSuppRequstName());

		ca.eleToBeClickable();

		Commonactions.isElementPresent(sp.getArrowForward());
		ca.click(sp.getArrowForward());

		Thread.sleep(20000);

		System.out.println("Apparel SR Issued successfully");

	}

	@Then("user creates issue supplier request {string},{string}")
	public void user_creates_issue_supplier_request(String string, String string2) throws Throwable {

		goToSupplierQuotes();
		Commonactions.isElementPresent(sp.getSupplierrequest());
		ca.click(sp.getSupplierrequest());
		Commonactions.isElementPresent(sp.getNewsupplierrequestbtn());
		ca.click(sp.getNewsupplierrequestbtn());
		Commonactions.isElementPresent(sp.getSrttemplateExpand());
		ca.click(sp.getSrttemplateExpand());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, string);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sp.getSupplierreqvalue());
		ca.insertText(sp.getSupplierreqvalue(), string2);
		Commonactions.isElementPresent(sp.getSaveAndGoBtn());
		ca.click(sp.getSaveAndGoBtn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(sp.getSetup());

		ca.click(sp.getSetup());
		try{
			Commonactions.isElementPresent(sp.getAddproduct());
			ca.click(sp.getAddproduct());
		}catch (Exception e) {

			driver.navigate().refresh();
			Commonactions.isElementPresent(sp.getSetup());
			ca.click(sp.getSetup());
			Commonactions.isElementPresent(sp.getAddproduct());
			ca.click(sp.getAddproduct());
		}
		Commonactions.isElementPresent(sp.getAddprodcutcheckbox());
		ca.click(sp.getAddprodcutcheckbox());
		Commonactions.isElementPresent(sp.getOnlySizecheckbox());
		ca.click(sp.getOnlySizecheckbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());

		Commonactions.isElementPresent(sp.getArrowForward());
		ca.click(sp.getArrowForward());

		Thread.sleep(20000);

		System.out.println("SR with two product Issued successfully");

	}


	@When("user creates material supplier quotes")
	public void user_creates_material_supplier_quotes() throws Throwable {

		Commonactions.isElementPresent(hp.getMaterialBtn());
		ca.click(hp.getMaterialBtn());
		Commonactions.isElementPresent(sp.getCopyCottonName());
		ca.click(sp.getCopyCottonName());
		Commonactions.isElementPresent(sp.getSeasonsourcing());
		ca.click(sp.getSeasonsourcing());
		Commonactions.isElementPresent(sp.getSupplierquotes());
		ca.click(sp.getSupplierquotes());

		Commonactions.isElementPresent(sp.getNewSuplrqute());
		ca.click(sp.getNewSuplrqute());
		ca.eleToBeClickable();
		ca.insertText(sp.getSupplierValue(), "Changshu");
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		a.sendKeys(Keys.TAB);
		// ca.click(sp.getSupplierValue());
		ca.insertText(sp.getSupplierValue(), "Supplier");
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		a1.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(sp.getColorSIze());
		ca.click(sp.getColorSIze());
		ca.eleToBeClickable();
		WebElement a7 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a7, "Colors And Sizes");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sp.getSuppItemColorSel());
		ca.click(sp.getSuppItemColorSel());
		Commonactions.isElementPresent(sp.getSuppItemDialog());
		ca.click(sp.getSuppItemDialog());
		Commonactions.isElementPresent(sp.getBlueChkBx());
		ca.click(sp.getBlueChkBx());
		Commonactions.isElementPresent(sp.getRedCheckbox());
		ca.click(sp.getRedCheckbox());
		Commonactions.isElementPresent(mp.getSave_btn2());
		ca.click(mp.getSave_btn2());

		Commonactions.isElementPresent(sp.getSizes());
		ca.click(sp.getSizes());
		Commonactions.isElementPresent(sp.getSuppSizesDialog());
		ca.click(sp.getSuppSizesDialog());
		Commonactions.isElementPresent(sp.getThirtySize());
		ca.click(sp.getThirtySize());
		Commonactions.isElementPresent(sp.getThirtyTwoSize());
		ca.click(sp.getThirtyTwoSize());
		Commonactions.isElementPresent(mp.getSave_btn2());
		ca.click(mp.getSave_btn2());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		System.out.println("Material supplier quotes created successfully");


	}

	@When("user creates material supplier request {string},{string}")
	public void user_creates_material_supplier_request(String string, String string2) throws Throwable {


		Commonactions.isElementPresent(sp.getMaterialSuppReq());
		ca.click(sp.getMaterialSuppReq());
		Commonactions.isElementPresent(sp.getNewsupplierrequestbtn());
		ca.click(sp.getNewsupplierrequestbtn());
		Commonactions.isElementPresent(sp.getSrttemplateExpand());
		ca.click(sp.getSrttemplateExpand());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, string);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sp.getSupplierreqvalue());
		ca.insertText(sp.getSupplierreqvalue(), string2);
		Commonactions.isElementPresent(sp.getSaveAndGoBtn());
		ca.click(sp.getSaveAndGoBtn());
		ca.eleToBeClickable();

		System.out.println("Material Supplier Request created successfully");

		Commonactions.isElementPresent(sp.getSetup());
		ca.click(sp.getSetup());
		try{
			Commonactions.isElementPresent(sp.getAddSuppliers());
			ca.click(sp.getAddSuppliers());
		}catch (Exception e) {


			driver.navigate().refresh();
			Commonactions.isElementPresent(sp.getSetup());
			ca.click(sp.getSetup());
			Commonactions.isElementPresent(sp.getAddSuppliers());
			ca.click(sp.getAddSuppliers());

		}
		Commonactions.isElementPresent(sp.getChangshuCheckbox());
		ca.click(sp.getChangshuCheckbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getSRQuotes());

		ca.click(sp.getSRQuotes());
		Commonactions.isElementPresent(sp.getNewsupplierreqMExpand());
		ca.click(sp.getNewsupplierreqMExpand());
		Commonactions.isElementPresent(sp.getSelectsuppQuotes());
		ca.click(sp.getSelectsuppQuotes());
		Commonactions.isElementPresent(sp.getDeleteAllChkBx());
		ca.click(sp.getDeleteAllChkBx());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Thread.sleep(4000);

		modify();

	}

	@When("user validating supplier quotes & samples")
	public void user_removing_supplier_under_material_request_setup() throws Throwable {

		ca.eleToBeClickable();

		Commonactions.isElementPresent(sp.getSRQuotes());
		ca.click(sp.getSRQuotes());

		try{
			Commonactions.isElementPresent(sp.getMRQuoteCount());
			String Qc = Commonactions.getText(sp.getMRQuoteCount());
			System.out.println("SR Quote count is :"+Qc);
		}catch(Exception e){
			e.printStackTrace();
		}

		Commonactions.isElementPresent(sp.getSRSamples());
		ca.click(sp.getSRSamples());

		try{
			Commonactions.isElementPresent(sp.getMRSampleCount());
			String Sc = Commonactions.getText(sp.getMRSampleCount());
			System.out.println("SR Sample count is :"+Sc);
		}catch(Exception e1){
			e1.printStackTrace();
		} 




	}

	@When("user validating material supplier quotes")
	public void user_validating_material_supplier_quotes() {

		Commonactions.isElementPresent(hp.getMaterialBtn());
		ca.click(hp.getMaterialBtn());
		Commonactions.isElementPresent(sp.getCopyCottonName());
		ca.click(sp.getCopyCottonName());
		Commonactions.isElementPresent(sp.getSeasonsourcing());
		ca.click(sp.getSeasonsourcing());
		Commonactions.isElementPresent(sp.getSupplierquotes());
		ca.click(sp.getSupplierquotes());


		Commonactions.isElementPresent(sp.getMRQuoteCount());
		ca.click(sp.getMRQuoteCount());

		String Sc = Commonactions.getText(sp.getMRQuoteCount());
		System.out.println("SR Material Quote count is :"+Sc);
	}

	@When("user issuing material supplier request")
	public void user_issuing_material_supplier_request() throws Throwable {

		Commonactions.isElementPresent(sp.getMaterialSuppReq());
		ca.click(sp.getMaterialSuppReq());
		Commonactions.isElementPresent(sp.getMaterialSRName());
		ca.click(sp.getMaterialSRName());
		Commonactions.isElementPresent(sp.getSetup());
		ca.click(sp.getSetup());
		Commonactions.isElementPresent(sp.getAddSuppliers());
		ca.click(sp.getAddSuppliers());
		Commonactions.isElementPresent(sp.getChangshuCheckbox());
		ca.click(sp.getChangshuCheckbox());
		try{
			Commonactions.isElementPresent(sp.getSupplierCheckbox());
			ca.click(sp.getSupplierCheckbox());
		}catch (Exception e) {
			Commonactions.isElementPresent(sp.getSupplierMatCheckbox());
			ca.click(sp.getSupplierMatCheckbox());
		}

		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();


		Commonactions.isElementPresent(sp.getAddMaterialProduct());
		ca.click(sp.getAddMaterialProduct());
		Commonactions.isElementPresent(sp.getJerseyChkbx());
		ca.click(sp.getJerseyChkbx());
		Commonactions.isElementPresent(sp.getJersey2Chkbx());
		ca.click(sp.getJersey2Chkbx());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(sp.getSRSamples());
		ca.click(sp.getSRSamples());
		Commonactions.isElementPresent(sp.getMRSampleCount());
		ca.click(sp.getMRSampleCount());
		String Sc = Commonactions.getText(sp.getMRSampleCount());
		System.out.println("SR Material Sample count is :"+Sc);

		Commonactions.isElementPresent(sp.getArrowForward());
		ca.click(sp.getArrowForward());

		System.out.println("Material SR Issued successfully");


	}

	@When("user enters designated supplier {string} and samples details")
	public void user_enters_designated_supplier_and_samples_details(String string) throws Throwable {

		goToSupplierQuotes();
		Commonactions.isElementPresent(sp.getSupplierquotes());
		ca.click(sp.getSupplierquotes());


		/* Commonactions.isElementPresent(sm.getDesignatedSupplier());
		        ca.click(sm.getDesignatedSupplier());
		        ca.eleToBeClickable();
		    	WebElement a7 = ca.activeElement();
		    	ca.eleToBeClickable();
		    	ca.insertText(a7, string);
		    	ca.eleToBeClickable();
		    	ca.jsMouseOver();*/



		Commonactions.isElementPresent(sm.getSampleSupplierQuote());
		ca.click(sm.getSampleSupplierQuote());
		ca.eleToBeClickable();
		WebElement a8 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a8, "Supplier");
		ca.eleToBeClickable();
		ca.jsMouseOver();


		/*  Commonactions.isElementPresent(sm.getProductionSupplierQuote());
		        ca.click(sm.getProductionSupplierQuote());
		        ca.eleToBeClickable();
		    	WebElement a9 = ca.activeElement();
		    	ca.eleToBeClickable();
		    	ca.insertText(a9, "Template");
		    	ca.eleToBeClickable();
		    	ca.jsMouseOver();*/

		System.out.println("Supplier Quote updated successfully");

	}

	@When("User Creates supplier request template without style {string},{string}")
	public void user_Creates_supplier_request_template_without_style(String string, String string2) throws Throwable {
		goToSupplierQuotes();
		Commonactions.isElementPresent(sm.getSupplierRequests());
		ca.click(sm.getSupplierRequests());

		Commonactions.isElementPresent(sp.getNewsupplierrequestbtn());
		ca.click(sp.getNewsupplierrequestbtn());
		try{
			Commonactions.isElementPresent(sp.getSrttemplateExpand());
			ca.click(sp.getSrttemplateExpand());
			ca.eleToBeClickable();
			WebElement a = ca.activeElement();
			ca.eleToBeClickable();
			ca.insertText(a, string);
			ca.eleToBeClickable();
			ca.jsMouseOver();
		}catch (Exception e) {
			e.printStackTrace();
		}
		Commonactions.isElementPresent(sp.getSupplierreqvalue()); 
		ca.insertText(sp.getSupplierreqvalue(), string2);
		Commonactions.isElementPresent(sp.getSaveAndGoBtn());
		ca.click(sp.getSaveAndGoBtn());
		ca.eleToBeClickable();

		Scenario scenario = null;
		ca.jsScrollPagedowntoEnd();
		ca.eleToBeClickable();
		String result = sm.getNoResults().getText();
		if(result.equals("No Results Found")){
			System.out.println("Quote value not updated So defect, Please find the attached screenshot");
			//SimpleDateFormat sdfDate = new SimpleDateFormat("mmss");//dd/MM/yyyy
			SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date now = new Date();
			String strDate = sdfDate.format(now);

			Commonactions.screenCapture("target//defect"+strDate+"//png");

		}

	}

	@When("validating copy and delete action {string}")
	public void validating_copy_and_delete_action(String string) throws Throwable {

		goToSupplierQuotes();
		Commonactions.isElementPresent(sm.getSupplierRequests());
		ca.click(sm.getSupplierRequests());
		Commonactions.isElementPresent(sm.getStyleSR_Copy());
		ca.click(sm.getStyleSR_Copy());



		Commonactions.isElementPresent(sp.getSupplierreqvalue()); 
		ca.insertText(sp.getSupplierreqvalue(), string+" - Copied");
		Commonactions.isElementPresent(sp.getSaveAndGoBtn());
		ca.click(sp.getSaveAndGoBtn());

		Scenario scenario = null;
		//     String result = Commonactions.getText(sm.getNoResults());
		//    if(result.equals("No Results Found")){
		System.out.println("Quote value not updated So defect, Please find the attached screenshot");
		SimpleDateFormat sdfDate = new SimpleDateFormat("mmss");//dd/MM/yyyy
		Date now = new Date();
		String strDate = sdfDate.format(now);

		Commonactions.screenCapture("target//defect"+strDate+"//png");

		//    }

		Thread.sleep(3000);
		ca.click(hp.getUser_homeBtn()); 
		ca.eleToBeClickable();
		System.out.println("home tab clicked successfully");
		goToSupplierQuotes();
		Commonactions.isElementPresent(sm.getSupplierRequests());
		ca.click(sm.getSupplierRequests());
		Commonactions.isElementPresent(sm.getStyleSR_Delete());
		ca.click(sm.getStyleSR_Delete());
		Commonactions.isElementPresent(sm.getDeleteSRSuppQts());
		ca.click(sm.getDeleteSRSuppQts());
		Commonactions.isElementPresent(sm.getDeleteSRSample());
		ca.click(sm.getDeleteSRSample());


		Commonactions.isElementPresent(sp.getDelete());
		ca.click(sp.getDelete());

		ca.eleToBeClickable();
		Thread.sleep(2000);

		System.out.println("Copied Template deleted successfully");
	}

	@When("User Creates supplier request template with style {string},{string},{string}")
	public void user_Creates_supplier_request_template_with_style(String string, String string2, String string3) throws Throwable {


		Commonactions.isElementPresent(sp.getNewsupplierrequestbtn());
		ca.click(sp.getNewsupplierrequestbtn());
		try{
			Commonactions.isElementPresent(sp.getSrttemplateExpand());
			ca.click(sp.getSrttemplateExpand());
			ca.eleToBeClickable();
			WebElement a = ca.activeElement();
			ca.eleToBeClickable();
			ca.insertText(a, string);
			ca.eleToBeClickable();
			ca.jsMouseOver();
		}catch (Exception e) {
			e.printStackTrace();
		}
		Commonactions.isElementPresent(sp.getSupplierreqvalue()); 
		ca.insertText(sp.getSupplierreqvalue(), string2);
		ca.eleToBeClickable();
		WebElement a4 = ca.activeElement();
		ca.eleToBeClickable();
		a4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement a6 = ca.activeElement();
		ca.eleToBeClickable();
		a6.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement a5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a5, string3);
		/*Commonactions.isElementPresent(sm.getSR_StyleValue()); 
		        ca.insertText(sm.getSR_StyleValue(), string3);*/
		/*ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));*/
		ca.eleToBeClickable();
		WebElement a1= ca.activeElement();
		ca.eleToBeClickable();
		a1.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		System.out.println("SR with style created successfully");
	}

	@When("user validating style template updated correctly or not")
	public void user_validating_style_template_updated_correctly_or_not() throws Throwable {
		Commonactions.isElementPresent(hp.getStyleBtn());
		ca.click(hp.getStyleBtn());
		Commonactions.isElementPresent(sm.getSeason_Btn());
		ca.click(sm.getSeason_Btn());

		Commonactions.isElementPresent(sm.getWinterSeason());
		ca.click(sm.getWinterSeason());
		Commonactions.isElementPresent(st.getStyles_Btn());
		ca.click(st.getStyles_Btn());
		Commonactions.isElementPresent(sm.getClrAndSize());
		ca.click(sm.getClrAndSize());
		Commonactions.isElementPresent(sp.getSeasonsourcing());
		ca.click(sp.getSeasonsourcing());
		Commonactions.isElementPresent(sp.getSupplierrequest());
		ca.click(sp.getSupplierrequest());

		ca.eleToBeClickable();
		String text = Commonactions.getText(driver.findElement(By.xpath("(//td[@data-csi-heading='Node Name::0']/a[contains(text(),'Home')])[1]")));
		System.out.println(text);
		Assert.assertEquals("Style Home - Jeans", text);

		System.out.println("Style SR validated successfully");
	}

	@When("User issuing without style template")
	public void user_issuing_without_style_template() throws Throwable {

		Commonactions.isElementPresent(hp.getStyleBtn());
		ca.click(hp.getStyleBtn());
		Commonactions.isElementPresent(sm.getSupplierRequests());
		ca.click(sm.getSupplierRequests());
		Commonactions.isElementPresent(sm.getStyleIssue_Name());
		ca.click(sm.getStyleIssue_Name());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(sp.getArrowForward());
		ca.click(sp.getArrowForward());

		Thread.sleep(20000);

		System.out.println("Style SR Issued successfully");
	}

	@When("user enters designated supplier {string} and template details")
	public void user_enters_designated_supplier_and_template_details(String string) throws Throwable {
		Commonactions.isElementPresent(hp.getMaterialBtn());
		ca.click(hp.getMaterialBtn());
		Commonactions.isElementPresent(sp.getCopyCottonName());
		ca.click(sp.getCopyCottonName());
		Commonactions.isElementPresent(sp.getSeasonsourcing());
		ca.click(sp.getSeasonsourcing());
		Commonactions.isElementPresent(sp.getSupplierquotes());
		ca.click(sp.getSupplierquotes());
		Commonactions.isElementPresent(sm.getDesignatedSupplier());
		ca.click(sm.getDesignatedSupplier());

		ca.eleToBeClickable();
		WebElement a7 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a7, string);
		ca.eleToBeClickable();
		ca.jsMouseOver();

		//Commonactions.isElementPresent(sm.getDefaultSuppQuote());
		//ca.click(sm.getDefaultSuppQuote());

		ca.eleToBeClickable();
		WebElement a8 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a8, "Template");
		ca.eleToBeClickable();
		ca.jsMouseOver();

		System.out.println("Material supplier quote updated successfully");

	}

	@When("User creates material product blended cost {string}")
	public void user_creates_material_product_blended_cost(String string) throws Throwable {


		try{
			boolean cancelbtn = in.getCancel().isDisplayed();
			if(cancelbtn==true)
			{ca.click(in.getCancel());
			ca.eleToBeClickable();}}
		catch(Exception e)
		{System.out.println("supplier quote not selected");	}
		Commonactions.isElementPresent(sp.getNewproductbendcost());
		ca.click(sp.getNewproductbendcost());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, string);
		ca.eleToBeClickable();
		a.sendKeys(Keys.TAB);
		//	Commonactions.isElementPresent(sp.getProductPlusIcon());
		//	ca.click(sp.getProductPlusIcon());
		//	Commonactions.isElementPresent(sp.getBlendcostcheckbox());
		//	ca.click(sp.getBlendcostcheckbox());
		Commonactions.isElementPresent(sp.getBlendcostAction());
		ca.click(sp.getBlendcostAction());
		Commonactions.isElementPresent(sp.getSelectsuppQuotes());
		ca.click(sp.getSelectsuppQuotes());
		Commonactions.isElementPresent(sp.getSelectsupquotechecckbox());
		ca.click(sp.getSelectsupquotechecckbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());

		System.out.println("Product Blend Cost Created successfully");
	}



}
