package com.centric.stepdefinition;

import com.centric.objectrepository.*;
import com.centric.resources.Commonactions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;


public class SizesTK extends Commonactions {

	Commonactions ca = new Commonactions();
	SetupPageTK sp = new SetupPageTK();
	PopupPage pp = new PopupPage();
	HomePage hp = new HomePage();
	SpecificationPage spec = new SpecificationPage();
	SpecificationHierarchyPageTK shp = new SpecificationHierarchyPageTK();
	ColorSpecificationPageTK cp = new ColorSpecificationPageTK();
	PopupPage pup=new PopupPage();
	StylePage spk =new StylePage();
	ConfigurationPage co=new ConfigurationPage();
	MaterialSpecificationPage mp = new MaterialSpecificationPage();
	InspectionPageSteps in = new InspectionPageSteps();

	@When("Setup Enum for size dimensions in setup page {string}")
	public void setupEnumForSizeDimensionsInSetupPage(String Enum) throws Throwable {
		jsWaitForPageLoad();
		ca.eleToBeClickable();
		ca.click(sp.getUser_Enumerations());
		ca.eleToBeClickable();
		ca.click(sp.getUser_EnumDropBox());
		ca.eleToBeClickable();
		WebElement element = driver.findElement(By.xpath("//label[contains(text(),'" + Enum + "')]"));
		Commonactions.isElementPresent(element);
		element.click();
		ca.eleToBeClickable();


		//   Commonactions.isElementPresent();
		// ca.click(hp.getUser_settingsBtn());
		ca.click(sp.getUser_Enumerations());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//td[text()='DimensionType']//preceding-sibling::td/div/input")));

	}

	@Then("Create the Enum value for the sizes {string},{string},{string},{string}")
	public void createTheEnumValueForTheSizes(String EnumValue, String desc, String EnumValue2, String desc2) throws Throwable {
		ca.jsScrollPageDown(sp.getUser_NewEnumValue());
		Actions actions = new Actions(driver);
		if (sp.getUser_NewEnumValue().isDisplayed()) {
			jsWaitForPageLoad();
			ca.eleToBeClickable();
			actions.moveToElement(sp.getUser_NewEnumValue()).click(sp.getUser_NewEnumValue()).build().perform();
			ca.eleToBeClickable();
			ca.insertText(sp.getUser_NewEnumName(), EnumValue);
			ca.eleToBeClickable();
			ca.insertText(sp.getUser_NewEnumDescription(), desc);
			ca.eleToBeClickable();
			ca.click(mp.getSave_btn1());


			ca.eleToBeClickable();
			actions.moveToElement(sp.getUser_NewEnumValue()).click(sp.getUser_NewEnumValue()).build().perform();
			ca.eleToBeClickable();
			ca.insertText(sp.getUser_NewEnumName(), EnumValue2);
			ca.eleToBeClickable();
			ca.insertText(sp.getUser_NewEnumDescription(), desc2);
			ca.eleToBeClickable();
			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable(); 		
		} else {
			System.out.println("The enumeration setup has been failed");
		}
	}

