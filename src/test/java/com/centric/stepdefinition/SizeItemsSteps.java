package com.centric.stepdefinition;

import com.centric.objectrepository.*;
import com.centric.resources.Commonactions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class SizeItemsSteps extends Commonactions {

    Commonactions ca = new Commonactions();
    SetupPageTK sp = new SetupPageTK();
    PopupPage pp = new PopupPage();
    HomePage hp = new HomePage();
    SpecificationPage spec = new SpecificationPage();
    SpecificationHierarchyPageTK shp = new SpecificationHierarchyPageTK();
    ColorSpecificationPageTK cp = new ColorSpecificationPageTK();
    PopupPage pup=new PopupPage();
    StylePage spk =new StylePage();
    SizeLabel sl = new SizeLabel();
    SIzeChartTK sc = new SIzeChartTK();
    SizeSpec ss = new SizeSpec();
    SizeItem si = new SizeItem();
    LookUpPage lp = new LookUpPage();
    SpecificationPageTK sk = new SpecificationPageTK();

    @When("user navigates to size items tab")
    public void userNavigatesToSizeItemsTab() throws Throwable {
        try {
        	 Commonactions.isElementPresent(hp.getUser_settingsBtn1());
 	        ca.click(hp.getUser_settingsBtn1()); 
 		     
 		     System.out.println("Setup tab clicked successfully");
 	  
 	 Commonactions.isElementPresent(hp.getData_Spec());
 	 ca.click(hp.getData_Spec());
      ca.eleToBeClickable();
 	// Commonactions.isElementPresent(hp.getSetupSearch());
 	/* ca.insertText(hp.getSetupSearch(), "Spec Type-01");
 	 ca.eleToBeClickable();
            ca.click(si.getSetupStyleItemTab());*/
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @And("user creates the size item {string},{string}")
    public void userCreatesTheSizeItem(String a,String b) throws Throwable {
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        String[] sizeItem,sizeSpec;
        ca.eleToBeClickable();
        sizeItem = a.split(",");
        sizeSpec = b.split(",");
        ca.eleToBeClickable();
        jsWaitForPageLoad();
        for (int i = 0; i < sizeItem.length; i++) {
        	
        	 ca.eleToBeClickable();
         	 Commonactions.isElementPresent(hp.getSetupSearch());
         	 ca.insertText(hp.getSetupSearch(), sizeSpec[i]);
         	 ca.eleToBeClickable();
                    ca.click(driver.findElement(By.xpath("//span[text()='"+sizeSpec[i]+"']")));
        	
            Commonactions.isElementPresent(si.getSetupStyleItemAction());
            actions.moveToElement(si.getSetupStyleItemAction()).click(si.getSetupStyleItemAction()).build().perform();
            Commonactions.isElementPresent(si.getSpecTypeOptionList());
            ca.click(si.getSpecTypeOptionList());
            
          //  Commonactions.isElementPresent(si.getSpecTypeInputTextBtn());
          //  ca.insertText(si.getSpecTypeInputTextBtn(),sizeSpec[i]);
            Thread.sleep(3000);
          //  actions.sendKeys(Keys.DOWN).build().perform();
          //  actions.sendKeys(Keys.ENTER).build().perform();
            Commonactions.isElementPresent(si.getSpecItemInputTextBtn());
            ca.insertText(si.getSpecItemInputTextBtn(),sizeItem[i]);
            Commonactions.isElementPresent(pp.getSave_Btn());
            ca.click(pp.getSave_Btn());
            ca.eleToBeClickable();
        }
        System.out.println("Size items  are created");
    }

    @Then("Validate the options like copy and delete for size item {string},{string}")
    public void validateTheOptionsLikeCopyAndDeleteForSizeItem(String a, String colorName) throws Throwable {
        java.util.List<WebElement> optionCount = driver.findElements(By.xpath("//span[@data-csi-act='Copy']"));
        optionCount.size();
        Thread.sleep(2000);
        WebElement copyBtn = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + colorName + "']//following::span[@data-csi-act='Copy'])[1]"));
        copyBtn.click();
        ca.eleToBeClickable();
        si.getSpecItemInputTextBtn().clear();
        Thread.sleep(200);
        ca.insertText(si.getSpecItemInputTextBtn(), a);
        ca.eleToBeClickable();
        Boolean save_Copy = driver.findElement(By.cssSelector("span[data-csi-act='Save_Copy']")).isDisplayed();
        System.out.println("The Popup contains Save&Copy button" + " -" + save_Copy);
        Boolean cancel = driver.findElement(By.cssSelector("span[data-csi-act='Cancel']")).isDisplayed();
        System.out.println("The Popup contains Cancel button" + "- " + cancel);
        ca.eleToBeClickable();
        ca.click(cp.getSaveBtn());
        WebElement delete = driver.findElement(By.xpath("//a[@class='browse' and text()='" + a + "']//following::span[@data-csi-act='Delete']"));
        Thread.sleep(1000);
        delete.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[contains(text(),'Delete')])[2]")).click();
        System.out.println("The copy color specification is deleted ");
    }

    @And("user creation of tags in the size item {string},{string}")
    public void userCreationOfTagsInTheSizeItem(String a,String b) throws Throwable {
        Actions actions = new Actions(driver);
        String size ="Characteristic,Construction,Packaging";
        String[] sizeSpec = size.split(",");
        String[] sizeItem, tag;
        ca.eleToBeClickable();
        sizeItem = a.split(",");
        tag = b.split(",");
        for (int i = 0; i < sizeItem.length; i++) {
         //   driver.navigate().refresh();
         //   jsWaitForPageLoad();
        	if(i>=1){
        	 ca.eleToBeClickable();
         	 Commonactions.isElementPresent(hp.getSetupSearch());
         	 ca.insertText(hp.getSetupSearch(), sizeSpec[i]);
         	 ca.eleToBeClickable();
                    ca.click(driver.findElement(By.xpath("//span[text()='"+sizeSpec[i]+"']")));
        	}
        	ca.eleToBeClickable();
            WebElement dimName1 = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + sizeItem[i] + "']//following::td[@data-csi-act='Tags::0'])[1]"));
            
            try{
            	ca.eleToBeClickable();
            	//ca.jsScrollPageDown(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));
            	
            	
                    for(int j = 1; j <=50; j++ ){
                        ca.click(driver.findElement(By.xpath("//div[contains(@class,'Spec')]//span[text()='+']/parent::div")));
                    if(dimName1.isDisplayed()){
                       
                        ca.click(driver.findElement(By.xpath("//div[contains(@class,'Spec')]//span[text()='+']/parent::div")));
                        ca.click(driver.findElement(By.xpath("//div[contains(@class,'Spec')]//span[text()='+']/parent::div")));
            
                    ca.eleToBeClickable();
                    break;
                    }
                    }
                }catch (Exception exception) {
                    // TODO: handle exception
                }
            
            dimName1.click();
            ca.eleToBeClickable();
            WebElement e = ca.activeElement();
            ca.eleToBeClickable();
            ca.insertText(e, tag[i]);
            Thread.sleep(2000);
            //driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + tag[i] + "']")).click();
            actions.sendKeys(Keys.DOWN).build().perform();
            Thread.sleep(1000);
            actions.sendKeys(Keys.ENTER).build().perform();
            ca.eleToBeClickable();
            ca.click(si.getSetupStyleItemTab());
            jsWaitForPageLoad();
            Thread.sleep(3000);
        }
    }

    @Then("user creates the size item with all the types for Template scenario {string},{string}")
    public void userCreatesTheSizeItemWithAllTheTypesForTemplateScenario(String a, String b) throws Throwable {
        Actions actions = new Actions(driver);
        String[] sizeItem,sizeSpec;
        ca.eleToBeClickable();
        sizeItem = a.split(",");
        sizeSpec = b.split(",");
        ca.eleToBeClickable();
        jsWaitForPageLoad();
        ArrayList<String> format = new ArrayList<String>();
        format.add("Alphanumeric");
        format.add("Barcode");
        format.add("Email Address");
        format.add("Hyperlink");
        format.add("Latest Multi-line Comment");
        format.add("Multi-line Comment");
        format.add("Multi-line Text");
        format.add("Phone");
        format.add("Rich Text");

        ca.eleToBeClickable();
    	 Commonactions.isElementPresent(hp.getSetupSearch());
    	 ca.insertText(hp.getSetupSearch(), sizeSpec[0]);
    	 ca.eleToBeClickable();
               ca.click(driver.findElement(By.xpath("//span[text()='"+sizeSpec[0]+"']")));
            ca.eleToBeClickable();   
        
        for (int i = 0; i < sizeItem.length; i++) {
        	
        	
        	
            ca.click(si.getSetupStyleItemAction());
           /* Commonactions.isElementPresent(si.getSpecTypeOptionList());
            ca.click(si.getSpecTypeOptionList());
            Commonactions.isElementPresent(si.getSpecTypeInputTextBtn());
            ca.insertText(si.getSpecTypeInputTextBtn(),sizeSpec[0]);
            ca.eleToBeClickable();
            actions.sendKeys(Keys.DOWN).build().perform();
            actions.sendKeys(Keys.ENTER).build().perform();*/
            Commonactions.isElementPresent(si.getSpecItemInputTextBtn());
            ca.insertText(si.getSpecItemInputTextBtn(),sizeItem[i]);
            Commonactions.isElementPresent(si.getSpecItemFormatArrowBtn());
            try{
            for (int j =i; j<=i ; j++) {
            	ca.eleToBeClickable();
            	Thread.sleep(1000);
                ca.click(si.getSpecItemFormatArrowBtn());
                ca.eleToBeClickable();
                WebElement e = ca.activeElement();
                ca.eleToBeClickable();
                ca.insertText(e, format.get(i));
                ca.eleToBeClickable();
                ca.jsMouseOver();
            }}catch (Exception e) {
				// TODO: handle exception
			}
            Commonactions.isElementPresent(pp.getSave_Btn());
            ca.click(pp.getSave_Btn());
            ca.eleToBeClickable();
        }
    }

    @And("user creates the spec items with different types {string},{string}")
    public void userCreatesTheSpecItemsWithDifferentTypes(String a, String b) throws Throwable {
        Actions actions = new Actions(driver);
        String[] sizeItem,sizeSpec;
        ca.eleToBeClickable();
        sizeItem = a.split(",");
        sizeSpec = b.split(",");
        ArrayList<String> format = new ArrayList<String>();
        format.add("1,234.6");
        format.add("$1,235");
        format.add("Cost Factors");
        format.add("Holiday Calendar");

/*        ca.eleToBeClickable();
    	 Commonactions.isElementPresent(hp.getSetupSearch());
    	 ca.insertText(hp.getSetupSearch(), sizeSpec[0]);
    	 ca.eleToBeClickable();
               ca.click(driver.findElement(By.xpath("//div[text()='"+sizeSpec[0]+"']")));*/
   	
       ca.eleToBeClickable();
        for (int i = 0; i < sizeItem.length; i++) {
        	
        	ca.eleToBeClickable();
            ca.click(si.getSetupStyleItemAction());
           /* Commonactions.isElementPresent(si.getSpecTypeOptionList());
            ca.click(si.getSpecTypeOptionList());
            Commonactions.isElementPresent(si.getSpecTypeInputTextBtn());
            ca.insertText(si.getSpecTypeInputTextBtn(),sizeSpec[0]);
            ca.eleToBeClickable();
            actions.sendKeys(Keys.DOWN).build().perform();
            actions.sendKeys(Keys.ENTER).build().perform();*/
            Commonactions.isElementPresent(si.getSpecItemInputTextBtn());
            ca.insertText(si.getSpecItemInputTextBtn(),sizeItem[i].trim());
            Commonactions.isElementPresent(si.getSpecItemValueArrowBtn());
            si.getSpecItemValueArrowBtn().clear();
            Thread.sleep(2500);
            ca.insertText(si.getSpecItemValueArrowBtn(),sizeItem[i].trim());
            Thread.sleep(3500);
            actions.sendKeys(Keys.DOWN).build().perform();
            actions.sendKeys(Keys.ENTER).build().perform();
            Commonactions.isElementPresent(si.getSpecItemFormatArrowBtn());
         
            for (int j =i; j<=i ; j++) {
                if (j ==2) {
                    Commonactions.isElementPresent(si.getSpecItemLookUpArrowBtn());
                    ca.click(si.getSpecItemLookUpArrowBtn());
                    WebElement e = ca.activeElement();
                    ca.eleToBeClickable();
                    ca.insertText(e, format.get(i));
                    ca.eleToBeClickable();
                    ca.jsMouseOver();
                }if(j==3){
                    Commonactions.isElementPresent(si.getSpecItemLookUpArrowBtn());
                    ca.click(si.getSpecItemLookUpArrowBtn());
                    WebElement e = ca.activeElement();
                    ca.eleToBeClickable();
                    ca.insertText(e, format.get(i));
                    ca.eleToBeClickable();
                    ca.jsMouseOver();
                }
                ca.click(si.getSpecItemFormatArrowBtn());
                ca.eleToBeClickable();
                WebElement e = ca.activeElement();
                ca.eleToBeClickable();
                ca.insertText(e, format.get(i));
                ca.eleToBeClickable();
                ca.jsMouseOver();
                Commonactions.isElementPresent(pp.getSave_Btn());
                ca.click(pp.getSave_Btn());
            }
        }
    }

    @When("user navigates to SpecSizeCanvas tab")
    public void userNavigatesToSpecSizeCanvasTab() throws Throwable {
    	 Commonactions.isElementPresent(hp.getUser_settingsBtn1());
	        ca.click(hp.getUser_settingsBtn1()); 
		     
		     System.out.println("Setup tab clicked successfully");
	  
	 Commonactions.isElementPresent(hp.getData_Spec());
	 ca.click(hp.getData_Spec());
      ca.eleToBeClickable();
        System.out.println("Navigated to Spec Section definitions template page");
    }

    @Then("user creates the Spec Section definitions canvas {string},{string}")
    public void userCreatesTheSpecSectionDefinitionsCanvas(String a, String b) throws Throwable {
        Actions actions = new Actions(driver);
        String[] SpecSection,sizeSpec;
        SpecSection = a.split(",");
        sizeSpec = b.split(",");
      //  Commonactions.PopUpCommonButtonsVerification(sk.getSpecSectionDefinitionActionBtn(),cp.getSaveBtn(),pp.getSave_and_go_Btn(),pp.getSave_and_new_Btn(),cp.getCancelBtn());
        for (int i = 0; i <SpecSection.length ; i++) {
        	
        	 ca.eleToBeClickable();
         	 Commonactions.isElementPresent(hp.getSetupSearch());
         	 ca.insertText(hp.getSetupSearch(), sizeSpec[i]);
         	 ca.eleToBeClickable();
                    ca.click(driver.findElement(By.xpath("(//span[text()='"+sizeSpec[i]+"'])[2]")));
        	/*try{
          //  Commonactions.isElementPresent(sk.getSpecSectionDefinitionActionBtn());
        		Thread.sleep(2000);
            ca.click(sk.getSpecSectionDefinitionActionBtn());
        	}catch (Exception e) {*/
        		 ca.eleToBeClickable();
             	 /*Commonactions.isElementPresent(hp.getSetupSearch());
             	 ca.insertText(hp.getSetupSearch(), sizeSpec[i]);
             	 ca.eleToBeClickable();
                        ca.click(driver.findElement(By.xpath("//span[text()='"+sizeSpec[i]+"']")));*/
                        Commonactions.isElementPresent(sk.getSpecSectionDefinitionActionBtn());
                        ca.click(sk.getSpecSectionDefinitionActionBtn());
		//	}
        //    Commonactions.isElementPresent(sk.getSpecSectionDefinitionInputTxtBtn());
        //    ca.insertText(sk.getSpecSectionDefinitionInputTxtBtn(),sizeSpec[i]);
            Commonactions.isElementPresent(sk.getSpecSectionDefinitionNameTxt());
            ca.click(sk.getSpecSectionDefinitionNameTxt());
            WebElement e = ca.activeElement();
            ca.eleToBeClickable();
            ca.insertText(e, SpecSection[i]);
            ca.eleToBeClickable();
            ca.jsMouseOver();
            //ca.insertText(sk.getSpecSectionDefinitionNameTxt(),SpecSection[i]);
            ca.eleToBeClickable();
            ca.click(pp.getSave_Btn());
        }
    }

    @And("user creates the data inside the characteristics value {string},{string}")
    public void userCreatesTheDataInsideTheCharacteristicsValue(String a, String b) throws Throwable {
    	 Actions actions = new Actions(driver);
         String[] SpecName, sizeSpec;
         sizeSpec = b.split(",");
         SpecName = a.split(",");
         ca.eleToBeClickable();
     	 Commonactions.isElementPresent(hp.getSetupSearch());
     	 ca.insertText(hp.getSetupSearch(), "Characteristic");
     	 ca.eleToBeClickable();
                ca.click(driver.findElement(By.xpath("(//span[text()='Characteristic'])[2]")));
                ca.eleToBeClickable();
        
        /* Commonactions.isElementPresent(hp.getSetupSearch());
    	 ca.insertText(hp.getSetupSearch(), "Characteristic");
    	 ca.eleToBeClickable();
               ca.click(driver.findElement(By.xpath("//span[text()='Characteristic']")));
               ca.eleToBeClickable();*/
               
               WebElement name = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + sizeSpec[0] + "'])"));
               ca.eleToBeClickable();
         Commonactions.isElementPresent(name);
         name.click();
         jsWaitForPageLoad();
         //PopUpCommonButtonsVerification(sk.getNewSpecSection());
        Commonactions.PopUpCommonButtonsVerification(sk.getNewSpecSection(),cp.getSaveBtn(),pp.getSave_and_go_Btn(),pp.getSave_and_new_Btn(),cp.getCancelBtn());
        for (int i = 0; i < SpecName.length; i++) {
            Commonactions.isElementPresent(sk.getNewSpecSection());
            ca.click(sk.getNewSpecSection());
            Commonactions.isElementPresent(sk.getNewSpecSectionTextBtn());
            ca.insertText(sk.getNewSpecSectionTextBtn(),SpecName[i]);
            Commonactions.isElementPresent(pp.getSave_Btn());
            ca.click(pp.getSave_Btn());
        }
    }
    public void PopUpCommonButtonsVerification(WebElement element) throws InterruptedException {
        Commonactions.isElementPresent(element);
        if (element.isDisplayed()) {
            element.click();
            Thread.sleep(2000);
            Commonactions.assertText(cp.getSaveBtn(), "Save");
            Commonactions.assertText(cp.getCancelBtn(), "Cancel");
            Commonactions.assertText(pp.getSave_and_new_Btn(), "Save & New");
            Commonactions.assertText(pp.getSave_and_go_Btn(), "Save & Go");
            cp.getCancelBtn().click();
        }
    }

    @Then("user selects the values from the options of spec items {string}")
    public void userSelectsTheValuesFromTheOptionsOfSpecItems(String a) throws Throwable {
        String[] SpecName;
        SpecName = a.split(",");
        ArrayList<String> format = new ArrayList<String>();
        format.add("Alphanumeric");
        format.add("Barcode");
        format.add("Email Address");
        format.add("Hyperlink");
        format.add("Latest Multi-line Comment");
        format.add("Multi-line Comment");
        format.add("Multi-line Text");
        format.add("Phone");
        format.add("Rich Text");
        
        ca.eleToBeClickable();
        WebElement name = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + SpecName[0] + "'])"));
        waitForElementClickable(name);
        name.click();
        jsWaitForPageLoad();
        Commonactions.isElementPresent(sk.getNewSpecSectionFromItemActionBtn());
        ca.click(sk.getNewSpecSectionFromItemActionBtn());
        for (int i = 0; i <format.size() ; i++) {
            driver.findElement(By.xpath("//td[contains(text(),'" + format.get(i) + "')]")).click();
        }
        Commonactions.isElementPresent(cp.getSaveBtn());
        ca.click(cp.getSaveBtn());
        Commonactions.isElementPresent(sk.getNewSpecSectionFromItemArrowBtn());
        ca.click(sk.getNewSpecSectionFromItemArrowBtn());
        Commonactions.isElementPresent(sk.getNewSpecSectionSpecialBtn());
        ca.click(sk.getNewSpecSectionSpecialBtn());
        ca.eleToBeClickable();
        ca.insertText(sk.getNewSpecSectionSpecialInputBtn(),"Special");
        Commonactions.isElementPresent(cp.getSaveBtn());
        ca.click(cp.getSaveBtn());
    }

    @And("user creates a custom view to verify the data output {string},{string}")
    public void userCreatesACustomViewToVerifyTheDataOutput(String a, String b) throws Throwable {
        String[]  deselect;
        deselect = b.split(",");
        Actions actions = new Actions(driver);
        Commonactions.CustomView(sk.getSpecSectionCustomViewBtn(),sk.getSpecSectionManageViewBtn(),cp.getCopyCV_Option(),cp.getCopyNameTxt_bx());
        sk.getSpecSectionAttributeBtn().click();
        sk.getSpecSectionAttributeBtn().clear();
        ca.insertText(sk.getSpecSectionAttributeBtn(),"Value Definition");
        actions.sendKeys(Keys.DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();

        for (int i = 0; i <deselect.length; i++) {
            Select drop = new Select(cp.getSelectedAttributesBox());
            drop.selectByVisibleText(deselect[i]);
            Commonactions.isElementPresent(cp.getCV_RemoveBtn());
            cp.getCV_RemoveBtn().click();
        }
        Select dropdown = new Select(cp.getAttributesBox());
        dropdown.selectByVisibleText(a);
        Commonactions.isElementPresent(cp.getCV_AddBtn());
        cp.getCV_AddBtn().click();
        MaterialSpecificationPage mp = new MaterialSpecificationPage();
        ca.jsScrollPageDown(mp.getSave_btn1());
        Commonactions.isElementPresent(mp.getSave_btn1());
        ca.click(mp.getSave_btn1());
    }

    @Then("user validate the special created data")
    public void userValidateTheSpecialCreatedData() {
        WebElement a = driver.findElement(By.xpath("//td[text()='Special']//following::td[@data-csi-heading='ValueType:Child:Definition/Child:ValueAttributeDefinition:0']"));
        Commonactions.assertText(a,"string");

    }

    @Then("user validate for next data type {string},{string}")
    public void userValidateForNextDataType(String a, String b) throws Throwable {
        Actions actions = new Actions(driver);
        String[] SpecName, sizeSpec;
        sizeSpec = b.split(",");
        SpecName = a.split(",");
        WebElement name = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + sizeSpec[1] + "'])"));
        ca.eleToBeClickable();
        Commonactions.isElementPresent(name);
        name.click();
        jsWaitForPageLoad();
        Commonactions.PopUpCommonButtonsVerification(sk.getNewSpecSection(),cp.getSaveBtn(),pp.getSave_and_go_Btn(),pp.getSave_and_new_Btn(),cp.getCancelBtn());
        for (int i = 0; i < SpecName.length; i++) {
            Commonactions.isElementPresent(sk.getNewSpecSection());
            ca.click(sk.getNewSpecSection());
            Commonactions.isElementPresent(sk.getNewSpecSectionTextBtn());
            ca.insertText(sk.getNewSpecSectionTextBtn(),SpecName[1]);
            Commonactions.isElementPresent(pp.getSave_Btn());
            ca.click(pp.getSave_Btn());
        }

    }
}
