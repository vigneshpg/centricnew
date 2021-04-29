package com.centric.stepdefinition;

import java.util.List;

import org.apache.velocity.runtime.directive.Foreach;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.InspectionPage;
import com.centric.objectrepository.MaterialSpecificationPage;
import com.centric.objectrepository.PopupPage;
import com.centric.objectrepository.QualityPage;
import com.centric.objectrepository.SourcingPage;
import com.centric.objectrepository.SpecificationHierarchyPage;
import com.centric.objectrepository.StyleMaterialSamplepage;
import com.centric.objectrepository.StylePage;
import com.centric.objectrepository.StyleandThemePage;
import com.centric.objectrepository.ThemeRulePage;
import com.centric.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Ca;

public class StyleandThemePageSteps extends Commonactions{
	
	HomePage hp = new HomePage();
	Commonactions ca = new Commonactions();
  	MaterialSpecificationPage mp = new MaterialSpecificationPage();
	PopupPage pp = new PopupPage();
	SourcingPage sp = new SourcingPage();
    QualityPage  qp = new QualityPage();
    StylePage st = new StylePage();
    SpecificationHierarchyPage sk = new SpecificationHierarchyPage();
    StyleMaterialSamplepage sm = new StyleMaterialSamplepage();
    StyleandThemePage sat = new StyleandThemePage();
    InspectionPage in = new InspectionPage();
	
	@When("User creates product group in size chart {string},{string}")
	public void user_creates_product_group_in_size_chart(String string, String string2) throws Throwable {
	    
		/*Commonactions.isElementPresent(sat.getSpecification());
    	ca.click(sat.getSpecification());
		Commonactions.isElementPresent(sat.getSizeChart());
    	ca.click(sat.getSizeChart());
    	Commonactions.isElementPresent(sat.getDimensions());
    	ca.click(sat.getDimensions());
    	Commonactions.isElementPresent(sat.getDimensionCards());
    	ca.click(sat.getDimensionCards());
    	Commonactions.isElementPresent(sat.getIncrements());
    	ca.click(sat.getIncrements());*/
		
		 Commonactions.isElementPresent(hp.getUser_settingsBtn1());
	     ca.click(hp.getUser_settingsBtn1()); 
		     
		 System.out.println("Setup tab clicked successfully");
	  
	    Commonactions.isElementPresent(hp.getData_Spec());
	    ca.click(hp.getData_Spec());
        ca.eleToBeClickable();
	    Commonactions.isElementPresent(hp.getSetupSearch());
	    ca.insertText(hp.getSetupSearch(), "Product Groups");
	    ca.eleToBeClickable();
    	
    	Commonactions.isElementPresent(sat.getProductGrp());
    	ca.click(sat.getProductGrp());  	
    	Commonactions.isElementPresent(sat.getProductGrpBtn());
    	ca.click(sat.getProductGrpBtn());
    	Commonactions.isElementPresent(sat.getProductGrpValue());
    	ca.insertText(sat.getProductGrpValue(), string);
    	Commonactions.isElementPresent(sat.getDescription());
    	ca.insertText(sat.getDescription(), string2);
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	
    	try{
        	ca.eleToBeClickable();
        	//ca.jsScrollPageDown(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
        	
        	
                for(int i = 1; i <=50; i++ ){
                    ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
                if(sat.getIncrementValue().isDisplayed()){
                   
                    ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
                    ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
        
                ca.eleToBeClickable();
                break;
                }
                }
            }catch (Exception exception) {
                // TODO: handle exception
            }

    //	ca.jsScrollPageUp(sat.getIncrementValue());
    	Commonactions.isElementPresent(sat.getIncrementValue());
    //	ca.eleToBeClickable();
    	ca.click(sat.getIncrementValue());
    	ca.eleToBeClickable();
    	WebElement e = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(e, "Pants Grade Rule");
    	ca.eleToBeClickable();
    	ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
        ca.eleToBeClickable();
        e.sendKeys(Keys.TAB);
    	System.out.println("Product group created successfully");
    	
    	
		
	}

	@When("User update dimension,increments {string} and tolerance")
	public void user_update_dimension_increments_and_tolerance(String string) throws Throwable {
		
		Commonactions.isElementPresent(sat.getPG_Value());
    	ca.click(sat.getPG_Value());
    	
    	
    	
    	Commonactions.isElementPresent(sat.getDimensionBtn());
    	ca.click(sat.getDimensionBtn());
    	Commonactions.isElementPresent(sat.getPG_1ChkBx());
    	ca.click(sat.getPG_1ChkBx());
    	Commonactions.isElementPresent(sat.getPG_2ChkBx());
    	ca.click(sat.getPG_2ChkBx());
    	Commonactions.isElementPresent(sat.getPG_3ChkBx());
    	ca.click(sat.getPG_3ChkBx());
    	Commonactions.isElementPresent(sat.getPG_4ChkBx());
    	ca.click(sat.getPG_4ChkBx());
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	
    	try{
    	ca.eleToBeClickable();
    	ca.jsScrollPageDown(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
    	
    	
            for(int i = 1; i <=50; i++ ){
                ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
            if(sat.getTolerance().isDisplayed()){
               
                ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
                ca.click(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
    
            ca.eleToBeClickable();
            break;
            }
            }
        }catch (Exception exception) {
            // TODO: handle exception
        }

    	try{
    	ca.jsScrollPageUp(sat.getTolerance());
    	Commonactions.isElementPresent(sat.getTolerance());
    	ca.click(sat.getTolerance());
    	
    	for(int i = 1; i <= 4; i++){

    		ca.eleToBeClickable();
             Commonactions.clickjs(driver.findElement(By.xpath("(//td[@data-csi-heading='ToleranceNegative::0'])["+i+"]")));
           //  ca.eleToBeClickable();
          WebElement a = ca.activeElement();
   	      ca.eleToBeClickable();
   	      a.sendKeys(Keys.DELETE);
   	      String s = String.valueOf(i);
   	      Thread.sleep(1000);
   	      ca.insertText(a, s);
   	      ca.eleToBeClickable();
   	      a.sendKeys(Keys.TAB);
   	      ca.eleToBeClickable();
      }}catch (Exception e5) {
		// TODO: handle exception
	}
    	
    	
        
        System.out.println("Increments,Dimension and Tolerance updated successfully");
    	
	}

	@When("User creates shape {string},{string} and update shape master {string}")
	public void user_creates_shape_and_update_shape_master(String string, String string2, String string3) throws Throwable {
	    
	//	Commonactions.isElementPresent(sat.getHome_Icon());
    //	ca.click(sat.getHome_Icon());
    	Commonactions.isElementPresent(sat.getShapeAndTheme());
    	ca.click(sat.getShapeAndTheme());
    	Commonactions.isElementPresent(sat.getShapes());
    	ca.click(sat.getShapes());
    	Commonactions.isElementPresent(sat.getShapesBtn());
    	ca.click(sat.getShapesBtn());
    	Commonactions.isElementPresent(sat.getShapevalue());
    	ca.insertText(sat.getShapevalue(), string);
    	Commonactions.isElementPresent(sat.getSeasonsValue());
    	ca.click(sat.getSeasonsValue());
    	Thread.sleep(1000);
		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e, string2);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']")));
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//th[text()='Shape']")));
		Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	
    	System.out.println("Shape created succesfully");
    	
    	Commonactions.isElementPresent(sat.getShapeMasters());
    	ca.click(sat.getShapeMasters());
    	Commonactions.isElementPresent(sat.getRefreshView());
    	ca.click(sat.getRefreshView());
    	Commonactions.isElementPresent(sat.getShapeMasterName());
    	ca.click(sat.getShapeMasterName());
    	WebElement e1 = ca.activeElement();             
    	ca.eleToBeClickable();
        ca.insertText(e1, string3);
        ca.eleToBeClickable();
        e1.sendKeys(Keys.TAB);
        ca.eleToBeClickable();
    	
        System.out.println("Shape Master updated successfully");
		
	}

	@When("User is performing copy,edit and delete action")
	public void user_is_performing_copy_edit_and_delete_action() throws Throwable {
	    
		Commonactions.isElementPresent(sat.getShapes());
    	ca.click(sat.getShapes());
    	Commonactions.isElementPresent(sat.getRefreshViewShapes());
    	ca.click(sat.getRefreshViewShapes());
    	Commonactions.isElementPresent(sat.getShapeCopy());
    	ca.click(sat.getShapeCopy());
    	Commonactions.isElementPresent(sat.getShapevalue());
    	ca.insertText(sat.getShapevalue(), "Square Shape");
    	Commonactions.isElementPresent(sat.getSeasonsValue());
    	ca.click(sat.getSeasonsValue());
    	Thread.sleep(1000);
		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e, "winter season");
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']")));
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//th[text()='Shape']")));
		Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	
    	String error = Commonactions.getText(driver.findElement(By.xpath("//form[contains(@class,'Shape-Form')]//div[@class='csi-invalid-message-text']")));
		System.out.println("Error Message is :"+error);
		
		Commonactions.isElementPresent(sat.getSeasonsValue());
    	ca.click(sat.getSeasonsValue());
    	Thread.sleep(1000);
    	WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e2, "winter season");
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']")));
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//th[text()='Shape']")));
		
