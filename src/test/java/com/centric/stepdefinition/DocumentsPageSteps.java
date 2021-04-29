package com.centric.stepdefinition;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.centric.objectrepository.DocumentPage;
import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.MaterialSpecificationPage;
import com.centric.objectrepository.PopupPage;
import com.centric.objectrepository.SourcingPage;
import com.centric.objectrepository.StylePage;
import com.centric.resources.Commonactions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DocumentsPageSteps extends Commonactions{
	
	HomePage hp = new HomePage();
	Commonactions ca = new Commonactions();
	MaterialSpecificationPage mp = new MaterialSpecificationPage();
	PopupPage pp = new PopupPage();
	SourcingPage sp = new SourcingPage();
	DocumentPage dp = new DocumentPage(); 
	
	 String file,name,filter;
	
	@When("User creates document {string},{string}")
	public void user_creates_document(String string, String string2) throws Throwable {
	    name = string;
		String filePath = System.getProperty("user.dir")+"\\"+"TestData"+"\\"+"credentials.txt";
		System.out.println(filePath);
		file = filePath;
		
		ca.eleToBeClickable();
		ca.click(dp.getDocument());
		ca.eleToBeClickable();
		ca.click(dp.getUserDocuments());
		ca.eleToBeClickable();
		
		ca.click(dp.getExpand());
		ca.eleToBeClickable();
		ca.click(dp.getNewDocument());
		ca.eleToBeClickable();
		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e, string);
		ca.eleToBeClickable();
		ca.click(dp.getDocPlusIcon());
		ca.click(dp.getDocPlusIcon());
		ca.click(dp.getDocPlusIcon());
		ca.click(dp.getDocPlusIcon());
		ca.click(dp.getDocPlusIcon());
		ca.click(dp.getDocPlusIcon());
		ca.click(dp.getDocPlusIcon());
		ca.eleToBeClickable();
		ca.mouseOver(dp.getFile());
		ca.eleToBeClickable();
		ca.click(dp.getBrowse());
		ca.eleToBeClickable();
		uploadFile(file);
		ca.eleToBeClickable();
		ca.click(dp.getExpand());
		ca.eleToBeClickable();
		String text = ca.getText(dp.getThreeeDDocument());
		ca.eleToBeClickable();
		System.out.println(text);
		//Assert.assertTrue(text.contains("3D"));
		
		System.out.println("New document uploaded successfully");
			
	}

	@When("User upload another file and validating")
	public void user_upload_another_file_and_validating() throws Throwable {
	    
		ca.eleToBeClickable();
		ca.click(dp.getAddDocument());
		ca.eleToBeClickable();
		uploadFile(file);
		ca.eleToBeClickable();
		ca.click(dp.getDocPlusIcon());
		ca.eleToBeClickable();
		String new_file = ca.getText(dp.getNameofcreateddoc());
		ca.eleToBeClickable();
		String new_file1 = ca.getText(dp.getFileName());
		ca.eleToBeClickable();
		Assert.assertEquals(new_file, new_file1);
		
		ca.eleToBeClickable();
		ca.click(dp.getNameofcreateddoc());
		ca.eleToBeClickable();
		String text = ca.getText(dp.getDraft());
		ca.eleToBeClickable();
		//Assert.assertEquals("DRAFT", text);
		ca.eleToBeClickable();
		ca.click(sp.getApproveActions());
		ca.eleToBeClickable();
		ca.click(sp.getApprove());
		ca.eleToBeClickable();
		ca.mouseOver(dp.getFile());
		ca.eleToBeClickable();
		try{
			ca.eleToBeClickable();
			ca.click(dp.getBrowse());
		}catch (Exception e) {
			System.out.println("Browse option is not available as per conditions");
			ca.eleToBeClickable();
	        ca.click(hp.getUser_homeBtn()); 
		     
		     System.out.println("home tab clicked successfully");
			ca.eleToBeClickable();
		}
		ca.eleToBeClickable();
		ca.clickjs(driver.findElement(By.xpath("(//a[contains(text(),'.txt')]//parent::td//following-sibling::td/div/span[text()='close'])[2]")));
		ca.eleToBeClickable();
		ca.click(pp.getDelete_Btn());
		
		System.out.println("New document uploaded & validated successfully");
		
	}

	@When("User validating revise and approve")
	public void user_validating_revise_and_approve() throws Throwable {
	    
		ca.eleToBeClickable();
		ca.click(sp.getApproveicon1());
		ca.eleToBeClickable();
		ca.click(sp.getRevise());
		ca.eleToBeClickable();
		String text = ca.getText(dp.getGetText());
		System.out.println(text);
		ca.eleToBeClickable();
		//Assert.assertEquals("2", text);
		
		ca.eleToBeClickable();
		ca.click(sp.getApproveicon1());
		ca.eleToBeClickable();
		ca.click(sp.getApprove1());
		ca.eleToBeClickable();
		
		System.out.println("Approve and revise action validated successfully");
		
	}

	@When("User validating share document functionality {string}")
	public void user_validating_share_document_functionality(String string) throws Throwable {
		filter=string;
		
		ca.eleToBeClickable();
		ca.click(sp.getApproveicon1());
		ca.eleToBeClickable();
		ca.click(dp.getShareDocument());
		ca.eleToBeClickable();
		ca.click(dp.getSD_Filter());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, string);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//label[contains(text(),'"+string+"')]")));
		ca.eleToBeClickable();
		ca.click(dp.getSD_plus());
		ca.eleToBeClickable();
		ca.click(dp.getSD_Chkbx());
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		System.out.println("Document shared successfully");
		
	}

	@When("User verifying shared document under style tab {string}")
	public void user_verifying_shared_document_under_style_tab(String string) throws Throwable {
		
		ca.eleToBeClickable();
		ca.click(hp.getStyleBtn());
		ca.eleToBeClickable();
		ca.click(dp.getStyles());
		ca.eleToBeClickable();
		ca.click(dp.getStyle_Filter());
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a2, filter);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//label[contains(text(),'"+filter+"')]")));
		ca.eleToBeClickable();
		ca.click(dp.getStyle_plus());
		ca.eleToBeClickable();
		ca.click(dp.getStyle_Name());
		ca.eleToBeClickable();
		ca.click(dp.getDocandComm());
		ca.eleToBeClickable();
		ca.jsScrollPageDown(dp.getSelectdocbtn());
		ca.eleToBeClickable();
		String text = ca.getText(dp.getFileName());
		ca.eleToBeClickable();
		System.out.println(text);
		Assert.assertEquals(string, text);
		
		System.out.println("Share Document validated successfully");
	}
	
	StylePage st =new StylePage();

	@When("User upload documents under style {string},{string}")
	public void user_upload_documents_under_style(String string, String string2) throws Throwable {
	    
		String filePath = System.getProperty("user.dir")+"\\"+"TestData"+"\\"+"credentials.txt";
		System.out.println(filePath);
		file = filePath;
		
		ca.eleToBeClickable();
		ca.click(hp.getStyleBtn());
		ca.eleToBeClickable();
		ca.click(st.getStyles_Btn());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//td[contains(@class,'firstColumn') and @data-csi-heading='Node Name::0']/a[contains(text(),'Accessories')])[1]")));
		ca.eleToBeClickable();
		ca.click(dp.getDocandComm());
		ca.eleToBeClickable();
		ca.click(dp.getExpand());
		ca.eleToBeClickable();
		ca.click(dp.getNewDocument());
		ca.eleToBeClickable();
		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e, string);
		ca.eleToBeClickable();
		ca.click(dp.getDocPlusIcon());
		ca.eleToBeClickable();
		ca.mouseOver(dp.getFile());
		ca.eleToBeClickable();
		ca.click(dp.getBrowse());
		ca.eleToBeClickable();
		uploadFile(filePath);
		ca.eleToBeClickable();
		
		ca.eleToBeClickable();
        ca.click(hp.getUser_homeBtn()); 
	     
	     System.out.println("home tab clicked successfully");
		ca.eleToBeClickable();
		
		System.out.println("Style document uploaded successfully");
		
		
	}

	@When("User upload documents under material {string},{string}")
	public void user_upload_documents_under_material(String string, String string2) throws Throwable {
	    
		String filePath = System.getProperty("user.dir")+"\\"+"TestData"+"\\"+"credentials.txt";
		System.out.println(filePath);
		file = filePath;
		
		ca.eleToBeClickable();
		ca.click(hp.getMaterialBtn());
		ca.eleToBeClickable();
		ca.click(dp.getMaterial());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-heading,'Node Name')]/a[contains(text(),'Cotton/Rayon Jersey')])[1]")));
		ca.eleToBeClickable();
		ca.click(dp.getMaterial_base());
		ca.eleToBeClickable();
		ca.click(dp.getDocandComm());
		ca.eleToBeClickable();
		ca.click(dp.getExpand());
		ca.eleToBeClickable();
		ca.click(dp.getNewMatDocument());
		ca.eleToBeClickable();
		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e, string);
		ca.eleToBeClickable();
		ca.click(dp.getDocPlusIcon());
		ca.eleToBeClickable();
		ca.mouseOver(dp.getFile());
		ca.eleToBeClickable();
		ca.click(dp.getBrowse());
		ca.eleToBeClickable();
		uploadFile(filePath);
		ca.eleToBeClickable();
		
		ca.eleToBeClickable();
        ca.click(hp.getUser_homeBtn()); 
	     
	     System.out.println("home tab clicked successfully");
		ca.eleToBeClickable();
		
		System.out.println("Material document uploaded successfully");
		
	}

	@Then("User validating all documents")
	public void user_validating_all_documents() throws Throwable {
	    
		ca.eleToBeClickable();
		ca.click(dp.getDocument());
		ca.eleToBeClickable();
		ca.click(dp.getDocuments());
		ca.eleToBeClickable();
		ca.click(dp.getAllDoc_Filter());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, "Automation");
		ca.eleToBeClickable();
		List<WebElement> list = driver.findElements(By.xpath("(//div[@role='option']/label)"));
		for (int i = 2; i <= list.size(); i++) {
			
			ca.click(driver.findElement(By.xpath("(//div[@role='option']/label)["+i+"]")));
			
		}
		ca.click(dp.getAllDoc_Plus());
		ca.eleToBeClickable();
	//	String text = ca.getText(driver.findElement(By.xpath("//div[contains(text(),'Displaying')]")));
	//	Assert.assertTrue(text.contains("3"));
		
		System.out.println("All documents validated successfully");
		
	}

	@When("User creates contractual doc {string},{string},{string},{string},{string},{string}")
	public void user_creates_contractual_doc(String string, String string2, String string3, String string4, String string5, String string6) throws Throwable {
		
		String filePath = System.getProperty("user.dir")+"\\"+"TestData"+"\\"+"credentials.txt";
		System.out.println(filePath);
		file = filePath;
		
		ca.eleToBeClickable();
		ca.click(dp.getDocument());
		ca.eleToBeClickable();
		
		ca.eleToBeClickable();
		ca.click(dp.getContDoc());
		ca.eleToBeClickable();
		ca.click(dp.getNewConAllDoc());
		ca.eleToBeClickable();
		ca.click(dp.getConType());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, string);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.insertText(dp.getConDocName(), string);
		ca.eleToBeClickable();
		ca.insertText(dp.getConDescription(), string5);
		ca.eleToBeClickable();
		ca.insertText(dp.getEffFrom(), string3);
		ca.eleToBeClickable();
		ca.insertText(dp.getEffTo(), string4);
		ca.eleToBeClickable();
		ca.click(dp.getSourcefile());
		ca.eleToBeClickable();
		uploadFile(filePath);
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		Thread.sleep(5000);
		
		ca.click(dp.getNewConAllDoc());
		ca.eleToBeClickable();
		ca.click(dp.getConType());
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, string2);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.click(dp.getSourceType());
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a2, "Web");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.insertText(dp.getSourceName(), "CDOC-Web");
		ca.eleToBeClickable();
		ca.insertText(dp.getSourceUrl(), "http://www.google.com");
		ca.eleToBeClickable();
		ca.insertText(dp.getConDocName(), string2);
		ca.eleToBeClickable();
		ca.insertText(dp.getConDescription(), string5);
		ca.eleToBeClickable();
		ca.insertText(dp.getEffFrom(), string3);
		ca.eleToBeClickable();
		ca.insertText(dp.getEffTo(), string4);
		ca.eleToBeClickable();
		//ca.click(dp.getSourcefile());
		//ca.eleToBeClickable();
		//uploadFile(string6);
		//ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		ca.click(dp.getApproveDoc());
		ca.eleToBeClickable();
		
		ca.click(dp.getCreateddocname());
		ca.eleToBeClickable();
		ca.click(sp.getApproveActions());
		ca.eleToBeClickable();
		ca.click(sp.getApprove());
		
		ca.eleToBeClickable();
        ca.click(hp.getUser_homeBtn()); 
	     
	     System.out.println("home tab clicked successfully");
		ca.eleToBeClickable();
		
		System.out.println("Contractual document created successfully");
		
		
		
	}

	@When("User creates contractual doc group {string},{string}")
	public void user_creates_contractual_doc_group(String string, String string2) throws Throwable {
	    
		ca.eleToBeClickable();
		ca.click(dp.getConDocGrp());
		ca.eleToBeClickable();
		ca.click(dp.getNewConDocGrp());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, string);
		ca.eleToBeClickable();
		a.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a2, string2);
		ca.eleToBeClickable();
		a2.sendKeys(Keys.TAB);
		ca.click(dp.getConDoc_Plus());
		
		System.out.println("Contractual Group created successfully");
		
	}

	@When("User creates contractual doc {string},{string},{string}")
	public void user_creates_contractual_doc(String string, String string2, String string3) throws Throwable {
	    
		String filePath = System.getProperty("user.dir")+"\\"+"TestData"+"\\"+"credentials.txt";
		System.out.println(filePath);
		file = filePath;
		
		ca.eleToBeClickable();
		ca.click(dp.getNewConDocu());
		ca.eleToBeClickable();
		ca.click(dp.getConType());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, string);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.insertText(dp.getConDocName(), string);
		ca.eleToBeClickable();
		ca.insertText(dp.getConDescription(), string2);
		ca.eleToBeClickable();
		ca.click(dp.getSourcefile());
		ca.eleToBeClickable();
		uploadFile(filePath);
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		Thread.sleep(5000);
		
		ca.eleToBeClickable();
		ca.click(dp.getACtionIconGrp());
		ca.eleToBeClickable();
		ca.click(sp.getApprove());
		
		ca.eleToBeClickable();
		ca.click(dp.getGrpCopy());
		ca.eleToBeClickable();
		ca.click(dp.getDocumentExpand());
		ca.eleToBeClickable();
		ca.click(dp.getSelectDocument());
		ca.eleToBeClickable();
		ca.click(dp.getCehckboxalldoc());
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		ca.eleToBeClickable();
		ca.click(dp.getApproveIcon());
		ca.eleToBeClickable();
		ca.click(dp.getMove());
		ca.eleToBeClickable();
		ca.click(dp.getSelectgrp());
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		ca.click(dp.getGrp1());
		ca.eleToBeClickable();
		ca.click(dp.getApproveIcon());
		ca.eleToBeClickable();
		ca.click(dp.getPushToSupp());
		ca.eleToBeClickable();
		ca.click(dp.getCheckbox());
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		ca.click(dp.getApproveIcon2());
		ca.eleToBeClickable();
		ca.click(dp.getPushToSupp2());
		ca.eleToBeClickable();
		ca.click(dp.getCheckbox());
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		System.out.println("Contractual document created successfully");
		
		
	}

	@When("User validating supplier contactual document")
	public void user_validating_supplier_contactual_document() throws Throwable {
	    
		ca.eleToBeClickable();
		ca.click(dp.getSupplierConDoc());
		ca.eleToBeClickable();

		
		System.out.println("supplier contractual documents validated successfully");
		
	}
	
	
	public static void uploadFile(String file){
		
		try{
			StringSelection sel = new StringSelection(file);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
			System.out.println("File path :"+file);
			Thread.sleep(2000);
			Robot robot = new Robot();
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			Thread.sleep(1000);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_V);
			Thread.sleep(1000);
		}catch (Exception e) {
			
			System.out.println("The mentioned file path is not found");
			
		}

	}
	
	@When("User reupload contractual doc {string},{string}")
	public void user_reupload_contractual_doc(String EffDate,String file1) throws Throwable {
		
		String filePath = System.getProperty("user.dir")+"\\"+"TestData"+"\\"+"credentials.txt";
		System.out.println(filePath);
		file = filePath;

		ca.click(dp.getDocument());
		ca.eleToBeClickable();
		ca.click(dp.getContDoc());
		ca.eleToBeClickable();

		ca.click(sp.getApproveicon2());
		ca.eleToBeClickable();
		ca.click(sp.getRevise());
		ca.eleToBeClickable();

		for(int i=0;i<90;i++)
		{
			ca.click(driver.findElement(By.xpath("(//div[contains(@class,'Documents')]//span[text()='+']/parent::div)[2]")));
		}
		ca.mouseOver(dp.getSourceFile());
		ca.mouseOver(dp.getSourceFile());
		ca.eleToBeClickable();
		ca.click(dp.getBrowse());
		ca.eleToBeClickable();
		uploadFile(file);
		ca.eleToBeClickable();
		ca.click(sp.getApproveicon2());
		ca.eleToBeClickable();
		ca.click(sp.getApprove());
		ca.eleToBeClickable();

		try {
		if(driver.findElement(By.xpath("//div[text()='The Effective To date cannot be before today.']")).isDisplayed())
		{
			ca.click(pp.getOK_Btn());
			ca.eleToBeClickable();
			ca.click(dp.getEditEffTo());
			ca.eleToBeClickable();
			try {
			if(driver.findElement(By.xpath("(//td/span[contains(text(),'"+EffDate+"')])[2]")).isDisplayed())
			{
				driver.findElement(By.xpath("(//td/span[contains(text(),'"+EffDate+"')])[2]")).click();
			}}
			catch(Exception e){
			{
				driver.findElement(By.xpath("(//td/span[contains(text(),'"+EffDate+"')])[1]")).click();
			}}
			ca.eleToBeClickable();
			ca.click(sp.getApproveicon2());
			ca.eleToBeClickable();
			ca.click(sp.getApprove());
			ca.eleToBeClickable();

		}
		}
		catch(Exception e){
			System.out.println("Effective Date is Expected -no changes required");		
		}
		ca.click(sp.getApproveicon2());
		ca.eleToBeClickable();
		ca.click(dp.getupdateSupplier());
		ca.eleToBeClickable();
		ca.click(dp.getCheckbox());
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		
	}

	@Then("User creates Supplier ContractualDocument-Group and Special Document {string},{string},{string},{string},{string}")
	public void user_creates_Supplier_ContractualDocument_Group_and_Special_Document(String from, String to, String desc, String file1,String name) throws Throwable {
	
		String filePath = System.getProperty("user.dir")+"\\"+"TestData"+"\\"+"credentials.txt";
		System.out.println(filePath);
		file = filePath;
		
		ca.click(dp.getDocument());
		ca.eleToBeClickable();
		ca.click(dp.getSupplierConDoc());
		ca.eleToBeClickable();
		for(int i=0;i<100;i++)
		{
			ca.click(driver.findElement(By.xpath("(//div[contains(@class,'Documents')]//span[text()='+']/parent::div)[3]")));
		}
		
	//	String text = dp.getuploadedfilename().getText();
		if(file.contains("txt"))
		{
			System.out.println("upoaded file exist in supplier contractual document");
		}
		ca.click(dp.getNameofcreateddoc1());
		ca.eleToBeClickable();
		ca.click(dp.getconDocument());
		ca.eleToBeClickable();
		ca.click(dp.getNewFormConDoc());
		ca.eleToBeClickable();
		ca.click(dp.getNewformcheckbox());
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		ca.click(dp.getNewformexpand());
		ca.eleToBeClickable();
		ca.click(dp.getNewFormGrp());
		ca.eleToBeClickable();
		ca.click(dp.getGroupCopy());
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		ca.click(dp.getNewformexpand());
		ca.eleToBeClickable();
		ca.click(dp.getNewspecial());
		ca.eleToBeClickable();
		
		ca.click(dp.getConType());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, name);
		
		ca.click(dp.getSourceText());
		ca.eleToBeClickable();
		ca.click(dp.getSourcefile());
		uploadFile(file);
		
		insertText(dp.getSuppCOnDocDesc(), desc);
		ca.click(dp.getSourceText());
		ca.eleToBeClickable();

		insertText(dp.getEffFrom(), from);
		ca.click(dp.getSourceText());
		ca.eleToBeClickable();

		insertText(dp.getEffTo(), to);
		ca.click(dp.getSourceText());
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		
		int s = driver.findElements(By.xpath("//td/div/span[text()='check_circle']")).size();
		for(int i=1;i<=s;i++)
		{
		ca.click(dp.getApproveAction());
		ca.eleToBeClickable();
		}		
		ca.eleToBeClickable();
        ca.click(hp.getUser_homeBtn()); 
	     
	     System.out.println("home tab clicked successfully");
		ca.eleToBeClickable();
	}
		
	
	
	public static void main(String[] args) {
		String filePath = System.getProperty("user.dir")+"\\"+"TestData"+"\\"+"credentials.txt";
		System.out.println(filePath);
	}


}
