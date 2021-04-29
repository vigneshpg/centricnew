package com.centric.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.centric.objectrepository.BusinessPlanningPage;
import com.centric.objectrepository.ConfigurationPage;
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

public class MerchandisingSteps extends Commonactions {
	Commonactions ca = new Commonactions();
	HomePage hp = new HomePage();
	MerchandisePage mp=new MerchandisePage();
	WizardPage wp=new WizardPage();
	SetupPageTK su = new SetupPageTK();
	BusinessPlanningPage bp = new BusinessPlanningPage();
	ConfigurationPage cp = new ConfigurationPage();
	UserManagementPage up = new UserManagementPage();
	SourcingPage sp = new SourcingPage();
	MaterialSpecificationPage mp1 = new MaterialSpecificationPage();
	StylePage stp = new StylePage();
	InspectionPage in = new InspectionPage();	
	QualityPage qp = new QualityPage();
	PopupPage pp=new PopupPage();


	@Given("Navigate to Secondary Type tab create data {string}")
	public void navigate_to_Secondary_Type_tab_create_data(String string) throws Throwable{
		String[] secondarytypename;
		secondarytypename=string.split(",");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getMerchandise_type());
		mp.getMerchandise_type().click();
		Commonactions.isElementPresent(mp.getPlan_type());
		Thread.sleep(1000);
		Commonactions.isElementPresent(mp.getFolder_type());
		Thread.sleep(1000);
		Commonactions.isElementPresent(mp.getCollection_type());
		Thread.sleep(1000);
		Commonactions.isElementPresent(mp.getProduct_type());
		Thread.sleep(1000);
		Commonactions.isElementPresent(mp.getOption_type());
		Thread.sleep(1000);
		Commonactions.isElementPresent(mp.getSecondary_type());
		mp.getSecondary_type().click();
		Commonactions.isElementPresent(mp.getNew_action_secondary_type());
		mp.getNew_action_secondary_type().click();
		Commonactions.isElementPresent(mp.getSecondary_type_input());
		mp.getSecondary_type_input().click();
		ca.insertText(mp.getSecondary_type_input(),secondarytypename[0]);
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		ca.eleToBeClickable();	
		Commonactions.isElementPresent(mp.getNew_action_secondary_type());
		mp.getNew_action_secondary_type().click();
		Commonactions.isElementPresent(mp.getSecondary_type_input());
		mp.getSecondary_type_input().click();
		ca.insertText(mp.getSecondary_type_input(),secondarytypename[1]);
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getActive_segment());
		mp.getActive_segment().click();
		Commonactions.isElementPresent(mp.getActive_monthly());
		mp.getActive_monthly().click();

	}
	@Given("Navigate to Option Type and Product type create data {string},{string}")
	public void navigate_to_Option_Type_and_Product_type_create_data(String string, String string2)throws Throwable {
		Commonactions.isElementPresent(mp.getOption_type());
		mp.getOption_type().click();
		Commonactions.isElementPresent(mp.getNew_action_option_type());
		mp.getNew_action_option_type().click();
		Commonactions.isElementPresent(mp.getOption_type_input());
		mp.getOption_type_input().click();
		ca.insertText(mp.getOption_type_input(),string);
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getActive_segment());
		mp.getActive_segment().click();
		Commonactions.isElementPresent(mp.getProduct_type());
		mp.getProduct_type().click();
		Commonactions.isElementPresent(mp.getNew_action_product_type());
		mp.getNew_action_product_type().click();
		Commonactions.isElementPresent(mp.getProduct_type_input());
		mp.getProduct_type_input().click();
		ca.insertText(mp.getProduct_type_input(),string2);
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getActive_segment());
		mp.getActive_segment().click();

	}
	@Given("Navigate to Collection type and create data {string}")
	public void navigate_to_Collection_type_and_create_data(String string)throws Throwable  {
		Commonactions.isElementPresent(mp.getCollection_type());
		mp.getCollection_type().click();
		Commonactions.isElementPresent(mp.getNew_action_collection_type());
		mp.getNew_action_collection_type().click();
		Commonactions.isElementPresent(mp.getCollection_type_input());
		mp.getCollection_type_input().click();
		ca.insertText(mp.getCollection_type_input(),string);
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getActive_segment());
		mp.getActive_segment().click();
		Commonactions.isElementPresent(mp.getProduct_type());
		mp.getProduct_type().click();
		Commonactions.isElementPresent(mp.getStyle_type_dropdown());
		mp.getStyle_type_dropdown().click();
		Commonactions.isElementPresent(driver.findElement(By.xpath("//label[text()='Apparel - Color and Size']")));
		ca.click(driver.findElement(By.xpath("//label[text()='Apparel - Color and Size']")));
		Commonactions.isElementPresent(mp.getChildern_option_dropdown());
		mp.getChildern_option_dropdown().click();
		Commonactions.isElementPresent(driver.findElement(By.xpath("//label[text()='Option']")));
		ca.click(driver.findElement(By.xpath("//label[text()='Option']")));
		Commonactions.isElementPresent(mp.getCollection_type());
		mp.getCollection_type().click();
		Commonactions.isElementPresent(mp.getChildern_product_dropdown());
		mp.getChildern_product_dropdown().click();
		Commonactions.isElementPresent(driver.findElement(By.xpath("//label[text()='Product']")));
		ca.click(driver.findElement(By.xpath("//label[text()='Product']")));		
	}
	@When("Navigate to Folder type {string}")
	public void navigate_to_Folder_type(String string)throws Throwable 
	{
		String[] foldertypename;
		foldertypename=string.split(",");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getFolder_type()); 
		mp.getFolder_type().click();
		Commonactions.isElementPresent(mp.getNew_action_folder_type());
		mp.getNew_action_folder_type().click();
		Commonactions.isElementPresent(mp.getFolder_type_input());
		mp.getFolder_type_input().click();
		ca.insertText(mp.getFolder_type_input(),foldertypename[0]);
		ca.click(driver.findElement(By.xpath("//span[text()='Save & New']")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getFolder_type_input());
		mp.getFolder_type_input().click();
		ca.insertText(mp.getFolder_type_input(),foldertypename[1]);
		ca.click(driver.findElement(By.xpath("(//span[text()='Save & New'])")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getFolder_type_input());
		mp.getFolder_type_input().click();
		ca.insertText(mp.getFolder_type_input(),foldertypename[2]);
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getActive_segment());
		mp.getActive_segment().click();
		Commonactions.isElementPresent(mp.getActive_monthly());
		mp.getActive_monthly().click();
		ca.click(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0'])[3]")));
		Commonactions.isElementPresent(mp.getMerchandise_refresh());
		mp.getMerchandise_refresh().click();
		Commonactions.isElementPresent(mp.getDepartment_autocreate());
		mp.getDepartment_autocreate().click();
		Commonactions.isElementPresent(mp.getDepartment_childfolder_dropdown());
		mp.getDepartment_childfolder_dropdown().click();
		ca.click(driver.findElement(By.xpath("//label[text()='Gender']")));
		Commonactions.isElementPresent(mp.getRegion_autocreate());
		mp.getRegion_autocreate().click();
		Commonactions.isElementPresent(mp.getRegion_childcollection_dropdown());
		mp.getRegion_childcollection_dropdown().click();
		ca.click(driver.findElement(By.xpath("//label[text()='Product Group']")));
		Commonactions.isElementPresent(mp.getRegion_childfolder_dropdown());
		mp.getRegion_childfolder_dropdown().click();
		ca.click(driver.findElement(By.xpath("//label[text()='Department']")));

	}
	@When("Create plan type data {string}")
	public void create_plan_type_data(String string)throws Throwable {
		Commonactions.isElementPresent(mp.getPlan_type());
		mp.getPlan_type().click();
		Commonactions.isElementPresent(mp.getNew_action_plan_type());
		mp.getNew_action_plan_type().click();
		Commonactions.isElementPresent(mp.getPlan_type_input());
		mp.getPlan_type_input().click();
		ca.insertText(mp.getPlan_type_input(),string);
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getActive_segment());
		mp.getActive_segment().click();		
		Commonactions.isElementPresent(mp.getMerchplan_childfolder_dropdown());
		mp.getMerchplan_childfolder_dropdown().click();
		ca.click(driver.findElement(By.xpath("//label[text()='Region']")));
		Commonactions.isElementPresent(mp.getMerchplan_autocreate());
		mp.getMerchplan_autocreate().click();
		Commonactions.isElementPresent(mp.getMerchplan_secondarytype_dropdown());
		mp.getMerchplan_secondarytype_dropdown().click();
		ca.click(driver.findElement(By.xpath("//label[text()='Monthly']")));
		ca.click(driver.findElement(By.xpath("//label[text()='Segment']")));
	}
	@When("Enumeration creation")
	public void enumeration_creation()throws Throwable  {
		Commonactions.isElementPresent(su.getUser_Enumerations());
		ca.click(su.getUser_Enumerations());
		Commonactions.isElementPresent(mp.getNew_action_enumeration());
		ca.click(mp.getNew_action_enumeration());
		Commonactions.isElementPresent(mp.getEnumeration_input());
		ca.click(mp.getEnumeration_input());
		ca.insertText(mp.getEnumeration_input(),"Gender");
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getNew_action_enumeration_value());
		ca.click(mp.getNew_action_enumeration_value());
		Commonactions.isElementPresent(mp.getEnumeration_value_input());
		ca.click(mp.getEnumeration_value_input());
		ca.insertText(mp.getEnumeration_value_input(),"Childrenswear");
		ca.click(driver.findElement(By.xpath("(//span[text()='Save & New'])")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getEnumeration_value_input());
		ca.click(mp.getEnumeration_value_input());
		ca.insertText(mp.getEnumeration_value_input(),"Menswear");
		ca.click(driver.findElement(By.xpath("(//span[text()='Save & New'])")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getEnumeration_value_input());
		ca.click(mp.getEnumeration_value_input());
		ca.insertText(mp.getEnumeration_value_input(),"Womenswear");
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getNew_action_enumeration());
		ca.click(mp.getNew_action_enumeration());
		Commonactions.isElementPresent(mp.getEnumeration_input());
		ca.click(mp.getEnumeration_input());
		ca.insertText(mp.getEnumeration_input(),"Brand");
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getNew_action_enumeration_value());
		ca.click(mp.getNew_action_enumeration_value());
		Commonactions.isElementPresent(mp.getEnumeration_value_input());
		ca.click(mp.getEnumeration_value_input());
		ca.insertText(mp.getEnumeration_value_input(),"BrandX");
		ca.click(driver.findElement(By.xpath("(//span[text()='Save & New'])")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getEnumeration_value_input());
		ca.click(mp.getEnumeration_value_input());
		ca.insertText(mp.getEnumeration_value_input(),"BrandY");
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getNew_action_enumeration());
		ca.click(mp.getNew_action_enumeration());
		Commonactions.isElementPresent(mp.getEnumeration_input());
		ca.click(mp.getEnumeration_input());
		ca.insertText(mp.getEnumeration_input(),"Price Point");
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getNew_action_enumeration_value());
		ca.click(mp.getNew_action_enumeration_value());
		Commonactions.isElementPresent(mp.getEnumeration_value_input());
		ca.click(mp.getEnumeration_value_input());
		ca.insertText(mp.getEnumeration_value_input(),"High");
		ca.click(driver.findElement(By.xpath("(//span[text()='Save & New'])")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getEnumeration_value_input());
		ca.click(mp.getEnumeration_value_input());
		ca.insertText(mp.getEnumeration_value_input(),"Medium");
		ca.click(driver.findElement(By.xpath("(//span[text()='Save & New'])")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getEnumeration_value_input());
		ca.click(mp.getEnumeration_value_input());
		ca.insertText(mp.getEnumeration_value_input(),"Low");
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		ca.eleToBeClickable();
	}
	@When("Navigate to Business Object")
	public void navigate_to_Business_Object()throws Throwable {
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
		a2.sendKeys("Style Attributes");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getStyleattributecheckbox());
		ca.click(mp.getStyleattributecheckbox());
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		a3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getStyleattributevalue());
		ca.click(mp.getStyleattributevalue());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getNew_action_styleattribute_value());
		ca.click(mp.getNew_action_styleattribute_value());
		Commonactions.isElementPresent(mp.getStyleattribute_input());
		ca.click(mp.getStyleattribute_input());
		ca.insertText(mp.getStyleattribute_input(),"IdGender");
		Commonactions.isElementPresent(mp.getStyleattribute_type_dropdown());
		ca.click(mp.getStyleattribute_type_dropdown());
		ca.eleToBeClickable();		
		WebElement a4 = ca.activeElement();
		ca.eleToBeClickable();
		a4.sendKeys("enum");
		ca.eleToBeClickable();
		WebElement a5 = ca.activeElement();
		ca.eleToBeClickable();
		a5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getStyleattribute_type1_dropdown());
		ca.click(mp.getStyleattribute_type1_dropdown());
		ca.eleToBeClickable();		
		WebElement b1 = ca.activeElement();
		ca.eleToBeClickable();
		b1.sendKeys("Gender");
		ca.eleToBeClickable();
		WebElement b2 = ca.activeElement();
		ca.eleToBeClickable();
		b2.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement exp = driver.findElement(By.xpath("//textarea[@data-csi-automation='field-ConfigurableAttribute-Form-Expression']"));
		exp.sendKeys(" ");
		Commonactions.isElementPresent(mp.getClient_checkbox());
		ca.click(mp.getClient_checkbox());
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getNew_action_styleattribute_value());
		ca.click(mp.getNew_action_styleattribute_value());
		Commonactions.isElementPresent(mp.getStyleattribute_input());
		ca.click(mp.getStyleattribute_input());
		ca.insertText(mp.getStyleattribute_input(),"IdPricePoint");
		Commonactions.isElementPresent(mp.getStyleattribute_type_dropdown());
		ca.click(mp.getStyleattribute_type_dropdown());
		ca.eleToBeClickable();		
		WebElement b3 = ca.activeElement();
		ca.eleToBeClickable();
		b3.sendKeys("enum");
		ca.eleToBeClickable();
		WebElement b4 = ca.activeElement();
		ca.eleToBeClickable();
		b4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getStyleattribute_type1_dropdown());
		ca.click(mp.getStyleattribute_type1_dropdown());
		ca.eleToBeClickable();		
		WebElement b6 = ca.activeElement();
		ca.eleToBeClickable();
		b6.sendKeys("Price Point");
		ca.eleToBeClickable();
		WebElement b7 = ca.activeElement();
		ca.eleToBeClickable();
		b7.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement exp1 = driver.findElement(By.xpath("//textarea[@data-csi-automation='field-ConfigurableAttribute-Form-Expression']"));
		exp1.sendKeys(" ");
		Commonactions.isElementPresent(mp.getClient_checkbox());
		ca.click(mp.getClient_checkbox());
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getFind_Styleattribute());
		ca.click(mp.getFind_Styleattribute());
		ca.eleToBeClickable();		
		WebElement a6 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a6, "Merchandise Folder");
		a6.sendKeys(Keys.DOWN);
		a6.sendKeys(Keys.ENTER);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getNew_action_styleattribute_value());
		ca.click(mp.getNew_action_styleattribute_value());
		Commonactions.isElementPresent(mp.getStyleattribute_input());
		ca.click(mp.getStyleattribute_input());
		ca.insertText(mp.getStyleattribute_input(),"Brand");
		Commonactions.isElementPresent(mp.getStyleattribute_type_dropdown());
		ca.click(mp.getStyleattribute_type_dropdown());
		ca.eleToBeClickable();		
		WebElement c1 = ca.activeElement();
		ca.eleToBeClickable();
		c1.sendKeys("enum");
		ca.eleToBeClickable();
		WebElement c2 = ca.activeElement();
		ca.eleToBeClickable();
		c2.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getStyleattribute_type1_dropdown());
		ca.click(mp.getStyleattribute_type1_dropdown());
		ca.eleToBeClickable();		
		WebElement c3 = ca.activeElement();
		ca.eleToBeClickable();
		c3.sendKeys("Brand");
		ca.eleToBeClickable();
		WebElement c4 = ca.activeElement();
		ca.eleToBeClickable();
		c4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement exp2 = driver.findElement(By.xpath("//div[@data-csi-automation='field-ConfigurableAttribute-Form-Optional']"));
		ca.click(exp2);
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		ca.click(mp1.getSave_btn1());
	}

	@Then("Create style attribute for merchandise product version")
	public void create_style_attribute_for_merchandise_product_version()throws Throwable {
		Commonactions.isElementPresent(mp.getFind_Styleattribute());
		ca.click(mp.getFind_Styleattribute());
		ca.eleToBeClickable();		
		WebElement a6 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a6, "Merchandise Product Version");
		a6.sendKeys(Keys.DOWN);
		a6.sendKeys(Keys.ENTER);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getNew_action_styleattribute_value());
		ca.click(mp.getNew_action_styleattribute_value());
		Commonactions.isElementPresent(mp.getStyleattribute_input());
		ca.click(mp.getStyleattribute_input());
		ca.insertText(mp.getStyleattribute_input(),"IpPricePoint");
		Commonactions.isElementPresent(mp.getStyleattribute_type_dropdown());
		ca.click(mp.getStyleattribute_type_dropdown());
		ca.eleToBeClickable();		
		WebElement c1 = ca.activeElement();
		ca.eleToBeClickable();
		c1.sendKeys("enum");
		ca.eleToBeClickable();
		WebElement c2 = ca.activeElement();
		ca.eleToBeClickable();
		c2.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getStyleattribute_type1_dropdown());
		ca.click(mp.getStyleattribute_type1_dropdown());
		ca.eleToBeClickable();		
		WebElement c3 = ca.activeElement();
		ca.eleToBeClickable();
		c3.sendKeys("Price Point");
		ca.eleToBeClickable();
		WebElement c4 = ca.activeElement();
		ca.eleToBeClickable();
		c4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		Commonactions.isElementPresent(mp.getSetting_tab());
		ca.click(mp.getSetting_tab());
		ca.click(driver.findElement(By.xpath("//a[text()='System Configuration']")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getMerchandise_tab());
		ca.click(mp.getMerchandise_tab());
		Commonactions.isElementPresent(mp.getProduct_version_checkbox());
		ca.click(mp.getProduct_version_checkbox());
		ca.click(cp.getUser_TypeConfig());
		Commonactions.jsWaitForPageLoad();
		Commonactions.isElementPresent(mp.getMerchandise_type());
		mp.getMerchandise_type().click();
		Commonactions.isElementPresent(mp.getProduct_type());
		mp.getProduct_type().click();
		ca.click(driver.findElement(By.xpath("//a[text()='Product']")));
		Commonactions.isElementPresent(mp.getNew_style_push_template());
		mp.getNew_style_push_template().click();
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement activeElement = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(activeElement, "Product-01");
		ca.click(driver.findElement(By.xpath("//span[text()='Style Push Templates']")));
		Thread.sleep(1000);
		ca.click(mp.getProduct1carryovercheckbox());
		Thread.sleep(1000);
		ca.click(mp.getProduct1stylecheckbox());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//a[text()='Product-01']")));
		ca.eleToBeClickable();

	}
	@Then("Navigate to style push template and add mapping expression")
	public void navigate_to_style_push_template_and_add_mapping_expression()throws Throwable {
		Commonactions.isElementPresent(mp.getProduct_attributename_dropdown());
		mp.getProduct_attributename_dropdown().click();
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//span[text()='Attribute Name']")));
		Commonactions.isElementPresent(mp.getProduct_attributename_dropdown());
		ca.click(mp.getProduct_attributename_dropdown());
		ca.eleToBeClickable();		
		WebElement e3 = ca.activeElement();
		ca.eleToBeClickable();
		e3.sendKeys("Category1");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getCategory1checkbox());
		ca.click(mp.getCategory1checkbox());
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		a3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		String s="block(category1Name = enumValue(thisNode().__Parent__.__Parent__.Folders.first().Brand),if(isNull(category1Name),null,Season.ApparelSeason.Hierarchy.filter(`Node Name`==category1Name).first()))";
		Commonactions.isElementPresent(mp.getMappingexpr_input());
		ca.click(mp.getMappingexpr_input());
		ca.eleToBeClickable();       
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e1, s);
		ca.eleToBeClickable();
		e1.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(mp.getProduct_attributename_dropdown());
		mp.getProduct_attributename_dropdown().click();
		ca.eleToBeClickable();
		WebElement e4 = ca.activeElement();
		ca.eleToBeClickable();
		e4.sendKeys("Category2");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getCategory2checkbox());
		ca.click(mp.getCategory2checkbox());
		ca.eleToBeClickable();
		WebElement a4 = ca.activeElement();
		ca.eleToBeClickable();
		a4.sendKeys(Keys.TAB);
		String s1="block(category1Name = enumValue(thisNode().__Parent__.__Parent__.Folders.first().Brand),if(isNull(category1Name),null,block(category1 = Season.ApparelSeason.Hierarchy.filter(`Node Name`==category1Name).first(),if(isNull(category1),null,block(category2Name = thisNode().__Parent__.__Parent__.Folders[1].`Node Name`,category1.Hierarchy.filter(`Node Name`==category2Name).first())))))";
		Commonactions.isElementPresent(mp.getMappingexprcategory2_input());
		ca.click(mp.getMappingexprcategory2_input());
		ca.eleToBeClickable();       
		WebElement e5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e5, s1);
		ca.eleToBeClickable();
		e5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getProduct_attributename_multiple_dropdown());
		mp.getProduct_attributename_multiple_dropdown().click();
		Commonactions.mouseOver(mp.getProduct_attributename_multiple_dropdown());
		Thread.sleep(1000);
		ca.click(mp.getProduct_attributename_multiple_dropdown());
		ca.eleToBeClickable();
		WebElement e7 = ca.activeElement();
		ca.eleToBeClickable();
		e7.sendKeys("Collection");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getCollectioncheckbox());
		ca.click(mp.getCollectioncheckbox());
		ca.eleToBeClickable();
		WebElement d1 = ca.activeElement();
		ca.eleToBeClickable();
		d1.sendKeys(Keys.TAB);
		String s2="block(category1Name = enumValue(thisNode().__Parent__.__Parent__.Folders.first().Brand),if(isNull(category1Name),null,block(category1 = Season.ApparelSeason.Hierarchy.filter(`Node Name`==category1Name).first(),if(isNull(category1),null,block(category2Name = thisNode().__Parent__.__Parent__.Folders[1].`Node Name`,category2 = category1.Hierarchy.filter(`Node Name`==category2Name).first(),if(isNull(category2),null,block(collectionName = thisNode().__Parent__.__Parent__.`Node Name`,category2.Hierarchy.filter(`Node Name`==collectionName).first()))))))";
		Commonactions.isElementPresent(mp.getMappingexprcollection_input());
		ca.click(mp.getMappingexprcollection_input());
		ca.eleToBeClickable();       
		WebElement e8 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e8, s2);
		ca.eleToBeClickable();
		e8.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getProduct_attributename_multiple_dropdown());		
		mp.getProduct_attributename_multiple_dropdown().click();
		Commonactions.mouseOver(mp.getProduct_attributename_multiple_dropdown());
		Thread.sleep(1000);
		ca.click(mp.getProduct_attributename_multiple_dropdown());
		ca.eleToBeClickable();
		WebElement d3 = ca.activeElement();
		ca.eleToBeClickable();
		d3.sendKeys("ParentSeason");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getParentseasoncheckbox());
		ca.click(mp.getParentseasoncheckbox());
		ca.eleToBeClickable();
		WebElement d4 = ca.activeElement();
		ca.eleToBeClickable();
		d4.sendKeys(Keys.TAB);
		String s3="Season.ApparelSeason";
		Commonactions.isElementPresent(mp.getMappingexprparentseason_input());
		ca.click(mp.getMappingexprparentseason_input());
		ca.eleToBeClickable();       
		WebElement d5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d5, s3);
		ca.eleToBeClickable();
		d5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getProduct_attributename_multiple_dropdown());
		mp.getProduct_attributename_multiple_dropdown().click();
		Commonactions.mouseOver(mp.getProduct_attributename_multiple_dropdown());
		Thread.sleep(1000);
		ca.click(mp.getProduct_attributename_multiple_dropdown());
		ca.eleToBeClickable();
		WebElement f2 = ca.activeElement();
		ca.eleToBeClickable();
		f2.sendKeys("IdGender");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getIdgendercheckbox());
		ca.click(mp.getIdgendercheckbox());
		ca.eleToBeClickable();
		WebElement d6 = ca.activeElement();
		ca.eleToBeClickable();
		d6.sendKeys(Keys.TAB);
		String s4="enum(\"Gender\",thisNode().__Parent__.__Parent__.Folders.last().`Node Name`)";
		Commonactions.isElementPresent(mp.getMappingexpridgender_input());
		ca.click(mp.getMappingexpridgender_input());
		ca.eleToBeClickable();       
		WebElement d7 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(d7, s4);
		ca.eleToBeClickable();
		d7.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getProduct_attributename_multiple_dropdown());
		mp.getProduct_attributename_multiple_dropdown().click();
		Commonactions.mouseOver(mp.getProduct_attributename_multiple_dropdown());
		Thread.sleep(1000);
		ca.click(mp.getProduct_attributename_multiple_dropdown());
		ca.eleToBeClickable();
		WebElement d8 = ca.activeElement();
		ca.eleToBeClickable();
		d8.sendKeys("IdPricePoint");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getIdpricepointcheckbox());
		ca.click(mp.getIdpricepointcheckbox());
		ca.eleToBeClickable();
		WebElement d9 = ca.activeElement();
		ca.eleToBeClickable();
		d9.sendKeys(Keys.TAB);
		String s5="ldPricePoint";
		Commonactions.isElementPresent(mp.getMappingexprpricepoint_input());
		ca.click(mp.getMappingexprpricepoint_input());
		ca.eleToBeClickable();       
		WebElement f1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(f1, s5);
		ca.eleToBeClickable();
		f1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
	}
	@Then("Create style copy templates")
	public void create_style_copy_templates()throws Throwable {
		Commonactions.isElementPresent(mp.getSetting_tab());
		ca.click(mp.getSetting_tab());
		ca.click(driver.findElement(By.xpath("//a[text()='System Configuration']")));
		Commonactions.isElementPresent(sp.getCopyTemplate());
		ca.click(sp.getCopyTemplate());
		Commonactions.isElementPresent(mp.getNew_style_copy_template());
		ca.click(mp.getNew_style_copy_template());
		Commonactions.isElementPresent(mp.getStylecopytemplate_input());
		ca.click(mp.getStylecopytemplate_input());
		ca.insertText(mp.getStylecopytemplate_input(), "Merch Copy Temp");
		Commonactions.isElementPresent(mp.getStyletype_dropdown());
		ca.click(mp.getStyletype_dropdown());
		ca.click(driver.findElement(By.xpath("//div[text()='Apparel - Color and Size']")));
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		ca.eleToBeClickable();
	}
	@Then("Navigate to style create atrributes")
	public void navigate_to_style_create_atrributes()throws Throwable {
		Commonactions.isElementPresent(bp.getStylevalue());
		ca.click(bp.getStylevalue());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getStyle_attributename_dropdown());
		ca.click(mp.getStyle_attributename_dropdown());
		Thread.sleep(1000);		
		Commonactions.isElementPresent(driver.findElement(By.xpath("//span[@data-csi-tab-name='Attributes' or text()='Attributes']")));
		ca.click(driver.findElement(By.xpath("//span[@data-csi-tab-name='Attributes' or text()='Attributes']")));
		ca.eleToBeClickable();
		ca.click(mp.getStyle_attributename_dropdown());
		ca.eleToBeClickable();		
		WebElement h1 = ca.activeElement();
		ca.eleToBeClickable();
		h1.sendKeys("CarryOver");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getCarryOvercheckbox());
		ca.click(mp.getCarryOvercheckbox());
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		a3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getCarryOveredit());
		ca.click(mp.getCarryOveredit());
		ca.eleToBeClickable();
		WebElement exp3 = driver.findElement(By.xpath("//div[@data-csi-automation='field-ConfigurableAttribute-Form-FlagReadOnly']"));
		ca.click(exp3);
		Thread.sleep(1000);
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getFormdefinition_tab());
		ca.click(mp.getFormdefinition_tab());
		Commonactions.isElementPresent(mp.getSelect_attribute());
		ca.click(mp.getSelect_attribute());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getStyle_carryover_checkbox());
		ca.click(mp.getStyle_carryover_checkbox());
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSetting_icon());
		ca.click(mp.getSetting_icon());
		Commonactions.isElementPresent(sp.getCopyTemplate());
		ca.click(sp.getCopyTemplate());
		System.out.println("navigated to style and restrict edit for carryover");
	}
	@Then("Again navigate to copy template and create new style copy template")
	public void again_navigate_to_copy_template_and_create_new_style_copy_template()throws Throwable {
		Commonactions.isElementPresent(mp.getMerchtemplate_delete());
		ca.click(mp.getMerchtemplate_delete());
		ca.click(driver.findElement(By.xpath("(//span[text()='Delete'])")));
		Commonactions.isElementPresent(mp.getNew_style_copy_template());
		ca.click(mp.getNew_style_copy_template());
		Commonactions.isElementPresent(mp.getStylecopytemplate_input());
		ca.click(mp.getStylecopytemplate_input());
		ca.insertText(mp.getStylecopytemplate_input(), "Merch Copy Temp");
		Commonactions.isElementPresent(mp.getStyletype_dropdown());
		ca.click(mp.getStyletype_dropdown());
		ca.click(driver.findElement(By.xpath("//div[text()='Apparel - Color and Size']")));
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getMerchtemplate_edit());
		ca.click(mp.getMerchtemplate_edit());	
		Commonactions.isElementPresent(mp.getCarryoverstylecopy_checkbox());
		ca.click(mp.getCarryoverstylecopy_checkbox());	
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getCopytemplates_views());
		ca.click(mp.getCopytemplates_views());
		Commonactions.isElementPresent(mp.getManage_Views());
		ca.click(mp.getManage_Views());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "Merch");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getMerchandise_option());
		ca.click(mp.getMerchandise_option());
		Commonactions.isElementPresent(mp.getAdoption_opt());
		ca.click(mp.getAdoption_opt());
		Commonactions.isElementPresent(mp1.getAdd());
		ca.click(mp1.getAdd());
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		ca.eleToBeClickable();
		ca.click(mp.getMerchcopymerchancheckbox());
		ca.eleToBeClickable();
	}
	@Then("Create Merchandise copy template")
	public void create_Merchandise_copy_template()throws Throwable {
		Commonactions.isElementPresent(mp.getNew_merch_copy_template());
		ca.click(mp.getNew_merch_copy_template());
		Commonactions.isElementPresent(mp.getMerchcopytemplate_input());
		ca.click(mp.getMerchcopytemplate_input());
		ca.eleToBeClickable();
		ca.insertText(mp.getMerchcopytemplate_input(), "Merch Copy Template");
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		ca.eleToBeClickable();		
	}

	@Given("Navigate to Folder type to check Brand")
	public void navigate_to_Folder_type_to_check_Brand()throws Throwable {
		Commonactions.isElementPresent(mp.getMerchandise_type());
		mp.getMerchandise_type().click();
		Commonactions.isElementPresent(mp.getFolder_type()); 
		mp.getFolder_type().click();
		ca.eleToBeClickable();	
		for(int i=0;i<100;i++)
		{
			ca.click(driver.findElement(By.xpath("(//div[text()='New Folder Type']//following::div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div)[1]")));           
		}	
		Commonactions.isElementPresent(mp.getBranchcheckboxregion());
		mp.getBranchcheckboxregion().click();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(hp.getUser_settingsBtn1());
		hp.getUser_settingsBtn1().click();		
		Commonactions.isElementPresent(hp.getHierarchystylesetup());
		hp.getHierarchystylesetup().click();		
		Commonactions.isElementPresent(mp.getActionhierarchyitemtemplate());
		mp.getActionhierarchyitemtemplate().click();	
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getTypedropdown());
		mp.getTypedropdown().click();
		ca.eleToBeClickable();		
		WebElement x1 = ca.activeElement();
		ca.eleToBeClickable();
		x1.sendKeys("Brand");
		ca.eleToBeClickable();		
		WebElement x2 = ca.activeElement();
		ca.eleToBeClickable();
		x2.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getNamehierarchyitem());
		mp.getNamehierarchyitem().click();
		ca.eleToBeClickable();		
		WebElement x3 = ca.activeElement();
		ca.eleToBeClickable();
		x3.sendKeys("Brand X");
		ca.eleToBeClickable();		
		ca.click(mp1.getSave_btn1());
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(mp.getActionhierarchyitemtemplate());
		mp.getActionhierarchyitemtemplate().click();	
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getTypedropdown());
		mp.getTypedropdown().click();
		ca.eleToBeClickable();		
		WebElement t1 = ca.activeElement();
		ca.eleToBeClickable();
		t1.sendKeys("Brand");
		ca.eleToBeClickable();		
		WebElement t2 = ca.activeElement();
		ca.eleToBeClickable();
		t2.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getNamehierarchyitem());
		mp.getNamehierarchyitem().click();
		ca.eleToBeClickable();		
		WebElement t3 = ca.activeElement();
		ca.eleToBeClickable();
		t3.sendKeys("Brand Y");
		ca.eleToBeClickable();		
		ca.click(mp1.getSave_btn1());

		Commonactions.isElementPresent(mp.getActionhierarchyitemtemplate());
		mp.getActionhierarchyitemtemplate().click();	
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getTypedropdown());
		mp.getTypedropdown().click();
		ca.eleToBeClickable();		
		WebElement x5 = ca.activeElement();
		ca.eleToBeClickable();
		x5.sendKeys("Department");
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(mp.getNamehierarchyitem());
		mp.getNamehierarchyitem().click();
		ca.eleToBeClickable();		
		WebElement x7 = ca.activeElement();
		ca.eleToBeClickable();
		x7.sendKeys("Childrenswear");
		ca.eleToBeClickable();		
		ca.click(mp1.getSave_btn1());

		Commonactions.isElementPresent(mp.getActionhierarchyitemtemplate());
		mp.getActionhierarchyitemtemplate().click();	
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getTypedropdown());
		mp.getTypedropdown().click();
		WebElement y1 = ca.activeElement();
		ca.eleToBeClickable();
		y1.sendKeys("Collection");
		ca.eleToBeClickable();		
		WebElement y2 = ca.activeElement();
		ca.eleToBeClickable();
		y2.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		Commonactions.isElementPresent(mp.getNamehierarchyitem());
		mp.getNamehierarchyitem().click();
		ca.eleToBeClickable();		
		WebElement y3 = ca.activeElement();
		ca.eleToBeClickable();
		y3.sendKeys("Tops");
		ca.eleToBeClickable();		
		WebElement y4 = ca.activeElement();
		ca.eleToBeClickable();
		y4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		ca.click(mp1.getSave_btn1());
	}
	@Then("Navigate to Home Page and setup template for hierarchy {string}")
	public void navigate_to_Home_Page_and_setup_template_for_hierarchy(String string)throws Throwable {
		Commonactions.isElementPresent(hp.getStyleBtn());
		hp.getStyleBtn().click();		
		Commonactions.isElementPresent(stp.getSeason_Btn());
		stp.getSeason_Btn().click();
		ca.click(stp.getNew_season_Btn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(pp.getSeason_Value());
		ca.insertText(pp.getSeason_Value(), string);
		Commonactions.isElementPresent(pp.getSave_Btn());
		ca.click(pp.getSave_Btn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(driver.findElement(By.xpath("//a[text()='Summer 2021']")));
		ca.click(driver.findElement(By.xpath("//a[text()='Summer 2021']")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(stp.getHierarchy_btn());
		stp.getHierarchy_btn().click();		
		Commonactions.isElementPresent(mp.getBrandactionbtn());
		mp.getBrandactionbtn().click();		
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getTemplatedropdown());
		mp.getTemplatedropdown().click();
		ca.eleToBeClickable();
		WebElement y4 = ca.activeElement();
		ca.eleToBeClickable();
		y4.sendKeys("Brand X");
		ca.eleToBeClickable();		
		WebElement y5 = ca.activeElement();
		ca.eleToBeClickable();
		y5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		ca.click(mp.getSavegobtn());
		Commonactions.isElementPresent(stp.getHierarchy_btn());
		stp.getHierarchy_btn().click();			
		Commonactions.isElementPresent(mp.getDepartmentactionbtn());
		mp.getDepartmentactionbtn().click();	
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getDepttempdropdown());
		mp.getDepttempdropdown().click();	
		ca.eleToBeClickable();		
		WebElement z5 = ca.activeElement();
		ca.eleToBeClickable();
		z5.sendKeys("Childrenswear");
		ca.eleToBeClickable();		
		WebElement z6 = ca.activeElement();
		ca.eleToBeClickable();
		z6.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		ca.click(mp.getSavegobtn());
		Commonactions.isElementPresent(stp.getHierarchy_btn());
		stp.getHierarchy_btn().click();			
		Commonactions.isElementPresent(mp.getCollectionactionbtn());
		mp.getCollectionactionbtn().click();	
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getCollectempdropdown());
		mp.getCollectempdropdown().click();	
		ca.eleToBeClickable();		
		WebElement y7 = ca.activeElement();
		ca.eleToBeClickable();
		y7.sendKeys("Tops");
		ca.eleToBeClickable();		
		WebElement y8 = ca.activeElement();
		ca.eleToBeClickable();
		y8.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		ca.click(mp1.getSave_btn1());
	}

	@Then("Create new season choose existing hierarchy value {string}")
	public void create_new_season_choose_existing_hierarchy_value(String string)throws Throwable {
		Commonactions.isElementPresent(hp.getStyleBtn());
		hp.getStyleBtn().click();		
		Commonactions.isElementPresent(stp.getSeason_Btn());
		stp.getSeason_Btn().click(); 
		ca.click(stp.getNew_season_Btn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(pp.getSeason_Value());
		ca.insertText(pp.getSeason_Value(), string);
		Commonactions.isElementPresent(pp.getSave_Btn());
		ca.click(pp.getSave_Btn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(driver.findElement(By.xpath("//a[text()='Summer 2022']")));
		ca.click(driver.findElement(By.xpath("//a[text()='Summer 2022']")));
		Commonactions.isElementPresent(mp.getBrandactiondropbtn());
		mp.getBrandactiondropbtn().click();
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td[text()='New from Brand']")));
		ca.click(driver.findElement(By.xpath("//td[text()='New from Brand']")));
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(mp.getBrandxcheckbox());
		mp.getBrandxcheckbox().click();	
		ca.click(mp1.getSave_btn1());
		ca.eleToBeClickable();	
		ca.click(mp.getSavegobtn());
	}

	@Then("user creates new Plan {string},{string}")
	public void user_creates_new_Plan(String name,String seasons) throws Throwable {
		String[] season = seasons.split(",");
		Commonactions.isElementPresent(mp.getMerchandise_tab());
		ca.click(mp.getMerchandise_tab());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getNewplan());
		ca.click(mp.getNewplan());
		Commonactions.isElementPresent(mp.getNewplanName());
		ca.insertText(mp.getNewplanName(), name);
		Commonactions.isElementPresent(mp.getPlanseason());
		ca.insertText(mp.getPlanseason(), season[0]);
		Commonactions.isElementPresent(mp1.getSave_btn1());
		ca.click(mp1.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Plan 1 created under merchandise");

	}

	@Then("user creates season under version {string}")
	public void user_creates_season_under_version(String seasons) throws Throwable {
		String[] season = seasons.split(",");

		Commonactions.isElementPresent(mp.getPlanName());
		ca.click(mp.getPlanName());
		Commonactions.isElementPresent(mp.getVersions());
		ca.click(mp.getVersions());
		Commonactions.isElementPresent(mp.getNewplanseason());
		ca.click(mp.getNewplanseason());
		Commonactions.isElementPresent(mp.getSeasonname());
		ca.insertText(mp.getSeasonname(), season[1]);
		Commonactions.isElementPresent(mp.getPreviousseason());
		ca.insertText(mp.getPreviousseason(), season[0]);
		Commonactions.isElementPresent(mp1.getSave_btn1());
		ca.click(mp1.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Season2022 created under Version");
	}

	@Then("under secondarysetup created monthly and segment setup {string},{string}")
	public void under_secondarysetup_created_monthly_and_segment_setup(String mon, String seg) throws Throwable {
		String[] monthly = mon.split(",");
		String[] segment = seg.split(",");

		Commonactions.isElementPresent(mp.getSecondarysetup());
		ca.click(mp.getSecondarysetup());
		Commonactions.isElementPresent(mp.getNewsecsetupplanbtn());
		ca.click(mp.getNewsecsetupplanbtn());
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, monthly[0]);
		Commonactions.isElementPresent(mp.getAutocreatechkbox());
		ca.click(mp.getAutocreatechkbox());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(mp.getNewsecsetupplanbtn());
		ca.click(mp.getNewsecsetupplanbtn());
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a2, monthly[1]);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getAutocreatechkbox());
		ca.click(mp.getAutocreatechkbox());
		System.out.println("monthly1 and monthly2 selected");

		Commonactions.isElementPresent(mp.getSetupsectypesarrow());
		ca.click(mp.getSetupsectypesarrow());
		Commonactions.isElementPresent(mp.getSetupsegment());
		ca.click(mp.getSetupsegment());
		Commonactions.isElementPresent(mp.getNewsecsetupplanbtn());
		ca.click(mp.getNewsecsetupplanbtn());
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a3, segment[0]);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getAutocreatechkbox());
		ca.click(mp.getAutocreatechkbox());
		Commonactions.isElementPresent(mp.getNewsecsetupplanbtn());

		ca.click(mp.getNewsecsetupplanbtn());
		ca.eleToBeClickable();
		WebElement a4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a4, segment[1]);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getAutocreatechkbox());
		ca.click(mp.getAutocreatechkbox());
		ca.eleToBeClickable();
		System.out.println("segment1 and segment2 created");

	}

	@Then("user selects monthly and segment value under Secondary")
	public void user_selects_monthly_and_segment_value_under_Secondary() throws Throwable {

		Commonactions.isElementPresent(mp.getSecondary());
		ca.click(mp.getSecondary());
		Commonactions.isElementPresent(mp.getNewfromsecplan());
		ca.click(mp.getNewfromsecplan());
		Commonactions.isElementPresent(mp.getSecondarychkbox());
		ca.click(mp.getSecondarychkbox());
		Commonactions.isElementPresent(mp1.getSave_btn1());
		ca.click(mp1.getSave_btn1());
		ca.eleToBeClickable();

		try{
			Commonactions.isElementPresent(in.getCancel());
			ca.click(in.getCancel());
		}
		catch(Exception e)
		{		}

		Commonactions.isElementPresent(mp.getSecplanrefresh());
		ca.click(mp.getSecplanrefresh());
		Commonactions.isElementPresent(mp.getSecondarysectypearrow());
		ca.click(mp.getSecondarysectypearrow());
		Commonactions.isElementPresent(mp.getSecondarymonthly());
		ca.click(mp.getSecondarymonthly());
		Commonactions.isElementPresent(mp.getNewfromsecplan());

		ca.click(mp.getNewfromsecplan());
		Commonactions.isElementPresent(mp.getSecondarychkbox());
		ca.click(mp.getSecondarychkbox());
		Commonactions.isElementPresent(mp1.getSave_btn1());
		ca.click(mp1.getSave_btn1());
		ca.eleToBeClickable();
		try{
			Commonactions.isElementPresent(in.getCancel());
			ca.click(in.getCancel());
			ca.eleToBeClickable();}
		catch(Exception e)
		{		}
		Commonactions.isElementPresent(mp.getSecplanrefresh());
		ca.click(mp.getSecplanrefresh());
		System.out.println("successfully selected monthly and segment value under Secondary for summer 2021");
	}

	@Then("user click PlanTab, adds created monthly")
	public void user_click_PlanTab_adds_created_monthly() {

		Commonactions.isElementPresent(mp.getPlantab());
		ca.click(mp.getPlantab());
		Commonactions.isElementPresent(mp.getPlantabrefresh());
		ca.click(mp.getPlantabrefresh());
		Commonactions.isElementPresent(mp.getPlansecondariesarrow());
		ca.click(mp.getPlansecondariesarrow());
		Commonactions.isElementPresent(mp.getMonthlyAll());
		ca.click(mp.getMonthlyAll());
		Commonactions.isElementPresent(mp.getPlantab());
		ca.click(mp.getPlantab());
		System.out.println("MonthlyAll added");

	}

	@Then("user moves to created season")
	public void user_moves_to_created_season() throws Throwable {

		Commonactions.isElementPresent(mp.getSummerchange2021());
		ca.click(mp.getSummerchange2021());
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, "Summer 2022" +Keys.ENTER);
		ca.eleToBeClickable();
		System.out.println("Summer 2022 selected");
	}

	@Then("user selects monthly and segment value under Secondary for summer2022")
	public void user_selects_monthly_and_segment_value_under_Secondary_for_summer2022() throws Throwable {

		Commonactions.isElementPresent(mp.getSecondary());
		ca.click(mp.getSecondary());
		Commonactions.isElementPresent(mp.getNewfromsecplan());
		ca.click(mp.getNewfromsecplan());
		Commonactions.isElementPresent(mp.getSecondarychkbox());
		ca.click(mp.getSecondarychkbox());
		Commonactions.isElementPresent(mp1.getSave_btn1());
		ca.click(mp1.getSave_btn1());
		ca.eleToBeClickable();

		try{
			Commonactions.isElementPresent(in.getCancel());
			ca.click(in.getCancel());
			ca.eleToBeClickable();}
		catch(Exception e)
		{		}

		Commonactions.isElementPresent(mp.getSecplanrefresh());
		ca.click(mp.getSecplanrefresh());
		Commonactions.isElementPresent(mp.getSecondarysectypearrow());
		ca.click(mp.getSecondarysectypearrow());
		Commonactions.isElementPresent(mp.getSecondarysegment());
		ca.click(mp.getSecondarysegment());
		Commonactions.isElementPresent(mp.getNewfromsecplan());

		ca.click(mp.getNewfromsecplan());
		Commonactions.isElementPresent(mp.getSecondarychkbox());
		ca.click(mp.getSecondarychkbox());
		Commonactions.isElementPresent(mp1.getSave_btn1());
		ca.click(mp1.getSave_btn1());
		ca.eleToBeClickable();
		try{
			Commonactions.isElementPresent(in.getCancel());
			ca.click(in.getCancel());
			ca.eleToBeClickable();}
		catch(Exception e)
		{		}
		Commonactions.isElementPresent(mp.getSecplanrefresh());
		ca.click(mp.getSecplanrefresh());
		ca.eleToBeClickable();
		System.out.println("successfully selected monthly and segment value under Secondary for summer2022");

	}

	@Then("user navigates into created season {string}")
	public void user_navigates_into_created_season(String season) throws Throwable {
		Commonactions.isElementPresent(mp.getMerchandise_tab());
		ca.click(mp.getMerchandise_tab());
		Commonactions.isElementPresent(mp.getPlanName());
		ca.click(mp.getPlanName());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSummerchange2022());
		ca.eleToBeClickable();
		ca.clickjs(mp.getSummerchange2022());
		try{ca.click(mp.getSummerchange2022());}
		catch(Exception e){}
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, season +Keys.ENTER);
		ca.eleToBeClickable();
		System.out.println("Summer 2021 selected");
	}

	@Then("create newfolder under Plan {string}")
	public void create_newfolder_under_Plan(String folders) throws Throwable {
		String[] folder = folders.split(",");
		Commonactions.isElementPresent(mp.getPlantab());
		ca.click(mp.getPlantab());
		Commonactions.isElementPresent(mp.getNewfolderbtn());
		ca.click(mp.getNewfolderbtn());
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, folder[0]);
		ca.eleToBeClickable();
		ca.click(mp.getPlantabrefresh());
		Commonactions.isElementPresent(mp.getAmericaName());
		ca.click(mp.getAmericaName());
		Commonactions.isElementPresent(mp.getAmericaNewfolder());
		ca.click(mp.getAmericaNewfolder());
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a2, folder[1]);
		ca.eleToBeClickable();
		a2.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getChildrenwearname());
		ca.click(mp.getChildrenwearname());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(mp.getAmericaNewfolder());
		ca.click(mp.getAmericaNewfolder());
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a3, folder[2]);
		ca.eleToBeClickable();
		a3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getBoysname());
		ca.click(mp.getBoysname());

		Commonactions.isElementPresent(mp.getNewmerchcollectionbtn());
		ca.click(mp.getNewmerchcollectionbtn());
		ca.eleToBeClickable();
		WebElement a4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a4, folder[3]);
		ca.eleToBeClickable();
		a4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getTopsname());
		ca.click(mp.getTopsname());
		System.out.println("Folder America->Children wears->Boys created under Plan1 for Mercahndise");
	}

	@Then("create NewProducts and verify the attribute value of quantity created {string},{string}")
	public void create_NewProducts_and_verify_the_attribute_value_of_quantity_created(String PdtName, String Optvalue) throws Throwable {
		String[] Product = PdtName.split(",");
		String[] Optional = Optvalue.split(",");
		Commonactions.isElementPresent(mp.getNewProduct());
		ca.click(mp.getNewProduct());
		Commonactions.isElementPresent(mp.getProductvalue());
		ca.insertText(mp.getProductvalue(), Product[0]);
		Commonactions.isElementPresent(mp.getOptionqtyvalue());
		ca.insertText(mp.getOptionqtyvalue(), "1"+Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getOptiontypevalue());
		ca.insertText(mp.getOptiontypevalue(), Optional[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(qp.getFinish());
		ca.click(qp.getFinish());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(mp.getNewProduct());
		ca.click(mp.getNewProduct());
		Commonactions.isElementPresent(mp.getProductvalue());
		ca.insertText(mp.getProductvalue(), Product[1]);
		Commonactions.isElementPresent(mp.getProductqty());
		ca.insertText(mp.getProductqty(), "2");
		Commonactions.isElementPresent(qp.getFinish());
		ca.click(qp.getFinish());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(mp.getNewProduct());
		ca.click(mp.getNewProduct());
		String Qtyvalue = mp.getActiveqtyvalue().getAttribute("value");
		System.out.println("Qtyvalue :" +Qtyvalue);
		Commonactions.isElementPresent(in.getCancel());
		ca.click(in.getCancel());

		Commonactions.isElementPresent(mp.getTops01Name());
		ca.click(mp.getTops01Name());
		Commonactions.isElementPresent(mp.getNewoptionbtn());
		ca.click(mp.getNewoptionbtn());
		ca.eleToBeClickable();
		WebElement a4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a4, Optional[1]);
		ca.eleToBeClickable();

		Commonactions.isElementPresent(mp.getTopsIcon());
		ca.click(mp.getTopsIcon());
		Commonactions.isElementPresent(mp.getNewProduct());
		ca.click(mp.getNewProduct());
		Commonactions.isElementPresent(mp.getProductvalue());
		ca.insertText(mp.getProductvalue(), Product[2]);
		Commonactions.isElementPresent(mp.getOptionqtyvalue());
		ca.insertText(mp.getOptionqtyvalue(), "1"+Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getOptiontypevalue());
		ca.insertText(mp.getOptiontypevalue(), Optional[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getOptionNamevalue());
		ca.insertText(mp.getOptionNamevalue(), Optional[2]);
		Commonactions.isElementPresent(qp.getFinish());
		ca.click(qp.getFinish());
		ca.eleToBeClickable();
		System.out.println("Tops-01, Tops-02, Tops-03 created");
	}

	@Then("user copy, delete and edit the created product {string}")
	public void user_copy_delete_and_edit_the_created_product(String string) throws Throwable {
		Commonactions.isElementPresent(mp.getTops3Name());
		ca.click(mp.getTops3Name());
		Commonactions.isElementPresent(mp.getGreencopy());
		ca.click(mp.getGreencopy());
		Commonactions.isElementPresent(mp.getCopyqty());
		ca.insertText(mp.getCopyqty(), "2");
		Commonactions.isElementPresent(mp.getCopyoptionvalue());
		ca.insertText(mp.getCopyoptionvalue(), "Greenshade");
		Commonactions.isElementPresent(mp1.getSave_btn1());
		ca.click(mp1.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getDeletegreenshade());
		ca.click(mp.getDeletegreenshade());
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());
		System.out.println("Copy Edit Delete done for Product Top");
	}

	@Then("Navigate to Product tab and validate Tops available or not")
	public void navigate_to_Product_tab_and_validate_Tops_available_or_not()throws Throwable {

		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(mp.getMerchandise_tab());
		ca.click(mp.getMerchandise_tab());
		Commonactions.isElementPresent(mp.getPlanName());
		ca.click(mp.getPlanName());

		Commonactions.isElementPresent(mp.getSummerchange2022());
		ca.eleToBeClickable();
		ca.clickjs(mp.getSummerchange2022());
		try{ca.click(mp.getSummerchange2022());}
		catch(Exception e){}
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, "summer 2021" +Keys.ENTER);
		ca.eleToBeClickable();
		System.out.println("Summer 2021 selected");

		Commonactions.isElementPresent(mp.getProductsTab());
		ca.click(mp.getProductsTab());
		Commonactions.isElementPresent(mp.getTops3Name());
		ca.click(mp.getTops3Name());
		System.out.println("Tops 3 available under Product Tab");

	}

	@Then("user creates brand under Heirarchy Template {string}")
	public void user_creates_brand_under_Heirarchy_Template(String brandname) throws Throwable {
		String[] brandvalue = brandname.split(",");

		//		Commonactions.isElementPresent(hp.getDatasetup());
		//		ca.click(hp.getDatasetup());
		//		Commonactions.isElementPresent(hp.getHierarchystylesetup());
		//		ca.click(hp.getHierarchystylesetup());

		//		Commonactions.isElementPresent(mp.getNewheirarchybtn());
		//		ca.click(mp.getNewheirarchybtn());
		//		Commonactions.isElementPresent(mp.getHeirarchytype());
		//		ca.insertText(mp.getHeirarchytype(), "Brand");
		//		ca.jsMouseOver();
		//		Commonactions.isElementPresent(mp.getHeirarchyname());
		//		ca.insertText(mp.getHeirarchyname(), brandvalue[0]);
		//		Commonactions.isElementPresent(mp1.getSave_btn1());	
		//		ca.click(mp1.getSave_btn1());
		//		ca.eleToBeClickable();
		//		
		//		Commonactions.isElementPresent(mp.getNewheirarchybtn());
		//		ca.click(mp.getNewheirarchybtn());
		//		Commonactions.isElementPresent(mp.getHeirarchytype());
		//		ca.insertText(mp.getHeirarchytype(), "Brand");
		//		ca.jsMouseOver();
		//		Commonactions.isElementPresent(mp.getHeirarchyname());
		//		ca.insertText(mp.getHeirarchyname(), brandvalue[1]);
		//		ca.click(mp1.getSave_btn1());
		//		ca.eleToBeClickable();
		//		
		//		Commonactions.isElementPresent(mp.getNewheirarchybtn());
		//		ca.click(mp.getNewheirarchybtn());
		//		Commonactions.isElementPresent(mp.getHeirarchytype());
		//		ca.insertText(mp.getHeirarchytype(), "Department");
		//		ca.jsMouseOver();
		//		Commonactions.isElementPresent(mp.getHeirarchyname());
		//		ca.insertText(mp.getHeirarchyname(), brandvalue[2]);
		//		Commonactions.isElementPresent(mp1.getSave_btn1());	
		//		ca.click(mp1.getSave_btn1());
		//		ca.eleToBeClickable();
		//		
		//		Commonactions.isElementPresent(mp.getNewheirarchybtn());
		//		ca.click(mp.getNewheirarchybtn());
		//		Commonactions.isElementPresent(mp.getHeirarchytype());
		//		ca.insertText(mp.getHeirarchytype(), "Collection");
		//		ca.jsMouseOver();
		//		Commonactions.isElementPresent(mp.getHeirarchyname());
		//		ca.insertText(mp.getHeirarchyname(), brandvalue[3]);
		//		Commonactions.isElementPresent(mp1.getSave_btn1());	
		//		ca.click(mp1.getSave_btn1());
		//		ca.eleToBeClickable();

		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(hp.getStyleBtn());
		hp.getStyleBtn().click();		
		Commonactions.isElementPresent(stp.getSeason_Btn());
		stp.getSeason_Btn().click();
		ca.click(stp.getNew_season_Btn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(pp.getSeason_Value());
		ca.insertText(pp.getSeason_Value(), "spring 2020");
		Commonactions.isElementPresent(pp.getSave_and_go_Btn());
		ca.click(sp.getSaveandgo());
		ca.eleToBeClickable();



	}
	@And("create Brand for merchandise {string}")
	public void create_Brand_for_merchandise(String brandname) throws Throwable 
	{		
		String[] brandvalue = brandname.split(",");

		Commonactions.isElementPresent(pp.getBrand_Template());
		ca.insertText(pp.getBrand_Template(), brandvalue[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp1.getSaveAndNew_btn());	
		ca.click(mp1.getSaveAndNew_btn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(pp.getBrand_Template());
		ca.insertText(pp.getBrand_Template(), brandvalue[1]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp1.getSave_btn1());	
		ca.click(mp1.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getBrandXname());	
		ca.click(mp.getBrandXname());
		ca.eleToBeClickable();

		ca.jsScrollPageDown(stp.getNew_season_Btn());
		ca.click(stp.getNew_season_Btn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(mp.getDeptTemplate());
		ca.insertText(mp.getDeptTemplate(),brandvalue[2]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(sp.getSaveandgo());
		ca.click(sp.getSaveandgo());
		ca.eleToBeClickable();

		ca.jsScrollPageDown(stp.getNew_season_Btn());
		ca.click(stp.getNew_season_Btn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(mp.getCollTemplate());
		ca.insertText(mp.getCollTemplate(), brandvalue[3]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp1.getSave_btn1());	
		ca.click(mp1.getSave_btn1());
		ca.eleToBeClickable();


		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(mp.getMerchandise_tab());
		ca.click(mp.getMerchandise_tab());
		Commonactions.isElementPresent(mp.getPlanName());
		ca.click(mp.getPlanName());
		Commonactions.isElementPresent(mp.getProductsTab());
		ca.click(mp.getProductsTab());

		try{Commonactions.isElementPresent(mp.getSummerchange2022());
		ca.eleToBeClickable();
		ca.clickjs(mp.getSummerchange2022());
		try{ca.click(mp.getSummerchange2022());}
		catch(Exception e){}
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, "summer 2021" +Keys.ENTER);
		ca.eleToBeClickable();
		System.out.println("Summer 2021 selected");	
		}
		catch(Exception e)
		{System.out.println("Summer 2021 already selected");		}


	}

	@Then("user navigate to merch collection create product{string}{string}{string}")
	public void user_navigate_to_merch_collection_create_product(String string, String string2, String string3)throws Throwable {
		ca.click(mp.getMerchandise_tab());
		ca.eleToBeClickable();
		ca.click(mp.getPlanName());
		ca.eleToBeClickable();
		

		try{Commonactions.isElementPresent(mp.getSummerchange2021());
		ca.eleToBeClickable();
		ca.click(mp.getSummerchange2021());
		try{ca.click(mp.getSummerchange2021());}
		catch(Exception e){}
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, "summer 2022" +Keys.ENTER);
		ca.eleToBeClickable();
		System.out.println("Summer 2022 selected");	
		}
		catch(Exception e)
		{System.out.println("Summer 2022 already selected");		}

		Commonactions.isElementPresent(mp.getPlantab());
		ca.click(mp.getPlantab());
		Commonactions.isElementPresent(mp.getSummer2021());
		ca.click(mp.getSummer2021());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getAmericaName());
		ca.click(mp.getAmericaName());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getMerchcolltab());
		ca.click(mp.getMerchcolltab());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getTops());
		ca.click(mp.getTops());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getNewproductaction());
		ca.click(mp.getNewproductaction());
		ca.eleToBeClickable();
		ca.insertText(mp.getProductname(), string);
		ca.eleToBeClickable();
		ca.insertText(mp.getProductqty(),"1");
		ca.eleToBeClickable();
		ca.click(mp.getCratestylecheck());
		ca.eleToBeClickable();
		ca.click(qp.getNext());
		ca.eleToBeClickable();
		ca.insertText(mp.getSeasondrp(), string2);
		ca.eleToBeClickable();
		try {
			Actions a = new Actions(driver);
			Thread.sleep(100);
			a.sendKeys(Keys.DOWN).build().perform();
			a.sendKeys(Keys.DOWN).build().perform();
			a.sendKeys(Keys.TAB).build().perform();	
		} catch (Exception e) {		}
		ca.eleToBeClickable();
		ca.insertText(mp.getBranddrp(), string3);
		ca.eleToBeClickable();
		try {
			Actions a = new Actions(driver);
			Thread.sleep(100);
			a.sendKeys(Keys.DOWN).build().perform();
			for(int i=0;i<10;i++){a.sendKeys(Keys.TAB).build().perform();}	
		} catch (Exception e) {		}		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getTestautocheck());
		ca.click(mp.getTestautocheck());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(qp.getFinish());
		ca.click(qp.getFinish());
		ca.eleToBeClickable();
		System.out.println("Completed creating new product without candidate");
	}
	@Then("create product with candidate{string}{string}{string}")
	public void create_product_with_candidate(String string, String string2, String string3)throws Throwable {
		Commonactions.isElementPresent(mp.getNewproductaction());
		ca.click(mp.getNewproductaction());
		ca.eleToBeClickable();
		ca.insertText(mp.getProductname(),string);
		ca.eleToBeClickable();
		ca.insertText(mp.getProductqty(), "1");
		ca.eleToBeClickable();
		//		   ca.click(mp.getCratestylecheck());
		//		   ca.eleToBeClickable();
		ca.click(qp.getNext());
		ca.eleToBeClickable();
		ca.click(mp.getCandidatechk());
		ca.eleToBeClickable();
		ca.insertText(mp.getSeasondrp(), string2);
		ca.eleToBeClickable();
		try {
			Actions a = new Actions(driver);
			Thread.sleep(100);
			a.sendKeys(Keys.DOWN).build().perform();
			a.sendKeys(Keys.DOWN).build().perform();
			a.sendKeys(Keys.TAB).build().perform();	
		} catch (Exception e) {}
		ca.eleToBeClickable();
		ca.insertText(mp.getBranddrp(), string3);
		ca.eleToBeClickable();
		try {
			Actions a = new Actions(driver);
			Thread.sleep(100);
			a.sendKeys(Keys.DOWN).build().perform();
			for(int i=0;i<10;i++){a.sendKeys(Keys.TAB).build().perform();}	
		} catch (Exception e) {		}		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getTestautocheck());
		ca.click(mp.getTestautocheck());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(qp.getFinish());
		ca.click(qp.getFinish());
		ca.eleToBeClickable();
		System.out.println("Completed creating new product with candidate");
	}

}