	@And("Update the Enum through partial configuration")
	public void updateTheEnumThroughPartialConfiguration() throws Throwable {
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getUser_settingsBtn());
		ca.click(hp.getUser_settingsBtn());
		ca.eleToBeClickable();
		ca.click(sp.getUpdateConfigBtn());
		ca.eleToBeClickable();
		if (sp.getPartialUpdateBtn().isDisplayed()) {
			ca.eleToBeClickable();
			ca.click(sp.getFullUpdateBtn());
			ca.eleToBeClickable();
			ca.click(sp.getRunBtn());
		}
	}

	@And("Selecting the sub ranges for composite sizes {string},{string}")
	public void selectingTheSubRangesForCompositeSizes(String simple1, String simple2) throws Throwable {
		ca.eleToBeClickable();
		ca.click(spec.getSubSizeRange());
		ca.eleToBeClickable();
		driver.findElement(By.xpath("//td[contains(text(),'" + simple1 + "')]")).click();
		ca.eleToBeClickable();
		driver.findElement(By.xpath("//td[contains(text(),'" + simple2 + "')]")).click();
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
	}


	@When("User creates multiple sizes with different type for TwoDSizes {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void userCreatesMultipleSizesWithDifferentTypeForTwoDSizes(String size, String size1, String size2, String size3, String size4, String size5, String SortOrder, String SortOrder1, String SortOrder2, String SortOrder3, String SortOrder4, String SortOrder5) throws Throwable {

		jsWaitForPageLoad();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(hp.getUser_settingsBtn());
		ca.click(hp.getUser_settingsBtn());
		Commonactions.isElementPresent(hp.getSystem_config());
		ca.click(hp.getSystem_config());
		Commonactions.isElementPresent(co.getUser_config());
		ca.click(co.getUser_config());
		Commonactions.isElementPresent(sp.getUser_Enumerations());
		ca.click(sp.getUser_Enumerations());
		ca.eleToBeClickable();
		ca.click(sp.getUser_EnumDropBox());
		ca.eleToBeClickable();
		WebElement element = driver.findElement(By.xpath("//label[contains(text(),'DimensionType (1)')]"));
		Commonactions.isElementPresent(element);
		element.click();
		ca.eleToBeClickable();
		ca.click(sp.getUser_Enumerations());      

		ca.eleToBeClickable();
		driver.navigate().refresh();
		Commonactions.jsWaitForPageLoad();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());   	
		ca.eleToBeClickable();

		Commonactions.isElementPresent(hp.getUser_settingsBtn1());
		ca.click(hp.getUser_settingsBtn1()); 

		System.out.println("Setup tab clicked successfully");

		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());
		Commonactions.isElementPresent(hp.getSetupSearch());
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Sizes");

		jsWaitForPageLoad();
		Commonactions.isElementPresent(spec.getSizeTab());
		ca.click(spec.getSizeTab());
		jsWaitForPageLoad();
		waitForElementClickable(spec.getNewSizeAction());
		ca.click(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeInputBox(), size);
		WebElement dimension = spec.getDimensionBox();
		ca.insertText(dimension,"Size");
		ca.eleToBeClickable();
		ca.insertText(spec.getSortOrderBox(), SortOrder);
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		waitForElementClickable(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.click(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeInputBox(), size1);
		ca.insertText(dimension,"Size");
		ca.eleToBeClickable();
		ca.insertText(spec.getSortOrderBox(), SortOrder1);
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		waitForElementClickable(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.click(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeInputBox(), size2);
		ca.insertText(dimension,"Size");
		ca.eleToBeClickable();
		ca.insertText(spec.getSortOrderBox(), SortOrder2);
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		waitForElementClickable(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.click(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeInputBox(), size3);
		ca.insertText(dimension,"Size");
		ca.eleToBeClickable();
		ca.insertText(spec.getSortOrderBox(), SortOrder3);
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		waitForElementClickable(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.click(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeInputBox(), size4);
		ca.insertText(dimension,"Size");
		ca.eleToBeClickable();
		ca.insertText(spec.getSortOrderBox(), SortOrder4);
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		waitForElementClickable(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.click(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeInputBox(), size5);
		ca.insertText(dimension,"Size");
		ca.eleToBeClickable();
		ca.insertText(spec.getSortOrderBox(), SortOrder5);
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
	}

	@Then("Create duplicate Sizes and verify the error message {string},{string}")
	public void createDuplicateSizesAndVerifyTheErrorMessage(String DupSize, String DupSo) throws Throwable {
		ca.eleToBeClickable();
		WebElement dimension = spec.getDimensionBox();
		if (spec.getNewSizeAction().isDisplayed()) {
			Commonactions.isElementPresent(spec.getNewSizeAction());
			ca.click(spec.getNewSizeAction());
			ca.eleToBeClickable();
			ca.insertText(spec.getSizeInputBox(), DupSize);
			ca.eleToBeClickable();
			ca.insertText(dimension,"Size");
			ca.eleToBeClickable();
			ca.insertText(spec.getSortOrderBox(), DupSo);
			ca.eleToBeClickable();
			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable();
			String expectedHeader = "Duplicate sizes are not allowed.";
			String message = spec.getDuplicateSizeError().getText();
			Assert.assertTrue("Duplicate sizes are not allowed.", message.contains(expectedHeader));
			System.out.println("Duplicate sizes error message detected ");
			ca.eleToBeClickable();
			ca.click(spec.getCancel());
			ca.eleToBeClickable();
		}


	}


	@And("Create twoD sizes with different type of dimension {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void createTwoDSizesWithDifferentTypeOfDimension(String Size1, String Size2, String Size3, String Size4, String Size5, String Size6, String DimTyp1, String DimTyp2, String DimTyp3, String DimTyp4, String DimTyp5, String DimTyp6, String CompSO1, String CompSO2, String CompSO3, String CompSO4, String CompSO5, String CompSO6) throws Throwable {


		WebElement dimension = spec.getDimensionBox();
		Actions a = new Actions(driver);
		ca.eleToBeClickable();
		waitForElementClickable(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.click(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeInputBox(), Size1);
		dimension.clear();
		ca.eleToBeClickable();
		ca.insertText(spec.getDimensionBox(), DimTyp1);
		Commonactions.isElementPresent(spec.getSortOrderBox());
		ca.insertText(spec.getSortOrderBox(), CompSO1);
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		// ca.eleToBeClickable();

		waitForElementClickable(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.click(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeInputBox(), Size2);
		dimension.clear();
		Commonactions.isElementPresent(spec.getDimensionBox());
		ca.insertText(spec.getDimensionBox(), DimTyp2);
		Commonactions.isElementPresent(spec.getSortOrderBox());
		ca.insertText(spec.getSortOrderBox(), CompSO2);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		// ca.eleToBeClickable();

		waitForElementClickable(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.click(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeInputBox(), Size3);
		dimension.clear();
		ca.eleToBeClickable();
		ca.insertText(spec.getDimensionBox(), DimTyp3);
		Commonactions.isElementPresent(spec.getSortOrderBox());
		ca.insertText(spec.getSortOrderBox(), CompSO3);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		// ca.eleToBeClickable();

		waitForElementClickable(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.click(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeInputBox(), Size4);
		dimension.clear();
		ca.eleToBeClickable();
		ca.insertText(spec.getDimensionBox(), DimTyp4);
		Commonactions.isElementPresent(spec.getSortOrderBox());
		ca.insertText(spec.getSortOrderBox(), CompSO4);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		// ca.eleToBeClickable();

		waitForElementClickable(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.click(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeInputBox(), Size5);
		dimension.clear();
		ca.eleToBeClickable();
		ca.insertText(spec.getDimensionBox(), DimTyp5);
		Commonactions.isElementPresent(spec.getSortOrderBox());
		ca.insertText(spec.getSortOrderBox(), CompSO5);
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		//  ca.eleToBeClickable();

		waitForElementClickable(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.click(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeInputBox(), Size6);
		dimension.clear();
		ca.eleToBeClickable();
		ca.insertText(spec.getDimensionBox(), DimTyp6);
		Commonactions.isElementPresent(spec.getSortOrderBox());
		ca.insertText(spec.getSortOrderBox(), CompSO6);
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		// ca.eleToBeClickable();
	}



	@When("User selects the created sizes for TwoD sizes {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void userSelectsTheCreatedSizesForTwoDSizes(String TwoDSizeName1, String TwoDSizeName2, String TwoDSizeName3, String TwoDSizeName4, String TwoDSizeName5, String TwoDSizeName6, String TwoDSizeName7, String TwoDSizeName8,String TwoDSizeName9, String Size1, String Size2, String Size3, String Size4, String Size5, String Size6) throws Throwable {


		Actions a = new Actions(driver);
		ca.eleToBeClickable();
		waitForElementClickable(spec.getNewSizeAction());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(spec.getNewSizeAction());
		ca.click(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.click(spec.getTwoDimensionCheckBox());
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeInputBox(),TwoDSizeName1);
		ca.eleToBeClickable();
		ca.insertText(spec.getOneDimBox(),Size1);
		ca.eleToBeClickable();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		ca.eleToBeClickable();
		ca.insertText(spec.getSecondDimBox(), Size4);
		ca.eleToBeClickable();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		waitForElementClickable(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.click(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.click(spec.getTwoDimensionCheckBox());
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeInputBox(),TwoDSizeName2);
		ca.eleToBeClickable();
		ca.insertText(spec.getOneDimBox(),Size1);
		ca.eleToBeClickable();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		ca.eleToBeClickable();
		ca.insertText(spec.getSecondDimBox(), Size5);
		ca.eleToBeClickable();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		waitForElementClickable(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.click(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.click(spec.getTwoDimensionCheckBox());
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeInputBox(),TwoDSizeName3);
		ca.eleToBeClickable();
		ca.insertText(spec.getOneDimBox(),Size1);
		ca.eleToBeClickable();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		ca.eleToBeClickable();
		ca.insertText(spec.getSecondDimBox(), Size6);
		ca.eleToBeClickable();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		waitForElementClickable(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.click(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.click(spec.getTwoDimensionCheckBox());
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeInputBox(),TwoDSizeName4);
		ca.eleToBeClickable();
		ca.insertText(spec.getOneDimBox(),Size2);
		ca.eleToBeClickable();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		ca.eleToBeClickable();
		ca.insertText(spec.getSecondDimBox(), Size4);
		ca.eleToBeClickable();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		waitForElementClickable(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.click(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.click(spec.getTwoDimensionCheckBox());
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeInputBox(),TwoDSizeName5);
		ca.eleToBeClickable();
		ca.insertText(spec.getOneDimBox(),Size2);
		ca.eleToBeClickable();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		ca.eleToBeClickable();
		ca.insertText(spec.getSecondDimBox(), Size5);
		ca.eleToBeClickable();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		waitForElementClickable(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.click(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.click(spec.getTwoDimensionCheckBox());
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeInputBox(),TwoDSizeName6);
		ca.eleToBeClickable();
		ca.insertText(spec.getOneDimBox(),Size2);
		ca.eleToBeClickable();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		ca.eleToBeClickable();
		ca.insertText(spec.getSecondDimBox(), Size6);
		ca.eleToBeClickable();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		waitForElementClickable(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.click(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.click(spec.getTwoDimensionCheckBox());
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeInputBox(),TwoDSizeName7);
		ca.eleToBeClickable();
		ca.insertText(spec.getOneDimBox(),Size3);
		ca.eleToBeClickable();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		ca.eleToBeClickable();
		ca.insertText(spec.getSecondDimBox(), Size4);
		ca.eleToBeClickable();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		waitForElementClickable(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.click(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.click(spec.getTwoDimensionCheckBox());
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeInputBox(),TwoDSizeName8);
		ca.eleToBeClickable();
		ca.insertText(spec.getOneDimBox(),Size3);
		ca.eleToBeClickable();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		ca.eleToBeClickable();
		ca.insertText(spec.getSecondDimBox(), Size5);
		ca.eleToBeClickable();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		waitForElementClickable(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.click(spec.getNewSizeAction());
		ca.eleToBeClickable();
		ca.click(spec.getTwoDimensionCheckBox());
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeInputBox(),TwoDSizeName9);
		ca.eleToBeClickable();
		ca.insertText(spec.getOneDimBox(),Size3);
		ca.eleToBeClickable();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		ca.eleToBeClickable();
		ca.insertText(spec.getSecondDimBox(), Size6);
		ca.eleToBeClickable();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
	}

	@And("Create size range for the sizes {string},{string},{string},{string}")
	public void createSizeRangeForTheSizes(String SR_name, String desc, String type1, String type2) throws Throwable {

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
		waitForElementClickable(spec.getSizeRangeTab());
		ca.eleToBeClickable();
		ca.click(spec.getSizeRangeTab());
		jsWaitForPageLoad();
		ca.eleToBeClickable();
		waitForElementClickable(spec.getSizeRangeAction());
		ca.click(spec.getSizeRangeAction());
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeRangeName(), SR_name);
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeRangeDescription(), desc);
		ca.eleToBeClickable();
		ca.click(spec.getTwoDimensionCheckBox());
		ca.eleToBeClickable();
		WebElement dimension = spec.getSizeRangeOneDimBox();
		dimension.clear();
		ca.insertText(spec.getSizeRangeOneDimBox(), type1);
		ca.eleToBeClickable();
		Actions a = new Actions(driver);
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		ca.eleToBeClickable();
		WebElement dimension1 = spec.getSizeRangeSecondDimDox();
		dimension1.clear();
		ca.insertText(spec.getSizeRangeSecondDimDox(), type2);
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		in.Inssavebtn();
		ca.eleToBeClickable();
	}

	@Then("User selects the sizes for the created size range {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void userSelectsTheSizesForTheCreatedSizeRange(String TwoDSizeName1, String TwoDSizeName2, String TwoDSizeName3, String TwoDSizeName4, String TwoDSizeName5, String TwoDSizeName6, String TwoDSizeName7, String TwoDSizeName8,String TwoDSizeName9,String sizeName) throws Throwable {
		Actions a = new Actions(driver);
		WebElement SizeName = driver.findElement(By.xpath("//a[@class='browse' and text()]/parent::td"));
		String storeNode = SizeName.getAttribute("data-csi-url");
		WebElement codeCell = driver.findElement(By.xpath("//tr[@data-csi-result='" + storeNode + "']//following::td[@data-csi-act='Sizes::0']"));
		ca.eleToBeClickable();
		try{
			ca.eleToBeClickable();
			//ca.jsScrollPageDown(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));


			for(int j = 1; j <=50; j++ ){
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Size')]//span[text()='+']/parent::div")));
				if(codeCell.isDisplayed()){

					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Size')]//span[text()='+']/parent::div")));
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Size')]//span[text()='+']/parent::div")));

					ca.eleToBeClickable();
					break;
				}
			}
		}catch (Exception exception) {
			// TODO: handle exception
		}

		ca.click(codeCell);
		ca.eleToBeClickable();
		driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + TwoDSizeName1 + "']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + TwoDSizeName2 + "']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + TwoDSizeName3 + "']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + TwoDSizeName4 + "']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + TwoDSizeName5 + "']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + TwoDSizeName6 + "']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + TwoDSizeName7 + "']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + TwoDSizeName8 + "']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + TwoDSizeName9 + "']")).click();
		ca.click(spec.getSizeRangeTab());
	}

	@And("User creates simple size range for validation {string},{string},{string}")
	public void userCreatesSimpleSizeRangeForValidation(String Simple1, String Simple2, String Composite) throws Throwable {
		Actions actions = new Actions(driver);
		waitForElementClickable(spec.getSizeRangeAction());
		ca.eleToBeClickable();
		ca.click(spec.getSizeRangeAction());
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeRangeName(),Simple1);
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeRangeDescription(), "SortOderValidation");
		ca.eleToBeClickable();
		WebElement dimension = spec.getSRDimensionTypeBx();
		ca.eleToBeClickable();
		actions.moveToElement(dimension).click(dimension).build().perform();
		ca.eleToBeClickable();
		ca.insertText(dimension,"Size");
		ca.eleToBeClickable();
		in.Inssavebtn();
		ca.eleToBeClickable();

		waitForElementClickable(spec.getSizeRangeAction());
		ca.eleToBeClickable();
		ca.click(spec.getSizeRangeAction());
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeRangeName(),Simple2);
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeRangeDescription(), "SortOderValidation");
		ca.eleToBeClickable();
		actions.moveToElement(dimension).click(dimension).build().perform();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(dimension);
		ca.insertText(dimension,"Size");
		in.Inssavebtn();
		ca.eleToBeClickable();

		waitForElementClickable(spec.getSizeRangeAction());
		ca.eleToBeClickable();
		ca.click(spec.getSizeRangeAction());
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeRangeName(),Composite);
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeRangeDescription(), "SortOderValidation");
		ca.eleToBeClickable();
		actions.moveToElement(dimension).click(dimension).build().perform();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(dimension);
		ca.insertText(dimension,"Size");
		in.Inssavebtn();
		ca.eleToBeClickable();

		ca.eleToBeClickable();
		ca.click(spec.getSizeRangeAction());
		ca.eleToBeClickable();
		ca.insertText(spec.getSizeRangeName(), "Simple2");
		ca.eleToBeClickable();
		System.out.println("Sort order validated completed for size Range");
		ca.click(spec.getCancel());
		ca.eleToBeClickable();
	}


	@Then("Merging of composite size type {string},{string},{string},{string},{string},{string},{string},{string}")
	public void mergingOfCompositeSizeType(String Size1, String Size2, String Size3, String Size4, String Size5, String Size6, String Simple1, String Simple2) throws Throwable {
		ca.eleToBeClickable();
		WebElement SizeName = driver.findElement(By.xpath("(//a[@class='browse'])[3]/parent::td"));
		String storeNode = SizeName.getAttribute("data-csi-url");
		WebElement codeCell = driver.findElement(By.xpath("(//a[text()='MensJeans']/parent::td//following::td[@data-csi-act='Sizes::0'])[1]"));
		ca.eleToBeClickable();
		waitForElementClickable(codeCell);
		codeCell.click();
		ca.eleToBeClickable();
		driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + Size1 + "']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + Size2 + "']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + Size3 + "']")).click();
		ca.eleToBeClickable();
		ca.click(spec.getSizeRangeTab());

		ca.eleToBeClickable();
		WebElement SizeName2 = driver.findElement(By.xpath("(//a[@class='browse'])[2]/parent::td"));
		String storeNode2 = SizeName2.getAttribute("data-csi-url");
		WebElement codeCell2 = driver.findElement(By.xpath("(//a[text()='MensPants']/parent::td//following::td[@data-csi-act='Sizes::0'])[1]"));
		ca.eleToBeClickable();
		waitForElementClickable(codeCell2);
		codeCell2.click();
		ca.eleToBeClickable();
		driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + Size4 + "']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + Size5 + "']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + Size6 + "']")).click();
		ca.eleToBeClickable();
		ca.click(spec.getSizeRangeTab());
		ca.eleToBeClickable();

	}


	@Then("Validate the options like copy and delete for size Range {string},{string}")
	public void validateTheOptionsLikeCopyAndDeleteForSizeRange(String duplicateSize, String sizeRangeName) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		java.util.List<WebElement> optionCount = driver.findElements(By.xpath("//span[@data-csi-act='Copy']"));
		optionCount.size();

		ca.eleToBeClickable();
		driver.findElement(By.xpath("(//a[@class='browse' and text()='" + sizeRangeName + "']//following::span[@data-csi-act='Copy'])[1]")).click();
		ca.eleToBeClickable();
		WebElement copyOption = wait.until(ExpectedConditions.elementToBeClickable((spec.getSizeRangeName())));
		copyOption.clear();
		ca.eleToBeClickable();
		copyOption.sendKeys(duplicateSize);
		ca.eleToBeClickable();
		Boolean save_Copy = driver.findElement(By.cssSelector("span[data-csi-act='Save_Copy']")).isDisplayed();
		System.out.println("The Popup contains Save&Copy button" + " -" + save_Copy);
		Boolean cancel = driver.findElement(By.cssSelector("span[data-csi-act='Cancel']")).isDisplayed();
		System.out.println("The Popup contains Cancel button" + "- " + cancel);
		ca.click(cp.getSaveBtn());

		WebElement delete = driver.findElement(By.xpath("//a[@class='browse' and text()='" + duplicateSize + "']//following::span[@data-csi-act='Delete']"));
		ca.eleToBeClickable();
		delete.click();
		ca.eleToBeClickable();
		driver.findElement(By.xpath("(//span[contains(text(),'Delete')])[2]")).click();
		System.out.println("The copy color specification is deleted ");
	}

	@And("Create a Size Map and validate the status {string},{string},{string},{string}")
	public void createASizeMapAndValidateTheStatus(String SizeName, String CompositeName, String SizeMapName, String deactivateSize) throws Throwable {
		ca.eleToBeClickable();
		driver.findElement(By.xpath("(//a[@class='browse'])[4]")).click();
		jsWaitForPageLoad();
		ca.eleToBeClickable();
		ca.click(spec.getSRSizeMapTab());
		jsWaitForPageLoad();
		waitForElementClickable(spec.getSRSizeMapAction());
		ca.click(spec.getSRSizeMapAction());
		ca.eleToBeClickable();
		ca.insertText(spec.getTargetSizeRangeBox(), CompositeName);
		ca.eleToBeClickable();
		Actions a = new Actions(driver);
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		ca.eleToBeClickable();
		ca.insertText(spec.getSRSizeMapName(), SizeMapName);
		in.Inssavebtn();
		WebElement sizeMapName = driver.findElement(By.xpath("//td[text()='" + SizeMapName + "']//following::span[@data-csi-act='EditMapping']"));
		waitForElementClickable(sizeMapName);
		ca.click(sizeMapName);
		ca.eleToBeClickable();
		WebElement SourceSize = driver.findElement(By.xpath("//td[contains(text(),'" + deactivateSize + "')]//following::td[1]"));
		ca.eleToBeClickable();
		Commonactions.clickjs(SourceSize);
		ca.eleToBeClickable();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		in.Inssavebtn();
		ca.eleToBeClickable();
		WebElement statusChecker = driver.findElement(By.xpath("//td[text()='" + SizeMapName + "']//following::input[@aria-checked='false']"));
		Boolean check = statusChecker.isSelected();
		if (check.equals(false)) {
			statusChecker.click();
			ca.eleToBeClickable();
			ca.click(spec.getMakeActiveBtn());
		} else {
			System.out.println("The Size Map status is not active");
		}
	}

	@When("User creates the Custom view and add the options to the table {string},{string}")
	public void userCreatesTheCustomViewAndAddTheOptionsToTheTable(String colorway, String ColourSpec) throws Throwable {
		ca.eleToBeClickable();
		if (spec.getCancel().isDisplayed()) {
			spec.getCancel().click();
		}
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		Actions a = new Actions(driver);
		a.moveToElement(shp.getStyleViewBtn()).click(shp.getStyleViewBtn()).build().perform();
		ca.eleToBeClickable();
		ca.click(shp.getStyleManageCVBtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getCopyCV_Option());
		ca.click(cp.getCopyCV_Option());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getCopyNameTxt_bx());
		cp.getCopyNameTxt_bx().clear();
		ca.eleToBeClickable();
		ca.insertText(cp.getCopyNameTxt_bx(), "CV_Copy");
		ca.eleToBeClickable();
		ca.click(shp.getCV_colorwayOption());
		Select dropdown = new Select(cp.getAttributesBox());
		ca.eleToBeClickable();
		dropdown.selectByVisibleText(colorway);
		ca.eleToBeClickable();
		dropdown.selectByVisibleText(ColourSpec);
		ca.eleToBeClickable();
		ca.click(cp.getCV_AddBtn());
		ca.eleToBeClickable();
		in.Inssavebtn();
		ca.eleToBeClickable();
	}

	@And("Create Style followed by its style Type {string},{string}")
	public void createStyleFollowedByItsStyleType(String a, String b) throws Throwable {
		ca.eleToBeClickable();
		Commonactions.isElementPresent(pup.getStyle_type_Value());
		ca.insertText(pup.getStyle_type_Value(), a);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(pup.getSstyle_Value());
		ca.insertText(pup.getSstyle_Value(), a);
		Commonactions.isElementPresent(pup.getSave_and_new_Btn());
		ca.click(pup.getSave_and_new_Btn());
		ca.eleToBeClickable();

		// ca.eleToBeClickable();
		Commonactions.isElementPresent(pup.getStyle_type_Value());
		ca.insertText(pup.getStyle_type_Value(), b);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(pup.getSstyle_Value());
		ca.insertText(pup.getSstyle_Value(), b);
		Commonactions.isElementPresent(pup.getSave_and_new_Btn());
		ca.click(pup.getSave_and_new_Btn());
		ca.eleToBeClickable();

	}

	@And("Create Style followed by its style Type {string},{string},{string},{string},{string},{string},{string},{string}")
	public void createStyleFollowedByItsStyleType(String a, String b, String c, String d, String name1, String name2, String name3, String name4) throws Throwable {
		ca.eleToBeClickable();
		Commonactions.isElementPresent(pup.getStyle_type_Value());
		ca.insertText(pup.getStyle_type_Value(), a);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(pup.getSstyle_Value());
		ca.insertText(pup.getSstyle_Value(), name1);
		Commonactions.isElementPresent(pup.getSave_and_new_Btn());
		ca.click(pup.getSave_and_new_Btn());
		ca.eleToBeClickable();

		// ca.eleToBeClickable();
		Commonactions.isElementPresent(pup.getStyle_type_Value());
		ca.insertText(pup.getStyle_type_Value(), b);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(pup.getSstyle_Value());
		ca.insertText(pup.getSstyle_Value(), name2);
		Commonactions.isElementPresent(pup.getSave_and_new_Btn());
		ca.click(pup.getSave_and_new_Btn());
		ca.eleToBeClickable();

		// ca.eleToBeClickable();
		Commonactions.isElementPresent(pup.getStyle_type_Value());
		ca.insertText(pup.getStyle_type_Value(), c);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(pup.getSstyle_Value());
		ca.insertText(pup.getSstyle_Value(), name3);
		Commonactions.isElementPresent(pup.getSave_and_new_Btn());
		ca.click(pup.getSave_and_new_Btn());
		ca.eleToBeClickable();

		// ca.eleToBeClickable();
		Commonactions.isElementPresent(pup.getStyle_type_Value());
		ca.insertText(pup.getStyle_type_Value(), d);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(pup.getSstyle_Value());
		ca.insertText(pup.getSstyle_Value(), name4);
		Commonactions.isElementPresent(pup.getSave_Btn());
		ca.click(pup.getSave_Btn());
		ca.eleToBeClickable();

		System.out.println("style created successfully");
	}

	@And("User deletes the unwanted attributes from custom views column for styles {string},{string},{string},{string},{string}")
	public void userDeletesTheUnwantedAttributesFromCustomViewsColumnForStyles(String arg0, String arg1, String arg2, String arg3,String arg4) throws InterruptedException {
		try {
			ca.eleToBeClickable();
			ca.eleToBeClickable();
			Actions a = new Actions(driver);
			a.moveToElement(shp.getStyleViewBtn()).click(shp.getStyleViewBtn()).build().perform();
			ca.eleToBeClickable();
			ca.click(shp.getStyleManageCVBtn());
			ca.eleToBeClickable();
			Select dropdown = new Select(cp.getSelectedAttributesBox());
			ca.eleToBeClickable();
			dropdown.selectByVisibleText(arg0);
			dropdown.selectByVisibleText(arg1);
			dropdown.selectByVisibleText(arg2);
			dropdown.selectByVisibleText(arg3);
			dropdown.selectByVisibleText(arg4);
			ca.eleToBeClickable();
			ca.click(cp.getCV_RemoveBtn());
			ca.eleToBeClickable();
			ca.click(mp.getSave_btn1());
			System.out.println("The custom view is created successfully with the given options");
		}catch (Exception e){
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
	}

	@Then("User selects the size range for the styles {string},{string},{string},{string},{string},{string},{string},{string}")
	public void userSelectsTheSizeRangeForTheStyles(String Style1, String Style2, String Style3, String Style4,String SizeRange1, String SizeRange2, String SizeRange3, String SizeRange4) throws Throwable {
		ArrayList<String> styles=new ArrayList<String>();
		styles.add(Style1);
		styles.add(Style2);
		styles.add(Style3);
		styles.add(Style4);
		ArrayList<String> SizeRanges=new ArrayList<String>();
		SizeRanges.add(SizeRange4);
		SizeRanges.add(SizeRange2);
		SizeRanges.add(SizeRange1);
		SizeRanges.add(SizeRange3);
		int list = styles.size();
		for (int i = 0; i <list ; i++) {
			ca.eleToBeClickable();
			WebElement nameNode = driver.findElement(By.xpath("//a[@class='browse' and text()='" + styles.get(i) + "']"));
			WebElement values = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + styles.get(i) + "'])/parent::td"));
			String storeNode = values.getAttribute("data-csi-url");
			WebElement codeCell = driver.findElement(By.xpath("//tr[@data-csi-result='" + storeNode + "']/td[@data-csi-heading='ActualSizeRange:Child:Attributes:0']"));
			ca.eleToBeClickable();
			codeCell.click();
			ca.eleToBeClickable();
			WebElement size = driver.findElement(By.xpath("//a[@class='browse' and text()='" + styles.get(i) + "']//following::td[@data-csi-heading='ActualSizeRange:Child:Attributes:0']"));
			ca.eleToBeClickable();
			Actions builder = new Actions(driver);
			builder.moveToElement(size).click(size);
			builder.perform();
			ca.eleToBeClickable();
			//ca.insertText(spec.getRF_InputText(), SizeRange1);
			WebElement sizerange = driver.findElement(By.xpath("//div[@class='dijitReset dijitMenuItem' and contains(text(),'" + SizeRanges.get(i) + "')]"));
			ca.eleToBeClickable();
			sizerange.click();
		}
	}

	@And("user selects the colorway for the styles {string},{string}")
	public void userSelectsTheColorwayForTheStyles(String searchtype, String stylename) throws Throwable {
		ca.eleToBeClickable();
		Actions a = new Actions(driver);
		ca.eleToBeClickable();
		a.moveToElement(shp.getSearchOptionBtn()).click(shp.getSearchOptionBtn()).build().perform();
		ca.eleToBeClickable();
		driver.findElement(By.xpath("//td[text()='" + stylename + "']")).click();
		ca.eleToBeClickable();
		ca.insertText(shp.getSearchInput(),searchtype);
		ca.eleToBeClickable();
		a.sendKeys(Keys.ENTER).build().perform();
		ca.eleToBeClickable();
		a.sendKeys(Keys.TAB).build().perform();
		a.sendKeys(Keys.TAB).build().perform();
		a.sendKeys(Keys.TAB).build().perform();
		ca.eleToBeClickable();
		a.sendKeys(Keys.ENTER).build().perform();

	}

	@Then("User creates the colorway for the style and maps it {string},{string}")
	public void userCreatesTheColorwayForTheStyleAndMapsIt(String color1, String color2) throws Throwable {
		Actions a = new Actions(driver);
		jsWaitForPageLoad();
		ca.eleToBeClickable();
		driver.navigate().refresh();
		jsWaitForPageLoad();
		ca.eleToBeClickable();
		//---------------------------------------parallel-------------------------------------\\

		WebElement styleTab = driver.findElement(By.xpath("//*[@data-csi-tab-name='Style']"));
		Commonactions.isElementPresent(styleTab);
		ca.click(styleTab);




		//-------------------------------------------------------------------------------------\\
		ca.click(shp.getStyleColorwayTab());
		Commonactions.isElementPresent(shp.getNewColorwayArrowBtn());
		ca.click(shp.getNewColorwayArrowBtn());
		ca.eleToBeClickable();
		a.moveToElement(shp.getNFCBtn()).click(shp.getNFCBtn()).build().perform();
		ca.eleToBeClickable();
		driver.findElement(By.xpath("//td[contains(text(),'" + color1 + "')]")).click();
		driver.findElement(By.xpath("//td[contains(text(),'" + color2 + "')]")).click();
		ca.eleToBeClickable();
		ca.click(cp.getCV_PopUpSaveBtn());
		Commonactions.isElementPresent(cp.getCV_PopUpSaveBtn());
		ca.click(cp.getCV_PopUpSaveBtn());
		ca.eleToBeClickable();
		ca.click(cp.getCV_PopUpSaveBtn());
		ca.eleToBeClickable();
	}

	@When("User selects the colorway through option from the styles page itself {string}")
	public void userSelectsTheColorwayThroughOptionFromTheStylesPageItself(String style) throws Throwable {
		ca.eleToBeClickable();
		jsWaitForPageLoad();
		driver.findElement(By.xpath("//a[@class='browse' and text()='" + style + "']//following::span[@data-csi-act='PopupColorways'][1]")).click();
		Actions a = new Actions(driver);
		Commonactions.isElementPresent(shp.getNowColorwayAction());
		ca.click(shp.getNowColorwayAction());
		Commonactions.isElementPresent(shp.getCCSpecCheckBoxInStyleHicPage());
		ca.eleToBeClickable();
		ca.click(shp.getCCSpecCheckBoxInStyleHicPage());
		ca.eleToBeClickable();
		ca.insertText(shp.getColorwayNameStylePage(),"11-0304 WATER LILY");
		Commonactions.isElementPresent(cp.getSaveBtn());
		ca.click(cp.getSaveBtn());
		ca.eleToBeClickable();
		ca.click(shp.getCloseBtn());
		ca.eleToBeClickable();
	}


	@And("Create Brand by providing valid and mandatory data {string}")
	public void createBrandByProvidingValidAndMandatoryData(String a) throws Throwable {
		ca.eleToBeClickable();
		ca.insertText(pup.getBrand_Value(), a);
	}

	@Then("Click New department by providing valid data {string}")
	public void clickNewDepartmentByProvidingValidData(String a) throws Throwable {
		ca.eleToBeClickable();
		ca.jsScrollPageDown(spk.getNew_season_Btn());
		ca.click(spk.getNew_season_Btn());
	}

	@And("Create collection by providing valida and mandatory details {string}")
	public void createCollectionByProvidingValidaAndMandatoryDetails(String a) throws Throwable {
		ca.eleToBeClickable();
		Actions actions = new Actions(driver);
		try{
			ca.click(spk.getCollectionTempBtn());
		}catch (Exception e) {

			Commonactions.isElementPresent(pup.getCancel_Btn());
			ca.click(pup.getCancel_Btn());
			ca.click(driver.findElement(By.xpath("//span[@data-csi-automation='plugin-Category1-Category2s-refresh']//span[@title='Refresh View']")));
			ca.eleToBeClickable();
			ca.click(driver.findElement(By.xpath("//td[@data-csi-heading='Node Name::0']/a")));
			Commonactions.isElementPresent(spk.getNew_season_Btn());
			ca.jsScrollPageDown(spk.getNew_season_Btn());
			ca.click(spk.getNew_season_Btn());
			ca.eleToBeClickable();
			Commonactions.isElementPresent(spk.getCollectionTempBtn());
			ca.click(spk.getCollectionTempBtn());

		}

		ca.eleToBeClickable();
		actions.sendKeys(Keys.DOWN).build().perform();
		actions.sendKeys(Keys.DOWN).build().perform();
		actions.sendKeys(Keys.ENTER).build().perform();
		ca.eleToBeClickable();
	}

	@Then("Create the Enum value for the print technique {string}")
	public void createTheEnumValueForThePrintTechnique(String a) throws Throwable {
		String[] printTechnique;
		Actions actions = new Actions(driver);
		ca.eleToBeClickable();
		printTechnique = a.split(",");
		for (int i = 0; i < printTechnique.length; i++) {
			Commonactions.isElementPresent(sp.getNewEnumValueBtn());
			ca.click(sp.getNewEnumValueBtn());
			Commonactions.isElementPresent(sp.getNewEnumValueInputTxtBx());
			ca.insertText(sp.getNewEnumValueInputTxtBx(),printTechnique[i].trim());
			Commonactions.isElementPresent(mp.getSave_btn1());
			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable();
		}
	}

	@Then("Create the Enum value for the sizes {string}")
	public void createTheEnumValueForTheSizes(String a) throws Throwable {
		String[] printType;
		Actions actions = new Actions(driver);
		ca.eleToBeClickable();
		printType = a.split(",");
		for (int i = 0; i < printType.length; i++) {
			ca.eleToBeClickable();
			actions.moveToElement(sp.getUser_NewEnumValue()).click(sp.getUser_NewEnumValue()).build().perform();
			ca.eleToBeClickable();
			ca.insertText(sp.getUser_NewEnumName(), printType[i]);
			ca.eleToBeClickable();
			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable();
		}
	}

	@When("Setup Enum for size print tech in setup page {string},{string}")
	public void setupEnumForSizePrintTechInSetupPage(String Enum,String b) throws Throwable {
		Commonactions.isElementPresent(sp.getUser_Enumerations());
		ca.click(sp.getUser_Enumerations());
		ca.eleToBeClickable();
		ca.click(sp.getUser_EnumDropBox());
		ca.eleToBeClickable();
		driver.findElement(By.xpath("//label[contains(text(),'" + b + "')]")).click();
		ca.eleToBeClickable();
		WebElement element = driver.findElement(By.xpath("//label[contains(text(),'" + Enum + "')]"));
		Commonactions.isElementPresent(element);
		element.click();
		ca.eleToBeClickable();
		ca.click(sp.getUser_Enumerations());
	}
}



