package com.centric.stepdefinition;

import com.centric.objectrepository.*;
import com.centric.resources.Commonactions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;


public class ColorSpecificationTK extends Commonactions {

	Commonactions ca = new Commonactions();
	SetupPageTK sp = new SetupPageTK();
	PopupPage pp = new PopupPage();
	HomePage hp = new HomePage();
	SpecificationPage spec = new SpecificationPage();
	SourcingPage s = new SourcingPage();
	ColorSpecificationPageTK cp = new ColorSpecificationPageTK();
	LookUpPage lp = new LookUpPage();
	SpecificationHierarchyPageTK shp = new SpecificationHierarchyPageTK();
	SpecificationPageTK sk = new SpecificationPageTK();


	@Then("Validate the options like copy and delete {string},{string}")
	public void validateThOptionsLikeCopyDelete(String a, String colorName) throws Throwable {
		java.util.List<WebElement> optionCount = driver.findElements(By.xpath("//span[@data-csi-act='Copy']"));
		optionCount.size();
		Thread.sleep(2000);
		ca.eleToBeClickable();
		WebElement copyBtn = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + colorName + "']//following::span[@data-csi-act='Copy'])[1]"));
		copyBtn.click();
		ca.eleToBeClickable();
		cp.getColorSpecInputBox().clear();
		Thread.sleep(200);
		ca.insertText(cp.getColorSpecInputBox(), a);
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

	@When("User delete the merged colour spec and verify the error message {string}")
	public void userDeleteTheMergedColourSpecAndVerifyTheErrorMessage(String a) throws Throwable {
		WebElement delete = driver.findElement(By.xpath("//a[@class='browse' and text()='" + a + "']//following::span[@data-csi-act='Delete']"));
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(delete).click(delete);
		builder.perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(text(),'Delete')])[2]")).click();
		Thread.sleep(1000);
		String errorMessage = driver.findElement(By.xpath("//div[@class='csi-message-txt']")).getText();
		System.out.println("User unable to delete the merged color spec, please find the error message -" + " " + errorMessage);
		Thread.sleep(5000);
		WebElement okBtn = driver.findElement(By.xpath("(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='OK'])[1]"));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(okBtn);
		ca.click(okBtn);
	}



	@And("User enters the RBG value and verify the colour in the table {string},{string}")
	public void userEntersTheRBGValueAndVerifyTheColourInTheTable(String colorName, String RGBno) throws Throwable {
		Thread.sleep(2000);
		WebElement nameNode = driver.findElement(By.xpath("//a[@class='browse' and text()='" + colorName + "']"));
		WebElement values = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + colorName + "'])/parent::td"));
		String storeNode = values.getAttribute("data-csi-url");
		WebElement codeCell = driver.findElement(By.xpath("//tr[@data-csi-result='" + storeNode + "']/td[@data-csi-heading='RGBHex::0']"));
		Thread.sleep(2000);
		WebElement RGB = driver.findElement(By.xpath("//a[@class='browse' and text()='" + colorName + "']//following::td[@data-csi-heading='RGBHex::0']"));
		try{
			ca.eleToBeClickable();
			//ca.jsScrollPageDown(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));


			for(int j = 1; j <=100; j++ ){
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Color')]//span[text()='+']/parent::div")));
				if(RGB.isDisplayed()){

					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Color')]//span[text()='+']/parent::div")));
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Color')]//span[text()='+']/parent::div")));

					ca.eleToBeClickable();
					break;
				}
			}
		}catch (Exception exception) {
			// TODO: handle exception
		}
		ca.click(driver.findElement(By.xpath("//div[contains(@class,'Color')]//span[text()='+']/parent::div")));
		ca.click(driver.findElement(By.xpath("//div[contains(@class,'Color')]//span[text()='+']/parent::div")));
		ca.click(driver.findElement(By.xpath("//div[contains(@class,'Color')]//span[text()='+']/parent::div")));
		ca.click(driver.findElement(By.xpath("//div[contains(@class,'Color')]//span[text()='+']/parent::div")));
		ca.click(driver.findElement(By.xpath("//div[contains(@class,'Color')]//span[text()='+']/parent::div")));
		ca.click(driver.findElement(By.xpath("//div[contains(@class,'Color')]//span[text()='+']/parent::div")));
		ca.click(codeCell);
		Thread.sleep(2000);
		//  WebElement RGB = driver.findElement(By.xpath("//a[@class='browse' and text()='" + colorName + "']//following::td[@data-csi-heading='RGBHex::0']"));
		Thread.sleep(1000);
		Actions builder = new Actions(driver);
		builder.moveToElement(RGB).click(RGB);
		builder.perform();
		Thread.sleep(2000);
		ca.insertText(spec.getRF_InputText(), RGBno);
		Thread.sleep(1000);
		ca.click(cp.getColorSpecificationTab());
		Thread.sleep(2000);
		System.out.println("The RBG colour is has been successfully added to the colour specification");
		Thread.sleep(2000);
		WebElement statusChecker = driver.findElement(By.xpath("//a[@class='browse' and text()='" + colorName + "']//following::div[@data-csi-act='Active::0'][1]"));
		Boolean check = statusChecker.isSelected();
		if (check.equals(false)) {
			statusChecker.click();
			Thread.sleep(1000);
		} else {
			System.out.println("The Size Map status is not active");
		}
	}


	@And("Merge the color specification and validate the status after merging {string}")
	public void mergeTheColorSpecificationAndValidateTheStatusAfterMerging(String a) throws Throwable {
		ca.eleToBeClickable();
		java.util.List<WebElement> optionCount = driver.findElements(By.xpath("//span[@data-csi-act='ReplaceColorSpecifications']"));
		optionCount.size();
		//   ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//span[@data-csi-act='ReplaceColorSpecifications'])[1]")));
		ca.eleToBeClickable();
		driver.findElement(By.xpath("//td[text()='" + a + "']")).click();
		ca.eleToBeClickable();
		ca.click(cp.getSaveBtn());
		Thread.sleep(4000);
		ca.eleToBeClickable();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement activeStatus = driver.findElement(By.xpath("//a[@class='browse' and text()='" + a + "']//following::td[1]"));
		jse.executeScript("arguments[0].scrollIntoView(true);", activeStatus);
		WebElement statusChecker = driver.findElement(By.xpath("//a[@class='browse' and text()='" + a + "']//following::input[@aria-checked='false']"));
		Boolean check = statusChecker.isSelected();
		if (check.equals(false)) {
			System.out.println("The color specification merge was successful");
		} else {
			System.out.println("The color specification merge was not successful");
		}
	}


	@Then("Click on specification tab and create color specification {string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void clickOnSpecificationTabAndCreateColorSpecification(String ColorName, String Code, String Description, String ColorName2, String Code2, String Description2,String ColorName3,String ColorName4,String ColorName5) throws Throwable {
		Commonactions.isElementPresent(hp.getUser_settingsBtn1());
		ca.click(hp.getUser_settingsBtn1()); 

		System.out.println("Setup tab clicked successfully");

		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());
		ca.eleToBeClickable();
		//  Commonactions.isElementPresent(hp.getSetupSearch());
		//  ca.insertText(hp.getSetupSearch(), "Color Specifications");
		//  ca.eleToBeClickable();
		//   ca.click(cp.getColorSpecificationTab());
		//   jsWaitForPageLoad();
		Commonactions.isElementPresent(cp.getNewColorSpec_btn());
		ca.click(cp.getNewColorSpec_btn());
		ca.eleToBeClickable();
		if (cp.getNewColorSpec_btn().isDisplayed() && cp.getNewColorSpec_btn().isEnabled()) {
			String expectedHeader = "New Color Specification";
			String message = cp.getColorSpecPOPHeader().getText();
			Assert.assertTrue("New Color Specification", message.contains(expectedHeader));
			System.out.println("Color Specification header verified Successfully");
			ca.click(cp.getCancelBtn());
		}
		Commonactions.isElementPresent(cp.getNewColorSpec_btn());
		ca.click(cp.getNewColorSpec_btn());
		Commonactions.isElementPresent(cp.getColorSpecInputBox());
		ca.insertText(cp.getColorSpecInputBox(),ColorName);
		Commonactions.isElementPresent(cp.getSaveBtn());
		ca.click(cp.getSaveBtn());
		ca.eleToBeClickable();
		WebElement nameNode = driver.findElement(By.xpath("//a[@class='browse' and text()='" + ColorName + "']"));
		WebElement values = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + ColorName + "'])/parent::td"));
		String storeNode = values.getAttribute("data-csi-url");
		WebElement codeCell = driver.findElement(By.xpath("//tr[@data-csi-result='" + storeNode + "']/td[@data-csi-heading='Code::0']"));
		Commonactions.isElementPresent(codeCell);
		codeCell.click();
		Commonactions.isElementPresent(spec.getRF_InputText());
		ca.insertText(spec.getRF_InputText(),Code);
		//  Commonactions.isElementPresent(spec.getSpecificationTab());
		//  ca.click(spec.getSpecificationTab());
		WebElement description = driver.findElement(By.xpath("//tr[@data-csi-result='" + storeNode + "']/td[@data-csi-heading='Description::0']"));
		description.click();
		Commonactions.isElementPresent(description);
		ca.insertText(spec.getRF_InputText(), Description);
		//   Commonactions.isElementPresent(spec.getSpecificationTab());
		//   ca.click(spec.getSpecificationTab());

		Commonactions.isElementPresent(cp.getNewColorSpec_btn());
		ca.click(cp.getNewColorSpec_btn());
		Commonactions.isElementPresent(cp.getColorSpecInputBox());
		ca.insertText(cp.getColorSpecInputBox(),ColorName2);
		Commonactions.isElementPresent(cp.getSaveBtn());
		ca.click(cp.getSaveBtn());
		WebElement nameNode1 = driver.findElement(By.xpath("//a[@class='browse' and text()='" + ColorName2 + "']"));
		WebElement values1 = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + ColorName2 + "'])/parent::td"));
		String storeNode1 = values1.getAttribute("data-csi-url");
		WebElement codeCell1 = driver.findElement(By.xpath("//tr[@data-csi-result='" + storeNode1 + "']/td[@data-csi-heading='Code::0']"));
		Commonactions.isElementPresent(codeCell1);
		codeCell1.click();
		Thread.sleep(1000);
		ca.insertText(spec.getRF_InputText(),Code2);
		Thread.sleep(1000);
		//    ca.click(spec.getSpecificationTab());
		Thread.sleep(1000);
		WebElement description1 = driver.findElement(By.xpath("//tr[@data-csi-result='" + storeNode1 + "']/td[@data-csi-heading='Description::0']"));
		description1.click();
		Thread.sleep(1000);
		ca.insertText(spec.getRF_InputText(), Description2);
		Thread.sleep(5000);
		//    ca.click(spec.getSpecificationTab());


		//  ca.eleToBeClickable();
		ca.eleToBeClickable();
		//  Thread.sleep(2000);
		ca.click(cp.getNewColorSpec_btn());
		Thread.sleep(1000);
		ca.eleToBeClickable();
		ca.insertText(cp.getColorSpecInputBox(),ColorName3);
		ca.eleToBeClickable();
		ca.click(cp.getSaveBtn());
		Thread.sleep(1000);
		WebElement nameNode3 = driver.findElement(By.xpath("//a[@class='browse' and text()='" + ColorName3 + "']"));
		WebElement values3 = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + ColorName3 + "'])/parent::td"));
		String storeNode3 = values3.getAttribute("data-csi-url");
		WebElement codeCell3 = driver.findElement(By.xpath("//tr[@data-csi-result='" + storeNode3 + "']/td[@data-csi-heading='Code::0']"));
		ca.eleToBeClickable();
		codeCell3.click();
		Thread.sleep(1000);
		ca.insertText(spec.getRF_InputText(),"24");
		Thread.sleep(1000);
		//    ca.click(spec.getSpecificationTab());

		ca.eleToBeClickable();
		Thread.sleep(2000);
		ca.click(cp.getNewColorSpec_btn());
		Thread.sleep(1000);
		ca.eleToBeClickable();
		ca.insertText(cp.getColorSpecInputBox(),ColorName4);
		ca.eleToBeClickable();
		ca.click(cp.getSaveBtn());
		Thread.sleep(1000);
		WebElement nameNode4 = driver.findElement(By.xpath("//a[@class='browse' and text()='" + ColorName4 + "']"));
		WebElement values4 = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + ColorName4 + "'])/parent::td"));
		String storeNode4 = values4.getAttribute("data-csi-url");
		WebElement codeCell4 = driver.findElement(By.xpath("//tr[@data-csi-result='" + storeNode4 + "']/td[@data-csi-heading='Code::0']"));
		ca.eleToBeClickable();
		codeCell4.click();
		Thread.sleep(1000);
		ca.insertText(spec.getRF_InputText(),"25");
		Thread.sleep(1000);
		//    ca.click(spec.getSpecificationTab());

		ca.eleToBeClickable();
		Thread.sleep(2000);
		ca.click(cp.getNewColorSpec_btn());
		Thread.sleep(1000);
		ca.eleToBeClickable();
		ca.insertText(cp.getColorSpecInputBox(),ColorName5);
		ca.eleToBeClickable();
		ca.click(cp.getSaveBtn());
		Thread.sleep(1000);
		WebElement nameNode5 = driver.findElement(By.xpath("//a[@class='browse' and text()='" + ColorName5 + "']"));
		WebElement values5 = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + ColorName5 + "'])/parent::td"));
		String storeNode5 = values5.getAttribute("data-csi-url");
		WebElement codeCell5 = driver.findElement(By.xpath("//tr[@data-csi-result='" + storeNode5 + "']/td[@data-csi-heading='Code::0']"));
		ca.eleToBeClickable();
		codeCell5.click();
		Thread.sleep(1000);
		ca.insertText(spec.getRF_InputText(),"26");
		Thread.sleep(1000);
		//    ca.click(spec.getSpecificationTab());
	}

	MaterialSpecificationPage mp =  new MaterialSpecificationPage();

	@Then("User creates the Custom view and add the options to the table of Color spec {string},{string}")
	public void userCreatesTheCustomViewAndAddTheOptionsToTheTable(String arg0, String arg1 ) throws Throwable {
		String[]  deselect;
		deselect = arg1.split(",");
		Actions actions = new Actions(driver);
		ca.eleToBeClickable();
		/*Thread.sleep(2000);
        Commonactions.isElementPresent(cp.getCustomViewBtn());
        ca.click(cp.getCustomViewBtn());
        Commonactions.isElementPresent(cp.getManageViews_CV());
        ca.click(cp.getManageViews_CV());
        Commonactions.isElementPresent(cp.getCopyCV_Option());
        ca.click(cp.getCopyCV_Option());
		Commonactions.isElementPresent(cp.getCopyNameTxt_bx());
		ca.insertText(cp.getCopyNameTxt_bx(), "Automation");*/
		ca.eleToBeClickable();
		Commonactions.CustomView(cp.getCustomViewBtn(),cp.getManageViews_CV(),cp.getCopyCV_Option(),cp.getCopyNameTxt_bx());
		Select drop = new Select(cp.getSelectedAttributesBox());
		ca.eleToBeClickable();
		for (int i = 0; i <deselect.length; i++) {
			drop.selectByVisibleText(deselect[i]);
			Commonactions.isElementPresent(cp.getCV_RemoveBtn());
			cp.getCV_RemoveBtn().click();
		}
		Select dropdown = new Select(cp.getAttributesBox());
		ca.eleToBeClickable();
		dropdown.selectByVisibleText(arg0);
		Commonactions.isElementPresent(cp.getCV_AddBtn());
		ca.click(cp.getCV_AddBtn());
		ca.eleToBeClickable();
		ca.jsScrollPageDown(mp.getSave_btn1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();    }

	@But("User deletes the unwanted attributes from custom views column {string},{string},{string},{string}")
	public void userDeletesTheUnwantedAttributesFromCustomViewsColumn(String arg0, String arg1, String arg2, String arg3) throws Throwable {
		Thread.sleep(2000);
		ca.eleToBeClickable();
		Actions actions = new Actions(driver);
		actions.moveToElement(cp.getCustomViewBtn()).click(cp.getCustomViewBtn()).build().perform();
		Thread.sleep(2000);
		ca.click(cp.getManageViews_CV());
		Thread.sleep(2000);
		Select dropdown = new Select(cp.getSelectedAttributesBox());
		Thread.sleep(1000);
		dropdown.selectByVisibleText(arg0);
		dropdown.selectByVisibleText(arg1);
		dropdown.selectByVisibleText(arg2);
		dropdown.selectByVisibleText(arg3);
		Thread.sleep(1000);
		ca.click(cp.getCV_RemoveBtn());
		Thread.sleep(2000);
		ca.click(cp.getCV_PopUpSaveBtn());
		System.out.println("The custom view is created successfully with the given options");
	}

	@Then("User enters the RBG value and colour in the table {string},{string},{string},{string}")
	public void userEntersTheRBGValueAndColourInTheTable(String color2, String color3, String color4, String color5) throws Throwable {
		ArrayList<String> colors=new ArrayList<String>();
		colors.add(color2);
		colors.add(color3);
		colors.add(color4);
		colors.add(color5);
		ArrayList<String> RGBX=new ArrayList<String>();
		RGBX.add("#EFEFDF");
		RGBX.add("#EFEAD7");
		RGBX.add("#F2EFDC");
		RGBX.add("#EFEFD5");
		// driver.navigate().refresh();
		jsWaitForPageLoad();
		int list = colors.size();
		for (int i = 0; i <list ; i++) {
			WebElement colorSpecs = driver.findElement(By.xpath("//a[@class='browse' and text()='" + colors.get(i) + "']//following::td[@data-csi-heading='RGBHex::0'][1]"));
			ca.eleToBeClickable();
			ca.jsScrollPageDown(colorSpecs);
			Actions builder = new Actions(driver);
			builder.moveToElement(colorSpecs).click(colorSpecs);
			ca.eleToBeClickable();
			builder.perform();
			Thread.sleep(4000);
			ca.insertText(spec.getRF_InputText(), RGBX.get(i));
			Thread.sleep(2000);
			ca.click(cp.getColorSpecificationTab());

		}
		System.out.println("The RBG colour is has been successfully added to all the colour specifications");
	}


	@And("user creates the template {string},{string}")
	public void userCreatesTheTemplate(String a, String b) throws Throwable {
		Actions actions = new Actions(driver);
		ca.eleToBeClickable();
		String[] template, type;
		ca.eleToBeClickable();
		template = a.split(",");
		type = b.split(",");

		ca.click(spec.getTemplateTab());
		for (int i = 0; i < template.length; i++) {
			Thread.sleep(3500);
			ca.eleToBeClickable();
			ca.click(spec.getTemplateActionBtn());
			ca.eleToBeClickable();
			ca.insertText(spec.getTemplateNameInputBx(),template[i]);
			ca.eleToBeClickable();
			ca.insertText(spec.getTemplateTypeInputBx(),type[i]);
			Thread.sleep(1500);
			actions.sendKeys(Keys.ARROW_DOWN).build().perform();
			actions.sendKeys(Keys.ENTER).build().perform();
			ca.eleToBeClickable();
			ca.click(pp.getSave_Btn());
		}
		System.out.println("Template for style and material created");
	}

	@Then("user creates the datasheet template for style {string},{string}")
	public void userCreatesTheDatasheetTemplateForStyle(String a, String b) throws Throwable {
		/*    	Commonactions.isElementPresent(hp.getSetupSearch());
        ca.insertText(hp.getSetupSearch(), "Spec Data Sheet Templates");
        ca.eleToBeClickable();
        ca.click(spec.getTemplateTab1());*/
		Actions actions = new Actions(driver);
		ca.eleToBeClickable();
		String[] StyleDatasheet;
		StyleDatasheet = a.split(",");
		WebElement datasheet = driver.findElement(By.xpath("//a[@class='browse' and text()='" + b + "']"));
		ca.eleToBeClickable();
		datasheet.click();
		jsWaitForPageLoad();
		for (int i = 0; i < StyleDatasheet.length; i++) {
			ca.eleToBeClickable();
			ca.click(spec.getDataSheetActionBtn());
			ca.eleToBeClickable();
			ca.insertText(spec.getDataSheetInputTxtBx(),StyleDatasheet[i]);
			Thread.sleep(1500);
			actions.sendKeys(Keys.ARROW_DOWN).build().perform();
			actions.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(1500);
			if (i != 0) {
				ca.click(spec.getGetLatestCreatedChkBx());
				ca.eleToBeClickable();
			}
			ca.click(sp.getPopUpSaveBtn());
		}
		System.out.println("Template for style data sheet created");
	}

	@And("user creates the datasheet template for material {string},{string}")
	public void userCreatesTheDatasheetTemplateForMaterial(String a, String b) throws Throwable {

		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getUser_settingsBtn1());
		ca.click(hp.getUser_settingsBtn1()); 

		System.out.println("Setup tab clicked successfully");

		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());
		Actions actions = new Actions(driver);
		ca.eleToBeClickable();
		String[] StyleDatasheet;
		StyleDatasheet = a.split(",");
		WebElement datasheet = driver.findElement(By.xpath("//a[@class='browse' and text()='" + b + "']"));
		ca.eleToBeClickable();
		datasheet.click();
		jsWaitForPageLoad();
		for (int i = 0; i < StyleDatasheet.length; i++) {
			ca.eleToBeClickable();
			ca.click(spec.getDataSheetActionBtn());
			ca.eleToBeClickable();
			ca.insertText(spec.getDataSheetInputTxtBx(), StyleDatasheet[i]);
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();	
			if (i != 0) {
				ca.click(spec.getGetLatestCreatedChkBx());
				ca.eleToBeClickable();
			}
			ca.click(sp.getPopUpSaveBtn());
			ca.eleToBeClickable();
		}
		System.out.println("Template for material data sheet created");
	}

	@When("user navigates to canvas tab")
	public void userNavigatesToCanvasTab() throws Throwable {

		Commonactions.isElementPresent(hp.getUser_settingsBtn1());
		ca.click(hp.getUser_settingsBtn1()); 

		System.out.println("Setup tab clicked successfully");

		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Canvas Templates");
		ca.eleToBeClickable();
		// ca.click(spec.getTemplateTab());
		//  Commonactions.navigateToTab(spec.getSpecificationTab(),spec.getTemplateTab(),lp.getRightArrowBtn());
		//  ca.eleToBeClickable();
		ca.click(spec.getCanvasTab());
		jsWaitForPageLoad();
	}

	@And("user creates the canvas template {string},{string}")
	public void userCreatesTheCanvasTemplate(String a, String b) throws Throwable {
		Actions actions = new Actions(driver);
		ca.eleToBeClickable();
		String[] template, type;
		ca.eleToBeClickable();
		template = a.split(",");
		type = b.split(",");
		for (int i = 0; i < template.length; i++) {
			Thread.sleep(3500);
			ca.eleToBeClickable();
			ca.click(spec.getCanvasActionBtn());
			ca.eleToBeClickable();
			ca.insertText(spec.getCanvasInputBx(),template[i]);
			Thread.sleep(2500);
			actions.sendKeys(Keys.TAB).build().perform();
			actions.sendKeys(Keys.TAB).build().perform();
			ca.eleToBeClickable();
			ca.insertText(spec.getCanvasTypeBx(),type[i]);
			Thread.sleep(1500);
			actions.sendKeys(Keys.ARROW_DOWN).build().perform();
			actions.sendKeys(Keys.ENTER).build().perform();
			ca.eleToBeClickable();
			ca.click(sp.getPopUpSaveBtn());
			Thread.sleep(3000);
			WebElement canvasTemplate = driver.findElement(By.xpath("(//a[@class='browse' or text()='" + template[i] + "']//following::td[@data-csi-heading='Active::0'])[1]"));
			ca.eleToBeClickable();
			try{
				ca.eleToBeClickable();
				//ca.jsScrollPageDown(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));


				for(int j = 1; j <=20; j++ ){
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Canvas')]//span[text()='+']/parent::div")));


					if(canvasTemplate.isDisplayed()){

						ca.click(driver.findElement(By.xpath("//div[contains(@class,'Canvas')]//span[text()='+']/parent::div")));
						ca.click(driver.findElement(By.xpath("//div[contains(@class,'Canvas')]//span[text()='+']/parent::div")));
						ca.click(canvasTemplate);
						ca.eleToBeClickable();
						break;
					}
				}
			}catch (Exception exception) {
				// TODO: handle exception
			}

		}
	}

	@Then("verify the description of canvas template screen message {string}")
	public void verifyTheDescriptionOfCanvasTemplateScreenMessage(String a) throws Throwable {
		WebElement canvasTem = driver.findElement(By.xpath("//a[@class='browse' and text()='" + a + "']"));
		waitForElementClickable(canvasTem);
		ca.click(canvasTem);
		jsWaitForPageLoad();
		WebElement messageEle = driver.findElement(By.xpath("//div[text()='Get Started with Canvas']"));
		String WelcomeMegAct = messageEle.getText();
		System.out.println(WelcomeMegAct);
		String WelcomeMsgExp = "Get Started with Canvas";
		org.testng.Assert.assertNotNull(WelcomeMegAct);
	}


	@Then("user creates print design data {string},{string},{string},{string},{string}")
	public void userCreatesPrintDesignData(String a, String b, String c, String d, String e) throws Throwable {
		String[] printName,PrintType,NoOfPos,RepeatHeight,RepeatWidth;
		Actions actions = new Actions(driver);
		ca.eleToBeClickable();
		printName = a.split(",");
		PrintType = b.split(",");
		NoOfPos = c.split(",");
		RepeatHeight = d.split(",");
		RepeatWidth = e.split(",");
		for (int i = 0; i < PrintType.length; i++) {
			ca.eleToBeClickable();
			ca.click(shp.getPrintDesignActionBtn());
			ca.eleToBeClickable();
			ca.insertText(shp.getPrintDesignInputBx(),printName[i].trim());
			ca.eleToBeClickable();
			ca.insertText(shp.getPDTypeArrowBtn(),PrintType[i]);
			ca.eleToBeClickable();
			ca.insertText(shp.getPDRepeatHeight(),RepeatHeight[i]);
			ca.eleToBeClickable();
			ca.insertText(shp.getPDRepeatWidth(),RepeatWidth[i]);
			ca.eleToBeClickable();
			ca.insertText(shp.getPDPositionInputBx(),NoOfPos[i]);
			ca.eleToBeClickable();
			ca.click(sp.getPopUpSaveBtn());
			Thread.sleep(4000);
		}
	}

	@And("user creates the new print color {string},{string},{string},{string}")
	public void userCreatesTheNewPrintColor(String a,String b, String c,String d) throws Throwable {
		/* String[] NewPDColor,printName;
        Actions actions = new Actions(driver);
        NewPDColor = a.split(",");
        printName = b.split(",");
        for (int i = 0; i < printName.length; i++) {
		 */
		Actions actions = new Actions(driver);
		ca.eleToBeClickable();
		driver.findElement(By.xpath("//a[@class='browse' and text()='" + b + "']")).click();
		jsWaitForPageLoad();
		Thread.sleep(5000);
		jsScrollPageDown(shp.getPDNewColor());
		Thread.sleep(3000);
		actions.moveToElement(shp.getPDNewColor()).click(shp.getPDNewColor()).build().perform();
		Thread.sleep(2000);
		jsScrollPageDown(spec.getRF_InputText());
		Thread.sleep(2500);
		ca.insertText(spec.getRF_InputText(),a);
		Thread.sleep(3000);
		actions.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		//  ca.insertText(spec.getRF_InputText(),d);
		//  Thread.sleep(3000);
		//actions.sendKeys(Keys.ENTER).build().perform();
		//driver.navigate().refresh();
		jsWaitForPageLoad();
		jsScrollPageDown(shp.getPDNewColor());

		ca.eleToBeClickable();
		ca.click(shp.getPDNewColor());
		ca.eleToBeClickable();
		//jsScrollPageDown(spec.getRF_InputText());
		ca.insertText(spec.getRF_InputText(),c);
		Thread.sleep(3000);
		actions.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		//ca.insertText(spec.getRF_InputText(),"PDC 10");
		//Thread.sleep(3000);
	}
	@Then("user navigates to position tab and create data {string},{string}")
	public void userNavigatesToPositionTabAndCreateData(String a, String b) throws Throwable {
		jsScrollPageUp(shp.getPDPositionTab());
		ca.click(shp.getPDPositionTab());
		jsWaitForPageLoad();
		String[] PositionName;
		Actions actions = new Actions(driver);
		PositionName = a.split(",");
		for (int i = 0; i < PositionName.length; i++) {
			if (i == 0) {
				WebElement pos = driver.findElement(By.xpath("(//td[@data-csi-act='PositionNumber::0'])[1]"));
				pos.click();
				Thread.sleep(2000);
				actions.sendKeys(Keys.NUMPAD1).build().perform();
				ca.eleToBeClickable();
				Thread.sleep(3000);
				actions.sendKeys(Keys.TAB).build().perform();
				Thread.sleep(3000);
				ca.insertText(spec.getRF_InputText(), PositionName[i]);
				Thread.sleep(3000);
				actions.sendKeys(Keys.TAB).build().perform();
				Thread.sleep(3000);
				actions.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(3000);
				actions.sendKeys(Keys.ARROW_UP).build().perform();
				Thread.sleep(3000);
				actions.sendKeys(Keys.ENTER).build().perform();
				ca.eleToBeClickable();
				ca.click(shp.getPDPositionTab());
			} else {
				System.out.println("Position values are not created");
			}
			if (i == 1) {
				WebElement pos = driver.findElement(By.xpath("(//td[@data-csi-act='PositionNumber::0'])[2]"));
				pos.click();
				Thread.sleep(2000);
				actions.sendKeys(Keys.NUMPAD2).build().perform();
				ca.eleToBeClickable();
				Thread.sleep(3000);
				actions.sendKeys(Keys.TAB).build().perform();
				Thread.sleep(3000);
				ca.insertText(spec.getRF_InputText(), PositionName[i]);
				Thread.sleep(3000);
				actions.sendKeys(Keys.TAB).build().perform();
				Thread.sleep(3000);
				actions.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(3000);
				actions.sendKeys(Keys.ARROW_UP).build().perform();
				Thread.sleep(3000);
				actions.sendKeys(Keys.ENTER).build().perform();
				ca.eleToBeClickable();
				ca.click(shp.getPDPositionTab());
			} else {
				System.out.println("Position values are not created");
			}
			if (i == 2) {
				WebElement pos = driver.findElement(By.xpath("(//td[@data-csi-act='PositionNumber::0'])[3]"));
				pos.click();
				Thread.sleep(2000);
				actions.sendKeys(Keys.NUMPAD3).build().perform();
				ca.eleToBeClickable();
				Thread.sleep(3000);
				actions.sendKeys(Keys.TAB).build().perform();
				Thread.sleep(3000);
				ca.insertText(spec.getRF_InputText(), PositionName[i]);
				Thread.sleep(3000);
				actions.sendKeys(Keys.TAB).build().perform();
				Thread.sleep(3000);
				actions.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(3000);
				actions.sendKeys(Keys.ARROW_UP).build().perform();
				Thread.sleep(3000);
				actions.sendKeys(Keys.ENTER).build().perform();
				ca.eleToBeClickable();
				ca.click(shp.getPDPositionTab());
			} else {
				System.out.println("Position values are not created");
			}
		}
	}


	@When("user navigates to print design tab")
	public void userNavigatesToPrintDesignTab() throws Throwable {
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getUser_settingsBtn1());
		ca.click(hp.getUser_settingsBtn1()); 

		System.out.println("Setup tab clicked successfully");

		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Print Designs");
		ca.eleToBeClickable();
		ca.click(shp.getPrintDesignTab());
		jsWaitForPageLoad();
	}


	@When("user navigates to tab")
	public void userNavigatesToLibrariesTab() throws Throwable {
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getUser_settingsBtn1());
		ca.click(hp.getUser_settingsBtn1()); 

		System.out.println("Setup tab clicked successfully");

		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Care Label Libraries");
		ca.eleToBeClickable();
		ca.click(shp.getCareLabelLibrariesTab());
		jsWaitForPageLoad();

	}

	@Then("user creates the data for the libraries {string}")
	public void userCreatesTheDataForTheLibraries(String a) throws Throwable {
		Actions actions = new Actions(driver);
		Commonactions.isElementPresent(shp.getCareLabelLibrariesActionBtn());
		ca.click(shp.getCareLabelLibrariesActionBtn());
		ca.eleToBeClickable();
		ca.insertText(spec.getRF_InputText(),a);
	}

	@And("user creates the data for New specification library {string}")
	public void userCreatesTheDataForNewSpecificationLibrary(String a) throws Throwable {
		Actions actions = new Actions(driver);
		ca.eleToBeClickable();
		ca.click(shp.getLibrariesActionBtn());
		ca.eleToBeClickable();
		actions.sendKeys(Keys.ARROW_DOWN).build().perform();
		actions.sendKeys(Keys.ENTER).build().perform();
		ca.eleToBeClickable();
		ca.insertText(spec.getRF_InputText(),a);
	}



	@Then("user creates the data for New Material library {string}")
	public void userCreatesTheDataForNewMaterialLibrary(String a) throws Throwable {

		Commonactions.isElementPresent(hp.getMaterialBtn());
		ca.click(hp.getMaterialBtn());
		Commonactions.isElementPresent(shp.getMaterialLabelLibrariesTab());
		ca.click(shp.getMaterialLabelLibrariesTab());
		// Commonactions.navigateToTab(spec.getSpecificationTab(),shp.getMaterialLabelLibrariesTab(),lp.getRightArrowBtn());
		//  Actions actions = new Actions(driver);
		jsWaitForPageLoad();
		Commonactions.isElementPresent(lp.getMaterialLabelLibrariesAction());
		lp.getMaterialLabelLibrariesAction().click();
		ca.eleToBeClickable();
		ca.insertText(spec.getRF_InputText(),a);
	}

	@And("user creates the data for print design library {string}")
	public void userCreatesTheDataForPrintDesignLibrary(String a) throws Throwable {

		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getUser_settingsBtn1());
		ca.click(hp.getUser_settingsBtn1()); 

		System.out.println("Setup tab clicked successfully");

		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Print Design Libraries");
		ca.eleToBeClickable();
		ca.click(shp.getPrintLabelLibrariesTab());
		//  Commonactions.navigateToTab(spec.getSpecificationTab(),shp.getPrintLabelLibrariesTab(),lp.getRightArrowBtn());
		jsWaitForPageLoad();
		Actions actions = new Actions(driver);
		ca.eleToBeClickable();
		ca.click(shp.getPrintLabelLibrariesAction());
		ca.eleToBeClickable();
		ca.insertText(spec.getRF_InputText(),a);
	}

	@Then("user creates the data for New size library {string}")
	public void userCreatesTheDataForNewSizeLibrary(String a) throws Throwable {




		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Size Label Libraries");
		ca.eleToBeClickable();
		ca.click(shp.getSizeLabelLibrariesTab());
		//   Commonactions.navigateToTab(spec.getSpecificationTab(),shp.getSizeLabelLibrariesTab(),lp.getRightArrowBtn());
		jsWaitForPageLoad();
		Actions actions = new Actions(driver);
		Commonactions.isElementPresent(lp.getSizeLabelLibrariesAction());
		ca.click(lp.getSizeLabelLibrariesAction());
		ca.insertText(spec.getRF_InputText(),a);
		Commonactions.isElementPresent(shp.getSizeLabelLibrariesTab());
		ca.click(shp.getSizeLabelLibrariesTab());
	}

	@And("create a canvas and select the rectangle box")
	public void createACanvasAndSelectTheRectangleBox() throws Throwable {
		ca.jsScrollPageDown(shp.getNewCanvasActionBtn());
		waitForElementClickable(shp.getNewCanvasActionBtn());
		ca.click(shp.getNewCanvasActionBtn());
		jsWaitForPageLoad();

	}

	@When("user navigates to SizeCanvas tab")
	public void userNavigatesToSizeCanvasTab() throws Throwable {
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getUser_settingsBtn1());
		ca.click(hp.getUser_settingsBtn1()); 

		System.out.println("Setup tab clicked successfully");

		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Size Chart Templates");
		ca.eleToBeClickable();
		// Commonactions.navigateToTab(spec.getSpecificationTab(),spec.getTemplateTab(),lp.getRightArrowBtn());
		// ca.eleToBeClickable();
		ca.click(sk.getSizeChartCanvasTab());
		jsWaitForPageLoad();
	}

	@Then("user creates the sizeChart canvas {string}")
	public void userCreatesTheSizeChartCanvas(String a) throws Throwable {
		String[] SizeChartName;
		Actions actions = new Actions(driver);
		SizeChartName = a.split(",");
		for (int i = 0; i <SizeChartName.length ; i++) {
			waitForElementClickable(sk.getSizeChartCanvasActionBtn());
			ca.click(sk.getSizeChartCanvasActionBtn());
			Thread.sleep(1500);
			waitForElementClickable(sk.getSizeChartInputBx());
			ca.insertText(sk.getSizeChartInputBx(),SizeChartName[i]);
			ca.eleToBeClickable();
			ca.click(sp.getPopUpSaveBtn());
			Thread.sleep(2500);



			WebElement datasheet = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + SizeChartName[i] + "']//following::td[@data-csi-heading='SizeRange:Child:CurrentRevision:0'])[1]"));
			Thread.sleep(2500);
			try{
				ca.eleToBeClickable();
				//ca.jsScrollPageDown(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));


				for(int j = 1; j <=50; j++ ){
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Size')]//span[text()='+']/parent::div")));
					if(datasheet.isDisplayed()){

						ca.click(driver.findElement(By.xpath("//div[contains(@class,'Size')]//span[text()='+']/parent::div")));
						ca.click(driver.findElement(By.xpath("//div[contains(@class,'Size')]//span[text()='+']/parent::div")));
						waitForElementClickable(datasheet);
						actions.moveToElement(datasheet).click(datasheet).build().perform();
						ca.eleToBeClickable();
						break;
					}
				}
			}catch (Exception exception) {

				for(int j = 1; j <=50; j++ ){
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Size')]//span[text()='-']/parent::div")));
					if(datasheet.isDisplayed()){

						ca.click(driver.findElement(By.xpath("//div[contains(@class,'Size')]//span[text()='-']/parent::div")));
						ca.click(driver.findElement(By.xpath("//div[contains(@class,'Size')]//span[text()='-']/parent::div")));
						waitForElementClickable(datasheet);
						actions.moveToElement(datasheet).click(datasheet).build().perform();
						ca.eleToBeClickable();
						break;
					}}
				// TODO: handle exception
			}

			Thread.sleep(3500);
			actions.sendKeys(Keys.ARROW_DOWN).build().perform();
			actions.sendKeys(Keys.ARROW_DOWN).build().perform();
			actions.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2500);

			/* WebElement PG = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + SizeChartName[i] + "']/parent::td//following-sibling::td[@data-csi-heading='Group:Child:CurrentRevision:0'])[1]"));
            Thread.sleep(2500);
            try{
            	ca.eleToBeClickable();
            	//ca.jsScrollPageDown(driver.findElement(By.xpath("//div[contains(@class,'Product')]//span[text()='+']/parent::div")));


                    for(int j = 1; j <=50; j++ ){
                        ca.click(driver.findElement(By.xpath("//div[contains(@class,'Size')]//span[text()='-']/parent::div")));
                    if(PG.isDisplayed()){

                        ca.click(driver.findElement(By.xpath("//div[contains(@class,'Size')]//span[text()='-']/parent::div")));
                        ca.click(driver.findElement(By.xpath("//div[contains(@class,'Size')]//span[text()='-']/parent::div")));

                    ca.eleToBeClickable();
                    break;
                    }
                    }
                }catch (Exception exception) {
                    // TODO: handle exception
                }
            waitForElementClickable(PG);
            ca.click(PG);
            Thread.sleep(2500);
            actions.sendKeys(Keys.ARROW_DOWN).build().perform();
            actions.sendKeys(Keys.ARROW_DOWN).build().perform();
            actions.sendKeys(Keys.ENTER).build().perform();*/

		}
		System.out.println("Created the sizeChart template successfully");
	}

	@And("user creates the dimension inside the canvas {string}")
	public void userCreatesTheDimensionInsideTheCanvas(String a) throws Throwable {
		Actions actions = new Actions(driver);
		WebElement sizeChartName = driver.findElement(By.xpath("//a[@class='browse' and text()='" + a + "']"));
		waitForElementClickable(sizeChartName);
		sizeChartName.click();
		Commonactions.jsWaitForPageLoad();
		ca.eleToBeClickable();
		//    driver.navigate().refresh();
		//    Commonactions.jsWaitForPageLoad();
		//   WebElement size = driver.findElement(By.xpath("(//td[@data-csi-heading='BaseSize::0'])[1]"));
		//   Commonactions.isElementPresent(size);
		jsScrollPageDown(sk.getNewDimSCBx());
		waitForElementClickable(sk.getNewDimSCBx());
		Thread.sleep(3500);
		ca.click(sk.getNewDimSCBx());
		waitForElementClickable(sk.getNewFromDimActnBtn());
		Thread.sleep(3500);
		ca.click(sk.getNewFromDimActnBtn());
		Commonactions.isElementPresent(sk.getAllDimBtn());
		ca.click(sk.getAllDimBtn());
		ca.eleToBeClickable();
		ca.click(sp.getPopUpSaveBtn());
	}

	@Then("user enters the values in the dimensions {string}")
	public void userEntersTheValuesInTheDimensions(String a) throws InterruptedException {
		/* String[] dim;
        Actions actions = new Actions(driver);
        dim = a.split(",");
        for (int i = 0; i <dim.length ; i++) {
            WebElement dimension = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + a + "'][1]//following::td[@data-csi-act='Increments::0{SizeChartDimensionSummaryMatrix}'])[1]"));
            waitForElementClickable(dimension);
            dimension.click();
            Thread.sleep(1500);
            actions.sendKeys(Keys.NUMPAD3).build().perform();
            actions.sendKeys(Keys.TAB).build().perform();
            actions.sendKeys(Keys.NUMPAD5).build().perform();
            actions.sendKeys(Keys.TAB).build().perform();
            actions.sendKeys(Keys.NUMPAD6).build().perform();
            actions.sendKeys(Keys.TAB).build().perform();
            actions.sendKeys(Keys.NUMPAD4).build().perform();
            actions.sendKeys(Keys.TAB).build().perform();
            actions.sendKeys(Keys.NUMPAD7).build().perform();
            actions.sendKeys(Keys.TAB).build().perform();
            actions.sendKeys(Keys.NUMPAD8).build().perform();
            Thread.sleep(3500);
        }*/
		/*
        Thread.sleep(3500);
        Commonactions.isElementPresent(sk.getCopyToMultiple());
        ca.activeElement();
        ca.click(sk.getCopyToMultiple());

        Commonactions.isElementPresent(sk.getToggleSelection());
        sk.getToggleSelection().click();
        Commonactions.isElementPresent(sp.getPopUpSaveBtn());
        ca.click(sp.getPopUpSaveBtn());
		 */
	}

	@When("user navigates to template tab")
	public void userNavigatesToTemplateTab() throws Throwable {

		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getUser_settingsBtn1());
		ca.click(hp.getUser_settingsBtn1()); 

		System.out.println("Setup tab clicked successfully");

		Commonactions.isElementPresent(hp.getData_Spec());
		ca.click(hp.getData_Spec());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Data Package Templates");
		ca.eleToBeClickable();
		ca.click(spec.getTemplateTab());
		//Commonactions.navigateToTab(spec.getSpecificationTab(),spec.getTemplateTab(),lp.getRightArrowBtn());
	}



	@Then("user creates a manage view for the page {string}")
	public void userCreatesAManageViewForThePage(String arg0) throws Throwable {
		String[] a = arg0.split(",");
		Actions actions = new Actions(driver);
		ca.eleToBeClickable();
		ca.click(spec.getNewCanvasCVBtn());
		waitForElementClickable(spec.getManageViewCVBtn());
		ca.click(spec.getManageViewCVBtn());
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
		Commonactions.isElementPresent(driver.findElement(By.xpath("(//select[@class='csiPreferenceSelect '])[2]/option[text()='Active']")));
		ca.click(driver.findElement(By.xpath("(//select[@class='csiPreferenceSelect '])[2]/option[text()='Active']")));
		Commonactions.isElementPresent(s.getUPBtn());

		for (int i = 0; i < 4; i++) {

			ca.click(s.getUPBtn());
		}
		ca.jsScrollPageDown(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
	}

	@Then("user creates the data for the color libraries {string}")
	public void userCreatesTheDataForTheColorLibraries(String a) throws Throwable {
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Color Specification Libraries");
		ca.eleToBeClickable();
		ca.click(shp.getColorLabelLibrariesTab());
		Commonactions.isElementPresent(shp.getColorLabelLibrariesAction());
		ca.click(shp.getColorLabelLibrariesAction());
		ca.eleToBeClickable();
		ca.insertText(spec.getRF_InputText(),a);
	}
}




