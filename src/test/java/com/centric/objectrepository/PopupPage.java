package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class PopupPage extends Commonactions{
	
	public PopupPage() {
		PageFactory.initElements(Commonactions.driver, this);
	}
	
	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save & Go'])[1]")
	private WebElement save_and_go_Btn1;
	
	@FindBy(xpath="(//span[@data-csi-context-parent=\"centric:\"])[1]")
	private WebElement save_and_go_Btn;
	
	@FindBy(xpath="(//span[@data-csi-context-parent=\"centric:\"])[2]")
	private WebElement save_and_new_Btn;
	
	@FindBy(xpath="(//span[@data-csi-context-parent=\"centric:\"])[3]")
	private WebElement save_Btn;
	
	@FindBy(xpath="(//span[@data-csi-context-parent=\"centric:\"])[4]")
	private WebElement cancel_Btn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Season')]/div)/div/input)[1]")
	private WebElement season_Value;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Season')]/div)/div/input)[2]")
	private WebElement code_Value;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Season')]/div)/div/input)[3]")
	private WebElement description_Value;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-Category1-Form-LabelTemplate')]/div[3])/input[1]")
	private WebElement brand_Template;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Category1')]/div)/div/input)[1]")
	private WebElement brand_Value;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Category1')]/div)/div/input)[2]")
	private WebElement brand_code_Value;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Category1')]/div)/div/input)[3]")
	private WebElement brand_description_Value;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Category2')]/div)/div/input)[1]")
	private WebElement dept_Value;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Category2')]/div)/div/input)[2]")
	private WebElement dept_code_Value;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Category2')]/div)/div/input)[3]")
	private WebElement dept_description_Value;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Collection')]/div)/div/input)[1]")
	private WebElement collection_Value;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Collection')]/div)/div/input)[2]")
	private WebElement collection_code_Value;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Collection')]/div)/div/input)[3]")
	private WebElement collection_description_Value;
	
	@FindBy(xpath="((//span[@data-csi-context-parent='centric:'])[1]/parent::div/parent::div//preceding-sibling::div)[1]//table/tbody/tr[1]/td[2]/div/div/div[3]/input")
	private WebElement style_type_Value;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'field-Style-Form-ProductType')]/div)[3]/input)[1]")
	private WebElement Tstyle_type_Value;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-Style-Form-Node Name')]/div)/div/input")
	private WebElement Tsstyle_Value;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'Style')]//div[contains(text(),'New Style')])[1]")
	private WebElement TStyleBtn;
	
	
	@FindBy(xpath="((//span[@data-csi-context-parent='centric:'])[1]/parent::div/parent::div//preceding-sibling::div)[1]//table/tbody/tr[2]/td[2]/div/div/div[3]/input")
	private WebElement template_Value;
	
	@FindBy(xpath="((//span[@data-csi-context-parent='centric:'])[1]/parent::div/parent::div//preceding-sibling::div)[1]//table/tbody/tr[3]/td[2]/div/div/div[3]/input")
	private WebElement shape_Value;
	
	@FindBy(xpath="((//span[@data-csi-context-parent='centric:'])[1]/parent::div/parent::div//preceding-sibling::div)[1]//table/tbody/tr[4]/td[2]/div/div/div[3]/input")
	private WebElement theme_code_Value;
	
	@FindBy(xpath="(//div[@data-csi-automation='field-Style-Form-Node Name']/div)[2]/div/input")
	private WebElement sstyle_Value;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'StyleType')]/div)/div/input")
	private WebElement config_styleType_ValueA;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'StyleType')]/div)/div/input")
	private WebElement config_styleType_ValueB;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'NewRole-Name')]/div)/div/input")
	private WebElement usrMgmnt_NewRole_Value;

	@FindBy(xpath="(//span[@data-csi-context-parent='centric:'])[1]")
	private WebElement config_saveAndnew_Btn;
	
	@FindBy(xpath="(//span[@data-csi-context-parent='centric:'])[2]")
	private WebElement config_save_Btn;
	
	@FindBy(xpath="(//span[@data-csi-context-parent='centric:'])[3]")
	private WebElement config_cancel_Btn;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'MaterialType')]/div)/div/input")
	private WebElement config_materialType_ValueA;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'MaterialType')]/div)/div/input")
	private WebElement config_materialType_ValueB;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'InspectionSectionSubtype')]/div)/div/input")
	private WebElement config_InspectionType_Value;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'ContractualDocumentSubtype')]/div)/div/input")
	private WebElement config_contractType_Value;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'ThemeMasterSubtype')]/div)/div/input")
	private WebElement config_themeType_Value;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'LookupItemSubtype')]/div)/div/input")
	private WebElement config_lookUp_Value;
	
	@FindBy(xpath="(//tr[@data-csi-form-field='ThemeToSeason']/td[2]/div/div/div/input)[1]")
	private WebElement config_theme_DropDown;
	
	@FindBy(xpath="(//tr[@data-csi-form-field='LinkingType']/td[2]/div/div/div/input)[1]")
	private WebElement config_inspection_DropDown;
	
	@FindBy(xpath="(//tr[@data-csi-form-field='MaterialUsage']/td[2]/div/div/div/input)[1]")
	private WebElement config_material_DropDown;
	
	@FindBy(xpath="(//span[@data-csi-context-parent='centric:'])[2]")
	private WebElement config_materialSave_DropDown;
	
	@FindBy(xpath="//div[@widgetid='UpdateConfigurationFull']/input")
	private WebElement update_fullUpdateConfiguration;
	
	@FindBy(xpath="((//div[@class='csi-message-txt']/parent::div)//following-sibling::div[@class='csiActionsNode']//span[@role='button'])[1]")
	private WebElement update_Run_Btn;
	
	@FindBy(xpath="((//div[@class='csi-message-txt']/parent::div)//following-sibling::div[@class='csiActionsNode']//span[@role='button'])[1]")
	private WebElement update_Cancel_Btn;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'BOMSubtype')]/div)/div/input")
	private WebElement BOM_Type_Value;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'SizeChartSubtype')]/div)/div/input")
	private WebElement sizeChart_Type_Value;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'SpecificationDataSheetSubtype')]/div)/div/input")
	private WebElement spec_Type_Value;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'TestSpecSubtype')]/div)/div/input")
	private WebElement test_Type_Value;
	
	@FindBy(xpath="//span[contains(@class,'ButonText') or text()='OK']")
	private WebElement OK_Btn;
	
	@FindBy(xpath="//span[contains(@class,'ButonText') or text()='Delete']")
	private WebElement delete_Btn;

	@FindBy(xpath="//span[text()='Reset']")
	private WebElement Reset;

	@FindBy(xpath="//span[text()='Restore']")
	private WebElement Restore;

	public WebElement getTstyle_type_Value() {
		return Tstyle_type_Value;
	}

	public WebElement getTsstyle_Value() {
		return Tsstyle_Value;
	}

	public WebElement getTStyleBtn() {
		return TStyleBtn;
	}

	public WebElement getCollection_Value() {
		return collection_Value;
	}

	public WebElement getCollection_code_Value() {
		return collection_code_Value;
	}

	public WebElement getCollection_description_Value() {
		return collection_description_Value;
	}

	public WebElement getDept_Value() {
		return dept_Value;
	}

	public WebElement getDept_code_Value() {
		return dept_code_Value;
	}

	public WebElement getDept_description_Value() {
		return dept_description_Value;
	}

	public WebElement getDelete_Btn() {
		return delete_Btn;
	}

	public WebElement getOK_Btn() {
		return OK_Btn;
	}

	public WebElement getConfig_lookUp_Value() {
		return config_lookUp_Value;
	}

	public WebElement getConfig_materialType_ValueA() {
		return config_materialType_ValueA;
	}
	
	public WebElement getConfig_materialType_ValueB() {
		return config_materialType_ValueB;
	}

	public WebElement getBOM_Type_Value() {
		return BOM_Type_Value;
	}

	public WebElement getSizeChart_Type_Value() {
		return sizeChart_Type_Value;
	}

	public WebElement getConfig_InspectionType_Value() {
		return config_InspectionType_Value;
	}

	public WebElement getConfig_contractType_Value() {
		return config_contractType_Value;
	}

	public WebElement getConfig_themeType_Value() {
		return config_themeType_Value;
	}

	public WebElement getConfig_theme_DropDown() {
		return config_theme_DropDown;
	}

	public WebElement getConfig_inspection_DropDown() {
		return config_inspection_DropDown;
	}

	public WebElement getSpec_Type_Value() {
		return spec_Type_Value;
	}

	public WebElement getTest_Type_Value() {
		return test_Type_Value;
	}

	public WebElement getConfig_material_DropDown() {
		return config_material_DropDown;
	}

	public WebElement getConfig_materialSave_DropDown() {
		return config_materialSave_DropDown;
	}

	public WebElement getConfig_saveAndnew_Btn() {
		return config_saveAndnew_Btn;
	}

	public WebElement getConfig_save_Btn() {
		return config_save_Btn;
	}

	public WebElement getConfig_cancel_Btn() {
		return config_cancel_Btn;
	}

	public WebElement getSave_and_go_Btn() {
		return save_and_go_Btn;
	}

	public WebElement getSave_and_new_Btn() {
		return save_and_new_Btn;
	}

	public WebElement getSave_Btn() {
		return save_Btn;
	}

	public WebElement getCancel_Btn() {
		return cancel_Btn;
	}

	public WebElement getSeason_Value() {
		return season_Value;
	}

	public WebElement getCode_Value() {
		return code_Value;
	}

	public WebElement getDescription_Value() {
		return description_Value;
	}

	public WebElement getBrand_Template() {
		return brand_Template;
	}
	
	public WebElement getBrand_Value() {
		return brand_Value;
	}

	public WebElement getBrand_code_Value() {
		return brand_code_Value;
	}

	public WebElement getBrand_description_Value() {
		return brand_description_Value;
	}

	public WebElement getStyle_type_Value() {
		return style_type_Value;
	}

	public WebElement getTemplate_Value() {
		return template_Value;
	}

	public WebElement getShape_Value() {
		return shape_Value;
	}

	public WebElement getTheme_code_Value() {
		return theme_code_Value;
	}

	public WebElement getSstyle_Value() {
		return sstyle_Value;
	}

	public WebElement getUpdate_fullUpdateConfiguration() {
		return update_fullUpdateConfiguration;
	}

	public WebElement getUpdate_Run_Btn() {
		return update_Run_Btn;
	}

	public WebElement getUpdate_Cancel_Btn() {
		return update_Cancel_Btn;
	}
	
	public WebElement getConfig_styleType_ValueA() {
		return config_styleType_ValueA;
	}

	public WebElement getConfig_styleType_ValueB() {
		return config_styleType_ValueB;
	}

	public WebElement getUsrMgmnt_NewRole_Value() {
		return usrMgmnt_NewRole_Value;
	}

	public WebElement getSave_and_go_Btn1() {
		return save_and_go_Btn1;
	}

	public WebElement getReset() {
		return Reset;
	}

	public WebElement getRestore() {
		return Restore;
	}
	

}
