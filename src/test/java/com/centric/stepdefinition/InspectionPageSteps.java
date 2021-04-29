package com.centric.stepdefinition;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
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
import org.openqa.selenium.support.ui.WebDriverWait;

import com.centric.objectrepository.BOMCreationPage;
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

public class InspectionPageSteps  extends Commonactions {

	HomePage hp = new HomePage();
	Commonactions ca = new Commonactions();
	MaterialSpecificationPage mp = new MaterialSpecificationPage();
	PopupPage pp = new PopupPage();
	SourcingPage sp = new SourcingPage();
	DocumentPage dp = new DocumentPage(); 
	StylePage st = new StylePage();
	InspectionPage in = new InspectionPage();
	UserManagementPage up=new UserManagementPage();
	StyleInspectionPage si = new StyleInspectionPage();
	SetupPageTK su = new SetupPageTK();
	ConfigurationPage co=new ConfigurationPage();
	BOMCreationPage bc = new BOMCreationPage();
	QualityPage  qp = new QualityPage();



	String file,name,filter;
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
	LocalDateTime now = LocalDateTime.now();  
	String date = dtf.format(now);

	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	Calendar c1 = Calendar.getInstance();
	

	@Then("User creates Enumeration {string}")
	public void user_creates_Enumeration(String Defectcategory) throws Throwable {

		String[] DefCaegory = Defectcategory.split(",");

		ca.click(hp.getUser_settingsBtn());
		ca.eleToBeClickable();
		ca.click(hp.getSystem_config());
		ca.eleToBeClickable();
		ca.click(co.getUser_config());
		ca.eleToBeClickable();
		ca.click(su.getUser_Enumerations());
		ca.eleToBeClickable();
		ca.click(su.getUser_EnumDropBox());
		ca.eleToBeClickable();

		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e1, "Defectcategory");
		ca.eleToBeClickable();
		ca.click(in.getDefectCategory());	
		ca.eleToBeClickable();
		e1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		Commonactions.isElementPresent(su.getUser_NewEnumValue());
		ca.click(su.getUser_NewEnumValue());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(su.getUser_NewEnumName());
		ca.insertText(su.getUser_NewEnumName(),DefCaegory[0]);
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		try
		{
			ca.click(in.getCancel());
			ca.eleToBeClickable();
			System.out.println("high value not allowed");
			ca.click(su.getUser_NewEnumValue());
			ca.eleToBeClickable();
			ca.insertText(su.getUser_NewEnumName(),"High1");
			ca.eleToBeClickable();
			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable();
		}
		catch(Exception e)
		{
			System.out.println("High created");
		}

