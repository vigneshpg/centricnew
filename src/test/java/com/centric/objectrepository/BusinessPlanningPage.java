package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class BusinessPlanningPage extends Commonactions{

	public BusinessPlanningPage() {
		PageFactory.initElements(Commonactions.driver, this);
	}

	@FindBy(xpath="//span[text()='Placements' or @data-csi-tab-name='Business Plans']")
	private WebElement businessplan;

	@FindBy(xpath="//span[text()='Placements' or @data-csi-tab-name='Business Categories']")
	private WebElement businesscategories;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'BusinessCategories-ToolbarNewActions')])[1]//tbody/tr/td[1]")
	private WebElement NewBusinesscatiegoriesbtn;

	@FindBy(xpath="//div[contains(@data-csi-automation,'field-BusinessCategory-Form-Node Name')]/div/div/input[1]")
	private WebElement businesscat;

	@FindBy(xpath="//div[contains(@data-csi-automation,'field-BusinessCategory-Form-FilterType')]/div[3]/input[1]")
	private WebElement producttype;

	@FindBy(xpath="//div[contains(@data-csi-automation,'field-BusinessCategory-Form-BusinessCurrency')]/div[3]/input[1]")
	private WebElement currency;

	@FindBy(xpath="(//div[text()='New Business Category']//following::span[text()='content_copy'])[1]")
	private WebElement copymaterialcategory;

	@FindBy(xpath="(//div[text()='New Business Category']//following::span[text()='mode_edit'])[2]")
	private WebElement Editmaterialcopy;

	@FindBy(xpath="(//div[text()='New Business Category']//following::span[text()='close'])[2]")
	private WebElement deletematerialedit;

	@FindBy(xpath="//td[contains(@data-csi-act,'Node Name::0')]/a[contains(text(),'Style')]")
	private WebElement StylecategoryName;

	@FindBy(xpath="(//table[@data-csi-automation='plugin-BusinessCategory-BusinessMarkets-ToolbarNewActions']//div/div)[2]")
	private WebElement Businessmarketbtn;

	@FindBy(xpath="//div[contains(@data-csi-automation,'BusinessMarket-Form-Node Name')]/div/div/input[1]")
	private WebElement Businessmarketvalue;

	@FindBy(xpath="//div[contains(@data-csi-automation,'BusinessMarket-Form-Code')]/div/div/input[1]")
	private WebElement BusinessCode;

	@FindBy(xpath="//td[contains(@data-csi-heading,'SplitPct')]")
	private WebElement BMSPlit;

	@FindBy(xpath="//td[contains(@data-csi-heading,'Countries')]")
	private WebElement BMCountries;

	@FindBy(xpath="//label[contains(text(),'India')]//parent::div/div/input")
	private WebElement indiacheckbox;

	@FindBy(xpath="//label[contains(text(),'United')]//parent::div/div/input")
	private WebElement UScheckbox;

	@FindBy(xpath="//td[contains(@data-csi-heading,'DefaultCountry')]")
	private WebElement BMDefaultcountry;

	@FindBy(xpath="//td[contains(@data-csi-heading,'ShippingPorts')]")
	private WebElement BMShippingPort;

	@FindBy(xpath="//label[contains(text(),'Chennai')]//parent::div/div/input")
	private WebElement chennaiport;

	@FindBy(xpath="//label[contains(text(),'New York')]//parent::div/div/input")
	private WebElement Newyorkport;

	@FindBy(xpath="//td[contains(@data-csi-heading,'DefaultPort')]")
	private WebElement BMDefaultPort;

	@FindBy(xpath="//div[text()='New Business Market']//following::span[text()='content_copy']")
	private WebElement BMCopy;

	@FindBy(xpath="//div[text()='New Business Market']//following::span[text()='close']")
	private WebElement BMDelete;

	@FindBy(xpath="//span[contains(@title,'Click to find')]")
	private WebElement finditem;

	@FindBy(xpath="//label[contains(text(),'Mumbai')]//parent::div/div/input")
	private WebElement mumbaiport;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'BusinessPlans-ToolbarNewActions')])[1]//tbody/tr/td[1]")
	private WebElement businessplanbtn;

	@FindBy(xpath="//div[contains(@data-csi-automation,'field-BusinessPlan-Form-Node Name')]/div/div/input[1]")
	private WebElement BPValue;

	@FindBy(xpath="//div[contains(@data-csi-automation,'field-BusinessPlan-Form-Category')]//div[3]/input[1]")
	private WebElement BPCategory;

	@FindBy(xpath="//div[contains(@data-csi-automation,'field-BusinessPlan-Form-BPExchangeRateSource')]//div[3]/input[1]")
	private WebElement BPCurrency;

	@FindBy(xpath="//div[contains(@data-csi-automation,'field-BusinessPlan-Form-BPSupplier')]//div[3]/input[1]")
	private WebElement BPSupplier;

	@FindBy(xpath="//div[contains(@data-csi-automation,'field-BusinessPlan-Form-BPSeason')]//div[3]/input[1]")
	private WebElement BPSeason;

	@FindBy(xpath="//div[contains(@data-csi-automation,'field-BusinessPlan-Form-BPCategory1')]//div[3]/input[1]")
	private WebElement BPBrand;

	@FindBy(xpath="//div[contains(@data-csi-automation,'field-BusinessPlan-Form-BPCategory2')]//div[3]/input[1]")
	private WebElement BPDepartment;

	@FindBy(xpath="//div[contains(@data-csi-automation,'field-BusinessPlan-Form-BPCollection')]//div[3]/input[1]")
	private WebElement BPCollection;

	@FindBy(xpath="//td[contains(@data-csi-heading,'Volume:Child:Target')]")
	private WebElement targetvolume;

	@FindBy(xpath="//td[contains(@data-csi-heading,'MarginPct:Child:Target')]")
	private WebElement targetmargin;

	@FindBy(xpath="//span[@data-csi-automation='plugin-BusinessPlan-BPMarketPlans-refresh']//span[text()='refresh']")
	private WebElement BMPRefresh;

	@FindBy(xpath="//span[contains(@data-csi-tab-name,'Product Plans') or text()='Product Plans']")
	private WebElement productplan;

	@FindBy(xpath="(//table[@data-csi-automation='plugin-BusinessPlan-BPProductPlans-ToolbarNewActions']//div/div)[2]")
	private WebElement productplanbtn;

	@FindBy(xpath="//td[contains(@data-csi-heading,'Description')]")
	private WebElement productdescription;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'BusinessPlan-BPProductPlans-ToolbarNewActions')])//tbody/tr/td[2]")
	private WebElement productplanexpand;

	@FindBy(xpath="//tr[@data-csi-act='AggregateFromStyles']//td[text()='New from Styles']")
	private WebElement Newformstyle;

	@FindBy(xpath="//tr[@data-csi-act='AggregateFromColorways']//td[text()='New from Colorways']")
	private WebElement style_newfromcolorway;

	@FindBy(xpath="(//td[text()='11-0104 VANILLA ICE']//preceding-sibling::td//input)[2]")
	private WebElement vanillaapparelcolor;

	@FindBy(xpath="//tr[@data-csi-act='AggregateFromSKUs']//td[text()='New from SKU']")
	private WebElement style_newfromsku;

	@FindBy(xpath="//tr[@data-csi-act='NewBPProductPlanFromStyleSize']//td[text()='New from Sizes']")
	private WebElement style_newfromsize;

	@FindBy(xpath="(//td[contains(text(),'small')]//preceding-sibling::td)//input")
	private WebElement small;

	@FindBy(xpath="//span[@data-csi-automation='plugin-BusinessPlan-BPProductPlans-refresh']//span[text()='refresh']")
	private WebElement PPRefresh;

	@FindBy(xpath="//span[contains(@data-csi-tab-name,'Market Product Plans') or text()='Market Product Plans']")
	private WebElement marketplan;

	@FindBy(xpath="//span[@data-csi-automation='plugin-BusinessPlan-MarketProductPlans-refresh']//span[text()='refresh']")
	private WebElement marketplanrefresh;

	@FindBy(xpath="//a[text()='Apparel - Color and Size']")
	private WebElement apparelcolrsizename;

	@FindBy(xpath="//span[text()='Business Planning' or @data-csi-tab-name='Business Planning']")
	private WebElement ColorSizeBP;

	@FindBy(xpath="//span[text()='Market Product Plans' or @data-csi-tab-name='Product Plans']")
	private WebElement ColorSizemarketplan;

	@FindBy(xpath="//span[@data-csi-automation='plugin-Product-MarketProductPlans-refresh']//span[text()='refresh']")
	private WebElement ColorSizeMPRefresh;

	@FindBy(xpath="//td[contains(@data-csi-act,'Node Name')]/a")
	private WebElement BusinessplanName;

	@FindBy(xpath="//span[text()='more_horiz']")
	private WebElement PPplaceholder;

	@FindBy(xpath="//tr[@data-csi-act='SelectSKU']//td[text()='Select Style SKU']")
	private WebElement selectSKU;

	@FindBy(xpath="//tr[@data-csi-act='AggregateFromMaterials']//td[text()='New from Materials']")
	private WebElement newfrommaterial;

	@FindBy(xpath="((//td[contains(text(),'100% Cotton/Rayon Jersey - Copy')]//preceding-sibling::td)//input)[1]")
	private WebElement cottonRayonJerseyCopy;

	@FindBy(xpath="//tr[@data-csi-act='AggregateFromColorMaterials']//td[text()='New from Colored Materials']")
	private WebElement material_newfromcolor;

	@FindBy(xpath="//tr[@data-csi-act='AggregateFromSKUMaterials']//td[text()='New from SKU']")
	private WebElement material_newfromsku;

	@FindBy(xpath="//tr[@data-csi-act='NewBPProductPlanFromMaterialSize']//td[text()='New from Sizes']")
	private WebElement material_newfromsize;

	@FindBy(xpath="(//td[contains(text(),'30')]//preceding-sibling::td)//input")
	private WebElement size30;

	@FindBy(xpath="(//span[text()='Finish & Go'])")
	private WebElement FinishandGo;

	public WebElement getBusinessplan() {
		return businessplan;
	}

	public WebElement getBusinesscategories() {
		return businesscategories;
	}

	public WebElement getNewBusinesscatiegoriesbtn() {
		return NewBusinesscatiegoriesbtn;
	}

	public WebElement getBusinesscat() {
		return businesscat;
	}

	public WebElement getProducttype() {
		return producttype;
	}

	public WebElement getCurrency() {
		return currency;
	}

	public WebElement getCopymaterialcategory() {
		return copymaterialcategory;
	}

	public WebElement getEditmaterialcopy() {
		return Editmaterialcopy;
	}

	public WebElement getDeletematerialedit() {
		return deletematerialedit;
	}

	public WebElement getStylecategoryName() {
		return StylecategoryName;
	}

	public WebElement getBusinessmarketbtn() {
		return Businessmarketbtn;
	}

	public WebElement getBusinessmarketvalue() {
		return Businessmarketvalue;
	}

	public WebElement getBusinessCode() {
		return BusinessCode;
	}

	public WebElement getBMSPlit() {
		return BMSPlit;
	}

	public WebElement getBMCountries() {
		return BMCountries;
	}

	public WebElement getIndiacheckbox() {
		return indiacheckbox;
	}

	public WebElement getUScheckbox() {
		return UScheckbox;
	}

	public WebElement getBMDefaultcountry() {
		return BMDefaultcountry;
	}

	public WebElement getBMShippingPort() {
		return BMShippingPort;
	}

	public WebElement getChennaiport() {
		return chennaiport;
	}

	public WebElement getNewyorkport() {
		return Newyorkport;
	}

	public WebElement getBMDefaultPort() {
		return BMDefaultPort;
	}

	public WebElement getBMCopy() {
		return BMCopy;
	}

	public WebElement getBMDelete() {
		return BMDelete;
	}

	public WebElement getFinditem() {
		return finditem;
	}

	public WebElement getMumbaiport() {
		return mumbaiport;
	}

	public WebElement getBusinessplanbtn() {
		return businessplanbtn;
	}

	public WebElement getBPValue() {
		return BPValue;
	}

	public WebElement getBPCategory() {
		return BPCategory;
	}

	public WebElement getBPCurrency() {
		return BPCurrency;
	}

	public WebElement getBPSupplier() {
		return BPSupplier;
	}

	public WebElement getBPSeason() {
		return BPSeason;
	}

	public WebElement getBPBrand() {
		return BPBrand;
	}

	public WebElement getBPDepartment() {
		return BPDepartment;
	}

	public WebElement getBPCollection() {
		return BPCollection;
	}

	public WebElement getTargetvolume() {
		return targetvolume;
	}

	public WebElement getTargetmargin() {
		return targetmargin;
	}

	public WebElement getBMPRefresh() {
		return BMPRefresh;
	}

	public WebElement getProductplan() {
		return productplan;
	}

	public WebElement getProductplanbtn() {
		return productplanbtn;
	}

	public WebElement getProductdescription() {
		return productdescription;
	}

	public WebElement getProductplanexpand() {
		return productplanexpand;
	}

	public WebElement getNewformstyle() {
		return Newformstyle;
	}

	public WebElement getStyle_newfromcolorway() {
		return style_newfromcolorway;
	}

	public WebElement getVanillaapparelcolor() {
		return vanillaapparelcolor;
	}

	public WebElement getStyle_newfromsku() {
		return style_newfromsku;
	}

	public WebElement getStyle_newfromsize() {
		return style_newfromsize;
	}

	public WebElement getSmall() {
		return small;
	}

	public WebElement getPPRefresh() {
		return PPRefresh;
	}

	public WebElement getMarketplan() {
		return marketplan;
	}

	public WebElement getMarketplanrefresh() {
		return marketplanrefresh;
	}

	public WebElement getApparelcolrsizename() {
		return apparelcolrsizename;
	}

	public WebElement getColorSizeBP() {
		return ColorSizeBP;
	}

	public WebElement getColorSizemarketplan() {
		return ColorSizemarketplan;
	}

	public WebElement getColorSizeMPRefresh() {
		return ColorSizeMPRefresh;
	}

	public WebElement getBusinessplanName() {
		return BusinessplanName;
	}

	public WebElement getPPplaceholder() {
		return PPplaceholder;
	}

	public WebElement getSelectSKU() {
		return selectSKU;
	}

	public WebElement getNewfrommaterial() {
		return newfrommaterial;
	}

	public WebElement getCottonRayonJerseyCopy() {
		return cottonRayonJerseyCopy;
	}

	public WebElement getMaterial_newfromcolor() {
		return material_newfromcolor;
	}

	public WebElement getMaterial_newfromsku() {
		return material_newfromsku;
	}

	public WebElement getMaterial_newfromsize() {
		return material_newfromsize;
	}

	public WebElement getSize30() {
		return size30;
	}

	public WebElement getFinishandGo() {
		return FinishandGo;
	}

	// BusinessObject

	@FindBy(xpath="//table[@data-csi-automation='plugin-Site-Enumerations-ToolbarNewActions']//div[text()='New Enumeration']")
	private WebElement NewEnumBtn;

	@FindBy(xpath="//div[@data-csi-automation='field-EnumList-Form-Node Name']/div[2]/div/input")
	private WebElement NewEnumListValue;

	@FindBy(xpath="(//td[contains(@data-csi-act,'DependsOn')])[1]")
	private WebElement dependson;

	@FindBy(xpath="(//div[contains(text(),'New Enumeration Value')]//following::td[contains(@data-csi-act,'DependsOn')])[1]")
	private WebElement EnumValuleDependson;

	@FindBy(xpath="//label[contains(text(),'Enum A1')]//parent::div/div/input")
	private WebElement EnumA1_checkbox;

	@FindBy(xpath="//label[contains(text(),'Enum B1')]//parent::div/div/input")
	private WebElement EnumB1_checkbox;

	@FindBy(xpath="//span[@data-csi-tab-name='Business Objects' or text()='Business Objects']")
	private WebElement BusinessObject;

	@FindBy(xpath="//span[@data-csi-automation='filter-Reflection-BusinessObjects-Node Name']")
	private WebElement Businessobj_Dropdown;

	@FindBy(xpath="//span[text()='Style']//parent::label//parent::div/div/input[@value='Style']")
	private WebElement Stylecheckbox;

	@FindBy(xpath="//td/a[text()='Style']")
	private WebElement Stylevalue;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'BusinessObject-Attributes-ToolbarNewAction')])[1]//tbody/tr/td[1]")
	private WebElement NewAttribute;

	@FindBy(xpath="//div[@data-csi-automation='field-ConfigurableAttribute-Form-Node Name']/div[2]/div/input")
	private WebElement AttributeName;

	@FindBy(xpath="//div[@data-csi-automation='field-ConfigurableAttribute-Form-LocaleName']/div[2]/div/input[1]")
	private WebElement DisplayName;

	@FindBy(xpath="//div[@data-csi-automation='field-ConfigurableAttribute-Form-Value Type']/div[3]/input[1]")
	private WebElement AttributeType;

	@FindBy(xpath="//th[text()='Required']//following::input[1]")
	private WebElement Required_Checkbox;

	@FindBy(xpath="//div[@data-csi-automation='field-ConfigurableAttribute-Form-EnumList']/div[3]/input[1]")
	private WebElement AttributeSubtype;

	@FindBy(xpath="//div[@data-csi-automation='field-ConfigurableAttribute-Form-DependsOn']/div[3]/input[1]")
	private WebElement AttributeDependon;

	@FindBy(xpath="//th[text()='Autofill Dependent Enum']//following::input[1]")
	private WebElement Autofill_checkbox;

	@FindBy(xpath="//div[@id='pageCenter']//span[text()='▶']//parent::div")
	private WebElement StyleAttribute_Arrow;

	@FindBy(xpath="//span[@data-csi-tab-name='Form Definition' or text()='Form Definition']")
	private WebElement formDefinitionTab;

	@FindBy(xpath="//table[contains(@data-csi-automation,'CreateFormDefinition-CreateFormDefinition-ToolbarNewAction')]//div[text()='Select Attributes']")
	private WebElement selectAttributes;

	@FindBy(xpath="(//td[contains(@data-csi-heading,'Node Name') and text()='Enum_A']//parent::tr//input)[1]")
	private WebElement Enum_A_chkbox;

	@FindBy(xpath="(//td[contains(@data-csi-heading,'Node Name') and text()='Enum_B']//parent::tr//input)[1]")
	private WebElement Enum_B_chkbox;

	@FindBy(xpath="(//td[contains(@data-csi-heading,'Node Name') and text()='Enum_C']//parent::tr//input)[1]")
	private WebElement Enum_C_chkbox;

	@FindBy(xpath="(//td[contains(@data-csi-heading,'Node Name') and text()='Auto_Test']//parent::tr//input)[1]")
	private WebElement AutoTest_chkbox;

	@FindBy(xpath="(//td[contains(@data-csi-heading,'Node Name') and text()='Auto_String']//parent::tr//input)[1]")
	private WebElement AutoString_chkbox;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Style-HierarchyForm-ParentSeason']//div[3]/input[1]")
	private WebElement StyleSeasonvalue;

	@FindBy(xpath="//div[@data-csi-automation='field-Style-Form-Node Name']//div[2]/div/input")
	private WebElement StyleName;

	@FindBy(xpath="//div[@data-csi-automation='field-Style-Form-Enum_A']//div[3]/input[1]")
	private WebElement StyleEnumvalue;

	@FindBy(xpath="//th[text()='Tested by Automation']//following::input[1]")
	private WebElement TestedByAuto;

	@FindBy(xpath="//td/a[text()='Apparel-BO']")
	private WebElement Apparel_BO_Name;

	@FindBy(xpath="//span//a[text()='Jeans']")
	private WebElement Jeans_value;

	@FindBy(xpath="(//td[@data-csi-heading='Node Name::0']/a[contains(text(),'Apparel-BO')])[1]")
	private WebElement Apparel_BOValue;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'Collection-Styles-ToolbarNewAction')]//div/div)[2]")
	private WebElement NewJeancollectionStyle;

	@FindBy(xpath="//span[contains(@data-csi-automation,'Style-Properties-CustomViewAction')]//span[text()='Views']")
	private WebElement ApparelBOView;

	@FindBy(xpath="//tr[contains(@data-csi-automation,'Style-Properties-CustomViewManage')]//td[text()='Manage Views']")
	private WebElement ApparelBOManageView;

	@FindBy(xpath="//option[text()='Assortment BOM']")
	private WebElement AssBom;

	@FindBy(xpath="//option[text()='Auto_String']")
	private WebElement AutoString;

	@FindBy(xpath="//option[text()='Brand']")
	private WebElement Brand;

	@FindBy(xpath="//option[text()='Enum_A']")
	private WebElement EnumA;

	@FindBy(xpath="//option[text()='Enum_B']")
	private WebElement EnumB;

	@FindBy(xpath="//option[text()='Enum_C']")
	private WebElement EnumC;

	@FindBy(xpath="//option[text()='Image']")
	private WebElement Image;

	@FindBy(xpath="//option[text()='Tested by Automation']")
	private WebElement TestbyAutomation;

	@FindBy(xpath="//td[contains(@data-csi-act,'Auto_String')]")
	private WebElement AutoStringvalue;
	
	@FindBy(xpath="//td[text()='Enum B']//parent::tr/td/div/input")
	private WebElement EnumBvalue;
	
	@FindBy(xpath="//td[text()='Enum C']//parent::tr/td/div/input")
	private WebElement EnumCvalue;

	public WebElement getNewEnumBtn() {
		return NewEnumBtn;
	}

	public WebElement getNewEnumListValue() {
		return NewEnumListValue;
	}

	public WebElement getDependson() {
		return dependson;
	}

	public WebElement getEnumValuleDependson() {
		return EnumValuleDependson;
	}

	public WebElement getEnumA1_checkbox() {
		return EnumA1_checkbox;
	}

	public WebElement getEnumB1_checkbox() {
		return EnumB1_checkbox;
	}

	public WebElement getBusinessObject() {
		return BusinessObject;
	}

	public WebElement getBusinessobj_Dropdown() {
		return Businessobj_Dropdown;
	}

	public WebElement getStylecheckbox() {
		return Stylecheckbox;
	}

	public WebElement getStylevalue() {
		return Stylevalue;
	}

	public WebElement getNewAttribute() {
		return NewAttribute;
	}

	public WebElement getAttributeName() {
		return AttributeName;
	}

	public WebElement getDisplayName() {
		return DisplayName;
	}

	public WebElement getAttributeType() {
		return AttributeType;
	}

	public WebElement getRequired_Checkbox() {
		return Required_Checkbox;
	}

	public WebElement getAttributeSubtype() {
		return AttributeSubtype;
	}

	public WebElement getAttributeDependon() {
		return AttributeDependon;
	}

	public WebElement getAutofill_checkbox() {
		return Autofill_checkbox;
	}

	public WebElement getStyleAttribute_Arrow() {
		return StyleAttribute_Arrow;
	}

	public WebElement getFormDefinitionTab() {
		return formDefinitionTab;
	}

	public WebElement getSelectAttributes() {
		return selectAttributes;
	}

	public WebElement getEnum_A_chkbox() {
		return Enum_A_chkbox;
	}

	public WebElement getEnum_B_chkbox() {
		return Enum_B_chkbox;
	}

	public WebElement getEnum_C_chkbox() {
		return Enum_C_chkbox;
	}

	public WebElement getAutoTest_chkbox() {
		return AutoTest_chkbox;
	}
	
	public WebElement getAutoString_chkbox(){
		return AutoString_chkbox;
	}

	public WebElement getStyleSeasonvalue() {
		return StyleSeasonvalue;
	}

	public WebElement getStyleName() {
		return StyleName;
	}

	public WebElement getStyleEnumvalue() {
		return StyleEnumvalue;
	}

	public WebElement getTestedByAuto() {
		return TestedByAuto;
	}

	public WebElement getApparel_BO_Name() {
		return Apparel_BO_Name;
	}

	public WebElement getJeans_value() {
		return Jeans_value;
	}

	public WebElement getApparel_BOValue() {
		return Apparel_BOValue;
	}

	public WebElement getNewJeancollectionStyle() {
		return NewJeancollectionStyle;
	}

	public WebElement getApparelBOView() {
		return ApparelBOView;
	}

	public WebElement getApparelBOManageView() {
		return ApparelBOManageView;
	}

	public WebElement getAssBom() {
		return AssBom;
	}

	public WebElement getAutoString() {
		return AutoString;
	}

	public WebElement getBrand() {
		return Brand;
	}

	public WebElement getEnumA() {
		return EnumA;
	}

	public WebElement getEnumB() {
		return EnumB;
	}

	public WebElement getEnumC() {
		return EnumC;
	}

	public WebElement getImage() {
		return Image;
	}

	public WebElement getTestbyAutomation() {
		return TestbyAutomation;
	}

	public WebElement getAutoStringvalue() {
		return AutoStringvalue;
	}

	public WebElement getEnumBvalue() {
		return EnumBvalue;
	}

	public WebElement getEnumCvalue() {
		return EnumCvalue;
	}


}
