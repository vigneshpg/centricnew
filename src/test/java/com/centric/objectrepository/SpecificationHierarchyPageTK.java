package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class SpecificationHierarchyPageTK extends Commonactions{
	
	public SpecificationHierarchyPageTK() {
		PageFactory.initElements(Commonactions.driver, this);
	}

	@FindBy(xpath="//span[@data-csi-tab='ApparelViews-StructItemLayout' and text()='Hierarchy']")
	private WebElement User_Hierarchy;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'StructItemNameCodes')]//div/div)[2]")
	private WebElement New_Heirarchy_button;

	@FindBy(xpath="((//div[contains(@data-csi-automation,'Name')]/div)/div/input)[1]")
	private WebElement Heirarchy_Name;

	@FindBy(xpath="((//div[contains(@data-csi-automation,'StructItemNameCode-Form-Type')]/div)[3]/input)[1]")
	private WebElement Heirarchy_Type;

	@FindBy(xpath="((//div[contains(@data-csi-automation,'StructItemNameCode-Form-Code')]/div)/div/input)[1]")
	private WebElement Heirarchy_code;

	@FindBy(xpath="((//div[contains(@data-csi-automation,'Description')]/div)/div/input)[1]")
	private WebElement Heirarchy_Description;

	@FindBy(xpath="//td[text()='Collection']//following-sibling::td[contains(@class,'action')]/div/span[@title='Copy']")
	private WebElement Copy_Collection;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'StyleTemplates')]//div/div)[2]")
	private WebElement New_Style_Template_Button;

	@FindBy(xpath="((//div[contains(@data-csi-automation,'Style')]/div)/div/input)[1]")
	private WebElement Style_Name;

	@FindBy(xpath="((//div[contains(@data-csi-automation,'ProductType')]/div)[3]/input)[1]")
	private WebElement Style_Type;

	@FindBy(xpath="//td[contains(@data-csi-heading,'StyleTemplate::0')]/a")
	private WebElement Style_Name_Created;

	@FindBy(xpath="//span[@data-csi-tab='Style-BOMs' and text()='BOM']")
	private WebElement Style_BOM;
	
	@FindBy(xpath="//span[@data-csi-tab='ApparelViews-ClassifierTabs' and text()='Classifier']")
	private WebElement User_Classifier;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'Classifiers')]//div/div)[2]")
	private WebElement New_Classifier_Button;

	@FindBy(xpath="//span[@class='attrPrimary']/preceding-sibling::span/span[@data-csi-act='TableHierarchy']")
	private WebElement Greater_Icon1;

	@FindBy(xpath="(//span[@class='attrPrimary']/preceding-sibling::span/span[@data-csi-act='TableHierarchy'])[2]")
	private WebElement Greater_Icon2;

	@FindBy(xpath="(//span[@class='attrPrimary']/preceding-sibling::span/span[@data-csi-act='TableHierarchy'])[3]")
	private WebElement Greater_Icon3;

	@FindBy(xpath="(//span[@class='attrPrimary']//parent::td/parent::tr/following-sibling::tr//td[contains(@class,'Button')])[1]")
	private WebElement Plus_Icon_1;

	@FindBy(xpath="//span[@class='attrPrimary']/parent::td[@data-csi-act='Node Name::0']//following-sibling::td[contains(@class,'extra-column')]")
	private WebElement Click_Empty0;

	@FindBy(xpath="//span[@class='attrPrimary']/parent::td[@data-csi-act='Node Name::1']//following-sibling::td[contains(@class,'extra-column')]")
	private WebElement Click_Empty1;

	@FindBy(xpath="//span[@class='attrPrimary']/parent::td[@data-csi-act='Node Name::2']//following-sibling::td[contains(@class,'extra-column')]")
	private WebElement Click_Empty2;

	@FindBy(xpath="//span[@class='attrPrimary']/parent::td[@data-csi-act='Node Name::3']//following-sibling::td[contains(@class,'extra-column')]")
	private WebElement Click_Empty3;

	@FindBy(xpath="//span[@data-csi-tab='ApparelViews-Classifier3s' and text()='Classifier3s']")
	private WebElement Classifier3s_Button;

	@FindBy(xpath="(//td[@data-csi-act='Node Name::0'])/a")
	private WebElement Get_Classifeier3S_text;
	
	@FindBy(xpath="//span[@data-csi-tab='ApparelViews-ColorSpecificationsTab' and text()='Color Specification']")
	private WebElement User_ColorSpecification;

	@FindBy(xpath="//span[contains(@data-csi-automation,'ColorSpecifications')]//span[text()='Views']")
	private WebElement CS_View;
	
	@FindBy(xpath="(//tr[contains(@data-csi-automation,'ColorSpecifications')]//td[text()='Manage Views'])")
	private WebElement CS_Mans_View;
	
	@FindBy(xpath="(//select[@class='csiPreferenceSelect '])[1]/option[text()='RGB Hex']")
	private WebElement RGB_Hex;
	
	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Add >'])[1]")
	private WebElement Add_ManageView;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'ColorSpecifications')]//div[contains(text(),'Color Specification')])[1]")
	private WebElement New_Color_Specification_Button;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'ColorSpecification')]/div)/div/input)[1]")
	private WebElement ColorSpecification_Value;
	
	@FindBy(xpath="(//span[text()='+']/parent::div)[1]")
	private WebElement RightIcon_CS;
	
	@FindBy(xpath="//span[text()='RGB Hex']/parent::div/parent::div/parent::th")
	private WebElement AssertDisplayed;
	
	@FindBy(xpath="//td[@data-csi-heading='RGBHex::0']")
	private WebElement RGB_Hex_Field;
	
	@FindBy(xpath="//td[@data-csi-heading='RGBHex::0']//following-sibling::td[contains(@class,'action')]/div/span[@title='Copy']")
	private WebElement Copy_colorSpecification;
	
	@FindBy(xpath="(//td[@data-csi-heading='RGBHex::0']//following-sibling::td[contains(@class,'action')]/div/span[contains(@title,'Merge')])[1]")
	private WebElement merge_symbol;
	
	@FindBy(xpath="//div[contains(text(),'Duplicate')]/parent::td/preceding-sibling::td//input")
	private WebElement CheckBox_1;
	
	@FindBy(xpath="//span[contains(@data-csi-tab,'Site-Enumerations') and text()='Enumerations']")
	private WebElement Enumeration;
	

	@FindBy(xpath="((//div[contains(@data-csi-automation,'EnumValue')]/div)/div/input)[1]")
	private WebElement Enum_Value;
	
	@FindBy(xpath="(//span[contains(@data-csi-automation,'filter-Site-Enumerations')]/span)[1]")
	private WebElement Enumeration_Search;
	
	@FindBy(xpath="//label[text()='DimensionType (1)']/parent::div/div/input")
	private WebElement Dimension_Type;
	
	@FindBy(xpath="//span[text()='Custom']")
	private WebElement Click_Custom;
	
	@FindBy(xpath="(//td[contains(text(),'Size')])[1]")
	private WebElement Gettext_Size;
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'actionRow-EnumList')]//div[text()='add']")
	private WebElement Plus_Icon_2;
		
	@FindBy(xpath="//span[text()='Sizes' or @data-csi-tab='ApparelViews-Sizes']")
	private WebElement User_Size;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'plugin-ApparelViews-Sizes-ToolbarNewActions')]//div[contains(text(),'Size')])")
	private WebElement New_Size_Button;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-ProductSize-Form-Node Name')]/div)/div/input")
	private WebElement Size_Name;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'field-ProductSize-Form-SizeCode')])/div/input)[2]")
	private WebElement Size_Code;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'DimensionType')]/div)[3]/input")
	private WebElement Dimension_Type_value;
	
	@FindBy(xpath="//input[@name='IsTwoDim' and  @type='checkbox']")
	private WebElement TwoDim_CheckBox_1;
	
	@FindBy(xpath="(//tr[@data-csi-form-field='Dimension1Size']/td/div/div/div/input)[3]")
	private WebElement Size_Lenght_Dropdown;
	
	@FindBy(xpath="(//tr[@data-csi-form-field='Dimension2Size']/td/div/div/div/input)[3]")
	private WebElement TwoDim_Size_Length_Drpdown;
	
	@FindBy(xpath="//span[text()='Size Range' or @data-csi-tab='ApparelViews-SizeRanges']")
	private WebElement User_SizeRange;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'SizeRanges')]//div[contains(text(),'Size Range')])[1]")
	private WebElement New_SizeRange_Button;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-SizeRange-Form-Node Name')]/div)/div/input")
	private WebElement SizeRange_Value;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'Description')]/div)/div/input")
	private WebElement SizeRange_Description;

	@FindBy(xpath="//td[@data-csi-heading='Sizes::0']")
	private WebElement ClickSize;

	@FindBy(xpath="//div[@role='option' and @item='1']")
	private WebElement ClickSR1;

	@FindBy(xpath="//div[@role='option' and @item='3']")
	private WebElement ClickSR2;

	@FindBy(xpath="//div[@role='option' and @item='4']")
	private WebElement ClickSR3;

	@FindBy(xpath="//span[text()='Base Size']")
	private WebElement BaseSize;

	@FindBy(xpath="(//span[text()='+']/parent::div)[5]")
	private WebElement Click_SR;

	@FindBy(xpath="//input[@aria-checked='true']/parent::div/parent::td//following-sibling::td[@data-csi-heading='OKforSizeChart::0']//input[@aria-checked='false']")
	private WebElement OkSize_CheckBox;

	@FindBy(xpath="//td[@data-csi-heading='OKforSizeChart::0']//following-sibling::td[contains(@class,'action')]/div/span[text()='insert_chart']")
	private WebElement Chart_SR;

	@FindBy(xpath="(//td[@data-csi-heading='Node Name::0']/preceding-sibling::td//input[@role='checkbox'])[1]")
	private WebElement CheckBox_2;

	@FindBy(xpath="//td[@data-csi-heading='Type::0' and text()='Composite']//following-sibling::td[@data-csi-heading='BaseSize::0']")
	private WebElement BaseSize0;

	@FindBy(xpath="//input[@name='IsTwoDim' and  @type='checkbox']")
	private WebElement TwoDim_CheckBox;

	@FindBy(xpath="(//tr[@data-csi-form-field='Dimension1Type']/td/div/div/div/input)[3]")
	private WebElement Size_Range_Dim_Dropdown;

	@FindBy(xpath="(//tr[@data-csi-form-field='Dimension2Type']/td/div/div/div/input)[3]")
	private WebElement Length_Range_Dim_Dropdown;
	
	@FindBy(xpath="//td[@data-csi-heading='OKforSizeChart::0']//following-sibling::td[contains(@class,'action')]/div/span[contains(text(),'copy')]")
	private WebElement CopySR;

	@FindBy(xpath="//span[@data-csi-automation='plugin-Collection-Styles-CustomViewActions']")
	private WebElement StyleViewBtn;

	@FindBy(xpath="(//tr[@data-csi-act='CustomViewManage'])[2]")
	private WebElement StyleManageCVBtn;

	@FindBy(xpath="//div[@class='csi-header-search-block']//span[@role='option']")
	private WebElement SearchOptionBtn;

	@FindBy(xpath="//input[@name='headerSearchText']")
	private WebElement searchInput;

	@FindBy(how = How.CSS,using = "[data-csi-tab-name='Colorways']")
	private WebElement StyleColorwayTab;

	@FindBy(how = How.CSS,using = "[data-csi-automation='plugin-Style-ProductColors-ToolbarNewActions'] td.dijitArrowButton ")
	private WebElement NewColorwayArrowBtn;

	@FindBy(how = How.CSS,using = "[data-csi-automation='plugin-Style-ProductColors-ToolbarNewActions'] [data-csi-act='NewFromColorSpecification']")
	private WebElement NFCBtn;

	@FindBy(how = How.CSS,using = "[aria-label='Colorways ']")
	private WebElement CV_colorwayOption;

	@FindBy(how = How.CSS,using = "[data-csi-automation='plugin-Style-ProductColors-ToolbarNewActions']")
	private WebElement NowColorwayAction;

	@FindBy(how = How.CSS,using = "[name='CreateColorSpecification']")
	private WebElement CCSpecCheckBoxInStyleHicPage;

	@FindBy(how = How.XPATH,using = "(//div[@data-csi-automation='field-Colorway-Form-Node Name'])[1]//input[@class='dijitReset dijitInputInner']")
	private WebElement ColorwayNameStylePage;

	@FindBy(how = How.CSS,using = "[data-csi-act='Close']")
	private WebElement CloseBtn;



	@FindBy(how = How.XPATH,using = "//span[@data-csi-tab='ApparelViews-ProductSpec']")
	private WebElement SpecificationTab;

	@FindBy(xpath = "//span[text()='Print Designs']")
	private WebElement PrintDesignTab;

	@FindBy(how = How.CSS,using = "[data-csi-automation='plugin-ApparelViews-PrintDesigns-ToolbarNewActions']")
	private WebElement PrintDesignActionBtn;

	@FindBy(how = How.CSS,using = "[data-csi-automation='field-PrintDesign-Form-Node Name'] .dijitInputInner")
	private WebElement PrintDesignInputBx;

	@FindBy(how = How.CSS,using = "[data-csi-automation='field-PrintDesign-Form-PrintType'] .dijitInputInner")
	private WebElement PDTypeArrowBtn;

	@FindBy(how = How.CSS,using = "[data-csi-automation='field-PrintDesign-Form-PrintPositionsCount'] .dijitInputInner")
	private WebElement PDPositionInputBx;

	@FindBy(how = How.CSS,using = "[data-csi-automation='field-PrintDesign-Form-RepeatHeight'] .dijitInputInner")
	private WebElement PDRepeatHeight;

	@FindBy(how = How.CSS,using = "[data-csi-automation='field-PrintDesign-Form-RepeatWidth'] .dijitInputInner")
	private WebElement PDRepeatWidth;

	@FindBy(how = How.CSS,using = "[data-csi-automation='plugin-PrintDesignRevision-RevisionColors-ToolbarNewActions']")
	private WebElement PDNewColor;

	@FindBy(how = How.CSS,using = "[data-csi-tab-name='Positions'] ")
	private WebElement PDPositionTab;

	@FindBy(how = How.XPATH,using = "//span[@data-csi-tab='SizeChartAdmin-Libraries']")
	private WebElement LibrariesTab;

	@FindBy(how = How.CSS,using = "[data-csi-automation='plugin-SizeChartAdmin-Libraries-ToolbarNewActionsCreate']")
	private WebElement LibrariesActionBtn;

	@FindBy(how = How.XPATH,using = "//span[text()='Create a new Canvas']")
	private WebElement NewCanvasActionBtn;

	@FindBy(xpath = "//span[text()='Care Label Libraries']")
	private WebElement CareLabelLibrariesTab;

	@FindBy(xpath = "//span[text()='Color Specification Libraries']")
	private WebElement ColorLabelLibrariesTab;

	@FindBy(xpath = "//span[@data-csi-tab-name='Material Libraries']")
	private WebElement MaterialLabelLibrariesTab;

	@FindBy(xpath = "//span[text()='Print Design Libraries']")
	private WebElement PrintLabelLibrariesTab;

	@FindBy(xpath = "//span[text()='Size Label Libraries']")
	private WebElement SizeLabelLibrariesTab;

	@FindBy(how = How.CSS,using = "[data-csi-automation='plugin-SizeChartAdmin-LibrariesLibColorSpecification-ToolbarNewActions']")
	private WebElement ColorLabelLibrariesAction;

	@FindBy(how = How.CSS,using = "[data-csi-automation='plugin-SizeChartAdmin-LibrariesLibPrintDesign-ToolbarNewActions']")
	private WebElement PrintLabelLibrariesAction;

	@FindBy(how = How.CSS,using = "[data-csi-automation='plugin-SizeChartAdmin-LibrariesLibCareSymbol-ToolbarNewActions']")
	private WebElement CareLabelLibrariesActionBtn;

	public WebElement getColorLabelLibrariesAction() { return ColorLabelLibrariesAction; }

	public WebElement getPrintLabelLibrariesAction() { return PrintLabelLibrariesAction; }

	public WebElement getSpecificationTab() { return SpecificationTab; }

	public WebElement getSizeLabelLibrariesTab() { return SizeLabelLibrariesTab; }

	public WebElement getPrintLabelLibrariesTab() { return PrintLabelLibrariesTab; }

	public WebElement getMaterialLabelLibrariesTab() { return MaterialLabelLibrariesTab; }

	public WebElement getColorLabelLibrariesTab() { return ColorLabelLibrariesTab; }

	public WebElement getCareLabelLibrariesActionBtn() { return CareLabelLibrariesActionBtn; }

	public WebElement getCareLabelLibrariesTab() { return CareLabelLibrariesTab; }


	public WebElement getNewCanvasActionBtn() { return NewCanvasActionBtn; }

	public WebElement getLibrariesActionBtn() { return LibrariesActionBtn; }

	public WebElement getLibrariesTab() { return LibrariesTab; }

	public WebElement getPDPositionTab() { return PDPositionTab; }

	public WebElement getPDNewColor() { return PDNewColor; }

	public WebElement getPDRepeatWidth() { return PDRepeatWidth; }

	public WebElement getPDRepeatHeight() { return PDRepeatHeight; }

	public WebElement getPDPositionInputBx() { return PDPositionInputBx; }

	public WebElement getPDTypeArrowBtn() { return PDTypeArrowBtn; }

	public WebElement getPrintDesignInputBx() { return PrintDesignInputBx; }

	public WebElement getPrintDesignActionBtn() { return PrintDesignActionBtn; }

	public WebElement getPrintDesignTab() { return PrintDesignTab; }

	public WebElement getCloseBtn() { return CloseBtn; }

	public WebElement getColorwayNameStylePage() {
		return ColorwayNameStylePage;
	}

	public WebElement getCCSpecCheckBoxInStyleHicPage() {
		return CCSpecCheckBoxInStyleHicPage;
	}

	public WebElement getNowColorwayAction() {
		return NowColorwayAction;
	}

	public WebElement getCV_colorwayOption() {
		return CV_colorwayOption;
	}

	public WebElement getNFCBtn() {
		return NFCBtn;
	}

	public WebElement getNewColorwayArrowBtn() {
		return NewColorwayArrowBtn;
	}

	public WebElement getStyleColorwayTab() {
		return StyleColorwayTab;
	}

	public WebElement getSearchInput() {
		return searchInput;
	}

	public WebElement getSearchOptionBtn() {
		return SearchOptionBtn;
	}

	public WebElement getStyleManageCVBtn() {
		return StyleManageCVBtn;
	}

	public WebElement getStyleViewBtn() {
		return StyleViewBtn;
	}

	public WebElement getUser_Hierarchy() {
		return User_Hierarchy;
	}

	public WebElement getNew_Heirarchy_button() {
		return New_Heirarchy_button;
	}

	public WebElement getHeirarchy_Name() {
		return Heirarchy_Name;
	}

	public WebElement getHeirarchy_Type() {
		return Heirarchy_Type;
	}

	public WebElement getHeirarchy_code() {
		return Heirarchy_code;
	}

	public WebElement getHeirarchy_Description() {
		return Heirarchy_Description;
	}

	public WebElement getCopy_Collection() {
		return Copy_Collection;
	}

	public WebElement getNew_Style_Template_Button() {
		return New_Style_Template_Button;
	}

	public WebElement getStyle_Name() {
		return Style_Name;
	}

	public WebElement getStyle_Type() {
		return Style_Type;
	}

	public WebElement getStyle_Name_Created() {
		return Style_Name_Created;
	}

	public WebElement getStyle_BOM() {
		return Style_BOM;
	}

	public WebElement getUser_Classifier() {
		return User_Classifier;
	}

	public WebElement getNew_Classifier_Button() {
		return New_Classifier_Button;
	}

	public WebElement getGreater_Icon1() {
		return Greater_Icon1;
	}

	public WebElement getGreater_Icon2() {
		return Greater_Icon2;
	}

	public WebElement getGreater_Icon3() {
		return Greater_Icon3;
	}

	public WebElement getPlus_Icon_1() {
		return Plus_Icon_1;
	}

	public WebElement getClick_Empty0() {
		return Click_Empty0;
	}

	public WebElement getClick_Empty1() {
		return Click_Empty1;
	}

	public WebElement getClick_Empty2() {
		return Click_Empty2;
	}

	public WebElement getClick_Empty3() {
		return Click_Empty3;
	}

	public WebElement getClassifier3s_Button() {
		return Classifier3s_Button;
	}

	public WebElement getGet_Classifeier3S_text() {
		return Get_Classifeier3S_text;
	}

	public WebElement getUser_ColorSpecification() {
		return User_ColorSpecification;
	}

	public WebElement getCS_View() {
		return CS_View;
	}

	public WebElement getCS_Mans_View() {
		return CS_Mans_View;
	}

	public WebElement getRGB_Hex() {
		return RGB_Hex;
	}

	public WebElement getAdd_ManageView() {
		return Add_ManageView;
	}

	public WebElement getNew_Color_Specification_Button() {
		return New_Color_Specification_Button;
	}

	public WebElement getColorSpecification_Value() {
		return ColorSpecification_Value;
	}

	public WebElement getRightIcon_CS() {
		return RightIcon_CS;
	}

	public WebElement getAssertDisplayed() {
		return AssertDisplayed;
	}

	public WebElement getRGB_Hex_Field() {
		return RGB_Hex_Field;
	}

	public WebElement getCopy_colorSpecification() {
		return Copy_colorSpecification;
	}

	public WebElement getMerge_symbol() {
		return merge_symbol;
	}

	public WebElement getCheckBox_1() {
		return CheckBox_1;
	}

	public WebElement getEnumeration() {
		return Enumeration;
	}

	public WebElement getEnum_Value() {
		return Enum_Value;
	}

	public WebElement getEnumeration_Search() {
		return Enumeration_Search;
	}

	public WebElement getDimension_Type() {
		return Dimension_Type;
	}

	public WebElement getClick_Custom() {
		return Click_Custom;
	}

	public WebElement getGettext_Size() {
		return Gettext_Size;
	}

	public WebElement getPlus_Icon_2() {
		return Plus_Icon_2;
	}

	public WebElement getUser_Size() {
		return User_Size;
	}

	public WebElement getNew_Size_Button() {
		return New_Size_Button;
	}

	public WebElement getSize_Name() {
		return Size_Name;
	}

	public WebElement getSize_Code() {
		return Size_Code;
	}

	public WebElement getDimension_Type_value() {
		return Dimension_Type_value;
	}

	public WebElement getTwoDim_CheckBox() {
		return TwoDim_CheckBox;
	}

	public WebElement getSize_Lenght_Dropdown() {
		return Size_Lenght_Dropdown;
	}

	public WebElement getTwoDim_Size_Length_Drpdown() {
		return TwoDim_Size_Length_Drpdown;
	}

	public WebElement getUser_SizeRange() {
		return User_SizeRange;
	}

	public WebElement getNew_SizeRange_Button() {
		return New_SizeRange_Button;
	}

	public WebElement getSizeRange_Value() {
		return SizeRange_Value;
	}

	public WebElement getSizeRange_Description() {
		return SizeRange_Description;
	}

	public WebElement getClickSize() {
		return ClickSize;
	}

	public WebElement getClickSR1() {
		return ClickSR1;
	}

	public WebElement getClickSR2() {
		return ClickSR2;
	}

	public WebElement getClickSR3() {
		return ClickSR3;
	}

	public WebElement getBaseSize() {
		return BaseSize;
	}

	public WebElement getClick_SR() {
		return Click_SR;
	}

	public WebElement getOkSize_CheckBox() {
		return OkSize_CheckBox;
	}

	public WebElement getChart_SR() {
		return Chart_SR;
	}

	public WebElement getCheckBox_2() {
		return CheckBox_2;
	}

	public WebElement getBaseSize0() {
		return BaseSize0;
	}

	public WebElement getTwoDim_CheckBox_1() {
		return TwoDim_CheckBox_1;
	}

	public WebElement getSize_Range_Dim_Dropdown() {
		return Size_Range_Dim_Dropdown;
	}

	public WebElement getLength_Range_Dim_Dropdown() {
		return Length_Range_Dim_Dropdown;
	}

	public WebElement getCopySR() {
		return CopySR;
	}
	
	


}
