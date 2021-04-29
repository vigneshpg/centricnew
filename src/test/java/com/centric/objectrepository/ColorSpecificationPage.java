package com.centric.objectrepository;

import com.centric.resources.Commonactions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ColorSpecificationPage extends Commonactions {

    public ColorSpecificationPage() {
        PageFactory.initElements(Commonactions.driver, this);
    }

    @FindBy(how = How.XPATH,using = "//span[@data-csi-tab='ApparelViews-ColorSpecificationsTab']")
    private WebElement ColorSpecificationTab;

    @FindBy(how = How.XPATH,using = "//table[@data-csi-automation='plugin-ApparelViews-ColorSpecifications-ToolbarNewActions']")
    private WebElement NewColorSpec_btn;

    @FindBy(how = How.XPATH,using = "//div[@data-csi-automation='field-ColorSpecification-Form-Node Name']//following::input[@class='dijitReset dijitInputInner']")
    private WebElement ColorSpecInputBox;

    @FindBy(how = How.XPATH,using = "//div/span[@data-csi-act='Save']/descendant::span[@role='button']")
    private WebElement SaveBtn;

    @FindBy(how = How.CSS,using = "span[data-csi-act='Cancel']")
    private WebElement CancelBtn;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'New Color Specification')]")
    private String VerifyHeaderCS;

    @FindBy(how = How.CSS,using = "span[data-csi-act='Save_Copy']")
    private WebElement Save_CopyBtn;

    @FindBy(how = How.XPATH,using = "//span[@data-csi-automation='plugin-ApparelViews-ColorSpecifications-CustomViewActions']")
    private WebElement CustomViewBtn;

    @FindBy(how = How.XPATH,using = "//tr[@data-csi-automation='plugin-ApparelViews-ColorSpecifications-CustomViewManage']")
    private WebElement ManageViews_CV;

    @FindBy(how = How.XPATH,using = "(//span[@widgetid='prefCopy']//span)[1]")
    private WebElement CopyCV_Option;

    @FindBy(how = How.CSS,using = "input#prefName")
    private WebElement CopyNameTxt_bx;

    @FindBy(how = How.XPATH,using = "(//tr[@class='dataPoints']//following::select)[1]")
    private WebElement AttributesBox;


    @FindBy(how = How.XPATH,using = "(//tr[@class='dataPoints']//following::select)[2]")
    private WebElement SelectedAttributesBox;


    @FindBy(how = How.XPATH,using = "//span[text()='Attributes']")
    private WebElement AttributeTabCV;


    @FindBy(how = How.XPATH,using = "//span[text()='Add >']")
    private WebElement CV_AddBtn;


    @FindBy(how = How.XPATH,using = "//span[text()='< Remove']")
    private WebElement CV_RemoveBtn;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Save')]")
    private WebElement CV_PopUpSaveBtn;

    @FindBy(how = How.XPATH,using = "//span[@data-csi-act='Copy']")
    private WebElement CopyBtn;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'New Color Specification')]")
    private WebElement ColorSpecPOPHeader;

    public WebElement getColorSpecPOPHeader() {
        return ColorSpecPOPHeader;
    }

    public WebElement getCopyBtn() {
        return CopyBtn;
    }

    public WebElement getAttributesBox() {
        return AttributesBox;
    }

    public WebElement getCancelBtn() {
        return CancelBtn;
    }

    public WebElement getAttributeTabCV() {
        return AttributeTabCV;
    }

    public WebElement getColorSpecificationTab() {
        return ColorSpecificationTab;
    }

    public WebElement getColorSpecInputBox() {
        return ColorSpecInputBox;
    }

    public WebElement getCopyCV_Option() {
        return CopyCV_Option;
    }

    public WebElement getCopyNameTxt_bx() {
        return CopyNameTxt_bx;
    }

    public WebElement getCustomViewBtn() {
        return CustomViewBtn;
    }

    public WebElement getCV_AddBtn() {
        return CV_AddBtn;
    }

    public WebElement getCV_PopUpSaveBtn() {
        return CV_PopUpSaveBtn;
    }

    public WebElement getCV_RemoveBtn() {
        return CV_RemoveBtn;
    }

    public WebElement getManageViews_CV() {
        return ManageViews_CV;
    }

    public WebElement getNewColorSpec_btn() {
        return NewColorSpec_btn;
    }

    public WebElement getSave_CopyBtn() {
        return Save_CopyBtn;
    }

    public WebElement getSaveBtn() {
        return SaveBtn;
    }

    public WebElement getSelectedAttributesBox() {
        return SelectedAttributesBox;
    }

    public String getVerifyHeaderCS() {
        return VerifyHeaderCS;
    }

}
