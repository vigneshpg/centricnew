package com.centric.objectrepository;

import com.centric.resources.Commonactions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DocumentPage extends Commonactions {

	public DocumentPage() {

		PageFactory.initElements(Commonactions.driver, this);
	}

	@FindBy(xpath="//span[@data-csi-tab-name='Documents' or text()='Documents']")
	private WebElement Document;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Documents' and text()='Documents']")
	private WebElement UserDocuments;
	
	@FindBy(xpath="(//table[@data-csi-automation='plugin-DocumentContainer-Documents-ToolbarNewActions'])[1]//tbody/tr/td[2]")
	private WebElement Expand;
	
	@FindBy(xpath="(//td[contains(text(),'New Document')])")
	private WebElement NewDocument;
	
	@FindBy(xpath="(//td[contains(text(),'New Document')])")
	private WebElement NewMatDocument;
	
	@FindBy(xpath="//td[contains(@data-csi-heading,'File')]")
	private WebElement file;
	
	@FindBy(xpath="//div/a[contains(text(),'Browse Files')]")
	private WebElement browse;
	
	@FindBy(xpath="(//td[contains(text(),'3D Document')])[2]")
	private WebElement ThreeeDDocument;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'Documents')]//div/div)[2]")
	private WebElement AddDocument;
	
	@FindBy(xpath="//td[contains(@data-csi-heading,'Node Name')]/a")
	private WebElement Nameofcreateddoc;
	
	@FindBy(xpath="//div[contains(@class,'Documents')]//span[text()='+']/parent::div")
	private WebElement DocPlusIcon;
	
	@FindBy(xpath="(//td[contains(@data-csi-heading,'Node')]/a)[1]")
	private WebElement FileName;
	
	@FindBy(xpath="//div/span[text()='DRAFT']")
	private WebElement Draft;
	
	@FindBy(xpath="//a[contains(text(),'Page')]//parent::td//following-sibling::td/div/span[text()='close']")
	private WebElement delete;
	
	@FindBy(xpath="(//td[contains(@data-csi-act,'Latest')])") 
	private WebElement getText;
	
	@FindBy(xpath="(//tr/td[text()='Share Document'])[1]")
	private WebElement shareDocument;
	
	@FindBy(xpath="//span[@data-csi-automation='filter-Document-SelectAllDocAndCommentOwner-Node Name']")
	private WebElement SD_Filter;
	
	@FindBy(xpath="//div[contains(@class,'SelectAllDocAndCommentOwner')]//span[text()='+']/parent::div")
	private WebElement SD_plus;
	
	@FindBy(xpath="(//span[text()='Code']//parent::div/parent::div/parent::th//preceding-sibling::th)[1]//input")
	private WebElement SD_Chkbx;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Styles' or text()='Styles']")
	private WebElement styles;
	
	@FindBy(xpath="//span[@data-csi-automation='filter-ApparelViews-AllStyles-Node Name']")
	private WebElement style_Filter;
	
	@FindBy(xpath="//div[contains(@class,'Style')]//span[text()='+']/parent::div")
	private WebElement Style_plus;
	
	@FindBy(xpath="(//td[@data-csi-act='Node Name::0']/a)[1]")
	private WebElement Style_Name;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Docs & Comments' or text()='Docs & Comments']")
	private WebElement DocandComm;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Documents' or text()='Docs & Comments']")
	private WebElement DocandComments;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'ReferencedDocuments')]//div/div)[2]")
	private WebElement selectdocbtn;
	
	@FindBy(xpath="(//td[@data-csi-heading='Node Name::0']/a)[1]")
	private WebElement gettext2;
	
	@FindBy(xpath="(//span[text()='Material' or @data-csi-tab-name='Material'])[2]")
	private WebElement material;
	
	@FindBy(xpath="(//td[contains(@data-csi-heading,'Node Name')]/a[text()='Supplier'])[2]")
	private WebElement Nameofcreateddoc1;
	
	@FindBy(xpath="(//span[text()='Material' or @data-csi-tab-name='Material'])")
	private WebElement material_base;
	
	@FindBy(xpath="//span[@data-csi-tab-name='All Documents' and text()='All Documents'] ")
	private WebElement Documents;
	
	@FindBy(xpath="(//span[contains(@data-csi-automation,'filter-Data-AllDocuments-Node Name')])[1]")
	private WebElement AllDoc_Filter;
	
	@FindBy(xpath="//div[contains(@class,'AllDocument')]//span[text()='+']/parent::div")
	private WebElement AllDoc_Plus;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Contractual Documents' and text()='Contractual Documents']")
	private WebElement contDoc;
	
	@FindBy(xpath="(//table[@data-csi-automation='plugin-Data-AllContractualDocuments-ToolbarNewActions']//div/div)[2]")
	private WebElement NewConAllDoc;
	
	@FindBy(xpath="(//div[@data-csi-automation='field-ContractualDocument-Form-Subtype']/div)[1]")
	private WebElement ConType;
	
	@FindBy(xpath="//div[@data-csi-automation='field-ContractualDocument-Form-Node Name']/div[2]/div/input")
	private WebElement conDocName;
	
	@FindBy(xpath="//div[@data-csi-automation='field-ContractualDocument-Form-Description']/div[2]/div/input")
	private WebElement conDescription;
	
	@FindBy(xpath="//div[@data-csi-automation='field-ContractualDocument-Form-EffectiveFrom']//div[3]/input")
	private WebElement EffFrom;
	
	@FindBy(xpath="//div[@data-csi-automation='field-ContractualDocument-Form-EffectiveTo']//div[3]/input")
	private WebElement EffTo;
	
	@FindBy(xpath="//input[@data-csi-automation='field-ContractualDocument-Form-SourceFile']/parent::div")
	private WebElement Sourcefile;
	
	@FindBy(xpath="(//div[@data-csi-automation='field-ContractualDocument-Form-SourceType']/div)[1]")
	private WebElement sourceType;
	
	@FindBy(xpath="//div[@data-csi-automation='field-ContractualDocument-Form-CDocSourceWebName']//div/div/input")
	private WebElement SourceName;
	
	@FindBy(xpath="//div[@data-csi-automation='field-ContractualDocument-Form-SourceWebURL']//div/div/input")
	private WebElement SourceUrl;
	
	@FindBy(xpath="(//td[text()='CDOC-HED']//following-sibling::td/div/span[text()='check_circle'])[1]")
	private WebElement ApproveDoc;
	
	@FindBy(xpath="//a[text()='CDOC-ALL']")
	private WebElement createddocname;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Contractual Document Groups']")
	private WebElement ConDocGrp;
	
	@FindBy(xpath="(//div[contains(@class,'ContractualDocument')]//span[text()='+']/parent::div)[2]")
	private WebElement conDoc_Plus;
	
	@FindBy(xpath="(//table[@data-csi-automation='plugin-ContractualDocumentGroup-ContractualDocuments-ToolbarNewActions']//div/div)[2]")
	private WebElement NewConDocu;
	
	@FindBy(xpath="(//table[@data-csi-automation='plugin-Data-ContractualDocumentGroupsSwitchboard-ToolbarNewActions']//div/div)[2]")
	private WebElement NewConDocGrp;
	
	@FindBy(xpath="(//span[text()='remove_circle_outline']/preceding-sibling::span/span/span/span[text()='more_horiz'])[1]")
	private WebElement ACtionIconGrp;	
	
	@FindBy(xpath="((//td[contains(text(),'Automation')])/following::td/div/span[text()='content_copy'])[1]")
	private WebElement GrpCopy;
	
	@FindBy(xpath="(//table[@data-csi-automation='plugin-ContractualDocumentGroup-ContractualDocuments-ToolbarNewActions'])[1]//tbody/tr/td[2]")
	private WebElement DocumentExpand;
	
	@FindBy(xpath="(//table[@data-csi-automation='plugin-ContractualDocumentGroup-ContractualDocuments-ToolbarNewActions'])[2]")
	private WebElement selectDocument;
	
	@FindBy(xpath="(//span[text()='Contractual Document'])[3]//preceding::th[1]/div/input")
	private WebElement cehckboxalldoc;
	
	@FindBy(xpath="(//span[text()='remove_circle_outline']/preceding-sibling::span/span/span/span[text()='more_horiz'])[1]")
	private WebElement ApproveIcon;
	
	@FindBy(xpath="(//td[text()='Move'])")
	private WebElement Move;
	
	@FindBy(xpath="//span[text()='Move']/parent::div/parent::div//div[@data-csi-act='ViewSelect']")
	private WebElement selectgrp;
	
	@FindBy(xpath="(//div[@data-csi-act='ViewSelect'])[1]")
	private WebElement grp1;

	@FindBy(xpath="//td[text()='Push to Suppliers']")
	private WebElement pushToSupp;

	@FindBy(xpath="(//td[text()='Push to Suppliers'])[2]")
	private WebElement pushToSupp2;
	
	@FindBy(xpath="//span[text()='Supplier']/parent::div/parent::th/preceding-sibling::th//input")
	private WebElement checkbox;

	@FindBy(xpath="(//span[text()='remove_circle_outline']/preceding-sibling::span/span/span/span[text()='more_horiz'])[2]")
	private WebElement ApproveIcon2;

	@FindBy(xpath="//span[@data-csi-tab-name='Supplier Contractual Documents' or text()='Supplier Contractual Documents']")
	private WebElement supplierConDoc;

	@FindBy(xpath="//div[contains(text(),'Displaying')]")
	private WebElement Display;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'ReferencedDocuments')])[1]//tbody/tr/td[2]")
	private WebElement ExpandStyle;
	
	@FindBy(xpath="//td/span[@data-csi-act='Revise']")
	private WebElement docRevise;

	@FindBy(xpath="//div[text()='DRAFT']//preceding::td[contains(@data-csi-heading,'SourceFile:Child:LatestRevision:0')]")
	private WebElement SourceFile;

	@FindBy(xpath="//div[text()='The Effective To date cannot be before today.']")
	private WebElement EffDate;

	@FindBy(xpath="//td[@data-csi-act='EffectiveTo:Child:LatestRevision:0']")
	private WebElement EditEffTo;


	@FindBy(xpath="//td[text()='Update Supplier Contractual Documents']")
	private WebElement updateSupplier;

	@FindBy(xpath="(//a[text()='CDOC-ALL']/parent::div/parent::td//parent::tr//td[contains(@data-csi-heading,'SourceFile')])[2]")
	private WebElement uploadedfilename;

	@FindBy(xpath="//span[@data-csi-tab-name='Contractual Documents' or text()='Contractual Documents']")
	private WebElement conDocument;

	@FindBy(xpath="(//table[@data-csi-automation='plugin-Supplier-SupplierContractualDocumentsHost-ToolbarNewActions'])[1]//tbody/tr/td")
	private WebElement NewFormConDoc;

	@FindBy(xpath="(//td[text()='CDOC-RA']/parent::tr//input)[1]")
	private WebElement newformcheckbox;

	@FindBy(xpath="(//table[@data-csi-automation='plugin-Supplier-SupplierContractualDocumentsHost-ToolbarNewActions'])[1]//tbody/tr/td[2]")
	private WebElement newformexpand;
	
	@FindBy(xpath="//td[text()='New from Contractual Document Group...']")
	private WebElement NewFormGrp;
	
	@FindBy(xpath="//td[text()='CDOC-Groups-COPY']/parent::tr//input")
	private WebElement GroupCopy;
	
	@FindBy(xpath="//td[contains(text(),'New Special')]")
	private WebElement Newspecial;
	
	@FindBy(xpath="//th[text()='Source Type']")
	private WebElement SourceText;
	
	@FindBy(xpath="//div[@data-csi-automation='field-ContractualDocument-Form-Node Name']//div[2]/div/input")
	private WebElement SuppCOnDocDesc;
	
	@FindBy(xpath="//td/div/span[text()='check_circle']")
	private WebElement ApproveAction;
	
	
	
	public WebElement getDocRevise() {
		return docRevise;
	}

	public WebElement getUpdateSupplier() {
		return updateSupplier;
	}

	public WebElement getUploadedfilename() {
		return uploadedfilename;
	}

	public WebElement getConDocument() {
		return conDocument;
	}

	public WebElement getNewformcheckbox() {
		return newformcheckbox;
	}

	public WebElement getNewformexpand() {
		return newformexpand;
	}

	public WebElement getNewFormGrp() {
		return NewFormGrp;
	}

	public WebElement getGroupCopy() {
		return GroupCopy;
	}

	public WebElement getNewspecial() {
		return Newspecial;
	}
	
	public WebElement getSourceText() {
		return SourceText;
	}

	public WebElement getSuppCOnDocDesc() {
		return SuppCOnDocDesc;
	}

	public WebElement getApproveAction() {
		return ApproveAction;
	}

	public WebElement getdocRevise() {
		return docRevise;
	}


	public WebElement getSourceFile() {
		return SourceFile;
	}

	public WebElement getEffDate() {
		return EffDate;
	}

	public WebElement getEditEffTo() {
		return EditEffTo;
	}

	public WebElement getupdateSupplier() {
		return updateSupplier;
	}

	public WebElement getuploadedfilename() {
		return uploadedfilename;
	}

	public WebElement getconDocument() {
		return conDocument;
	}
	public WebElement getNewFormConDoc() {
		return NewFormConDoc;


	}

	public WebElement getExpandStyle() {
		return ExpandStyle;
	}

	public WebElement getDocument() {
		return Document;
	}

	public WebElement getUserDocuments() {
		return UserDocuments;
	}

	public WebElement getExpand() {
		return Expand;
	}

	public WebElement getNewDocument() {
		return NewDocument;
	}

	public WebElement getFile() {
		return file;
	}

	public WebElement getBrowse() {
		return browse;
	}

	public WebElement getThreeeDDocument() {
		return ThreeeDDocument;
	}

	public WebElement getAddDocument() {
		return AddDocument;
	}

	public WebElement getNameofcreateddoc() {
		return Nameofcreateddoc;
	}

	public WebElement getDocPlusIcon() {
		return DocPlusIcon;
	}

	public WebElement getFileName() {
		return FileName;
	}

	public WebElement getDraft() {
		return Draft;
	}

	public WebElement getDelete() {
		return delete;
	}

	public WebElement getGetText() {
		return getText;
	}

	public WebElement getShareDocument() {
		return shareDocument;
	}

	public WebElement getSD_Filter() {
		return SD_Filter;
	}

	public WebElement getSD_plus() {
		return SD_plus;
	}

	public WebElement getSD_Chkbx() {
		return SD_Chkbx;
	}

	public WebElement getStyles() {
		return styles;
	}

	public WebElement getStyle_Filter() {
		return style_Filter;
	}

	public WebElement getStyle_plus() {
		return Style_plus;
	}

	public WebElement getStyle_Name() {
		return Style_Name;
	}

	public WebElement getDocandComm() {
		return DocandComm;
	}

	public WebElement getSelectdocbtn() {
		return selectdocbtn;
	}

	public WebElement getGettext2() {
		return gettext2;
	}

	public WebElement getMaterial() {
		return material;
	}

	public WebElement getNameofcreateddoc1() {
		return Nameofcreateddoc1;
	}

	public WebElement getMaterial_base() {
		return material_base;
	}

	public WebElement getDocuments() {
		return Documents;
	}

	public WebElement getAllDoc_Filter() {
		return AllDoc_Filter;
	}

	public WebElement getAllDoc_Plus() {
		return AllDoc_Plus;
	}

	public WebElement getContDoc() {
		return contDoc;
	}

	public WebElement getNewConAllDoc() {
		return NewConAllDoc;
	}

	public WebElement getConType() {
		return ConType;
	}

	public WebElement getConDocName() {
		return conDocName;
	}

	public WebElement getConDescription() {
		return conDescription;
	}

	public WebElement getEffFrom() {
		return EffFrom;
	}

	public WebElement getEffTo() {
		return EffTo;
	}

	public WebElement getSourcefile() {
		return Sourcefile;
	}

	public WebElement getSourceType() {
		return sourceType;
	}

	public WebElement getSourceName() {
		return SourceName;
	}

	public WebElement getSourceUrl() {
		return SourceUrl;
	}

	public WebElement getApproveDoc() {
		return ApproveDoc;
	}

	public WebElement getCreateddocname() {
		return createddocname;
	}

	public WebElement getConDocGrp() {
		return ConDocGrp;
	}

	public WebElement getConDoc_Plus() {
		return conDoc_Plus;
	}

	public WebElement getNewConDocu() {
		return NewConDocu;
	}

	public WebElement getACtionIconGrp() {
		return ACtionIconGrp;
	}

	public WebElement getGrpCopy() {
		return GrpCopy;
	}

	public WebElement getDocumentExpand() {
		return DocumentExpand;
	}

	public WebElement getSelectDocument() {
		return selectDocument;
	}

	public WebElement getCehckboxalldoc() {
		return cehckboxalldoc;
	}

	public WebElement getApproveIcon() {
		return ApproveIcon;
	}

	public WebElement getMove() {
		return Move;
	}

	public WebElement getSelectgrp() {
		return selectgrp;
	}

	public WebElement getGrp1() {
		return grp1;
	}

	public WebElement getPushToSupp() {
		return pushToSupp;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getApproveIcon2() {
		return ApproveIcon2;
	}

	public WebElement getSupplierConDoc() {
		return supplierConDoc;
	}

	public WebElement getDisplay() {
		return Display;
	}

	public WebElement getNewMatDocument() {
		return NewMatDocument;
	}

	public WebElement getNewConDocGrp() {
		return NewConDocGrp;
	}

	public WebElement getPushToSupp2() {
		return pushToSupp2;
	}

	public WebElement getDocandComments() {
		return DocandComments;
	}
	
	

}
