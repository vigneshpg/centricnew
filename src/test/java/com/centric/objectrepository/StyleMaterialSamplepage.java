package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class StyleMaterialSamplepage extends Commonactions {

	public StyleMaterialSamplepage() {

		PageFactory.initElements(Commonactions.driver, this);
	}

	@FindBy(xpath="(//span[contains(text(),'Documents')]/parent::div/parent::div/parent::div/preceding-sibling::div)[2]")
	private WebElement leftArrow;
	
	@FindBy(xpath="(//td[@data-csi-heading='Node Name::0']/a[contains(text(),'winter')])[1]")
	private WebElement winterSeason;
	
	@FindBy(xpath="(//td[@data-csi-heading='Node Name::0']/a[contains(text(),'Color and Size')])[1]")
	private WebElement ClrAndSize;
	
	@FindBy(xpath="//td[@data-csi-heading='ActualSizeRange:Child:Attributes:0']")
	private WebElement SizeRange;
	
	@FindBy(xpath="(//td[@data-csi-heading='ProductSizes::0']//span)[3]")
	private WebElement editIcon;
	
	@FindBy(xpath="//th[contains(@class,'matrix')]/div/span")
	private WebElement getText_3;
	
	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Close'])[1]")
	private WebElement closeBtn;
	
	@FindBy(xpath="//span[@data-csi-tab-name-name='Colorways' or text()='Colorways']")
	private WebElement colorways;
	
	@FindBy(xpath="(//table[@data-csi-automation='plugin-Style-ProductColors-ToolbarNewActions'])[1]//tbody/tr/td[2]")
	private WebElement NewColorexpand;
	

	@FindBy(xpath="//td[text()='New from Color Specification']")
	private WebElement NewFromColor;
	
	@FindBy(xpath="(//td[contains(text(),'EGRET')]//preceding-sibling::td)//input")
	private WebElement EgretChkBx;
	
	@FindBy(xpath="(//td[contains(text(),'VANILLA')]//preceding-sibling::td)//input")
	private WebElement VanillaChkbx;
	
	@FindBy(xpath="(//td[contains(text(),'ANTIQUE')]//preceding-sibling::td)//input")
	private WebElement AntiqueChkBx;
	
	@FindBy(xpath="//div[@data-csi-crumb-type='Collection']//a")
	private WebElement Jeans;
	
	@FindBy(xpath="(//a[contains(text(),'Color and Size')]//parent::td//following-sibling::td/div/span[@data-csi-act='PopupColorways'])[1]")
	private WebElement popupClrWys;
	
	@FindBy(xpath="(//td[contains(text(),'ANTIQUE')]//following-sibling::td/div/span[@data-csi-act='Delete'])[1]")
	private WebElement AntiqueDel;
	
	@FindBy(xpath="(//a[contains(text(),'EGRET')]//parent::td//following-sibling::td/div/span[@data-csi-act='Copy'])[1]")
	private WebElement EgretCopy;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Colorway')]/div)/div/input)[1]")
	private WebElement Colorwayvalue;
	

	@FindBy(xpath="(//div[contains(@data-csi-automation,'ColorSpecification')]/div)[1]")
	private WebElement ColorSpecValue;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'Color')]//div/div)[2]")
	private WebElement NewColorwayBtn;
	
	@FindBy(xpath="//div[contains(@data-csi-automation,'CreateColorSpecification')]/input")
	private WebElement CreateClrspecChkBx;
	
	@FindBy(xpath="//label[text()='SampleType (1)']/parent::div/div/input")
	private WebElement SampleType;
	
	@FindBy(xpath="//label[text()='MaterialSampleType (1)']/parent::div/div/input")
	private WebElement MaterialSampleType;
	
	@FindBy(xpath="//td[text()='DefectCategory']//preceding-sibling::td/div/input")
	private WebElement defCat;
	
	@FindBy(xpath="//td[text()='MaterialSampleType']//preceding-sibling::td/div/input")
	private WebElement EnumChkBx;
	
	@FindBy(xpath="//td[text()='MaterialFamily']//preceding-sibling::td/div/input")
	private WebElement EnumFamChkBx;
	
	@FindBy(xpath="//td[text()='MarketingSegmentName']//preceding-sibling::td/div/input")
	private WebElement EnumChkBxSeg;
	
	@FindBy(xpath="//td[text()='DefectCategory']//preceding-sibling::td/div/input")
	private WebElement EnumChkBxDefect;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Samples' or text()='Samples']")
	private WebElement Samples;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'ProductSamples')]//div/div)[2]")
	private WebElement SampleBtn;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'SampleType')]/div)[1]")
	private WebElement SampleType1;
	

	@FindBy(xpath="((//div[contains(@data-csi-automation,'Sample')]/div)/div/input)")
	private WebElement SampleValue;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'RequestSampleDimensions')]/div)[1]")
	private WebElement Sampledimension;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'Sample-Form-Colors')]/div)[1]")
	private WebElement ColorsSel;
	
	@FindBy(xpath="(//label[contains(text(),'EGRET')]//parent::div//following-sibling::div//span[contains(text(),'Go to Dialog...')])")
	private WebElement GoTodialog;
	
	@FindBy(xpath="(//label[contains(text(),'Fabric')]//parent::div//following-sibling::div//span[contains(text(),'Go to Dialog...')])")
	private WebElement GoTodialogUp;
	
	@FindBy(xpath="(//label[contains(text(),'large')]//parent::div//following-sibling::div//span[contains(text(),'Go to Dialog...')])")
	private WebElement GoTodialog1;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'Sample-Form-Sizes')]/div)[1]")
	private WebElement SizesSel;
	
	@FindBy(xpath="(//td[contains(text(),'medium')]//preceding-sibling::td)//input")
	private WebElement mediumChkBx;
	
	@FindBy(xpath="(//td[contains(text(),'large')]//preceding-sibling::td)//input")
	private WebElement largeChkbx;
	
	@FindBy(xpath="//div[contains(@data-csi-automation,'RequestSampleCustomQuantity')]/input")
	private WebElement quantityChkBx;
	
	@FindBy(xpath="(//td[contains(text(),'EGRET')]//following-sibling::td)[2]//input[@tabindex='0']")
	private WebElement Egret;
	
	@FindBy(xpath="(//td[contains(text(),'EGRET - Copy')]//following-sibling::td)[3]//input[@tabindex='0']")
	private WebElement Egretcopy;
	
	@FindBy(xpath="(//td[contains(text(),'VANILLA')]//following-sibling::td)[4]//input[@tabindex='0']")
	private WebElement EgretValue;
	
	@FindBy(xpath="(//td[contains(text(),'Green')]//following-sibling::td)[3]//input[@tabindex='0']")
	private WebElement GreenValue;
	
	@FindBy(xpath="(//a[contains(text(),'EGRET-small')]//parent::td//following-sibling::td/div/span[@data-csi-act='Copy'])")
	private WebElement EgretClrCopy;
	
	@FindBy(xpath="(//a[contains(text(),'EGRET')]//parent::td//following-sibling::td/div/span[@data-csi-act='Copy'])[2]")
	private WebElement EgretClrCopy1;
	
	@FindBy(xpath="(//a[contains(text(),'Copy')]//parent::td//following-sibling::td/div/span[@data-csi-act='Delete'])[1]")
	private WebElement EgretClrCopyDel;
	
	@FindBy(xpath="(//a[contains(text(),'Copy')]//parent::td//following-sibling::td/div/span[@data-csi-act='Delete'])[2]")
	private WebElement EgretClrCopyDel1;
	
	@FindBy(xpath="(//a[contains(text(),'Chemical')]/parent::td//following-sibling::td[@data-csi-heading='ApplyToTypes::0'])[1]")
	private WebElement ApplyChemTypes;
	
	@FindBy(xpath="(//td[contains(text(),'Color and Size')]//preceding-sibling::td)//input")
	private WebElement QualityClrChkBx;
	
	@FindBy(xpath="(//td[contains(text(),'Stanadlone')]//preceding-sibling::td)//input")
	private WebElement QualityStandChkbc;
	
	@FindBy(xpath="(//a[contains(text(),'Ironing')]/parent::td//following-sibling::td[@data-csi-heading='ApplyToTypes::0'])[1]")
	private WebElement ApplyIronTypes;
	
	@FindBy(xpath="(//a[contains(text(),'Wash')]/parent::td//following-sibling::td[@data-csi-heading='ApplyToTypes::0'])[1]")
	private WebElement ApplyWashTypes;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Quality' or text()='Quality']")
	private WebElement StyleQuality;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'TestRun')]//div/div)[2]")
	private WebElement NewTestRunBtn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'TestRun')]/div)/div/input)")
	private WebElement TestRunValue;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'TestSpecGroup')]/div)[1]")
	private WebElement TestGrp;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'TestRunSample')]/div)[1]")
	private WebElement TestRunSample;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'User')]/div)[1]")
	private WebElement ResponsibleUser;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'Supplier')]/div)[1]")
	private WebElement Supplier;
	
	@FindBy(xpath="//div[contains(@data-csi-automation,'DimensionMatrix')]/input")
	private WebElement quantityTestChkBx;
	
	@FindBy(xpath="(//td[contains(text(),'VANILLA')]//following-sibling::td)//input[@tabindex='0']")
	private WebElement TestVannilaChkBx;
	
	@FindBy(xpath="(//div[@data-csi-automation='field-TestRun-Form-DimensionColorOption']/div[3]/input)[1]")
	private WebElement coloroption;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'DimensionColors')]/div)[1]")
	private WebElement TestColorsSel;
	
	@FindBy(xpath="(//td[contains(text(),'EGRET - Copy')]//preceding-sibling::td)//input")
	private WebElement EgretCpyChkBx;
	
	@FindBy(xpath="(//table[@data-csi-automation='plugin-BaseProduct-TestRuns-ToolbarNewActions'])[1]//tbody/tr/td[2]")
	private WebElement TestRunexpand;
	
	@FindBy(xpath="//td[contains(text(),'New from Template')]")
	private WebElement TestRunTemplate;
	
	@FindBy(xpath="(//td[contains(text(),'Ironing')]//preceding-sibling::td)/div//input")
	private WebElement IronTempChkBx;
	
	@FindBy(xpath="//td[@data-csi-heading='Node Name::0']/a[contains(text(),'Wash')]")
	private WebElement Washname;
	
	@FindBy(xpath="//td[@data-csi-heading='Code:Child:__Parent__:0']")
	private WebElement TestCode;
	
	@FindBy(xpath="(//td[@data-csi-heading='Comment::0'])[1]")
	private WebElement TestRunComment;
	
	@FindBy(xpath="//a[@data-csi-act='ActionStringRich' and text()='Edit']")
	private WebElement editComm;
	
	@FindBy(xpath="//div[@data-csi-crumb-type='Style']//a")
	private WebElement Apparel;
	
	@FindBy(xpath="(//td[@data-csi-heading='Node Name::0']/a[contains(text(),'Cotton/Rayon Jersey')])[1]")
	private WebElement cottonName;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Properties' or text()='Properties']")
	private WebElement Mproperties;
	
	@FindBy(xpath="//td[@data-csi-heading='ActualSizeRange:Child:Attributes:0']")
	private WebElement MsizeRange;
	
	@FindBy(xpath="(//table[@data-csi-automation='plugin-Material-ProductColors-ToolbarNewActions'])[1]//tbody/tr/td[2]")
	private WebElement NewClrdMatBtnexp;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'ColorMaterial')]/div)/div/input)[1]")
	private WebElement McoloredValue;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Description')]/div)/div/input)[1]")
	private WebElement MDescription;
	
	@FindBy(xpath="(//a[contains(text(),'Green')]//parent::td//following-sibling::td/div/span[@data-csi-act='Copy'])[1]")
	private WebElement MCopy;
	
	@FindBy(xpath="(//a[contains(text(),'Copy')]//parent::td//following-sibling::td/div/span[@data-csi-act='Copy'])[1]")
	private WebElement MEdit;
	
	@FindBy(xpath="(//a[contains(text(),'New')]//parent::td//following-sibling::td/div/span[@data-csi-act='Delete'])[1]")
	private WebElement MDelete;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Samples' or text()='Samples']")
	private WebElement MSamples;
	
	@FindBy(xpath="(//td[@data-csi-heading='Node Name::0']/a[contains(text(),'Acid')])[1]")
	private WebElement AcidTest;
	
	@FindBy(xpath="//span[@data-csi-tab-name='TDS' or text()='TDS']")
	private WebElement MTDS;
	
	@FindBy(xpath="(//div[@data-csi-crumb-type='Material']/a)")
	private WebElement TestRun;
	
	@FindBy(xpath="(//a[contains(text(),'EGRET')]//parent::td//following-sibling::td/div/span[@data-csi-act='SaveAsTemplate'])[1]")
	private WebElement SaveAsTemp;
	
	@FindBy(xpath="//td[@data-csi-heading='DesignatedProductSource::0']")
	private WebElement DesignatedSupplier;
	
	@FindBy(xpath="//td[@data-csi-heading='SampleQuote::0']")
	private WebElement SampleSupplierQuote;
	
	@FindBy(xpath="//td[@data-csi-heading='ProductionQuote::0']")
	private WebElement ProductionSupplierQuote;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Supplier Requests' or text()='Supplier Requests']")
	private WebElement SupplierRequests;
	
	@FindBy(xpath="//div[contains(text(),'No Results Found')]")
	private WebElement NoResults;
	
	@FindBy(xpath="//a[contains(text(),'Style')]/parent::td//following-sibling::td//div/span[text()='content_copy']")
	private WebElement StyleSR_Copy;
	
	@FindBy(xpath="//a[contains(text(),'Copied')]/parent::td//following-sibling::td//div/span[text()='close']")
	private WebElement StyleSR_Delete;
	
	@FindBy(xpath="//div[@data-csi-automation='field-SupplierRequest-DeleteSupplierRequestForm-DeleteQuotes']/input")
	private WebElement DeleteSRSuppQts;
	
	@FindBy(xpath="//div[@data-csi-automation='field-SupplierRequest-DeleteSupplierRequestForm-DeleteSamples']/input")
	private WebElement DeleteSRSample;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'SupplierRequest-Form-Styles')]/div[3]/input)[1]")
	private WebElement SR_StyleValue;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Seasons' or text()='Seasons']")
	private WebElement Season_Btn;
	
	@FindBy(xpath="(//td[@data-csi-heading='Node Name::0']/a[contains(text(),'Style SR')])[1]")
	private WebElement StyleIssue_Name;
	
	@FindBy(xpath="//td[@data-csi-heading='DefaultQuote::0']")
	private WebElement DefaultSuppQuote;

	
	

	public WebElement getDesignatedSupplier() {
		return DesignatedSupplier;
	}

	public WebElement getSampleSupplierQuote() {
		return SampleSupplierQuote;
	}

	public WebElement getProductionSupplierQuote() {
		return ProductionSupplierQuote;
	}

	public WebElement getSupplierRequests() {
		return SupplierRequests;
	}

	public WebElement getNoResults() {
		return NoResults;
	}

	public WebElement getStyleSR_Copy() {
		return StyleSR_Copy;
	}

	public WebElement getStyleSR_Delete() {
		return StyleSR_Delete;
	}

	public WebElement getDeleteSRSuppQts() {
		return DeleteSRSuppQts;
	}

	public WebElement getDeleteSRSample() {
		return DeleteSRSample;
	}

	public WebElement getSR_StyleValue() {
		return SR_StyleValue;
	}

	public WebElement getSeason_Btn() {
		return Season_Btn;
	}

	public WebElement getStyleIssue_Name() {
		return StyleIssue_Name;
	}

	public WebElement getDefaultSuppQuote() {
		return DefaultSuppQuote;
	}

	public WebElement getLeftArrow() {
		return leftArrow;
	}

	public WebElement getWinterSeason() {
		return winterSeason;
	}

	public WebElement getClrAndSize() {
		return ClrAndSize;
	}

	public WebElement getSizeRange() {
		return SizeRange;
	}

	public WebElement getEditIcon() {
		return editIcon;
	}

	public WebElement getGetText_3() {
		return getText_3;
	}

	public WebElement getCloseBtn() {
		return closeBtn;
	}

	public WebElement getColorways() {
		return colorways;
	}

	public WebElement getNewColorexpand() {
		return NewColorexpand;
	}

	public WebElement getNewFromColor() {
		return NewFromColor;
	}

	public WebElement getEgretChkBx() {
		return EgretChkBx;
	}

	public WebElement getVanillaChkbx() {
		return VanillaChkbx;
	}

	public WebElement getAntiqueChkBx() {
		return AntiqueChkBx;
	}

	public WebElement getJeans() {
		return Jeans;
	}

	public WebElement getPopupClrWys() {
		return popupClrWys;
	}

	public WebElement getAntiqueDel() {
		return AntiqueDel;
	}

	public WebElement getEgretCopy() {
		return EgretCopy;
	}

	public WebElement getColorwayvalue() {
		return Colorwayvalue;
	}

	public WebElement getColorSpecValue() {
		return ColorSpecValue;
	}

	public WebElement getNewColorwayBtn() {
		return NewColorwayBtn;
	}

	public WebElement getCreateClrspecChkBx() {
		return CreateClrspecChkBx;
	}

	public WebElement getSampleType() {
		return SampleType;
	}

	public WebElement getMaterialSampleType() {
		return MaterialSampleType;
	}
	
	public WebElement getDefCat() {
		return defCat;
	}

	public WebElement getEnumChkBx() {
		return EnumChkBx;
	}
	
	public WebElement getEnumFamChkBx() {
		return EnumFamChkBx;
	}
	
	public WebElement getEnumChkBxSeg() {
		return EnumChkBxSeg;
	}
	
	public WebElement getEnumChkBxDefect() {
		return EnumChkBxDefect;
	}

	public WebElement getSamples() {
		return Samples;
	}

	public WebElement getSampleBtn() {
		return SampleBtn;
	}

	public WebElement getSampleType1() {
		return SampleType1;
	}

	public WebElement getSampleValue() {
		return SampleValue;
	}

	public WebElement getSampledimension() {
		return Sampledimension;
	}

	public WebElement getColorsSel() {
		return ColorsSel;
	}

	public WebElement getGoTodialog() {
		return GoTodialog;
	}
	
	public WebElement getGoTodialogUp() {
		return GoTodialogUp;
	}
	
	public WebElement getGoTodialog1() {
		return GoTodialog1;
	}

	public WebElement getSizesSel() {
		return SizesSel;
	}

	public WebElement getMediumChkBx() {
		return mediumChkBx;
	}

	public WebElement getLargeChkbx() {
		return largeChkbx;
	}

	public WebElement getQuantityChkBx() {
		return quantityChkBx;
	}

	public WebElement getEgret() {
		return Egret;
	}

	public WebElement getEgretcopy() {
		return Egretcopy;
	}

	public WebElement getEgretValue() {
		return EgretValue;
	}

	public WebElement getEgretClrCopy() {
		return EgretClrCopy;
	}
	
	public WebElement getEgretClrCopy1() {
		return EgretClrCopy1;
	}

	public WebElement getEgretClrCopyDel() {
		return EgretClrCopyDel;
	}

	public WebElement getApplyChemTypes() {
		return ApplyChemTypes;
	}

	public WebElement getQualityClrChkBx() {
		return QualityClrChkBx;
	}

	public WebElement getQualityStandChkbc() {
		return QualityStandChkbc;
	}

	public WebElement getApplyIronTypes() {
		return ApplyIronTypes;
	}

	public WebElement getApplyWashTypes() {
		return ApplyWashTypes;
	}

	public WebElement getStyleQuality() {
		return StyleQuality;
	}

	public WebElement getNewTestRunBtn() {
		return NewTestRunBtn;
	}

	public WebElement getTestRunValue() {
		return TestRunValue;
	}

	public WebElement getTestGrp() {
		return TestGrp;
	}

	public WebElement getTestRunSample() {
		return TestRunSample;
	}

	public WebElement getResponsibleUser() {
		return ResponsibleUser;
	}

	public WebElement getSupplier() {
		return Supplier;
	}

	public WebElement getQuantityTestChkBx() {
		return quantityTestChkBx;
	}

	public WebElement getTestVannilaChkBx() {
		return TestVannilaChkBx;
	}

	public WebElement getColoroption() {
		return coloroption;
	}
	
	public WebElement getTestColorsSel() {
		return TestColorsSel;
	}

	public WebElement getEgretCpyChkBx() {
		return EgretCpyChkBx;
	}

	public WebElement getTestRunexpand() {
		return TestRunexpand;
	}

	public WebElement getTestRunTemplate() {
		return TestRunTemplate;
	}

	public WebElement getIronTempChkBx() {
		return IronTempChkBx;
	}

	public WebElement getWashname() {
		return Washname;
	}

	public WebElement getTestCode() {
		return TestCode;
	}

	public WebElement getTestRunComment() {
		return TestRunComment;
	}

	public WebElement getEditComm() {
		return editComm;
	}

	public WebElement getApparel() {
		return Apparel;
	}

	public WebElement getCottonName() {
		return cottonName;
	}

	public WebElement getMproperties() {
		return Mproperties;
	}

	public WebElement getMsizeRange() {
		return MsizeRange;
	}

	public WebElement getNewClrdMatBtnexp() {
		return NewClrdMatBtnexp;
	}

	public WebElement getMcoloredValue() {
		return McoloredValue;
	}

	public WebElement getMDescription() {
		return MDescription;
	}

	public WebElement getMCopy() {
		return MCopy;
	}

	public WebElement getMEdit() {
		return MEdit;
	}

	public WebElement getMDelete() {
		return MDelete;
	}

	public WebElement getMSamples() {
		return MSamples;
	}

	public WebElement getAcidTest() {
		return AcidTest;
	}

	public WebElement getMTDS() {
		return MTDS;
	}

	public WebElement getTestRun() {
		return TestRun;
	}

	public WebElement getSaveAsTemp() {
		return SaveAsTemp;
	}

	public WebElement getGreenValue() {
		return GreenValue;
	}

	public WebElement getEgretClrCopyDel1() {
		return EgretClrCopyDel1;
	}
	
	

}
