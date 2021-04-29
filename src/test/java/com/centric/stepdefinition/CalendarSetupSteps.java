package com.centric.stepdefinition;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.centric.objectrepository.BOMCreationPage;
import com.centric.objectrepository.BusinessPlanningPage;
import com.centric.objectrepository.CalendarPage;
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
import com.centric.objectrepository.StyleMaterialSamplepage;
import com.centric.objectrepository.StylePage;
import com.centric.objectrepository.UserManagementPage;
import com.centric.resources.Commonactions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CalendarSetupSteps extends Commonactions {

	HomePage hp = new HomePage();
	Commonactions ca = new Commonactions();
	MaterialSpecificationPage mp = new MaterialSpecificationPage();
	PopupPage pp = new PopupPage();
	ConfigurationPage co = new ConfigurationPage();
	BOMCreationPage bc = new BOMCreationPage();
	SourcingPage sp = new SourcingPage();
	StylePage st = new StylePage();
	StyleMaterialSamplepage sm = new StyleMaterialSamplepage();
	CalendarPage cp = new CalendarPage();
	public static String futuredate;
	public static String pastdate;
	public static String date;


	@Then("User moves into Calendar Template setup")
	public void user_moves_into_Calendar_Template_setup() throws Throwable {
		Commonactions.isElementPresent(hp.getDatasetup());
		ca.click(hp.getDatasetup());
		Commonactions.isElementPresent(bc.getProdSpecSetup());
		ca.click(bc.getProdSpecSetup());
		Commonactions.isElementPresent(hp.getSetupSearch());
		ca.insertText(hp.getSetupSearch(), "Calendar Templates" +Keys.ENTER);
		ca.eleToBeClickable();
	}

	@And("User create Calendar Type for season {string},{string},{string}")
	public void user_create_Calendar_Type_for_season(String CalType, String CalTemplate, String CalDesc) throws Throwable {
		Commonactions.isElementPresent(co.getNewTemplatecalendarbtn());
		ca.click(co.getNewTemplatecalendarbtn());
		Commonactions.isElementPresent(co.getCalendartype());
		ca.insertText(co.getCalendartype(), CalType);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTemplatecalendar());
		ca.insertText(co.getTemplatecalendar(), CalTemplate);
		Commonactions.isElementPresent(co.getCalendardescription());
		ca.insertText(co.getCalendardescription(), CalDesc);
		Commonactions.isElementPresent(sp.getSaveandgo());
		ca.click(sp.getSaveandgo());
		ca.eleToBeClickable();
	}
	@Then("user create season Template activity under Calendar Type {string},{string},{string},{string},{string},{string}")
	public void user_create_season_Template_activity_under_Calendar_Type(String TempActivity, String ActivityType, String ActivityLevel, String TrackingType, String TrackingPhase, String TrackingState) throws Throwable {
		String[] TempActivityvalue = TempActivity.split(",");
		String[] ActivityTypevalue = ActivityType.split(",");
		String[] ActivityLevelvalue = ActivityLevel.split(",");
		String[] TrackingTypevalue = TrackingType.split(",");
		String[] TrackingPhasevalue = TrackingPhase.split(",");

		Commonactions.isElementPresent(co.getNewtemplateactivitybtn());
		ca.click(co.getNewtemplateactivitybtn());
		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[0]);
		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getActivityLevel());
		ca.insertText(co.getActivityLevel(), ActivityLevelvalue[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[1]);
		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getActivityLevel());
		ca.insertText(co.getActivityLevel(), ActivityLevelvalue[1]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(co.getMilestonneEdit());
		ca.click(co.getMilestonneEdit());
		Commonactions.isElementPresent(co.getActivityLevel());
		ca.insertText(co.getActivityLevel(), ActivityLevelvalue[2]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(co.getNewtemplateactivitybtn());
		ca.click(co.getNewtemplateactivitybtn());
		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[2]);
		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[1]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingType());
		ca.insertText(co.getTrackingType(), TrackingTypevalue[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingPhase());
		ca.insertText(co.getTrackingPhase(), TrackingPhasevalue[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingstate());
		ca.insertText(co.getTrackingstate(), TrackingState);
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		for(int i=0;i<100;i++)
		{
			ca.click(co.getCalslider());
		}
		Commonactions.isElementPresent(co.getArtworkIcon());
		ca.click(co.getArtworkIcon());
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e1, "star");
		ca.eleToBeClickable();
		ca.jsMouseOver();

		Commonactions.isElementPresent(co.getNewtemplateactivitybtn());
		ca.click(co.getNewtemplateactivitybtn());
		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[3]);
		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[1]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingType());
		ca.insertText(co.getTrackingType(), TrackingTypevalue[1]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingPhase());
		ca.insertText(co.getTrackingPhase(), TrackingPhasevalue[1]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingstate());
		ca.insertText(co.getTrackingstate(), TrackingState);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getMatchAll());
		ca.click(co.getMatchAll());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		for(int i=0;i<100;i++)
		{
			ca.click(co.getCalslider());
		}
		Commonactions.isElementPresent(co.getIDSTrackIcon());
		ca.click(co.getIDSTrackIcon());
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		e2.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e2, "star");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		System.out.println("Calendar_Season for season created successfully");

	}

	@And("User create Calendar Type for material {string},{string},{string}")
	public void user_create_Calendar_Type_for_material(String CalType, String CalTemplate, String CalDesc) throws Throwable {
		Commonactions.isElementPresent(co.getNewTemplatecalendarbtn());
		ca.click(co.getNewTemplatecalendarbtn());
		Commonactions.isElementPresent(co.getCalendartype());
		ca.insertText(co.getCalendartype(), CalType);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTemplatecalendar());
		ca.insertText(co.getTemplatecalendar(), CalTemplate);
		Commonactions.isElementPresent(co.getCalendardescription());
		ca.insertText(co.getCalendardescription(), CalDesc);
		Commonactions.isElementPresent(sp.getSaveandgo());
		ca.click(sp.getSaveandgo());
		ca.eleToBeClickable();
	}

	@Then("user create material Template activity under Calendar Type {string},{string},{string},{string},{string}")
	public void user_create_material_Template_activity_under_Calendar_Type(String TempActivity, String ActivityType, String ActivityLevel, String TrackingType, String TrackingState) throws Throwable {
		Commonactions.isElementPresent(co.getExpandIcon());
		ca.click(co.getExpandIcon());
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		e2.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e2, "Calendar_MSG");
		ca.eleToBeClickable();
		e2.sendKeys(Keys.ENTER);
		ca.eleToBeClickable();

		String[] TempActivityvalue = TempActivity.split(",");
		String[] ActivityTypevalue = ActivityType.split(",");
		String[] ActivityLevelvalue = ActivityLevel.split(",");
		String[] TrackingTypevalue = TrackingType.split(",");
		String[] TrackingStatevalue = TrackingState.split(",");

		Commonactions.isElementPresent(co.getNewtemplateactivitybtn());
		ca.click(co.getNewtemplateactivitybtn());
		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[0]);
		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getActivityLevel());
		ca.insertText(co.getActivityLevel(), ActivityLevelvalue[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[1]);
		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[1]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingType());
		ca.insertText(co.getTrackingType(), TrackingTypevalue[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingstate());
		ca.insertText(co.getTrackingstate(), TrackingStatevalue[1]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getMatchAll());
		ca.click(co.getMatchAll());
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[2]);
		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[1]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingType());
		ca.insertText(co.getTrackingType(), TrackingTypevalue[1]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingstate());
		ca.insertText(co.getTrackingstate(), TrackingStatevalue[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getMatchAll());
		ca.click(co.getMatchAll());
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[3]);
		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[1]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingType());
		ca.insertText(co.getTrackingType(), TrackingTypevalue[2]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getTrackingstate());
		ca.insertText(co.getTrackingstate(), TrackingStatevalue[0]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();


		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[2]);
		ca.jsMouseOver();
		Commonactions.isElementPresent(co.getPredecessors());
		ca.insertText(co.getPredecessors(), "");
		ca.eleToBeClickable();
		WebElement e3 = ca.activeElement();
		ca.eleToBeClickable();
		e3.sendKeys(Keys.DOWN);	
		ca.eleToBeClickable();
		Commonactions.isElementPresent(co.getBOMTrackchecckbox());
		ca.click(co.getBOMTrackchecckbox());
		ca.click(co.getManualcheckbox());
		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[4]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Calendar_MSG for material created successfully");

	}

	@Then("User create Calendar Type for PO {string},{string},{string}")
	public void user_create_Calendar_Type_for_PO(String CalType, String CalTemplate, String CalDesc)throws Throwable {
		Commonactions.isElementPresent(co.getNewTemplatecalendarbtn());
		ca.click(co.getNewTemplatecalendarbtn());
		Commonactions.isElementPresent(co.getCalendartype());
		ca.insertText(co.getCalendartype(), CalType);
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(co.getTemplatecalendar());
		ca.insertText(co.getTemplatecalendar(), CalTemplate);
		Commonactions.isElementPresent(co.getCalendardescription());
		ca.insertText(co.getCalendardescription(), CalDesc);
		Commonactions.isElementPresent(sp.getSaveandgo());
		ca.click(sp.getSaveandgo());
		ca.eleToBeClickable();
		System.out.println("calendar template created");
	}

	@Then("user create PO Template activity under Calendar Type {string},{string},{string},{string},{string}")
	public void user_create_PO_Template_activity_under_Calendar_Type(String TempActivity, String ActivityType, String ActivityLevel, String TrackingType, String TrackingState)throws Throwable {
		String[] TempActivityvalue = TempActivity.split(",");
		String[] ActivityTypevalue = ActivityType.split(",");
		String[] ActivityLevelvalue = ActivityLevel.split(",");
		String[] TrackingTypevalue = TrackingType.split(",");
		String[] TrackingStatevalue = TrackingState.split(",");

		Commonactions.isElementPresent(co.getNewtemplateactivitybtn());
		ca.click(co.getNewtemplateactivitybtn());
		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[0]);
		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[0]);
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(co.getActivityLevel());
		ca.insertText(co.getActivityLevel(), ActivityLevelvalue[0]);
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[1]);
		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[1]);
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(co.getTrackingType());
		ca.insertText(co.getTrackingType(), TrackingTypevalue[0]);
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(co.getTrackingstate());
		ca.insertText(co.getTrackingstate(), TrackingStatevalue[0]);
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(co.getMatchAll());
		ca.click(co.getMatchAll());
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[2]);
		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[1]);
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(co.getTrackingType());
		ca.insertText(co.getTrackingType(), TrackingTypevalue[1]);
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(co.getTrackingstate());
		ca.insertText(co.getTrackingstate(), TrackingStatevalue[0]);
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(co.getMatchAll());
		ca.click(co.getMatchAll());
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();


		Commonactions.isElementPresent(co.getActivityType());
		ca.insertText(co.getActivityType(), ActivityTypevalue[2]);
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(co.getPredecessors());
		ca.insertText(co.getPredecessors(),"Manual");
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//span[text()='Manual']//parent::label//parent::div/div/input")));
		ca.eleToBeClickable();	
		Commonactions.isElementPresent(co.getTemplateactivity());
		ca.insertText(co.getTemplateactivity(), TempActivityvalue[3]);
		ca.eleToBeClickable();
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Manual Track, Activity created");
	}

	@Then("Go to homepage and create master calendar")
	public void go_to_homepage_and_create_master_calendar()throws Throwable {
		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getStyleBtn());
		ca.click(hp.getStyleBtn());
		Commonactions.isElementPresent(st.getStyles_Btn());
		ca.click(st.getStyles_Btn());
		ca.eleToBeClickable();

		for(int i=0;i<100;i++)
		{
			ca.click(cp.getStyleslider());			
		}
		Commonactions.isElementPresent(cp.getWinterseason());
		ca.click(cp.getWinterseason());

		Commonactions.isElementPresent(cp.getMastercalander());
		ca.click(cp.getMastercalander());
		Commonactions.isElementPresent(cp.getTemplatecalendaraction());
		ca.click(cp.getTemplatecalendaraction());
		Commonactions.isElementPresent(cp.getCalendarseasoncheckbox());
		ca.click(cp.getCalendarseasoncheckbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("master calendar created");
	}

	@Then("user enter date for calendar season")
	public void user_enter_date_for_calendar_season() throws Throwable {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
		LocalDateTime now = LocalDateTime.now();  
		date = dtf.format(now);

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Calendar c1 = Calendar.getInstance();
		c1.setTime(sdf.parse(date));
		System.out.println(date);
		c1.add(Calendar.DAY_OF_MONTH, 1);  
		futuredate = sdf.format(c1.getTime());  
		System.out.println("Date after Addition: "+futuredate);

		c1.add(Calendar.DAY_OF_MONTH, -3);  
		pastdate = sdf.format(c1.getTime());  
		System.out.println("Date after sub: "+pastdate);

		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getStyleBtn());
		ca.click(hp.getStyleBtn());
		Commonactions.isElementPresent(st.getStyles_Btn());
		ca.click(st.getStyles_Btn());
		ca.eleToBeClickable();

		for(int i=0;i<100;i++)
		{
			ca.click(cp.getStyleslider());			
		}
		Commonactions.isElementPresent(cp.getWinterseason());
		ca.click(cp.getWinterseason());

		Commonactions.isElementPresent(cp.getMastercalander());
		ca.click(cp.getMastercalander());
		Commonactions.isElementPresent(cp.getCalendarseasonlink());
		ca.click(cp.getCalendarseasonlink());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cp.getTargetdatemanual());
		ca.click(cp.getTargetdatemanual());
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		e1.sendKeys(pastdate);
		ca.eleToBeClickable();
		e1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();
		ca.accept_Alert();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cp.getTargetdatemilestone());
		ca.click(cp.getTargetdatemilestone());
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		e2.sendKeys(futuredate);
		ca.eleToBeClickable();
		e2.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();
		ca.accept_Alert();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cp.getTargetdateartwork());

		ca.click(cp.getTargetdateartwork());
		ca.eleToBeClickable();
		WebElement e3 = ca.activeElement();
		ca.eleToBeClickable();
		e3.sendKeys(futuredate);
		ca.eleToBeClickable();
		e3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();
		ca.accept_Alert();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getTargetdateidswork());

		ca.click(cp.getTargetdateidswork());
		ca.eleToBeClickable();
		WebElement e4 = ca.activeElement();
		ca.eleToBeClickable();
		e4.sendKeys(futuredate);
		ca.eleToBeClickable();
		e4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();
		ca.accept_Alert();
		ca.eleToBeClickable();
		System.out.println("user entered date for calendar season");
	}


	@And("user modify the manual date and approves it")
	public void user_modify_the_manual_date_and_approves_it() throws Throwable {

		Commonactions.isElementPresent(cp.getWinterseasonlink());
		ca.click(cp.getWinterseasonlink());
		Commonactions.isElementPresent(cp.getPropagatenewcheckbox());
		ca.click(cp.getPropagatenewcheckbox());
		Commonactions.isElementPresent(cp.getThreedotline());
		ca.click(cp.getThreedotline());
		Commonactions.isElementPresent(cp.getFreeze());
		ca.click(cp.getFreeze());
		Commonactions.isElementPresent(cp.getThreedotline());
		ca.click(cp.getThreedotline());
		Commonactions.isElementPresent(cp.getApplycalendar());
		ca.click(cp.getApplycalendar());
		Commonactions.isElementPresent(cp.getColorsizecheckbox());
		ca.click(cp.getColorsizecheckbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("freeze and apply calendar has done");
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getStyleBtn());
		ca.click(hp.getStyleBtn());
		Commonactions.isElementPresent(st.getStyles_Btn());
		ca.click(st.getStyles_Btn());
		for(int i=0;i<100;i++)
		{
			ca.click(cp.getStyleslider());			
		}
		Commonactions.isElementPresent(cp.getDenimseason());
		ca.click(cp.getDenimseason());
		ca.eleToBeClickable();
		ca.click(cp.getBrandcalendartab());
		ca.eleToBeClickable();
		for(int i=0;i<5;i++)
		{
			try
			{
				driver.navigate().refresh();
				Commonactions.isElementPresent(cp.getCalendarseasonlink());
				ca.click(cp.getCalendarseasonlink());
				ca.eleToBeClickable();
			}
			catch(Exception e){	}
		}
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getStyleheirarchytab());
		ca.click(cp.getStyleheirarchytab());
		Commonactions.isElementPresent(cp.getManualdate());
		ca.click(cp.getManualdate());
		ca.eleToBeClickable();
		WebElement e5 = ca.activeElement();
		ca.eleToBeClickable();
		e5.sendKeys(date);
		ca.eleToBeClickable();
		e5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		ca.click(cp.getStyleheirarchytab());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getStyleheirarchytab());
		ca.click(cp.getStyleheirarchytab());
		ca.eleToBeClickable();

		//		for(int i=0;i<50;i++)
		//		{
		//			ca.click(cp.getCalendarslider());
		//		}

		Commonactions.isElementPresent(cp.getMilestonedate());
		ca.click(cp.getMilestonedate());
		ca.eleToBeClickable();
		WebElement e6 = ca.activeElement();
		ca.eleToBeClickable();
		e6.sendKeys(date);
		ca.eleToBeClickable();
		e6.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getStyleheirarchytab());
		ca.click(cp.getStyleheirarchytab());
		ca.eleToBeClickable();

		driver.navigate().refresh();
		ca.eleToBeClickable();
		System.out.println("user modify the manual date and milestone date");

	}

	@Then("user navigates into Artwork tab and creates {string}")
	public void user_navigates_into_Artwork_tab_and_creates(String artworkname) throws Throwable {
		ca.click(cp.getStyleheirarchytab());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getApparelcolorsize());
		ca.click(cp.getApparelcolorsize());
		Commonactions.isElementPresent(cp.getSpecificationtab());
		ca.click(cp.getSpecificationtab());
		Commonactions.isElementPresent(cp.getArtworktab());
		ca.click(cp.getArtworktab());
		Commonactions.isElementPresent(cp.getNewartworkaction());
		ca.click(cp.getNewartworkaction());
		ca.eleToBeClickable();

		WebElement e7 = ca.activeElement();
		ca.eleToBeClickable();
		e7.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		e7.sendKeys(artworkname);
		ca.eleToBeClickable();
		e7.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getArtworkcheckcircle());
		ca.click(cp.getArtworkcheckcircle());
		ca.eleToBeClickable();
		System.out.println("Artwork Created");


	}

	@Then("user navigates into Image tab and creates {string}")
	public void user_navigates_into_Image_tab_and_creates(String ldsname) throws Throwable {

		Commonactions.isElementPresent(cp.getImagetab());
		ca.click(cp.getImagetab());
		Commonactions.isElementPresent(cp.getImagedatasheetaction());
		ca.click(cp.getImagedatasheetaction());
		ca.eleToBeClickable();

		WebElement e8 = ca.activeElement();
		ca.eleToBeClickable();
		e8.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		e8.sendKeys(ldsname);
		ca.eleToBeClickable();
		e8.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getCalendardatasheetcircle());
		ca.click(cp.getCalendardatasheetcircle());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getCalendardatasheetcircle());
		ca.click(cp.getCalendardatasheetcircle());
		ca.eleToBeClickable();
		System.out.println("Image sheet created ");
	}

	@Then("user select calendar season under style denim and verify the screen")
	public void user_select_calendar_season_under_style_denim_and_verify_the_screen() throws Throwable {

		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getStyleBtn());
		ca.click(hp.getStyleBtn());
		Commonactions.isElementPresent(st.getStyles_Btn());
		ca.click(st.getStyles_Btn());
		ca.eleToBeClickable();
		for(int i=0;i<100;i++)
		{
			ca.click(cp.getStyleslider());			
		}
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getDenimseason());
		ca.eleToBeClickable();
		ca.click(cp.getDenimseason());
		ca.eleToBeClickable();
		ca.click(cp.getBrandcalendartab());
		ca.eleToBeClickable();
		try{
			Commonactions.isElementPresent(cp.getCalendarseasonlink());
			ca.click(cp.getCalendarseasonlink());
			ca.eleToBeClickable();
		}
		catch(Exception e)
		{
			driver.navigate().refresh();
			ca.eleToBeClickable();
			Commonactions.isElementPresent(cp.getCalendarseasonlink());
			ca.click(cp.getCalendarseasonlink());
		}
		System.out.println("calendar season link present");
	}

	@Then("user create material sku under material {string}")
	public void user_create_material_sku_under_material(String materialsku) throws Throwable {
		ca.click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(hp.getMaterialBtn());
		ca.click(hp.getMaterialBtn());
		Commonactions.isElementPresent(sm.getCottonName());
		ca.click(sm.getCottonName());
		Commonactions.isElementPresent(hp.getMaterialBtn());
		ca.click(hp.getMaterialBtn());
		Commonactions.isElementPresent(cp.getSKU());
		ca.click(cp.getSKU());
		Commonactions.isElementPresent(cp.getNew_mat_sku_Btn());
		ca.click(cp.getNew_mat_sku_Btn());
		Commonactions.isElementPresent(cp.getMat_sku_value());
		ca.insertText(cp.getMat_sku_value(), materialsku);
		Commonactions.isElementPresent(cp.getUseMatrix_chkBox());
		ca.click(cp.getUseMatrix_chkBox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Material SKU created for calendar");

		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(hp.getMaterialBtn());
		ca.click(hp.getMaterialBtn());
		Commonactions.isElementPresent(cp.getMaterialsecutab());
		ca.click(cp.getMaterialsecutab());
		Commonactions.isElementPresent(cp.getMaterialmsgstandalone());
		ca.click(cp.getMaterialmsgstandalone());
		Commonactions.isElementPresent(cp.getMaterialstab());
		ca.click(cp.getMaterialstab());
		Commonactions.isElementPresent(cp.getMaterialdownarrow());
		ca.click(cp.getMaterialdownarrow());
		Commonactions.isElementPresent(cp.getAddmaterials());
		ca.click(cp.getAddmaterials());
		Commonactions.isElementPresent(cp.getCotraychkbox());
		ca.click(cp.getCotraychkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Material Added to calendae cotton rayon jersey");

		Commonactions.isElementPresent(cp.getMastercalander());
		ca.click(cp.getMastercalander());
		Commonactions.isElementPresent(cp.getTemplatecalendaraction());
		ca.click(cp.getTemplatecalendaraction());
		Commonactions.isElementPresent(cp.getCalendarseasoncheckbox());
		ca.click(cp.getCalendarseasoncheckbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Calendar MSG created under Material");
	}

	@Then("user select calendar enter date for the calendar season")
	public void user_select_calendar_enter_date_for_the_calendar_season() throws Throwable {

		Commonactions.isElementPresent(cp.getCalendarmsgname());
		ca.click(cp.getCalendarmsgname());
		Commonactions.isElementPresent(cp.getMastercalrefresh());
		ca.click(cp.getMastercalrefresh());	
		Commonactions.isElementPresent(cp.getTargetdatemanual());
		ca.click(cp.getTargetdatemanual());
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		a1.sendKeys(pastdate);
		ca.eleToBeClickable();
		a1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();
		ca.accept_Alert();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cp.getTargetbomtrack());
		ca.click(cp.getTargetbomtrack());
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		a2.sendKeys(futuredate);
		ca.eleToBeClickable();
		a2.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();
		ca.accept_Alert();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cp.getTargetcdstrack());
		ca.click(cp.getTargetcdstrack());
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		a3.sendKeys(futuredate);
		ca.eleToBeClickable();
		a3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();
		ca.accept_Alert();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cp.getTargettestrun());
		ca.click(cp.getTargettestrun());
		ca.eleToBeClickable();
		WebElement a4 = ca.activeElement();
		ca.eleToBeClickable();
		a4.sendKeys(futuredate);
		ca.eleToBeClickable();
		a4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();
		ca.accept_Alert();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cp.getTargetdatemilestone());
		ca.click(cp.getTargetdatemilestone());
		ca.eleToBeClickable();
		WebElement a5 = ca.activeElement();
		ca.eleToBeClickable();
		a5.sendKeys(futuredate);
		ca.eleToBeClickable();
		a5.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();
		ca.accept_Alert();
		ca.eleToBeClickable();
		System.out.println("user entered calendar date for the calendar-MSG under Material standalone");
	}

	@Then("user freeze and apply calendar")
	public void user_freeze_and_apply_calendar() throws Throwable {
		Commonactions.isElementPresent(cp.getMsgstandalonelink());
		ca.click(cp.getMsgstandalonelink());
		Commonactions.isElementPresent(cp.getCalendarmsgchkbox());
		ca.click(cp.getCalendarmsgchkbox());
		Commonactions.isElementPresent(cp.getThreedotcalmsg());
		ca.click(cp.getThreedotcalmsg());
		Commonactions.isElementPresent(cp.getFreeze());
		ca.click(cp.getFreeze());
		ca.eleToBeClickable();

		/*for(int i=0;i<50;i++)
		{
		ca.click(cp.getMastercalslider());
		}*/
		Commonactions.isElementPresent(cp.getThreedotcalmsg());
		ca.click(cp.getThreedotcalmsg());
		Commonactions.isElementPresent(cp.getApplycalendar());
		ca.click(cp.getApplycalendar());
		Commonactions.isElementPresent(cp.getCottonrayon());
		ca.click(cp.getCottonrayon());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		for(int i=0;i<10;i++)
		{
			Commonactions.isElementPresent(cp.getRefreshmastercalpg());
			ca.click(cp.getRefreshmastercalpg());
			ca.eleToBeClickable();
			ca.eleToBeClickable();
			WebElement create = driver.findElement(By.xpath("//td[contains(text(),'Create')]"));
			String status = create.getText();
			if(status.contains("succeeded"))
			{
				System.out.println(status +" calendar status");
				break;
			}
		}
		System.out.println("verified Applied calendar is succeeded or not");
	}

	@Then("user edit manual date under material activities")
	public void user_edit_manual_date_under_material_activities() throws Throwable {
		Commonactions.isElementPresent(cp.getMaterialstab());
		ca.click(cp.getMaterialstab());
		Commonactions.isElementPresent(cp.getCotrayjersey());
		ca.click(cp.getCotrayjersey());
		Commonactions.isElementPresent(cp.getBrandcalendartab());
		ca.click(cp.getBrandcalendartab());
		Commonactions.isElementPresent(cp.getCalendarmsgname());
		ca.click(cp.getCalendarmsgname());
		ca.eleToBeClickable();
		/*ca.click(driver.findElement(By.xpath("//span[contains(@data-csi-automation,'plugin-Calendar-CalendarActivities-refresh')]//span[text()='refresh']")));	
		ca.eleToBeClickable();*/
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(hp.getMaterialBtn());
		ca.click(hp.getMaterialBtn());
		Commonactions.isElementPresent(cp.getMaterialsecutab());
		ca.click(cp.getMaterialsecutab());
		Commonactions.isElementPresent(cp.getMaterialmsgstandalone());
		ca.click(cp.getMaterialmsgstandalone());
		Commonactions.isElementPresent(cp.getBrandcalendartab());
		ca.click(cp.getBrandcalendartab());
		Commonactions.isElementPresent(cp.getCalendarmsgname());
		ca.click(cp.getCalendarmsgname());
		Commonactions.isElementPresent(cp.getActivitiestab());
		ca.click(cp.getActivitiestab());
		ca.eleToBeClickable();
		for(int i=0;i<50;i++)
		{
			/*boolean displayed = driver.findElement(By.xpath("(//div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div)[2]")).isDisplayed();
			if(displayed==true)
			{
				driver.findElement(By.xpath("(//div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div)[2]")).click();
			}*/
			boolean displayed1 = driver.findElement(By.xpath("(//div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div)[1]")).isDisplayed();
			if(displayed1==true)
			{
				driver.findElement(By.xpath("(//div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div)[1]")).click();
			}
		}
		Commonactions.isElementPresent(cp.getCalmanualcompdate());
		ca.click(cp.getCalmanualcompdate());
		ca.eleToBeClickable();
		WebElement a6 = ca.activeElement();
		ca.eleToBeClickable();
		a6.sendKeys(date);
		ca.eleToBeClickable();
		a6.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();
		ca.accept_Alert();
		ca.eleToBeClickable();
		System.out.println("manual date entered for calendar-msg under Material");
	}
	@Then("user navigates MSGSTANDALONE creates BOM and approves it {string}")
	public void user_navigates_MSGSTANDALONE_creates_BOM_and_approves_it(String bomname) throws Throwable {
		Commonactions.isElementPresent(cp.getMsgstandalonelink());
		ca.click(cp.getMsgstandalonelink());
		Commonactions.isElementPresent(cp.getMaterialstab());
		ca.click(cp.getMaterialstab());
		Commonactions.isElementPresent(cp.getCotrayjersey());
		ca.click(cp.getCotrayjersey());
		Commonactions.isElementPresent(cp.getSpecificationtab());
		ca.click(cp.getSpecificationtab());
		Commonactions.isElementPresent(cp.getBomtab());
		ca.click(cp.getBomtab());
		Commonactions.isElementPresent(cp.getActionmatbom());
		ca.click(cp.getActionmatbom());
		Commonactions.isElementPresent(cp.getMatbominput());
		ca.insertText(cp.getMatbominput(), bomname);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		try
		{   ca.click(cp.getCalbomenable());  }
		catch(Exception e)
		{   ca.click(cp.getCalbomenable2());   }
		System.out.println("Calendar BOM approved");
	}
	@Then("user approves created MDS and MCDS {string},{string}")
	public void user_approves_created_MDS_and_MCDS(String mdsvalue, String mcdsvalue) throws Throwable {
		Commonactions.isElementPresent(cp.getMDStab());
		ca.click(cp.getMDStab());
		Commonactions.isElementPresent(cp.getActionMDS());
		ca.click(cp.getActionMDS());
		ca.eleToBeClickable();
		WebElement a7 = ca.activeElement();
		a7.sendKeys(mdsvalue);
		ca.eleToBeClickable();
		a7.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getThreedotcalMDS());
		ca.click(cp.getThreedotcalMDS());
		Commonactions.isElementPresent(cp.getApprove());
		ca.click(cp.getApprove());
		ca.eleToBeClickable();
		System.out.println("MDS created and approved");
		Commonactions.isElementPresent(cp.getActionMCDS());
		ca.click(cp.getActionMCDS());
		Commonactions.isElementPresent(cp.getColorvalue());
		ca.insertText(cp.getColorvalue(), mcdsvalue);
		co.jsMouseOver();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getEgrchkcircle());
		ca.click(cp.getEgrchkcircle());
		ca.eleToBeClickable();
		System.out.println("MCDS created and approved");
	}

	@Then("create calendar po template for order po group")
	public void create_calendar_po_template_for_order_po_group() throws Throwable {
		Commonactions.isElementPresent(cp.getSourcingtab());
		ca.click(cp.getSourcingtab());
		Commonactions.isElementPresent(cp.getSuppotab());
		ca.click(cp.getSuppotab());
		Commonactions.isElementPresent(cp.getPogrptab());
		ca.click(cp.getPogrptab());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getOrdpogrp());
		ca.click(cp.getOrdpogrp());
		ca.eleToBeClickable();		
		ca.click(cp.getMastercalander());		
		Commonactions.isElementPresent(cp.getTemplatecalendaraction());
		ca.click(cp.getTemplatecalendaraction());		
		Commonactions.isElementPresent(cp.getCalpochkbox());
		ca.click(cp.getCalpochkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("created calendar po within order po group");
	}

	@Then("Navigate to calendarpo and enter date for the calendar")
	public void navigate_to_calendarpo_and_enter_date_for_the_calendar()throws Throwable {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
		LocalDateTime now = LocalDateTime.now();  
		date = dtf.format(now);

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Calendar c1 = Calendar.getInstance();
		c1.setTime(sdf.parse(date));
		System.out.println(date);
		c1.add(Calendar.DAY_OF_MONTH, 1);  
		futuredate = sdf.format(c1.getTime());  
		System.out.println("Date after Addition: "+futuredate);

		c1.add(Calendar.DAY_OF_MONTH, -3);  
		pastdate = sdf.format(c1.getTime());  
		System.out.println("Date after sub: "+pastdate);

		Commonactions.isElementPresent(cp.getCalpopropagchk());
		ca.click(cp.getCalpopropagchk());		
		Commonactions.isElementPresent(cp.getCalandarpo());
		ca.click(cp.getCalandarpo());
		ca.click(cp.getManualtardate());
		ca.eleToBeClickable();
		WebElement x1 = ca.activeElement();
		ca.eleToBeClickable();
		x1.sendKeys(pastdate);
		ca.eleToBeClickable();
		ca.click(cp.getActivitiestab());
		ca.eleToBeClickable();

		ca.click(cp.getStyrevtardate());
		ca.eleToBeClickable();
		WebElement x2 = ca.activeElement();
		ca.eleToBeClickable();
		x2.sendKeys(futuredate);
		ca.eleToBeClickable();
		ca.click(cp.getActivitiestab());
		ca.eleToBeClickable();

		ca.click(cp.getSizechartardate());
		ca.eleToBeClickable();
		WebElement x3 = ca.activeElement();
		ca.eleToBeClickable();
		x3.sendKeys(futuredate);
		ca.eleToBeClickable();
		ca.click(cp.getActivitiestab());
		ca.eleToBeClickable();

		ca.click(cp.getMiltardate());
		ca.eleToBeClickable();
		WebElement x4 = ca.activeElement();
		ca.eleToBeClickable();
		x4.sendKeys(futuredate);
		ca.eleToBeClickable();
		ca.click(cp.getActivitiestab());
		ca.eleToBeClickable();
		System.out.println("date applied for the respected activity ");
	}
	@Then("user freeze and apply calendar for the data")
	public void user_freeze_and_apply_calendar_for_the_data()throws Throwable  {
		Commonactions.isElementPresent(cp.getOrderpogrplink());
		ca.click(cp.getOrderpogrplink());
		Commonactions.isElementPresent(cp.getMastercalander());
		ca.click(cp.getMastercalander());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getCalpothreedot());
		ca.click(cp.getCalpothreedot());
		Commonactions.isElementPresent(cp.getFreeze());
		ca.click(cp.getFreeze());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getCalpothreedot());
		ca.click(cp.getCalpothreedot());
		Commonactions.isElementPresent(cp.getApplycalendar());
		ca.click(cp.getApplycalendar());
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(cp.getPocolorbasedchkbox());
		ca.click(cp.getPocolorbasedchkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());	
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		for(int i=0;i<20;i++)
		{
			try
			{
				Commonactions.isElementPresent(cp.getMastercalporefresh());
				ca.click(cp.getMastercalporefresh());
				ca.eleToBeClickable();
				ca.eleToBeClickable();
				WebElement create = driver.findElement(By.xpath("//td[contains(text(),'Create')]"));
				String status = create.getText();
				if(status.contains("succeeded"))
				{
					System.out.println(status +" calendar status");
					System.out.println("status viewed as succeeded");
					break;
				}}
			catch(Exception e){}
		}

		Commonactions.isElementPresent(cp.getBrandcalendartab());
		ca.click(cp.getBrandcalendartab());

		for(int j=0;j<10;j++)
		{
			try{
				driver.navigate().refresh();
				Commonactions.isElementPresent(cp.getCalandarpo());
				ca.click(cp.getCalandarpo());

				List<WebElement> heirarchy = driver.findElements(By.xpath("(//span[@data-csi-tab-name='Hierarchy' or text()='Hierarchy'])"));
				for(int i=1;i<=heirarchy.size();i++)
				{
					WebElement hrchy = driver.findElement(By.xpath("(//span[@data-csi-tab-name='Hierarchy' or text()='Hierarchy'])["+i+"]"));
					boolean displayed = hrchy.isDisplayed();
					if(displayed==true)
					{
						ca.click(hrchy);
						break;
					}
				}}
			catch(Exception e){}
		}
		try
		{
			WebElement hrchy = driver.findElement(By.xpath("(//span[@data-csi-tab-name='Hierarchy' or text()='Hierarchy'])[3]"));
			hrchy.click();
		}
		catch(Exception e){		}
		Commonactions.isElementPresent(cp.getOrdpotardate());
		ca.click(cp.getOrdpotardate());
		ca.eleToBeClickable();
		WebElement t1 = ca.activeElement();
		ca.eleToBeClickable();
		t1.sendKeys(pastdate);
		ca.eleToBeClickable();        
		ca.click(cp.getCalporefresh());
		ca.eleToBeClickable();
		System.out.println("date assigned for orderpo target");
	}
	@Then("Navigate to style create review {string}")
	public void navigate_to_style_create_review(String string)throws Throwable {
		Commonactions.isElementPresent(cp.getBackarrowbtn());
		ca.click(cp.getBackarrowbtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getApparelcolsize());
		ca.click(cp.getApparelcolsize());
		Commonactions.isElementPresent(cp.getSpecificationtab());
		ca.click(cp.getSpecificationtab());
		Commonactions.isElementPresent(cp.getReviewtab());
		ca.click(cp.getReviewtab());
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(cp.getStylerevaction());
		ca.click(cp.getStylerevaction());
		ca.eleToBeClickable();
		WebElement y1 = ca.activeElement();
		ca.eleToBeClickable();
		y1.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(y1,"Calendar Style Review");
		ca.eleToBeClickable();
		y1.sendKeys(Keys.TAB);
		System.out.println("review created");
		Commonactions.isElementPresent(cp.getCalstylerevthreedot());
		ca.click(cp.getCalstylerevthreedot());		
		Commonactions.isElementPresent(cp.getApprove());
		ca.click(cp.getApprove());
		Commonactions.isElementPresent(cp.getCalstylerevthreedot());
		ca.click(cp.getCalstylerevthreedot());
		Commonactions.isElementPresent(cp.getIterate());
		ca.click(cp.getIterate());
		Commonactions.isElementPresent(cp.getCalstylrevdelete());
		ca.click(cp.getCalstylrevdelete());
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());
		ca.eleToBeClickable();
		System.out.println("Successfully iterated and deleted the review");
	}
}

