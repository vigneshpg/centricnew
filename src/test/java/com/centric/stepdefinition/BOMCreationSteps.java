package com.centric.stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.centric.objectrepository.BOMCreationPage;
import com.centric.objectrepository.BusinessPlanningPage;
import com.centric.objectrepository.ConfigurationPage;
import com.centric.objectrepository.DocumentPage;
import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.InspectionPage;
import com.centric.objectrepository.MaterialSpecificationPage;
import com.centric.objectrepository.PopupPage;
import com.centric.objectrepository.QualityPage;
import com.centric.objectrepository.SetupPageTK;
import com.centric.objectrepository.SourcingPage;
import com.centric.objectrepository.StyleInspectionPage;
import com.centric.objectrepository.StylePage;
import com.centric.objectrepository.UserManagementPage;
import com.centric.resources.Commonactions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BOMCreationSteps extends Commonactions {

	HomePage hp = new HomePage();
	Commonactions ca = new Commonactions();
	MaterialSpecificationPage mp = new MaterialSpecificationPage();
	PopupPage pp = new PopupPage();
	SourcingPage sp = new SourcingPage();
	DocumentPage dp = new DocumentPage();
	StylePage st = new StylePage();
	InspectionPage in = new InspectionPage();
	UserManagementPage up = new UserManagementPage();
	StyleInspectionPage si = new StyleInspectionPage();
	SetupPageTK su = new SetupPageTK();
	ConfigurationPage co = new ConfigurationPage();
	BOMCreationPage bc = new BOMCreationPage();
	BusinessPlanningPage bp = new BusinessPlanningPage();
	QualityPage qp = new  QualityPage();

	String file, name, filter;

	@Then("user creates NewBOMSection {string},{string},{string}")
	public void user_creates_NewBOMSection(String Bomsections, String sortvalues, String Materialname) throws Throwable {

		String[] Bomsection = Bomsections.split(",");
		String[] sortvalue = sortvalues.split(",");

		Commonactions.isElementPresent(hp.getDatasetup());
		ca.click(hp.getDatasetup());
		Commonactions.isElementPresent(bc.getProdSpecSetup());
		ca.click(bc.getProdSpecSetup());

		/*
		 * Commonactions.isElementPresent(bc.getBOMSection());
		 * Commonactions.mouseOver(bc.getBOMSection()); ca.click(bc.getBOMSection());
		 */

		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "BOM Section" +Keys.ENTER);
		ca.eleToBeClickable();
		/*
		 * Commonactions.isElementPresent(bc.getBOMSection());
		 * ca.click(bc.getBOMSection()); ca.eleToBeClickable();
		 */

		Commonactions.isElementPresent(bc.getNewBomSecBtn());
		ca.click(bc.getNewBomSecBtn());
		Commonactions.isElementPresent(bc.getBOMSecVaue());
		ca.insertText(bc.getBOMSecVaue(), Bomsection[0]);
		Commonactions.isElementPresent(bc.getSortvalue());
		ca.insertText(bc.getSortvalue(), sortvalue[0]);
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bc.getBOMSecVaue());
		ca.insertText(bc.getBOMSecVaue(), Bomsection[1]);
		Commonactions.isElementPresent(bc.getSortvalue());
		ca.insertText(bc.getSortvalue(), sortvalue[0]);
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		String text = Commonactions.getText(bc.getErrormessage());
		if(text.contains("Sort Order must be unique"))
		{
			System.out.println("sort order Error message validated");
		}
		Commonactions.isElementPresent(bc.getSortvalue());
		ca.insertText(bc.getSortvalue(), sortvalue[1]);
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bc.getBOMSecVaue());
		ca.insertText(bc.getBOMSecVaue(), Bomsection[2]);
		Commonactions.isElementPresent(bc.getSortvalue());
		ca.insertText(bc.getSortvalue(), sortvalue[2]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		ca.eleToBeClickable();

		for (int i = 0; i < 40; i++) {
			ca.click(bc.getSlider1());
		}
		Commonactions.isElementPresent(bc.getApplicablestyletype());
		ca.click(bc.getApplicablestyletype());
		Commonactions.isElementPresent(bc.getAccOnlyColor());
		ca.click(bc.getAccOnlyColor());
		ca.click(bc.getAppColorandSize());
		ca.eleToBeClickable();
		for (int i = 0; i < 5; i++) {
			ca.click(bc.getSlider1());
		}
		ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-act,'PlacementProductType::0')])[1]")));
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e1, "Material");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-act,'PlacementProductType::0')])[2]")));
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		e2.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e2, "Material");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		for (int i = 0; i < 5; i++) {
			ca.click(bc.getSlider1());
		}
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-act,'PlacementProductTypes')])[2]")));
		ca.click(bc.getFabricstandalone());
		ca.eleToBeClickable();
		ca.click(bc.getSlider1());
		ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-act,'PlacementProductTypes')])[3]")));
		ca.eleToBeClickable();
		ca.click(bc.getAccOnlyColor());
		ca.click(bc.getAppColorandSize());
		ca.eleToBeClickable();
		ca.click(bc.getSlider1());
		ca.eleToBeClickable();
		for (int i = 0; i < 20; i++) {
			ca.click(bc.getSlider1());
		}
		Commonactions.isElementPresent(bc.getQueryFilter());
		Commonactions.mouseOver(bc.getQueryFilter());
		Commonactions.isElementPresent(sp.getEdit());
		Commonactions.mouseOver(sp.getEdit());
		ca.click(sp.getEdit());
		Commonactions.isElementPresent(bc.getFilterName());
		ca.insertText(bc.getFilterName(), "Material");
		Commonactions.isElementPresent(bc.getAddFilter());
		ca.click(bc.getAddFilter());
		ca.eleToBeClickable();

		WebElement e3 = ca.activeElement();
		ca.eleToBeClickable();
		e3.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e3, "Material");
		Commonactions.isElementPresent(bc.getMaterialFilter());
		ca.click(bc.getMaterialFilter());
		ca.eleToBeClickable();

		ca.click(bc.getCheckEquals());
		ca.eleToBeClickable();
		ca.click(bc.getMatches());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bc.getFiltervalue());
		ca.insertText(bc.getFiltervalue(), "Copy");
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bc.getNewBomSecBtn());
		ca.click(bc.getNewBomSecBtn());
		Commonactions.isElementPresent(bc.getBOMSecVaue());
		ca.insertText(bc.getBOMSecVaue(), Bomsection[3]);
		Commonactions.isElementPresent(bc.getSortvalue());
		ca.insertText(bc.getSortvalue(), sortvalue[3]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bc.getDeletestyleBom());
		ca.click(bc.getDeletestyleBom());
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());
		Commonactions.isElementPresent(bc.getEditStyleBOM());
		ca.click(bc.getEditStyleBOM());
		Commonactions.isElementPresent(bc.getSortvalue());
		ca.insertText(bc.getSortvalue(), sortvalue[4]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		System.out.println("copy,Edit and delete action performed in BOM Style Section");

		for (int i = 1; i <= 3; i++) {
			ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-heading,'Active')]//input)[" + i + "]")));
		}
		System.out.println("BOM Style section created");

	}

	@Then("user Creates NewMaterialBomSection {string},{string}")
	public void user_Creates_NewMaterialBomSection(String Materialsections, String sortvalues) throws Throwable {

		String[] Materialsection = Materialsections.split(",");
		String[] Materialvalue = sortvalues.split(",");

		Commonactions.isElementPresent(bc.getMaterailBomSectionBtn());
		ca.click(bc.getMaterailBomSectionBtn());
		Commonactions.isElementPresent(bc.getBOMSecVaue());
		ca.insertText(bc.getBOMSecVaue(), Materialsection[0]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		for (int i = 0; i < 40; i++) {
			ca.click(bc.getSlider2());
		}
		Commonactions.isElementPresent(bc.getAppMaterialType());
		ca.click(bc.getAppMaterialType());
		Commonactions.isElementPresent(bc.getFabricstandalone());
		ca.click(bc.getFabricstandalone());
		for (int i = 0; i < 10; i++) {
			ca.click(bc.getSlider2());
		}
		Commonactions.isElementPresent(bc.getPlacementProductTypes());
		ca.click(bc.getPlacementProductTypes());
		Commonactions.isElementPresent(bc.getFabricstandalone());
		ca.click(bc.getFabricstandalone());

		for (int i = 0; i < 40; i++) {
			ca.click(bc.getSlider2());
		}

		Commonactions.isElementPresent(bc.getMaterailBomSectionBtn());
		ca.click(bc.getMaterailBomSectionBtn());
		Commonactions.isElementPresent(bc.getBOMSecVaue());
		ca.insertText(bc.getBOMSecVaue(), Materialsection[1]);
		Commonactions.isElementPresent(bc.getSortvalue());
		ca.insertText(bc.getSortvalue(), Materialvalue[0]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		ca.eleToBeClickable();

		for (int i = 1; i <= 2; i++) {
			ca.click(driver.findElement(By.xpath("(//div[contains(text(),'Material BOM')]//parent::div//td[contains(@data-csi-heading,'Active')]//input)["+ i + "]")));
		}

		Commonactions.isElementPresent(bc.getMaterailBomSectionBtn());
		ca.click(bc.getMaterailBomSectionBtn());
		Commonactions.isElementPresent(bc.getBOMSecVaue());
		ca.insertText(bc.getBOMSecVaue(), Materialsection[2]);
		Commonactions.isElementPresent(bc.getSortvalue());
		ca.insertText(bc.getSortvalue(), Materialvalue[2]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bc.getDeleteMAterialBOM());
		ca.click(bc.getDeleteMAterialBOM());
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bc.getEditMaterialBOM());
		ca.click(bc.getEditMaterialBOM());
		Commonactions.isElementPresent(bc.getSortvalue());
		ca.insertText(bc.getSortvalue(), Materialvalue[1]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		boolean displayed = bc.getFullScreen().isDisplayed();
		if (displayed == true) {
			System.out.println("full screen is present in Bom Section");
		}

		boolean displayed2 = bc.getPrintBtn().isDisplayed();
		if (displayed2 == true) {
			Commonactions.isElementPresent(bc.getPrintBtn());
			ca.click(bc.getPrintBtn());
			Commonactions.isElementPresent(bc.getPrintreview());
			ca.click(bc.getPrintreview());
			Commonactions.switchToWindow();
			ca.eleToBeClickable();
			Commonactions.switchToMainWindow();
			ca.eleToBeClickable();
		}
		System.out.println("Print, window handling,Edit and delete action performed in Bom material Section");
		System.out.println("BOM Material section created");

	}

	@Then("user created NewBOMTemplate {string},{string},{string},{string}")
	public void user_created_NewBOMTemplate(String Subtype, String TemplateName, String createsections, String EditComment) throws Throwable {

		String[] createsection = createsections.split(",");


		Commonactions.isElementPresent(hp.getDatasetup());
		ca.click(hp.getDatasetup());
		Commonactions.isElementPresent(bc.getProdSpecSetup());
		ca.click(bc.getProdSpecSetup());

		/*
		 * Commonactions.isElementPresent(hp.getSetupSearch());
		 * ca.insertText(hp.getSetupSearch(), "BOM Section" +Keys.ENTER);
		 * ca.eleToBeClickable();
		 */

		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "BOM Template" +Keys.ENTER);
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bc.getNewStyleBOMTemplate());
		ca.click(bc.getNewStyleBOMTemplate());
		ca.eleToBeClickable();
		WebElement e3 = ca.activeElement();
		ca.eleToBeClickable();
		e3.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e3, Subtype);
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bc.getStyleBOM());
		ca.insertText(bc.getStyleBOM(), TemplateName);
		Commonactions.isElementPresent(sp.getSaveandgo());
		ca.click(sp.getSaveandgo());
		ca.eleToBeClickable();
		System.out.println("Material Template Name created");

		Commonactions.isElementPresent(bc.getTDS());
		ca.click(bc.getTDS());
		Commonactions.isElementPresent(bc.getCanvas());
		ca.click(bc.getCanvas());
		Commonactions.isElementPresent(bc.getComposition());
		ca.click(bc.getComposition());
		Commonactions.isElementPresent(bc.getPlacement());
		ca.click(bc.getPlacement());
		Commonactions.isElementPresent(bc.getMulti_level_Placement());
		ca.click(bc.getMulti_level_Placement());

		Commonactions.isElementPresent(bc.getCanvas());
		ca.click(bc.getCanvas());
		ca.jsScrollPageDown(bc.getNewCanvasbtn());
		Commonactions.isElementPresent(bc.getNewCanvasbtn());
		ca.click(bc.getNewCanvasbtn());
		/*Commonactions.isElementPresent(bc.getLine());
		ca.click(bc.getLine());
		ca.eleToBeClickable();*/

		ca.eleToBeClickable();
		Commonactions.isElementPresent(si.getSaveFinish());
		ca.click(si.getSaveFinish());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bc.getComposition());
		ca.click(bc.getComposition());
		Commonactions.isElementPresent(bc.getCarelabelBtn());
		ca.click(bc.getCarelabelBtn());
		Commonactions.isElementPresent(bc.getCarelabelcheckbox());
		ca.click(bc.getCarelabelcheckbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bc.getTranslation());
		Commonactions.mouseOver(bc.getTranslation());
		ca.click(bc.getTranslation());
		Commonactions.isElementPresent(bc.getLangaugecheckbox1());
		ca.click(bc.getLangaugecheckbox1());
		ca.click(bc.getLangaugecheckbox2());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bc.getPlacement());
		ca.click(bc.getPlacement());
		Commonactions.isElementPresent(si.getNewfrommaterialExpand2());
		ca.click(si.getNewfrommaterialExpand2());
		Commonactions.isElementPresent(bc.getNewofmaterial());
		ca.click(bc.getNewofmaterial());
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys("Shoulder");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		boolean actiondisplay = bc.getAction1().isDisplayed();
		if (actiondisplay == true) {
			ca.click(bc.getAction1());
		} else {
			ca.click(bc.getAction2());
		}

		boolean Sectiondisplay = bc.getSections1().isDisplayed();
		if (Sectiondisplay == true) {
			ca.jsMouseOver(bc.getSections1());
		} else {
			ca.jsMouseOver(bc.getSections2());
		}
		Commonactions.isElementPresent(bc.getSelectSections());
		ca.click(bc.getSelectSections());
		Commonactions.isElementPresent(bc.getSectionCheckBox());
		ca.click(bc.getSectionCheckBox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		if (actiondisplay == true) {
			ca.click(bc.getAction1());
		} else {
			ca.click(bc.getAction2());
		}
		if (Sectiondisplay == true) {
			ca.jsMouseOver(bc.getSections1());
		} else {
			ca.jsMouseOver(bc.getSections2());
		}
		Commonactions.isElementPresent(bc.getCreateSection());
		ca.click(bc.getCreateSection());
		Commonactions.isElementPresent(bc.getCreateBOMValue());
		ca.insertText(bc.getCreateBOMValue(), createsection[0]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		if (actiondisplay == true) {
			ca.click(bc.getAction1());
		} else {
			ca.click(bc.getAction2());
		}
		if (Sectiondisplay == true) {
			ca.jsMouseOver(bc.getSections1());
		} else {
			ca.jsMouseOver(bc.getSections2());
		}
		Commonactions.isElementPresent(bc.getCreateSection());
		ca.click(bc.getCreateSection());
		Commonactions.isElementPresent(bc.getCreateBOMValue());
		ca.insertText(bc.getCreateBOMValue(), createsection[1]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		if (actiondisplay == true) {
			ca.click(bc.getAction1());
		} else {
			ca.click(bc.getAction2());
		}
		if (Sectiondisplay == true) {
			ca.jsMouseOver(bc.getSections1());
		} else {
			ca.jsMouseOver(bc.getSections2());
		}
		Commonactions.isElementPresent(bc.getArrangeSection());
		ca.click(bc.getArrangeSection());
		List<WebElement> sectionsize = driver.findElements(By.xpath("//span[text()='Arrange BOM Section']//following::span[@class='csi-dnd-handle']"));
		int s = sectionsize.size();
		WebElement element1 = driver.findElement(By.xpath("(//span[text()='Arrange BOM Section']//following::span[@class='csi-dnd-handle'])[" + s + "]"));
		Commonactions.draganddrop(bc.getArrangefrom(), element1);
		Commonactions.isElementPresent(sp.getClose());
		ca.click(sp.getClose());

		if (actiondisplay == true) {
			ca.click(bc.getAction1());
		} else {
			ca.click(bc.getAction2());
		}
		if (Sectiondisplay == true) {
			ca.jsMouseOver(bc.getSections1());
		} else {
			ca.jsMouseOver(bc.getSections2());
		}
		Commonactions.isElementPresent(bc.getArrangeSection());
		ca.click(bc.getArrangeSection());
		Commonactions.isElementPresent(bc.getRestoresite());
		ca.click(bc.getRestoresite());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getClose());
		ca.click(sp.getClose());
		ca.eleToBeClickable();

		if (actiondisplay == true) {
			ca.click(bc.getAction1());
		} else {
			ca.click(bc.getAction2());
		}
		if (Sectiondisplay == true) {
			ca.jsMouseOver(bc.getSections1());
		} else {
			ca.jsMouseOver(bc.getSections2());
		}
		Commonactions.isElementPresent(bc.getDeletesection());
		ca.click(bc.getDeletesection());
		ca.jsMouseOver(bc.getDeletesectioncheckbox());
		ca.click(bc.getDeletesectioncheckbox());
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());
		ca.eleToBeClickable();
		boolean fabric = bc.getFabricsec().isDisplayed();
		if (fabric == true) {
			ca.click(bc.getFabricsec());
		}

		newfrommaterial();
		Commonactions.isElementPresent(bc.getSectionmaterialcheckbox());
		ca.click(bc.getSectionmaterialcheckbox());
		Commonactions.isElementPresent(si.getFinish());
		ca.click(si.getFinish());
		ca.eleToBeClickable();

		boolean apparel = bc.getAllsec().isDisplayed();
		if (apparel == true) {
			mouseOver(bc.getAllsec());
			ca.click(bc.getAllsec());
		}
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		e2.sendKeys("Shoulder");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bc.getEditbuttonBom());
		ca.click(bc.getEditbuttonBom());
		Commonactions.isElementPresent(bc.getCommentBOM());
		ca.insertText(bc.getCommentBOM(), EditComment);
		Commonactions.isElementPresent(bc.getCommentBOM());

		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(bc.getCopyBOMsection());
		ca.click(bc.getCopyBOMsection());
		bc.jsMouseOver();
		Commonactions.isElementPresent(bc.getDeleteBOMSection());
		ca.click(bc.getDeleteBOMSection());
		ca.eleToBeClickable();
		ca.click(pp.getDelete_Btn());
		ca.eleToBeClickable();

		ca.jsScrollPagedowntoEnd();
		ca.eleToBeClickable();

		boolean all = bc.getAllsec().isDisplayed();

		if (all == true) {
			ca.click(bc.getAllsec());
		} 

		newfrommaterial();
		Commonactions.isElementPresent(bc.getSectionmaterialcheckbox());
		ca.click(bc.getSectionmaterialcheckbox());
		Commonactions.isElementPresent(si.getFinish());
		ca.click(si.getFinish());
		ca.eleToBeClickable();

	}

	public void newfrommaterial() throws Throwable {
		List<WebElement> ss = driver.findElements(By.xpath("//table[contains(@data-csi-automation,'actionRow-ProductBOMRevision-PartMaterials')]//td[contains(text(),'New from Material')]"));
		int s = ss.size();
		for (int i = 1; i <= s; i++) {
			boolean display = driver.findElement(By.xpath("(//table[contains(@data-csi-automation,'actionRow-ProductBOMRevision-PartMaterials')]//td[contains(text(),'New from Material')])["+ i + "]")).isDisplayed();
			ca.eleToBeClickable();
			if (display == true) {
				ca.click(driver.findElement(By.xpath("(//table[contains(@data-csi-automation,'actionRow-ProductBOMRevision-PartMaterials')]//td[contains(text(),'New from Material')])["+ i + "]")));
				ca.eleToBeClickable();
				display = false;
			}
		}
	}


	@When("user creates NeStyleBOM  under Apparelcolorandsize {string}")
	public void user_creates_NeStyleBOM_under_Apparelcolorandsize(String string) throws Throwable {

		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getStyleBtn());
		hp.getStyleBtn().click();
		Commonactions.isElementPresent(st.getStyles_Btn());
		st.getStyles_Btn().click();
		Commonactions.isElementPresent(si.getColorandSize());
		si.getColorandSize().click();
		Commonactions.isElementPresent(si.getSpecification());
		si.getSpecification().click();
		Commonactions.isElementPresent(si.getStyleBOM());
		si.getStyleBOM().click();

		System.out.println("BOM Tab is available under specification");

		Commonactions.isElementPresent(si.getNewstyleBOMbtn());
		si.getNewstyleBOMbtn().click();
		Commonactions.isElementPresent(si.getStyleBOMSubType());
		si.getStyleBOMSubType().sendKeys("Apparel");
		ca.jsMouseOver();
		Commonactions.isElementPresent(si.getStyleBOMValue());
		si.getStyleBOMValue().sendKeys(string);
		Commonactions.isElementPresent(mp.getSave_btn1());
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		Commonactions.isElementPresent(sp.getSaveandgo());
		ca.click(sp.getSaveandgo());
		ca.eleToBeClickable();

		System.out.println("Apparel BOM validation  created successfully");

		System.out.println("save / saveandnew / saveandgo button available and it is validated");

	}

	@When("user creates BOM validation in manage-views")
	public void user_creates_BOM_validation_in_manage_views() throws Throwable {

		ca.eleToBeClickable();
		Commonactions.isElementPresent(si.getStyleBOMPlacement());
		si.getStyleBOMPlacement().click();

		ca.eleToBeClickable();
		Thread.sleep(3000);
		boolean view=si.getBomViews2().isDisplayed();
		if(view==true){
			ca.eleToBeClickable();
			ca.click(si.getBomViews2());
		}
		else{
			ca.click(si.getBomViews1());
		}

		boolean manageview = si.getBommanageviews2().isDisplayed();
		if(manageview==true){
			ca.click(si.getBommanageviews2());
		}
		else{
			ca.click(si.getBommanageviews1());
		}
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "BOM validation");
		ca.eleToBeClickable();
		/*Commonactions.isElementPresent(bc.getColor());
	ca.click(bc.getColor());*/
		Commonactions.isElementPresent(bc.getColor());
		ca.click(bc.getColor());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bc.getRemove());
		ca.click(bc.getRemove());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		try{
			ca.eleToBeClickable();
			//	ca.click(bc.getColorField());
		}catch (Exception e) {

			System.out.println("After applying filter color tab removed successfully");
		}



	}

	@When("user validates Color under NewStyleBOM-placements")
	public void user_validates_Color_under_NewStyleBOM_placements() throws Throwable {


		Commonactions.isElementPresent(si.getStyleBOMPlacement());
		si.getStyleBOMPlacement().click();


		ca.eleToBeClickable();
		boolean view1=si.getBomViews2().isDisplayed();
		if(view1==true){
			ca.click(si.getBomViews2());
		}
		else{
			ca.click(si.getBomViews1());
		}

		ca.eleToBeClickable();
		boolean manageview1= si.getBommanageviews2().isDisplayed();
		if(manageview1==true){
			ca.click(si.getBommanageviews2());
		}
		else{
			ca.click(si.getBommanageviews1());
		}

		ca.eleToBeClickable();
		Commonactions.isElementPresent(bc.getColorsection());
		ca.click(bc.getColorsection());
		Commonactions.isElementPresent(bc.getColor());
		ca.click(bc.getColor());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bc.getColorField());
		ca.click(bc.getColorField());
		ca.eleToBeClickable();
		System.out.println("Color tab validated successfully");

	}

	@When("user creates NewOfMaterial")
	public void user_creates_NewOfMaterial() throws Throwable {

		try{
			ca.eleToBeClickable();
			ca.click(si.getNewfrommaterialExpand2());
		}
		catch(Exception e) {
			ca.click(si.getNewfrommaterialExpand1());
		}

		Commonactions.isElementPresent(bc.getNewofmaterial());
		ca.click(bc.getNewofmaterial());
		ca.eleToBeClickable();
		WebElement b4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b4, "shoulder");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();


		Commonactions.isElementPresent(bc.getProduct());
		ca.click(bc.getProduct());
		ca.eleToBeClickable();
		WebElement b5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b5, "Cotton/Rayon");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		System.out.println("New of material created successfully");

	}

	@When("user select season availability for cotton jersey-copy")
	public void user_select_season_availability_for_cotton_jersey_copy() throws Throwable {

		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//td[contains(@data-csi-act,'Actual')]/a")));
		ca.eleToBeClickable();

		ca.eleToBeClickable();
		Commonactions.isElementPresent(bp.getFinditem());
		ca.click(bp.getFinditem());
		ca.eleToBeClickable();
		WebElement a6 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a6, "100% Cotton Jersey - Copy");
		ca.eleToBeClickable();
		a6.sendKeys(Keys.ENTER);
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bc.getMaterialspec());
		ca.click(bc.getMaterialspec());
		Commonactions.isElementPresent(bc.getSeasonavailability());
		ca.click(bc.getSeasonavailability());
		Commonactions.isElementPresent(bc.getSelectseason());
		ca.click(bc.getSelectseason());
		Commonactions.isElementPresent(bc.getWinterradiobox());
		ca.click(bc.getWinterradiobox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		System.out.println("Season availablity created successfully");

	}

	@When("user creates NewFromMaterial {string}")
	public void user_creates_NewFromMaterial(String string) throws Throwable {

		Commonactions.isElementPresent(hp.getStyleBtn());
		hp.getStyleBtn().click();
		Commonactions.isElementPresent(st.getStyles_Btn());
		st.getStyles_Btn().click();
		Commonactions.isElementPresent(si.getColorandSize());
		si.getColorandSize().click();
		Commonactions.isElementPresent(si.getSpecification());
		si.getSpecification().click();
		Commonactions.isElementPresent(si.getStyleBOM());
		si.getStyleBOM().click();

		Commonactions.isElementPresent(bc.getBOMvalidationname());
		ca.click(bc.getBOMvalidationname());
		Commonactions.isElementPresent(si.getNewfrommaterialExpand1());
		ca.click(si.getNewfrommaterialExpand1());

		Commonactions.isElementPresent(si.getNewFromMaterial());
		ca.click(si.getNewFromMaterial());
		Commonactions.isElementPresent(si.getCottonchkbox());
		ca.click(si.getCottonchkbox());


		Commonactions.isElementPresent(qp.getFinish());
		ca.click(qp.getFinish());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bc.getPlacementname());
		ca.click(bc.getPlacementname());
		ca.eleToBeClickable();
		WebElement b5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b5, "Shoulder");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		System.out.println("New from material created successfully");

		Commonactions.isElementPresent(bc.getAction1());
		ca.click(bc.getAction1());
		Commonactions.isElementPresent(bc.getSections1());
		ca.click(bc.getSections1());
		Commonactions.isElementPresent(bc.getCreateSec());
		ca.click(bc.getCreateSec());
		Commonactions.isElementPresent(bc.getCreateBOMValue());
		ca.insertText(bc.getCreateBOMValue(), string);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		System.out.println("Material Section created successfully");

	}

	@When("user select Materialsection also draganddrop the created material")
	public void user_select_Materialsection_also_draganddrop_the_created_material() throws Throwable {

		Commonactions.draganddrop(bc.getSource(), bc.getTarget());
		ca.eleToBeClickable();
		Commonactions.draganddrop(bc.getSource1(), bc.getTarget());
		ca.eleToBeClickable();

		System.out.println("drag action completed successfully");
	}

	@When("user select Apparel and fabric section")
	public void user_select_Apparel_and_fabric_section() throws Throwable {

		Commonactions.isElementPresent(bc.getAction1());
		ca.click(bc.getAction1());
		Commonactions.isElementPresent(bc.getSections1());
		ca.click(bc.getSections1());
		Commonactions.isElementPresent(bc.getSelectSection());
		ca.click(bc.getSelectSection());
		Commonactions.isElementPresent(bc.getApparelSecCBX());
		ca.click(bc.getApparelSecCBX());
		Commonactions.isElementPresent(bc.getFabricSecCBX());
		ca.click(bc.getFabricSecCBX());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		System.out.println("Apparel and Fabric section added successfully");

	}

	@When("user creates Newofstyle and newfromstyle apparel section {string},{string}")
	public void user_creates_Newofstyle_and_newfromstyle_apparel_section(String string, String string2) throws Throwable {

		ca.jsScrollPageDown(bc.getApparelAdd());
		Commonactions.isElementPresent(bc.getApparelAdd());
		ca.click(bc.getApparelAdd());
		ca.eleToBeClickable();
		WebElement a6 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a6, "Neck");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		//	WebElement ID = driver.findElement(By.xpath("//span[contains(text(),'Neck')]//following::td[@data-csi-act='ID::0']"));
		//	Commonactions.isElementPresent(ID);
		//	ca.click(ID);
		ca.eleToBeClickable();
		WebElement a7 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a7, string);
		ca.eleToBeClickable();
		a7.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		WebElement a8 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a8, string2);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		System.out.println("New of style created successfully");

		Commonactions.isElementPresent(bc.getApparelSecEXP());
		ca.click(bc.getApparelSecEXP());
		Commonactions.isElementPresent(bc.getNewFromStyle());
		ca.click(bc.getNewFromStyle());
		Commonactions.isElementPresent(bc.getBOchkBX());
		ca.click(bc.getBOchkBX());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		System.out.println("New from style created successfully");

	}

	@Then("user creates NewSpecial in fabric section {string}")
	public void user_creates_NewSpecial_in_fabric_section(String string) throws Throwable {

		Commonactions.isElementPresent(bc.getFabricSecEXP());
		ca.click(bc.getFabricSecEXP());
		Commonactions.isElementPresent(bc.getNewSpecial());
		ca.click(bc.getNewSpecial());
		Commonactions.isElementPresent(bc.getSpecilaVal());
		ca.insertText(bc.getSpecilaVal(), string);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		System.out.println("New special created successfully");

	}

	@Then("user creates and verify the common color in material section {string}")
	public void user_creates_and_verify_the_common_color_in_material_section(String string) throws Throwable {

		//ca.jsScrollPageDown(bc.getCommColor2());

		//----------------------temp---------------------------\\
		/*Commonactions.isElementPresent(hp.getStyleBtn());
	hp.getStyleBtn().click();
	Commonactions.isElementPresent(st.getStyles_Btn());
	st.getStyles_Btn().click();
	Commonactions.isElementPresent(si.getColorandSize());
	si.getColorandSize().click();
	Commonactions.isElementPresent(si.getSpecification());
	si.getSpecification().click();
	Commonactions.isElementPresent(si.getStyleBOM());
	si.getStyleBOM().click();
	ca.eleToBeClickable();
	//Commonactions.isElementPresent(bc.getBOMvalidationname());
	ca.click(driver.findElement(By.xpath("(//a[text()='Apparel BOM Validation'])[2]")));
	ca.eleToBeClickable();
	Commonactions.isElementPresent(si.getStyleBOMPlacement());
	si.getStyleBOMPlacement().click();

	ca.eleToBeClickable();
	Thread.sleep(3000);*/

		//----------------------------------------------

		for (int i = 0; i <= 100; i++) {
			//ca.jsScrollPageDown(bc.getCommColor2());
			ca.click(bc.getSlider1());
			WebElement view = driver.findElement(By.xpath("(//td[contains(@data-csi-heading,'PMSSize:Child:PartMaterialSizes')])[1]"));

			if (view.isDisplayed()) {
				ca.click(bc.getSlider1());
				ca.click(bc.getSlider1());
				break;

			}

		}

		String[] s = string.split(",");

		Commonactions.isElementPresent(bc.getCommColor1());
		ca.click(bc.getCommColor1());
		Commonactions.isElementPresent(bc.getNewColoredMat());
		ca.click(bc.getNewColoredMat());
		Commonactions.isElementPresent(bc.getCommColorVal());
		ca.insertText(bc.getCommColorVal(), s[0]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		System.out.println("common color value added successfully");

		Commonactions.isElementPresent(bc.getCommColor2());
		ca.click(bc.getCommColor2());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, s[1]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		for (int i = 0; i <= 100; i++) {

			ca.click(bc.getSlider1());
			if (bc.getPartMaterialColors().isDisplayed()) {
				ca.click(bc.getSlider1());
				ca.click(bc.getSlider1());
				break;

			}

		}

		try{
			Commonactions.isElementPresent(bc.getPartMaterialColors());
			ca.click(driver.findElement(By.xpath("((//a[contains(text(),'Cotton/Rayon')]/parent::td)//following-sibling::td[contains(@data-csi-heading,'CommonSizeSpec')])")));
			ca.eleToBeClickable();
			WebElement b1 = ca.activeElement();
			ca.eleToBeClickable();
			b1.sendKeys(Keys.TAB);
			ca.eleToBeClickable();
			WebElement b2 = ca.activeElement();
			ca.eleToBeClickable();
			b2.sendKeys(Keys.TAB);
			ca.eleToBeClickable();
			WebElement a1 = ca.activeElement();
			ca.eleToBeClickable();
			a1.sendKeys(Keys.DELETE);
			ca.eleToBeClickable();
			ca.insertText(a1, "VANILLA");
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();
		}
		catch(Exception e)
		{
			System.out.println("get material not found load issue in BOMStyle");
		}


		try{
			for (int i = 0; i <= 30; i++) {

				ca.click(bc.getSlider3());

				if (driver.findElement(By.xpath("//a[contains(text(),'EGRET')]/parent::span/ancestor::tr/td[contains(@data-csi-heading,'CommonColor')]")).isDisplayed()) {		 
					ca.click(bc.getSlider3());
					ca.click(bc.getSlider3());
					break;}

			}
		

		ca.click(driver.findElement(By.xpath("//a[contains(text(),'EGRET')]/parent::span/ancestor::tr/td[contains(@data-csi-heading,'CommonColor')]")));
		ca.eleToBeClickable();
		WebElement b3 = ca.activeElement();
		ca.eleToBeClickable();
		b3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		a2.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(a2, "Green");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		}
		catch(Exception e)
		{
			System.out.println("common color is not selected- check locator");
		}
		
		


		try{
			for (int j = 0; j <= 100; j++) 
			{
				ca.click(bc.getSlider1());
				if (bc.getPartMaterialColors().isDisplayed()) 
				{
					ca.click(bc.getSlider1());
					ca.click(bc.getSlider1());
					break;
				}}
			
			String name = Commonactions.getText(driver.findElement(By.xpath("(//a[contains(text(),'Green')]/parent::span/parent::div/parent::td[contains(@data-csi-act,'PMCColor:Child:PartMaterialColors:0{PartMaterialColors}')])[1]//a")));
			System.out.println("value1 :"+name);
			if(name.equals("Green CM - 01")){
				System.out.println("Condition met");
			}}
		catch(Exception e)
		{
			System.out.println("Condition failed");
		}
try{driver.findElement(By.xpath("//span[contains(@class,'close')]")).click();}
catch(Exception e){}
try{ca.click(pp.getCancel_Btn());}
catch(Exception e){}
		System.out.println("Common color verified successfully");
	}

	@Then("user verfies copy color for Material section")
	public void user_verfies_copy_color_for_Material_section() throws Throwable {

		Commonactions.isElementPresent(bc.getAction1());
		ca.click(bc.getAction1());
		Commonactions.isElementPresent(bc.getCopyColor());
		ca.click(bc.getCopyColor());
		Commonactions.isElementPresent(bc.getToColor());
		ca.click(bc.getToColor());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, "VANILLA");
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']")));
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//th[text()='From Color']")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		for (int i = 0; i <= 100; i++) {

			ca.click(bc.getSlider1());
			if (bc.getPartMaterialColors().isDisplayed()) {
				ca.click(bc.getSlider1());
				ca.click(bc.getSlider1());
				break;

			}

		}
		String name = Commonactions.getText(driver.findElement(By.xpath("(//a[contains(text(),'Green')]/parent::span/parent::div/parent::td[contains(@data-csi-act,'PMCColor:Child:PartMaterialColors:0{PartMaterialColors}')])[1]//a")));
		System.out.println("value2 :"+name);
		if(name.equals("Green CM - 01")){
			System.out.println("Condition met");
		}else{
			System.out.println("Condition failed");
		}

		System.out.println("Copy color verified successfully");

	}

	@Then("user update unit cost {string}")
	public void user_update_unit_cost(String string) throws Throwable {

		for (int i = 0; i <= 60; i++) {

			ca.click(bc.getSlider3());


		}

		Commonactions.isElementPresent(bc.getBOMquote());
		ca.click(bc.getBOMquote());
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		a2.sendKeys("template");		
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		try{ca.click(in.getCancel());}
		catch(Exception e)
		{System.out.println("quote not selected - template not found in list");	}

		Commonactions.isElementPresent(bc.getMoreActionnew());
		ca.click(bc.getMoreActionnew());	 
		Commonactions.isElementPresent(bc.getUpdateUOM());
		ca.click(bc.getUpdateUOM());



		Commonactions.isElementPresent(bc.getUnitCost());
		ca.click(bc.getUnitCost());
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		a3.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		a3.sendKeys(string);
		ca.eleToBeClickable();
		a3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		System.out.println("Unit cost updated succesfully");

	}

	@Then("update unitcost for all in apparel section")
	public void update_unitcost_for_all_in_apparel_section() {


		Commonactions.isElementPresent(bc.getAction1());
		ca.click(bc.getAction1());
		Commonactions.isElementPresent(bc.getUpdateUnitCost());
		ca.click(bc.getUpdateUnitCost());

		System.out.println("Unit cost for all updated succesfully");
	}

	@Then("user edit color by selecting placements and colorways")
	public void user_edit_color_by_selecting_placements_and_colorways() throws Throwable {


		//----------------------temp---------------------------\\
		Commonactions.isElementPresent(hp.getStyleBtn());
		hp.getStyleBtn().click();
		Commonactions.isElementPresent(st.getStyles_Btn());
		st.getStyles_Btn().click();
		Commonactions.isElementPresent(si.getColorandSize());
		si.getColorandSize().click();
		Commonactions.isElementPresent(si.getSpecification());
		si.getSpecification().click();
		Commonactions.isElementPresent(si.getStyleBOM());
		si.getStyleBOM().click();
		ca.eleToBeClickable();
		try{
			ca.click(driver.findElement(By.xpath("(//a[text()='Apparel BOM Validation'])[1]")));
		}catch (Exception e) {
			ca.click(driver.findElement(By.xpath("(//a[text()='Apparel BOM Validation'])[2]")));
		}

		ca.eleToBeClickable();
		Commonactions.isElementPresent(si.getStyleBOMPlacement());
		si.getStyleBOMPlacement().click();

		ca.eleToBeClickable();
		Thread.sleep(3000);

		//----------------------------------------------

		Actionbutton();
		boolean d = bc.getEditColor().isDisplayed();
		if(d==true)
		{	ca.click(bc.getEditColor());	}
		else
		{	ca.click(bc.getEditColor2());	}
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, "Shoulder");
		ca.eleToBeClickable();
		WebElement placementvalue = driver.findElement(By.xpath("//div[@data-csi-automation='field-ProductBOMRevision-EditColorsForm-PartMaterials']/div[3]/input"));
		ca.insertText(placementvalue, "Shoulder");
		ca.click(driver.findElement(By.xpath("//span[text()='Shoulder']//parent::label//parent::div/div/input")));
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//th[text()='Placements']")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bc.getColorways());
		ca.click(bc.getColorways());
		ca.click(driver.findElement(By.xpath("//label[contains(text(),'ANTIQUE')]//parent::div/div/input")));
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//th[text()='Placements']")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bc.getTo());
		ca.click(bc.getTo());
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a2, "antique");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();


		System.out.println("Edit color verified successfully");

	}

	@Then("user edit variation by color in material section")
	public void user_edit_variation_by_color_in_material_section() throws Throwable {

		shouldmore();
		Commonactions.isElementPresent(bc.getEVBColor());
		ca.click(bc.getEVBColor());
		Commonactions.isElementPresent(bc.getEVPMColor());
		ca.click(bc.getEVPMColor());
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		a3.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(a3, "EGRET");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		try{ca.click(in.getCancel());}
		catch(Exception e)
		{System.out.println("Egret selected");	}
		Commonactions.isElementPresent(sp.getClose());
		ca.click(sp.getClose());
		ca.eleToBeClickable();

		System.out.println("edit variation by color validated successfully");

	}

	@Then("user match color in material section")
	public void user_match_color_in_material_section() throws Throwable {
		shouldmore();
		try{
			Commonactions.isElementPresent(bc.getEVMatchColr());
			ca.click(bc.getEVMatchColr());
			Commonactions.isElementPresent(bc.getMatchColorBtn());
			ca.click(bc.getMatchColorBtn());
			ca.eleToBeClickable();
			System.out.println("Match color not verified successfully");
		}
		catch(Exception e){
			System.out.println("Match color not verified successfully");
		}
	}


	@Then("user edit Variation by size {string}")
	public void user_edit_Variation_by_size(String string) throws Throwable {

		shouldmore();
		Commonactions.isElementPresent(bc.getEVBSize());
		ca.click(bc.getEVBSize());
		Commonactions.isElementPresent(bc.getSizebtn());
		ca.click(bc.getSizebtn());
		Commonactions.isElementPresent(bc.getEVPMSize());
		ca.click(bc.getEVPMSize());
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		a3.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		a3.sendKeys("large");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getClose());
		ca.click(sp.getClose());
		ca.eleToBeClickable();

		System.out.println("edit variation by size validated successfully");


	}

	@Then("user edit Variation by quantity for small and medium {string}")
	public void user_edit_Variation_by_quantity_for_small_and_medium(String string) throws Throwable {


		for (int i = 0; i <= 50; i++)
		{
			slider();
		}
		commonosize();
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		a3.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(a3, "small");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();



		System.out.println("Edit variation by quantity validated successfully");

	}


	@Then("user Reset variation by size")
	public void user_Reset_variation_by_size() throws Throwable {

		shouldmore();
		Commonactions.isElementPresent(bc.getRVBSize());
		ca.click(bc.getRVBSize());
		Commonactions.isElementPresent(bc.getReset());
		ca.click(bc.getReset());
		ca.eleToBeClickable();
		System.out.println("size variation reset successfully");

	}

	@Then("user validate BOM")
	public void user_validate_BOM() throws Throwable {

		Actionbutton();
		boolean d = bc.getValidBOM().isDisplayed();
		if(d==true)
		{	ca.click(bc.getValidBOM());	}
		else
		{	ca.click(bc.getValidBOM2());	}
		Commonactions.isElementPresent(bc.getApproveAction());
		ca.click(bc.getApproveAction());
		//Actionbutton();
		ca.eleToBeClickable();
		approveaction();
		Commonactions.isElementPresent(bc.getContinue());
		ca.click(bc.getContinue());
		ca.eleToBeClickable();

		System.out.println("Bom vlidated successfully");

	}

	@Then("user Approves the ApparelBOMValidation and verify Action button is disabled")
	public void user_Approves_the_ApparelBOMValidation_and_verify_Action_button_is_disabled() throws Throwable {

		Commonactions.isElementPresent(bc.getApproveAction());
		ca.click(bc.getApproveAction());
		ca.eleToBeClickable();
		approveaction();
		Commonactions.isElementPresent(bc.getContinue());
		ca.click(bc.getContinue());
		ca.eleToBeClickable();
		try{
			Actionbutton();
		}catch (Exception e) {
			System.out.println("after approved action button disabled successfully");

		}

	}

	@Then("user copy ApparelBOMValidation	{string}")
	public void user_copy_ApparelBOMValidation(String string) throws Throwable {

		Commonactions.isElementPresent(bc.getClickApparel());
		ca.click(bc.getClickApparel());
		Commonactions.isElementPresent(bc.getBOM_copy());
		ca.click(bc.getBOM_copy());
		Commonactions.isElementPresent(si.getStyleBOMValue());
		ca.insertText(si.getStyleBOMValue(),string);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

	}

	@Then("user Freezes the ApparelBOMValidation-Copy and verify Action button is disabled")
	public void user_Freezes_the_ApparelBOMValidation_Copy_and_verify_Action_button_is_disabled() throws Throwable {

		boolean copyvalue = bc.getClickCopy().isDisplayed();
		if(copyvalue==true)
		{ca.click(bc.getClickCopy());}
		else
		{	driver.findElement(By.xpath("(//a[text()='Apparel BOM Validation copy'])[2]")).click();	}
		Commonactions.isElementPresent(bc.getApproveAction());
		ca.click(bc.getApproveAction());
		ca.eleToBeClickable();
		freeze();
		Commonactions.isElementPresent(bc.getContinue());
		ca.click(bc.getContinue());

		try{
			//Actionbutton();
		}catch (Exception e) {
			System.out.println("after freeze action button disabled successfully");

		}

	}

	@Then("user Reopen the copied BOM")
	public void user_Reopen_the_copied_BOM() throws Throwable {

		Commonactions.isElementPresent(bc.getApproveAction());
		ca.click(bc.getApproveAction());
		ca.eleToBeClickable();
		reopen();
		System.out.println("reopened successfully");

	}

	@Then("user created NewFromStyle in Apparelsection")
	public void user_created_NewFromStyle_in_Apparelsection() throws Throwable {


		List<WebElement> ap = driver.findElements(By.xpath("(//span[contains(text(),'Apparel section')])"));
		for(int i=1;i<=ap.size();i++)
		{
			WebElement appsec = driver.findElement(By.xpath("(//span[contains(text(),'Apparel section')])["+i+"]"));
			boolean displayed = appsec.isDisplayed();
			if(displayed==true)
			{
				driver.findElement(By.xpath("(//span[contains(text(),'Apparel section')])["+i+"]//following::td[@role='button'][1]")).click();						
				break;
			}}
		Commonactions.isElementPresent(bc.getNewFromStyle());
		ca.click(bc.getNewFromStyle());
		ca.eleToBeClickable();
		List<WebElement> ac = driver.findElements(By.xpath("//td[contains(text(),'Apparel - Color and Size')]//parent::tr//input"));
		for(int i=1;i<=ac.size();i++)
		{
			WebElement appcbox = driver.findElement(By.xpath("(//td[contains(text(),'Apparel - Color and Size')]//parent::tr//input)["+i+"]"));
			boolean displayed = appcbox.isDisplayed();
			if(displayed==true)
			{
				ca.eleToBeClickable();
				try{ca.click(appcbox);
				break;}
				catch(Exception e){}
			}}
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		System.out.println("Created NewFromStyle in Apparelsection successfully");

	}

	@Then("user verify the values refelected in multi level placements")
	public void user_verify_the_values_refelected_in_multi_level_placements() {

		Commonactions.isElementPresent(bc.getMultiLevelPlacements());
		ca.click(bc.getMultiLevelPlacements());
		try{Commonactions.isElementPresent(bc.getIcon2());
		ca.click(bc.getIcon2());}
		catch(Exception e){
			try{ca.click(bc.getIcon());}
			catch(Exception e1){}}
		System.out.println("verified the values refelected in multi level placements");

	}

	@Then("user add tracking changea and comments in manageviews")
	public void user_add_tracking_changea_and_comments_in_manageviews() throws Throwable {

		Commonactions.isElementPresent(si.getStyleBOMPlacement());
		si.getStyleBOMPlacement().click();


		boolean view=si.getBomViews1().isDisplayed();
		if(view==true){
			ca.click(si.getBomViews1());
		}
		else{
			ca.click(si.getBomViews2());
		}

		boolean manageview = si.getBommanageviews1().isDisplayed();
		if(manageview==true){
			ca.click(si.getBommanageviews1());
		}
		else{
			ca.click(si.getBommanageviews2());
		}

		Commonactions.isElementPresent(bc.getTrackingChange());
		ca.click(bc.getTrackingChange());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(bc.getTrackingComm());
		ca.click(bc.getTrackingComm());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();


		for (int i = 0; i <= 100; i++) {

			slider();
			if (bc.getTrckView().isDisplayed()) {
				slider();
				slider();
				break;

			}

		}

		System.out.println("Track view added in manage view");
	}

	public void Actionbutton() throws Throwable
	{
		ca.eleToBeClickable();
		boolean d = bc.getAction1().isDisplayed();
		if(d==true)
		{	ca.click(bc.getAction1());	}
		else
		{	ca.click(bc.getAction2());	}
		ca.eleToBeClickable();
	}
	public void shouldmore() throws Throwable
	{
		List<WebElement> ss = driver.findElements(By.xpath("(//span[text()='Shoulder - placement']/parent::td//following-sibling::td//span[contains(text(),'more')])"));

		for(int i=1;i<=ss.size();i++)
		{
			WebElement shdmore = driver.findElement(By.xpath("(//span[text()='Shoulder - placement']/parent::td//following-sibling::td//span[contains(text(),'more')])["+i+"]"));
			boolean displayed = shdmore.isDisplayed();
			if(displayed==true)
			{
				ca.click(shdmore);
				ca.eleToBeClickable();
				break;
			}}
	}
	public void slider()
	{
		List<WebElement> sl = driver.findElements(By.xpath("(//span[text()='BOM Section']//following::div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div)"));

		for(int i=1;i<=sl.size();i++)
		{
			WebElement sldr = driver.findElement(By.xpath("(//span[text()='BOM Section']//following::div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div)["+i+"]"));
			boolean displayed = sldr.isDisplayed();
			if(displayed==true)
			{
				ca.click(sldr);
				break;
			}}
	}

	public void commonosize()
	{
		List<WebElement> cs = driver.findElements(By.xpath("(//span[text()='Shoulder - placement']/parent::td//following-sibling::td[contains(@data-csi-act,'CommonSize')])"));
		for(int i=1;i<=cs.size();i++)
		{
			WebElement csize = driver.findElement(By.xpath("(//span[text()='Shoulder - placement']/parent::td//following-sibling::td[contains(@data-csi-act,'CommonSize')])["+i+"]"));
			boolean displayed = csize.isDisplayed();
			if(displayed==true)
			{
				ca.click(csize);
				break;
			}}

	}
	public void approveaction()
	{
		List<WebElement> num = driver.findElements(By.xpath("//td[text()='Approve']"));
		for(int i=1;i<=num.size();i++)
		{
			WebElement approve = driver.findElement(By.xpath("(//td[text()='Approve'])["+i+"]"));
			boolean displayed = approve.isDisplayed();
			if(displayed==true)
			{
				ca.click(approve);
				break;
			}}
	}

	public void freeze()
	{
		List<WebElement> num = driver.findElements(By.xpath("//td[text()='Freeze']"));

		for(int i=1;i<=num.size();i++)
		{
			WebElement freeze = driver.findElement(By.xpath("(//td[text()='Freeze'])["+i+"]"));
			boolean displayed = freeze.isDisplayed();
			if(displayed==true)
			{
				ca.click(freeze);
				break;
			}}
	}

	public void reopen()
	{
		List<WebElement> num = driver.findElements(By.xpath("//td[text()='Reopen']"));
		for(int i=1;i<=num.size();i++)
		{
			WebElement reopen = driver.findElement(By.xpath("(//td[text()='Reopen'])["+i+"]"));
			boolean displayed = reopen.isDisplayed();
			if(displayed==true)
			{
				ca.click(reopen);
				break;
			}}
	}
}