		Commonactions.isElementPresent(sat.getSeasonsValue());
    	ca.click(sat.getSeasonsValue());
    	Thread.sleep(1000);
    	WebElement e3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e3, "2020");
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']")));
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//th[text()='Shape']")));
		Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	
    	
    	Commonactions.isElementPresent(sat.getShapeMasters());
    	ca.click(sat.getShapeMasters());
    	Commonactions.isElementPresent(sat.getRefreshView());
    	ca.click(sat.getRefreshView());
    	Commonactions.isElementPresent(sat.getShapes());
    	ca.click(sat.getShapes());
    	Commonactions.isElementPresent(sat.getShapeedit());
    	ca.click(sat.getShapeedit());
    	Commonactions.isElementPresent(sat.getShapevalue());
    	ca.insertText(sat.getShapevalue(), "Square Shape -edited");
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	
    	Commonactions.isElementPresent(sat.getShapedelete());
    	ca.click(sat.getShapedelete());
    	Commonactions.isElementPresent(pp.getDelete_Btn());
    	ca.click(pp.getDelete_Btn());
    	Commonactions.isElementPresent(sat.getShapeMasters());
    	ca.click(sat.getShapeMasters());
    	Commonactions.isElementPresent(sat.getRefreshView());
    	ca.click(sat.getRefreshView());
    	
    	System.out.println("Edit,Copy and Delete action completed successfully");
    	
    	
	}

	@When("User creates Security group {string} and update values under shape {string}")
	public void user_creates_Security_group_and_update_values_under_shape(String string, String string2) throws Throwable {
	   
		Commonactions.isElementPresent(sat.getShapeSecurityGroups());
    	ca.click(sat.getShapeSecurityGroups());
    	Thread.sleep(1000);
    	Commonactions.isElementPresent(sat.getShapesecGrpBtn());
    	ca.click(sat.getShapesecGrpBtn());
    	ca.eleToBeClickable();
    	WebElement e = ca.activeElement();             
        ca.eleToBeClickable();
        ca.insertText(e, string);
        ca.eleToBeClickable();
    	e.sendKeys(Keys.TAB);
    	ca.eleToBeClickable();
    	
    	System.out.println("Shape Security Group created successfully");
    	
    	Commonactions.isElementPresent(sat.getShapes());
    	ca.click(sat.getShapes());
    	try{
    	Commonactions.isElementPresent(sat.getSG_Shape());
    	ca.click(sat.getSG_Shape());
    	}catch (Exception e7) {
            ca.click(driver.findElement(By.xpath("//td[@data-csi-heading='ShapeSizeRange::0']")));
            WebElement e2 = ca.activeElement();
            ca.eleToBeClickable();
            e2.sendKeys(Keys.TAB);
            WebElement e3 = ca.activeElement();
            ca.eleToBeClickable();
            e3.sendKeys(Keys.TAB);
    		
    		  /*for(int i = 1; i <=50; i++ ){
                  ca.click(driver.findElement(By.xpath("//div[contains(@class,'Shape')]//span[text()='+']/parent::div")));
              if(sat.getSG_Shape().isDisplayed()){
                 
                  ca.click(driver.findElement(By.xpath("//div[contains(@class,'Shape')]//span[text()='+']/parent::div")));
                  ca.click(driver.findElement(By.xpath("//div[contains(@class,'Shape')]//span[text()='+']/parent::div")));
      
              ca.eleToBeClickable();
              break;
              }
              }
    		  
    		  Commonactions.isElementPresent(sat.getSG_Shape());
    	    	ca.click(sat.getSG_Shape());*/
    		
		}
    	WebElement e2 = ca.activeElement();
        ca.eleToBeClickable();
		ca.insertText(e2, string);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(sat.getShapeSecurityGroups());
    	ca.click(sat.getShapeSecurityGroups());
    	Commonactions.isElementPresent(sat.getShapes());
    	ca.click(sat.getShapes());
		Commonactions.isElementPresent(sat.getShapeName());
    	ca.click(sat.getShapeName());
    	Commonactions.isElementPresent(sat.getShapeSizeRange());
    	ca.click(sat.getShapeSizeRange());
    	ca.eleToBeClickable();
    	Thread.sleep(1000);
    	WebElement e3 = ca.activeElement();
        ca.eleToBeClickable();
		ca.insertText(e3, string2);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(sat.getShapestyles());
    	ca.click(sat.getShapestyles());
    	Commonactions.isElementPresent(sat.getShapeStyleBtn());
    	ca.click(sat.getShapeStyleBtn());
    	Commonactions.isElementPresent(sat.getStyle_1ChkBx());
    	ca.click(sat.getStyle_1ChkBx());
    	Commonactions.isElementPresent(sat.getStyle_2ChkBx());
    	ca.click(sat.getStyle_2ChkBx());
    	Commonactions.isElementPresent(sat.getStyle_3ChkBx());
    	ca.click(sat.getStyle_3ChkBx());
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	Commonactions.isElementPresent(sat.getStyle_1Delete());
    	ca.click(sat.getStyle_1Delete());
    	Commonactions.isElementPresent(sat.getStyle_2Delete());
    	ca.click(sat.getStyle_2Delete());
		
    	
    	System.out.println("Shape Values updated successfully");
	}

	@When("User creates shape sample {string},{string}")
	public void user_creates_shape_sample(String string, String string2) throws Throwable {
	    
		Commonactions.isElementPresent(sat.getSamples());
    	ca.click(sat.getSamples());
    	Commonactions.isElementPresent(sat.getSampleBtn());
    	ca.click(sat.getSampleBtn());
    	ca.eleToBeClickable();
    	Thread.sleep(1000);
    	WebElement e1 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(e1, string2);
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
    	ca.insertText(a1, "Style - Proto");
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(sm.getSampledimension());
    	ca.click(sm.getSampledimension());
    	ca.eleToBeClickable();
    	WebElement a2 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a2, "Sizes");
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	ca.eleToBeClickable();
    	Commonactions.isElementPresent(sm.getSizesSel());
        ca.click(sm.getSizesSel());
    	Commonactions.isElementPresent(sm.getGoTodialog1());
    	ca.click(sm.getGoTodialog1());
    	Commonactions.isElementPresent(sm.getMediumChkBx());
    	ca.click(sm.getMediumChkBx());
    	Commonactions.isElementPresent(sat.getSmallChkBx());
        ca.click(sat.getSmallChkBx());
    	Commonactions.isElementPresent(sm.getLargeChkbx());
    	ca.click(sm.getLargeChkbx());
    	Commonactions.isElementPresent(mp.getSave_btn2());
    	ca.click(mp.getSave_btn2());
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	ca.eleToBeClickable();
    	
    	System.out.println("Shape Sample created successfully");
		
	}

	@When("User is performing sample copy,edit and delete action")
	public void user_is_performing_sample_copy_edit_and_delete_action() {
	    
		Commonactions.isElementPresent(sat.getSample_Edit());
    	ca.click(sat.getSample_Edit());
    	Commonactions.isElementPresent(sat.getSampleValue());
    	ca.insertText(sat.getSampleValue(), "Circle Shape Sample - edited");
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	
    	Commonactions.isElementPresent(sat.getSample_Copy());
    	ca.click(sat.getSample_Copy());
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	
    	Commonactions.isElementPresent(sat.getSample_Delete());
    	ca.click(sat.getSample_Delete());
    	Commonactions.isElementPresent(pp.getDelete_Btn());
    	ca.click(pp.getDelete_Btn());
    	
    	System.out.println("Edit,Copy and Delete action completed successfully");
		
	}

	@When("User Creates shape size chart for {string},{string},{string},{string}")
	public void user_Creates_shape_size_chart_for(String string, String string2, String string3, String string4) throws Throwable {
	    
		Commonactions.isElementPresent(sat.getShape_Specification());
    	ca.click(sat.getShape_Specification());
    	Commonactions.isElementPresent(sat.getSizeChartBtn());
    	ca.click(sat.getSizeChartBtn());
    	Commonactions.isElementPresent(sat.getSizeChart_Value());
    	ca.insertText(sat.getSizeChart_Value(), string);
    	Commonactions.isElementPresent(sat.getSubType());
    	ca.click(sat.getSubType());
    	ca.eleToBeClickable();
    	WebElement a6 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a6, "SC-Lock All");
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	
    	Commonactions.isElementPresent(sat.getSizeChartBtn());
    	ca.click(sat.getSizeChartBtn());
    	Commonactions.isElementPresent(sat.getSizeChart_Value());
    	ca.insertText(sat.getSizeChart_Value(), string2);
    	Commonactions.isElementPresent(sat.getSubType());
    	ca.click(sat.getSubType());
    	ca.eleToBeClickable();
    	WebElement a5 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a5, "SC-Lock Dimension");
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	
    	Commonactions.isElementPresent(sat.getSizeChartBtn());
    	ca.click(sat.getSizeChartBtn());
    	Commonactions.isElementPresent(sat.getSizeChart_Value());
    	ca.insertText(sat.getSizeChart_Value(), string3);
    	Commonactions.isElementPresent(sat.getSubType());
    	ca.click(sat.getSubType());
    	ca.eleToBeClickable();
    	WebElement a4 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a4, "SC-Lock Tolerance");
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	
    	Commonactions.isElementPresent(sat.getSizeChartBtn());
    	ca.click(sat.getSizeChartBtn());
    	Commonactions.isElementPresent(sat.getSizeChart_Value());
    	ca.insertText(sat.getSizeChart_Value(), string4);
    	Commonactions.isElementPresent(sat.getSubType());
    	ca.click(sat.getSubType());
    	ca.eleToBeClickable();
    	WebElement a3 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a3, "SC-Lock Values");
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	ca.eleToBeClickable();
    	
  
    	/*for(int i = 0; i <=50; i++ ){
            ca.click(driver.findElement(By.xpath("(//div[contains(@class,'SizeChart')]//span[text()='+']/parent::div)[1]")));
        if(sat.getSCIncrement().isDisplayed()){
           
            ca.click(driver.findElement(By.xpath("(//div[contains(@class,'SizeChart')]//span[text()='+']/parent::div)[1]")));
            ca.click(driver.findElement(By.xpath("(//div[contains(@class,'SizeChart')]//span[text()='+']/parent::div)[1]")));

        ca.eleToBeClickable();
        break;
        }
    	}
    
    
    Commonactions.isElementPresent(sat.getSCIncrement());
	ca.click(sat.getSCIncrement());
	ca.eleToBeClickable();
	WebElement a2 = ca.activeElement();
	ca.eleToBeClickable();
	ca.insertText(a2, "Pants Grade Rule");
	ca.eleToBeClickable();
	ca.jsMouseOver();*/
    	
    	System.out.println("Size Chart created successfully");
    	
		
	}

	@When("User creates theme for single season {string},{string},{string},{string}")
	public void user_creates_theme_for_single_season(String string, String string2, String string3, String string4) throws Throwable {
	   
		 Commonactions.isElementPresent(sat.getShapeAndTheme());
		 ca.click(sat.getShapeAndTheme());
		 Commonactions.isElementPresent(sat.getThemes());
		 ca.click(sat.getThemes());
		 Commonactions.isElementPresent(sat.getThemeBtn());
		 ca.click(sat.getThemeBtn());
		 Commonactions.isElementPresent(sat.getSubType());
		 ca.click(sat.getSubType());
		 ca.eleToBeClickable();
	     WebElement a6 = ca.activeElement();
	     ca.eleToBeClickable();
	     ca.insertText(a6, string);
	     ca.eleToBeClickable();
	     ca.jsMouseOver();
	     Commonactions.isElementPresent(sat.getThemeMasterValue());
		 ca.insertText(sat.getThemeMasterValue(), string2);
		 Commonactions.isElementPresent(sat.getThemeValue());
	     ca.insertText(sat.getThemeValue(), string3);
	     Commonactions.isElementPresent(sat.getSeasonsValue());
		 ca.click(sat.getSeasonsValue());
		 ca.eleToBeClickable();
	    	WebElement a5 = ca.activeElement();
	    	ca.eleToBeClickable();
	    	ca.insertText(a5, string4);
	    	ca.eleToBeClickable();
	    	ca.jsMouseOver();
	    Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		 
	    System.out.println("Theme for single season created successfully");	
		
	}

	@When("User creates new theme from style {string},{string}")
	public void user_creates_new_theme_from_style(String string, String string2) throws Throwable {
	   
		Commonactions.isElementPresent(sat.getThemeBtnExpand());
		ca.click(sat.getThemeBtnExpand());
		Commonactions.isElementPresent(sat.getStyleThemeBtn());
		ca.click(sat.getStyleThemeBtn());
		Commonactions.isElementPresent(sat.getStyTheme_ChkBx());
		ca.click(sat.getStyTheme_ChkBx());
		Commonactions.isElementPresent(qp.getNext());
		ca.click(qp.getNext());
		Commonactions.isElementPresent(sm.getEgretChkBx());
		ca.click(sm.getEgretChkBx());
		Commonactions.isElementPresent(sm.getVanillaChkbx());
		ca.click(sm.getVanillaChkbx());
		Commonactions.isElementPresent(qp.getFinish());
		ca.click(qp.getFinish());
		Commonactions.isElementPresent(sat.getSubType());
		ca.click(sat.getSubType());
		ca.eleToBeClickable();
    	WebElement a6 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a6, string);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(sat.getThemeMasterValue());
		ca.insertText(sat.getThemeMasterValue(), string2);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1()); 	
		 ca.eleToBeClickable();
	    System.out.println("Theme for Style created successfully");	
		

		
	}
     ThemeRulePage tr = new ThemeRulePage();
	
	@When("User creates new theme from material {string},{string}")
	public void user_creates_new_theme_from_material(String string, String string2) throws Throwable {
	   
		
		/*Commonactions.isElementPresent(tr.getMaterialTab());
		ca.click(tr.getMaterialTab());
		Commonactions.isElementPresent(tr.getPlacements());
		ca.click(tr.getPlacements());*/
		Commonactions.isElementPresent(sat.getThemeBtnExpand());
		ca.click(sat.getThemeBtnExpand());
		Commonactions.isElementPresent(sat.getMaterialThemeBtn());
		ca.click(sat.getMaterialThemeBtn());
		Commonactions.isElementPresent(sat.getMatThemeChkBx());
		ca.click(sat.getMatThemeChkBx());
		Commonactions.isElementPresent(qp.getNext());
		ca.click(qp.getNext());
		Commonactions.isElementPresent(sm.getEgretChkBx());
		ca.click(sm.getEgretChkBx());
		Commonactions.isElementPresent(sm.getVanillaChkbx());
		ca.click(sm.getVanillaChkbx());
		Commonactions.isElementPresent(qp.getFinish());
		ca.click(qp.getFinish());
		Commonactions.isElementPresent(sat.getSubType());
		ca.click(sat.getSubType());
		ca.eleToBeClickable();
    	WebElement a6 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a6, string);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(sat.getThemeMasterValue());
		ca.insertText(sat.getThemeMasterValue(), string2);
		Commonactions.isElementPresent(sat.getSeasonsValue());
		ca.click(sat.getSeasonsValue());
		Thread.sleep(1000);
		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e, "winter season");
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']")));
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//th[text()='Subtype']")));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sat.getSeasonsValue());
		ca.click(sat.getSeasonsValue());
		Thread.sleep(1000);
		WebElement e3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e3, "2020");
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']")));
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//th[text()='Subtype']")));
		Commonactions.isElementPresent(sat.getBOM());
    	ca.click(sat.getBOM());
    	WebElement e2 = ca.activeElement();
        ca.eleToBeClickable();
		ca.insertText(e2, "Apparel BOM");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1()); 	
		 ca.eleToBeClickable();
	    System.out.println("Theme for Style created successfully");	
		
	}

	@When("User creates theme for All season {string},{string},{string}")
	public void user_creates_theme_for_All_season(String string, String string2, String string3) throws Throwable {
	    
		Commonactions.isElementPresent(sat.getThemeBtn());
		 ca.click(sat.getThemeBtn());
		 Commonactions.isElementPresent(sat.getSubType());
		 ca.click(sat.getSubType());
		 ca.eleToBeClickable();
	     WebElement a6 = ca.activeElement();
	     ca.eleToBeClickable();
	     ca.insertText(a6, string);
	     ca.eleToBeClickable();
	     ca.jsMouseOver();
	     Commonactions.isElementPresent(sat.getThemeMasterValue());
		 ca.insertText(sat.getThemeMasterValue(), string2);
		 Commonactions.isElementPresent(sat.getThemeValue());
	     ca.insertText(sat.getThemeValue(), string3);
	     try{
	     Commonactions.isElementPresent(sat.getSeasonsValue());
		 ca.click(sat.getSeasonsValue());
	     }catch (Exception e) {
			System.out.println("condition satisfied");
		}
		
	     Commonactions.isElementPresent(mp.getSave_btn1());
	     ca.click(mp.getSave_btn1()); 	
	     ca.eleToBeClickable();
			 
		    System.out.println("Theme for All Season created successfully");	
	     
	}

	@When("User is performing theme copy,edit and delete action")
	public void user_is_performing_theme_copy_edit_and_delete_action() throws Throwable {
	    
		ca.eleToBeClickable();
		Thread.sleep(2000);
		Commonactions.isElementPresent(sat.getTheme_Copy());
	    ca.click(sat.getTheme_Copy()); 	
	    Commonactions.isElementPresent(sat.getThemeMasterValue());
		ca.insertText(sat.getThemeMasterValue(), "Apparel - Color and Size - Copied");
		Commonactions.isElementPresent(mp.getSave_btn1());
	    ca.click(mp.getSave_btn1());
	    
	    Commonactions.isElementPresent(sat.getTheme_Edit());
	    ca.click(sat.getTheme_Edit()); 	
	    Commonactions.isElementPresent(sat.getThemeMasterValue());
		ca.insertText(sat.getThemeMasterValue(), "Christmas Theme");
		Commonactions.isElementPresent(mp.getSave_btn1());
	    ca.click(mp.getSave_btn1());
	    
	    Commonactions.isElementPresent(sat.getTheme_Delete());
	    ca.click(sat.getTheme_Delete());
	    Commonactions.isElementPresent(pp.getDelete_Btn());
	    ca.click(pp.getDelete_Btn());
	    
	    System.out.println("Edit,Copy and Delete action completed successfully");
		
	}

	@When("User creates Security group {string} and update values under Theme {string}")
	public void user_creates_Security_group_and_update_values_under_Theme(String string, String string2) throws Throwable {
	    
		Commonactions.isElementPresent(sat.getThemeSecGrp());
	    ca.click(sat.getThemeSecGrp());
	    Commonactions.isElementPresent(sat.getTSG_Btn());
	    ca.click(sat.getTSG_Btn());
	    ca.eleToBeClickable();
	    Thread.sleep(1000);
	    WebElement a = ca.activeElement();
	      ca.eleToBeClickable();
	      ca.insertText(a, string);
	      ca.eleToBeClickable();
	      a.sendKeys(Keys.TAB);
	      ca.eleToBeClickable();
	      
	      Commonactions.isElementPresent(sat.getThemeMaster());
		  ca.click(sat.getThemeMaster());
		  Commonactions.isElementPresent(sat.getTSG_Value());
		  ca.click(sat.getTSG_Value());
		  ca.eleToBeClickable();
	    	WebElement a6 = ca.activeElement();
	    	ca.eleToBeClickable();
	    	ca.insertText(a6, string2);
	    	ca.eleToBeClickable();
	    	ca.jsMouseOver();
	    	ca.eleToBeClickable();
	   System.out.println("Theme Security Group created successfully"); 	
	      
	      
		
	}

	@When("User creates color inside theme {string},{string},{string}")
	public void user_creates_color_inside_theme(String string, String string2, String string3) throws Throwable {
	   
		  ca.eleToBeClickable();
		  Commonactions.isElementPresent(sat.getThemes());
		  ca.click(sat.getThemes());
		  Commonactions.isElementPresent(sat.getThemeName());
		  ca.click(sat.getThemeName());
		  ca.eleToBeClickable();
		  Commonactions.isElementPresent(sat.getThemeClrBtn());
		  ca.click(sat.getThemeClrBtn());
		  ca.eleToBeClickable();
		  Thread.sleep(2000);
		  WebElement a = ca.activeElement();
	      ca.eleToBeClickable();
	      ca.insertText(a, string);
	      ca.eleToBeClickable();
	      a.sendKeys(Keys.TAB);
	      ca.eleToBeClickable();
	      Commonactions.isElementPresent(sat.getThemeRepeatBtn());
		  ca.click(sat.getThemeRepeatBtn());
		  ca.jsScrollPageDown(sat.getBlueChkBx());
		  Commonactions.isElementPresent(sat.getBlueChkBx());
		  ca.click(sat.getBlueChkBx());
		  Commonactions.isElementPresent(mp.getSave_btn1());
		  ca.click(mp.getSave_btn1());
		  
		  Commonactions.isElementPresent(sat.getThemeClrExpandBtn());
		  ca.click(sat.getThemeClrExpandBtn());
		  Commonactions.isElementPresent(sat.getStyle_ClrTheme());
		  ca.click(sat.getStyle_ClrTheme());
		  Commonactions.isElementPresent(sm.getAntiqueChkBx());
		  ca.click(sm.getAntiqueChkBx());
		  Commonactions.isElementPresent(mp.getSave_btn1());
		  ca.click(mp.getSave_btn1());
		  ca.eleToBeClickable();
		  Thread.sleep(1000);
		  
		  Commonactions.isElementPresent(sat.getThemeClrExpandBtn());
		  ca.click(sat.getThemeClrExpandBtn());
		  Commonactions.isElementPresent(sat.getStyle_ClrSpec());
		  ca.click(sat.getStyle_ClrSpec());
		  Commonactions.isElementPresent(sat.getGlassChkBx());
		  ca.click(sat.getGlassChkBx());
		  Commonactions.isElementPresent(mp.getSave_btn1());
		  ca.click(mp.getSave_btn1());
		  
		  ca.eleToBeClickable();
		  Thread.sleep(1000);
		  Commonactions.isElementPresent(sat.getWhite_Value());
		  ca.click(sat.getWhite_Value());
		  ca.eleToBeClickable();
		  WebElement a1 = ca.activeElement();
	      ca.eleToBeClickable();
	      ca.insertText(a1, string2);
	      ca.eleToBeClickable();
	      a1.sendKeys(Keys.TAB);
	      ca.eleToBeClickable();

          WebElement a2 = ca.activeElement();
	      ca.eleToBeClickable();
	      ca.insertText(a2, string3);
	      ca.eleToBeClickable();
	      a2.sendKeys(Keys.TAB);
	      ca.eleToBeClickable();

		  
         System.out.println("Theme colorway created successfully");
	      
		
	}

	@When("User creates product alternative {string}")
	public void user_creates_product_alternative(String string) throws Throwable {
	   
		 Commonactions.isElementPresent(sat.getThemeProductBtn());
		 ca.click(sat.getThemeProductBtn());
		 ca.eleToBeClickable();
	    	WebElement a6 = ca.activeElement();
	    	ca.eleToBeClickable();
	    	ca.insertText(a6, string);
	    	ca.eleToBeClickable();
	    	ca.jsMouseOver();
	    	Commonactions.isElementPresent(mp.getSave_btn1());
			ca.click(mp.getSave_btn1());
			
			Commonactions.isElementPresent(sat.getProduct_Copy());
			ca.click(sat.getProduct_Copy());	
			Commonactions.isElementPresent(mp.getSave_btn1());
			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable();
			Thread.sleep(1000);
			Commonactions.isElementPresent(sat.getProduct_Delete());
			ca.click(sat.getProduct_Delete());
			Commonactions.isElementPresent(pp.getDelete_Btn());
			ca.click(pp.getDelete_Btn());
			ca.eleToBeClickable();
		//	Commonactions.isElementPresent(sat.getVanilla_Delete());
		//	ca.click(sat.getVanilla_Delete());
		//	Commonactions.isElementPresent(pp.getDelete_Btn());
		//	ca.click(pp.getDelete_Btn());
			ca.eleToBeClickable();
			Commonactions.isElementPresent(sat.getThemeClrWay());
			ca.click(sat.getThemeClrWay());
			Commonactions.isElementPresent(sat.getThemeDocs());
			ca.click(sat.getThemeDocs());
			Commonactions.isElementPresent(sat.getThemeStyle());
			ca.click(sat.getThemeStyle());
			Commonactions.isElementPresent(sat.getThemeStylePA());
			ca.click(sat.getThemeStylePA());
			Commonactions.isElementPresent(sat.getThemeStyleGallery());
			ca.click(sat.getThemeStyleGallery());
			Commonactions.isElementPresent(sat.getThemeInsStyle());
			ca.click(sat.getThemeInsStyle());
			
			System.out.println("Theme Product Alternative created successfully");
	    			
	}
	
	public void goToTheme() throws Throwable {
		
		  Commonactions.isElementPresent(sat.getShapeAndTheme());
		  ca.click(sat.getShapeAndTheme());
		  Commonactions.isElementPresent(sat.getThemes());
		  ca.click(sat.getThemes());
          Commonactions.isElementPresent(sat.getThemeName());
		  ca.click(sat.getThemeName());
		  ca.eleToBeClickable();
		  Commonactions.isElementPresent(sat.getThemeMaterial());
		  ca.click(sat.getThemeMaterial());
		  Commonactions.isElementPresent(sat.getThemePlacements());
		  ca.click(sat.getThemePlacements());

	}

	@When("User creates new theme placement {string},{string}")
	public void user_creates_new_theme_placement(String string, String string2) throws Throwable {
	   
		  Commonactions.isElementPresent(sat.getShapeAndTheme());
		  ca.click(sat.getShapeAndTheme());
		  Commonactions.isElementPresent(sat.getThemes());
		  ca.click(sat.getThemes());
          Commonactions.isElementPresent(sat.getThemeName());
		  ca.click(sat.getThemeName());
		  ca.eleToBeClickable();
		  Commonactions.isElementPresent(sat.getThemeMaterial());
		  ca.click(sat.getThemeMaterial());
		  Commonactions.isElementPresent(sat.getThemeClrMat());
		  ca.click(sat.getThemeClrMat());
		  Commonactions.isElementPresent(sat.getThemeMmatGal());
		  ca.click(sat.getThemeMmatGal());
		  Commonactions.isElementPresent(sat.getThemeMCMG());
		  ca.click(sat.getThemeMCMG());
		  Commonactions.isElementPresent(sat.getThemeNCSG());
		  ca.click(sat.getThemeNCSG());
		  Commonactions.isElementPresent(sat.getThemePlacements());
		  ca.click(sat.getThemePlacements());
		  Commonactions.isElementPresent(sat.getThemePlacExpBtn());
		  ca.click(sat.getThemePlacExpBtn());
		  Commonactions.isElementPresent(sat.getCreateNew());
		  ca.click(sat.getCreateNew());
		  ca.eleToBeClickable();
		  WebElement a = ca.activeElement();
	      ca.eleToBeClickable();
	      ca.insertText(a, string);
	      ca.eleToBeClickable();
              ca.jsMouseOver();
              ca.eleToBeClickable();

            try{
        	ca.eleToBeClickable();
                for(int j = 1; j <=50; j++ ){
                    ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
                if(sat.getMatCommon().isDisplayed()){
                   
                    ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
                    ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
        
                ca.eleToBeClickable();
                break;
                }
                }
            }catch (Exception exception) {
                // TODO: handle exception
            }
          Commonactions.isElementPresent(sat.getMatCommon());
  		  ca.click(sat.getMatCommon());
          WebElement a1 = ca.activeElement();
	      ca.eleToBeClickable();
	      ca.insertText(a1, "100");
	      ca.eleToBeClickable();
          ca.jsMouseOver();
          
          Commonactions.isElementPresent(sat.getRefreshPView());
  		  ca.click(sat.getRefreshPView());
  		  ca.eleToBeClickable();
  		  
  		  System.out.println("New placement created successfully");
  		  
  		  Commonactions.isElementPresent(sat.getPlacementEdit());
		  ca.click(sat.getPlacementEdit());
  		  Commonactions.isElementPresent(sat.getEditCommValue());
		  ca.click(sat.getEditCommValue());
          WebElement a2 = ca.activeElement();
	      ca.eleToBeClickable();
	      ca.insertText(a2, string2);
          Commonactions.isElementPresent(mp.getSave_btn1());
	      ca.click(mp.getSave_btn1());
	      Commonactions.isElementPresent(sat.getPlaceCopy());
	      ca.click(sat.getPlaceCopy());
	      WebElement a3 = ca.activeElement();
	      ca.eleToBeClickable();
	      a3.sendKeys(Keys.TAB);
	      
	      Commonactions.isElementPresent(sat.getPlaceDelete());
	      ca.click(sat.getPlaceDelete());
	      Commonactions.isElementPresent(pp.getDelete_Btn());
		  ca.click(pp.getDelete_Btn());
		  
		  System.out.println("New placement edit,copy and deleted successfully");
	      
		  
		
	}

	@When("User creates new theme placement from material")
	public void user_creates_new_theme_placement_from_material() throws Throwable {
	    
		  Commonactions.isElementPresent(sat.getThemePlacExpBtn());
		  ca.click(sat.getThemePlacExpBtn());
		  Commonactions.isElementPresent(sat.getCreateNewfMat());
		  ca.click(sat.getCreateNewfMat());
		  ca.eleToBeClickable();
		  Commonactions.isElementPresent(sat.getCopy_ChkBx1());
		  ca.click(sat.getCopy_ChkBx1());
		  Commonactions.isElementPresent(mp.getSave_btn1());
		  ca.click(mp.getSave_btn1());
		  ca.eleToBeClickable();
		  
		  try{
	        	ca.eleToBeClickable();
	                for(int j = 1; j <=10; j++ ){
	                    ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='-']/parent::div")));
	                
	                }
	            }catch (Exception exception) {
	                // TODO: handle exception
	            }
		  Commonactions.isElementPresent(sat.getMainMaterialBx());
		  ca.click(sat.getMainMaterialBx());
		  
		  System.out.println("New placement from material created successfully");
		
	}

	@When("User creates new from theme placement")
	public void user_creates_new_from_theme_placement() throws Throwable {
	    
		  Commonactions.isElementPresent(sat.getThemePlacExpBtn());
		  ca.click(sat.getThemePlacExpBtn());
		  Commonactions.isElementPresent(sat.getCreateNfThemPlac());
		  ca.click(sat.getCreateNfThemPlac());
		  Commonactions.isElementPresent(sat.getThemePlaChkBx());
		  ca.click(sat.getThemePlaChkBx());
		  Commonactions.isElementPresent(qp.getNext());
		  ca.click(qp.getNext());
		  ca.eleToBeClickable();
		  Commonactions.isElementPresent(sat.getShoulderChkBx());
		  ca.click(sat.getShoulderChkBx());
		  Commonactions.isElementPresent(qp.getFinish());
		  ca.click(qp.getFinish());
		  ca.eleToBeClickable();
		  
		  System.out.println("New from theme placement created succesfully");
		  
		
	}

	@When("User creates select section and update color value {string},{string}")
	public void user_creates_select_section_and_update_color_value(String string, String string2) throws Throwable {
	   
		  Commonactions.isElementPresent(sat.getThemePlacExpBtn());
		  ca.click(sat.getThemePlacExpBtn());
		  Commonactions.isElementPresent(sat.getCreateSelectSect());
		  ca.click(sat.getCreateSelectSect());
		  Commonactions.isElementPresent(sat.getFabricChkBx());
		  ca.click(sat.getFabricChkBx());
		  Commonactions.isElementPresent(mp.getSave_btn1());
		  ca.click(mp.getSave_btn1());
		  ca.eleToBeClickable();
	    
		  Commonactions.isElementPresent(sk.getPlus_Icon_1());
		  ca.click(sk.getPlus_Icon_1());
		  ca.eleToBeClickable();
		  WebElement h = ca.activeElement();
	      ca.eleToBeClickable();
	      h.sendKeys(string);
	      ca.eleToBeClickable();
          ca.jsMouseOver();

            try{
        	ca.eleToBeClickable();
                for(int j = 1; j <=50; j++ ){
                    ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
                if(sat.getMatCommon().isDisplayed()){
                   
                    ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
                    ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
        
                ca.eleToBeClickable();
                break;
                }
                }
            }catch (Exception exception) {
                // TODO: handle exception
            }
            Commonactions.isElementPresent(sat.getMatCommon());
  		    ca.click(sat.getMatCommon());
            WebElement a1 = ca.activeElement();
	        ca.eleToBeClickable();
	        ca.insertText(a1, "Rayon");
	        ca.eleToBeClickable();
            ca.jsMouseOver();
            ca.eleToBeClickable();
            Commonactions.isElementPresent(sat.getPlus_Icon_Exp());
    		ca.click(sat.getPlus_Icon_Exp());
    		Commonactions.isElementPresent(sat.getCreateNewfMat());
            ca.click(sat.getCreateNewfMat());
    	    Commonactions.isElementPresent(sat.getCopy_ChkBx1());
        	ca.click(sat.getCopy_ChkBx1());
    	    Commonactions.isElementPresent(sat.getCopy_ChkBx2());
    		ca.click(sat.getCopy_ChkBx2());
    	    Commonactions.isElementPresent(mp.getSave_btn1());
    		ca.click(mp.getSave_btn1());
    		ca.eleToBeClickable();
    		
    		try{
            	ca.eleToBeClickable();
                    for(int j = 1; j <=50; j++ ){
                        ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
                    if(sat.getColoredMatValue1().isDisplayed()){
                       
                        ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
                        ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
                        ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
                        ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
            
                    ca.eleToBeClickable();
                    break;
                    }
                    }
                }catch (Exception exception) {
                	 for(int j = 1; j <=50; j++ ){
                         ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
                     if(sat.getColoredMatValue().isDisplayed()){
                        
                         ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
                         ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
                         ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
                         ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
             
                     ca.eleToBeClickable();
                     Commonactions.isElementPresent(sat.getColoredMatValue());
             		ca.click(sat.getColoredMatValue());
                     break;
                     }
                     }
                    // TODO: handle exception
                }

    		try{
    		Commonactions.isElementPresent(sat.getColoredMatValue1());
    		ca.click(sat.getColoredMatValue1());
    		}catch(Exception e){
    			
    		}
            WebElement a3 = ca.activeElement();
    	    ca.eleToBeClickable();
    	    ca.insertText(a3, string2);
    	    ca.eleToBeClickable();
            ca.jsMouseOver();
            ca.eleToBeClickable();
            
            Commonactions.isElementPresent(sat.getRefreshPView());
    		ca.click(sat.getRefreshPView());
    		
    		List<WebElement> color = driver.findElements(By.xpath("(//td[@data-csi-act='MPCColor:Child:PerColorway:0{MaterialPlanColorwayMatrix}'])/div/a"));
            for (WebElement x : color) {
            	System.out.println(x.getText());
				Assert.assertTrue(x.getText().equals("Blue"));
			}
            
            System.out.println("Section created successfully");
		
	}

	String Adhoc;
	@When("User creates adhoc section {string}")
	public void user_creates_adhoc_section(String string) throws Throwable {
	    Adhoc = string;
		
		  Commonactions.isElementPresent(sat.getThemePlacExpBtn());
		  ca.click(sat.getThemePlacExpBtn());
		  Commonactions.isElementPresent(sat.getCreateCreateSect());
		  ca.click(sat.getCreateCreateSect());
		  Commonactions.isElementPresent(sat.getBomValue());
		  ca.insertText(sat.getBomValue(), string+" - 01");
		  Commonactions.isElementPresent(mp.getSave_btn1());
		  ca.click(mp.getSave_btn1());
		  ca.eleToBeClickable();
		  
		  Commonactions.isElementPresent(sat.getPlusAdoc_Exp());
		  ca.click(sat.getPlusAdoc_Exp());
		  Commonactions.isElementPresent(sat.getCreateNewfMat());
		  ca.click(sat.getCreateNewfMat());
		  Commonactions.isElementPresent(sat.getAdhoc_ChkBx1());
		  ca.click(sat.getAdhoc_ChkBx1());
		  Commonactions.isElementPresent(sat.getCopy_ChkBx2());
		  ca.click(sat.getCopy_ChkBx2());
		  Commonactions.isElementPresent(mp.getSave_btn1());
		  ca.click(mp.getSave_btn1());
		  ca.eleToBeClickable();
		  
		  System.out.println("Adhoc section created succesfully");
			
		
	}

	@When("User is performing select,create,arrange and delete section activities under sections")
	public void user_is_performing_select_create_arrange_and_delete_section_activities_under_sections() throws Throwable {
	    
		Commonactions.isElementPresent(sp.getApproveActions());
        ca.click(sp.getApproveActions());
        Commonactions.isElementPresent(sat.getSections());
        ca.click(sat.getSections());
        Commonactions.isElementPresent(sat.getActSelectSect());
        ca.click(sat.getActSelectSect());
        Commonactions.isElementPresent(sat.getAllChkBx());
        ca.click(sat.getAllChkBx());
        Commonactions.isElementPresent(mp.getSave_btn1());
        ca.click(mp.getSave_btn1());
        ca.eleToBeClickable();
        
        Commonactions.isElementPresent(sat.getPlusAll_Exp());
        ca.click(sat.getPlusAll_Exp());
        Commonactions.isElementPresent(sat.getCreateNewfMat());
        ca.click(sat.getCreateNewfMat());
        Commonactions.isElementPresent(sat.getCopy_ChkBx1());
        ca.click(sat.getCopy_ChkBx1());
        Commonactions.isElementPresent(mp.getSave_btn1());
        ca.click(mp.getSave_btn1());
        ca.eleToBeClickable();
        
        System.out.println("Action section created successfully");
        
        Commonactions.isElementPresent(sp.getApproveActions());
        ca.click(sp.getApproveActions());
        Commonactions.isElementPresent(sat.getSections());
        ca.click(sat.getSections());
        Commonactions.isElementPresent(sat.getActCreateSect());
        ca.click(sat.getActCreateSect());
        Commonactions.isElementPresent(sat.getBomValue());
        ca.insertText(sat.getBomValue(), Adhoc + " - 02");
        Commonactions.isElementPresent(mp.getSave_btn1());
        ca.click(mp.getSave_btn1());
        ca.eleToBeClickable();
        
        Commonactions.isElementPresent(sat.getPlusCrea_Exp());
        ca.click(sat.getPlusCrea_Exp());
        Commonactions.isElementPresent(sat.getCreateNewfMat());
        ca.click(sat.getCreateNewfMat());
        Commonactions.isElementPresent(sat.getCopy_ChkBx2());
        ca.click(sat.getCopy_ChkBx2());
        Commonactions.isElementPresent(mp.getSave_btn1());
        ca.click(mp.getSave_btn1());
        ca.eleToBeClickable();
        
        System.out.println("Action adhoc section created successfully");
        
        Commonactions.isElementPresent(sp.getApproveActions());
        ca.click(sp.getApproveActions());
        Commonactions.isElementPresent(sat.getSections());
        ca.click(sat.getSections());
        Commonactions.isElementPresent(sat.getActArrangeSect());
        ca.click(sat.getActArrangeSect());
        Actions builder = new Actions(driver);
        WebElement from = driver.findElement(By.xpath("(//td[@data-csi-heading='Node Name::0' and text()='fabric section'])/span"));
        WebElement to = driver.findElement(By.xpath("(//td[@data-csi-heading='Node Name::0' and text()='All section'])/span")); 
        //Perform drag and drop
        builder.dragAndDrop(from, to).perform();
        Commonactions.isElementPresent(sat.getCloseBtn());
        ca.click(sat.getCloseBtn());
        ca.eleToBeClickable();
        
        System.out.println("Action section arranged successfully");
        
        Commonactions.isElementPresent(sp.getApproveActions());
        ca.click(sp.getApproveActions());
        Commonactions.isElementPresent(sat.getSections());
        ca.click(sat.getSections());
        Commonactions.isElementPresent(sat.getActDeleteSect());
        ca.click(sat.getActDeleteSect());
        Commonactions.isElementPresent(sat.getDeleteTheChkBx());
        ca.click(sat.getDeleteTheChkBx());
        Commonactions.isElementPresent(pp.getDelete_Btn());
        ca.click(pp.getDelete_Btn());
        ca.eleToBeClickable();
        
        System.out.println("Action section deleted successfully");
		
	}

	@When("User creates style BOM {string},{string}")
	public void user_creates_style_BOM(String string, String string2) throws Throwable {
	    
		Commonactions.isElementPresent(sp.getApproveActions());
        ca.click(sp.getApproveActions());
        Commonactions.isElementPresent(sat.getCreateStyBOM());
        ca.click(sat.getCreateStyBOM());
        Commonactions.isElementPresent(sat.getBOM_Subtype());
        ca.click(sat.getBOM_Subtype());
        ca.eleToBeClickable();
    	WebElement a = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a, string);
    	ca.eleToBeClickable();
    	ca.jsMouseOver1();
    	ca.eleToBeClickable();
    	Commonactions.isElementPresent(sat.getBomValue());
    	ca.insertText(sat.getBomValue(), string2);
    	Commonactions.isElementPresent(mp.getSave_btn1());
 		ca.click(mp.getSave_btn1());
 		ca.eleToBeClickable();
 		
 		System.out.println("Style BOM created successfully");
		
	}

	@When("User creates and update style BOM placements {string},{string}")
	public void user_creates_and_update_style_BOM_placements(String string, String string2) throws Throwable {
	   
		Commonactions.isElementPresent(sp.getApproveActions());
        ca.click(sp.getApproveActions());
        Commonactions.isElementPresent(sat.getCreatUSBOMP());
        ca.click(sat.getCreatUSBOMP());
        Commonactions.isElementPresent(sat.getUpdate_Color());
        ca.click(sat.getUpdate_Color());
        WebElement e = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(e, "A"); 
    	ca.eleToBeClickable();
    	ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		e.sendKeys(Keys.TAB);
        ca.eleToBeClickable();
    	WebElement a = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a, string);
    	ca.eleToBeClickable();
    	ca.jsMouseOver1();
    	ca.eleToBeClickable();
    	Commonactions.isElementPresent(sat.getIncludeBlnkAttr());
        ca.click(sat.getIncludeBlnkAttr());
        Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		
	    Commonactions.isElementPresent(sat.getPlusUpdate_Exp());
		ca.click(sat.getPlusUpdate_Exp());
		WebElement a1 = ca.activeElement();
	    ca.eleToBeClickable();
	    ca.insertText(a1, string2);
	    ca.eleToBeClickable();
        ca.jsMouseOver();
        ca.eleToBeClickable();

        Commonactions.isElementPresent(sp.getApproveActions());
        ca.click(sp.getApproveActions());
        Commonactions.isElementPresent(sat.getCreatUSBOMP());
        ca.click(sat.getCreatUSBOMP());
        Commonactions.isElementPresent(sat.getUpdate_Color());
        ca.click(sat.getUpdate_Color());
        WebElement e1 = ca.activeElement();
    	ca.eleToBeClickable();
    	Thread.sleep(1000);
    	ca.insertText(e1, "A"); 
    	ca.eleToBeClickable();
    	ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		e1.sendKeys(Keys.TAB); 
        Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		
    	
		System.out.println("Update BOM created successfully");
		
		
	}

	public void GoToStyle() throws Throwable {
		
		Commonactions.isElementPresent(sat.getThemeStyleTab());
		ca.click(sat.getThemeStyleTab());
		Commonactions.isElementPresent(sat.getThemeStyles());
		ca.click(sat.getThemeStyles());
		Commonactions.isElementPresent(sat.getThemeStyleName());
		ca.click(sat.getThemeStyleName());
		Commonactions.isElementPresent(sat.getThemeSpec());
		ca.click(sat.getThemeSpec());
		Commonactions.isElementPresent(sat.getThemeBOM());
		ca.click(sat.getThemeBOM());
		Commonactions.isElementPresent(sat.getThemeBOMName());
		ca.click(sat.getThemeBOMName());
		Commonactions.isElementPresent(sat.getThemePartPlacements());
		ca.click(sat.getThemePartPlacements());
		ca.eleToBeClickable();

	}
	
	@When("Validating under style placements")
	public void validating_under_style_placements() throws Throwable {
	   
       GoToStyle();
    	
    //	Commonactions.isElementPresent(sat.getRefreshBview());
		//ca.click(sat.getRefreshBview());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		WebElement result = driver.findElement(By.xpath("(//div[contains(@class,'ProductBOMRevision')]//div[@class='footContent']/div)[1]"));
		//Commonactions.isElementPresent(result);
		ca.eleToBeClickable();
		System.out.println("result is : "+result.getText());
		//Assert.assertTrue(result.getText().contains("9"));
		
		WebElement button = driver.findElement(By.xpath("//td[contains(@data-csi-heading,'FromMaterialPlanPlacement::0')]"));
        ca.mouseOver(button);
        
        System.out.println("Update BOM validated successfully");
	        
		
	}

	@When("user updates existing style BOM {string},{string} and validate style placements")
	public void user_updates_existing_style_BOM_and_validate_style_placements(String string, String string2) throws Throwable {
		
		goToTheme();
		 try{
	        	ca.eleToBeClickable();
	                for(int j = 1; j <=50; j++ ){
	                    ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
	                if(sat.getMPPRequest1().isDisplayed()){
	                   
	                    ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
	                    ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
	        
	                ca.eleToBeClickable();
	                break;
	                }
	                }
	            }catch (Exception exception) {
	                // TODO: handle exception
	            }
		 
		 Commonactions.isElementPresent(sat.getMPPRequest1());
	     ca.click(sat.getMPPRequest1());
	        WebElement e = ca.activeElement();
	    	ca.eleToBeClickable();
	        e.sendKeys(Keys.TAB);
	        ca.eleToBeClickable();
	    	WebElement a = ca.activeElement();
	    	ca.eleToBeClickable();
	        a.sendKeys(Keys.DELETE);
	        ca.eleToBeClickable();
	        ca.jsMouseOver();
	        ca.eleToBeClickable();
	        
	     Commonactions.isElementPresent(sat.getMPPRequest2());
	     ca.click(sat.getMPPRequest2());
		        WebElement e1 = ca.activeElement();
		    	ca.eleToBeClickable();
		        e1.sendKeys(Keys.TAB);
		        ca.eleToBeClickable();
		    	WebElement a1 = ca.activeElement();
		    	ca.eleToBeClickable();
		        a1.sendKeys(Keys.DELETE);
		        ca.eleToBeClickable();
		        ca.jsMouseOver();
		        ca.eleToBeClickable();
		  
		        try{
		        	ca.eleToBeClickable();
		                for(int j = 1; j <=50; j++ ){
		                    ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
		                if(sat.getColoredMatValue1().isDisplayed()){
		                   
		                    ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
		                    ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
		        
		                ca.eleToBeClickable();
		                break;
		                }
		                }
		            }catch (Exception exception) {
		            	for(int j = 1; j <=50; j++ ){
		                    ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
		                if(sat.getColoredMatValue().isDisplayed()){
		                   
		                    ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
		                    ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
		        
		                ca.eleToBeClickable();
		                } }    // TODO: handle exception
		            } 
		try{   
		ca.jsScrollPageDown(sat.getColoredMatValue1());
		Commonactions.isElementPresent(sat.getColoredMatValue1());
	    ca.click(sat.getColoredMatValue1());  
		}catch (Exception ee) {
			ca.jsScrollPageDown(sat.getColoredMatValue());
			Commonactions.isElementPresent(sat.getColoredMatValue());
		    ca.click(sat.getColoredMatValue()); 
		}
	    WebElement a2 = ca.activeElement();
	    ca.eleToBeClickable();
        a2.sendKeys(Keys.DELETE);
        ca.eleToBeClickable();
	    ca.insertText(a2, string);
	    ca.eleToBeClickable();
        ca.jsMouseOver();
        ca.eleToBeClickable();
        
        Commonactions.isElementPresent(sp.getApproveActions());
        ca.click(sp.getApproveActions());
        Commonactions.isElementPresent(sat.getCreatUeSBOMP());
        ca.click(sat.getCreatUeSBOMP());
        Commonactions.isElementPresent(sat.getUpdate_Color());
        ca.click(sat.getUpdate_Color());
        WebElement e3 = ca.activeElement();
    	ca.eleToBeClickable();
    	Thread.sleep(1000);
    	ca.insertText(e3, "A"); 
    	ca.eleToBeClickable();
    	ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		e3.sendKeys(Keys.TAB);
        ca.eleToBeClickable();
    	WebElement a3 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a3, string2);
    	ca.eleToBeClickable();
    	ca.jsMouseOver1();
    	Commonactions.isElementPresent(sat.getIncludeBlnkAttr());
        ca.click(sat.getIncludeBlnkAttr());
        Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		 
		GoToStyle();
		