		ca.click(su.getUser_NewEnumValue());
		ca.eleToBeClickable();
		ca.insertText(su.getUser_NewEnumName(),DefCaegory[1]);
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		ca.click(su.getUser_NewEnumValue());
		ca.eleToBeClickable();
		ca.insertText(su.getUser_NewEnumName(),DefCaegory[2]);
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
	}
	@And("update configuration for inspection")
	public void update_configuration_for_inspection() throws Throwable {

		ca.click(hp.getUser_settingsBtn());
		ca.eleToBeClickable();
		ca.click(hp.getUpdate_config());
		ca.eleToBeClickable();
		ca.click(su.getRunBtn());
		ca.eleToBeClickable();
		Thread.sleep(120000);
		try{driver.navigate().refresh();
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		ca.accept_Alert();}
		catch(Exception e){}

		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		try{driver.navigate().refresh();
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		ca.accept_Alert();}
		catch(Exception e){}
	}
	@Then("user creates Defects in Inspection {string}")
	public void user_creates_Defects_in_Inspection(String defects) throws Throwable {

		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		//Commonactions.isElementPresent(in.getPagecontentArrow());
		//in.getPagecontentArrow().click();
		Commonactions.isElementPresent(hp.getInspectionBtn());
		hp.getInspectionBtn().click();
		Commonactions.isElementPresent(in.getInspectionTab());
		in.getInspectionTab().click();
		Commonactions.isElementPresent(in.getInspectionSecGrpTab());
		in.getInspectionSecGrpTab().click();
		//	Commonactions.isElementPresent(sp.getSetup());
		//	sp.getSetup().click();
		String[] def = defects.split(",");
		Commonactions.isElementPresent(hp.getDatasetup());
		ca.click(hp.getDatasetup());
		Commonactions.isElementPresent(hp.getProductQuality());
		ca.click(hp.getProductQuality());

		Commonactions.isElementPresent(in.getDefects());
		in.getDefects().click();
		Commonactions.isElementPresent(in.getNewDefectBtn());
		in.getNewDefectBtn().click();
		ca.eleToBeClickable();



		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e, def[0]);
		ca.eleToBeClickable();
		e.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(in.getNewDefectBtn());
		in.getNewDefectBtn().click();
		ca.eleToBeClickable();

		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e1, def[1]);
		ca.eleToBeClickable();
		e1.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(in.getNewDefectBtn());
		in.getNewDefectBtn().click();
		ca.eleToBeClickable();


		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e2, def[2]);
		ca.eleToBeClickable();
		e2.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(in.getNewDefectBtn());
		in.getNewDefectBtn().click();
		ca.eleToBeClickable();


		WebElement e3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e3, def[3]);
		ca.eleToBeClickable();
		e3.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(in.getDefectCopy());		
		in.getDefectCopy().click();
		Commonactions.isElementPresent(sp.getSP_Delete());
		sp.getSP_Delete().click();
		Commonactions.isElementPresent(pp.getDelete_Btn());
		pp.getDelete_Btn().click();
		ca.eleToBeClickable();

		System.out.println("Defect types created, copied, deleted");

		String s[]= {"High","High","Medium","Low","High"};
		for(int i=1;i<=4;i++)
		{
			ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-act,'DefectCategory::0')])["+i+"]")));
			WebElement D = ca.activeElement();
			ca.eleToBeClickable();
			ca.insertText(D, s[i]);
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();
		}

		for(int i=0;i<30;i++)
		{
			ca.click(driver.findElement(By.xpath("//span[text()='Defects']//following::div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div")));
		}

		for(int i=1;i<5;i++)
		{
			ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-act,'Code')])["+i+"]")));
			WebElement C = ca.activeElement();
			ca.eleToBeClickable();
			C.sendKeys(Keys.DELETE);
			ca.eleToBeClickable();
			ca.insertText(C, "#123");
			ca.eleToBeClickable();
		}
	}
	@Then("user creates AccLimit in Inspection {string},{string}")
	public void user_creates_AccLimit_in_Inspection(String AccLimit,String SortOrder) throws Throwable {

		String[] Acclimit = AccLimit.split(",");
		String[] sort = SortOrder.split(",");
		ca.mouseOver(in.getAccLimit());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getAccLimit());
		in.getAccLimit().click();
		Commonactions.isElementPresent(in.getNewAccBtn());
		in.getNewAccBtn().click();
		Commonactions.isElementPresent(in.getAccLimitvalue());
		insertText(in.getAccLimitvalue(), Acclimit[0]);
		Commonactions.isElementPresent(in.getSortOrder());
		insertText(in.getSortOrder(), sort[0]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(in.getNewAccBtn());
		in.getNewAccBtn().click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getAccLimitvalue());
		insertText(in.getAccLimitvalue(), Acclimit[1]);
		Commonactions.isElementPresent(in.getSortOrder());
		insertText(in.getSortOrder(), sort[1]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(in.getNewAccBtn());
		in.getNewAccBtn().click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getAccLimitvalue());
		insertText(in.getAccLimitvalue(), Acclimit[2]);
		Commonactions.isElementPresent(in.getSortOrder());
		insertText(in.getSortOrder(), sort[2]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Acceptance limit created");

		Commonactions.isElementPresent(in.getEdit_Btn());
		in.getEdit_Btn().click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getAccLimitvalue());
		insertText(in.getAccLimitvalue(), Acclimit[2]+1);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Acceptance limit Edited and Deleted");


		Commonactions.isElementPresent(in.getDeleteAccLimit());
		in.getDeleteAccLimit().click();
		Commonactions.isElementPresent(pp.getDelete_Btn());
		pp.getDelete_Btn().click();

	}
	@Then("user creates TestSpecification and sampling in Inspection {string},{string}")
	public void user_creates_TestSpecification_and_sampling_in_Inspection(String TestSpecification, String Samplingvalue) throws Throwable {
		String[] specvalue = TestSpecification.split(",");
		String[] SapValue = Samplingvalue.split(",");

		Commonactions.isElementPresent(in.getSamplingplan());
		in.getSamplingplan().click();
		driver.navigate().refresh();
		ca.mouseOver(in.getSamplingplan());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getSamplingplan());
		in.getSamplingplan().click();
		Commonactions.isElementPresent(in.getNewSamplingBtn());
		in.getNewSamplingBtn().click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getSamplingPlanValue());
		insertText(in.getSamplingPlanValue(), SapValue[0]);
		Commonactions.isElementPresent(in.getAccLimitExpand());
		in.getAccLimitExpand().click();
		Commonactions.isElementPresent(in.getSelectAccLimit());
		in.getSelectAccLimit().click();
		Commonactions.isElementPresent(in.getSamplingPlanValue());
		ca.click(in.getSamplingPlanValue());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		in.getNewSamplingBtn().click();
		Commonactions.isElementPresent(in.getSamplingPlanValue());
		ca.eleToBeClickable();
		insertText(in.getSamplingPlanValue(), SapValue[1]);
		Commonactions.isElementPresent(in.getAccLimitExpand());
		in.getAccLimitExpand().click();
		Commonactions.isElementPresent(in.getSelectAccLimit());
		in.getSelectAccLimit().click();
		Commonactions.isElementPresent(in.getSelectAccLimit2());
		in.getSelectAccLimit2().click();
		Commonactions.isElementPresent(in.getSamplingPlanValue());
		in.getSamplingPlanValue().click();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Sampling Plan Created");

		Commonactions.isElementPresent(in.getSampligview());
		ca.click(in.getSampligview());
		Commonactions.isElementPresent(in.getSampligManageview());
		ca.click(in.getSampligManageview());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "sampling-copy");
		Commonactions.isElementPresent(in.getSamplingAccLimit());
		ca.click(in.getSamplingAccLimit());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getMultipleSampling());
		ca.click(in.getMultipleSampling());
		Commonactions.isElementPresent(in.getNewSamplingPaln());
		ca.click(in.getNewSamplingPaln());
		Commonactions.isElementPresent(in.getLotSize());
		ca.insertText(in.getLotSize(),"1200");
		Commonactions.isElementPresent(in.getCartonQty());
		ca.insertText(in.getCartonQty(),"1");
		Commonactions.isElementPresent(in.getSampleQty());
		ca.insertText(in.getSampleQty(),"1");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(in.getAccLimit1());
		ca.click(in.getAccLimit1());
		WebElement Ac1 = ca.activeElement();
		ca.eleToBeClickable();
		Ac1.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(Ac1, "5");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getAccLimit2());
		ca.click(in.getAccLimit2());
		WebElement Ac2 = ca.activeElement();
		ca.eleToBeClickable();
		Ac2.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(Ac2, "5");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getAccLimit1());
		ca.click(in.getAccLimit1());
		WebElement Ac3 = ca.activeElement();
		ca.eleToBeClickable();
		Ac3.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(Ac3, "5");
		ca.eleToBeClickable();

		ca.eleToBeClickable();
		ca.click(hp.getUser_homeBtn()); 
		ca.eleToBeClickable();



		Commonactions.isElementPresent(hp.getDatasetup());
		ca.click(hp.getDatasetup());
		Commonactions.isElementPresent(hp.getProductQuality());
		ca.click(hp.getProductQuality());

		ca.mouseOver(in.getTestSpecification());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getTestSpecification());
		in.getTestSpecification().click();
		Commonactions.isElementPresent(in.getNewTestSpec());
		in.getNewTestSpec().click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getTestSpecValue());
		insertText(in.getTestSpecValue(), specvalue[0]);
		Commonactions.isElementPresent(in.getLinkTypevalue());
		insertText(in.getLinkTypevalue(), specvalue[0]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();		
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		dp.getApproveAction().click();
		ca.eleToBeClickable();

		in.getNewTestSpec().click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getTestSpecValue());
		insertText(in.getTestSpecValue(), specvalue[1]);
		Commonactions.isElementPresent(in.getLinkTypevalue());
		insertText(in.getLinkTypevalue(), specvalue[1]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();	
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		dp.getApproveAction().click();
		ca.eleToBeClickable();

		in.getNewTestSpec().click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getTestSpecValue());
		insertText(in.getTestSpecValue(), specvalue[2]);
		Commonactions.isElementPresent(in.getLinkTypevalue());
		insertText(in.getLinkTypevalue(), specvalue[2]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();		
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		dp.getApproveAction().click();
		ca.eleToBeClickable();

		in.getNewTestSpec().click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getTestSpecValue());
		insertText(in.getTestSpecValue(), specvalue[3]);
		Commonactions.isElementPresent(in.getLinkTypevalue());
		insertText(in.getLinkTypevalue(), specvalue[3]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		dp.getApproveAction().click();
		ca.eleToBeClickable();

		in.getNewTestSpec().click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getTestSpecValue());
		insertText(in.getTestSpecValue(), specvalue[4]);
		Commonactions.isElementPresent(in.getLinkTypevalue());
		insertText(in.getLinkTypevalue(), specvalue[4]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();		
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		dp.getApproveAction().click();
		ca.eleToBeClickable();
		System.out.println("Test Specification Created");

		in.getCopyTestSpec().click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getTestSpecValue());
		insertText(in.getTestSpecValue(), specvalue[4]+" Copy");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		in.getEditTestSpec().click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getTestSpecValue());
		insertText(in.getTestSpecValue(), specvalue[4]+" Delete");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getDeleteTestSpec());
		in.getDeleteTestSpec().click();
		Commonactions.isElementPresent(pp.getDelete_Btn());
		pp.getDelete_Btn().click();
		System.out.println("Test Specification copied, Edited and deleted");

	}
	@Then("User creates ErrorType in Inspection {string}")
	public void user_creates_ErrorType_in_Inspection(String ErrorType) throws Throwable {

		String[] Error = ErrorType.split(",");
		ca.mouseOver(in.getErrorType());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getErrorType());
		in.getErrorType().click();
		Commonactions.isElementPresent(in.getNewErrorBtn());
		in.getNewErrorBtn().click();
		ca.eleToBeClickable();
		WebElement e4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e4, Error[0]);
		ca.eleToBeClickable();
		e4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		in.getFullinsChkbox().click();

		Commonactions.isElementPresent(in.getNewErrorBtn());
		in.getNewErrorBtn().click();
		ca.eleToBeClickable();
		WebElement e5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e5, Error[1]);
		ca.eleToBeClickable();
		e5.sendKeys(Keys.TAB);
		System.out.println("High Critical Error  Created");

		Commonactions.isElementPresent(in.getNewErrorBtn());
		in.getNewErrorBtn().click();
		ca.eleToBeClickable();
		WebElement e6 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e6, Error[2]);
		ca.eleToBeClickable();
		e6.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(in.getDeleteErrorBtn());
		in.getDeleteErrorBtn().click();
		Commonactions.isElementPresent(pp.getDelete_Btn());
		pp.getDelete_Btn().click();
		System.out.println("Check Error Deleted");
		ca.eleToBeClickable();

		Commonactions.isElementPresent(in.getDefects());
		in.getDefects().click();
		ca.eleToBeClickable();
		List<WebElement> DefectType = driver.findElements(By.xpath("//td[contains(@data-csi-act,'DefaultErrorType')]"));
		int DS = DefectType.size();
		for(int i=1;i<=(DS/2);i++)
		{
			driver.findElement(By.xpath("(//td[contains(@data-csi-act,'DefaultErrorType')])["+i+"]")).click();
			ca.eleToBeClickable();
			WebElement dt = ca.activeElement();
			ca.eleToBeClickable();
			dt.sendKeys(Error[0]);
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();
		}
		for(int i=(DS/2)+1;i<=DS;i++)
		{
			driver.findElement(By.xpath("(//td[contains(@data-csi-act,'DefaultErrorType')])["+i+"]")).click();
			ca.eleToBeClickable();
			WebElement dt = ca.activeElement();
			ca.eleToBeClickable();
			dt.sendKeys(Error[1]);
			ca.jsMouseOver();
			ca.eleToBeClickable();
		}
		System.out.println("Defect Error Type created for the Error Type Critical and High");


	}
	@Then("user creates TemplateName BomName sizechart and Dimension {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_creates_TemplateName_BomName_sizechart_and_Dimension(String TemplateName, String BOMName, String SizeChart, String DimensioName,String TestSpecification, String Samplingvalue,String ErrorType,String InspectionGrpName) throws Throwable {
		String[] specvalue = TestSpecification.split(",");
		String[] SapValue = Samplingvalue.split(",");
		String[] Error = ErrorType.split(",");

		Commonactions.isElementPresent(in.getTemplate());
		in.getTemplate().click();
		Commonactions.isElementPresent(in.getNewInspTemplateBtn());
		in.getNewInspTemplateBtn().click();
		ca.eleToBeClickable();
		WebElement e7 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e7, TemplateName);
		ca.eleToBeClickable();
		e7.sendKeys(Keys.TAB);
		ca.eleToBeClickable();


		in.getInspectionTempName().click();
		Commonactions.isElementPresent(in.getInspectionTemplatetab());
		in.getInspectionTemplatetab().click();
		Commonactions.isElementPresent(in.getTempSamplingPlan());
		in.getTempSamplingPlan().click();
		ca.eleToBeClickable();
		WebElement e8 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e8, SapValue[0]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();


		in.getErrorTypestab().click();
		Commonactions.isElementPresent(in.getNewInspErrorType());
		in.getNewInspErrorType().click();
		Commonactions.isElementPresent(in.getErrorTypevalue());
		insertText(in.getErrorTypevalue(), Error[0]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		in.getNewInspErrorType().click();
		Commonactions.isElementPresent(in.getErrorTypevalue());
		insertText(in.getErrorTypevalue(), Error[1]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();


		in.getTestspecificationtab().click();
		Commonactions.isElementPresent(in.getNewTestSpecBtn());
		in.getNewTestSpecBtn().click();
		Commonactions.isElementPresent(in.getInspSecChkBox());
		in.getInspSecChkBox().click();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		int size = driver.findElements(By.xpath("(//input[@type='radio'])")).size();
		System.out.println("size is :"+size);
		for(int i=1;i<=size;i++)
		{

			int j = i-1;
			//ca.jsScrollPageUp(driver.findElement(By.xpath("//div[text()='BOM']/parent::td//preceding-sibling::td/div//input[@type='radio']["+i+"]")));
			ca.eleToBeClickable();
			ca.click(driver.findElement(By.xpath("//td[text()='"+specvalue[j]+"']/preceding-sibling::td/a[contains(text(),'"+specvalue[j]+"')]")));
			ca.eleToBeClickable();
			ca.jsScrollPageDown(in.getSelectTestSpec());
			Commonactions.isElementPresent(in.getSelectTestSpec());
			in.getSelectTestSpec().click();
			Commonactions.isElementPresent(in.getTestSpecChkBox());
			in.getTestSpecChkBox().click();
			Commonactions.isElementPresent(mp.getSave_btn1());
			ca.click(mp.getSave_btn1());
			ca.eleToBeClickable();
			ca.click(driver.findElement(By.xpath("//*[text()='auto-inspection']")));
			ca.eleToBeClickable();

		}
		System.out.println("Template created and TestSpec added");

		Commonactions.isElementPresent(in.getBOMTab());
		in.getBOMTab().click();
		Commonactions.isElementPresent(in.getNewBombtn());
		in.getNewBombtn().click();
		Commonactions.isElementPresent(in.getEditName());
		in.getEditName().click();
		ca.eleToBeClickable();

		WebElement b1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b1, BOMName);
		ca.eleToBeClickable();
		b1.sendKeys(Keys.TAB);

		/*Commonactions.isElementPresent(in.getBOMName());
		in.getBOMName().click();
		Commonactions.isElementPresent(in.getBOMInspPlacement());
		in.getBOMInspPlacement().click();
		Commonactions.isElementPresent(in.getNewFromMaterialBtn());
		in.getNewFromMaterialBtn().click();
		Commonactions.isElementPresent(in.getMaterialchkBox());
		in.getMaterialchkBox().click();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();*/
		System.out.println("Inspection BOM created");


		ca.eleToBeClickable();
		ca.click(hp.getUser_homeBtn()); 

		System.out.println("Home tab clicked successfully");
		ca.eleToBeClickable();

		/*		Commonactions.isElementPresent(qp.getRightArrow());
		ca.click(qp.getRightArrow());
		Commonactions.isElementPresent(hp.getInspectionBtn());
		hp.getInspectionBtn().click();
		Commonactions.isElementPresent(sp.getSetup());
		sp.getSetup().click();*/

		driver.findElement(By.xpath("//span[contains(@class,'DataSetup') and text()='settings']")).click();
		ca.eleToBeClickable();
		driver.findElement(By.xpath("//a[text()='Product Quality Setup']")).click();
		ca.eleToBeClickable();

		ca.mouseOver(in.getTemplate());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getTemplate());
		in.getTemplate().click();
		Commonactions.isElementPresent(in.getInspectionTempName());
		in.getInspectionTempName().click();
		Commonactions.isElementPresent(in.getSizeChartTab());
		in.getSizeChartTab().click();
		Commonactions.isElementPresent(in.getNewSplSizeChartBtn());
		in.getNewSplSizeChartBtn().click();
		Commonactions.isElementPresent(in.getEditName());
		in.getEditName().click();

		WebElement b2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b2, SizeChart);
		ca.eleToBeClickable();
		b2.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		in.getInsSpecName().click();
		Commonactions.isElementPresent(in.getSizeChartDimension());
		in.getSizeChartDimension().click();
		Commonactions.isElementPresent(in.getDimesionExpand());
		in.getDimesionExpand().click();
		Commonactions.isElementPresent(in.getNewinpeSizeChart());
		in.getNewinpeSizeChart().click();
		Commonactions.isElementPresent(in.getEditDimName());
		in.getEditDimName().click();
		ca.eleToBeClickable();


		WebElement b3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b3, DimensioName);
		ca.eleToBeClickable();
		b3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		ca.eleToBeClickable();
		System.out.println("Inspection SizeChart and Dimension created");
	}

	@Then("user creates Inspection group name{string}")
	public void user_creates_Inspection_group_name(String InspectionGrpName) throws Throwable 
	{	
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn()); 
		System.out.println("Home tab clicked successfully");
		ca.eleToBeClickable();

		/*Commonactions.isElementPresent(qp.getRightArrow());
		ca.click(qp.getRightArrow());*/
		Commonactions.isElementPresent(hp.getInspectionBtn());
		hp.getInspectionBtn().click();


		Commonactions.isElementPresent(in.getInspectionSecGrpTab());
		in.getInspectionSecGrpTab().click();
		Commonactions.isElementPresent(in.getNewInspSecGrpBtn());
		in.getNewInspSecGrpBtn().click();
		ca.eleToBeClickable();
		WebElement b4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b4, InspectionGrpName);
		ca.eleToBeClickable();
		b4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		System.out.println("New Inspection Group created");


	}
	@Then("User creates Style for inspection {string}")
	public void User_creates_Style_for_inspection(String BomNam) throws Throwable {

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

		Commonactions.isElementPresent(si.getNewstyleBOMbtn());
		si.getNewstyleBOMbtn().click();

		Commonactions.isElementPresent(si.getStyleBOMValue());
		si.getStyleBOMValue().sendKeys(BomNam);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());

		Commonactions.isElementPresent(si.getStyleBomName());
		si.getStyleBomName().click();
		Commonactions.isElementPresent(si.getStyleBOMPlacement());
		si.getStyleBOMPlacement().click();
		ca.eleToBeClickable();
		Thread.sleep(2000);
		//try{
		Commonactions.isElementPresent(si.getBomViews2());
		ca.click(si.getBomViews2());
		//}
		//catch(Exception e1) 
		//ca.click(si.getBomViews1());
		boolean manageview = si.getBommanageviews2().isDisplayed();
		if(manageview==true)
		{ca.click(si.getBommanageviews2());}
		else
		{ca.click(si.getBommanageviews1());}
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "Bom-P-Copy");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(si.getInspectionRelevant());
		ca.click(si.getInspectionRelevant());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		try{
			ca.click(si.getNewfrommaterialExpand2());
		}
		catch(Exception e) {ca.click(si.getNewfrommaterialExpand1());}
		Commonactions.isElementPresent(si.getNewFromMaterial());
		ca.click(si.getNewFromMaterial());
		Commonactions.isElementPresent(si.getAllButton());
		ca.click(si.getAllButton());		
		try {
			ca.eleToBeClickable();
			driver.findElement(By.xpath("(//span[text()='Material']//following::input[@type='checkbox' and @tabindex='0'])[2]")).click();
			driver.findElement(By.xpath("(//span[text()='Material']//following::input[@type='checkbox' and @tabindex='0'])[3]")).click();
		}
		catch(Exception e)
		{
			try {
				boolean selected = in.getMaterialchkBox().isSelected();
				if(selected==false) 
				{
					Commonactions.isElementPresent(in.getMaterialchkBox());
					in.getMaterialchkBox().click();
				}}
			catch(Exception ee) {}
		}

		boolean selected = si.getCotton_Rayonchkbox().isSelected();
		if(selected==false) {
			Commonactions.isElementPresent(si.getCotton_Rayonchkbox());
			ca.click(si.getCotton_Rayonchkbox());}
		Commonactions.isElementPresent(si.getFinish());
		ca.click(si.getFinish());
		ca.eleToBeClickable();

		try{ca.click(si.getPlacementNeck());}
		catch(Exception e) {driver.findElement(By.xpath("(//table/tbody[1]//tr[2]//td[@data-csi-act='Node Name::0'])")).click();}		
		ca.eleToBeClickable();
		WebElement e11 = ca.activeElement();
		ca.eleToBeClickable();
		e11.sendKeys("Neck");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		try{ca.click(si.getPlacementShoulder());}
		catch(Exception e) {driver.findElement(By.xpath("(//table/tbody[1]//tr[1]//td[@data-csi-act='Node Name::0'])")).click();}
		ca.eleToBeClickable();
		WebElement e8 = ca.activeElement();
		ca.eleToBeClickable();
		e8.sendKeys("Shoulder");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();


		/*	try{ca.click(si.getPlacementNeck());}
		catch(Exception e) {driver.findElement(By.xpath("(//table/tbody[1]//tr[2]//td[@data-csi-act='Node Name::0'])")).click();}		
		ca.eleToBeClickable();
		WebElement e12 = ca.activeElement();
		ca.eleToBeClickable();
		e12.sendKeys("Neck");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();*/



		for(int i=0;i<150;i++)
		{
			ca.click(driver.findElement(By.xpath("(//div[contains(@class,'BOM')]//span[text()='+']/parent::div)[3]")));
		}
		Commonactions.isElementPresent(si.getInspectionCheckbox1());
		ca.click(si.getInspectionCheckbox1());
		Commonactions.isElementPresent(si.getInspectionCheckbox2());
		ca.click(si.getInspectionCheckbox2());
		Commonactions.isElementPresent(si.getColorandSize());
		ca.click(si.getColorandSize());
		Commonactions.isElementPresent(si.getSpecification());
		si.getSpecification().click();

		Commonactions.isElementPresent(si.getStyleBOmview());
		ca.click(si.getStyleBOmview());
		Commonactions.isElementPresent(si.getStyleBOMManageViews());
		ca.click(si.getStyleBOMManageViews());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "BOM-Copy");
		Commonactions.isElementPresent(si.getInspectionRelevant());
		ca.click(si.getInspectionRelevant());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		for(int i=0;i<120;i++)
		{
			ca.click(driver.findElement(By.xpath("(//div[contains(@class,'BOM')]//span[text()='+']/parent::div)[1]")));

			if(si.getInspectionCheckbox1().isDisplayed()){

				ca.click(driver.findElement(By.xpath("(//div[contains(@class,'BOM')]//span[text()='+']/parent::div)[1]")));
				ca.click(driver.findElement(By.xpath("(//div[contains(@class,'BOM')]//span[text()='+']/parent::div)[1]")));
				//ca.click(sp.getPointspossible1());
				ca.eleToBeClickable();
				break;
			}

		}
		Commonactions.isElementPresent(si.getInspectionCheckbox1());
		ca.click(si.getInspectionCheckbox1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(si.getImageTab());
		ca.click(si.getImageTab());
	}
	@And("User creates ImageDatasheet {string},{string}")
	public void User_creates_ImageDatasheet(String ImageName, String Description) throws Throwable {


		Commonactions.isElementPresent(si.getImageTab());
		ca.click(si.getImageTab());
		Commonactions.isElementPresent(si.getNewImageBtn());
		ca.click(si.getNewImageBtn());
		ca.eleToBeClickable();
		WebElement en = ca.activeElement();
		ca.eleToBeClickable();
		en.sendKeys(ImageName);
		Commonactions.isElementPresent(si.getDescription());
		ca.click(si.getDescription());
		ca.eleToBeClickable();
		WebElement ed = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(ed, Description);
		Commonactions.isElementPresent(si.getImageViews());
		ca.click(si.getImageViews());
		Commonactions.isElementPresent(si.getImageManageViews());
		ca.click(si.getImageManageViews());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "Img-Copy");
		Commonactions.isElementPresent(si.getInspectionRelevant());
		ca.click(si.getInspectionRelevant());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		for(int i=0;i<150;i++)
		{
			ca.click(driver.findElement(By.xpath("(//div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div)[2]")));
		}
		Commonactions.isElementPresent(si.getInspectionCheckbox1());
		try{
			Commonactions.isElementPresent(si.getInspectionCheckbox2());
			ca.click(si.getInspectionCheckbox2());}
		catch(Exception e)
		{ca.click(si.getInspectionCheckbox1());}
		Commonactions.isElementPresent(si.getIns_Ids_name());
		ca.click(si.getIns_Ids_name());
		Commonactions.isElementPresent(si.getLabeledImage());
		ca.click(si.getLabeledImage());
		Commonactions.isElementPresent(si.getNewfromImageBtn());
		ca.click(si.getNewfromImageBtn());

		try {
			Commonactions.isElementPresent(si.getImage2());
			ca.click(si.getImage2());
			Commonactions.isElementPresent(mp.getSave_btn1());
			ca.click(mp.getSave_btn1());
			Commonactions.isElementPresent(si.getNewfromImageBtn());
			ca.click(si.getNewfromImageBtn());
			Commonactions.isElementPresent(si.getImage1());
			ca.click(si.getImage1());
			Commonactions.isElementPresent(mp.getSave_btn1());
			ca.click(mp.getSave_btn1());
			Commonactions.isElementPresent(si.getLabelImageview());

			ca.click(si.getLabelImageview());
			Commonactions.isElementPresent(si.getLabelmanageview());
			ca.click(si.getLabelmanageview());
			Commonactions.isElementPresent(up.getUsrMgmt_Copy());
			ca.click(up.getUsrMgmt_Copy());
			Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
			ca.insertText(up.getUsrMgmt_Copy_Value(), "label Img-Copy");
			Commonactions.isElementPresent(si.getInspectionRelevant());
			ca.click(si.getInspectionRelevant());
			Commonactions.isElementPresent(mp.getAdd());
			ca.click(mp.getAdd());
			Inssavebtn();
			Commonactions.isElementPresent(si.getInspectionCheckbox1());
			ca.click(si.getInspectionCheckbox1());
			Commonactions.isElementPresent(si.getInspectionCheckbox2());
			ca.click(si.getInspectionCheckbox2());
			System.out.println("Image Datasheet created successfully");

		}
		catch(Exception e)
		{
			ca.click(in.getCancel());
			System.out.println("Image Datasheet not created successfully");

		}
		Commonactions.isElementPresent(si.getColorandSize());
		ca.click(si.getColorandSize());
		Commonactions.isElementPresent(si.getSpecification());
		si.getSpecification().click();
	}
	@Then("User creates Review {string},{string},{string}")
	public void User_creates_Review(String ReviewName,String ReviewDesc,String canvasNote) throws Throwable {

		Commonactions.isElementPresent(si.getStyleReview());
		ca.click(si.getStyleReview());
		Commonactions.isElementPresent(si.getNewstyleReviewbtn());
		ca.click(si.getNewstyleReviewbtn());
		ca.eleToBeClickable();
		WebElement es = ca.activeElement();
		ca.eleToBeClickable();
		es.sendKeys(ReviewName);
		Commonactions.isElementPresent(si.getReviewDescription());

		ca.click(si.getReviewDescription());
		ca.eleToBeClickable();
		WebElement ed = ca.activeElement();
		ca.eleToBeClickable();
		ed.sendKeys(ReviewDesc);
		Commonactions.isElementPresent(si.getReviewViews());

		ca.click(si.getReviewViews());
		Commonactions.isElementPresent(si.getReviewManageViews());
		ca.click(si.getReviewManageViews());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "Review-Copy");
		Commonactions.isElementPresent(si.getInspectionRelevant());
		ca.click(si.getInspectionRelevant());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		ca.eleToBeClickable();
		Inssavebtn();
		ca.eleToBeClickable();
		for(int i=0;i<150;i++)
		{
			ca.click(driver.findElement(By.xpath("//span[@data-csi-automation='plugin-Style-StyleReviews-tableSuspend']//following::div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div")));
		}
		try {ca.click(si.getInspectionCheckbox2());}
		catch(Exception e)		{ca.click(si.getInspectionCheckbox1());}
		Commonactions.isElementPresent(si.getReviewName());
		ca.click(si.getReviewName());
		Commonactions.isElementPresent(si.getNewCanvas());
		ca.click(si.getNewCanvas());
		Commonactions.isElementPresent(si.getAddNote());
		ca.click(si.getAddNote());
		ca.eleToBeClickable();
		WebElement en = ca.activeElement();
		ca.eleToBeClickable();
		en.sendKeys(canvasNote);
		Commonactions.isElementPresent(si.getSaveFinish());
		ca.click(si.getSaveFinish());
		System.out.println("Review successfully created");
	}
	@And("User creates sizechart {string}")
	public void User_creates_sizechart(String InsSize) throws Throwable {
		Commonactions.isElementPresent(si.getColorandSize());
		ca.click(si.getColorandSize());
		Commonactions.isElementPresent(si.getSpecification());
		si.getSpecification().click();
		Commonactions.isElementPresent(si.getSizechart());
		ca.click(si.getSizechart());
		Commonactions.isElementPresent(si.getNewsizechartbtn());
		ca.click(si.getNewsizechartbtn());
		Commonactions.isElementPresent(si.getSizechartValue());
		ca.insertText(si.getSizechartValue(), InsSize);
		Commonactions.isElementPresent(mp.getSave_btn1());
		Inssavebtn();

		System.out.println("size chart saved");
		Commonactions.isElementPresent(si.getSizechartview());
		ca.click(si.getSizechartview());
		Commonactions.isElementPresent(si.getSizechartManage());
		ca.click(si.getSizechartManage());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "Sizechart-Copy");
		Commonactions.isElementPresent(si.getInspectionRelevant());
		ca.click(si.getInspectionRelevant());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		ca.eleToBeClickable();
		Inssavebtn();

		System.out.println("sizechart copy saved");
		ca.eleToBeClickable();
		for(int i=0;i<150;i++)
		{
			ca.click(driver.findElement(By.xpath("//div[text()='Size Charts']//following::div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div")));
		}
		WebElement sizeInsCheckbox = driver.findElement(By.xpath("(//*[text()='Ins-SizeChart']//following::div[contains(@data-csi-act,'FinalInspectionRelevant:')]/input)[1]"));
		ca.click(sizeInsCheckbox);

		System.out.println("size chart inspection saved");
		Commonactions.isElementPresent(si.getSizechartName());
		ca.click(si.getSizechartName());
		Commonactions.isElementPresent(si.getDimension());
		ca.click(si.getDimension());
		Commonactions.isElementPresent(si.getSizeDimesnionExpand());
		ca.click(si.getSizeDimesnionExpand());
		Commonactions.isElementPresent(si.getNewfromDimension());
		ca.click(si.getNewfromDimension());
		ca.eleToBeClickable();
		for(int i=1;i<=3;i++) 
		{
			ca.click(driver.findElement(By.xpath("(//td/div/input[@type='checkbox' and @tabindex='0'])["+i+"]")));		}
		ca.eleToBeClickable();
		Inssavebtn();
		ca.eleToBeClickable();

		System.out.println("new from dim saved");
		/*for(int i=0;i<60;i++)
		{
			driver.findElement(By.xpath("//div[contains(@class,'Slider')]//span[text()='+']/parent::div")).click();
		}*/

		try{
			driver.findElement(By.xpath("(//span[text()='Dim'])//following::td[contains(@data-csi-heading,'SizeChartDimensionSummaryMatrix')]"));
			for(int i=1;i<=3;i++)
			{
				ca.click(driver.findElement(By.xpath("((//span[text()='Dim'])//following::td[contains(@data-csi-act,'ToleranceNegative')])["+i+"]")));
				ca.eleToBeClickable();
				WebElement e1 = ca.activeElement();
				ca.eleToBeClickable();
				e1.sendKeys(Keys.DELETE);
				ca.eleToBeClickable();
				ca.insertText(e1, ""+i);
				ca.eleToBeClickable();
				ca.click(si.getDimension());
				ca.eleToBeClickable();
			}

			String s[]= {"01","10","20","30","12","24","34","14","28","40"};
			for(int i=1;i<=9;i++)
			{
				ca.click(driver.findElement(By.xpath("((//span[text()='Dim'])//following::td[contains(@data-csi-heading,'SizeChartDimensionSummaryMatrix')])["+i+"]")));
				WebElement e2 = ca.activeElement();
				ca.eleToBeClickable();
				ca.insertText(e2, s[i]);
				ca.eleToBeClickable();
				ca.click(si.getDimension());
				ca.eleToBeClickable();
				e2.sendKeys(Keys.TAB);
				ca.eleToBeClickable();
				ca.click(si.getDimension());
				ca.eleToBeClickable();
			}
		}
		catch(Exception e) {
			for(int i=1;i<=3;i++)
			{
				ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-act,'ToleranceNegative')])["+i+"]")));
				ca.eleToBeClickable();
				WebElement e1 = ca.activeElement();
				ca.eleToBeClickable();
				e1.sendKeys(Keys.DELETE);
				ca.eleToBeClickable();
				ca.insertText(e1, ""+i);
				ca.eleToBeClickable();
				ca.click(si.getDimension());
				ca.eleToBeClickable();
			}

			String s[]= {"01","11","21","31","12","24","34","14","28","40"};
			for(int i=1;i<=9;i++)
			{
				ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-heading,'SizeChartDimensionSummaryMatrix')])["+i+"]")));
				WebElement e2 = ca.activeElement();
				ca.eleToBeClickable();
				e2.sendKeys(Keys.DELETE);
				ca.eleToBeClickable();
				ca.insertText(e2, s[i]);
				ca.eleToBeClickable();
				e2.sendKeys(Keys.TAB);
				ca.eleToBeClickable();
				ca.click(si.getDimension());
				ca.eleToBeClickable();
			}	
			System.out.println("small medium large size entered");
		}
		ca.eleToBeClickable();
		try{
			Commonactions.isElementPresent(si.getDimensionView1());
			ca.click(si.getDimensionView1());
			Commonactions.isElementPresent(si.getDimensionmanage1());
			ca.click(si.getDimensionmanage1());}
		catch(Exception e){
			Commonactions.isElementPresent(si.getDimensionView());
			ca.click(si.getDimensionView());
			Commonactions.isElementPresent(si.getDimensionmanage());
			ca.click(si.getDimensionmanage());
			System.out.println("dim view and manage clicked");}
		ca.eleToBeClickable();
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "Dimension-Copy");
		Commonactions.isElementPresent(si.getInspectionTol1());
		ca.click(si.getInspectionTol1());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(si.getInspectionTol2());
		ca.click(si.getInspectionTol2());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(si.getInspectionRelevant());
		ca.click(si.getInspectionRelevant());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		for (int i = 0; i < 5; i++) {
			ca.click(in.getUp());
		}
		Commonactions.isElementPresent(mp.getSave_btn1());
		Inssavebtn();

		System.out.println("Dim copy saved");
		ca.eleToBeClickable();
		/*try {
			for(int i=0;i<150;i++)
			{
						ca.click(driver.findElement(By.xpath("//span[text()='Dim']//following::div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div")));
			}
		}
		catch(Exception e)
		{System.out.println("Increment Icon not exist in Dimension");}*/
		if(driver.findElement(By.xpath("//div[contains(@data-csi-act,'FinalInspectionRelevant:')]/input")).isDisplayed())
		{
			ca.click(driver.findElement(By.xpath("(//div[contains(@data-csi-act,'FinalInspectionRelevant:')]/input)[1]")));
			ca.click(driver.findElement(By.xpath("(//div[contains(@data-csi-act,'FinalInspectionRelevant:')]/input)[2]")));
			ca.click(driver.findElement(By.xpath("(//div[contains(@data-csi-act,'FinalInspectionRelevant:')]/input)[3]")));
		}

		System.out.println("Size chart created successfully for inspection");
	}
	@Then("User creates spec {string},{string},{string},{string},{string}")
	public void User_creates_spec(String specvalue, String datasheet, String specdesc, String customspecvalue, String specialvalue) throws Throwable {

		Commonactions.isElementPresent(si.getColorandSize());
		si.getColorandSize().click();
		Commonactions.isElementPresent(si.getSpecification());
		si.getSpecification().click();

		Commonactions.isElementPresent(si.getSpec());
		ca.click(si.getSpec());
		Commonactions.isElementPresent(si.getNewSpecBtn());
		ca.click(si.getNewSpecBtn());
		Commonactions.isElementPresent(si.getSpectypevalue());
		ca.insertText(si.getSpectypevalue(), specvalue);
		ca.jsMouseOver();
		Commonactions.isElementPresent(si.getSpecdatasheet());
		ca.insertText(si.getSpecdatasheet(), datasheet);
		Commonactions.isElementPresent(si.getSpecDescription());
		ca.insertText(si.getSpecDescription(), specdesc);
		Commonactions.isElementPresent(sp.getSaveandgo());
		ca.click(sp.getSaveandgo());
		Commonactions.isElementPresent(si.getCreateExpand());

		ca.click(si.getCreateExpand());
		Commonactions.isElementPresent(si.getCreatecustomspec());
		ca.click(si.getCreatecustomspec());
		Commonactions.isElementPresent(si.getSpecvalue());
		ca.insertText(si.getSpecvalue(), customspecvalue);
		Commonactions.isElementPresent(mp.getSave_btn1());
		Inssavebtn();
		System.out.println("custom spec created");
		ca.eleToBeClickable();
		ca.jsScrollPageDown(si.getPlusExpand());
		Commonactions.isElementPresent(si.getPlusExpand());
		ca.click(si.getPlusExpand());
		Commonactions.isElementPresent(si.getNewSpecial());
		ca.click(si.getNewSpecial());
		Commonactions.isElementPresent(si.getSpecitemvalue());
		ca.insertText(si.getSpecitemvalue(), specialvalue);
		Commonactions.isElementPresent(mp.getSave_btn1());
		Inssavebtn();

		System.out.println("special created");
		Commonactions.isElementPresent(si.getSpeccreateViews());
		ca.click(si.getSpeccreateViews());
		Commonactions.isElementPresent(si.getSpeccreatemanageviews());
		ca.click(si.getSpeccreatemanageviews());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "SCreate-Copy");
		Commonactions.isElementPresent(si.getInspectionRelevant());
		ca.click(si.getInspectionRelevant());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(mp.getSave_btn1());
		Inssavebtn();

		System.out.println("screate copy saved");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(si.getColorandSize());
		ca.click(si.getColorandSize());
		Commonactions.isElementPresent(si.getSpecification());
		si.getSpecification().click();

		Commonactions.isElementPresent(si.getSpec());
		ca.click(si.getSpec());

		System.out.println("spec created successfully");

		Commonactions.isElementPresent(si.getSpecview());
		ca.click(si.getSpecview());
		Commonactions.isElementPresent(si.getSpecmanage());
		ca.click(si.getSpecmanage());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "Spec-Copy");
		Commonactions.isElementPresent(si.getInspectionRelevant());
		ca.click(si.getInspectionRelevant());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		for (int i = 0; i < 4; i++) {
			ca.click(in.getUp());
		}
		Commonactions.isElementPresent(mp.getSave_btn1());
		Inssavebtn();

		System.out.println("spec copy saved");
		ca.eleToBeClickable();
		/*if(driver.findElement(By.xpath("//span[text()='Spec Data Sheet']//following::div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div")).isDisplayed())
		{
		for(int i=0;i<150;i++)
			{			
			ca.click(driver.findElement(By.xpath("//span[text()='Spec Data Sheet']//following::div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div")));
			}}*/
		try {
			Commonactions.isElementPresent(si.getInspectionCheckbox1());
			ca.click(si.getInspectionCheckbox1());}
		catch(Exception e)
		{
			ca.click(si.getInspectionCheckbox2());
			System.out.println("inspection checked for spec");
		}
	}
	@And("User Copy BOM Name {string},{string}")
	public void User_Copy_BOM_Name(String Bomcopy1, String Bomcopy2) throws Throwable {
		Commonactions.isElementPresent(si.getStyleBOM());
		ca.click(si.getStyleBOM());
		Commonactions.isElementPresent	(si.getBOMCopy());
		ca.click(si.getBOMCopy());
		Commonactions.isElementPresent(si.getStyleBOMValue());
		ca.insertText(si.getStyleBOMValue(), Bomcopy1);
		Inssavebtn();
		System.out.println("Bom1 copied");

		Commonactions.isElementPresent(si.getActioncheck());
		ca.click(si.getActioncheck());
		Commonactions.isElementPresent(si.getContinue());
		ca.click(si.getContinue());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(si.getActioncheck());
		ca.click(si.getActioncheck());
		Commonactions.isElementPresent(si.getContinue());
		ca.click(si.getContinue());

		Commonactions.isElementPresent(si.getBOMCopy());
		ca.click(si.getBOMCopy());
		Commonactions.isElementPresent(si.getStyleBOMValue());
		ca.insertText(si.getStyleBOMValue(), Bomcopy2);
		Inssavebtn();

		System.out.println("Bom2 Copied");
		ca.eleToBeClickable();
		for(int i=0;i<120;i++)
		{
			ca.click(driver.findElement(By.xpath("//span[text()='Style BOM']//following::div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div")));
		}
		WebElement checkbox = driver.findElement(By.xpath("//*[text()='Ins-BOM COPY']//following::div[contains(@data-csi-act,'FinalInspectionRelevant:')][1]"));
		ca.click(checkbox);
		System.out.println("Bom copied and approved successfully");
	}
	@Then("User creates Inspection and verify the created items in Style Specification {string},{string},{string}")
	public void User_creates_Inspection_and_verify_the_created_items_in_Style_Specification(String InspectionName, String sampling, String Supplier) throws Throwable {

		
		
		
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		/*Commonactions.isElementPresent(in.getPagecontentArrow());
		in.getPagecontentArrow().click();
		Commonactions.isElementPresent(in.getPagecontentArrow());
		in.getPagecontentArrow().click();*/
		Commonactions.isElementPresent(hp.getInspectionBtn());
		hp.getInspectionBtn().click();
		Commonactions.isElementPresent(in.getInspectionTab());
		ca.click(in.getInspectionTab());
		Commonactions.isElementPresent(in.getNewinspectionBtn());
		ca.click(in.getNewinspectionBtn());
		Commonactions.isElementPresent(in.getStylevalue());
		ca.insertText(in.getStylevalue(), "Apparel - Color and Size");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(in.getInspecationvalue());
		ca.insertText(in.getInspecationvalue(), InspectionName);

		Commonactions.isElementPresent(in.getSupplierValue());
		ca.insertText(in.getSupplierValue(), Supplier);
		ca.eleToBeClickable();
		ca.jsMouseOver();

		Commonactions.isElementPresent(in.getSamplingplanValue());
		ca.insertText(in.getSamplingplanValue(), sampling);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(in.getSupplierValue());
		ca.insertText(in.getSupplierValue(), Supplier);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		
		//date
		c1.setTime(sdf.parse(date));
		ca.insertText(in.getInspectiondate(),date);
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(in.getFinish());
		ca.click(in.getFinish());

		Commonactions.isElementPresent(in.getInspectionName());
		ca.click(in.getInspectionName());
		Commonactions.isElementPresent(in.getInspectionBOMTab());
		ca.click(in.getInspectionBOMTab());
		Commonactions.isElementPresent(in.getBOMResetAll());
		ca.click(in.getBOMResetAll());
		Commonactions.isElementPresent(in.getNoofItemDisplayed());
		System.out.println(ca.getText(in.getNoofItemDisplayed()));

		Commonactions.isElementPresent(in.getHomeArrowIcon());
		ca.click(in.getHomeArrowIcon());
		Commonactions.isElementPresent(in.getSelectlastview());
		ca.click(in.getSelectlastview());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(si.getSpecification());
		si.getSpecification().click();
		Commonactions.isElementPresent(si.getStyleBOM());
		si.getStyleBOM().click();
		ca.eleToBeClickable();

		for(int i=0;i<150;i++)
		{
			ca.click(driver.findElement(By.xpath("//span[text()='Style BOM']//following::div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div")));
		}
		Commonactions.isElementPresent(si.getInspectionCheckbox2());
		ca.click(si.getInspectionCheckbox2());
		Commonactions.isElementPresent(in.getHomeArrowIcon());
		ca.click(in.getHomeArrowIcon());
		Commonactions.isElementPresent(in.getSelectlastview());
		ca.click(in.getSelectlastview());
		//Commonactions.isElementPresent(in.getBOMResetAll());
		//ca.click(in.getBOMResetAll());
		//Commonactions.isElementPresent(in.getNoofItemDisplayed());
		//System.out.println(ca.getText(in.getNoofItemDisplayed()));
		ca.eleToBeClickable();

	}
	@Then("create NewInspectionSecurityGroup {string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void create_NewInspectionSecurityGroup(String ErrorTypes, String AccLimits, String SampleQtyMethods, String InsBatchName, String Attributes, String Batchcolorway, String BatchSize, String Defectvalue, String DefectCounter) throws Throwable 
	{

		String[] ErrorType = ErrorTypes.split(",");
		String[] AccLimit = AccLimits.split(",");
		String[] SampleQtyMethod = SampleQtyMethods.split(",");
		String[] Attribute = Attributes.split(",");


		/*Commonactions.isElementPresent(in.getPagecontentArrow());
		in.getPagecontentArrow().click();
		Commonactions.isElementPresent(in.getPagecontentArrow());
		in.getPagecontentArrow().click();*/
		Commonactions.isElementPresent(hp.getInspectionBtn());
		hp.getInspectionBtn().click();
		Commonactions.isElementPresent(in.getInspectionSecGrpTab());
		ca.click(in.getInspectionSecGrpTab());

		Commonactions.isElementPresent(in.getNewSecGrpName());
		ca.click(in.getNewSecGrpName());
		Commonactions.isElementPresent(in.getInspectionGrpExpand());
		ca.click(in.getInspectionGrpExpand());
		Commonactions.isElementPresent(in.getMoveFromIns());
		ca.click(in.getMoveFromIns());
		try{
			Commonactions.isElementPresent(in.getInsCheckbox());
			ca.click(in.getInsCheckbox());
			ca.eleToBeClickable();
			driver.findElement(By.xpath("//span[text()='Move Inspections from']//following::span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save']")).click();
			ca.eleToBeClickable();
		}
		catch(Exception e)
		{
			Commonactions.isElementPresent(in.getCancel());
			ca.click(in.getCancel());
			ca.click(driver.findElement(By.xpath("//table[contains(@data-csi-automation,'FinalInspectionSecurityGroup-SecurityGroupFinalInspections')]//div[contains(text(),'New Inspection')]")));
			Commonactions.isElementPresent(in.getStylevalue());
			ca.insertText(in.getStylevalue(), "Apparel - Color and Size");
			ca.eleToBeClickable();
			ca.jsMouseOver();
			Commonactions.isElementPresent(in.getInspecationvalue());
			ca.insertText(in.getInspecationvalue(), "Appareal-Inspection");
			ca.eleToBeClickable();
			Commonactions.isElementPresent(in.getSupplierValue());
			ca.insertText(in.getSupplierValue(), "Supplier");
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();
			Commonactions.isElementPresent(in.getSamplingplanValue());
			ca.insertText(in.getSamplingplanValue(), "Multiple");
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();
			Commonactions.isElementPresent(in.getSupplierValue());
			ca.insertText(in.getSupplierValue(), "Supplier");
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();
			Commonactions.isElementPresent(in.getFinish());
			ca.click(in.getFinish());
			ca.eleToBeClickable();
		}

		Commonactions.isElementPresent(in.getInspectionName());
		ca.click(in.getInspectionName());
		Commonactions.isElementPresent(in.getErrorType());
		ca.click(in.getErrorType());
		Commonactions.isElementPresent(in.getNewInsErrorType());
		ca.click(in.getNewInsErrorType());
		Commonactions.isElementPresent(in.getInsErrorType());
		ca.insertText(in.getInsErrorType(),ErrorType[0]);
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.insertText(in.getInsAccLimit(),AccLimit[0]);
		ca.jsMouseOver();
		ca.eleToBeClickable();
		driver.findElement(By.xpath("//span[text()='New Inspection Error Type']//following::span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save']")).click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getErrorType());
		ca.click(in.getNewInsErrorType());
		Commonactions.isElementPresent(in.getNewInsErrorType());
		ca.insertText(in.getInsErrorType(),ErrorType[1]);
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.insertText(in.getInsAccLimit(),AccLimit[1]);
		ca.jsMouseOver();
		ca.eleToBeClickable();
		driver.findElement(By.xpath("//span[text()='New Inspection Error Type']//following::span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save']")).click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getTestSpecification());
		ca.click(in.getTestSpecification());
		Commonactions.isElementPresent(in.getNewTestSpecBtn());
		ca.click(in.getNewTestSpecBtn());
		Commonactions.isElementPresent(in.getInspSecChkBox());
		ca.click(in.getInspSecChkBox());
		ca.eleToBeClickable();
		driver.findElement(By.xpath("//span[text()='New from Inspection Section Type']//following::span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save']")).click();
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		ca.eleToBeClickable();


		for(int i=2;i<5;i++)
		{
			if(i==2||i==4)
			{
				ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-act,'SampleQtyMethod')])["+i+"]")));
				ca.eleToBeClickable();
				WebElement Rt = ca.activeElement();
				ca.eleToBeClickable();
				Rt.sendKeys(Keys.DELETE);
				ca.eleToBeClickable();
				ca.insertText(Rt, SampleQtyMethod[0]);
				ca.eleToBeClickable();
				ca.jsMouseOver();
				ca.eleToBeClickable();
			}
			else
			{
				ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-act,'SampleQtyMethod')])["+i+"]")));		
				ca.eleToBeClickable();
				WebElement Rt1 = ca.activeElement();
				ca.eleToBeClickable();
				Rt1.sendKeys(Keys.DELETE);
				ca.eleToBeClickable();
				ca.insertText(Rt1, SampleQtyMethod[1]);
				ca.eleToBeClickable();
				ca.jsMouseOver();
				ca.eleToBeClickable();
			}
		}
		ca.eleToBeClickable();
		int size = driver.findElements(By.xpath("(//input[@type='radio'])")).size();
		for(int k=1;k<=size;k++)
		{
			driver.findElement(By.xpath("(//input[@type='radio'])["+k+"]")).click();
			Commonactions.isElementPresent(in.getSelectTestSpec());
			in.getSelectTestSpec().click();
			Commonactions.isElementPresent(in.getFilter());
			ca.click(in.getFilter());
			Commonactions.isElementPresent(in.getTestSpecChkBox());
			in.getTestSpecChkBox().click();
			ca.eleToBeClickable();
			driver.findElement(By.xpath("//span[text()='Select Test Specifications']//following::span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save']")).click();
			ca.eleToBeClickable();
			ca.eleToBeClickable();
		}
		System.out.println("Error Type, Test Specficification created");

		Commonactions.isElementPresent(in.getInspectionBatches());
		ca.click(in.getInspectionBatches());
		Commonactions.isElementPresent(in.getDraft());
		WebElement Draftvalue = in.getDraft();
		String text = Draftvalue.getText();
		if(text.equals("DRAFT"));
		{
			ca.click(in.getstart2());		
		}
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getNewInsBatch());
		ca.click(in.getNewInsBatch());		
		Commonactions.isElementPresent(in.getInspectionBatchName());
		ca.insertText(in.getInspectionBatchName(), InsBatchName);
		Commonactions.isElementPresent(sp.getSaveandgo());
		ca.click(sp.getSaveandgo());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getTestSpecification());
		ca.click(in.getTestSpecification());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getReiewDelete());
		ca.click(in.getReiewDelete());
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getTestspecAdd());
		ca.click(in.getTestspecAdd());
		Commonactions.isElementPresent(in.getBatchCheckbox());
		ca.click(in.getBatchCheckbox());
		ca.eleToBeClickable();
		driver.findElement(By.xpath("//span[text()='Select Inspection Sections']//following::span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save']")).click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getScRadiobutton());
		ca.click(in.getScRadiobutton());	
		Commonactions.isElementPresent(in.getSCBatchviews());
		ca.click(in.getSCBatchviews());
		Commonactions.isElementPresent(in.getSCBatchManageview());
		ca.click(in.getSCBatchManageview());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "Batch-Copy");
		Commonactions.isElementPresent(in.getAttribute());
		ca.insertText(in.getAttribute(), Attribute[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(in.getInsSizeChartDimension());
		ca.click(in.getInsSizeChartDimension());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(in.getAttribute());

		ca.insertText(in.getAttribute(), Attribute[1]);
		Actions a = new Actions(driver);
		Thread.sleep(100);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(100);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(100);
		a.sendKeys(Keys.TAB).build().perform();
		ca.eleToBeClickable();
		ca.click(in.getDim());	
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		ca.eleToBeClickable();

		for (int i = 0; i < 15; i++) {
			ca.click(in.getUp());
		}
		ca.eleToBeClickable();
		driver.findElement(By.xpath("//span[text()='Manage Custom Views']//following::span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save']")).click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getstart1());
		ca.click(in.getstart1());
		Commonactions.isElementPresent(in.getSizechartIcon());
		ca.click(in.getSizechartIcon());
		Commonactions.isElementPresent(in.getBatchSectionsampleTab());
		ca.click(in.getBatchSectionsampleTab());
		Commonactions.isElementPresent(in.getBatchsectionbtn());
		ca.click(in.getBatchsectionbtn());
		Commonactions.isElementPresent(in.getBatchcolorway());
		ca.insertText(in.getBatchcolorway(), Batchcolorway);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(in.getBatchsize());
		ca.insertText(in.getBatchsize(), BatchSize);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		driver.findElement(By.xpath("//span[text()='New Batch Section Sample']//following::span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save']")).click();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(in.getDeviation());
		WebElement deviation = in.getDeviation();
		String text1 = deviation.getText();
		double dd=Double.parseDouble(text1);
		int i = (int)dd;
		i=(-i+1);
		String ss = Integer.toString(i);
		Commonactions.isElementPresent(in.getMeasuredValue());
		ca.click(in.getMeasuredValue());
		ca.eleToBeClickable();
		WebElement MV = ca.activeElement();
		ca.eleToBeClickable();
		MV.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(MV, ss);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();



		boolean d = in.getOutoftolerance1().isSelected();
		if(d==false)
		{
			System.out.println("out of tolerance is unchecked");
		}

		System.out.println("Test Specification completed");


		Commonactions.isElementPresent(in.getSizechartName());
		ca.click(in.getSizechartName());
		Commonactions.isElementPresent(in.getScRadiobutton());
		ca.click(in.getScRadiobutton());
		/*
		 * Commonactions.isElementPresent(in.getAdddefectIcon());
		 * ca.click(in.getAdddefectIcon());
		 * Commonactions.isElementPresent(in.getNext()); ca.click(in.getNext());
		 * Commonactions.isElementPresent(in.getSCDefectvaue());
		 * 
		 * ca.insertText(in.getSCDefectvaue(),Defectvalue); ca.eleToBeClickable();
		 * ca.jsMouseOver(); ca.eleToBeClickable();
		 * ca.insertText(in.getBatchErrorTypevalue(),ErrorType[0]);
		 * ca.eleToBeClickable(); ca.jsMouseOver();
		 * Commonactions.isElementPresent(in.getFinish()); ca.click(in.getFinish());
		 */

		Commonactions.isElementPresent(in.getDefectTab());
		ca.click(in.getDefectTab());
		Commonactions.isElementPresent(in.getNewInspectioDefectBtn());
		ca.click(in.getNewInspectioDefectBtn());
		Commonactions.isElementPresent(in.getSCDefectvaue());
		ca.insertText(in.getSCDefectvaue(), Defectvalue);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.insertText(in.getBatchErrorTypevalue(),ErrorType[1]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.insertText(in.getDefectcounter(), DefectCounter);
		ca.eleToBeClickable();
		driver.findElement(By.xpath("//span[text()='New Inspection Defect']//following::span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save']")).click();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(in.getNewInspectioDefectBtn());
		ca.click(in.getNewInspectioDefectBtn());
		Commonactions.isElementPresent(in.getSCDefectvaue());
		ca.insertText(in.getSCDefectvaue(),Defectvalue);	
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.insertText(in.getBatchErrorTypevalue(),ErrorType[0]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		driver.findElement(By.xpath("//span[text()='New Inspection Defect']//following::span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save']")).click();
		ca.eleToBeClickable();
		System.out.println("Defect Created for High and Critical Error Type");


	}
	@And("User verify the PDF and InspectionBatch status")
	public void user_verify_the_PDF_and_InspectionBatch_status() throws Throwable {

		Commonactions.isElementPresent(in.getFinalInspectionBatch());
		ca.click(in.getFinalInspectionBatch());
		Commonactions.isElementPresent(in.getReportTab());
		ca.click(in.getReportTab());
		Commonactions.isElementPresent(in.getPrintPDF());
		ca.click(in.getPrintPDF());
		ca.eleToBeClickable();

		try {

			Wait fwait = new FluentWait(driver).withTimeout(3, TimeUnit.MINUTES).pollingEvery(10,TimeUnit.SECONDS).ignoring(TimeoutException.class);
			fwait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[text()='error']//following-sibling::div"))));
			String text = driver.findElement(By.xpath("//div[text()='error']//following-sibling::div")).getText();
			if(text.equalsIgnoreCase("Pending PDF request no longer"))
			{
				ca.click(pp.getOK_Btn());
				ca.eleToBeClickable();
				System.out.println("PDF request no longer waited");
			}
		}
		catch(Exception e)
		{
			System.out.println("PDF not downloaded-No Error Message");
			try {
				if(pp.getOK_Btn().isDisplayed())
					ca.click(pp.getOK_Btn());
				ca.eleToBeClickable();
			}
			catch(Exception e1)
			{
				System.out.println("Pending PDF request no longer watched ");
			}
		}
		try {
			Commonactions.isElementPresent(in.getFailbtn());
			ca.click(in.getFailbtn());
			ca.eleToBeClickable();
			Commonactions.isElementPresent(in.getHomeArrowIcon());
			ca.click(in.getHomeArrowIcon());
			Commonactions.isElementPresent(in.getSelectlastview());
			ca.click(in.getSelectlastview());
			ca.eleToBeClickable();
			System.out.println("Inspection Batch failed as Expected");
		}
		catch(Exception e)
		{
			try{ca.click(pp.getOK_Btn());
			ca.eleToBeClickable();
			System.out.println("PDF request no longer waited");
			Commonactions.isElementPresent(in.getFailbtn());
			ca.click(in.getFailbtn());
			ca.eleToBeClickable();}
			catch(Exception ee)
			{ }
		}
	}
	@Then("User waits for PDF and verify it")
	public void user_waits_for_PDF_and_verify_it() throws Throwable {

		try{
			WebDriverWait wait = new WebDriverWait(driver,120);
			WebElement until = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[text()='error']//following-sibling::div"))));
			String text = until.getText();
			if(text.equalsIgnoreCase("Pending PDF request no longer"))
			{
				ca.click(pp.getOK_Btn());
				ca.eleToBeClickable();
				System.out.println("PDF issue handled");
			}
		}
		catch(Exception e)
		{	System.out.println(e);}
	}
	@And("User Creates Style Inspection {string},{string},{string},{string},{string}")
	public void user_Creates_Style_Inspection(String ProductionQuote,String styleInspValue,String TemplateValue,String ErrorTypes,String DefectValues) throws Throwable {
		try{
			String[] ErrorType = ErrorTypes.split(",");
			String[] DefectValue = DefectValues.split(",");

			Commonactions.isElementPresent(hp.getUser_homeBtn());
			ca.click(hp.getUser_homeBtn());
			Commonactions.isElementPresent(hp.getStyleBtn());
			hp.getStyleBtn().click();
			Commonactions.isElementPresent(st.getStyles_Btn());
			st.getStyles_Btn().click();
			Commonactions.isElementPresent(si.getColorandSize());
			si.getColorandSize().click();
			Commonactions.isElementPresent(hp.getSourcingBtn());
			ca.click(hp.getSourcingBtn());
			Commonactions.isElementPresent(in.getStylesourcingquote());
			ca.click(in.getStylesourcingquote());	
			try {
				String text = in.getProdquotevalue().getText();
				if(text!=null)
				{
					System.out.println(text +"value found in prod supplier quote");
				}
			}
			catch(Exception e) {
				ca.click(in.getProdQuote());
				ca.eleToBeClickable();
				WebElement Pq = ca.activeElement();
				ca.eleToBeClickable();
				Pq.sendKeys(Keys.DELETE);
				ca.eleToBeClickable();
				ca.insertText(Pq, ProductionQuote);
				ca.eleToBeClickable();
				ca.jsMouseOver();
				ca.eleToBeClickable();
			}

			Commonactions.isElementPresent(hp.getUser_homeBtn());
			ca.click(hp.getUser_homeBtn());
			/*Commonactions.isElementPresent(in.getPagecontentArrow());
			in.getPagecontentArrow().click();
			Commonactions.isElementPresent(in.getPagecontentArrow());
			in.getPagecontentArrow().click();*/
			Commonactions.isElementPresent(hp.getInspectionBtn());
			hp.getInspectionBtn().click();
			Commonactions.isElementPresent(in.getNewInspectionExpand());
			ca.click(in.getNewInspectionExpand());
			Commonactions.isElementPresent(in.getInspectionfromstyle());
			ca.click(in.getInspectionfromstyle());
			Commonactions.isElementPresent(in.getInspallcheckbox());	
			ca.click(in.getInspallcheckbox());
			Commonactions.isElementPresent(in.getNext());	
			ca.click(in.getNext());
			Commonactions.isElementPresent(in.getInspecationvalue());
			ca.insertText(in.getInspecationvalue(), styleInspValue);
			ca.eleToBeClickable();	

			Commonactions.isElementPresent(in.getTempvalue());
			ca.click(in.getTempvalue());
			ca.eleToBeClickable();
			WebElement Tp = ca.activeElement();
			ca.eleToBeClickable();
			ca.insertText(Tp, TemplateValue);
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();

			Commonactions.isElementPresent(in.getSamplingplanValue());
			ca.insertText(in.getSamplingplanValue(), "Single");
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();
			
			c1.setTime(sdf.parse(date));
			System.out.println(date);
			ca.insertText(in.getInspectiondate(),date);
			ca.eleToBeClickable();

			Commonactions.isElementPresent(si.getFinish());
			ca.click(si.getFinish());	
			System.out.println("Style Created");


			Commonactions.isElementPresent(in.getStyleName());
			ca.click(in.getStyleName());
			Commonactions.isElementPresent(in.getInspectionBatches());
			ca.click(in.getInspectionBatches());
			Commonactions.isElementPresent(in.getDraft());
			WebElement Draftvalue = in.getDraft();
			String text = Draftvalue.getText();
			if(text.equals("DRAFT"));
			{
				Commonactions.isElementPresent(in.getstart2());
				ca.click(in.getstart2());		
			}
			Commonactions.isElementPresent(in.getNewInsBatch());
			ca.click(in.getNewInsBatch());		
			Commonactions.isElementPresent(sp.getSaveandgo());
			ca.click(sp.getSaveandgo());
			ca.eleToBeClickable();
			driver.navigate().refresh();
			ca.eleToBeClickable();
			Commonactions.isElementPresent(in.getTestSpecification());
			ca.click(in.getTestSpecification());
			ca.eleToBeClickable();
			Commonactions.isElementPresent(in.getstart1());
			ca.click(in.getstart1());

			Commonactions.isElementPresent(in.getDefectTab());
			ca.click(in.getDefectTab());
			Commonactions.isElementPresent(in.getNewInspectioDefectBtn());
			ca.click(in.getNewInspectioDefectBtn());
			Commonactions.isElementPresent(in.getSCDefectvaue());
			ca.insertText(in.getSCDefectvaue(), DefectValue[0]);
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();
			ca.insertText(in.getBatchErrorTypevalue(),ErrorType[1]);
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();
			driver.findElement(By.xpath("//span[text()='New Inspection Defect']//following::span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save']")).click();
			ca.eleToBeClickable();

			/*
			 * Commonactions.isElementPresent(in.getAdddefectIcon());
			 * ca.click(in.getAdddefectIcon());
			 * Commonactions.isElementPresent(in.getNext()); ca.click(in.getNext());
			 * Commonactions.isElementPresent(in.getSCDefectvaue());
			 * ca.insertText(in.getSCDefectvaue(), DefectValue[0]); ca.eleToBeClickable();
			 * ca.jsMouseOver(); ca.eleToBeClickable();
			 * ca.insertText(in.getBatchErrorTypevalue(), ErrorType[1]);
			 * ca.eleToBeClickable(); ca.jsMouseOver();
			 * Commonactions.isElementPresent(in.getFinish()); ca.click(in.getFinish());
			 */

			Commonactions.isElementPresent(in.getFinalInspectionBatch());
			ca.click(in.getFinalInspectionBatch());
			ca.eleToBeClickable();
			String text2 = in.getDefectresult1().getText();
			if(text2.equals("1"))
			{
				System.out.println("defect counter value " +text2 +" refelectd in final ins batch-style inspection");
			}
			Commonactions.isElementPresent(in.getFailbtn());
			ca.click(in.getFailbtn());
			ca.eleToBeClickable();
			Commonactions.isElementPresent(in.getStyleIcon());
			ca.click(in.getStyleIcon());
			Commonactions.isElementPresent(in.getBatchAddBtn());
			ca.click(in.getBatchAddBtn());
			Inssavebtn();

			System.out.println("Batch Added");
			System.out.println("style Inspection created successfully");
		}
		catch(Exception e){
			System.out.println("Style Inspection/Batch not created");
		}
	}

	@Then("User creates Shipment Inspection {string},{string},{string},{string},{string},{string}")
	public void user_creates_Shipment_Inspection(String ShipmentInspValue,String TemplateValue,String BatchShipment,String Levels,String DefectValues,String ErrorTypes) throws Throwable {
		try{
			String[] ErrorType = ErrorTypes.split(",");
			String[] DefectValue = DefectValues.split(",");
			String[] Level = Levels.split(",");

			Commonactions.isElementPresent(hp.getUser_homeBtn());
			ca.click(hp.getUser_homeBtn());
			/*Commonactions.isElementPresent(in.getPagecontentArrow());
			in.getPagecontentArrow().click();
			Commonactions.isElementPresent(in.getPagecontentArrow());
			in.getPagecontentArrow().click();*/
			Commonactions.isElementPresent(hp.getInspectionBtn());
			hp.getInspectionBtn().click();

			Commonactions.isElementPresent(in.getNewInspectionExpand());
			ca.click(in.getNewInspectionExpand());
			Commonactions.isElementPresent(in.getInspectionfromShipments());
			ca.click(in.getInspectionfromShipments());
			Commonactions.isElementPresent(in.getInspallcheckbox());	
			ca.click(in.getInspallcheckbox());
			Commonactions.isElementPresent(in.getNext());	
			ca.click(in.getNext());
			Commonactions.isElementPresent(in.getInspecationvalue());
			ca.insertText(in.getInspecationvalue(), ShipmentInspValue);
			ca.eleToBeClickable();	

			ca.click(in.getTempvalue());
			ca.eleToBeClickable();
			WebElement Tp2 = ca.activeElement();
			ca.eleToBeClickable();
			ca.insertText(Tp2, TemplateValue);
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();

			Commonactions.isElementPresent(in.getSamplingplanValue());
			ca.insertText(in.getSamplingplanValue(), "Multiple");
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();

			ca.click(in.getShipmentLevel());
			WebElement sv = ca.activeElement();
			ca.eleToBeClickable();
			ca.insertText(sv, Level[0]);
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();
			
			ca.insertText(in.getInspectiondate(),date);
			ca.eleToBeClickable();

			/*ca.click(in.getSelectShipment());
			ca.eleToBeClickable();*/
			/*driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'field-FinalInspection-Form-Shipments')]//div//input[@type='checkbox'])[2]")).click();
			driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'field-FinalInspection-Form-Shipments')]//div//input[@type='checkbox'])[3]")).click();
			ca.eleToBeClickable();*/
			Commonactions.isElementPresent(si.getFinish());
			ca.click(si.getFinish());
			System.out.println("select shipment");
			ca.eleToBeClickable();
			Commonactions.isElementPresent(in.getShipmentName());
			ca.click(in.getShipmentName());
			Commonactions.isElementPresent(in.getInspectionBatches());
			ca.click(in.getInspectionBatches());
			Commonactions.isElementPresent(in.getDraft());
			WebElement Draftvalue1 = in.getDraft();
			String text1 = Draftvalue1.getText();
			if(text1.equals("DRAFT"));
			{
				Commonactions.isElementPresent(in.getstart2());
				ca.click(in.getstart2());		
			}
			Commonactions.isElementPresent(in.getNewInsBatch());
			ca.click(in.getNewInsBatch());		
			Commonactions.isElementPresent(in.getInspectionBatchName());
			ca.insertText(in.getInspectionBatchName(), BatchShipment);
			Commonactions.isElementPresent(sp.getSaveandgo());
			ca.click(sp.getSaveandgo());
			ca.eleToBeClickable();
			Commonactions.isElementPresent(in.getTestSpecification());
			ca.click(in.getTestSpecification());
			Commonactions.isElementPresent(in.getStart());
			ca.click(in.getStart());

			Commonactions.isElementPresent(in.getDefectTab());
			ca.click(in.getDefectTab());
			Commonactions.isElementPresent(in.getNewInspectioDefectBtn());
			ca.click(in.getNewInspectioDefectBtn());
			Commonactions.isElementPresent(in.getSCDefectvaue());
			ca.insertText(in.getSCDefectvaue(), DefectValue[1]);
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();
			ca.insertText(in.getBatchErrorTypevalue(),ErrorType[1]);
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();
			driver.findElement(By.xpath("//span[text()='New Inspection Defect']//following::span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save']")).click();
			ca.eleToBeClickable();



			/*
			 * Commonactions.isElementPresent(in.getAdddefectIcon());
			 * ca.click(in.getAdddefectIcon());
			 * Commonactions.isElementPresent(in.getNext()); ca.click(in.getNext());
			 * Commonactions.isElementPresent(in.getSCDefectvaue());
			 * ca.insertText(in.getSCDefectvaue(), DefectValue[1]); ca.eleToBeClickable();
			 * ca.jsMouseOver(); ca.eleToBeClickable();
			 * ca.insertText(in.getBatchErrorTypevalue(), ErrorType[1]);
			 * ca.eleToBeClickable(); ca.jsMouseOver();
			 * Commonactions.isElementPresent(in.getFinish()); ca.click(in.getFinish());
			 */


			Commonactions.isElementPresent(in.getFinalInspectionBatch());
			ca.click(in.getFinalInspectionBatch());
			ca.eleToBeClickable();

			Commonactions.isElementPresent(in.getDefectresult1());
			String text3 = in.getDefectresult1().getText();
			if(text3.equals("1"))
			{
				System.out.println("defect counter value " +text3 +" refelectd in final ins batch-shipment");
			}
			Commonactions.isElementPresent(in.getPassbtn());
			ca.click(in.getPassbtn());
			System.out.println("Shipment Inspection created successfully");
		}
		catch(Exception e)
		{
			System.out.println("Shipment Inspection not created successfully");
		}

	}
	@And("User Creates Order Inspection {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_Creates_Order_Inspection(String ErrorTypes, String TemplateValue, String Levels, String Ordershipment, String DefectCounters, String DefectValues, String BatchSize, String OrderBatchName) throws Throwable {

		try{
			String[] ErrorType = ErrorTypes.split(",");
			String[] DefectCounter = DefectCounters.split(",");
			String[] DefectValue = DefectValues.split(",");
			String[] Level = Levels.split(",");

			Commonactions.isElementPresent(hp.getUser_homeBtn());
			ca.click(hp.getUser_homeBtn());
			/*Commonactions.isElementPresent(in.getPagecontentArrow());
			in.getPagecontentArrow().click();
			Commonactions.isElementPresent(in.getPagecontentArrow());
			in.getPagecontentArrow().click();*/
			Commonactions.isElementPresent(hp.getInspectionBtn());
			hp.getInspectionBtn().click();

			Commonactions.isElementPresent(in.getNewInspectionExpand());
			ca.click(in.getNewInspectionExpand());
			Commonactions.isElementPresent(in.getInspectionfromOrder());
			ca.click(in.getInspectionfromOrder());
			Commonactions.isElementPresent(in.getInspallcheckbox());	
			ca.click(in.getInspallcheckbox());
			Commonactions.isElementPresent(in.getNext());	
			ca.click(in.getNext());
			Commonactions.isElementPresent(in.getInspecationvalue());
			ca.insertText(in.getInspecationvalue(), Ordershipment);
			ca.eleToBeClickable();	

			ca.click(in.getTempvalue());
			ca.eleToBeClickable();
			WebElement Tp3 = ca.activeElement();
			ca.eleToBeClickable();
			ca.insertText(Tp3, TemplateValue);
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();

			Commonactions.isElementPresent(in.getSamplingplanValue());
			ca.insertText(in.getSamplingplanValue(), "Multiple");
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();

			ca.click(in.getOrderLevel());
			WebElement ol = ca.activeElement();
			ca.eleToBeClickable();
			ca.insertText(ol, Level[1]);
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();
			
			ca.insertText(in.getInspectiondate(),date);
			ca.eleToBeClickable();


			/*ca.click(in.getSelectOrder());
		ca.eleToBeClickable();*/
			/*driver.findElement(By.xpath("(//div[@data-csi-automation='field-FinalInspection-Form-Orders']//div//input[@type='checkbox'])[2]")).click();
		ca.eleToBeClickable();*/
			Commonactions.isElementPresent(si.getFinish());
			ca.click(si.getFinish());
			System.out.println("order saved");
			ca.eleToBeClickable();

			Commonactions.isElementPresent(in.getOrderName());
			ca.click(in.getOrderName());		
			Commonactions.isElementPresent(in.getInspectionBatches());
			ca.click(in.getInspectionBatches());
			Commonactions.isElementPresent(in.getDraft());
			WebElement Draftvalue2 = in.getDraft();
			String text4 = Draftvalue2.getText();
			if(text4.equals("DRAFT"));
			{
				Commonactions.isElementPresent(in.getstart2());
				ca.click(in.getstart2());		
			}
			Commonactions.isElementPresent(in.getNewInsBatch());
			ca.click(in.getNewInsBatch());		
			Commonactions.isElementPresent(in.getInspectionBatchName());
			ca.insertText(in.getInspectionBatchName(), OrderBatchName);
			Commonactions.isElementPresent(sp.getSaveandgo());
			ca.click(sp.getSaveandgo());
			ca.eleToBeClickable();
			Commonactions.isElementPresent(in.getTargetSamplesCnt());
			ca.click(in.getTargetSamplesCnt());
			ca.eleToBeClickable();
			WebElement Ts = ca.activeElement();
			ca.eleToBeClickable();
			Ts.sendKeys(Keys.DELETE);
			ca.eleToBeClickable();
			ca.insertText(Ts, "50");
			ca.eleToBeClickable();

			Commonactions.isElementPresent(in.getTestSpecification());
			ca.click(in.getTestSpecification());
			ca.eleToBeClickable();
			WebElement Draftvalue3 = in.getDraft();
			String text5 = Draftvalue3.getText();
			if(text5.equals("DRAFT"));
			{
				Commonactions.isElementPresent(in.getstart1());
				ca.click(in.getstart1());		
			}
			ca.eleToBeClickable();
			Commonactions.isElementPresent(in.getSizechartIcon());
			ca.click(in.getSizechartIcon());
			Commonactions.isElementPresent(in.getBatchSectionsampleTab());
			ca.click(in.getBatchSectionsampleTab());
			Commonactions.isElementPresent(in.getBatchsectionbtn());
			ca.click(in.getBatchsectionbtn());
			Commonactions.isElementPresent(in.getBatchsize());
			ca.insertText(in.getBatchsize(), BatchSize);
			ca.eleToBeClickable();
			ca.jsMouseOver();
			Commonactions.isElementPresent(mp.getSave_btn1());
			Inssavebtn();

			System.out.println("batchsize");
			Commonactions.isElementPresent(in.getBatchIcon());
			ca.click(in.getBatchIcon());
			Commonactions.isElementPresent(in.getTestSpecification());
			ca.click(in.getTestSpecification());
			ca.eleToBeClickable();



			/*
			 * Commonactions.isElementPresent(in.getAdddefectIcon());
			 * ca.click(in.getAdddefectIcon());
			 * Commonactions.isElementPresent(in.getNext()); ca.click(in.getNext());
			 * Commonactions.isElementPresent(in.getSCDefectvaue());
			 * ca.insertText(in.getSCDefectvaue(), DefectValue[0]); ca.eleToBeClickable();
			 * ca.jsMouseOver(); ca.eleToBeClickable();
			 * ca.insertText(in.getBatchErrorTypevalue(), ErrorType[1]);
			 * ca.eleToBeClickable(); ca.jsMouseOver();
			 * Commonactions.isElementPresent(in.getFinish()); ca.click(in.getFinish());
			 */

			Commonactions.isElementPresent(in.getDefectTab());
			ca.click(in.getDefectTab());
			Commonactions.isElementPresent(in.getNewInspectioDefectBtn());
			ca.click(in.getNewInspectioDefectBtn());
			Commonactions.isElementPresent(in.getSCDefectvaue());
			ca.insertText(in.getSCDefectvaue(), DefectValue[1]);
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();
			ca.insertText(in.getBatchErrorTypevalue(),ErrorType[0]);
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();
			ca.insertText(in.getDefectcounter(), DefectCounter[0]);
			ca.eleToBeClickable();
			Inssavebtn();
			System.out.println("defect counter");
			Commonactions.isElementPresent(in.getTestSpecification());
			ca.click(in.getTestSpecification());
			ca.eleToBeClickable();
			/*	Commonactions.isElementPresent(in.getAdddefectIcon());
		ca.click(in.getAdddefectIcon());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getDefCounterHigh());
		ca.click(in.getDefCounterHigh());
		Commonactions.isElementPresent(in.getFinish());
		ca.click(in.getFinish());*/


			Commonactions.isElementPresent(in.getFinalInspectionBatch());
			ca.click(in.getFinalInspectionBatch());
			ca.eleToBeClickable();
			Commonactions.isElementPresent(in.getDefectresult1());
			String text6 = in.getDefectresult1().getText();
			if(text6.equals(DefectCounter[0]))
			{
				System.out.println("defect counter value " +text6 +" refelectd in final ins batch-order for critical");
			}
			String text7 = in.getDefectresult2().getText();
			if(text7.equals(DefectCounter[1]))
			{
				System.out.println("defect counter value " +text7 +" refelectd in final ins batch-order for High");
			}
			ca.eleToBeClickable();
			System.out.println("Order Inspection created successfully");
		}
		catch(Exception e)
		{
			System.out.println("Order Inspection not created successfully");
		}
	}
	@Then("User Create Tempalte under Inspection {string}")
	public void user_Create_Tempalte_under_Inspection(String TemplateName) throws Throwable {
		try{
			Commonactions.isElementPresent(hp.getUser_homeBtn());
			ca.click(hp.getUser_homeBtn());
			Commonactions.isElementPresent(hp.getInspectionBtn());
			hp.getInspectionBtn().click();
			ca.eleToBeClickable();
			Commonactions.isElementPresent(in.getSaveTemplateicon());
			ca.click(in.getSaveTemplateicon());		
			ca.eleToBeClickable();
			Commonactions.isElementPresent(in.getTemplateName());
			ca.insertText(in.getTemplateName(),TemplateName);
			ca.eleToBeClickable();
			Inssavebtn();
			System.out.println("Template name created");
		}
		catch(Exception e)
		{
			System.out.println("Template name not created");
		}
	}
	@And("verify Template has created or not {string}")
	public void verify_Template_has_created_or_not(String TemplateName) throws Throwable {
		try{
			/*Commonactions.isElementPresent(sp.getSetup());
		sp.getSetup().click();
		Commonactions.isElementPresent(in.getTemplate());
		in.getTemplate().click();
		ca.eleToBeClickable();*/
			Commonactions.isElementPresent(hp.getDatasetup());
			ca.click(hp.getDatasetup());
			Commonactions.isElementPresent(bc.getProdSpecSetup());
			ca.click(bc.getProdSpecSetup());
			Commonactions.isElementPresent(hp.getSetupSearch());
			ca.insertText(hp.getSetupSearch(), "Inspection Template" +Keys.ENTER);
			ca.eleToBeClickable();
			List<WebElement> inspectionTempNames = in.getInspectionTempNames();
			for (WebElement webElement : inspectionTempNames) {
				String text8 = webElement.getText();
				if(text8.contains(TemplateName))
				{
					System.out.println("order-inspection " +text8 +" found under setup -> Template");
				}}
		}
		catch(Exception e)
		{
			System.out.println("order inspection not found in template");
		}
	}
	public void Inssavebtn() throws Throwable
	{
		ca.eleToBeClickable();
		try{boolean d = mp.getSave_btn1().isDisplayed();
		if(d==true)
		{	ca.click(mp.getSave_btn1());	}
		else
		{	ca.click(mp.getSave_btn2());	}
		ca.eleToBeClickable();}
		catch(Exception e)
		{
			System.out.println("savebtn not exist or locator change for the current area");
		}
	}



}

