package com.centric.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.MaterialSpecificationPage;
import com.centric.objectrepository.PopupPage;
import com.centric.objectrepository.SpecificationHierarchyPage;
import com.centric.objectrepository.UserManagementPage;
import com.centric.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SpecificationHierarchyPageSteps extends Commonactions{
	
	HomePage hp = new HomePage();
	Commonactions ca = new Commonactions();
	MaterialSpecificationPage mp = new MaterialSpecificationPage();
	PopupPage pp = new PopupPage();
	SpecificationHierarchyPage sp = new SpecificationHierarchyPage();
	
	
	@When("User Click on specification and creates hierarchy {string},{string},{string},{string},{string}")
	public void user_Click_on_specification_and_creates_hierarchy(String string, String string2, String string3, String string4, String string5) throws Throwable {
	    

		try{
			 Commonactions.isElementPresent(hp.getUser_settingsBtn1());
		        ca.click(hp.getUser_settingsBtn1()); 
			     
			     System.out.println("Setup tab clicked successfully");
		  
		 Commonactions.isElementPresent(hp.getData_Spec());
		 ca.click(hp.getData_Spec());
	     ca.eleToBeClickable();
		 Commonactions.isElementPresent(hp.getSetupSearch());
		 ca.insertText(hp.getSetupSearch(), "Hierarchy Item Templates");
		 ca.eleToBeClickable();
			Commonactions.isElementPresent(sp.getUser_Hierarchy());
			ca.click(sp.getUser_Hierarchy());
			Commonactions.isElementPresent(sp.getNew_Heirarchy_button());
		}catch (Exception excep) {
			
		}
		
		ca.click(sp.getNew_Heirarchy_button());
		Commonactions.isElementPresent(sp.getHeirarchy_Type());
		String[] ss = string.split("-");
		ca.insertText(sp.getHeirarchy_Type(), ss[1].trim());
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sp.getHeirarchy_Name());
		ca.insertText(sp.getHeirarchy_Name(), string);
		Commonactions.isElementPresent(sp.getHeirarchy_code());
		ca.insertText(sp.getHeirarchy_code(), string4);
		Commonactions.isElementPresent(sp.getHeirarchy_Description());
		ca.insertText(sp.getHeirarchy_Description(), string5);
		Commonactions.isElementPresent(pp.getConfig_saveAndnew_Btn());
		ca.click(pp.getConfig_saveAndnew_Btn());
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(sp.getHeirarchy_Type());
		String[] s = string2.split("-");
		ca.insertText(sp.getHeirarchy_Type(), s[1].trim());
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sp.getHeirarchy_Name());
		ca.insertText(sp.getHeirarchy_Name(), string2);
		Commonactions.isElementPresent(sp.getHeirarchy_code());
		ca.insertText(sp.getHeirarchy_code(), string4);
		Commonactions.isElementPresent(sp.getHeirarchy_Description());
		ca.insertText(sp.getHeirarchy_Description(), string5);
		Commonactions.isElementPresent(pp.getConfig_saveAndnew_Btn());
		ca.click(pp.getConfig_saveAndnew_Btn());
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(sp.getHeirarchy_Type());
		String[] s1 = string3.split("-");
		ca.insertText(sp.getHeirarchy_Type(), s1[1].trim());
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sp.getHeirarchy_Name());
		ca.insertText(sp.getHeirarchy_Name(), string3);
		Commonactions.isElementPresent(sp.getHeirarchy_code());
		ca.insertText(sp.getHeirarchy_code(), string4);
		Commonactions.isElementPresent(sp.getHeirarchy_Description());
		ca.insertText(sp.getHeirarchy_Description(), string5);
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		ca.click(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		
		ca.click(sp.getCopy_Collection());
		Commonactions.isElementPresent(sp.getHeirarchy_Name());
		ca.insertText(sp.getHeirarchy_Name(), string2+" - copy");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		System.out.println("Hierarchy created successfully");
		
	}

	@When("User creates style template {string},{string}")
	public void user_creates_style_template(String string,String string2) throws Throwable {
	    

		Commonactions.isElementPresent(hp.getUser_settingsBtn1());
        ca.click(hp.getUser_settingsBtn1()); 
	     
	     System.out.println("Setup tab clicked successfully");
  
       Commonactions.isElementPresent(hp.getData_Spec());
       ca.click(hp.getData_Spec());
       ca.eleToBeClickable();
       Commonactions.isElementPresent(hp.getSetupSearch());
       ca.insertText(hp.getSetupSearch(), "Style Templates");
       ca.eleToBeClickable();
	   Commonactions.isElementPresent(sp.getUser_Style());
	   ca.click(sp.getUser_Style());
		Commonactions.isElementPresent(sp.getNew_Style_Template_Button());
		ca.click(sp.getNew_Style_Template_Button());
		Commonactions.isElementPresent(sp.getStyle_Name());
		ca.insertText(sp.getStyle_Name(), string);
		Commonactions.isElementPresent(sp.getStyle_Type());
		ca.insertText(sp.getStyle_Type(), string2);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(sp.getStyle_Name_Created());
		
		
		ca.click(sp.getStyle_Name_Created());
		Commonactions.isElementPresent(sp.getStyle_BOM());
		ca.click(sp.getStyle_BOM());
		ca.eleToBeClickable();
		
		System.out.println("Style template created successfully");
		
	}

	@When("User creates Classifier {string}")
	public void user_creates_Classifier(String string) throws Throwable {
	    
		Commonactions.isElementPresent(hp.getUser_settingsBtn1());
        ca.click(hp.getUser_settingsBtn1()); 
	     
	     System.out.println("Setup tab clicked successfully");
  
       Commonactions.isElementPresent(hp.getData_Spec());
       ca.click(hp.getData_Spec());
       ca.eleToBeClickable();
       Commonactions.isElementPresent(hp.getSetupSearch());
       ca.insertText(hp.getSetupSearch(), "Classifiers");
       ca.eleToBeClickable();
		
		Commonactions.isElementPresent(sp.getUser_Classifier1());
		ca.click(sp.getUser_Classifier1());
		Commonactions.isElementPresent(sp.getNew_Classifier_Button());
		ca.click(sp.getNew_Classifier_Button());
		ca.eleToBeClickable();
		WebElement activeElement = driver.switchTo().activeElement();
		ca.eleToBeClickable();
		ca.insertText(activeElement, string+"0");
		activeElement.sendKeys(Keys.TAB);
		//Commonactions.isElementPresent(sp.getClick_Empty0());
		//ca.click(sp.getClick_Empty0());
		Commonactions.isElementPresent(sp.getGreater_Icon1());
		
		ca.click(sp.getGreater_Icon1());
		Commonactions.isElementPresent(sp.getPlus_Icon_1());
		ca.click(sp.getPlus_Icon_1());
		ca.eleToBeClickable();
		WebElement activeElement1 = driver.switchTo().activeElement();
		ca.eleToBeClickable();
		ca.insertText(activeElement1, string+"1");
		activeElement1.sendKeys(Keys.TAB);
		//Commonactions.isElementPresent(sp.getClick_Empty1());
		//ca.click(sp.getClick_Empty1());
		Commonactions.isElementPresent(sp.getGreater_Icon2());
		
		ca.click(sp.getGreater_Icon2());
		Commonactions.isElementPresent(sp.getPlus_Icon_1());
		ca.click(sp.getPlus_Icon_1());
		ca.eleToBeClickable();
		WebElement activeElement2 = driver.switchTo().activeElement();
		ca.eleToBeClickable();
		ca.insertText(activeElement2, string+"2");
		activeElement2.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(sp.getGreater_Icon3());
		
		ca.click(sp.getGreater_Icon3());
		Commonactions.isElementPresent(sp.getPlus_Icon_1());
		ca.click(sp.getPlus_Icon_1());
		ca.eleToBeClickable();
		WebElement activeElement3 = driver.switchTo().activeElement();
		ca.eleToBeClickable();
		ca.insertText(activeElement3, string+"3");
		activeElement3.sendKeys(Keys.TAB);
		
		/*try{
			ca.eleToBeClickable();
	        ca.click(hp.getUser_homeBtn()); 
		     
		     System.out.println("home tab clicked successfully");
			Commonactions.isElementPresent(hp.getSpecificationBtn());
			ca.click(hp.getSpecificationBtn());
			ca.eleToBeClickable();
			Commonactions.isElementPresent(sp.getUser_Classifier());
			ca.click(sp.getUser_Classifier());
		}catch (Exception excep) {
			
		}
		Commonactions.isElementPresent(sp.getClassifier3s_Button());
		
		ca.click(sp.getClassifier3s_Button());
		ca.eleToBeClickable();
		Assert.assertTrue(sp.getGet_Classifeier3S_text().isDisplayed());
		ca.eleToBeClickable();*/
		
		System.out.println("classifier created successfully");
		
	}
	
	UserManagementPage up = new UserManagementPage();

	@When("user creates color specification and validation {string},{string},{string}")
	public void user_creates_color_specification_and_validation(String string, String string2,String string3) throws Throwable {
	    
		try{
			ca.eleToBeClickable();
			ca.click(hp.getSpecificationBtn());
			ca.eleToBeClickable();
			ca.eleToBeClickable();
			ca.click(sp.getUser_Hierarchy());
			ca.eleToBeClickable();
		}catch (Exception excep) {
			
		}
		
		ca.eleToBeClickable();
		ca.click(sp.getUser_ColorSpecification());
		ca.eleToBeClickable();
		ca.click(sp.getCS_View());
		ca.eleToBeClickable();
		ca.click(sp.getCS_Mans_View());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Copy());
		ca.eleToBeClickable();
		ca.insertText(up.getUsrMgmt_Copy_Value(),string);
		ca.eleToBeClickable();
		ca.click(sp.getRGB_Hex());
		ca.eleToBeClickable();
		ca.click(sp.getAdd_ManageView());
		ca.eleToBeClickable();
		ca.jsScrollPageDown(mp.getSave_btn1());
		Thread.sleep(2000);
		ca.clickjs(mp.getSave_btn1());
		Thread.sleep(2000);
		ca.eleToBeClickable();
		
		ca.eleToBeClickable();
		ca.click(sp.getNew_Color_Specification_Button());
		ca.eleToBeClickable();
		//
		ca.insertText(sp.getColorSpecification_Value(), string2);
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		try{
			for (int i = 0; i < 200; i++) {
				//ca.eleToBeClickable();
			    ca.clickjs(sp.getRightIcon_CS());
			if (sp.getRGB_Hex_Field().isDisplayed()) {
				ca.eleToBeClickable();
				ca.clickjs(sp.getRightIcon_CS());
				ca.clickjs(sp.getRightIcon_CS());
				ca.clickjs(sp.getRGB_Hex_Field());
				ca.eleToBeClickable();
				WebElement activeElement = driver.switchTo().activeElement();
				ca.eleToBeClickable();
				ca.insertText(activeElement,string3);
				break;
			}}
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		ca.clickjs(sp.getRightIcon_CS());
		ca.eleToBeClickable();
		ca.click(sp.getCopy_colorSpecification());
		ca.eleToBeClickable();
		ca.insertText(sp.getColorSpecification_Value(), string2 + " - Duplicate");
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		ca.click(sp.getMerge_symbol());
		ca.eleToBeClickable();
		ca.click(sp.getCheckBox_1());
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
	
		
		System.out.println("color specification created successfully");
		
		//driver.close();
		
	}

	@Given("User setup enumeration configurtion {string},{string}")
	public void user_setup_enumeration_configurtion(String string, String string2) throws Throwable {
	    
		ca.eleToBeClickable();
		ca.click(hp.getUser_setupBtn());
		ca.eleToBeClickable();
		ca.click(sp.getEnumeration());
		ca.eleToBeClickable();
		ca.click(sp.getEnumeration_Search());
		ca.eleToBeClickable();
		ca.click(sp.getDimension_Type());
		ca.eleToBeClickable();
		ca.click(sp.getClick_Custom());
		ca.eleToBeClickable();
		String text = ca.getText(sp.getGettext_Size());
		ca.eleToBeClickable();
		Assert.assertEquals("Size", text);
		ca.eleToBeClickable();
		ca.click(sp.getPlus_Icon_2());
		ca.eleToBeClickable();
		ca.insertText(sp.getEnum_Value(), string);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_saveAndnew_Btn());
		ca.eleToBeClickable();
		ca.insertText(sp.getEnum_Value(), string2);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		
		
		System.out.println("Dimension Type created successfully");
		
	}

	@Given("User update configuration")
	public void user_update_configuration() throws Throwable {
	    
		ca.eleToBeClickable();
		ca.click(hp.getUser_settingsBtn());
		ca.eleToBeClickable();
		ca.click(hp.getUpdate_config());
		ca.eleToBeClickable();
		ca.click(pp.getUpdate_Run_Btn());
		ca.eleToBeClickable();
		
		ca.waitForAlert(driver);
		
		System.out.println("config updated successfully");
		
	}
    
	String[] sizes,length1;
	
	@When("User creates Dimension-Type sizes {string}")
	public void user_creates_Dimension_Type_sizes(String string) throws Throwable {
		
		try{
			ca.eleToBeClickable();
	        ca.click(hp.getUser_homeBtn()); 
		     
		     System.out.println("home tab clicked successfully");
			ca.eleToBeClickable();
			ca.click(hp.getSpecificationBtn());
		}catch (Exception e) {
			// TODO: handle exception
		}
	    
		 sizes = string.split(",");
		
		ca.eleToBeClickable();
		ca.click(sp.getUser_Size());
		ca.eleToBeClickable();
		ca.click(sp.getNew_Size_Button());
		ca.eleToBeClickable();
		ca.insertText(sp.getSize_Name(), sizes[0].trim());
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		
		for(int i = 1;i < sizes.length;i++){
			ca.eleToBeClickable();
			ca.click(sp.getNew_Size_Button());
			ca.eleToBeClickable();
			ca.insertText(sp.getSize_Name(), sizes[i].trim());
			ca.eleToBeClickable();
			ca.insertText(sp.getSize_Code(), string.valueOf(i));
			ca.eleToBeClickable();
			ca.click(pp.getConfig_save_Btn());
			ca.eleToBeClickable();
			
		}
		
		System.out.println("Dimension Type sizes created successfully");
		
	}

	@When("User creates Dimension-Type length {string},{string}")
	public void user_creates_Dimension_Type_length(String string, String string2) throws Throwable {
	    
		 length1 = string.split(",");
		
		ca.eleToBeClickable();
		ca.click(sp.getNew_Size_Button());
		ca.eleToBeClickable();
		ca.insertText(sp.getSize_Name(), length1[0].trim());
		ca.eleToBeClickable();
		ca.insertText(sp.getDimension_Type_value(), string2);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		
		for(int i = 1;i < length1.length;i++){
			ca.eleToBeClickable();
			ca.click(sp.getNew_Size_Button());
			ca.eleToBeClickable();
			ca.insertText(sp.getSize_Name(), length1[i].trim());
			ca.eleToBeClickable();
			ca.insertText(sp.getDimension_Type_value(), string2);
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();
			ca.insertText(sp.getSize_Code(), string.valueOf(i));
			ca.eleToBeClickable();
			ca.click(pp.getConfig_save_Btn());
			ca.eleToBeClickable();
			
		}
		
		System.out.println("Dimension Type length created successfully");
		
		
		
		
	}

	@When("User creates two dimensional sizes")
	public void user_creates_two_dimensional_sizes() throws Throwable {
		
		for(int i = 0;i < sizes.length;i++){
			ca.eleToBeClickable();
		ca.click(sp.getNew_Size_Button());
		ca.eleToBeClickable();
		ca.click(sp.getTwoDim_CheckBox());
		ca.eleToBeClickable();
		ca.insertText(sp.getSize_Name(), sizes[0]+" "+length1[i]);
		ca.eleToBeClickable();
		ca.insertText(sp.getSize_Lenght_Dropdown(), sizes[0]+" ");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.insertText(sp.getTwoDim_Size_Length_Drpdown(), length1[i]+" ");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
	    
		}
		
		for(int i = 0;i < sizes.length;i++){
			ca.eleToBeClickable();
		ca.click(sp.getNew_Size_Button());
		ca.eleToBeClickable();
		ca.click(sp.getTwoDim_CheckBox());
		ca.eleToBeClickable();
		ca.insertText(sp.getSize_Name(), sizes[1]+" "+length1[i]);
		ca.eleToBeClickable();
		ca.insertText(sp.getSize_Lenght_Dropdown(), sizes[1]+" ");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.insertText(sp.getTwoDim_Size_Length_Drpdown(), length1[i]+" ");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
	    
		}
		
		for(int i = 0;i < sizes.length;i++){
			ca.eleToBeClickable();
		ca.click(sp.getNew_Size_Button());
		ca.eleToBeClickable();
		ca.click(sp.getTwoDim_CheckBox());
		ca.eleToBeClickable();
		ca.insertText(sp.getSize_Name(), sizes[2]+" "+length1[i]);
		ca.eleToBeClickable();
		ca.insertText(sp.getSize_Lenght_Dropdown(), sizes[2]+" ");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.insertText(sp.getTwoDim_Size_Length_Drpdown(), length1[i]+" ");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
	    
		}
		
		System.out.println("Two Dimension Type length created successfully");
		
	}

	@When("User creates size range and performing copy action {string},{string}")
	public void user_creates_size_range_and_performing_copy_action(String string, String string2) throws Throwable {
	   


		
		ca.eleToBeClickable();
		ca.click(sp.getUser_SizeRange());
		ca.eleToBeClickable();
		ca.click(sp.getNew_SizeRange_Button());
		ca.eleToBeClickable();
		ca.insertText(sp.getSizeRange_Value(),string);
		ca.eleToBeClickable();
		ca.insertText(sp.getSizeRange_Description(), string2);
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		ca.click(sp.getClickSize());
		ca.eleToBeClickable();
		//temp=====
		for (int i = 1; i <= sizes.length; i++) {
			ca.eleToBeClickable();
			
			driver.findElement(By.xpath("//div[@role='option' and @item='"+i+"']")).click();
			
		}
		ca.eleToBeClickable();
		ca.click(sp.getBaseSize());
		
		
		
		ca.eleToBeClickable();
		ca.click(sp.getCopySR());
		ca.eleToBeClickable();
		ca.insertText(sp.getSizeRange_Value(), string+" - copy");
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		System.out.println("size range creted successfully");
		
	}

	@When("User creates two dimensional size range {string},{string}")
	public void user_creates_two_dimensional_size_range(String string, String string2) throws Throwable {
	    
		ca.eleToBeClickable();
		ca.click(sp.getNew_SizeRange_Button());
		ca.eleToBeClickable();
		ca.insertText(sp.getSizeRange_Value(),string);
		ca.eleToBeClickable();
		ca.insertText(sp.getSizeRange_Description(), string2);
		ca.eleToBeClickable();
		ca.click(sp.getTwoDim_CheckBox());
		ca.eleToBeClickable();
		ca.insertText(sp.getSize_Range_Dim_Dropdown(), "Size");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.insertText(sp.getLength_Range_Dim_Dropdown(), "Length");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		ca.click(sp.getClickSize());
		
		int i = sizes.length;
		int j = length1.length;
		
		for (int j2 = 1; j2 <= i+j; j2++) {
              ca.eleToBeClickable();
			  driver.findElement(By.xpath("//div[@role='option' and @item='"+j2+"']")).click();
			
		}
		ca.eleToBeClickable();
		ca.click(sp.getBaseSize());
		
		try{
			for (int k = 0; k < 10; k++) {
				//ca.eleToBeClickable();
				ca.eleToBeClickable();
				ca.click(sp.getClick_SR());
			if (sp.getOkSize_CheckBox().isDisplayed()) {
				ca.eleToBeClickable();
				ca.click(sp.getOkSize_CheckBox());
				break;
				
			}}}
			catch (Exception e) {
				// TODO: handle exception
			}
		
		ca.eleToBeClickable();
		ca.click(sp.getNew_SizeRange_Button());
		ca.eleToBeClickable();
		ca.insertText(sp.getSizeRange_Value(), "Composite");
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		ca.eleToBeClickable();
		ca.click(sp.getChart_SR());
		ca.eleToBeClickable();
		ca.click(sp.getCheckBox_2());
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		ca.click(sp.getBaseSize0());
		ca.eleToBeClickable();
		WebElement activeElement = driver.switchTo().activeElement();
		ca.eleToBeClickable();
		ca.insertText(activeElement, length1[1].trim());
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		
		//driver.close();
		
	}

}