WebElement result = null;
		try{
        	ca.eleToBeClickable();
                for(int k = 1; k <=50; k++ ){
                    ca.click(driver.findElement(By.xpath("(//div[contains(@class,'BOM')]//span[text()='+']/parent::div)[1]")));
            		 result = driver.findElement(By.xpath("(//td[@data-csi-act='CommonColor::0'])[1]"));
                    
                    if(result.isDisplayed()){
                   
                    ca.click(driver.findElement(By.xpath("(//div[contains(@class,'BOM')]//span[text()='+']/parent::div)[1]")));
                    ca.click(driver.findElement(By.xpath("(//div[contains(@class,'BOM')]//span[text()='+']/parent::div)[1]")));
        
                ca.eleToBeClickable();
                break;
                }
                }
            }catch (Exception eee) {
                // TODO: handle exception
            }
		
		WebElement resultT = driver.findElement(By.xpath("((//td[@data-csi-act='CommonColor::0'])//a)"));
		Assert.assertTrue(resultT.getText().equals("Red"));
	
		WebElement result1=null;
		
		try{
        	ca.eleToBeClickable();
                for(int k = 1; k <=50; k++ ){
                    ca.click(driver.findElement(By.xpath("//div[contains(@class,'BOM')]//span[text()='-']/parent::div")));
                     result1 = driver.findElement(By.xpath("(//td[@data-csi-act='BOMLineQuote::0'])[4]"));
                    if(result1.isDisplayed()){
                   
                    ca.click(driver.findElement(By.xpath("//div[contains(@class,'BOM')]//span[text()='-']/parent::div")));
                    ca.click(driver.findElement(By.xpath("//div[contains(@class,'BOM')]//span[text()='-']/parent::div")));
        
                ca.eleToBeClickable();
                break;
                }
                }
            }catch (Exception w) {
                // TODO: handle exception
            }
		
		try{
		System.out.println("result is :"+result1.getText());	
		//Assert.assertTrue(result1.getText().equals(null));
		}catch (Exception e5) {
			// TODO: handle exception
		}
		
		System.out.println("Existing BOM updated successfully");
		
	}

	@Then("User performing delete style BOM placements and validate style")
	public void user_performing_delete_style_BOM_placements_and_validate_style() throws Throwable {
	    
		goToTheme();
		Commonactions.isElementPresent(sp.getApproveActions());
        ca.click(sp.getApproveActions());
        Commonactions.isElementPresent(sat.getDeleteSBOMP());
        ca.click(sat.getDeleteSBOMP());
        Commonactions.isElementPresent(sat.getBomSect());
        ca.click(sat.getBomSect());
        WebElement e = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(e, "All"); 
    	ca.eleToBeClickable();
    	ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		e.sendKeys(Keys.TAB);
        ca.eleToBeClickable();
        Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
        Commonactions.isElementPresent(pp.getDelete_Btn());
        ca.click(pp.getDelete_Btn());
        ca.eleToBeClickable();
        
        Commonactions.isElementPresent(sat.getNeckDelete());
        ca.click(sat.getNeckDelete());
        Commonactions.isElementPresent(sat.getSelectStyleBoms());
        ca.click(sat.getSelectStyleBoms());
        Commonactions.isElementPresent(sat.getNeckChkBx());
        ca.click(sat.getNeckChkBx());
        Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		try{if(in.getCancel().isDisplayed())
		{
			ca.click(in.getCancel());
		}}catch(Exception e1){}
		
		GoToStyle();
		
		WebElement result = driver.findElement(By.xpath("(//div[@class='footLeft' and contains(@data-dojo-attach-event,'QueryMessageCount')])[1]"));
		//Assert.assertTrue(result.getText().contains("9"));
		
        System.out.println("Delete style BOM action performed successfully");
        
	}

	@Then("User performing unlink and synch from theme validation")
	public void user_performing_unlink_and_synch_from_theme_validation() throws Throwable {
	    
		
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sat.getApproveActionsStyle());
        ca.click(sat.getApproveActionsStyle());
        Commonactions.isElementPresent(sat.getUnlinkFTheme());
        ca.click(sat.getUnlinkFTheme());
        ca.eleToBeClickable();
		WebElement button = driver.findElement(By.xpath("(//td[@data-csi-heading='FromMaterialPlanPlacement::0']/div[contains(@class,'Disabled')])[1]"));
        ca.mouseOver(button);
        
        
        ca.eleToBeClickable();
        Commonactions.isElementPresent(sat.getApproveActionsStyle());
        ca.click(sat.getApproveActionsStyle());
        try{
        Commonactions.isElementPresent(sat.getSynBOMFTheme());
        ca.click(sat.getSynBOMFTheme());
        }catch (Exception e) {
			ca.click(driver.findElement(By.xpath("(//td[text()='Synch BOM From Theme'])[2]")));
		}
        Commonactions.isElementPresent(sat.getUpdate_Color1());
        ca.click(sat.getUpdate_Color1());
        WebElement e = ca.activeElement();
    	ca.eleToBeClickable();
    	Thread.sleep(1000);
    	ca.insertText(e, "A"); 
    	ca.eleToBeClickable();
    	ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		e.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(sat.getUpdatePlaAttr());
        ca.click(sat.getUpdatePlaAttr());
        Commonactions.isElementPresent(sat.getIncludeBlnkAttr());
        ca.click(sat.getIncludeBlnkAttr());
        Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		System.out.println("Unlink and Synch action performed successfully");
		
		
	}

}
