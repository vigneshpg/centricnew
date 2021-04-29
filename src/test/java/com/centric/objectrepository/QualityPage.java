package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class QualityPage extends Commonactions {

	public QualityPage() {

		PageFactory.initElements(Commonactions.driver, this);
	}

	@FindBy(xpath="(//span[contains(text(),'Documents')]/parent::div/parent::div/parent::div/preceding-sibling::div)[3]")
	private WebElement RightArrow;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Quality' or text()='Quality']")
	private WebElement Quality;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Setup' or text()='Setup']")
	private WebElement setup;
	
	@FindBy(xpath="//span[text()='Test Specs']")
	private WebElement TestSpecs;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'TestSpec')]//div/div)[2]")
	private WebElement NewTestSpecBtn;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-TestSpec-Form-Subtype')]/div)[1]")
	private WebElement TypeValue;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-TestSpec-Form-Node Name')]/div)/div/input")
	private WebElement TestSpecValue;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-TestSpec-Form-Code')]/div)/div/input")
	private WebElement TestSpecCode;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-TestSpec-Form-Description')]/div)/div/input")
	private WebElement TestSpecDes;
	
	@FindBy(xpath="(//td[@data-csi-heading='Tags:Child:__Parent__:0'])")
	private WebElement tags;
	
	@FindBy(xpath="//div[@role='option' and @item='0']")
	private WebElement ClickTags;
	
	@FindBy(xpath="//div[text()='Apply to Types']")
	private WebElement ClickAgain;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Documents' or text()='Documents']")
	private WebElement CheckDoc;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Where Used' or text()='Where Used']")
	private WebElement CheckWhUsed;
	
	@FindBy(xpath="((//td[@data-csi-heading='TargetMethod:Child:LatestRevision:0'])/following-sibling::td/div/span[text()='content_copy'])[1]") 
	private WebElement ChemicalCopy;
	
	@FindBy(xpath="((//a[text()='Wash Test Spec']//parent::td)/following-sibling::td/div/span[text()='content_copy'])[1]") 
	private WebElement WashCopy;
	
	@FindBy(xpath="(//td[text()='Chemical Test']//following-sibling::td/div/span[text()='check_circle'])[1]")
	private WebElement ChemicalTestAprv;
	
	@FindBy(xpath="(//td[text()='Ironing Test']//following-sibling::td/div/span[text()='check_circle'])[1]")
	private WebElement IronTestApprv;
	
	@FindBy(xpath="(//td[@data-csi-heading='State:Child:LatestRevision:0'])[1]")
	private WebElement LatestState;
	
	@FindBy(xpath="(//td[@data-csi-heading='State:Child:LatestRevision:0'])[1]/div")
	private WebElement LatestState1;
	
	@FindBy(xpath="//span[text()='Test Groups']")
	private WebElement TestGrps;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'TestSpecGroup')]//div/div)[2]")
	private WebElement NewTestGrpBtn;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'TestSpecGroup-TestSpecs')]//div/div)[2]")
	private WebElement NewSelTstSpecBtn;
	
	@FindBy(xpath="//td[text()='Chemical Test Spec']/preceding-sibling::td//input")
	private WebElement ChemChkbx;
	
	@FindBy(xpath="//td[text()='Chemical Test Spec - Copy']/preceding-sibling::td//input")
	private WebElement ChemCpyChkbx;
	
	@FindBy(xpath="((//a[text()='Chemical Test Group']/parent::td)/following-sibling::td/div/span[text()='content_copy'])[1]")
	private WebElement ChemTestGrpCpy;
	
	@FindBy(xpath="(//div[@data-csi-act='ViewSelect'])[1]")
	private WebElement grp1;
	
	@FindBy(xpath="(//div[@data-csi-act='ViewSelect'])[2]")
	private WebElement grp2;
	
	@FindBy(xpath="((//a[text()='Chemical Test Group-COPY']/parent::td)/following-sibling::td/div/span[text()='close'])[1]")
	private WebElement ChemTSGDel;
	
	@FindBy(xpath="//td[text()='Ironing Test Spec']/preceding-sibling::td//input")
	private WebElement IronChkbx;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'TestSpecGroup-TestSpecs')])[1]//tbody/tr/td[2]")
	private WebElement SelTestSpecExpnd;
	
	@FindBy(xpath="//td[contains(text(),'New Test Spec')]")
	private WebElement NewTestSpec;
	
	@FindBy(xpath="((//a[contains(text(),'Copy')]/parent::td)//following-sibling::td/div/span[text()='remove_circle_outline'])[1]")
	private WebElement WashCpyDel;
	
	@FindBy(xpath="(//div[contains(@data-csi-context-parent,'QUALITY')]//span[@title='Refresh View'])[1]")
	private WebElement Refresh;
	
	@FindBy(xpath="//span[text()='Test Run Templates']")
	private WebElement Templates;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'TestRunTemplate')]//div/div)[2]")
	private WebElement NewTestRunTemp;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-TestRun-Form-Node Name')]/div)/div/input")
	private WebElement TestRunValue;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-TestRun-Form-TestSpecGroup')]/div)[1]")
	private WebElement TypeRunGrp;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-TestRun-Form-TestRunUser')]/div)[1]")
	private WebElement RespnsUser;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-TestRun-Form-TestRunSupplier')]/div)[1]")
	private WebElement TypeRunSupplier;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement Next;
	
	@FindBy(xpath="((//td[@data-csi-heading='State:Child:LatestRevision:0'])[1]/div)")
	private WebElement LatestStatePP1;
	
	@FindBy(xpath="((//td[@data-csi-heading='State:Child:LatestRevision:0']))")
	private WebElement LatestStatePP;
	
	@FindBy(xpath="//span[text()='Finish']")
	private WebElement finish;
	
	@FindBy(xpath="//span[text()='Finish & Go']")
	private WebElement finishQ;
	
	@FindBy(xpath="//span[@title='Show/Hide toolbars in view']")
	private WebElement ToolBar;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Canvas' or text()='Canvas']")
	private WebElement Canvas;
	
	@FindBy(xpath="(//span[text()='Create a new Canvas'])")
	private WebElement CreateanewCanvas;
	
	@FindBy(xpath="(//div[@title='Rectangle']/div[contains(@class,'ShapeRect')])[1]")
	private WebElement Rectangle;
	
	@FindBy(xpath="(//div[contains(@class,'c8_canvas_modeDraw')])[1]")
	private WebElement DoubleClick;
	
	@FindBy(xpath="//span[text()='Save & Finish']")
	private WebElement SaveAndFinish;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Tests' or text()='Tests']")
	private WebElement Tests;
	
	@FindBy(xpath="((//a[text()='Chemical Test Spec']/parent::div/parent::td)/following-sibling::td/div/span[text()='content_copy'])[2]")
	private WebElement ChmTestSpecCpy;	
	
	@FindBy(xpath="//div[contains(@class,'Tests')]//span[text()='+']/parent::div")
	private WebElement CanvasPlusIcon;
	
	@FindBy(xpath="//span[@data-csi-tab-name='TDS' or text()='TDS']")
	private WebElement TDS;
	
	@FindBy(xpath="(//div[contains(@class,'TestRunRevision')]//span[text()='refresh'])[1]")
	private WebElement TDSRefresh;
	
	@FindBy(xpath="((//a[text()='Chemical Test Templates']/parent::td)/following-sibling::td/div/span[text()='content_copy'])[1]")
	private WebElement ChmTestTemCpy;
	
	@FindBy(xpath="((//a[contains(text(),'Copy')]/parent::td)/following-sibling::td/div/span[text()='mode_edit'])[1]")
	private WebElement ChmTestTemEdit;
	
	@FindBy(xpath="((//a[contains(text(),'Copied')]/parent::td)/following-sibling::td/div/span[text()='close'])[1]")
	private WebElement ChmTestTemdel;
	
	@FindBy(xpath="((//a[text()='Chemical Test Templates']/parent::td)/following-sibling::td/div/span[text()='check_circle'])[1]")
	private WebElement ChmTstTemApprve;

	public WebElement getRightArrow() {
		return RightArrow;
	}

	public WebElement getQuality() {
		return Quality;
	}

	public WebElement getSetup() {
		return setup;
	}

	public WebElement getTestSpecs() {
		return TestSpecs;
	}

	public WebElement getNewTestSpecBtn() {
		return NewTestSpecBtn;
	}

	public WebElement getTypeValue() {
		return TypeValue;
	}

	public WebElement getTestSpecValue() {
		return TestSpecValue;
	}

	public WebElement getTestSpecCode() {
		return TestSpecCode;
	}

	public WebElement getTestSpecDes() {
		return TestSpecDes;
	}

	public WebElement getTags() {
		return tags;
	}

	public WebElement getClickTags() {
		return ClickTags;
	}

	public WebElement getClickAgain() {
		return ClickAgain;
	}

	public WebElement getCheckDoc() {
		return CheckDoc;
	}

	public WebElement getCheckWhUsed() {
		return CheckWhUsed;
	}

	public WebElement getChemicalCopy() {
		return ChemicalCopy;
	}

	public WebElement getChemicalTestAprv() {
		return ChemicalTestAprv;
	}

	public WebElement getIronTestApprv() {
		return IronTestApprv;
	}

	public WebElement getLatestState() {
		return LatestState;
	}

	public WebElement getTestGrps() {
		return TestGrps;
	}

	public WebElement getNewTestGrpBtn() {
		return NewTestGrpBtn;
	}

	public WebElement getNewSelTstSpecBtn() {
		return NewSelTstSpecBtn;
	}

	public WebElement getChemChkbx() {
		return ChemChkbx;
	}

	public WebElement getChemCpyChkbx() {
		return ChemCpyChkbx;
	}

	public WebElement getChemTestGrpCpy() {
		return ChemTestGrpCpy;
	}

	public WebElement getGrp1() {
		return grp1;
	}

	public WebElement getGrp2() {
		return grp2;
	}

	public WebElement getChemTSGDel() {
		return ChemTSGDel;
	}

	public WebElement getIronChkbx() {
		return IronChkbx;
	}

	public WebElement getSelTestSpecExpnd() {
		return SelTestSpecExpnd;
	}

	public WebElement getNewTestSpec() {
		return NewTestSpec;
	}

	public WebElement getWashCpyDel() {
		return WashCpyDel;
	}

	public WebElement getRefresh() {
		return Refresh;
	}

	public WebElement getTemplates() {
		return Templates;
	}

	public WebElement getNewTestRunTemp() {
		return NewTestRunTemp;
	}

	public WebElement getTestRunValue() {
		return TestRunValue;
	}

	public WebElement getTypeRunGrp() {
		return TypeRunGrp;
	}

	public WebElement getRespnsUser() {
		return RespnsUser;
	}

	public WebElement getTypeRunSupplier() {
		return TypeRunSupplier;
	}

	public WebElement getNext() {
		return Next;
	}

	public WebElement getLatestStatePP() {
		return LatestStatePP;
	}

	public WebElement getFinish() {
		return finish;
	}
	
	public WebElement getFinishQ() {
		return finishQ;
	}

	public WebElement getToolBar() {
		return ToolBar;
	}

	public WebElement getCanvas() {
		return Canvas;
	}

	public WebElement getCreateanewCanvas() {
		return CreateanewCanvas;
	}

	public WebElement getRectangle() {
		return Rectangle;
	}

	public WebElement getDoubleClick() {
		return DoubleClick;
	}

	public WebElement getSaveAndFinish() {
		return SaveAndFinish;
	}

	public WebElement getTests() {
		return Tests;
	}

	public WebElement getChmTestSpecCpy() {
		return ChmTestSpecCpy;
	}

	public WebElement getCanvasPlusIcon() {
		return CanvasPlusIcon;
	}

	public WebElement getTDS() {
		return TDS;
	}

	public WebElement getTDSRefresh() {
		return TDSRefresh;
	}

	public WebElement getChmTestTemCpy() {
		return ChmTestTemCpy;
	}

	public WebElement getChmTestTemEdit() {
		return ChmTestTemEdit;
	}

	public WebElement getChmTestTemdel() {
		return ChmTestTemdel;
	}

	public WebElement getChmTstTemApprve() {
		return ChmTstTemApprve;
	}

	public WebElement getWashCopy() {
		return WashCopy;
	}

	public WebElement getLatestState1() {
		return LatestState1;
	}

	public WebElement getLatestStatePP1() {
		return LatestStatePP1;
	}
	
	
	
}
