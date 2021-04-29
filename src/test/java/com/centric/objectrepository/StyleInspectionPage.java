package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class StyleInspectionPage extends Commonactions{

	public StyleInspectionPage() {
		PageFactory.initElements(Commonactions.driver, this);
	}

	@FindBy(xpath="//a[contains(text(),'Color and Size')]")
	private WebElement colorandSize;

	@FindBy(xpath="(//span[contains(@data-csi-tab-name,'Specification') or text()='Specification'])")
	private WebElement Specification;

	@FindBy(xpath="(//span[contains(@data-csi-tab-name,'BOM') or text()='BOM'])")
	private WebElement StyleBOM;

	@FindBy(xpath="//table[contains(@data-csi-automation,'plugin-Style-BOMs-ToolbarNewActions')]//div[contains(text(),'New Style BOM')]")
	private WebElement NewstyleBOMbtn;

	@FindBy(xpath="//div[contains(@data-csi-automation,'field-ApparelBOM')]//div[2]/div/input")
	private WebElement styleBOMValue;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-ApparelBOM-Form-Subtype')]//div[3]/input)[1]")
	private WebElement styleBOMSubType;

	@FindBy(xpath="//span[text()='Style BOM']//ancestor::table/parent::div//a")
	private WebElement StyleBomName;

	@FindBy(xpath="(//span[contains(@data-csi-tab-name,'Placements') or text()='Placements'])")
	private WebElement StyleBOMPlacement;

	@FindBy(xpath="//span[contains(@data-csi-automation,'ProductBOMRevision-PartMaterials-CustomViewActions')]//span[text()='Views']")
	private WebElement BomViews1;

	@FindBy(xpath="//tr[contains(@data-csi-automation,'ProductBOMRevision-PartMaterials-CustomViewManage')]//td[text()='Manage Views']")
	private WebElement Bommanageviews1;
	
	@FindBy(xpath="(//span[contains(@data-csi-automation,'plugin-ProductBOMRevision-PartMaterials-CustomViewActions')]//span[text()='Views'])[2]")
	private WebElement BomViews2;

	@FindBy(xpath="(//tr[contains(@data-csi-automation,'plugin-ProductBOMRevision-PartMaterials-CustomViewManage')]//td[text()='Manage Views'])[2]")
	private WebElement Bommanageviews2;

	@FindBy(xpath="(//select[@class='csiPreferenceSelect '])/option[text()='Inspection Relevant']")
	private WebElement inspectionRelevant;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'ProductBOMRevision-PartMaterials-ToolbarNewActionsCreate')])[1]/tbody/tr/td[2]")
	private WebElement NewfrommaterialExpand1;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'ProductBOMRevision-PartMaterials-ToolbarNewActionsCreate')])[2]/tbody/tr/td[2]")
	private WebElement NewfrommaterialExpand2;
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'ToolbarNewAction')]//td[contains(text(),'New from Material')]")
	private WebElement NewFromMaterial;

	@FindBy(xpath="//span[@data-csi-act='NextPage']//span[contains(text(),'All')]")
	private WebElement AllButton;

	@FindBy(xpath="(//td[contains(text(),'100% Cotton/Rayon')]/ancestor::tr/td/div/input)[1]")
	private WebElement cotton_Rayonchkbox;

	@FindBy(xpath="(//td[contains(text(),'100% Cotton')]/ancestor::tr/td/div/input)[1]")
	private WebElement cottonchkbox;

	@FindBy(xpath="//span[text()='Finish']")
	private WebElement Finish;

	@FindBy(xpath="//table/tbody[1]//tr[2]//td[@data-csi-act='Node Name::0']")
	private WebElement PlacementShoulder;

	@FindBy(xpath="//table/tbody[1]//tr[1]//td[@data-csi-act='Node Name::0']")
	private WebElement PlacementNeck;

	@FindBy(xpath="//div[contains(@data-csi-act,'FinalInspectionRelevant:')]/input")
	private WebElement InspectionCheckbox1;

	@FindBy(xpath="//span[contains(@data-csi-automation,'Style-BOMs')]//span[text()='Views']")
	private WebElement styleBOmview;

	@FindBy(xpath="//tr[contains(@data-csi-automation,'Style-BOMs')]//td[text()='Manage Views']")
	private WebElement StyleBOMManageViews;

	@FindBy(xpath="//span[contains(@data-csi-tab-name,'Image') or text()='Image']")
	private WebElement ImageTab;

	@FindBy(xpath="//table[contains(@data-csi-automation,'Style-ImageDataSheets')]//div[contains(text(),'New Image Data Sheet')]")
	private WebElement NewImageBtn;

	@FindBy(xpath="//div[contains(@class,'ImageDataSheets')]//tr//td[2][contains(@data-csi-heading,'Description')]")
	private WebElement Description;

	@FindBy(xpath="//span[contains(@data-csi-automation,'Style-ImageDataSheet')]//span[text()='Views']")
	private WebElement ImageViews;

	@FindBy(xpath="//tr[contains(@data-csi-automation,'Style-ImageDataSheet')]//td[text()='Manage Views']")
	private WebElement ImageManageViews;

	@FindBy(xpath="(//div[contains(@data-csi-act,'FinalInspectionRelevant:')]/input)[2]")
	private WebElement InspectionCheckbox2;

	@FindBy(xpath="//div[contains(@class,'ImageDataSheets')]//td[contains(@data-csi-act,'Node Name')]/a")
	private WebElement Ins_Ids_name;

	@FindBy(xpath="//span[contains(@data-csi-tab-name,'Labeled Images') or text()='Labeled Images']")
	private WebElement LabeledImage;

	@FindBy(xpath="//table[contains(@data-csi-automation,'ImageDataSheetRevision')]//div[contains(text(),'New from Image')]")
	private WebElement NewfromImageBtn;

	@FindBy(xpath="(//div[contains(@data-csi-heading,'Thumbnail')])[1]")
	private WebElement Image1;

	@FindBy(xpath="(//div[contains(@data-csi-heading,'Thumbnail')])[2]")
	private WebElement Image2;

	@FindBy(xpath="(//span[contains(@data-csi-automation,'plugin-ImageDataSheetRevision-LabeledImages-CustomViewActions')]//span[text()='Views'])")
	private WebElement LabelImageview;

	@FindBy(xpath="//tr[contains(@data-csi-automation,'plugin-ImageDataSheetRevision-LabeledImages-CustomViewManage')]//td[text()='Manage Views']")
	private WebElement Labelmanageview;

	@FindBy(xpath="//span[contains(@data-csi-tab-name,'Reviews') and text()='Reviews']")
	private WebElement StyleReview;

	@FindBy(xpath="//table[contains(@data-csi-automation,'Style-StyleReviews')]//div[contains(text(),'New Style Review')]")
	private WebElement NewstyleReviewbtn;

	@FindBy(xpath="//span[@data-csi-automation='plugin-Style-StyleReviews-tableSuspend']//following::tr//td[2][contains(@data-csi-heading,'Description')]")
	private WebElement ReviewDescription;

	@FindBy(xpath="//span[contains(@data-csi-automation,'Style-StyleReviews')]//span[text()='Views']")
	private WebElement ReviewViews;

	@FindBy(xpath="//tr[contains(@data-csi-automation,'Style-StyleReviews')]//td[text()='Manage Views']")
	private WebElement ReviewManageViews;
	
	@FindBy(xpath="//span[@data-csi-automation='plugin-Style-StyleReviews-tableSuspend']//following::td[contains(@data-csi-heading,'Node')]/a")
	private WebElement ReviewName;

	@FindBy(xpath="//span[text()='Create a new Canvas']")
	private WebElement NewCanvas;

	@FindBy(xpath="//span[contains(text(),'Add Note')]")
	private WebElement AddNote;

	@FindBy(xpath="//span[text()='Save & Finish']")
	private WebElement saveFinish;

	@FindBy(xpath="//span[contains(@data-csi-tab-name,'Size Chart') or text()='Size Chart']")
	private WebElement Sizechart;

	@FindBy(xpath="//table[contains(@data-csi-automation,'Style-SizeChart')]//div[contains(text(),'New Size Chart')]")
	private WebElement Newsizechartbtn;

	@FindBy(xpath="//div[contains(@data-csi-automation,'field-SizeChart-Form')]/div[2]//input")
	private WebElement SizechartValue;

	@FindBy(xpath="//span[contains(@data-csi-automation,'Style-SizeCharts')]//span[text()='Views']")
	private WebElement sizechartview;

	@FindBy(xpath="//tr[contains(@data-csi-automation,'Style-SizeCharts')]//td[text()='Manage Views']")
	private WebElement sizechartManage;

	@FindBy(xpath="//a[text()='Ins-SizeChart']")
	private WebElement SizechartName;

	@FindBy(xpath="//span[contains(@data-csi-tab-name,'Dimensions') or text()='Dimensions']")
	private WebElement Dimension;

	@FindBy(xpath="//div[text()='New Dimension']//following::table[contains(@data-csi-automation,'SizeChartRevision-Dimensions-ToolbarNewActions')]//td[2]")
	private WebElement SizeDimesnionExpand;

	@FindBy(xpath="//tr//td[contains(text(),'New from Dimension')]")
	private WebElement NewfromDimension;

	@FindBy(xpath="(//span[@data-csi-automation='plugin-SizeChartRevision-Dimensions-CustomViewActions']//span[text()='Views'])[1]")
	private WebElement DimensionView;

	@FindBy(xpath="(//tr[@data-csi-automation='plugin-SizeChartRevision-Dimensions-CustomViewManage']//td[text()='Manage Views'])[1]")
	private WebElement Dimensionmanage; 
	
	@FindBy(xpath="(//span[@data-csi-automation='plugin-SizeChartRevision-Dimensions-CustomViewActions']//span[text()='Views'])[2]")
	private WebElement DimensionView1;

	@FindBy(xpath="(//tr[@data-csi-automation='plugin-SizeChartRevision-Dimensions-CustomViewManage']//td[text()='Manage Views'])[2]")
	private WebElement Dimensionmanage1; 

	@FindBy(xpath="//select[@class='csiPreferenceSelect ']/option[text()='Inspection Tol (-)']")
	private WebElement InspectionTol1;

	@FindBy(xpath="//select[@class='csiPreferenceSelect ']/option[text()='Inspection Tol (+)']")
	private WebElement InspectionTol2;

	@FindBy(xpath="(//span[contains(@data-csi-tab-name,'Spec') or text()='Spec'])[2]")
	private WebElement Spec;

	@FindBy(xpath="//table[contains(@data-csi-automation,'Style-SpecificationDataSheet')]//div[contains(text(),'New Spec Data Sheet')]")
	private WebElement NewSpecBtn;

	@FindBy(xpath="//div[contains(@data-csi-automation,'SpecificationDataSheet-Form-Subtype')]/div[3]/input[1]")
	private WebElement Spectypevalue;

	@FindBy(xpath="//div[contains(@data-csi-automation,'SpecificationDataSheet-Form-Node Name')]/div[2]/div/input")
	private WebElement Specdatasheet;

	@FindBy(xpath="//div[contains(@data-csi-automation,'SpecificationDataSheet-Form-Description')]/div[2]/div/input")
	private WebElement SpecDescription;

	@FindBy(xpath="//table[contains(@data-csi-automation,'SpecificationDataSheetRevision-Items')]//td[2]")
	private WebElement CreateExpand;

	@FindBy(xpath="(//tr/td[text()='Create Custom Spec Section'])[2]")
	private WebElement createcustomspec;

	@FindBy(xpath="//div[contains(@data-csi-automation,'SpecificationSection-Form-Node Name')]/div/div/input")
	private WebElement specvalue;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'SpecificationDataSheetRevision-Items')]//td[2])[3]")
	private WebElement PlusExpand;

	@FindBy(xpath="//table[contains(@data-csi-automation,'actionRow-SpecificationDataSheetRevision')]//td[contains(text(),'New Special')]")
	private WebElement NewSpecial;

	@FindBy(xpath="//div[contains(@data-csi-automation,'SpecificationDataSheetItem-Form-Node Name')]/div/div/input")
	private WebElement specitemvalue;

	@FindBy(xpath="//span[contains(@data-csi-automation,'SpecificationDataSheetRevision-Items-CustomViewActions')]//span[text()='Views']")
	private WebElement speccreateViews;

	@FindBy(xpath="//tr[contains(@data-csi-automation,'SpecificationDataSheetRevision-Items-CustomViewManage')]//td[text()='Manage Views']")
	private WebElement speccreatemanageviews;

	@FindBy(xpath="//span[contains(@data-csi-automation,'Style-SpecificationDataSheets-CustomViewAction')]//span[text()='Views']")
	private WebElement specview;

	@FindBy(xpath="//tr[contains(@data-csi-automation,'Style-SpecificationDataSheets-CustomViewManage')]//td[text()='Manage Views']")
	private WebElement specmanage;

	@FindBy(xpath="(//*[text()='Ins-BOM']//following::span[@data-csi-act='Copy' or text()='content_copy'])[1]")
	private WebElement BOMCopy;

	@FindBy(xpath="(//*[text()='Ins-BOM']//following::span[@data-csi-act-name='check_circle' or text()='check_circle'])[1]")
	private WebElement Actioncheck;

	@FindBy(xpath="//span[text()='Continue']")
	private WebElement Continue;

	public WebElement getColorandSize() {
		return colorandSize;
	}

	public WebElement getSpecification() {
		return Specification;
	}

	public WebElement getStyleBOM() {
		return StyleBOM;
	}

	public WebElement getNewstyleBOMbtn() {
		return NewstyleBOMbtn;
	}

	public WebElement getStyleBOMValue() {
		return styleBOMValue;
	}
	
	public WebElement getStyleBOMSubType() {
		return styleBOMSubType;
	}

	public WebElement getStyleBomName() {
		return StyleBomName;
	}

	public WebElement getStyleBOMPlacement() {
		return StyleBOMPlacement;
	}

	public WebElement getBomViews1() {
		return BomViews1;
	}

	public WebElement getBommanageviews1() {
		return Bommanageviews1;
	}
	
	public WebElement getBomViews2() {
		return BomViews2;
	}

	public WebElement getBommanageviews2() {
		return Bommanageviews2;
	}

	public WebElement getInspectionRelevant() {
		return inspectionRelevant;
	}

	public WebElement getNewfrommaterialExpand1() {
		return NewfrommaterialExpand1;
	}
	
	public WebElement getNewfrommaterialExpand2() {
		return NewfrommaterialExpand2;
	}
	
	public WebElement getNewFromMaterial() {
		return NewFromMaterial;
	}

	public WebElement getAllButton() {
		return AllButton;
	}

	public WebElement getCotton_Rayonchkbox() {
		return cotton_Rayonchkbox;
	}

	public WebElement getCottonchkbox() {
		return cottonchkbox;
	}

	public WebElement getFinish() {
		return Finish;
	}

	public WebElement getPlacementShoulder() {
		return PlacementShoulder;
	}

	public WebElement getPlacementNeck() {
		return PlacementNeck;
	}

	public WebElement getInspectionCheckbox1() {
		return InspectionCheckbox1;
	}

	public WebElement getStyleBOmview() {
		return styleBOmview;
	}

	public WebElement getStyleBOMManageViews() {
		return StyleBOMManageViews;
	}

	public WebElement getImageTab() {
		return ImageTab;
	}

	public WebElement getNewImageBtn() {
		return NewImageBtn;
	}

	public WebElement getDescription() {
		return Description;
	}

	public WebElement getImageViews() {
		return ImageViews;
	}

	public WebElement getImageManageViews() {
		return ImageManageViews;
	}

	public WebElement getInspectionCheckbox2() {
		return InspectionCheckbox2;
	}

	public WebElement getIns_Ids_name() {
		return Ins_Ids_name;
	}

	public WebElement getLabeledImage() {
		return LabeledImage;
	}

	public WebElement getNewfromImageBtn() {
		return NewfromImageBtn;
	}

	public WebElement getImage1() {
		return Image1;
	}

	public WebElement getImage2() {
		return Image2;
	}

	public WebElement getLabelImageview() {
		return LabelImageview;
	}

	public WebElement getLabelmanageview() {
		return Labelmanageview;
	}

	public WebElement getStyleReview() {
		return StyleReview;
	}

	public WebElement getNewstyleReviewbtn() {
		return NewstyleReviewbtn;
	}

	public WebElement getReviewDescription() {
		return ReviewDescription;
	}

	public WebElement getReviewViews() {
		return ReviewViews;
	}

	public WebElement getReviewManageViews() {
		return ReviewManageViews;
	}
	
	public WebElement getReviewName() {
		return ReviewName;
	}	

	public WebElement getNewCanvas() {
		return NewCanvas;
	}

	public WebElement getAddNote() {
		return AddNote;
	}

	public WebElement getSaveFinish() {
		return saveFinish;
	}

	public WebElement getSizechart() {
		return Sizechart;
	}

	public WebElement getNewsizechartbtn() {
		return Newsizechartbtn;
	}

	public WebElement getSizechartValue() {
		return SizechartValue;
	}

	public WebElement getSizechartview() {
		return sizechartview;
	}

	public WebElement getSizechartManage() {
		return sizechartManage;
	}

	public WebElement getSizechartName() {
		return SizechartName;
	}

	public WebElement getDimension() {
		return Dimension;
	}

	public WebElement getSizeDimesnionExpand() {
		return SizeDimesnionExpand;
	}

	public WebElement getNewfromDimension() {
		return NewfromDimension;
	}

	public WebElement getDimensionView() {
		return DimensionView;
	}

	public WebElement getDimensionmanage() {
		return Dimensionmanage;
	}
	
	public WebElement getDimensionView1() {
		return DimensionView1;
	}

	public WebElement getDimensionmanage1() {
		return Dimensionmanage1;
	}

	public WebElement getInspectionTol1() {
		return InspectionTol1;
	}

	public WebElement getInspectionTol2() {
		return InspectionTol2;
	}

	public WebElement getSpec() {
		return Spec;
	}

	public WebElement getNewSpecBtn() {
		return NewSpecBtn;
	}

	public WebElement getSpectypevalue() {
		return Spectypevalue;
	}

	public WebElement getSpecdatasheet() {
		return Specdatasheet;
	}

	public WebElement getSpecDescription() {
		return SpecDescription;
	}

	public WebElement getCreateExpand() {
		return CreateExpand;
	}

	public WebElement getCreatecustomspec() {
		return createcustomspec;
	}

	public WebElement getSpecvalue() {
		return specvalue;
	}

	public WebElement getPlusExpand() {
		return PlusExpand;
	}

	public WebElement getNewSpecial() {
		return NewSpecial;
	}

	public WebElement getSpecitemvalue() {
		return specitemvalue;
	}

	public WebElement getSpeccreateViews() {
		return speccreateViews;
	}

	public WebElement getSpeccreatemanageviews() {
		return speccreatemanageviews;
	}

	public WebElement getSpecview() {
		return specview;
	}

	public WebElement getSpecmanage() {
		return specmanage;
	}

	public WebElement getBOMCopy() {
		return BOMCopy;
	}

	public WebElement getActioncheck() {
		return Actioncheck;
	}

	public WebElement getContinue() {
		return Continue;
	}


}