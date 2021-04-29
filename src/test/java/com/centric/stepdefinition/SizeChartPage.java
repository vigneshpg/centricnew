package com.centric.stepdefinition;

import com.centric.objectrepository.*;
import com.centric.resources.Commonactions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_old.Ac;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SizeChartPage extends Commonactions {

	Commonactions ca = new Commonactions();
	PopupPage pp = new PopupPage();
	HomePage hp = new HomePage();
	SpecificationPage spec = new SpecificationPage();
	ColorSpecificationPageTK cp = new ColorSpecificationPageTK();
	PopupPage pup = new PopupPage();
	SIzeChartTK sc = new SIzeChartTK();
	MaterialSpecificationPage mp = new MaterialSpecificationPage();
	StyleInspectionPage si = new StyleInspectionPage();
	BOMCreationPage bc = new BOMCreationPage();
	SizeChart sz= new SizeChart();
	UserManagementPage up = new UserManagementPage();
	InspectionPage in = new InspectionPage();
	StyleMaterialSamplepage sm = new StyleMaterialSamplepage();
	SourcingPage so = new SourcingPage();
	StylePage st = new StylePage();




	@When("user navigates to size chart tab")
	public void userNavigatesToSizeChartTab() throws Throwable {
		try {
			ca.eleToBeClickable();
			Commonactions.isElementPresent(hp.getUser_settingsBtn1());
			ca.click(hp.getUser_settingsBtn1()); 

			System.out.println("Setup tab clicked successfully");

			Commonactions.isElementPresent(hp.getData_Spec());
			ca.click(hp.getData_Spec());
			ca.eleToBeClickable();
			Commonactions.isElementPresent(hp.getSetupSearch());
			ca.insertText(hp.getSetupSearch(), "Dimensions");
			ca.eleToBeClickable();
			ca.click(sc.getSizeChartTab());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("create the size charts {string},{string},{string}")
	public void createTheSizeCharts(String string, String desc, String descAlt) throws Throwable {
		String[] sizeChart, sizeDesc, sizeDescAlt;
		ca.eleToBeClickable();
		sizeChart = string.split(",");
		sizeDesc = desc.split(",");
		sizeDescAlt = descAlt.split(",");
		for (int i = 0; i < sizeChart.length; i++) {
			Thread.sleep(3000);
			ca.eleToBeClickable();
			ca.click(sc.getSizeChartActionBtn());
			ca.eleToBeClickable();
			ca.insertText(sc.getSizeChartInputBox(), sizeChart[i].trim());
			ca.eleToBeClickable();
			ca.insertText(sc.getSizeChartDescInputBox(), sizeDesc[i].trim());
			ca.eleToBeClickable();
			ca.click(pp.getSave_Btn());
			Thread.sleep(3000);
			WebElement descAltOptn = driver.findElement(By.xpath("//a[@class='browse' and text()='" + sizeChart[i] + "']//following::td[3][@data-csi-act='DimDescAlt1::0']"));

			try{
				ca.eleToBeClickable();
				//ca.jsScrollPageDown(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));


				for(int j = 1; j <=50; j++ ){
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Size')]//span[text()='+']/parent::div")));
					if(descAltOptn.isDisplayed()){

						ca.click(driver.findElement(By.xpath("//div[contains(@class,'Size')]//span[text()='+']/parent::div")));
						ca.click(driver.findElement(By.xpath("//div[contains(@class,'Size')]//span[text()='+']/parent::div")));

						ca.eleToBeClickable();
						break;
					}
				}
			}catch (Exception exception) {
				// TODO: handle exception
			}

			ca.click(descAltOptn);
			ca.insertText(spec.getRF_InputText(), sizeDescAlt[i].trim());
			ca.eleToBeClickable();
			// ca.click(sc.getSizeChartTab());
		}
	}

	@Then("creates the increment for the size chart {string}")
	public void createsTheIncrementForTheSizeChart(String increment) throws Throwable {

		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getUser_settingsBtn1());
		ca.click(hp.getUser_settingsBtn1()); 

		System.out.println("Setup tab clicked successfully");

		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Increments");
		ca.eleToBeClickable();
		String[] SizeIncrement;
		ca.eleToBeClickable();
		ca.click(sc.getSizeChartIncrementTab());
		jsWaitForPageLoad();
		SizeIncrement = increment.split(",");
		for (int i = 0; i < SizeIncrement.length; i++) {
			ca.eleToBeClickable();
			ca.click(sc.getSizeChartIncrementActionBtn());
			ca.eleToBeClickable();
			ca.insertText(sc.getSizeChartIncrementInputBox(), SizeIncrement[i].trim());
			ca.eleToBeClickable();
			ca.click(pp.getSave_Btn());
		}
	}

	@When("user navigates to sizeRange tab for twoDsize validation {string}")
	public void userNavigatesToSizeRangeTabForTwoDsizeValidation(String string) throws Throwable {
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getUser_settingsBtn1());
		ca.click(hp.getUser_settingsBtn1()); 

		System.out.println("Setup tab clicked successfully");

		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Size Ranges");
		ca.eleToBeClickable();
		ca.click(spec.getSizeRangeTab());
		jsWaitForPageLoad();
		Thread.sleep(6000);
		WebElement statusChecker = driver.findElement(By.xpath("//a[@class='browse' and text()='" + string + "']//following::td[@data-csi-heading='OKforSizeChart::0']//div/input"));

		try{
			ca.eleToBeClickable();
			//ca.jsScrollPageDown(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));


			for(int j = 1; j <=50; j++ ){
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Size')]//span[text()='+']/parent::div")));
				if(statusChecker.isDisplayed()){

					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Size')]//span[text()='+']/parent::div")));
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Size')]//span[text()='+']/parent::div")));

					ca.eleToBeClickable();
					break;
				}
			}
		}catch (Exception exception) {
			// TODO: handle exception
		}

		Boolean check = statusChecker.isSelected();
		Actions action = new Actions(driver);
		if (check.equals(false)) {
			try {
				jsScrollPageDown(statusChecker);
				Thread.sleep(6000);
				driver.findElement(By.xpath("(//div[@class='dijitSliderImageHandle dijitSliderImageHandleH'])[3]")).click();
				action.sendKeys(Keys.PAGE_UP).build().perform();
				action.sendKeys(Keys.PAGE_UP).build().perform();
				action.sendKeys(Keys.PAGE_UP).build().perform();
				action.sendKeys(Keys.PAGE_UP).build().perform();
				action.sendKeys(Keys.PAGE_UP).build().perform();
				ca.eleToBeClickable();
				statusChecker.click();
				System.out.println("The Mens regular 2d size range checkbox");
			} catch (Exception e) {
				System.out.println("The Mens regular 2d is not active for size chart");
			}
		}
	}


	@Then("user maps the size range for the increments {string},{string}")
	public void userMapsTheSizeRangeForTheIncrements(String incrementName, String sizeRange) throws Throwable {
		String[] SR, SizeIncrement;
		Actions action = new Actions(driver);
		SizeIncrement = incrementName.split(",");
		SR = sizeRange.split(",");
		Thread.sleep(3000);
		driver.navigate().refresh();
		jsWaitForPageLoad();
		Thread.sleep(3500);
		for (int i = 0; i < SR.length; i++) {
			Thread.sleep(3000);
			ca.eleToBeClickable();
			for (int j = 0; j <=50; j++) {

				ca.click(driver.findElement(By.xpath("(//div[contains(@class,'SizeChartAdmin-Increments')]//span[text()='+']/parent::div)[1]")));
				WebElement incrementSR = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + SizeIncrement[i] + "']//following::td[@data-csi-act='IncrementSizeRange::0'])[1]"));
				if(incrementSR.isDisplayed()){
					ca.click(driver.findElement(By.xpath("(//div[contains(@class,'SizeChartAdmin-Increments')]//span[text()='+']/parent::div)[1]")));
					ca.click(driver.findElement(By.xpath("(//div[contains(@class,'SizeChartAdmin-Increments')]//span[text()='+']/parent::div)[1]")));
					ca.click(driver.findElement(By.xpath("(//div[contains(@class,'SizeChartAdmin-Increments')]//span[text()='+']/parent::div)[1]")));
					ca.click(driver.findElement(By.xpath("(//div[contains(@class,'SizeChartAdmin-Increments')]//span[text()='+']/parent::div)[1]")));

					//Commonactions.mouseOver(sp.getActionAdoption());
					Commonactions.isElementPresent(incrementSR);
					ca.click(incrementSR);
					/*Commonactions.isElementPresent(mp.getSave_btn1());
            		ca.click(mp.getSave_btn1());*/
					ca.eleToBeClickable();
					break;

				}}

			/* WebElement incrementSR = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + SizeIncrement[i] + "']//following::td[@data-csi-act='IncrementSizeRange::0'])[1]"));
            ca.eleToBeClickable();
            ca.click(incrementSR);
            Thread.sleep(3000);*/
			try{
				driver.findElement(By.xpath("//div[contains(text(),'" + SR[i] + "')]")).click();
			}catch(Exception e){
				driver.findElement(By.xpath("//div[contains(text(),'MensJeans')]")).click();

			}
			Thread.sleep(3000);
		}
		System.out.println("Size range has been mapped to the increment values");
	}

	@And("user maps the dimensions inside the increments values {string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void userMapsTheDimensionsInsideTheIncrementsValues(String incrementName1,String incrementName2, String dim1, String dim2, String dim3, String dim4, String dim5, String dim6,String dim7) throws Throwable {

		WebElement dimName1 = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + incrementName1 + "']//following::td[@data-csi-act='Dimensions::0'])[1]"));
		ca.click(dimName1);
		driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + dim1 + "']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + dim2 + "']")).click();
		ca.eleToBeClickable();
		ca.click(sc.getSizeChartIncrementTab());

		Thread.sleep(2500);
		WebElement dimName2 = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + incrementName2 + "']//following::td[@data-csi-act='Dimensions::0'])[1]"));
		ca.click(dimName2);
		driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + dim3 + "']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + dim4 + "']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + dim5 + "']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + dim6 + "']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + dim7 + "']")).click();
		ca.eleToBeClickable();
		ca.click(sc.getSizeChartIncrementTab());
		Thread.sleep(3000);

	}

	@When("user selects the base sizes for the increments {string},{string},{string},{string}")
	public void userSelectsTheBaseSizesForTheIncrements(String a, String b,String c,String d) throws Throwable {
		Actions action = new Actions(driver);
		try {
			driver.findElement(By.xpath("//div[@class='dijitSliderImageHandle dijitSliderImageHandleH']")).click();
			action.sendKeys(Keys.PAGE_UP).build().perform();
			action.sendKeys(Keys.PAGE_UP).build().perform();
			action.sendKeys(Keys.PAGE_UP).build().perform();
			action.sendKeys(Keys.PAGE_UP).build().perform();
			System.out.println("The Slider arrow got clicked");
		} catch (Exception e) {
			System.out.println("Slider arrow is not clicked");
		}
		Thread.sleep(3000);
		WebElement dimName1 = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + a + "']//following::td[@data-csi-act='BaseSize::0'])[1]"));
		ca.click(dimName1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'" + d + "')]")).click();
		Thread.sleep(2500);

		WebElement increment2 = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + b + "']//following::td[@data-csi-act='BaseSize::0'])[1]"));
		ca.click(increment2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'" + c + "')]")).click();
	}

	@And("user creation of tags in the dimension {string}")
	public void userCreationOfTagsInTheDimension(String a) throws Throwable {
		ca.click(sc.getSizeChartDimensionTab());
		jsWaitForPageLoad();
		Actions action = new Actions(driver);
		try {
			WebElement name = driver.findElement(By.xpath("//a[@class='browse' and text()='U550']"));
			jsScrollPageDown(name);
			WebElement slider = driver.findElement(By.xpath("(//div[@class='dijitSliderImageHandle dijitSliderImageHandleH'])[1]"));
			slider.click();
			action.sendKeys(Keys.PAGE_UP).build().perform();
			action.sendKeys(Keys.PAGE_UP).build().perform();
			action.sendKeys(Keys.PAGE_UP).build().perform();
			action.sendKeys(Keys.PAGE_UP).build().perform();
			System.out.println("The Slider arrow got clicked");
		} catch (Exception e) {
			System.out.println("Slider arrow is not clicked");
		}
		WebElement dimName1 = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + a + "']//following::td[@data-csi-act='Tags::0'])[1]"));
		ca.click(dimName1);
		ca.eleToBeClickable();
		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e, "Neck");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='Neck']")).click();
		ca.eleToBeClickable();
		ca.click(sc.getSizeChartTab());
		jsWaitForPageLoad();
	}

	@Then("user will create the product group")
	public void userWillCreateTheProductGroup() throws Throwable {
		Thread.sleep(3000);
		ca.eleToBeClickable();
		ca.click(sc.getSizeChartPGTab());
		jsWaitForPageLoad();
		ca.eleToBeClickable();
		ca.click(sc.getSizeChartPGActionBtn());
		ca.eleToBeClickable();
		ca.insertText(sc.getSizeChartPGInputBtn(),"NewPG");
		ca.eleToBeClickable();
		ca.insertText(sc.getSizeChartPGDescBtn(),"NewPG");
		ca.eleToBeClickable();
		ca.click(pp.getSave_Btn());
		Thread.sleep(3000);

	}

	@And("user navigates to increment tab and create custom view {string}")
	public void userNavigatesToIncrementTabAndCreateCustomView(String arg0) throws Throwable {

		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getUser_settingsBtn1());
		ca.click(hp.getUser_settingsBtn1()); 

		System.out.println("Setup tab clicked successfully");

		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Increments");
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		ca.click(sc.getSizeChartIncrementTab());
		jsWaitForPageLoad();
		String[] a = arg0.split(",");
		Actions actions = new Actions(driver);
		ca.eleToBeClickable();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-csi-automation='plugin-SizeChartAdmin-Increments-CustomViewActions']")).click();
		driver.findElement(By.xpath("//tr[@data-csi-automation='plugin-SizeChartAdmin-Increments-CustomViewSaveAs']")).click();
		ca.eleToBeClickable();
		ca.click(cp.getCopyCV_Option());
		Thread.sleep(2000);
		ca.eleToBeClickable();
		cp.getCopyNameTxt_bx().clear();
		Thread.sleep(1000);
		ca.insertText(cp.getCopyNameTxt_bx(), "CV_Copy");
		Select dropdown = new Select(cp.getSelectedAttributesBox());
		Thread.sleep(2500);
		dropdown.selectByVisibleText(a[0]);
		ca.eleToBeClickable();
		ca.click(cp.getCV_RemoveBtn());
		ca.eleToBeClickable();
		dropdown.selectByVisibleText(a[1]);
		ca.eleToBeClickable();
		ca.click(cp.getCV_RemoveBtn());
		ca.eleToBeClickable();
		ca.click(cp.getCV_PopUpSaveBtn());
	}



	@Then("User creates setup page in Increment {string}")
	public void user_creates_setup_page_in_Increment_and_ProductGroup(String incvalues) throws Throwable {

		String[] incvalue = incvalues.split(",");

		Commonactions.isElementPresent(hp.getDatasetup());
		ca.click(hp.getDatasetup());
		Commonactions.isElementPresent(bc.getProdSpecSetup());
		ca.click(bc.getProdSpecSetup());
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "increments" +Keys.ENTER);
		ca.eleToBeClickable(); 
		ca.click(sz.getPangraderulename());
		ca.jsScrollPagedowntoEnd();
		ca.eleToBeClickable();
		for(int i=0;i<100;i++)
		{
			ca.click(driver.findElement(By.xpath("(//span[text()='Pants Grade Rule']//following::div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div)")));
		}

		for(int i=1;i<=10;i++)
		{
			WebElement increment = driver.findElement(By.xpath("(//td[contains(@data-csi-act,'Increments')])["+i+"]"));
			Thread.sleep(2000);
			ca.click(increment);
			ca.eleToBeClickable();
			WebElement e = ca.activeElement();
			ca.eleToBeClickable();
			e.sendKeys(incvalue[i-1]);
			ca.eleToBeClickable();
			ca.click(sz.getIncrement());
		}
		System.out.println("increment values added for large and medium");
	}

	@And("User sets grainline in ProductGroup")
	public void User_sets_grainline_in_ProductGroup() throws Throwable
	{

		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Product Groups" +Keys.ENTER);
		ca.eleToBeClickable(); 
		ca.click(sz.getPG01());

		Commonactions.isElementPresent(sz.getProdgrpView());
		ca.click(sz.getProdgrpView());
		Commonactions.isElementPresent(sz.getProdgrpmanage());
		ca.click(sz.getProdgrpmanage());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "Dimension");
		Commonactions.isElementPresent(sz.getProdgrpDim());
		ca.click(sz.getProdgrpDim());

		ca.eleToBeClickable();
		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		e.sendKeys("Dimension");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(sz.getGrainline());
		ca.click(sz.getGrainline());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		for (int i = 0; i < 8; i++) 
		{ ca.click(in.getUp()); }
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		boolean GLvalue = sz.getGrainlinearea().isDisplayed();
		if(GLvalue==true)
		{
			System.out.println("Grainlinevalue is displayed in ProductGroup");
		}
		else
		{
			System.out.println("Grainlinevalue is not displayed in ProductGroup");	
		}

	}

	@Then("User Navigates to apparelColorandsize under season")
	public void user_Navigates_to_apparelColorandsize_under_season() 
	{
		Commonactions.isElementPresent(hp.getStyleBtn());
		ca.click(hp.getStyleBtn());
		Commonactions.isElementPresent(sm.getWinterSeason());
		ca.click(sm.getWinterSeason());
		Commonactions.isElementPresent(st.getStyles_Btn());
		st.getStyles_Btn().click();
		Commonactions.isElementPresent(si.getColorandSize());
		si.getColorandSize().click();
		Commonactions.isElementPresent(si.getSpecification());
		si.getSpecification().click();
		Commonactions.isElementPresent(si.getSizechart());
		ca.click(si.getSizechart());	
	}

	@Then("User creates NewSizeChart {string}")
	public void user_creates_NewSizeChart(String string) throws Throwable {
		Commonactions.isElementPresent(si.getNewsizechartbtn());
		ca.click(si.getNewsizechartbtn());
		Commonactions.isElementPresent(si.getSizechartValue());
		ca.insertText(si.getSizechartValue(), "Apparel SC - 01");
		Commonactions.isElementPresent(so.getSaveandgo());
		ca.click(so.getSaveandgo());
		System.out.println("size chart created");
		ca.click(sz.getTDS());

		Commonactions.isElementPresent(sz.getProdgrp());
		ca.click(sz.getProdgrp());
		ca.eleToBeClickable();
		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		e.sendKeys("PG - 01");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.click(sz.getTDS());

		Commonactions.isElementPresent(sz.getSizeincrement());
		ca.click(sz.getSizeincrement());
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys("Pants");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		ca.click(sz.getToolbars());
	}

	@And("User manageviews for Dimension and TDS")
	public void User_manageviews_for_Dimension_and_TDS() throws Throwable
	{
		Commonactions.isElementPresent(si.getDimensionView());
		ca.click(si.getDimensionView());
		Commonactions.isElementPresent(si.getDimensionmanage());
		ca.click(si.getDimensionmanage());
		Commonactions.isElementPresent(sz.getDefalt());
		ca.click(sz.getDefalt());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "PatternDim");
		Commonactions.isElementPresent(sz.getShrinkage());
		ca.click(sz.getShrinkage());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(sz.getSizematrix());
		ca.click(sz.getSizematrix());
		Commonactions.isElementPresent(sz.getPattern());
		ca.click(sz.getPattern());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(sz.getPatternshrinkage());
		ca.click(sz.getPatternshrinkage());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(sz.getTDSview());
		ca.click(sz.getTDSview());
		Commonactions.isElementPresent(sz.getTDSManage());
		ca.click(sz.getTDSManage());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "TDS");
		Commonactions.isElementPresent(sz.getWarpShrinkage());
		ca.click(sz.getWarpShrinkage());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(sz.getWeaveShrinkage());
		ca.click(sz.getWeaveShrinkage());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(sz.getGralinedesignation());
		ca.click(sz.getGralinedesignation());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
	}

	@Then("Select the Warp, weave, grainlinevalues {string},{string},{string}>")
	public void select_the_Warp_weave_grainlinevalues(String string, String string2, String string3) throws Throwable {

		ca.click(sz.getWarpShrinkagevalue());
		ca.eleToBeClickable();
		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		e.sendKeys("5");
		ca.eleToBeClickable();

		ca.click(sz.getWeaveShrinkagevalue());
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys("10");
		ca.eleToBeClickable();

		ca.click(sz.getGrainlinevalue());
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		e2.sendKeys("Cut With Grainline");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

	}

	@Then("user fills the pattern value for large, medium and small {string},{string},{string}")
	public void user_fills_the_pattern_value_for_large_medium_and_small(String small, String medium, String large) throws Throwable {

		String[] smallnum = small.split(",");
		String[] mediumnum = medium.split(",");
		String[] largenum = large.split(",");


		for(int i=0;i<100;i++)
		{
			ca.click(driver.findElement(By.xpath("//div[text()='Dimensions']//following::div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div")));
		}
		int j = 0,k=0,l=0;
		for(int i=1;i<11;i=i+3)
		{
			ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-act,'Pattern::0{SizeChartDimensionSummaryMatrix')])["+i+"]")));
			ca.eleToBeClickable();
			WebElement e2 = ca.activeElement();
			ca.eleToBeClickable();
			e2.sendKeys(smallnum[j]);
			j++;
			ca.eleToBeClickable();
		}
		for(int i=2;i<13;i=i+3)
		{

			ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-act,'Pattern::0{SizeChartDimensionSummaryMatrix')])["+i+"]")));
			ca.eleToBeClickable();
			WebElement e2 = ca.activeElement();
			ca.eleToBeClickable();
			e2.sendKeys(mediumnum[k]);
			k++;
			ca.eleToBeClickable();
		}

		/*for (int i = 0; i <= 100; i++) {
			ca.click(driver.findElement(By.xpath("//div[contains(@class,'Dimensions')]//span[text()='-']/parent::div")));	
			if (sz.getSmallpattern().isDisplayed()) {
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Dimensions')]//span[text()='-']/parent::div")));
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Dimensions')]//span[text()='-']/parent::div")));
				break;
			}
		}*/

		for(int i=3;i<15;i=i+3)
		{
			ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-act,'Pattern::0{SizeChartDimensionSummaryMatrix')])["+i+"]")));
			ca.eleToBeClickable();
			WebElement e2 = ca.activeElement();
			ca.eleToBeClickable();
			e2.sendKeys(largenum[l]);
			l++;
			ca.eleToBeClickable();
		}

		Commonactions.isElementPresent(sz.getGrainlinevalue());
		ca.click(sz.getGrainlinevalue());
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		e2.sendKeys("Cut Against Grainline");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(pp.getReset());
		ca.click(pp.getReset());

	}

	@Then("User restore increments and restore tolerance")
	public void user_restore_increments_and_restore_tolerance() throws Throwable {
		Commonactions.isElementPresent(sz.getDimensionAction());
		ca.click(sz.getDimensionAction());
		Commonactions.isElementPresent(sz.getRestoreIncrement());
		ca.click(sz.getRestoreIncrement());
		Commonactions.isElementPresent(pp.getRestore());
		ca.click(pp.getRestore());
		Commonactions.isElementPresent(sz.getDimensionAction());
		ca.click(sz.getDimensionAction());
		Commonactions.isElementPresent(sz.getRestoretolerance());
		ca.click(sz.getRestoretolerance());
		Commonactions.isElementPresent(pp.getRestore());
		ca.click(pp.getRestore());
		ca.eleToBeClickable();
		System.out.println("Restore Increment and Tolerance completed successfully");

	}

	@Then("user enter Shrinkagevalue {string}")
	public void user_enter_Shrinkagevalue(String shrinkagevalues) throws Throwable {

		String[] shrinkagevalue = shrinkagevalues.split(",");
		for(int i=0;i<100;i++)
		{
			ca.click(driver.findElement(By.xpath("//div[text()='Dimensions']//following::div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div")));
		}
		Commonactions.isElementPresent(sz.getShrinkagevalue1());
		ca.click(sz.getShrinkagevalue1());
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		e2.sendKeys(shrinkagevalue[0]);
		ca.eleToBeClickable();

		ca.click(driver.findElement(By.xpath("//div[text()='Dimensions']//following::div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div")));

		Commonactions.isElementPresent(sz.getShrinkagevalue2());
		ca.click(sz.getShrinkagevalue2());
		ca.eleToBeClickable();
		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		e.sendKeys(shrinkagevalue[1]);
		ca.eleToBeClickable();


	}

	@Then("user restoreshrinkage")
	public void user_restoreshrinkage() {
		Commonactions.isElementPresent(sz.getDimensionAction());
		ca.click(sz.getDimensionAction());
		Commonactions.isElementPresent(sz.getRestoreshrinkage());
		ca.click(sz.getRestoreshrinkage());
		Commonactions.isElementPresent(pp.getRestore());
		ca.click(pp.getRestore());
		System.out.println("Restore shrinkage completed successfully");

	}

	@Then("user Resetpattern")
	public void user_Resetpattern() {
		Commonactions.isElementPresent(sz.getDimensionAction());
		ca.click(sz.getDimensionAction());
		Commonactions.isElementPresent(sz.getResetpattern());
		ca.click(sz.getResetpattern());
		Commonactions.isElementPresent(pp.getReset());
		ca.click(pp.getReset());
		System.out.println("Reset pattern completed successfully");
	}

	@Then("User create New Increment value")
	public void user_create_New_Increment_value() throws Throwable {

		Commonactions.isElementPresent(hp.getDatasetup());
		ca.click(hp.getDatasetup());
		Commonactions.isElementPresent(bc.getProdSpecSetup());
		ca.click(bc.getProdSpecSetup());
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "increments" +Keys.ENTER);
		ca.eleToBeClickable(); 

		Commonactions.isElementPresent(sc.getSizeChartIncrementActionBtn());
		ca.click(sc.getSizeChartIncrementActionBtn());
		ca.eleToBeClickable();
		ca.insertText(sc.getSizeChartIncrementInputBox(), "Jean pant New increment");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(so.getSaveandgo());
		ca.click(so.getSaveandgo());
		Commonactions.isElementPresent(sz.getIncrementSizeRange());
		ca.click(sz.getIncrementSizeRange());
		ca.eleToBeClickable();
		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		e.sendKeys("MensJeans");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		System.out.println("Jean pant New Increment created successfully");

	}

	@Then("select Dimension from list {string}")
	public void select_Dimension_from_list(String Dimvalue) throws Throwable {

		String[] Dim = Dimvalue.split(",");
		Commonactions.isElementPresent(sz.getDimensionadd());
		ca.click(sz.getDimensionadd());
		Commonactions.isElementPresent(sz.getDimvalue1());
		ca.click(sz.getDimvalue1());
		Commonactions.isElementPresent(sz.getDimvalue2());
		ca.click(sz.getDimvalue2());
		Commonactions.isElementPresent(sz.getDimvalue3());
		ca.click(sz.getDimvalue3());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		ca.eleToBeClickable();

		for(int i=0;i<120;i++){
			ca.click(driver.findElement(By.xpath("//div[text()='Dimensions']//following::div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div")));
		}

		for(int i=1;i<=6;i++)
		{
			ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-act,'Increments')])["+i+"]")));
			ca.eleToBeClickable();
			WebElement e = ca.activeElement();
			ca.eleToBeClickable();
			e.sendKeys(Dim[i-1]);
			ca.eleToBeClickable();
			ca.click(sz.getIncrement());
		}

	}

	@Then("User create New product group value")
	public void user_create_New_product_group_value() throws Throwable {

		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Product Groups" +Keys.ENTER);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sz.getNewProductGroup());
		ca.click(sz.getNewProductGroup());
		Commonactions.isElementPresent(sz.getNewProductGrpvalue());
		ca.insertText(sz.getNewProductGrpvalue(), "New PG - 01");
		Commonactions.isElementPresent(so.getSaveandgo());
		ca.click(so.getSaveandgo());
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		System.out.println("New Product group NewPG-01 is created successfully");
	}

	@Then("User enters value in newfromdimension {string}")
	public void user_enters_value_in_newfromdimension(String tolerance) throws Throwable {

		String[] tolerancevalue = tolerance.split(",");
		Commonactions.isElementPresent(sz.getNewfromdimension());
		ca.click(sz.getNewfromdimension());
		Commonactions.isElementPresent(sz.getDimvalue1());
		ca.click(sz.getDimvalue1());
		Commonactions.isElementPresent(sz.getDimvalue2());
		ca.click(sz.getDimvalue2());
		Commonactions.isElementPresent(sz.getDimvalue3());
		ca.click(sz.getDimvalue3());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		ca.eleToBeClickable();

		for(int i=0;i<80;i++)
		{
			ca.click(driver.findElement(By.xpath("//div[text()='Dimensions']//following::div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div")));
		}
		Commonactions.isElementPresent(sz.getTolerancevalue1());
		ca.click(sz.getTolerancevalue1());
		ca.eleToBeClickable();
		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		e.sendKeys(tolerancevalue[0]);
		ca.eleToBeClickable();

		Commonactions.isElementPresent(sz.getTolerancevalue2());
		ca.click(sz.getTolerancevalue2());
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys(tolerancevalue[1]);
		ca.eleToBeClickable();

		Commonactions.isElementPresent(sz.getTolerancevalue3());
		ca.click(sz.getTolerancevalue3());
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		e2.sendKeys(tolerancevalue[2]);
		ca.eleToBeClickable();

	}

	@Then("user changeproductgroup under sizechart {string}")
	public void user_changeproductgroup_under_sizechart(String newprodgrp) throws Throwable {

		boolean dd = sz.getApparelSC01name().isDisplayed();
		if(dd==true){
			Commonactions.isElementPresent(sz.getApparelSC01name());
			ca.click(sz.getApparelSC01name());}
		else
		{
			ca.click(driver.findElement(By.xpath("(//a[text()='Apparel SC - 01'])[2]")));
		}

		ca.eleToBeClickable();
		Commonactions.isElementPresent(sz.getToolbars());
		ca.click(sz.getToolbars());
		Commonactions.isElementPresent(sz.getDimensionAction());
		ca.click(sz.getDimensionAction());
		Commonactions.isElementPresent(sz.getChangeproductgroup());
		ca.click(sz.getChangeproductgroup());
		Commonactions.isElementPresent(sz.getNewProdgrp());
		ca.insertText(sz.getNewProdgrp(), newprodgrp);
		Commonactions.isElementPresent(sz.getResetfromlibrary());
		ca.click(sz.getResetfromlibrary());
		ca.click(sz.getDiscardDimension());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("change product is completed successfully");
	}

	@Then("user changeincrement under sizechart {string}")
	public void user_changeincrement_under_sizechart(String newprodgrp) throws Throwable {

		Commonactions.isElementPresent(sz.getDimensionAction());
		ca.click(sz.getDimensionAction());
		Commonactions.isElementPresent(sz.getChangeincrement());
		ca.click(sz.getChangeincrement());
		Commonactions.isElementPresent(sz.getNewincrement());
		ca.insertText(sz.getNewincrement(), "Jean pant New increment");	
		Commonactions.isElementPresent(sz.getChangePGcheckbox());
		ca.click(sz.getChangePGcheckbox());
		Commonactions.isElementPresent(sz.getNewincrement());
		ca.insertText(sz.getNewProdgrp(), newprodgrp);
		ca.eleToBeClickable();
		for(int i=1;i<=4;i++)
		{
			ca.click(driver.findElement(By.xpath("(//label[text()='Maintain']//parent::div//parent::div//input)["+i+"]")));
		}
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("change increment with new increment is done");

		Commonactions.isElementPresent(sz.getDimensionAction());
		ca.click(sz.getDimensionAction());
		Commonactions.isElementPresent(sz.getChangeincrement());
		ca.click(sz.getChangeincrement());
		Commonactions.isElementPresent(sz.getNewincrement());
		ca.insertText(sz.getNewincrement(), "Pants Grade Rule");	
		Commonactions.isElementPresent(sz.getChangePGcheckbox());
		ca.click(sz.getChangePGcheckbox());
		Commonactions.isElementPresent(sz.getNewincrement());
		ca.insertText(sz.getNewProdgrp(), "NEW PG - 01");	
		Commonactions.isElementPresent(sz.getMaintain2());
		ca.click(sz.getMaintain2());
		Commonactions.isElementPresent(sz.getResetfromlibrary2());
		ca.click(sz.getResetfromlibrary2());
		Commonactions.isElementPresent(sz.getResetfromlibrary3());
		ca.click(sz.getResetfromlibrary3());
		Commonactions.isElementPresent(sz.getDiscard2());
		ca.click(sz.getDiscard2());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("change increment with pant grade rule is done");

	}

	@Then("user change sizerange")
	public void user_change_sizerange() throws Throwable {
		Commonactions.isElementPresent(sz.getDimensionAction());
		ca.click(sz.getDimensionAction());
		ca.eleToBeClickable();
		boolean sizerange = sz.getChangesizerange().isDisplayed();
		if(sizerange==true)
		{
			System.out.println("Size range is displayed in list");
		}
		else
		{
			System.out.println("Size range is not displayed in list");
		}

	}

	@Then("user selects the created sizechart uncheck size medium")
	public void user_selects_the_created_sizechart_uncheck_size_medium() throws Throwable {
		boolean dd = sz.getApparelSC01name().isDisplayed();
		if(dd==true){
			Commonactions.isElementPresent(sz.getApparelSC01name());
			ca.click(sz.getApparelSC01name());}
		else
		{
			ca.click(driver.findElement(By.xpath("(//a[text()='Apparel SC - 01'])[2]")));
		}
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sz.getToolbars());
		ca.click(sz.getToolbars());
		Commonactions.isElementPresent(sz.getGrainlinevalue());
		ca.click(sz.getGrainlinevalue());
		Commonactions.isElementPresent(sz.getAllsize());
		ca.click(sz.getAllsize());
		Commonactions.isElementPresent(sz.getMediumchkbox());
		ca.click(sz.getMediumchkbox());
		ca.eleToBeClickable();

	}

	@Then("Evalaute the Sizechart {string},{string}")
	public void evalaute_the_Sizechart(String supprequest, String sampledim) throws Throwable {

		Commonactions.isElementPresent(sz.getTDSAction());
		ca.click(sz.getTDSAction());
		ca.eleToBeClickable();
		ca.click(sz.getTDSAction());
		ca.eleToBeClickable();
		evaluate();
		ca.eleToBeClickable();
		/*Commonactions.isElementPresent(sz.getSupplierrequest());
		ca.insertText(sz.getSupplierrequest(), supprequest);
		ca.jsMouseOver();*/
		Commonactions.isElementPresent(sz.getCreatesample());
		ca.click(sz.getCreatesample());
		Commonactions.isElementPresent(in.getNext());
		ca.click(in.getNext());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(sz.getSampledimension());
		ca.insertText(sz.getSampledimension(), sampledim);
		ca.jsMouseOver();
		Commonactions.isElementPresent(sz.getSamplecolor());
		ca.insertText(sz.getSamplecolor(), "egret");
		Commonactions.isElementPresent(sz.getEgretcolor1());
		ca.click(sz.getEgretcolor1());
		Commonactions.isElementPresent(in.getFinish());
		ca.click(in.getFinish());

		Commonactions.isElementPresent(sz.getSamplecolor());
		ca.insertText(sz.getSamplecolor(), "EGRET - Copy");
		Commonactions.isElementPresent(sz.getEgretcolor2());
		ca.click(sz.getEgretcolor2());
		Commonactions.isElementPresent(in.getFinish());
		ca.click(in.getFinish());

		Commonactions.isElementPresent(sz.getSamplesizes());
		ca.insertText(sz.getSamplesizes(), "small");
		Commonactions.isElementPresent(sz.getSmallsize());
		ca.click(sz.getSmallsize());
		Commonactions.isElementPresent(in.getFinish());
		ca.click(in.getFinish());
		ca.eleToBeClickable();
		System.out.println("Evaluated Size chart for Apparel SC-01");

	}

	@Then("verify values under Evaluation tab")
	public void verify_values_under_Evaluation_tab() throws Throwable {
		Commonactions.isElementPresent(sz.getEvaluation());
		ca.click(sz.getEvaluation());
		ca.eleToBeClickable();
		for (int i = 0; i <= 70; i++)
		{
			slider();
		}
		for(int i=1;i<=12;i++)
		{
			try{
				WebElement actualelement = driver.findElement(By.xpath("(//td[@data-csi-act='Actuals:Child:ReviewData:0{SizeChartReviewDimensionMatrix}'])["+i+"]"));
				boolean actual = actualelement.isDisplayed(); 
				if(actual==true)
				{
					ca.click(actualelement);
					if(i==12||i==4 && actual==true)
					{
						ca.eleToBeClickable();
						WebElement e1 = ca.activeElement();
						ca.eleToBeClickable();
						e1.sendKeys("10");
						ca.eleToBeClickable();
					}
				}}
			catch(Exception e)
			{
				System.out.println("element of actual varies dynamically");
			}
		}
		System.out.println("values entered in actual");
	}

	@Then("User pass the Evaluation as Expected value refelcted in page")
	public void user_pass_the_Evaluation_as_Expected_value_refelcted_in_page() throws Throwable {

		ca.eleToBeClickable();

		List<WebElement> tds = driver.findElements(By.xpath("//span[@data-csi-tab-name='TDS' or text()='TDS']"));
		for(int i=1;i<=tds.size();i++)
		{
			WebElement currenttds = driver.findElement(By.xpath("(//span[@data-csi-tab-name='TDS' or text()='TDS'])["+i+"]"));
			boolean displayed = currenttds.isDisplayed();
			if(displayed==true)
			{
				ca.click(currenttds);
				break;
			}}
		Commonactions.isElementPresent(sz.getTDSAction());
		ca.click(sz.getTDSAction());
		pass();
	}

	public void slider()
	{
		List<WebElement> sl = driver.findElements(By.xpath("//div[text()='New Dimension']//following::div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div"));
		for(int i=1;i<=sl.size();i++)
		{
			WebElement sldr = driver.findElement(By.xpath("(//div[text()='New Dimension']//following::div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div)["+i+"]"));
			boolean displayed = sldr.isDisplayed();
			if(displayed==true)
			{
				ca.click(sldr);
				break;
			}}
	}

	public void evaluate()
	{
		List<WebElement> num = driver.findElements(By.xpath("//tr[@data-csi-automation='plugin-SizeChart-Breadcrumb-ReviewStart']"));
		for(int i=1;i<=num.size();i++)
		{
			WebElement evaluate = driver.findElement(By.xpath("(//tr[@data-csi-automation='plugin-SizeChart-Breadcrumb-ReviewStart'])["+i+"]"));
			boolean displayed = evaluate.isDisplayed();
			if(displayed==true)
			{
				ca.click(evaluate);
				break;
			}}
	}

	public void pass()
	{
		List<WebElement> num = driver.findElements(By.xpath("//td[text()='Pass']"));
		for(int i=1;i<=num.size();i++)
		{
			WebElement pass = driver.findElement(By.xpath("(//td[text()='Pass'])["+i+"]"));
			boolean displayed = pass.isDisplayed();
			if(displayed==true)
			{
				ca.click(pass);
				break;
			}}
	}




}
