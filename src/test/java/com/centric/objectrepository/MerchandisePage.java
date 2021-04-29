package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class MerchandisePage extends Commonactions{

	public MerchandisePage() {
		PageFactory.initElements(Commonactions.driver, this);
	}
	@FindBy(xpath="//span[@data-csi-tab-name='Merchandise Types' or text()='Merchandise Types']")
	private WebElement merchandise_type;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Plan Types' or text()='Plan Types']")
	private WebElement plan_type;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Folder Types' or text()='Folder Types']")
	private WebElement folder_type;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Collection Types' or text()='Collection Types']")
	private WebElement collection_type;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Product Types' or text()='Product Types']")
	private WebElement product_type;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Option Types' or text()='Option Types']")
	private WebElement option_type;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Secondary Types' or text()='Secondary Types']")
	private WebElement secondary_type;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-MerchandisingViews-SecondarySubtypes-ToolbarNewActions']//div//div[2]")
	private WebElement new_action_secondary_type;
	
	@FindBy(xpath="//div[@data-csi-automation='field-MerchSecondaryPlanSubtype-Form-Node Name']//div/div/input[1]")
	private WebElement secondary_type_input;	
	
	@FindBy(xpath="(//div[@data-csi-act='Active:Child:SetupSettings:0'])[1]")
	private WebElement active_segment;
	
	@FindBy(xpath="(//div[@data-csi-act='Active:Child:SetupSettings:0'])[2]")
	private WebElement active_monthly;	
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-MerchandisingViews-OptionSubtypes-ToolbarNewActions']//div//div[2]")
	private WebElement new_action_option_type;		
	
	@FindBy(xpath="//div[@data-csi-automation='field-MerchOptionSubtype-Form-Node Name']//div/div/input[1]")
	private WebElement option_type_input;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-MerchandisingViews-ProductSubtypes-ToolbarNewActions']//div//div[2]")
	private WebElement new_action_product_type;
	
	@FindBy(xpath="//div[@data-csi-automation='field-MerchProductSubtype-Form-Node Name']//div/div/input[1]")
	private WebElement product_type_input;	
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-MerchandisingViews-CollectionSubtypes-ToolbarNewActions']//div//div[2]")
	private WebElement new_action_collection_type;
	
	@FindBy(xpath="//div[@data-csi-automation='field-MerchCollectionSubtype-Form-Node Name']//div/div/input[1]")
	private WebElement collection_type_input;	
	
	@FindBy(xpath="//a[text()='Product']/following::td[@data-csi-act='StyleTypes:Child:SetupSettings:0']")
	private WebElement style_type_dropdown;	
	
	@FindBy(xpath="//a[text()='Product']/following::td[@data-csi-act='ChildrenSubtypes:Child:SetupSettings:0']")
	private WebElement childern_option_dropdown;	
	
	@FindBy(xpath="//td[text()='Product Group']//following::td[@data-csi-act='ChildrenSubtypes:Child:SetupSettings:0']")
	private WebElement childern_product_dropdown;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-MerchandisingViews-FolderSubtypes-ToolbarNewActions']//div//div[2]")
	private WebElement new_action_folder_type;
	
	@FindBy(xpath="//div[@data-csi-automation='field-MerchFolderSubtype-Form-Node Name']//div/div/input[1]")
	private WebElement folder_type_input;	
	
	@FindBy(xpath="//span[@data-csi-automation='plugin-MerchandisingViews-FolderSubtypes-refresh']//span[text()='refresh']")
	private WebElement merchandise_refresh;		
	
	@FindBy(xpath="//td[text()='Department']//following::div[@data-csi-act='AutoCreateCrew:Child:SetupSettings:0']")
	private WebElement department_autocreate;
	
	@FindBy(xpath="//td[text()='Gender']//following::div[@data-csi-act='AutoCreateCrew:Child:SetupSettings:0']")
	private WebElement gender_autocreate;
	
	@FindBy(xpath="//td[text()='Region']//following::div[@data-csi-act='AutoCreateCrew:Child:SetupSettings:0']")
	private WebElement region_autocreate;
	
	@FindBy(xpath="//td[text()='Department']//following::td[@data-csi-act='ChildrenFolderSubtypes:Child:SetupSettings:0']")
	private WebElement department_childfolder_dropdown;
	
	@FindBy(xpath="//td[text()='Gender']//following::td[@data-csi-act='ChildrenFolderSubtypes:Child:SetupSettings:0']")
	private WebElement gender_childfolder_dropdown;
	
	@FindBy(xpath="//td[text()='Region']//following::td[@data-csi-act='ChildrenFolderSubtypes:Child:SetupSettings:0']")
	private WebElement region_childfolder_dropdown;	
	
	@FindBy(xpath="//td[text()='Gender']//following::td[@data-csi-act='ChildrenCollectionSubtypes:Child:SetupSettings:0']")
	private WebElement region_childcollection_dropdown;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-MerchandisingViews-PlanSubtypes-ToolbarNewActions']//div//div[2]")
	private WebElement new_action_plan_type;
	
	@FindBy(xpath="//div[@data-csi-automation='field-MerchPlanSubtype-Form-Node Name']//div/div/input[1]")
	private WebElement plan_type_input;
	
	@FindBy(xpath="//td[text()='Merch Plan']//following::div[@data-csi-act='AutoCreateCrew:Child:SetupSettings:0']")
	private WebElement merchplan_autocreate;	
	
	@FindBy(xpath="//td[text()='Merch Plan']//following::td[@data-csi-act='ChildrenSubtypes:Child:SetupSettings:0']")
	private WebElement merchplan_childfolder_dropdown;	
	
	@FindBy(xpath="//td[text()='Merch Plan']//following::td[@data-csi-act='SecondarySubtypes:Child:SetupSettings:0']")
	private WebElement merchplan_secondarytype_dropdown;	
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-Site-Enumerations-ToolbarNewActions']//div//div[2]")
	private WebElement new_action_enumeration;
	
	@FindBy(xpath="//div[@data-csi-automation='field-EnumList-Form-Node Name']//div/div/input[1]")
	private WebElement enumeration_input;	
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-EnumList-Values-ToolbarNewActions']//div//div[2]")
	private WebElement new_action_enumeration_value;	
	
	@FindBy(xpath="//div[@data-csi-automation='field-EnumValue-Form-Node Name']//div/div/input[1]")
	private WebElement enumeration_value_input;	
	
	@FindBy(xpath="//span[text()='Style Attributes']//parent::label//parent::div/div/input[@value='Style Attributes']")
	private WebElement styleattributecheckbox;
	
	@FindBy(xpath="//td/a[text()='Style Attributes']")
	private WebElement styleattributevalue;	
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-BusinessObject-Attributes-ToolbarNewActions']//div//div[2]")
	private WebElement new_action_styleattribute_value;	
	
	@FindBy(xpath="//div[@data-csi-automation='field-ConfigurableAttribute-Form-Node Name']//div/div/input[1]")
	private WebElement styleattribute_input;	
	
	@FindBy(xpath="(//div[@data-csi-automation='field-ConfigurableAttribute-Form-Value Type']//div//input)[1]")
	private WebElement styleattribute_type_dropdown;		
	
	@FindBy(xpath="(//div[@data-csi-automation='field-ConfigurableAttribute-Form-EnumList']//div//input)[1]")
	private WebElement styleattribute_type1_dropdown;	
	
	@FindBy(xpath="(//div[@data-csi-automation='field-ConfigurableAttribute-Form-ExpressionOnClientEnabled']//input)[1]")
	private WebElement client_checkbox;	
	
	@FindBy(xpath="//span[@title='Click to find global items of this type']")
	private WebElement find_Styleattribute;		
	
	@FindBy(xpath="(//span[@title='System Configuration'])[1]")
	private WebElement setting_tab;
	
	@FindBy(xpath="//span[contains(@data-csi-tab-name,'Merchandising')]")
	private WebElement merchandise_tab;	
	
	@FindBy(xpath="//div[@data-csi-act='MPVStyleOneToOne::0']//input")
	private WebElement product_version_checkbox;	
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-MerchProductSubtypeSettings-StylePushTemplates-ToolbarNewActions']//div//div[2]")
	private WebElement new_style_push_template;	
	
	@FindBy(xpath="//span[@data-csi-automation='filter-StylePushTemplate-Host-ReflectionAttributeId']")
	private WebElement product_attributename_dropdown;
	
	
	@FindBy(xpath="//span[@data-csi-automation='filter-StylePushTemplate-Host-ReflectionAttributeId']//span[text()='(Multiple)']")
	private WebElement product_attributename_multiple_dropdown;
	
	@FindBy(xpath="//span[text()='Category1']//parent::label//parent::div/div/input[@value='Category1']")
	private WebElement category1checkbox;
	
	@FindBy(xpath="//span[text()='Category2']//parent::label//parent::div/div/input[@value='Category2']")
	private WebElement category2checkbox;
	
	@FindBy(xpath="//span[text()='Collection']//parent::label//parent::div/div/input[@value='Collection']")
	private WebElement collectioncheckbox;
	
	@FindBy(xpath="//span[text()='ParentSeason']//parent::label//parent::div/div/input[@value='ParentSeason']")
	private WebElement parentseasoncheckbox;
	
	@FindBy(xpath="//span[text()='IdGender']//parent::label//parent::div/div/input[@value='IdGender']")
	private WebElement idgendercheckbox;
	
	@FindBy(xpath="//span[text()='IdPricePoint']//parent::label//parent::div/div/input[@value='IdPricePoint']")
	private WebElement idpricepointcheckbox;
	
	@FindBy(xpath="//td[text()='Category1']//following::td[@data-csi-act='___ProductAttributeMappingExpressions::0']")
	private WebElement mappingexpr_input;	
	
	@FindBy(xpath="//td[text()='Category2']//following::td[@data-csi-act='___ProductAttributeMappingExpressions::0']")
	private WebElement mappingexprcategory2_input;
	
	@FindBy(xpath="//td[text()='Collection']//following::td[@data-csi-act='___ProductAttributeMappingExpressions::0']")
	private WebElement mappingexprcollection_input;
	
	@FindBy(xpath="//td[text()='ParentSeason']//following::td[@data-csi-act='___ProductAttributeMappingExpressions::0']")
	private WebElement mappingexprparentseason_input;
	
	@FindBy(xpath="//td[text()='IdPricePoint']//following::td[@data-csi-act='___ProductAttributeMappingExpressions::0']")
	private WebElement mappingexprpricepoint_input;
	
	
	@FindBy(xpath="//td[text()='IdGender']//following::td[@data-csi-act='___ProductAttributeMappingExpressions::0']")
	private WebElement mappingexpridgender_input;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-Site-CopyTemplates-ToolbarNewActions']//div//div[2]")
	private WebElement new_style_copy_template;	
	
	@FindBy(xpath="//div[@data-csi-automation='field-StyleCopyOptions-NewStyleCopyTemplate-Node Name']//div/div/input[1]")
	private WebElement stylecopytemplate_input;		
	
	@FindBy(xpath="(//div[@data-csi-automation='field-StyleCopyOptions-NewStyleCopyTemplate-StyleType']//div//input)[1]")
	private WebElement styletype_dropdown;		
	
	@FindBy(xpath="//td[text()='Merch Copy Temp']//following::span[@data-csi-act='Edit']")
	private WebElement merchtemplate_edit;		
	
	@FindBy(xpath="//span[@data-csi-automation='filter-BusinessObject-Attributes-ReflectionAttributeId']")
	private WebElement style_attributename_dropdown;
	
	@FindBy(xpath="//span[text()='CarryOver']//parent::label//parent::div/div/input[@value='CarryOver']")
	private WebElement CarryOvercheckbox;	
	
	@FindBy(xpath="//td[text()='CarryOver']//following::span[@data-csi-act='Edit']")
	private WebElement CarryOveredit;	
	
	@FindBy(xpath="//span[contains(@data-csi-tab-name,'Definition')]")
	private WebElement formdefinition_tab;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-CreateFormDefinition-CreateFormDefinition-ToolbarNewActions']//div//div[2]")
	private WebElement select_attribute;		
	
	@FindBy(xpath="(//td[text()='Style/CarryOver']//parent::tr//td//div)[1]")
	private WebElement style_carryover_checkbox;	
	
	@FindBy(xpath="//span[contains(@class,'material-icons csi-material-icon') and text()='build']")
	private WebElement setting_icon;	
	
	
	@FindBy(xpath="//td[text()='Merch Copy Temp']//following::span[@data-csi-act='Delete']")
	private WebElement merchtemplate_delete;		
	
	@FindBy(xpath="//tr[contains(@data-csi-automation,'plugin-Site-CopyTemplates-CustomViewManage')]//td[text()='Manage Views']")
	private WebElement manage_Views;		
	
	
	@FindBy(xpath="//div[@data-csi-automation='field-CopyOptions-CopyTemplate-_CarryOver']//input")
	private WebElement carryoverstylecopy_checkbox;			
	
	@FindBy(xpath="//span[contains(@data-csi-automation,'plugin-Site-CopyTemplates-CustomViewActions')]//span[text()='Views']")
	private WebElement copytemplates_views;		
	
	@FindBy(xpath="//option[@title='OK for Merchandising']")
	private WebElement merchandise_option;		
	
	@FindBy(xpath="//option[@title='OK for Adoption']")
	private WebElement adoption_opt;
	
	
	@FindBy(xpath="//div[@data-csi-act='OKForMerchandisingCarryover::0']//input[1]")
	private WebElement merchandise_option_checkbox;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-Site-MerchProductVersionCopyTemplates-ToolbarNewActions']//div//div[2]")
	private WebElement new_merch_copy_template;	
	
	@FindBy(xpath="//div[@data-csi-automation='field-MerchProductVersionCopyTemplate-Form-Node Name']//div/div/input[1]")
	private WebElement merchcopytemplate_input;		
	
	
	@FindBy(xpath="//span[@data-csi-automation='filter-StylePushTemplate-Host-ReflectionAttributeId']//span[3]")
	private WebElement arrowbuttond_dropdown;		
	
	@FindBy(xpath="//td[text()='Region']//following::td[@data-csi-heading='LevelAttributes:Child:SetupSettings:0']//input")
	private WebElement branchcheckboxregion;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-ApparelViews-StructItemNameCodes-ToolbarNewActions']//div//div[2]")
	private WebElement actionhierarchyitemtemplate;
	
	@FindBy(xpath="(//div[@data-csi-automation='field-StructItemNameCode-Form-Type']//div//input)[1]")
	private WebElement typedropdown;
	
	@FindBy(xpath="(//div[@data-csi-automation='field-StructItemNameCode-Form-Node Name']//div//input)[2]")
	private WebElement namehierarchyitem;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-Season-Category1s-ToolbarNewActions']//div//div[2]")
	private WebElement brandactionbtn;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-Category1-Category2s-ToolbarNewActions']//div//div[2]")
	private WebElement departmentactionbtn;
	
	@FindBy(xpath="(//div[@data-csi-automation='field-Category1-Form-LabelTemplate']//div//input)[1]")
	private WebElement templatedropdown;
	
	@FindBy(xpath="(//div[@data-csi-automation='field-Category2-Form-LabelTemplate']//div//input)[1]")
	private WebElement depttempdropdown;
	
	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save & Go'])[1]")
	private WebElement savegobtn;
	
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-Category2-Collections-ToolbarNewActions']//div//div[2]")
	private WebElement collectionactionbtn;
	
	@FindBy(xpath="(//div[@data-csi-automation='field-Collection-Form-LabelTemplate']//div//input)[1]")
	private WebElement collectempdropdown;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-Season-Category1s-ToolbarNewActions']//td[2]")
	private WebElement brandactiondropbtn;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-Category1-Category2s-ToolbarNewActions']//td[2]")
	private WebElement deptactiondropbtn;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-Category2-Collections-ToolbarNewActions']//td[2]")
	private WebElement collecactdropbtn;
	
	@FindBy(xpath="//td[text()='Brand X']//preceding::div[@data-csi-act='ViewSelect']//input")
	private WebElement brandxcheckbox;
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'MerchandisingViews-Merchandising')]//div[text()='New Plan']")
	private WebElement Newplan;
	
	@FindBy(xpath="//div[contains(@data-csi-automation,'MerchPlanConfig-NewPlanForm-Name')]//div[2]/div/input")
	private WebElement NewplanName;
	
	@FindBy(xpath="//div[contains(@data-csi-automation,'MerchPlanConfig-NewPlanForm-Season')]//div[2]/div/input")
	private WebElement Planseason;
	
	@FindBy(xpath="//a[text()='Plan 1']")
	private WebElement PlanName;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Versions' or text()='Versions']")
	private WebElement versions;
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'MerchPlan-Versions-ToolbarNewActions')]//div[text()='New Season']")
	private WebElement Newplanseason;
	
	@FindBy(xpath="//div[contains(@data-csi-automation,'MerchPlan-NewSeasonForm-Name')]//div[2]/div/input")
	private WebElement seasonname;
	
	@FindBy(xpath="//div[contains(@data-csi-automation,'MerchPlan-NewSeasonForm-Previous')]//div[3]/input[1]")
	private WebElement Previousseason;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Secondary Setup' or text()='Secondary Setup']")
	private WebElement secondarysetup;
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'MerchPlan-SecondaryPlans')]//div[text()='New Secondary Plan']")
	private WebElement Newsecsetupplanbtn;
	
	@FindBy(xpath="//div[contains(@data-csi-act,'AutoCreate')]/input")
	private WebElement Autocreatechkbox;
	
	@FindBy(xpath="//span[@data-csi-automation='plugin-MerchPlan-SecondaryPlans-MerchSelectSecondaryType']//div/div[1]/input")
	private WebElement setupsectypesarrow;
	
	@FindBy(xpath="//div[contains(@data-csi-automation,'MerchPlan-SecondaryPlans-MerchSelectSecondaryType')]//*[text()='Segment']")
	private WebElement setupsegment;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Secondary' or text()='Secondary']")
	private WebElement Secondary;
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'TargetSecondaries')]//div[text()='New from Secondary Plan']")
	private WebElement newfromsecplan;
	
	@FindBy(xpath="//span[text()='Secondary']//parent::div//parent::th//parent::tr/th/div/input")
	private WebElement secondarychkbox;
	
	@FindBy(xpath="//span[@data-csi-automation='plugin-MerchSeason-TargetSecondaries-refresh']//span[text()='refresh']")
	private WebElement secplanrefresh;
	
	@FindBy(xpath="//span[@data-csi-automation='plugin-MerchSeason-TargetSecondaries-MerchSelectSecondaryType']//div/div[1]/input")
	private WebElement secondarysectypearrow;
	
	@FindBy(xpath="//div[contains(@data-csi-automation,'MerchSeason-TargetSecondaries-MerchSelectSecondaryType')]//*[text()='Monthly']")
	private WebElement secondarymonthly;
	
	@FindBy(xpath="//div[contains(@data-csi-automation,'MerchSeason-TargetSecondaries-MerchSelectSecondaryType')]//*[text()='Segment']")
	private WebElement secondarysegment;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Plan' or text()='Plan']")
	private WebElement Plantab;
	
	@FindBy(xpath="//span[@data-csi-automation='plugin-MerchSeason-Target-refresh']//span[text()='refresh']")
	private WebElement plantabrefresh;
	
	@FindBy(xpath="//span[@data-csi-automation='plugin-MerchSeason-Target-MerchSecondarySelect']//div/div[1]/input")
	private WebElement plansecondariesarrow;
	
	@FindBy(xpath="//label[text()='All']//parent::div/div/input")
	private WebElement MonthlyAll;
	
	@FindBy(xpath="//span[text()='Summer 2021']//parent::div/span/span")
	private WebElement summerchange2021;
	
	@FindBy(xpath="//span[text()='Summer 2022']//parent::div/span/span")
	private WebElement summerchange2022;
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'MerchSeason-Target-ToolbarNewActions')]//div[text()='New Folder']")
	private WebElement Newfolderbtn;
	
	@FindBy(xpath="//a[text()='Americas']")
	private WebElement AmericaName;
	
	@FindBy(xpath="//span[@data-csi-automation='plugin-MerchFolderVersion-TargetFolders-refresh']//span[text()='refresh']")
	private WebElement FolderRefresh;
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'MerchFolderVersion-TargetFolders-ToolbarNewActions')]//div[text()='New Folder']")
	private WebElement AmericaNewfolder;
	
	@FindBy(xpath="//a[text()='Childrenswear']")
	private WebElement childrenwearname;
	
	@FindBy(xpath="//a[text()='Boys']")
	private WebElement Boysname;
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'MerchFolderVersion-TargetCollections')]//div[text()='New Merch Collection']")
	private WebElement Newmerchcollectionbtn;
	
	@FindBy(xpath="//a[text()='Tops']")
	private WebElement Topsname;
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'MerchCollectionVersion-Target')]//div[text()='New Product']")
	private WebElement NewProduct;
	
	@FindBy(xpath="//div[@data-csi-automation='field-MerchProduct-NewProductVersionForm-Node Name']//div/div/input")
	private WebElement Productvalue;
	
	@FindBy(xpath="//div[@data-csi-automation='field-MerchProduct-NewProductVersionForm-MerchOptionQuantity']//div/div/input")
	private WebElement optionqtyvalue;
	
	@FindBy(xpath="//div[@data-csi-automation='field-MerchProduct-NewProductVersionForm-MerchOptionType']//div[3]/input[1]")
	private WebElement optiontypevalue;
	
	@FindBy(xpath="//div[@data-csi-automation='field-MerchProduct-NewProductVersionForm-MerchProductQuantity']//div/div/input")
	private WebElement productqty;
	
	@FindBy(xpath="//div[@data-csi-automation='field-MerchProduct-NewProductVersionForm-CurrentQuantity']//div[2]/div/input")
	private WebElement activeqtyvalue;
	
	@FindBy(xpath="//a[text()='Tops-01']")
	private WebElement Tops01Name;
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'MerchProductVersion-Target')]//div[text()='New Option']")
	private WebElement Newoptionbtn;
	
	@FindBy(xpath="//a[text()='Tops']")
	private WebElement TopsIcon;
	
	@FindBy(xpath="//div[@data-csi-automation='field-MerchProduct-NewProductVersionForm-MerchOptionName']//div/div/input")
	private WebElement optionNamevalue;
	
	@FindBy(xpath="//a[text()='Tops-03']")
	private WebElement Tops3Name;
	
	@FindBy(xpath="//a[text()='Green']//following::span[text()='content_copy']")
	private WebElement Greencopy;

	@FindBy(xpath="//div[@data-csi-automation='field-MerchOptionVersion-CopyOptionVersionForm-Quantity']//div[2]/div/input")
	private WebElement copyqty;
	
	@FindBy(xpath="//div[@data-csi-automation='field-MerchOptionVersion-CopyOptionVersionForm-Node Name']//div[2]/div/input")
	private WebElement copyoptionvalue;

	@FindBy(xpath="//a[contains(text(),'Greenshade')]//following::span[text()='close']")
	private WebElement deletegreenshade;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Products' or text()='Products']")
	private WebElement ProductsTab;

	@FindBy(xpath="//a[text()='Product-01']//following::div[@data-csi-act='ForStyleCreate::0']")
	private WebElement product1stylecheckbox;
	
	@FindBy(xpath="//a[text()='Product-01']//following::div[@data-csi-act='ForCarryover::0']")
	private WebElement product1carryovercheckbox;
	
	@FindBy(xpath="//td[text()='Merch Copy Temp']//following::div[@data-csi-act='OKForAdoption::0']")
	private WebElement merchcopyadoptcheckbox;
	
	@FindBy(xpath="//td[text()='Merch Copy Temp']//following::div[@data-csi-act='OKForMerchandisingCarryover::0']")
	private WebElement merchcopymerchancheckbox;
	
	/////////////////////////////////////
	@FindBy(xpath="//a[text()='Summer 2021']")
	private WebElement summer2021;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Merch Collections']")
	private WebElement merchcolltab;
	
	@FindBy(xpath="(//a[text()='Tops'])[1]")
	private WebElement tops;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-MerchCollectionVersion-Target-ToolbarNewActions']//div[text()='New Product']")
	private WebElement newproductaction;
	
	@FindBy(xpath="//div[@data-csi-automation='field-MerchProduct-NewProductVersionForm-MerchProductCreateStyles']//input")
	private WebElement cratestylecheck;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Style-Form-ParentSeason']/div[3]/input")
	private WebElement seasondrp;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Style-Form-Category1']//div[3]//input[1]")
	private WebElement branddrp;
	
	@FindBy(xpath="//div[@data-csi-automation='field-MerchProduct-NewProductVersionForm-Node Name']/div[2]/div/input")
	private WebElement productname;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Style-Form-Auto_Test']//input")
	private WebElement testautocheck;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Style-Form-IsStyleCandidate']//input")
	private WebElement candidatechk;
	
	public WebElement getCandidatechk() {
		return candidatechk;
	}
	public WebElement getTestautocheck() {
		return testautocheck;
	}
	public WebElement getProductname() {
		return productname;
	}
	public WebElement getBranddrp() {
		return branddrp;
	}
	public WebElement getSeasondrp() {
		return seasondrp;
	}
	public WebElement getCratestylecheck() {
		return cratestylecheck;
	}
	public WebElement getNewproductaction() {
		return newproductaction;
	}
	public WebElement getTops() {
		return tops;
	}
	public WebElement getMerchcolltab() {
		return merchcolltab;
	}
	public void setMerchcolltab(WebElement merchcolltab) {
		this.merchcolltab = merchcolltab;
	}
	public WebElement getSummer2021() {
		return summer2021;
	}
	//////////////////////////////////////
	public WebElement getAdoption_opt() {
		return adoption_opt;
	}
	
	public WebElement getMerchcopyadoptcheckbox() {
		return merchcopyadoptcheckbox;
	}

	public WebElement getMerchcopymerchancheckbox() {
		return merchcopymerchancheckbox;
	}

	public WebElement getProduct1stylecheckbox() {
		return product1stylecheckbox;
	}

	public WebElement getProduct1carryovercheckbox() {
		return product1carryovercheckbox;
	}

	public WebElement getNewplan() {
		return Newplan;
	}

	public WebElement getNewplanName() {
		return NewplanName;
	}

	public WebElement getPlanseason() {
		return Planseason;
	}

	public WebElement getPlanName() {
		return PlanName;
	}

	public WebElement getVersions() {
		return versions;
	}

	public WebElement getNewplanseason() {
		return Newplanseason;
	}

	public WebElement getSeasonname() {
		return seasonname;
	}

	public WebElement getPreviousseason() {
		return Previousseason;
	}

	public WebElement getSecondarysetup() {
		return secondarysetup;
	}

	public WebElement getNewsecsetupplanbtn() {
		return Newsecsetupplanbtn;
	}

	public WebElement getAutocreatechkbox() {
		return Autocreatechkbox;
	}

	public WebElement getSetupsectypesarrow() {
		return setupsectypesarrow;
	}

	public WebElement getSetupsegment() {
		return setupsegment;
	}

	public WebElement getSecondary() {
		return Secondary;
	}

	public WebElement getNewfromsecplan() {
		return newfromsecplan;
	}

	public WebElement getSecondarychkbox() {
		return secondarychkbox;
	}

	public WebElement getSecplanrefresh() {
		return secplanrefresh;
	}

	public WebElement getSecondarysectypearrow() {
		return secondarysectypearrow;
	}

	public WebElement getSecondarymonthly() {
		return secondarymonthly;
	}
	
	public WebElement getSecondarysegment() {
		return secondarysegment;
	}
	

	public WebElement getPlantab() {
		return Plantab;
	}

	public WebElement getPlantabrefresh() {
		return plantabrefresh;
	}

	public WebElement getPlansecondariesarrow() {
		return plansecondariesarrow;
	}

	public WebElement getMonthlyAll() {
		return MonthlyAll;
	}

	public WebElement getSummerchange2021() {
		return summerchange2021;
	}
	
	public WebElement getSummerchange2022() {
		return summerchange2022;
	}

	public WebElement getNewfolderbtn() {
		return Newfolderbtn;
	}

	public WebElement getAmericaName() {
		return AmericaName;
	}

	public WebElement getFolderRefresh(){
		return FolderRefresh;
	}
	
	public WebElement getAmericaNewfolder() {
		return AmericaNewfolder;
	}

	public WebElement getChildrenwearname() {
		return childrenwearname;
	}

	public WebElement getBoysname() {
		return Boysname;
	}

	public WebElement getNewmerchcollectionbtn() {
		return Newmerchcollectionbtn;
	}

	public WebElement getTopsname() {
		return Topsname;
	}

	public WebElement getNewProduct() {
		return NewProduct;
	}

	public WebElement getProductvalue() {
		return Productvalue;
	}

	public WebElement getOptionqtyvalue() {
		return optionqtyvalue;
	}

	public WebElement getOptiontypevalue() {
		return optiontypevalue;
	}

	public WebElement getProductqty() {
		return productqty;
	}

	public WebElement getActiveqtyvalue() {
		return activeqtyvalue;
	}

	public WebElement getTops01Name() {
		return Tops01Name;
	}

	public WebElement getNewoptionbtn() {
		return Newoptionbtn;
	}

	public WebElement getTopsIcon() {
		return TopsIcon;
	}

	public WebElement getOptionNamevalue() {
		return optionNamevalue;
	}

	public WebElement getTops3Name() {
		return Tops3Name;
	}

	public WebElement getGreencopy() {
		return Greencopy;
	}

	public WebElement getCopyqty() {
		return copyqty;
	}

	public WebElement getCopyoptionvalue() {
		return copyoptionvalue;
	}

	public WebElement getDeletegreenshade() {
		return deletegreenshade;
	}

	public WebElement getProductsTab() {
		return ProductsTab;
	}
	
	public WebElement getBrandxcheckbox() {
		return brandxcheckbox;
	}

	public WebElement getBrandactiondropbtn() {
		return brandactiondropbtn;
	}

	public WebElement getDeptactiondropbtn() {
		return deptactiondropbtn;
	}

	public WebElement getCollecactdropbtn() {
		return collecactdropbtn;
	}

	public WebElement getCollectionactionbtn() {
		return collectionactionbtn;
	}

	public WebElement getCollectempdropdown() {
		return collectempdropdown;
	}

	public WebElement getDepttempdropdown() {
		return depttempdropdown;
	}

	public WebElement getDepartmentactionbtn() {
		return departmentactionbtn;
	}

	public WebElement getSavegobtn() {
		return savegobtn;
	}

	public WebElement getTemplatedropdown() {
		return templatedropdown;
	}

	public WebElement getBrandactionbtn() {
		return brandactionbtn;
	}

	public WebElement getNamehierarchyitem() {
		return namehierarchyitem;
	}

	public WebElement getTypedropdown() {
		return typedropdown;
	}

	public WebElement getActionhierarchyitemtemplate() {
		return actionhierarchyitemtemplate;
	}

	public WebElement getBranchcheckboxregion() {
		return branchcheckboxregion;
	}

	public WebElement getArrowbuttond_dropdown() {
		return arrowbuttond_dropdown;
	}

	public WebElement getMappingexprpricepoint_input() {
		return mappingexprpricepoint_input;
	}
	
	public WebElement getProduct_attributename_multiple_dropdown() {
		return product_attributename_multiple_dropdown;
	}
	
	public WebElement getMappingexprcategory2_input() {
		return mappingexprcategory2_input;
	}

	public WebElement getMappingexprcollection_input() {
		return mappingexprcollection_input;
	}

	public WebElement getMappingexprparentseason_input() {
		return mappingexprparentseason_input;
	}

	public WebElement getMappingexpridgender_input() {
		return mappingexpridgender_input;
	}
	public WebElement getMerchcopytemplate_input() {
		return merchcopytemplate_input;
	}

	public WebElement getNew_merch_copy_template() {
		return new_merch_copy_template;
	}

	public WebElement getMerchandise_option_checkbox() {
		return merchandise_option_checkbox;
	}

	public WebElement getManage_Views() {
		return manage_Views;
	}
	
	public WebElement getMerchandise_option() {
		return merchandise_option;
	}

	public WebElement getCarryoverstylecopy_checkbox() {
		return carryoverstylecopy_checkbox;
	}

	public WebElement getCopytemplates_views() {
		return copytemplates_views;
	}

	public WebElement getMerchtemplate_delete() {
		return merchtemplate_delete;
	}

	public WebElement getSetting_icon() {
		return setting_icon;
	}

	public WebElement getCarryOveredit() {
		return CarryOveredit;
	}

	public WebElement getSelect_attribute() {
		return select_attribute;
	}

	public WebElement getStyle_carryover_checkbox() {
		return style_carryover_checkbox;
	}

	public WebElement getFormdefinition_tab() {
		return formdefinition_tab;
	}

	public WebElement getCarryOvercheckbox() {
		return CarryOvercheckbox;
	}

	public WebElement getMerchtemplate_edit() {
		return merchtemplate_edit;
	}

	public WebElement getStyle_attributename_dropdown() {
		return style_attributename_dropdown;
	}

	public WebElement getNew_style_copy_template() {
		return new_style_copy_template;
	}

	public WebElement getStylecopytemplate_input() {
		return stylecopytemplate_input;
	}

	public WebElement getStyletype_dropdown() {
		return styletype_dropdown;
	}

	public WebElement getIdgendercheckbox() {
		return idgendercheckbox;
	}

	public WebElement getIdpricepointcheckbox() {
		return idpricepointcheckbox;
	}

	public WebElement getCategory2checkbox() {
		return category2checkbox;
	}

	public WebElement getCollectioncheckbox() {
		return collectioncheckbox;
	}

	public WebElement getParentseasoncheckbox() {
		return parentseasoncheckbox;
	}

	public WebElement getMappingexpr_input() {
		return mappingexpr_input;
	}

	public WebElement getCategory1checkbox() {
		return category1checkbox;
	}

	public WebElement getProduct_attributename_dropdown() {
		return product_attributename_dropdown;
	}

	public WebElement getNew_style_push_template() {
		return new_style_push_template;
	}

	public WebElement getProduct_version_checkbox() {
		return product_version_checkbox;
	}

	public WebElement getMerchandise_tab() {
		return merchandise_tab;
	}

	public WebElement getSetting_tab() {
		return setting_tab;
	}
	
	public WebElement getFind_Styleattribute() {
		return find_Styleattribute;
	}

	public WebElement getClient_checkbox() {
		return client_checkbox;
	}

	public WebElement getStyleattribute_type1_dropdown() {
		return styleattribute_type1_dropdown;
	}

	public WebElement getNew_action_styleattribute_value() {
		return new_action_styleattribute_value;
	}

	public WebElement getStyleattribute_input() {
		return styleattribute_input;
	}

	public WebElement getStyleattribute_type_dropdown() {
		return styleattribute_type_dropdown;
	}

	public WebElement getStyleattributevalue() {
		return styleattributevalue;
	}

	public WebElement getStyleattributecheckbox() {
		return styleattributecheckbox;
	}

	public WebElement getNew_action_enumeration_value() {
		return new_action_enumeration_value;
	}

	public WebElement getEnumeration_value_input() {
		return enumeration_value_input;
	}

	public WebElement getNew_action_enumeration() {
		return new_action_enumeration;
	}

	public WebElement getEnumeration_input() {
		return enumeration_input;
	}

	public WebElement getMerchplan_secondarytype_dropdown() {
		return merchplan_secondarytype_dropdown;
	}

	public WebElement getMerchplan_childfolder_dropdown() {
		return merchplan_childfolder_dropdown;
	}
	
	public WebElement getMerchplan_autocreate() {
		return merchplan_autocreate;
	}
	public WebElement getNew_action_plan_type() {
		return new_action_plan_type;
	}
	public WebElement getPlan_type_input() {
		return plan_type_input;
	}
	public WebElement getRegion_childcollection_dropdown() {
		return region_childcollection_dropdown;
	}
	public WebElement getDepartment_childfolder_dropdown() {
		return department_childfolder_dropdown;
	}
	public WebElement getGender_childfolder_dropdown() {
		return gender_childfolder_dropdown;
	}
	public WebElement getRegion_childfolder_dropdown() {
		return region_childfolder_dropdown;
	}
	public WebElement getDepartment_autocreate() {
		return department_autocreate;
	}
	public WebElement getGender_autocreate() {
		return gender_autocreate;
	}
	public WebElement getRegion_autocreate() {
		return region_autocreate;
	}
	public WebElement getMerchandise_refresh() {
		return merchandise_refresh;
	}
	public WebElement getNew_action_folder_type() {
		return new_action_folder_type;
	}

	public WebElement getFolder_type_input() {
		return folder_type_input;
	}

	public WebElement getChildern_product_dropdown() {
		return childern_product_dropdown;
	}

	public WebElement getChildern_option_dropdown() {
		return childern_option_dropdown;
	}

	public WebElement getStyle_type_dropdown() {
		return style_type_dropdown;
	}

	public WebElement getNew_action_collection_type() {
		return new_action_collection_type;
	}

	public WebElement getCollection_type_input() {
		return collection_type_input;
	}

	public WebElement getNew_action_product_type() {
		return new_action_product_type;
	}

	public WebElement getProduct_type_input() {
		return product_type_input;
	}

	public WebElement getNew_action_option_type() {
		return new_action_option_type;
	}

	public WebElement getOption_type_input() {
		return option_type_input;
	}
	public WebElement getActive_segment() {
		return active_segment;
	}

	public WebElement getActive_monthly() {
		return active_monthly;
	}

	public WebElement getMerchandise_type() {
		return merchandise_type;
	}

	public WebElement getPlan_type() {
		return plan_type;
	}

	public WebElement getNew_action_secondary_type() {
		return new_action_secondary_type;
	}

	public WebElement getSecondary_type_input() {
		return secondary_type_input;
	}

	public WebElement getFolder_type() {
		return folder_type;
	}

	public WebElement getCollection_type() {
		return collection_type;
	}

	public WebElement getProduct_type() {
		return product_type;
	}

	public WebElement getOption_type() {
		return option_type;
	}

	public WebElement getSecondary_type() {
		return secondary_type;
	}
	
	/////////////////////////////////////////////////////
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-ApparelViews-StructItemNameCodes-ToolbarNewActions']//div[text()='New Hierarchy Item Template']")
	private WebElement Newheirarchybtn;
	
	@FindBy(xpath="//div[@data-csi-automation='field-StructItemNameCode-Form-Type']//div[3]/input[1]")
	private WebElement Heirarchytype;
	
	@FindBy(xpath="//div[@data-csi-automation='field-StructItemNameCode-Form-Node Name']//div[2]/div/input")
	private WebElement Heirarchyname;
	
	@FindBy(xpath="//a[text()='Brand X']")
	private WebElement BrandXname;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Category2-Form-LabelTemplate']//div[3]/input[1]")
	private WebElement DeptTemplate;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Collection-Form-LabelTemplate']//div[3]/input[1]")
	private WebElement CollTemplate;
	
	
	public WebElement getNewheirarchybtn() {
		return Newheirarchybtn;
	}
	
	public WebElement getHeirarchytype() {
		return Heirarchytype;
	}
	
	public WebElement getHeirarchyname() {
		return Heirarchyname;
	}
	
	public WebElement getBrandXname() {
		return BrandXname;
	}

	public WebElement getDeptTemplate() {
		return DeptTemplate;
	}

	public WebElement getCollTemplate() {
		return CollTemplate;
	}
	
	
	
	
}