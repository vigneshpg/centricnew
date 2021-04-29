package com.centric.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

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
import com.centric.resources.Commonactions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CollectionMangSteps extends Commonactions {

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

	@When("user creates enumeration {string},{string}")
	public void user_creates_enumeration(String string, String string2) throws Throwable {

		Commonactions.isElementPresent(hp.getUser_settingsBtn());
		ca.click(hp.getUser_settingsBtn());
		Commonactions.isElementPresent(hp.getSystem_config());
		ca.click(hp.getSystem_config());
		Commonactions.isElementPresent(co.getUser_config());
		ca.click(co.getUser_config());
		Commonactions.isElementPresent(su.getUser_Enumerations());
		ca.click(su.getUser_Enumerations());
		Commonactions.isElementPresent(su.getUser_EnumDropBox());
		ca.click(su.getUser_EnumDropBox());
		ca.eleToBeClickable();

		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e1, "MarketingSegmentName");
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//label[contains(text(),'MarketingSegmentName')]")));	
		ca.eleToBeClickable();
		e1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();


		Commonactions.isElementPresent(sm.getEnumChkBxSeg());
		ca.click(sm.getEnumChkBxSeg());
		ca.click(driver.findElement(By.xpath("//td[contains(@data-csi-act,'LocaleName')]")));
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e2, string);
		ca.eleToBeClickable();


		Commonactions.isElementPresent(su.getUser_NewEnumValue());
		ca.click(su.getUser_NewEnumValue());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(su.getUser_NewEnumName());
		ca.insertText(su.getUser_NewEnumName(),string2);
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());

		System.out.println("Segments created successfully");

	}

	@When("user run update configuration")
	public void user_run_update_configuration() throws Throwable {

		Commonactions.isElementPresent(hp.getUser_settingsBtn());
		ca.click(hp.getUser_settingsBtn());
		Commonactions.isElementPresent(hp.getUpdate_config());
		ca.click(hp.getUpdate_config());
		Commonactions.isElementPresent(su.getRunBtn());
		ca.click(su.getRunBtn());
		ca.eleToBeClickable();
		Thread.sleep(20000);

		//driver.navigate().refresh();
		Commonactions.waitForAlert(driver);
		System.out.println("update configuration clicked successfully");

	}

	@When("user creates currencies in general setup {string},{string},{string}")
	public void user_creates_currencies_in_general_setup(String string, String string2, String string3) throws Throwable {

		String CurrA[] = string.split(",");
		String CurrB[] = string2.split(",");
		String CurrC[] = string3.split(",");

		Commonactions.isElementPresent(hp.getUser_settingsBtn1());
		ca.click(hp.getUser_settingsBtn1());
		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Currencies");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cm.getCurrency());
		ca.click(cm.getCurrency());

		Commonactions.isElementPresent(cm.getCurrencybtn());
		ca.click(cm.getCurrencybtn());
		ca.eleToBeClickable();
		WebElement c1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c1, CurrA[0]);
		ca.eleToBeClickable();
		c1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, CurrA[1]);
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cm.getCurrencybtn());
		ca.click(cm.getCurrencybtn());
		ca.eleToBeClickable();
		WebElement c2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c2, CurrB[0]);
		ca.eleToBeClickable();
		c2.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, CurrB[1]);
		ca.eleToBeClickable();


		Commonactions.isElementPresent(cm.getCurrencybtn());
		ca.click(cm.getCurrencybtn());
		ca.eleToBeClickable();
		WebElement c3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c3, CurrC[0]);
		ca.eleToBeClickable();
		c3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a2, CurrC[1]);
		ca.eleToBeClickable();

		System.out.println("Currency created successfully");


	}

	@When("user performing delete action")
	public void user_performing_delete_action() {

		Commonactions.isElementPresent(cm.getCurrencydeletebtn());
		ca.click(cm.getCurrencydeletebtn());
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());

		System.out.println("Currency delete action validated successfully");

	}

	@When("user creates currency table in general setup {string}")
	public void user_creates_currency_table_in_general_setup(String string) throws Throwable {



		Commonactions.isElementPresent(hp.getUser_settingsBtn1());
		ca.click(hp.getUser_settingsBtn1());
		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Currency Tables");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cm.getCurrencyTable());
		ca.click(cm.getCurrencyTable());

		Commonactions.isElementPresent(cm.getCurrencytablebtn());
		ca.click(cm.getCurrencytablebtn());
		ca.eleToBeClickable();
		WebElement c4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c4, string);
		ca.eleToBeClickable();
		c4.sendKeys(Keys.TAB);
		WebElement c1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c1, "Go to");
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cm.getGotodialog());
		ca.click(cm.getGotodialog());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cm.getDollar());
		ca.click(cm.getDollar());
		Commonactions.isElementPresent(cm.getRupee());
		ca.click(cm.getRupee());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());

		System.out.println("Currency table created successfully");
	}

	@When("user updating currency exchange rates")
	public void user_updating_currency_exchange_rates() throws Throwable {

		Commonactions.isElementPresent(cm.getCurrencyname());
		ca.click(cm.getCurrencyname());
		Commonactions.isElementPresent(cm.getNewfromcurrencybtn());
		ca.click(cm.getNewfromcurrencybtn());
		Commonactions.isElementPresent(cm.getDollar());
		ca.click(cm.getDollar());
		Commonactions.isElementPresent(cm.getRupee());
		ca.click(cm.getRupee());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		System.out.println("currency exchange rate updated successfully");

	}

	@When("user creates Sales market in general setup {string},{string}")
	public void user_creates_Sales_market_in_general_setup(String string, String string2) throws Throwable {

		String smA[] = string.split(",");
		String smB[] = string2.split(",");

		Commonactions.isElementPresent(hp.getUser_settingsBtn1());
		ca.click(hp.getUser_settingsBtn1());
		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Sales Market");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cm.getSalesmarket());
		ca.click(cm.getSalesmarket());

		Commonactions.isElementPresent(cm.getSalesmarketbtn());
		ca.click(cm.getSalesmarketbtn());
		Commonactions.isElementPresent(cm.getSalesmarketvalue1());
		ca.insertText(cm.getSalesmarketvalue1(), smB[0]);
		Commonactions.isElementPresent(cm.getCurrencyvalue());
		ca.insertText(cm.getCurrencyvalue(), smB[1]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());

		Commonactions.isElementPresent(cm.getSalesmarketbtn());
		ca.click(cm.getSalesmarketbtn());
		Commonactions.isElementPresent(cm.getSalesmarketvalue1());
		ca.insertText(cm.getSalesmarketvalue1(), smA[0]);
		Commonactions.isElementPresent(cm.getCurrencyvalue());
		ca.insertText(cm.getCurrencyvalue(), smA[1]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());

		System.out.println("Sales market created successfully");

	}

	@When("user creates Sales division in general setup {string},{string},{string},{string}")
	public void user_creates_Sales_division_in_general_setup(String string, String string2, String string3, String string4) throws Throwable {

		Commonactions.isElementPresent(hp.getUser_settingsBtn1());
		ca.click(hp.getUser_settingsBtn1());
		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());

		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Sales Division");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cm.getSaledivision());
		ca.click(cm.getSaledivision());

		Commonactions.isElementPresent(cm.getSalesdivisionbtn());
		ca.click(cm.getSalesdivisionbtn());
		Commonactions.isElementPresent(cm.getSalesdivisionvalue());
		ca.insertText(cm.getSalesdivisionvalue(), string);
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());

		ca.eleToBeClickable();
		Commonactions.isElementPresent(cm.getSalesdivisionvalue());
		ca.insertText(cm.getSalesdivisionvalue(), string2);
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());

		ca.eleToBeClickable();
		Commonactions.isElementPresent(cm.getSalesdivisionvalue());
		ca.insertText(cm.getSalesdivisionvalue(), string3);
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());

		ca.eleToBeClickable();
		Commonactions.isElementPresent(cm.getSalesdivisionvalue());
		ca.insertText(cm.getSalesdivisionvalue(), string4);
		Commonactions.isElementPresent(sp.getSaveandgo());
		ca.click(sp.getSaveandgo());
		ca.eleToBeClickable();

		System.out.println("Sales Division created successfully");

	}

	@When("user updating contact inside sales division")
	public void user_updating_contact_inside_sales_division() throws Throwable {

		ca.jsScrollPageDown(cm.getNewcontactbtn());
		Commonactions.isElementPresent(cm.getNewcontactbtn());
		ca.click(cm.getNewcontactbtn());
		ca.eleToBeClickable();
		WebElement c5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c5, "michel");
		ca.eleToBeClickable();
		c5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cm.getCopycontact());
		ca.click(cm.getCopycontact());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cm.getDeletecontact());
		ca.click(cm.getDeletecontact());
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());
		ca.eleToBeClickable();

		System.out.println("Contact updated successfully");

	}

	InspectionPage in = new InspectionPage();

	@When("user creates marketing looks {string}")
	public void user_creates_marketing_looks(String string) throws Throwable {

		for (int i = 0; i < 50; i++) {
			//	Commonactions.isElementPresent(in.getPagecontentArrow());
			//	ca.click(in.getPagecontentArrow());
			if(hp.getCollectionManagementBtn().isDisplayed()){
				Commonactions.isElementPresent(hp.getCollectionManagementBtn());
				ca.click(hp.getCollectionManagementBtn());
				break;
			}

		}

		Commonactions.isElementPresent(cm.getMarketingcollection());
		ca.click(cm.getMarketingcollection());
		Commonactions.isElementPresent(cm.getMarketingLook());
		ca.click(cm.getMarketingLook());
		Commonactions.isElementPresent(cm.getMarketingTool());
		ca.click(cm.getMarketingTool());
		Commonactions.isElementPresent(cm.getSalesOrder());
		ca.click(cm.getSalesOrder());
		Commonactions.isElementPresent(cm.getSalesordergroup());
		ca.click(cm.getSalesordergroup());
		Commonactions.isElementPresent(cm.getCatalogconfig());
		ca.click(cm.getCatalogconfig());


		Commonactions.isElementPresent(cm.getMarketingLook());
		ca.click(cm.getMarketingLook());
		Commonactions.isElementPresent(cm.getMarketinglookbtn());
		ca.click(cm.getMarketinglookbtn());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.insertText(a, string);
		ca.eleToBeClickable();
		a.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		System.out.println("Marketing Look created successfully");

	}

	@When("user creates marketing tools {string},{string}")
	public void user_creates_marketing_tools(String string, String string2) throws Throwable {

		Commonactions.isElementPresent(cm.getMarketingTool());
		ca.click(cm.getMarketingTool());

		Commonactions.isElementPresent(cm.getMarketingtoolbtn());
		ca.click(cm.getMarketingtoolbtn());
		ca.eleToBeClickable();
		WebElement c7 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c7, string);
		ca.eleToBeClickable();
		c7.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cm.getBannercheckbox());
		ca.click(cm.getBannercheckbox());

		Commonactions.isElementPresent(cm.getMarketingtoolbtn());
		ca.click(cm.getMarketingtoolbtn());
		ca.eleToBeClickable();
		WebElement c1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c1, string2);
		ca.eleToBeClickable();
		c1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cm.getCanoplycheckbox());
		ca.click(cm.getCanoplycheckbox());

		System.out.println("Marketing tool created successfully");

	}

	@When("performing delete action")
	public void performing_delete_action() {

		Commonactions.isElementPresent(cm.getCanoplydelete());
		ca.click(cm.getCanoplydelete());
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());

		System.out.println("Tool deleted successfully");

	}

	@When("user creates collection management {string},{string}")
	public void user_creates_collection_management(String string, String string2) throws Throwable {




		Commonactions.isElementPresent(cm.getMarketingcollection());
		ca.click(cm.getMarketingcollection());

		Commonactions.isElementPresent(cm.getMarketingcoll_btn());
		ca.click(cm.getMarketingcoll_btn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cm.getMarketingcollvalue());
		ca.insertText(cm.getMarketingcollvalue(), string);
		Commonactions.isElementPresent(cm.getMarketingcurrenyvalue());
		ca.insertText(cm.getMarketingcurrenyvalue(), string2);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getSaveandgo());
		ca.click(sp.getSaveandgo());
		ca.eleToBeClickable();

		System.out.println("Collection management created successfully");


	}

	@When("user creates style marketing products {string},{string},{string}")
	public void user_creates_style_marketing_products(String string, String string2, String string3) throws Throwable {

		ca.eleToBeClickable();
		Commonactions.isElementPresent(cm.getMarketingproduct());
		ca.click(cm.getMarketingproduct());
		Commonactions.isElementPresent(cm.getMProductExpand());
		ca.click(cm.getMProductExpand());
		Commonactions.isElementPresent(cm.getNewfromstyle());
		ca.click(cm.getNewfromstyle());
		Commonactions.isElementPresent(cm.getApparelcolorandsizecheckbox());
		ca.click(cm.getApparelcolorandsizecheckbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cm.getLocalizedname());
		ca.click(cm.getLocalizedname());
		ca.eleToBeClickable();
		WebElement c1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c1, string);
		ca.eleToBeClickable();
		c1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement c2 = ca.activeElement();
		ca.eleToBeClickable();
		c2.sendKeys(Keys.DELETE);
		ca.insertText(c2, string2);
		ca.eleToBeClickable();
		c2.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement d = ca.activeElement();
		ca.eleToBeClickable();
		d.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement c3 = ca.activeElement();
		ca.eleToBeClickable();
		c3.sendKeys(Keys.DELETE);
		ca.insertText(c3, "700");
		ca.eleToBeClickable();
		c3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement c4 = ca.activeElement();
		ca.eleToBeClickable();
		c4.sendKeys(Keys.DELETE);
		ca.insertText(c4, "900");
		ca.eleToBeClickable();
		c4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		System.out.println("Style marketing product created successfully");

	}


	@When("user creates styles marketing products {string},{string},{string}")
	public void user_creates_styles_marketing_products(String string, String string2, String string3) throws Throwable {

		ca.eleToBeClickable();
		Commonactions.isElementPresent(cm.getMarketingproduct());
		ca.click(cm.getMarketingproduct());
		Commonactions.isElementPresent(cm.getMarketingproductbtn());
		ca.click(cm.getMarketingproductbtn());
		Commonactions.isElementPresent(cm.getApparelcolorandsizecheckbox());
		ca.click(cm.getApparelcolorandsizecheckbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cm.getLocalizedname());
		ca.click(cm.getLocalizedname());
		ca.eleToBeClickable();
		WebElement c1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c1, string);
		ca.eleToBeClickable();
		c1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement c2 = ca.activeElement();
		ca.eleToBeClickable();
		c2.sendKeys(Keys.DELETE);
		ca.insertText(c2, string2);
		ca.eleToBeClickable();
		c2.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement d = ca.activeElement();
		ca.eleToBeClickable();
		d.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement c3 = ca.activeElement();
		ca.eleToBeClickable();
		c3.sendKeys(Keys.DELETE);
		ca.insertText(c3, "700");
		ca.eleToBeClickable();
		c3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement c4 = ca.activeElement();
		ca.eleToBeClickable();
		c4.sendKeys(Keys.DELETE);
		ca.insertText(c4, "900");
		ca.eleToBeClickable();
		c4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		System.out.println("Style marketing product created successfully");

	}

	@When("user creates new marketing product {string},{string},{string}")
	public void user_creates_new_marketing_product(String string, String string2, String string3) throws Throwable {

		Commonactions.isElementPresent(cm.getMarketingproductbtn());
		ca.click(cm.getMarketingproductbtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cm.getMarketingproductvalue());
		ca.insertText(cm.getMarketingproductvalue(), string);
		Commonactions.isElementPresent(cm.getMarketingproductcode());
		ca.insertText(cm.getMarketingproductcode(), string2);
		Commonactions.isElementPresent(cm.getStyletype());
		ca.insertText(cm.getStyletype(), string3);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getSaveandgo());
		ca.click(sp.getSaveandgo());
		ca.eleToBeClickable();

		System.out.println("Marketing product created successfully");

	}

	@When("user creates colorway inside marketing product {string},{string}")
	public void user_creates_colorway_inside_marketing_product(String string, String string2) throws Throwable {

		Commonactions.isElementPresent(cm.getMPrdtWSP());
		ca.click(cm.getMPrdtWSP());
		ca.eleToBeClickable();
		WebElement c1 = ca.activeElement();
		ca.eleToBeClickable();
		c1.sendKeys(Keys.DELETE);
		ca.insertText(c1, "500");
		ca.eleToBeClickable();
		c1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement c2 = ca.activeElement();
		ca.eleToBeClickable();
		c2.sendKeys(Keys.DELETE);
		ca.insertText(c2, "700");
		ca.eleToBeClickable();
		c2.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement c3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c3, "MensJeans");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		ca.jsScrollPageDown(cm.getNewmarketingcolorway());
		Commonactions.isElementPresent(cm.getNewmarketingcolorway());
		ca.click(cm.getNewmarketingcolorway());
		ca.eleToBeClickable();
		WebElement c9 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c9, "Blue");
		ca.eleToBeClickable();
		c9.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cm.getBluecopy());
		ca.click(cm.getBluecopy());
		ca.eleToBeClickable();
		WebElement c5 = ca.activeElement();
		ca.eleToBeClickable();
		c5.sendKeys(Keys.DELETE);
		ca.insertText(c5, "Green");
		ca.eleToBeClickable();
		c5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cm.getMaterialproductname());
		ca.click(cm.getMaterialproductname());
		ca.eleToBeClickable();
		System.out.println("Colorway updated successfully");

	}

	@When("user creates marketing material and looks {string},{string}")
	public void user_creates_marketing_material_and_looks(String string, String string2) throws Throwable {

		ca.eleToBeClickable();
		Commonactions.isElementPresent(cm.getMarketingmaterial());
		ca.click(cm.getMarketingmaterial());
		Commonactions.isElementPresent(cm.getNewfrommaterialBtn());
		ca.click(cm.getNewfrommaterialBtn());
		Commonactions.isElementPresent(cm.getNewfrommaterialcheckbox());
		ca.click(cm.getNewfrommaterialcheckbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cm.getMarketingLook());
		ca.click(cm.getMarketingLook());
		Commonactions.isElementPresent(cm.getMarketingLookBtn());
		ca.click(cm.getMarketingLookBtn());
		ca.eleToBeClickable();
		WebElement c10 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c10, "Spider Man");
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cm.getMarketingLookBtn());
		ca.click(cm.getMarketingLookBtn());
		ca.eleToBeClickable();
		WebElement c11 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c11, "Iron Man");
		ca.eleToBeClickable();

		for(int i=1;i<=2;i++)
		{
			driver.findElement(By.xpath("(//td[@data-csi-act='State::0'])["+i+"]")).click();
			WebElement s = ca.activeElement();
			ca.eleToBeClickable();
			ca.insertText(s, "Release");
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();
			driver.findElement(By.xpath("(//span[@data-csi-act='AggregateLookProducts'])["+i+"]")).click();
			if(i==1)
			{
				ca.click(cm.getColorsizecheckbox());
				ca.click(mp.getSave_btn1());
				ca.eleToBeClickable();
			}
			else
			{
				ca.click(cm.getMPcheckbox());
				ca.click(mp.getSave_btn1());
			}
		}

		System.out.println("Marketing material & looks created successfully");

	}




	@When("user update material value in material product and segments")
	public void user_update_material_value_in_material_product_and_segments() throws Throwable {

		// WebElement plus = driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div"));
		// WebElement minus = driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='-']/parent::div"));

		ca.eleToBeClickable(); 
		Commonactions.isElementPresent(cm.getMarketingproduct());
		ca.click(cm.getMarketingproduct());
		ca.eleToBeClickable();
		for (int i = 0; i < 50; i++) {
			//Commonactions.isElementPresent(plus);

			ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
			if(cm.getApparelmaterial().isDisplayed()){
				Thread.sleep(1000);
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
				Commonactions.isElementPresent(cm.getApparelmaterial());
				click(cm.getApparelmaterial());
				break;
			}

		}

		//  ca.display(plus, cm.getApparelmaterial());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, "100% Cotton/Rayon Jersey - Copy");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		for (int i = 0; i < 50; i++) {
			//Commonactions.isElementPresent(plus);
			ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
			if(cm.getMPMaterial().isDisplayed()){
				Thread.sleep(1000);
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
				Commonactions.isElementPresent(cm.getMPMaterial());
				click(cm.getMPMaterial());
				break;
			}

		}
		// ca.display(plus, cm.getMPMaterial());
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, "100% Cotton/Rayon Jersey - Copy");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		WebElement elemnt = driver.findElement(By.xpath("(//a[contains(text(),'Apparel')]//parent::td//following::td[contains(@data-csi-act,'MainMaterialColor')])[1]"));
		//ca.display(plus, elemnt);

		for (int i = 0; i < 50; i++) {
			//Commonactions.isElementPresent(minus);
			ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
			if(elemnt.isDisplayed()){
				Thread.sleep(1000);
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
				Commonactions.isElementPresent(elemnt);
				//click(elemnt);
				break;
			}

		}
		List<WebElement> elements = driver.findElements(By.xpath("(//a[contains(text(),'Apparel')]//parent::td//following::td[contains(@data-csi-act,'MainMaterialColor')])"));
		int l = elements.size();
		String color[]= {"Blue","Red","yellow","Blue","Red","Blue","Red","yellow"};
		for(int i=1;i<=8;i++)
		{

			if(i==5){

				ca.click(driver.findElement(By.xpath("(//a[contains(text(),'Apparel')]//parent::td//following::td[contains(@data-csi-act,'MainMaterialColor')])["+i+"]")));
				ca.eleToBeClickable();
				WebElement co = ca.activeElement();
				ca.eleToBeClickable();
				co.sendKeys(Keys.DELETE);
				ca.eleToBeClickable();
				ca.insertText(co, color[i-1]);
				ca.eleToBeClickable();
				ca.jsMouseOver();
				ca.eleToBeClickable();

			}else{

				ca.click(driver.findElement(By.xpath("(//a[contains(text(),'Apparel')]//parent::td//following::td[contains(@data-csi-act,'MainMaterialColor')])["+i+"]")));
				ca.eleToBeClickable();
				WebElement co = ca.activeElement();
				ca.eleToBeClickable();
				ca.insertText(co, color[i-1]);
				ca.eleToBeClickable();
				ca.jsMouseOver();
				ca.eleToBeClickable();
			}

			for (int k = 0; k < 10; k++) {
				//Commonactions.isElementPresent(minus);
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));


			}

		}

		System.out.println("Material product updated successfully");




		Commonactions.isElementPresent(cm.getMarketingproduct());
		ca.click(cm.getMarketingproduct());
		ca.eleToBeClickable();

		for (int i = 0; i < 100; i++) {
			//Commonactions.isElementPresent(minus);
			ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='-']/parent::div")));
			if(cm.getSegment1().isDisplayed()){
				Thread.sleep(1000);
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='-']/parent::div")));
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='-']/parent::div")));
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='-']/parent::div")));
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='-']/parent::div")));
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='-']/parent::div")));
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='-']/parent::div")));

				Commonactions.isElementPresent(cm.getSegment1());
				//click(cm.getSegment1());
				break;
			}

		}
		//  ca.display(minus, cm.getSegment1());
		/*	    ca.eleToBeClickable();
	    WebElement a2 = ca.activeElement();
	    ca.eleToBeClickable();
	    a2.sendKeys(Keys.DELETE);
	    ca.insertText(a2, "Segment - 01");
	    ca.eleToBeClickable();
	    ca.jsMouseOver();
	    ca.eleToBeClickable();*/

		Commonactions.isElementPresent(cm.getSegment2());
		ca.click(cm.getSegment2());
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		a3.sendKeys(Keys.DELETE);
		ca.insertText(a3, "Segment - 02");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();


		Commonactions.isElementPresent(cm.getMarketingsegment());
		ca.click(cm.getMarketingsegment());
		//  Commonactions.isElementPresent(sp.getSRrefresh());
		//  ca.click(sp.getSRrefresh());
		ca.eleToBeClickable();
		System.out.println("Segment created successfully");


	}

	@Then("user click on release to markets and release to customers")
	public void user_click_on_release_to_markets_and_release_to_customers() throws Throwable {

		Commonactions.isElementPresent(cm.getReleasetomarket());
		ca.click(cm.getReleasetomarket());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cm.getReleasetoCustomer());
		ca.click(cm.getReleasetoCustomer());
		ca.eleToBeClickable();
		try{
			Commonactions.isElementPresent(pp.getOK_Btn());
			ca.click(pp.getOK_Btn());
		}catch (Exception e) {

		}
		ca.eleToBeClickable();
		System.out.println("Released to customer successfully");

	}

	@Then("user creates sales market in collection management")
	public void user_creates_sales_market_in_collection_management() throws Throwable {

		Commonactions.isElementPresent(cm.getMarketingColl());
		ca.click(cm.getMarketingColl());
		ca.jsScrollPageDown(cm.getSelectsalesmarket());
		Commonactions.isElementPresent(cm.getSelectsalesmarket());
		ca.click(cm.getSelectsalesmarket());
		Commonactions.isElementPresent(cm.getUsmarketcheckbox());
		ca.click(cm.getUsmarketcheckbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(sp.getApproveicon1());
		ca.click(sp.getApproveicon1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cm.getPushmarketproduct());
		ca.click(cm.getPushmarketproduct());
		ca.eleToBeClickable();
		try{
			for (int i = 0; i < 50; i++) {
				//Commonactions.isElementPresent(minus);
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Sales')]//span[text()='+']/parent::div")));
				if(cm.getSelectstate().isDisplayed()){
					Thread.sleep(1000);
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Sales')]//span[text()='+']/parent::div")));
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Sales')]//span[text()='+']/parent::div")));
					Commonactions.isElementPresent(cm.getSelectstate());
					//click(cm.getSelectstate());
					break;
				}

			}
			// Commonactions.isElementPresent(cm.getSelectstate());
			ca.click(cm.getSelectstate());
			ca.eleToBeClickable();
			WebElement s = ca.activeElement();
			ca.eleToBeClickable();
			ca.insertText(s, "make available");
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Sales market created successfully");


	}

	@Then("creates sales order {string},{string}")
	public void creates_sales_order(String string, String string2) {

		for (int i = 0; i < 50; i++) {
			//Commonactions.isElementPresent(in.getPagecontentArrow());
			//ca.click(in.getPagecontentArrow());
			if(hp.getCollectionManagementBtn().isDisplayed()){
				Commonactions.isElementPresent(hp.getCollectionManagementBtn());
				ca.click(hp.getCollectionManagementBtn());
				break;
			}

		}

		Commonactions.isElementPresent(cm.getSalesOrder());
		ca.click(cm.getSalesOrder());
		Commonactions.isElementPresent(cm.getNewSalesOrderbtn());
		ca.click(cm.getNewSalesOrderbtn());
		Commonactions.isElementPresent(cm.getSalesorderValue());
		ca.insertText(cm.getSalesorderValue(), string);
		Commonactions.isElementPresent(cm.getSalesmarketvalue());
		ca.insertText(cm.getSalesmarketvalue(), string2);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());

		System.out.println("Sales order created successfully");



	}

	@When("user creates collection management with SKU {string},{string},{string},{string},{string}")
	public void user_creates_collection_management_with_SKU(String string, String string2, String string3, String string4, String string5) throws Throwable {

		//temp
		for (int i = 0; i < 50; i++) {
			//Commonactions.isElementPresent(in.getPagecontentArrow());
			//ca.click(in.getPagecontentArrow());
			if(hp.getCollectionManagementBtn().isDisplayed()){
				Commonactions.isElementPresent(hp.getCollectionManagementBtn());
				ca.click(hp.getCollectionManagementBtn());
				break;
			}

		}
		//========

		Commonactions.isElementPresent(cm.getMarketingcollection());
		ca.click(cm.getMarketingcollection());

		Commonactions.isElementPresent(cm.getMarketingcoll_btn());
		ca.click(cm.getMarketingcoll_btn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cm.getMarketingcollvalue());
		ca.insertText(cm.getMarketingcollvalue(), string);
		Commonactions.isElementPresent(cm.getMarketingcurrenyvalue());
		ca.insertText(cm.getMarketingcurrenyvalue(), string2);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cm.getSKUOrder());
		ca.click(cm.getSKUOrder());
		Commonactions.isElementPresent(sp.getSaveandgo());
		ca.click(sp.getSaveandgo());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cm.getCode());
		ca.click(cm.getCode());
		ca.eleToBeClickable();
		WebElement s = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(s, string3);
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cm.getCurrencytable());
		ca.click(cm.getCurrencytable());
		ca.eleToBeClickable();
		WebElement s1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(s1, string4);
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cm.getLocalName());
		ca.click(cm.getLocalName());
		ca.eleToBeClickable();
		WebElement s2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(s2, string5);
		ca.eleToBeClickable();


		System.out.println("SKU Collection management created successfully");

	}

	@When("verify material SKU values")
	public void verify_material_SKU_values() throws InterruptedException {

		for (int i = 0; i < 100; i++) {
			ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
			if(cm.getSKUverify().isDisplayed()){
				Thread.sleep(1000);
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
				//Commonactions.isElementPresent(cm.getApparelmaterial());
				//click(cm.getApparelmaterial());
				break;
			}

		}

		String value = driver.findElement(By.xpath("(//td[@data-csi-act='WholesalePrice:Child:MCProductSKUs:0{MCProductSKUs}'])[1]/div")).getText();
		Assert.assertTrue(!value.equals(null));
	}

	@When("user creates marketing material and update values in marketing product {string},{string},{string}")
	public void user_creates_marketing_material_and_update_values_in_marketing_product(String string, String string2, String string3) throws Throwable {

		ca.eleToBeClickable();
		Commonactions.isElementPresent(cm.getMarketingmaterial());
		ca.click(cm.getMarketingmaterial());
		Commonactions.isElementPresent(cm.getNewfrommaterialBtn());
		ca.click(cm.getNewfrommaterialBtn());
		Commonactions.isElementPresent(cm.getMatAChkBx());
		ca.click(cm.getMatAChkBx());
		Commonactions.isElementPresent(cm.getMatBChkBx());
		ca.click(cm.getMatBChkBx());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		ca.eleToBeClickable(); 
		Commonactions.isElementPresent(cm.getMarketingproduct());
		ca.click(cm.getMarketingproduct());
		ca.eleToBeClickable();
		for (int i = 0; i < 100; i++) {
			//Commonactions.isElementPresent(plus);

			ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='-']/parent::div")));
			if(cm.getMPinmaterila().isDisplayed()){
				Thread.sleep(1000);
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='-']/parent::div")));
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='-']/parent::div")));
				Commonactions.isElementPresent(cm.getMPinmaterila());
				ca.click(cm.getMPinmaterila());
				break;
			}

		}

		//  ca.display(plus, cm.getApparelmaterial());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, string2);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cm.getReleasetomarket());
		ca.click(cm.getReleasetomarket());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cm.getReleasetoCustomer());
		ca.click(cm.getReleasetoCustomer());
		ca.eleToBeClickable();
		try{
			Commonactions.isElementPresent(pp.getOK_Btn());
			ca.click(pp.getOK_Btn());
		}catch (Exception e) {

		}
		ca.eleToBeClickable();

		for (int i = 0; i < 100; i++) {
			//Commonactions.isElementPresent(minus);
			ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
			if(cm.getMaterialcolor().isDisplayed()){
				Thread.sleep(1000);
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));

				Commonactions.isElementPresent(cm.getMaterialcolor());
				ca.click(cm.getMaterialcolor());
				break;
			}

		}

		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, string3);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cm.getReleasetoCustomer());
		ca.click(cm.getReleasetoCustomer());
		ca.eleToBeClickable();

		System.out.println("Released to customer successfully");

	}

	@When("user creates SKU sales market in collection management {string}")
	public void user_creates_SKU_sales_market_in_collection_management(String string) throws Throwable {


		Commonactions.isElementPresent(cm.getMarketingColl());
		ca.click(cm.getMarketingColl());
		ca.jsScrollPageDown(cm.getSelectsalesmarket());
		Commonactions.isElementPresent(cm.getSelectsalesmarket());
		ca.click(cm.getSelectsalesmarket());
		Commonactions.isElementPresent(cm.getIndainmarketcheckbox());
		ca.click(cm.getUsmarketcheckbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(sp.getApproveicon1());
		ca.click(sp.getApproveicon1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cm.getPushmarketproduct());
		ca.click(cm.getPushmarketproduct());
		ca.eleToBeClickable();
		try{
			for (int i = 0; i < 50; i++) {
				//Commonactions.isElementPresent(minus);
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Sales')]//span[text()='+']/parent::div")));
				if(cm.getSelectstate().isDisplayed()){
					Thread.sleep(1000);
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Sales')]//span[text()='+']/parent::div")));
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Sales')]//span[text()='+']/parent::div")));
					Commonactions.isElementPresent(cm.getSelectstate());
					//click(cm.getSelectstate());
					break;
				}

			}
			// Commonactions.isElementPresent(cm.getSelectstate());
			ca.click(cm.getSelectstate());
			ca.eleToBeClickable();
			WebElement s = ca.activeElement();
			ca.eleToBeClickable();
			ca.insertText(s, "make available");
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();
		}catch (Exception e) {
			// TODO: handle exception
			for (int i = 0; i < 100; i++) {
				//Commonactions.isElementPresent(minus);
				ca.click(driver.findElement(By.xpath("(//div[contains(@class,'Sales')]//span[text()='+']/parent::div)[1]")));
				if(cm.getSelectstate().isDisplayed()){
					Thread.sleep(1000);
					ca.click(driver.findElement(By.xpath("(//div[contains(@class,'Sales')]//span[text()='+']/parent::div)[1]")));
					ca.click(driver.findElement(By.xpath("(//div[contains(@class,'Sales')]//span[text()='+']/parent::div)[1]")));
					Commonactions.isElementPresent(cm.getSelectstate());
					//click(cm.getSelectstate());
					break;
				}
			}

			// Commonactions.isElementPresent(cm.getSelectstate());
			ca.click(cm.getSelectstate());
			ca.eleToBeClickable();
			WebElement s = ca.activeElement();
			ca.eleToBeClickable();
			ca.insertText(s, "make available");
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();



		}
		System.out.println("Sales market created successfully");


		Commonactions.isElementPresent(cm.getSalemarketname());
		ca.click(cm.getSalemarketname());
		Commonactions.isElementPresent(cm.getSMCustomer());
		ca.click(cm.getSMCustomer());
		Commonactions.isElementPresent(cm.getHmchecckbox());
		ca.click(cm.getHmchecckbox());
		//   WebElement a = ca.activeElement();
		//   a.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		// Commonactions.isElementPresent(cm.getSalemarketname());
		// ca.click(cm.getSalemarketname());
		Commonactions.isElementPresent(cm.getSMSalesDivision());
		ca.click(cm.getSMSalesDivision());
		Commonactions.isElementPresent(cm.getNorthcheckbox());
		ca.click(cm.getNorthcheckbox());
		Commonactions.isElementPresent(cm.getSouthcheckbox());
		ca.click(cm.getSouthcheckbox());
		//  WebElement a1 = ca.activeElement();
		//  a1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		// Commonactions.isElementPresent(cm.getSalemarketname());
		// ca.click(cm.getSalemarketname());

		System.out.println("Sales market values updated successfully");


	}


	@When("User creates promotion and sales order {string},{string},{string},{string}")
	public void user_creates_promotion_and_sales_order(String string, String string2, String string3, String string4) throws Throwable {

		Commonactions.isElementPresent(cm.getSalesproduct());
		ca.click(cm.getSalesproduct());
		Commonactions.isElementPresent(cm.getPromotion());
		ca.click(cm.getPromotion());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cm.getSalespromBtn());
		ca.click(cm.getSalespromBtn());
		ca.eleToBeClickable();
		WebElement s = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(s, string);
		ca.eleToBeClickable();
		// s.sendKeys(Keys.TAB);
		// ca.eleToBeClickable();

		Commonactions.isElementPresent(cm.getSalesOrder());
		ca.click(cm.getSalesOrder());
		Commonactions.isElementPresent(cm.getNewSalesOrderbtn());
		ca.click(cm.getNewSalesOrderbtn());
		Commonactions.isElementPresent(cm.getSalesorderValue());
		ca.insertText(cm.getSalesorderValue(), string2);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cm.getSKUsalesorder());
		ca.click(cm.getSKUsalesorder());
		Commonactions.isElementPresent(cm.getSeller());
		ca.insertText(cm.getSeller(), string3);
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cm.getBuyer());
		ca.insertText(cm.getBuyer(), string4);
		ca.jsMouseOver();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cm.getCopy1());
		ca.click(cm.getCopy1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cm.getDelete1());
		ca.click(cm.getDelete1());
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());
		ca.eleToBeClickable();


		System.out.println("Marketing promotion and sales order created successfully");


	}

	@When("user creates marketing tools and update sales order")
	public void user_creates_marketing_tools_and_update_sales_order() throws Throwable {

		Commonactions.isElementPresent(cm.getMarketingtools());
		ca.click(cm.getMarketingtools());
		Commonactions.isElementPresent(cm.getMarketingtoolbtn());
		ca.click(cm.getMarketingtoolbtn());
		Commonactions.isElementPresent(cm.getBanercheckbox());
		ca.click(cm.getBanercheckbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		System.out.println("Marketing tools created successfully");

		Commonactions.isElementPresent(cm.getSalesOrder());
		ca.click(cm.getSalesOrder());
		Commonactions.isElementPresent(cm.getSalesordername());
		ca.click(cm.getSalesordername());
		Commonactions.isElementPresent(cm.getSalesskubtn());
		ca.click(cm.getSalesskubtn());
		Commonactions.isElementPresent(cm.getBluecolorcheckbox());
		ca.click(cm.getBluecolorcheckbox());
		Commonactions.isElementPresent(cm.getGreencolorchecckbox());
		ca.click(cm.getGreencolorchecckbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cm.getQuantityblue());
		ca.click(cm.getQuantityblue());
		WebElement s = ca.activeElement();
		ca.eleToBeClickable();
		s.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(s, "100");
		ca.eleToBeClickable();
		s.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cm.getQuantitygreen());
		ca.click(cm.getQuantitygreen());
		WebElement s1 = ca.activeElement();
		ca.eleToBeClickable();
		s1.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(s1, "200");
		ca.eleToBeClickable();
		s1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		System.out.println("Sales order value updated successfully");

	}

	@When("user creates sales order group and update catalog configuration")
	public void user_creates_sales_order_group_and_update_catalog_configuration() throws Throwable {

		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		//temp
		for (int i = 0; i < 50; i++) {
			//Commonactions.isElementPresent(in.getPagecontentArrow());
			//ca.click(in.getPagecontentArrow());
			if(hp.getCollectionManagementBtn().isDisplayed()){
				Commonactions.isElementPresent(hp.getCollectionManagementBtn());
				ca.click(hp.getCollectionManagementBtn());
				break;
			}

		}
		//========
		Commonactions.isElementPresent(cm.getSalesordergroup());
		ca.click(cm.getSalesordergroup());
		Commonactions.isElementPresent(cm.getSalesorderbutton());
		ca.click(cm.getSalesorderbutton());
		Commonactions.isElementPresent(cm.getSalesorderValue());
		ca.insertText(cm.getSalesorderValue(), "India Sales Group");
		Commonactions.isElementPresent(cm.getSmvalue());
		ca.insertText(cm.getSmvalue(), "India");
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cm.getSmcustomer());
		ca.insertText(cm.getSmcustomer(), "H&M");
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getSaveandgo());
		ca.click(sp.getSaveandgo());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cm.getSalesorderexpand());
		ca.click(cm.getSalesorderexpand());
		Commonactions.isElementPresent(cm.getExistingsalesorder());
		ca.click(cm.getExistingsalesorder());
		Commonactions.isElementPresent(cm.getIndinasalescheckbox());
		ca.click(cm.getIndinasalescheckbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cm.getNewSalesOrderbtn());
		ca.click(cm.getNewSalesOrderbtn());
		Commonactions.isElementPresent(cm.getSalesorderValue());
		ca.insertText(cm.getSalesorderValue(), "South Sales Order");
		Commonactions.isElementPresent(cm.getBuyer());
		ca.insertText(cm.getBuyer(), "H&M");
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cm.getSeller());
		ca.insertText(cm.getSeller(), "India - South");
		ca.jsMouseOver();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		/*  WebElement val = driver.findElement(By.xpath("(//td[contains(@data-csi-heading,'QuantityPerSize')])[1]"));
	    ca.click(val);
	    ca.eleToBeClickable();
	    WebElement s1 = ca.activeElement();
	    ca.eleToBeClickable();
	    s1.sendKeys(Keys.DELETE);
	    ca.eleToBeClickable();
	    ca.insertText(s1, "50");
	    ca.eleToBeClickable();
	    s1.sendKeys(Keys.TAB);
	    ca.eleToBeClickable();

	    WebElement val1 = driver.findElement(By.xpath("(//td[contains(@data-csi-heading,'QuantityPerSize')])[2]"));
	    ca.click(val1);
	    ca.eleToBeClickable();
	    WebElement s2 = ca.activeElement();
	    ca.eleToBeClickable();
	    s2.sendKeys(Keys.DELETE);
	    ca.eleToBeClickable();
	    ca.insertText(s2, "40");
	    ca.eleToBeClickable();
	    s2.sendKeys(Keys.TAB);
	    ca.eleToBeClickable();

	    WebElement val2 = driver.findElement(By.xpath("(//td[contains(@data-csi-heading,'QuantityPerSize')])[3]"));
	    ca.click(val2);
	    ca.eleToBeClickable();
	    WebElement s3 = ca.activeElement();
	    ca.eleToBeClickable();
	    s3.sendKeys(Keys.DELETE);
	    ca.eleToBeClickable();
	    ca.insertText(s3, "100");
	    ca.eleToBeClickable();
	    s3.sendKeys(Keys.TAB);
	    ca.eleToBeClickable();*/


		/*Commonactions.isElementPresent(cm.getBluecolorcopy());
	    ca.click(cm.getBluecolorcopy());
	    Commonactions.isElementPresent(cm.getBluedelete());
	    ca.click(cm.getBluedelete());
	    ca.eleToBeClickable();*/

	}



}
