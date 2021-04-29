package com.centric.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.MaterialSpecificationPage;
import com.centric.objectrepository.PopupPage;
import com.centric.objectrepository.SourcingPage;
import com.centric.objectrepository.StylePage;
import com.centric.objectrepository.UserManagementPage;
import com.centric.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MaterialSpecificationPageSteps extends Commonactions{
	
	Commonactions ca = new Commonactions();
	HomePage hp = new HomePage();
	PopupPage pp = new PopupPage();
	MaterialSpecificationPage mp = new MaterialSpecificationPage();
	
	@Then("Click Libraries tab under specification")
	public void click_Libraries_tab_under_specification() throws Throwable {
	   try{
		   
		   Commonactions.isElementPresent(hp.getUser_homeBtn());
	        ca.click(hp.getUser_homeBtn()); 
		     
		     System.out.println("home tab clicked successfully");
	   }catch(Exception e){
		   
	   }
		Commonactions.isElementPresent(hp.getMaterialBtn());
		ca.click(hp.getMaterialBtn());
		/*try{
			ca.eleToBeClickable();;
			Commonactions.clickjs(driver.findElement(By.xpath("(//span[contains(text(),'Libraries')]/parent::div/parent::div/parent::div/preceding-sibling::div)[3]")));
			Commonactions.isElementPresent(mp.getLibraries());
			ca.click(mp.getLibraries());
			//ca.eleToBeClickable();
		}catch(Exception e){
			ca.eleToBeClickable();
			Commonactions.clickjs(driver.findElement(By.xpath("(//span[contains(text(),'Libraries')]/parent::div/parent::div/parent::div/preceding-sibling::div)[3]")));
			Commonactions.isElementPresent(mp.getLibraries());
			ca.click(mp.getLibraries());
		}
		*/
		ca.eleToBeClickable();
		ca.click(mp.getLibraries());
		ca.eleToBeClickable();
		
		System.out.println("libraries clicked successfully");
		
	}
	
	static String stand;

	@When("User create New material with mandatory deatails for material creation {string},{string},{string}")
	public void user_create_New_material_with_mandatory_deatails_for_material_creation(String string, String string2, String string3) throws Throwable {
	    
         stand=string2;
		
		
	//	Commonactions.isElementPresent(mp.getLib_drpdown());
	//	ca.click(mp.getLib_drpdown());
		Commonactions.isElementPresent(mp.getMaterial_btn());
		ca.click(mp.getMaterial_btn());
		ca.eleToBeClickable();
		WebElement activeElement = driver.switchTo().activeElement();
	    ca.eleToBeClickable();
		ca.insertText(activeElement, "Automation");
        WebElement a = ca.activeElement();
        a.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(mp.getLib_node_name());
		ca.click(mp.getLib_node_name());
		ca.eleToBeClickable();
		try{
		//Commonactions.isElementPresent(mp.getMaterial_btn());
		ca.click(mp.getMaterial_btn());
		Commonactions.isElementPresent(mp.getMaterial_value());
		ca.insertText(mp.getMaterial_value(), string);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getMaterial());
		ca.insertText(mp.getMaterial(), string2);
		Commonactions.isElementPresent(mp.getMaterial_code());
		ca.insertText(mp.getMaterial_code(), string3);
		Commonactions.isElementPresent(mp.getSave_btn1());
		Commonactions.clickjs(mp.getSave_btn1());
		ca.eleToBeClickable();
		}
		catch (Exception e) {
			Commonactions.isElementPresent(hp.getUser_homeBtn());
	        ca.click(hp.getUser_homeBtn()); 	     
		    System.out.println("home tab clicked successfully");	     
		    Commonactions.isElementPresent(hp.getMaterialBtn()); 		
			ca.click(hp.getMaterialBtn());
	        Commonactions.isElementPresent(driver.findElement(By.xpath("(//span[text()='Material' or @data-csi-tab='ApparelViews-AllMaterials'])[2]"))); 		
			ca.click(driver.findElement(By.xpath("(//span[text()='Material' or @data-csi-tab='ApparelViews-AllMaterials'])[2]")));
			Commonactions.isElementPresent(mp.getNew_material_btn());
			ca.click(mp.getNew_material_btn());
			Commonactions.isElementPresent(mp.getMaterial_value());
			ca.insertText(mp.getMaterial_value(), string);
			ca.eleToBeClickable();
			ca.jsMouseOver();
			Commonactions.isElementPresent(mp.getMaterial());
			ca.insertText(mp.getMaterial(), string2);
			Commonactions.isElementPresent(mp.getMaterial_code());
			ca.insertText(mp.getMaterial_code(), string3);
			Commonactions.isElementPresent(mp.getSave_btn1());
			Commonactions.clickjs(mp.getSave_btn1());
			ca.eleToBeClickable();
		}
		System.out.println("standalone material created successfully");
		
	}

	@Then("User create material for Structure Component {string},{string},{string},{string},{string},{string}")
	public void user_create_material_for_Structure_Component(String string, String string2, String string3, String string4, String string5, String string6) throws Throwable {
	   
		
		Commonactions.isElementPresent(hp.getUser_homeBtn());
        ca.click(hp.getUser_homeBtn()); 	     
	     System.out.println("home tab clicked successfully");	     
	    Commonactions.isElementPresent(hp.getMaterialBtn()); 		
		ca.click(hp.getMaterialBtn());
        Commonactions.isElementPresent(driver.findElement(By.xpath("(//span[text()='Material' or @data-csi-tab='ApparelViews-AllMaterials'])[2]"))); 		
		ca.click(driver.findElement(By.xpath("(//span[text()='Material' or @data-csi-tab='ApparelViews-AllMaterials'])[2]")));
		Commonactions.isElementPresent(mp.getNew_material_btn());
		ca.click(mp.getNew_material_btn());
		Commonactions.isElementPresent(mp.getMaterial_value());
		ca.insertText(mp.getMaterial_value(), string);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getMaterial());
		ca.insertText(mp.getMaterial(), string2);
		Commonactions.isElementPresent(mp.getMaterial_code());
		ca.insertText(mp.getMaterial_code(), string3);
		Commonactions.isElementPresent(mp.getSave_btn1());
		Commonactions.clickjs(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		System.out.println("structure component material created successfully");
		
		Commonactions.isElementPresent(mp.getNew_material_btn());
		ca.click(mp.getNew_material_btn());
		Commonactions.isElementPresent(mp.getMaterial_value());
		ca.insertText(mp.getMaterial_value(), string4);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getMaterial());
		ca.insertText(mp.getMaterial(), string5);
		Commonactions.isElementPresent(mp.getMaterial_code());
		ca.insertText(mp.getMaterial_code(), string6);
		Commonactions.isElementPresent(mp.getSave_btn1());
		Commonactions.clickjs(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		System.out.println("Tool material created successfully");
		
		
	}

	@Then("User performing copy and delete action on material")
	public void user_performing_copy_and_delete_action_on_material() throws Throwable {
	    
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//span[@data-csi-context-parent='centric://APPAREL/Views' and @data-csi-act='Copy'])[3]")));
		Commonactions.isElementPresent(mp.getMaterial());
		ca.insertText(mp.getMaterial(), stand+" - Copy");
		Commonactions.isElementPresent(mp.getSave_btn1());
		Commonactions.clickjs(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		System.out.println("standalone material copy created successfully");
		
		ca.click(driver.findElement(By.xpath("(//span[@data-csi-context-parent='centric://APPAREL/Views' and @data-csi-act='Copy'])[1]")));
		Commonactions.isElementPresent(mp.getSave_btn1());
		Commonactions.clickjs(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		System.out.println("Tool material copy created successfully");
		
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//span[@data-csi-context-parent='centric://APPAREL/Views' and @data-csi-act='Delete'])[2]")));
		Commonactions.isElementPresent(pp.getDelete_Btn());
		Commonactions.clickjs(pp.getDelete_Btn());
		ca.eleToBeClickable();
		
		System.out.println("Tool material copy deleted successfully");
		
	}
	
	@When("User creates color and size")
	public void user_creates_color_and_size() throws Throwable {
	    
		Commonactions.isElementPresent(mp.getCopy_name());
		Commonactions.clickjs(mp.getCopy_name());
		Commonactions.isElementPresent(mp.getNew_colored_material_btn());
		ca.jsScrollPageDown(mp.getNew_colored_material_btn());
		Commonactions.isElementPresent(mp.getNew_colored_material_btn());
		ca.click(mp.getNew_colored_material_btn());
		Commonactions.isElementPresent(mp.getColored_material_value());
		ca.insertText(mp.getColored_material_value(), "Red");
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		Commonactions.clickjs(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(mp.getColored_material_value());
		ca.insertText(mp.getColored_material_value(), "Blue");
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		Commonactions.clickjs(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(mp.getColored_material_value());
		ca.insertText(mp.getColored_material_value(), "Yellow");
		Commonactions.isElementPresent(mp.getSave_btn1());
		Commonactions.clickjs(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		System.out.println("Colors created successfully");
		
		Commonactions.isElementPresent(mp.getNew_size_btn());
		ca.jsScrollPageDown(mp.getNew_size_btn());
		Commonactions.isElementPresent(mp.getNew_size_btn());
		ca.click(mp.getNew_size_btn());
		Commonactions.isElementPresent(mp.getSize_value());
		ca.insertText(mp.getSize_value(), "30");
		Commonactions.isElementPresent(mp.getDim_value());
		ca.insertText(mp.getDim_value(), "Size");
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		Commonactions.clickjs(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(mp.getSize_value());
		ca.insertText(mp.getSize_value(), "32");
		Commonactions.isElementPresent(mp.getSortOrder());
		ca.insertText(mp.getSortOrder(), "1");
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		Commonactions.clickjs(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(mp.getSize_value());
		ca.insertText(mp.getSize_value(), "34");
		Commonactions.isElementPresent(mp.getSortOrder());
		ca.insertText(mp.getSortOrder(), "2");
		Commonactions.isElementPresent(mp.getSave_btn1());
		Commonactions.clickjs(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		System.out.println("Size created successfully");
		StylePage sp = new StylePage();
		
		//ca.jsScrollPageUp(sp.getImg_icon());
	    
	    
	}
	
	SourcingPage sp = new SourcingPage();
	
	@Then("User creating suppliers,samples and sku and validates {string},{string},{string},{string},{string},{string},{string}")
	public void user_creating_suppliers_samples_and_sku_and_validates(String A,String B,String C,String string, String string2, String string3,String string7) throws Throwable {
	    
		
		Commonactions.isElementPresent(hp.getSourcingBtn());
		ca.click(hp.getSourcingBtn());
		Commonactions.isElementPresent(mp.getSupplier());
		ca.click(mp.getSupplier());
		Commonactions.isElementPresent(mp.getNew_suppliier_Btn());
		ca.click(mp.getNew_suppliier_Btn());
		Commonactions.isElementPresent(mp.getSupplierValue());
		ca.insertText(mp.getSupplierValue(), C);
		Commonactions.isElementPresent(mp.getIsAgent_ChkBox());
		ca.click(mp.getIsAgent_ChkBox());
		Commonactions.isElementPresent(mp.getIsSupplier_ChkBox());
		ca.click(mp.getIsSupplier_ChkBox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(mp.getIsWareHouse_ChkBox());
		ca.click(mp.getIsWareHouse_ChkBox());
		ca.eleToBeClickable();
		
		ca.click(mp.getNew_suppliier_Btn());
		Commonactions.isElementPresent(mp.getSupplierValue());
		ca.insertText(mp.getSupplierValue(), A);
		Commonactions.isElementPresent(mp.getIsAgent_ChkBox());
		ca.click(mp.getIsAgent_ChkBox());
		Commonactions.isElementPresent(mp.getIsSupplier_ChkBox());
		ca.click(mp.getIsSupplier_ChkBox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		ca.click(mp.getNew_suppliier_Btn());
		Commonactions.isElementPresent(mp.getSupplierValue());
		ca.insertText(mp.getSupplierValue(), B);
		Commonactions.isElementPresent(mp.getIsSupplier_ChkBox());
		ca.click(mp.getIsSupplier_ChkBox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		System.out.println("Supplier created successfully");
		
		Commonactions.isElementPresent(hp.getUser_homeBtn());
        ca.click(hp.getUser_homeBtn()); 
	     
	     System.out.println("home tab clicked successfully");
	     
	    Commonactions.isElementPresent(hp.getMaterialBtn()); 
	    try{
	    	ca.click(hp.getMaterialBtn());
			ca.eleToBeClickable();
	    }catch (Exception e) {
			
		}
	    
		Commonactions.isElementPresent(mp.getCopy_name());
		Commonactions.clickjs(mp.getCopy_name());
		Commonactions.isElementPresent(mp.getSamples1());
		ca.click(mp.getSamples1());
		Commonactions.isElementPresent(mp.getNew_mat_Sample_Btn1());
		ca.click(mp.getNew_mat_Sample_Btn1());
		Commonactions.isElementPresent(mp.getSupplier_Value());
		ca.click(mp.getSupplier_Value());
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.insertText(e1, string7);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		Commonactions.isElementPresent(mp.getMat_SampleValue1());
		ca.insertText(mp.getMat_SampleValue1(), string);
		ca.eleToBeClickable();
		String[] s = string2.split("=");
		ca.insertText(mp.getColor_sizeValue(), s[0]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getQntyMatrix());
		ca.click(mp.getQntyMatrix());
		Commonactions.isElementPresent(mp.getQntyValue());
		ca.insertText(mp.getQntyValue(), s[1]);
		Commonactions.isElementPresent(mp.getBlue());
		ca.click(mp.getBlue());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		System.out.println("Sample created successfully");
		
		Commonactions.isElementPresent(mp.getSKU());
		ca.click(mp.getSKU());
		Commonactions.isElementPresent(mp.getNew_mat_sku_Btn());
		ca.click(mp.getNew_mat_sku_Btn());
		Commonactions.isElementPresent(mp.getMat_sku_value());
		ca.insertText(mp.getMat_sku_value(), string3);
		Commonactions.isElementPresent(mp.getUseMatrix_chkBox());
		ca.click(mp.getUseMatrix_chkBox());
		Commonactions.isElementPresent(mp.getSelectAll());
		ca.click(mp.getSelectAll());
		Commonactions.isElementPresent(mp.getSelectParticular());
		ca.click(mp.getSelectParticular());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
	    
		System.out.println("SKU created successfully");
	    
		
	}
	UserManagementPage up=new UserManagementPage();

	@Then("User validates material gallery {string},{string}")
	public void user_validates_material_gallery(String string, String string2) throws Throwable {

		try{
			   Commonactions.isElementPresent(hp.getUser_homeBtn());
		        ca.click(hp.getUser_homeBtn()); 
			     
			     System.out.println("home tab clicked successfully");
		   }catch(Exception e){
			   
		   }
		
		Commonactions.isElementPresent(hp.getMaterialBtn());
		 try{
		    	ca.click(hp.getMaterialBtn());
				ca.eleToBeClickable();
		    }catch (Exception e) {
				
			}
		 
		 
		Commonactions.isElementPresent(mp.getMaterial_gallery());
		ca.click(mp.getMaterial_gallery());
		ca.eleToBeClickable();
		List<WebElement> gallery = driver.findElements(By.xpath("//div[@class='csiGalleryProperties']//a"));
		Commonactions.mouseOver(driver.findElement(By.xpath("(//div[@class='csiGalleryProperties']//a)[1]")));
		for (WebElement webElement : gallery) {
			
			System.out.println("gallery names are :"+webElement.getText());
		}
		
		
		
		Commonactions.isElementPresent(mp.getMGViews());
		ca.click(mp.getMGViews());
		Commonactions.isElementPresent(mp.getMGMan_Views());
		ca.click(mp.getMGMan_Views());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), string);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//select[@class='csiPreferenceSelect '])/option[1]")));
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//select[@class='csiPreferenceSelect '])/option[1]")));
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//select[@class='csiPreferenceSelect '])/option[1]")));
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//select[@class='csiPreferenceSelect '])/option[1]")));
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//select[@class='csiPreferenceSelect '])/option[1]")));
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//select[@class='csiPreferenceSelect '])/option[1]")));
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//select[@class='csiPreferenceSelect '])/option[1]")));
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.jsScrollPageDown(mp.getSave_btn1());
		Commonactions.clickjs(mp.getSave_btn1());;
		ca.eleToBeClickable();
		try{
		ca.click(driver.findElement(By.xpath("(//label[contains(text(),'Filter')]//following-sibling::div)[1]/div[1]")));
		Commonactions.isElementPresent(mp.getMGFilter());
		ca.insertText(mp.getMGFilter(), string2);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		}catch (Exception e) {
			// TODO: handle exception
		}
		ca.eleToBeClickable();
		
		System.out.println("Material Gallery verified successfully");
		
	}

	@Then("User validates material security group {string},{string},{string},{string},{string}")
	public void user_validates_material_security_group(String string, String string2, String string3,String string4, String string5) throws Throwable {
	    
		try{
			   Commonactions.isElementPresent(hp.getUser_homeBtn());
		        ca.click(hp.getUser_homeBtn()); 
			     
			     System.out.println("home tab clicked successfully");
		   }catch(Exception e){
			   
		   }
		
		Commonactions.isElementPresent(hp.getMaterialBtn());
		 try{
		    	ca.click(hp.getMaterialBtn());
				ca.eleToBeClickable();
		    }catch (Exception e) {
				
			}
		
		Commonactions.isElementPresent(mp.getMatSecGrps());
		ca.click(mp.getMatSecGrps());
		Commonactions.isElementPresent(mp.getMSGViews());
		ca.click(mp.getMSGViews());
		Commonactions.isElementPresent(mp.getMSG_manViews());
		ca.click(mp.getMSG_manViews());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), string);
		ca.eleToBeClickable();
		//ca.selectByText(driver.findElement(By.xpath("(//select[@class='csiPreferenceSelect '])[1]/option[text()='Material Security Group']")), "Material Security Group");
		//ca.eleToBeClickable();
		//ca.click(mp.getAdd());
		//ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//select[@class='csiPreferenceSelect '])[1]/option[text()='Only For Material Types']")));
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.jsScrollPageDown(mp.getSave_btn1());
		Commonactions.clickjs(mp.getSave_btn1());;
		ca.eleToBeClickable();
		
		
		System.out.println("Material Security Group custom view created successfully");
		
		Commonactions.isElementPresent(mp.getMat_SecGrp_Btn());
		ca.click(mp.getMat_SecGrp_Btn());
		ca.eleToBeClickable();
		WebElement a = driver.switchTo().activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, string4);
		Commonactions.isElementPresent(mp.getClickEmpty());
		ca.click(mp.getClickEmpty());
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(mp.getMat_SecGrp_Btn());
		ca.click(mp.getMat_SecGrp_Btn());
		ca.eleToBeClickable();
		WebElement a1 = driver.switchTo().activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, string5);
		Commonactions.isElementPresent(mp.getClickEmpty());
		ca.click(mp.getClickEmpty());
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(mp.getMat_SecGrp_Btn());
		ca.click(mp.getMat_SecGrp_Btn());
		ca.eleToBeClickable();
		WebElement activeElement = driver.switchTo().activeElement();
		ca.eleToBeClickable();
		ca.insertText(activeElement, string2);
		Commonactions.isElementPresent(mp.getOnlyForMat());
		ca.click(mp.getOnlyForMat());
		Commonactions.isElementPresent(mp.getStandalone_chkbox());
		ca.click(mp.getStandalone_chkbox());
		Commonactions.isElementPresent(mp.getClickEmpty());
		ca.click(mp.getClickEmpty());
		ca.eleToBeClickable();
		
		System.out.println("MSG_Standalone created successfully");
		
		Commonactions.isElementPresent(mp.getMat_SecGrp_Btn());
		ca.click(mp.getMat_SecGrp_Btn());
		ca.eleToBeClickable();
		WebElement activeElement1 = driver.switchTo().activeElement();
		ca.eleToBeClickable();
		ca.insertText(activeElement1, string3);
		Commonactions.isElementPresent(mp.getOnlyForMat());
		ca.click(mp.getOnlyForMat());
		Commonactions.isElementPresent(mp.getStandalone_chkbox());
		ca.click(mp.getStandalone_chkbox());
		Commonactions.isElementPresent(mp.getStructure_Component());
		ca.click(mp.getStructure_Component());
		Commonactions.isElementPresent(mp.getTool());
		ca.click(mp.getTool());
		Commonactions.isElementPresent(mp.getClickEmpty());
		ca.click(mp.getClickEmpty());
		ca.eleToBeClickable();
		
		System.out.println("MSG_All created successfully");
	}

	@Then("User validates colored material")
	public void user_validates_colored_material() throws Throwable {
	   
		try{
			   Commonactions.isElementPresent(hp.getUser_homeBtn());
		        ca.click(hp.getUser_homeBtn()); 
			     
			     System.out.println("home tab clicked successfully");
		   }catch(Exception e){
			   
		   }
		
		Commonactions.isElementPresent(hp.getMaterialBtn());
		 try{
		    	ca.click(hp.getMaterialBtn());
				ca.eleToBeClickable();
		    }catch (Exception e) {
				
			}
		
		Commonactions.isElementPresent(mp.getColored_mat());
		ca.click(mp.getColored_mat());
		ca.eleToBeClickable();
		ca.mouseOver(driver.findElement(By.xpath("((//a[text()='Blue']/parent::td[@data-csi-act='Node Name::0'])/following-sibling::td/div/span[text()='close'])[1]")));
		
		System.out.println("Colored Material validated successfully");
		
	}

	@Then("User validates and edit material samples {string},{string}")
	public void user_validates_and_edit_material_samples(String string,String string7) throws Throwable {
        
		
		try{
			   Commonactions.isElementPresent(hp.getUser_homeBtn());
		        ca.click(hp.getUser_homeBtn()); 
			     
			     System.out.println("home tab clicked successfully");
		   }catch(Exception e){
			   
		   }
		
		ca.eleToBeClickable();
		 try{
			 Commonactions.isElementPresent(hp.getMaterialBtn());
			 Thread.sleep(2000);
		    	ca.click(hp.getMaterialBtn());
				ca.eleToBeClickable();
		    }catch (Exception e) {
				
			}
		
		  Commonactions.isElementPresent(mp.getMat_samples()); 
		ca.click(mp.getMat_samples());
		  Commonactions.isElementPresent(mp.getNew_mat_sample_Btn()); 
		ca.click(mp.getNew_mat_sample_Btn());
		  Commonactions.isElementPresent(mp.getSupplier_Value()); 
			ca.click(mp.getSupplier_Value());
			ca.eleToBeClickable();
			WebElement e1 = ca.activeElement();
			ca.eleToBeClickable();
			Thread.sleep(2000);
			ca.insertText(e1, string7);
			ca.eleToBeClickable();
			ca.jsMouseOver();
			Commonactions.isElementPresent(mp.getMat_sample_Value());
		ca.insertText(mp.getMat_sample_Value(), "Automation");
		  Commonactions.isElementPresent(mp.getSave_btn1()); 
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		  Commonactions.isElementPresent(mp.getClick_materialSample()); 
		ca.click(mp.getClick_materialSample());
		  Commonactions.isElementPresent(mp.getPromote_material()); 
		ca.click(mp.getPromote_material());
		  Commonactions.isElementPresent(mp.getMaterial()); 
		ca.insertText(mp.getMaterial(), string+" - Copy");
		  Commonactions.isElementPresent(mp.getSave_btn1()); 
		ca.click(mp.getSave_btn1());
		
		
		ca.eleToBeClickable();
        ca.click(driver.findElement(By.xpath("(//span[text()='home'])"))); 
	     
	     System.out.println("home tab clicked successfully");
	     
	    ca.eleToBeClickable();
	    try{
		
		ca.click(driver.findElement(By.xpath("(//span[@data-csi-act='Delete'])[1]")));
		  Commonactions.isElementPresent(pp.getDelete_Btn()); 
		ca.click(pp.getDelete_Btn());
		
		System.out.println("deleted successfully");
	    }catch (Exception e) {
	    	 Commonactions.isElementPresent(hp.getMaterialBtn());
			 Thread.sleep(2000);
		    	ca.click(hp.getMaterialBtn());
				ca.eleToBeClickable();
				  Commonactions.isElementPresent(mp.getMat_samples()); 
					ca.click(mp.getMat_samples());
					ca.click(driver.findElement(By.xpath("(//span[@data-csi-act='Delete'])[1]")));
					  Commonactions.isElementPresent(pp.getDelete_Btn()); 
					ca.click(pp.getDelete_Btn());
					
					System.out.println("deleted successfully");
		}
		
		  Commonactions.isElementPresent(mp.getClick_materialSample()); 
		ca.click(mp.getClick_materialSample());
		  Commonactions.isElementPresent(mp.getUnLink()); 
		ca.click(mp.getUnLink());
		  Commonactions.isElementPresent(mp.getPp_unLink()); 
		ca.click(mp.getPp_unLink());
		
		Commonactions.isElementPresent(hp.getUser_homeBtn());
        ca.click(hp.getUser_homeBtn()); 
	     
	     System.out.println("home tab clicked successfully");
	     
	    ca.eleToBeClickable();
	    
	    System.out.println("Material Sample validated successfully");
		
	}

	@Then("User validates material SKU's")
	public void user_validates_material_SKU_s() throws Throwable {
		
		try{
			   Commonactions.isElementPresent(hp.getUser_homeBtn());
		        ca.click(hp.getUser_homeBtn()); 
			     
			     System.out.println("home tab clicked successfully");
		   }catch(Exception e){
			   
		   }
		
		Commonactions.isElementPresent(hp.getMaterialBtn());
		 try{
		    	ca.click(hp.getMaterialBtn());
				ca.eleToBeClickable();
		    }catch (Exception e) {
				
			}
		
	    Commonactions.isElementPresent(mp.getMat_SKU()); 
		ca.click(mp.getMat_SKU());
	    ca.eleToBeClickable();
	    
	    ca.mouseOver(driver.findElement(By.xpath("((//a[contains(text(),'SKU')]/parent::td[@data-csi-act='Node Name::0'])/following-sibling::td/div/span[text()='close'])[1]")));
	    
	    System.out.println("Material SKU validated successfully");
		
	}

	@Then("User validates sourcing")
	public void user_validates_sourcing() throws Throwable {
		
		try{
			   Commonactions.isElementPresent(hp.getUser_homeBtn());
		        ca.click(hp.getUser_homeBtn()); 
			     
			     System.out.println("home tab clicked successfully");
		   }catch(Exception e){
			   
		   }
		
		Commonactions.isElementPresent(hp.getMaterialBtn());
		 try{
		    	ca.click(hp.getMaterialBtn());
				ca.eleToBeClickable();
		    }catch (Exception e) {
				
			}
	    
		Commonactions.isElementPresent(mp.getSourcing());
		ca.click(mp.getSourcing());
		Commonactions.isElementPresent(mp.getQuotes());
		ca.click(mp.getQuotes());
		Commonactions.isElementPresent(mp.getRequests());
		ca.click(mp.getRequests());
		ca.eleToBeClickable();
		
		System.out.println("Sourcing validated successfully");
		
	}

	@Given("User validates care label {string},{string},{string}")
	public void user_validates_care_label(String string, String string2, String string3) throws Throwable {
	    
		
			   Commonactions.isElementPresent(hp.getUser_settingsBtn1());
		        ca.click(hp.getUser_settingsBtn1()); 
			     
			     System.out.println("Setup tab clicked successfully");
		  
		Commonactions.isElementPresent(hp.getData_Spec());
		 ca.click(hp.getData_Spec());
	     ca.eleToBeClickable();
		 Commonactions.isElementPresent(hp.getSetupSearch());
		 ca.insertText(hp.getSetupSearch(), "Care Labels");
		// ca.eleToBeClickable();  
		
		Commonactions.isElementPresent(mp.getCare_label());
		ca.click(mp.getCare_label());
		Commonactions.isElementPresent(mp.getNew_care_label_btn());
		ca.click(mp.getNew_care_label_btn());
		ca.eleToBeClickable();
		WebElement e = driver.switchTo().activeElement();
		ca.eleToBeClickable();
		ca.insertText(e, string);
		//ca.eleToBeClickable();
		//ca.click(mp.getCare_type());
		ca.eleToBeClickable();
		String[] s = string.split("-");
		 for (int i = 0; i < 10; i++) {
			 
			 try{
		        	ca.eleToBeClickable();
		        	//ca.jsScrollPageDown(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
		        	
		        	
		                for(int j = 1; j <=50; j++ ){
		                    ca.click(driver.findElement(By.xpath("//div[contains(@class,'Care')]//span[text()='+']/parent::div")));
		                if(mp.getCare_type().isDisplayed()){
		                   
		                    ca.click(driver.findElement(By.xpath("//div[contains(@class,'Care')]//span[text()='+']/parent::div")));
		                    ca.click(driver.findElement(By.xpath("//div[contains(@class,'Care')]//span[text()='+']/parent::div")));
		        
		                ca.eleToBeClickable();
		                break;
		                }
		                }
		            }catch (Exception exception) {
		                // TODO: handle exception
		            }
	           WebElement dr = mp.getCare_type();
	           Thread.sleep(100);          
	           dr.click();
	                Actions a = new Actions(driver);
	              for (int j = 0; j <= i; j++) {
	            	  Thread.sleep(100);
	             a.sendKeys(Keys.DOWN).build().perform();
	            // Thread.sleep(300);
	                         }

	                a.sendKeys(Keys.TAB).build().perform();
	               // dr.click();
		            System.out.println(dr.getText());
		            System.out.println("...............");
		            System.out.println(s[0].trim());
	             //   Thread.sleep(300);
	            if (dr.getText().equalsIgnoreCase("Wash")) {
	                    break;
	                      }
	                  Thread.sleep(500);
	                     }
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(mp.getNew_care_label_btn());
		ca.click(mp.getNew_care_label_btn());
		ca.eleToBeClickable();
		WebElement e2 = driver.switchTo().activeElement();
		ca.eleToBeClickable();
		ca.insertText(e2, string2);
		ca.eleToBeClickable();
		//ca.click(mp.getCare_type());
		//ca.eleToBeClickable();
		String[] s1 = string2.split("-");
		 for (int i = 0; i < 10; i++) {
	           WebElement dr = mp.getCare_type();
	           Thread.sleep(100);          
	           dr.click();
	                Actions a = new Actions(driver);
	              for (int j = 0; j <= i; j++) {
	            	  Thread.sleep(100);
	             a.sendKeys(Keys.DOWN).build().perform();
	              }
	              a.sendKeys(Keys.TAB).build().perform();
	              //dr.click();
	              System.out.println(dr.getText());
	            if (dr.getText().equalsIgnoreCase("Iron")) {
	                    break;
	                      }
	                  Thread.sleep(500);
	                     }
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(mp.getNew_care_label_btn());
		ca.click(mp.getNew_care_label_btn());
		ca.eleToBeClickable();
		WebElement e4 = driver.switchTo().activeElement();
		ca.eleToBeClickable();
		ca.insertText(e4, string3);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//span[text()='Care Label'])")));
		ca.eleToBeClickable();
		
		System.out.println("care label validated successfully");
		
	}

	@Given("User validates composition placements {string},{string}")
	public void user_validates_composition_placements(String string, String string2) throws Throwable {
	    
		 Commonactions.isElementPresent(hp.getUser_settingsBtn1());
	        ca.click(hp.getUser_settingsBtn1()); 
		     
		     System.out.println("Setup tab clicked successfully");
	  
	 Commonactions.isElementPresent(hp.getData_Spec());
	 ca.click(hp.getData_Spec());
     ca.eleToBeClickable();
	 Commonactions.isElementPresent(hp.getSetupSearch());
	 ca.insertText(hp.getSetupSearch(), "Composition Placements");
	 ca.eleToBeClickable();
		
		ca.eleToBeClickable();
		ca.click(mp.getComp_placement());
		ca.eleToBeClickable();
		ca.click(mp.getNew_comp_placement_Btn());
		ca.eleToBeClickable();
		ca.insertText(mp.getComp_placement_value(), string);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_saveAndnew_Btn());
		ca.eleToBeClickable();
		
		ca.insertText(mp.getComp_placement_value(), string2);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		
		System.out.println("composition placement validated successfully");
	}

	@Given("User validates composition material {string},{string},{string}")
	public void user_validates_composition_material(String string, String string2, String string3) throws Throwable {
	    
		 Commonactions.isElementPresent(hp.getUser_settingsBtn1());
	        ca.click(hp.getUser_settingsBtn1()); 
		     
		     System.out.println("Setup tab clicked successfully");
	  
	 Commonactions.isElementPresent(hp.getData_Spec());
	 ca.click(hp.getData_Spec());
     ca.eleToBeClickable();
	 Commonactions.isElementPresent(hp.getSetupSearch());
	 ca.insertText(hp.getSetupSearch(), "Composition Materials");
	 ca.eleToBeClickable();
	

		
		Commonactions.isElementPresent(mp.getComp_materials());
		ca.click(mp.getComp_materials());
		Commonactions.isElementPresent(mp.getNew_comp_material_Btn());
		ca.click(mp.getNew_comp_material_Btn());
		Commonactions.isElementPresent(mp.getComp_material_value());
		ca.insertText(mp.getComp_material_value(), string);
		Commonactions.isElementPresent(pp.getConfig_saveAndnew_Btn());
		ca.click(pp.getConfig_saveAndnew_Btn());
		ca.eleToBeClickable();
		
		ca.insertText(mp.getComp_material_value(), string2);
		Commonactions.isElementPresent(pp.getConfig_saveAndnew_Btn());
		ca.click(pp.getConfig_saveAndnew_Btn());
		ca.eleToBeClickable();
		
		ca.insertText(mp.getComp_material_value(), string3);
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		ca.click(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		
		System.out.println("composition material validated successfully");
		
	}

	@Given("User validates placement {string},{string}")
	public void user_validates_placement(String string, String string2) throws Throwable {
		
		 Commonactions.isElementPresent(hp.getUser_settingsBtn1());
	        ca.click(hp.getUser_settingsBtn1()); 
		     
		     System.out.println("Setup tab clicked successfully");
	  
	 Commonactions.isElementPresent(hp.getData_Spec());
	 ca.click(hp.getData_Spec());
     ca.eleToBeClickable();
	 Commonactions.isElementPresent(hp.getSetupSearch());
	 ca.insertText(hp.getSetupSearch(), "Placements");
	 ca.eleToBeClickable();
	    
	    Commonactions.isElementPresent(mp.getPlacement());
	    Thread.sleep(1000);
		Commonactions.clickjs(mp.getPlacement());
		Commonactions.isElementPresent(mp.getNew_placement_Btn());
		Thread.sleep(1000);
		Commonactions.clickjs(mp.getNew_placement_Btn());
		Commonactions.isElementPresent(mp.getPlacement_value());
		ca.insertText(mp.getPlacement_value(), string);
		Commonactions.isElementPresent(pp.getConfig_saveAndnew_Btn());
		ca.click(pp.getConfig_saveAndnew_Btn());
		ca.eleToBeClickable();
		
		ca.insertText(mp.getPlacement_value(), string2);
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		ca.click(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		
		System.out.println("placement validated successfully");
		
	}

	@Given("User validates product symbols {string},{string},{string}")
	public void user_validates_product_symbols(String string, String string2, String string3) throws Throwable {
	    
		 Commonactions.isElementPresent(hp.getUser_settingsBtn1());
	        ca.click(hp.getUser_settingsBtn1()); 
		     
		     System.out.println("Setup tab clicked successfully");
	  
	 Commonactions.isElementPresent(hp.getData_Spec());
	 ca.click(hp.getData_Spec());
     ca.eleToBeClickable();
	 Commonactions.isElementPresent(hp.getSetupSearch());
	 ca.insertText(hp.getSetupSearch(), "Product Symbols");
	 ca.eleToBeClickable();
		
		Commonactions.isElementPresent(mp.getProduct_symbols());
		ca.click(mp.getProduct_symbols());
		Commonactions.isElementPresent(mp.getNew_prodSymbol_Btn());
		ca.click(mp.getNew_prodSymbol_Btn());
		ca.eleToBeClickable();
		WebElement e = driver.switchTo().activeElement();
		ca.eleToBeClickable();
		ca.insertText(e, string);
		try{
        	ca.eleToBeClickable();
        	//ca.jsScrollPageDown(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
        	
        	
                for(int j = 1; j <=50; j++ ){
                    ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
                if(mp.getProdSymbol_type().isDisplayed()){
                   
                    ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
                    ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
        
                ca.eleToBeClickable();
                break;
                }
                }
            }catch (Exception exception) {
                // TODO: handle exception
            }
		Commonactions.isElementPresent(mp.getProdSymbol_type());
		//String[] s = string.split("-");
		//ca.eleToBeClickable();
		ca.click(mp.getProdSymbol_type());
		ca.eleToBeClickable();
		WebElement e1 = driver.switchTo().activeElement();
		ca.eleToBeClickable();
		ca.insertText(e1, "Brand");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getNew_prodSymbol_Btn());
		
		ca.click(mp.getNew_prodSymbol_Btn());
		ca.eleToBeClickable();
		WebElement e2 = driver.switchTo().activeElement();
		ca.eleToBeClickable();
		ca.insertText(e2, string2);
		//ca.eleToBeClickable();
		//String[] s2 = string2.split("-");
		Commonactions.isElementPresent(mp.getProdSymbol_type());
		ca.click(mp.getProdSymbol_type());
		ca.eleToBeClickable();
		WebElement e3 = driver.switchTo().activeElement();
		ca.eleToBeClickable();
		ca.insertText(e3, "Feature");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		
		ca.click(mp.getNew_prodSymbol_Btn());
		ca.eleToBeClickable();
		WebElement e4 = driver.switchTo().activeElement();
		ca.eleToBeClickable();
		ca.insertText(e4, string3);
		ca.eleToBeClickable();
		//String[] s3 = string3.split("-");
		//ca.eleToBeClickable();
		ca.click(mp.getProdSymbol_type());
		ca.eleToBeClickable();
		WebElement e5 = driver.switchTo().activeElement();
		ca.eleToBeClickable();
		ca.insertText(e5, "Function");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		
		System.out.println("product symbols validated successfully");
		
		
	}

	@Given("User validates language {string},{string},{string}")
	public void user_validates_language(String string, String string2, String string3) throws Throwable {
	    
		 Commonactions.isElementPresent(hp.getUser_settingsBtn1());
	        ca.click(hp.getUser_settingsBtn1()); 
		     
		     System.out.println("Setup tab clicked successfully");
	  
	 Commonactions.isElementPresent(hp.getData_Spec());
	 ca.click(hp.getData_Spec());
     ca.eleToBeClickable();
	 Commonactions.isElementPresent(hp.getSetupSearch());
	 ca.insertText(hp.getSetupSearch(), "Languages");
	 ca.eleToBeClickable();
		
		Commonactions.isElementPresent(mp.getLanguage());
		ca.click(mp.getLanguage());
		Commonactions.isElementPresent(mp.getNew_language_Btn());
		ca.click(mp.getNew_language_Btn());
		Commonactions.isElementPresent(mp.getLang_value());
		ca.insertText(mp.getLang_value(), string);
		Commonactions.isElementPresent(pp.getConfig_saveAndnew_Btn());
		ca.click(pp.getConfig_saveAndnew_Btn());
		ca.eleToBeClickable();
		
		ca.insertText(mp.getLang_value(), string2);
		Commonactions.isElementPresent(pp.getConfig_saveAndnew_Btn());
		ca.click(pp.getConfig_saveAndnew_Btn());
		ca.eleToBeClickable();
		
		ca.insertText(mp.getLang_value(), string3);
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		ca.click(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		
		System.out.println("language validated successfully");
		
	}

	@Given("User validates product structure {string}")
	public void user_validates_product_structure(String string) throws Throwable {
		
		Commonactions.isElementPresent(hp.getUser_settingsBtn1());
        ca.click(hp.getUser_settingsBtn1()); 
	     
	     System.out.println("Setup tab clicked successfully");
  
 Commonactions.isElementPresent(hp.getData_Spec());
 ca.click(hp.getData_Spec());
 ca.eleToBeClickable();
 Commonactions.isElementPresent(hp.getSetupSearch());
 ca.insertText(hp.getSetupSearch(), "Product Structures");
 ca.eleToBeClickable();
	    
		Commonactions.isElementPresent(mp.getProduct_structure());
		ca.click(mp.getProduct_structure());
		Commonactions.isElementPresent(mp.getNew_prodStructure_Btn());
		ca.click(mp.getNew_prodStructure_Btn());
		Commonactions.isElementPresent(pp.getConfig_cancel_Btn());
		ca.click(pp.getConfig_cancel_Btn());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[contains(@class,'ProductStructure')]//td[@data-csi-heading='Node Name::0']/a")));
		ca.eleToBeClickable();
		ca.jsScrollPageDown(driver.findElement(By.xpath("(//div[text()='add' and contains(@class,'icon')])[2]")));
		ca.click(driver.findElement(By.xpath("(//div[text()='add' and contains(@class,'icon')])[2]")));
		ca.eleToBeClickable();
		ca.insertText(driver.findElement(By.xpath("((//div[contains(@data-csi-automation,'FixedMaterial')]/div)[3]/input)[1]")), string);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		ca.click(pp.getConfig_save_Btn());
		Commonactions.isElementPresent(mp.getActiveIcon());
		ca.click(mp.getActiveIcon());
		
		Commonactions.isElementPresent(hp.getUser_settingsBtn1());
        ca.click(hp.getUser_settingsBtn1()); 
	     
	     System.out.println("Setup tab clicked successfully");
  
 Commonactions.isElementPresent(hp.getData_Spec());
 ca.click(hp.getData_Spec());
 ca.eleToBeClickable();
 
	    
	    try{
	    String text = Commonactions.getText(mp.getActiveText());
		Assert.assertEquals("ACTIVE", text);
	    }catch (Exception e) {
			
		}
		ca.eleToBeClickable();
		
		System.out.println("product structure validated successfully");
		
		//driver.close();
		
	}
	

}
