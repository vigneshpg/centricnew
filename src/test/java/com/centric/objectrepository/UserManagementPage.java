package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class UserManagementPage extends Commonactions{
	
	public UserManagementPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@data-csi-tab-name='User Management' or text()='User Management']")
	private WebElement UsrManagement;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Roles' or text()='Roles']")
	private WebElement usrMgmt_Roles;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'Roles')]//div/div)[2]")
	private WebElement new_role_Btn;
	
	@FindBy(xpath="(//span[contains(@data-csi-automation,'actions-Site-Roles')]/span/span/span)[1]")
	private WebElement usrMgmt_MoreOptions;
	
	@FindBy(xpath="((//table[contains(@data-csi-automation,'actions-Site-Roles')]/tbody/tr)[1]/td)[2]")
	private WebElement usrMgmt_SecurityRoles;
	
	@FindBy(xpath="//span[contains(@data-csi-automation,'SecurityRolesAndGroups-CustomViewActions')]")
	private WebElement usrMgmt_Views;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-Role-SecurityRolesAndGroups-CustomViewActions']//tr[contains(@data-csi-act,'CustomViewManage')]")
	private WebElement usrMgmt_Manage_Views;
	
	@FindBy(xpath="//span[@widgetid='prefCopy']/span")
	private WebElement usrMgmt_Copy;
	
	@FindBy(xpath="//input[@id='prefName']")
	private WebElement usrMgmt_Copy_Value;
	
	@FindBy(xpath="(((//div[@id='customViewsTabContainer']/div)[1]/div)[4]/div/div)[2]")
	private WebElement usrMgmt_Filter;
	
	@FindBy(xpath="(//span[@title='Add'])[1]")
	private WebElement usrMgmt_Add;
	
	@FindBy(xpath="(//td[@role='gridcell']//input[@aria-autocomplete='both'])[1]")
	private WebElement usrMgmt_Attribute;
	
	@FindBy(xpath="(//td[@role='gridcell']//input[@aria-autocomplete='both'])[2]")
	private WebElement usrMgmt_Operator;
	
	@FindBy(xpath="(//td[@role='gridcell']//input[@aria-autocomplete='list'])")
	private WebElement usrMgmt_Value;
	
	@FindBy(xpath="(((//div[@id='customViewsTabContainer']/div)[1]/div)[4]/div/div)[6]")
	private WebElement usrMgmt_Options;
	
	@FindBy(xpath="(//input[@id='querySize'])[1]")
	private WebElement usrMgmt_ResultsSize;
	
	@FindBy(xpath="//input[@title='Toggle selections of all displayed items']")
	private WebElement usrMgmt_All;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Announcements' or text()='Announcements']")
	private WebElement usrMgmt_Ancmnts;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'Announcement')]//div/div)[2]")
	private WebElement new_Ancmnt_Btn;
	
	@FindBy(xpath="//td[contains(@class,'firstColumn') and @data-csi-heading='Message::0']")
	private WebElement usrMgmt_Ancmnts_Msg;
	
	@FindBy(xpath="//a[@data-csi-context-parent-attr='Announcements']")
	private WebElement usrMgmt_Ancmnts_Edit;
	
	@FindBy(xpath="//div[@class='fr-element fr-view']")
	private WebElement usrMgmt_Ancmnts_EditMsg_value;
	
	@FindBy(xpath="//button[@data-cmd='bold']")
	private WebElement usrMgmt_Ancmnts_Bold;
	
	@FindBy(xpath="//button[@data-cmd='fontSize']")
	private WebElement usrMgmt_Ancmnts_FontSize;
	
	@FindBy(xpath="//a[@data-cmd='fontSize' and @title='30']")
	private WebElement usrMgmt_Ancmnts_FontSize_30;
	
	@FindBy(xpath="//button[@data-cmd='textColor']")
	private WebElement usrMgmt_Ancmnts_Color;
	
	@FindBy(xpath="(//span[@data-cmd='applytextColor'])[5]")
	private WebElement usrMgmt_Ancmnts_purpleColor;
	
	@FindBy(xpath="//td[@data-csi-heading='EffectiveTo::0']")
	private WebElement usrMgmt_Ancmnts_EffectiveTo;
	
	@FindBy(xpath="//td[contains(@class,'CurrentDate')]")
	private WebElement usrMgmt_Ancmnts_CurrentDate;
	
	@FindBy(xpath="//td[@data-csi-heading='Companies::0']")
	private WebElement usrMgmt_Ancmnts_Companies;
	
	@FindBy(xpath="//input[contains(@value,'CompanyInfo')]")
	private WebElement usrMgmt_Ancmnts_HostCompanies;
	

	public WebElement getUsrManagement() {
		return UsrManagement;
	}

	public WebElement getUsrMgmt_Roles() {
		return usrMgmt_Roles;
	}

	public WebElement getNew_role_Btn() {
		return new_role_Btn;
	}

	public WebElement getUsrMgmt_MoreOptions() {
		return usrMgmt_MoreOptions;
	}

	public WebElement getUsrMgmt_SecurityRoles() {
		return usrMgmt_SecurityRoles;
	}

	public WebElement getUsrMgmt_Views() {
		return usrMgmt_Views;
	}

	public WebElement getUsrMgmt_Manage_Views() {
		return usrMgmt_Manage_Views;
	}

	public WebElement getUsrMgmt_Copy() {
		return usrMgmt_Copy;
	}

	public WebElement getUsrMgmt_Copy_Value() {
		return usrMgmt_Copy_Value;
	}

	public WebElement getUsrMgmt_Filter() {
		return usrMgmt_Filter;
	}

	public WebElement getUsrMgmt_Add() {
		return usrMgmt_Add;
	}

	public WebElement getUsrMgmt_Attribute() {
		return usrMgmt_Attribute;
	}

	public WebElement getUsrMgmt_Operator() {
		return usrMgmt_Operator;
	}

	public WebElement getUsrMgmt_Value() {
		return usrMgmt_Value;
	}

	public WebElement getUsrMgmt_Options() {
		return usrMgmt_Options;
	}

	public WebElement getUsrMgmt_ResultsSize() {
		return usrMgmt_ResultsSize;
	}

	public WebElement getUsrMgmt_All() {
		return usrMgmt_All;
	}

	public WebElement getUsrMgmt_Ancmnts() {
		return usrMgmt_Ancmnts;
	}

	public WebElement getNew_Ancmnt_Btn() {
		return new_Ancmnt_Btn;
	}

	public WebElement getUsrMgmt_Ancmnts_Msg() {
		return usrMgmt_Ancmnts_Msg;
	}

	public WebElement getUsrMgmt_Ancmnts_Edit() {
		return usrMgmt_Ancmnts_Edit;
	}

	public WebElement getUsrMgmt_Ancmnts_EditMsg_value() {
		return usrMgmt_Ancmnts_EditMsg_value;
	}

	public WebElement getUsrMgmt_Ancmnts_Bold() {
		return usrMgmt_Ancmnts_Bold;
	}

	public WebElement getUsrMgmt_Ancmnts_FontSize() {
		return usrMgmt_Ancmnts_FontSize;
	}

	public WebElement getUsrMgmt_Ancmnts_FontSize_30() {
		return usrMgmt_Ancmnts_FontSize_30;
	}

	public WebElement getUsrMgmt_Ancmnts_Color() {
		return usrMgmt_Ancmnts_Color;
	}

	public WebElement getUsrMgmt_Ancmnts_purpleColor() {
		return usrMgmt_Ancmnts_purpleColor;
	}

	public WebElement getUsrMgmt_Ancmnts_EffectiveTo() {
		return usrMgmt_Ancmnts_EffectiveTo;
	}

	public WebElement getUsrMgmt_Ancmnts_CurrentDate() {
		return usrMgmt_Ancmnts_CurrentDate;
	}

	public WebElement getUsrMgmt_Ancmnts_Companies() {
		return usrMgmt_Ancmnts_Companies;
	}

	public WebElement getUsrMgmt_Ancmnts_HostCompanies() {
		return usrMgmt_Ancmnts_HostCompanies;
	}
	


}
