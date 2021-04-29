package com.centric.stepdefinition;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.PopupPage;
import com.centric.objectrepository.UserManagementPage;
import com.centric.resources.Commonactions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UsrMgmntPageSteps extends Commonactions{
	
	Commonactions ca = new Commonactions();
	PopupPage pp = new PopupPage();
	UserManagementPage up = new UserManagementPage();
	
	@When("User creates new admin role {string}")
	public void user_creates_new_admin_role(String arg1) throws Throwable {
		
		ca.eleToBeClickable();
		ca.click(up.getNew_role_Btn());
		ca.eleToBeClickable();
		ca.insertText(pp.getUsrMgmnt_NewRole_Value(), arg1);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		
		System.out.println("creating admin role");
	    
	}

	@When("User select security roles in the action coloumn")
	public void user_select_security_roles_in_the_action_coloumn() throws Throwable {
	    
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_MoreOptions());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_SecurityRoles());
		ca.eleToBeClickable();
		
		System.out.println("security roles selected");
		
	}

	@When("User click on custom view and copy the default custom view and name the custom view as {string}")
	public void user_click_on_custom_view_and_copy_the_default_custom_view_and_name_the_custom_view_as(String arg1) throws Throwable {
	    
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Views());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Manage_Views());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Copy());
		ca.eleToBeClickable();
		ca.insertText(up.getUsrMgmt_Copy_Value(), arg1);
		ca.eleToBeClickable();
		
		
	}

	@When("User apply the filter conditions as {string},{string},{string}")
	public void user_apply_the_filter_conditions_as(String arg1, String arg2, String arg3) throws Throwable {
		
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Filter());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Add());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Attribute());
		ca.insertText(up.getUsrMgmt_Attribute(), arg1);
		ca.eleToBeClickable();
        ca.jsMouseOver();
        ca.eleToBeClickable();
        ca.click(up.getUsrMgmt_Operator());
        ca.insertText(up.getUsrMgmt_Operator(), arg2);
        ca.eleToBeClickable();
        ca.jsMouseOver();
        ca.eleToBeClickable();
        ca.click(up.getUsrMgmt_Value());
        ca.insertText(up.getUsrMgmt_Value(), arg3);
        ca.eleToBeClickable();
        
        System.out.println("filter condition applied successfully");
	    
		
	}

	@When("User set results display size as {string}")
	public void user_set_results_display_size_as(String arg1) throws Throwable {
	    
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Options());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_ResultsSize());
		ca.insertText(up.getUsrMgmt_ResultsSize(), arg1);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save'])[2]")));
		ca.eleToBeClickable();
		
	}

	@Then("User verify the displaying results size are more than {int}")
	public void user_verify_the_displaying_results_size_are_more_than(Integer int1) throws Throwable {
	    
		String text = Commonactions.getText(driver.findElement(By.xpath("(//div[text()='Displaying 70 results'])")));
		ca.eleToBeClickable();
		if(text.equals("Displaying 70 results")){
			ca.eleToBeClickable();
			ca.click(up.getUsrMgmt_All());
			ca.eleToBeClickable();
		}
		
	}

	@Then("User select all results and click on save button")
	public void user_select_all_results_and_click_on_save_button() throws Throwable {
	    
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save'])[1]")));
		ca.eleToBeClickable();
		
		System.out.println("all results are selected");
	}
	
	
	
	@When("User creates new announcement and edit message {string}")
	public void user_creates_new_announcement_and_edit_message(String string) throws Throwable {
		
		ca.eleToBeClickable();
		ca.click(up.getNew_Ancmnt_Btn());
		ca.eleToBeClickable();
		Commonactions.mouseOver(up.getUsrMgmt_Ancmnts_Msg());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Ancmnts_Edit());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Ancmnts_EditMsg_value());
		ca.eleToBeClickable();
		String[] split = string.split(">");
		ca.eleToBeClickable();
		ca.insertText(up.getUsrMgmt_Ancmnts_EditMsg_value(), split[0]);
		ca.eleToBeClickable();
		Actions a = new Actions(driver);
		ca.eleToBeClickable();
		a.click(up.getUsrMgmt_Ancmnts_EditMsg_value());
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		ca.eleToBeClickable();
		int j = split[0].length();
		ca.eleToBeClickable();
		for (int i = 0; i < j; i++) {
			//ca.eleToBeClickable();
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_LEFT);
			
		}
		for (int i = 0; i < j; i++) {
			//ca.eleToBeClickable();
			Thread.sleep(500);
			r.keyRelease(KeyEvent.VK_LEFT);
			
		}
		r.keyRelease(KeyEvent.VK_SHIFT);
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Ancmnts_Bold());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Ancmnts_FontSize());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Ancmnts_FontSize_30());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Ancmnts_Color());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Ancmnts_purpleColor());
		ca.eleToBeClickable();

		up.getUsrMgmt_Ancmnts_EditMsg_value().sendKeys(Keys.ENTER);
		ca.eleToBeClickable();
		up.getUsrMgmt_Ancmnts_EditMsg_value().sendKeys(Keys.ENTER);
		ca.eleToBeClickable();
		up.getUsrMgmt_Ancmnts_EditMsg_value().sendKeys(Keys.ENTER);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//div[@class='fr-element fr-view']/p)[3]")));
		ca.insertText(driver.findElement(By.xpath("(//div[@class='fr-element fr-view']/p)[3]")), split[1]);
		ca.eleToBeClickable();
		a.click(up.getUsrMgmt_Ancmnts_EditMsg_value());
		r.keyPress(KeyEvent.VK_SHIFT);
		ca.eleToBeClickable();
		int k = split[1].length();
		ca.eleToBeClickable();
		for (int i = 0; i < k; i++) {
		//	ca.eleToBeClickable();
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_LEFT);
			
		}
		for (int i = 0; i < k; i++) {
			//ca.eleToBeClickable();
			Thread.sleep(500);
			r.keyRelease(KeyEvent.VK_LEFT);
			
		}
		r.keyRelease(KeyEvent.VK_SHIFT);
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Ancmnts_Bold());
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,100)", "");
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save'])")));
		ca.eleToBeClickable();
		
		System.out.println("message edited successfully");
		
	}

	@When("User effective to and companies")
	public void user_effective_to_and_companies() throws Throwable {
		
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Ancmnts_EffectiveTo());
		//System.out.println("company selected");
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Ancmnts_CurrentDate());
		ca.eleToBeClickable();
		System.out.println("date selected");
		ca.click(up.getUsrMgmt_Ancmnts_Companies());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Ancmnts_HostCompanies());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//td[@data-csi-heading='Companies::0']//following-sibling::td[contains(@class,'extra-column')]")));
		ca.eleToBeClickable();
		
		System.out.println("company selected");
	    
	}
	
	HomePage hp = new HomePage();

	@Then("User validating the announcement is displaying in home page or not")
	public void user_validating_the_announcement_is_displaying_in_home_page_or_not() throws Throwable {
		
		ca.eleToBeClickable();
		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();
		Commonactions.jsWaitForPageLoad();
		String text = Commonactions.getText(driver.findElement(By.xpath("//div[contains(@class,'fr-view') and @data-csi-heading='Message::0']")));
	    System.out.println(text); 
	    
	    System.out.println("announcement message validate successfully");
	}


}
