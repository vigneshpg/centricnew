package com.centric.objectrepository;

import com.centric.resources.Commonactions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LookUpPage extends Commonactions {

    public LookUpPage() {
        PageFactory.initElements(Commonactions.driver, this);
    }

    @FindBy(how = How.CSS,using = "[data-csi-tab='ApparelViews-LookupItems']")
    private WebElement LookUpTab;

    @FindBy(how = How.CSS,using = "[data-csi-automation='plugin-ApparelViews-LookupItems-ToolbarNewActions']")
    private WebElement LookUpActionBtn;

    @FindBy(how = How.CSS,using = "[data-csi-automation='field-LookupItem-Form-Subtype'] .dijitInputInner")
    private WebElement LookUpInputTxtBox;

    @FindBy(how = How.CSS,using = "[data-csi-automation='field-LookupItem-Form-Node Name'] .dijitInputInner")
    private WebElement LookUpNameTxtBox;

    @FindBy(how = How.CSS,using = "[data-csi-automation='field-LookupItem-Form-Code'] .dijitInputInner")
    private WebElement LookUpCodeTxtBox;

    @FindBy(how = How.CSS,using = "//textarea[@data-csi-automation='field-LookupItem-Form-Description']")
    private WebElement LookUpDescTxtBox;

    @FindBy(xpath = "//span[text()='Product Alternative Specifications']")
    private WebElement ProductAlternativeTab;

    @FindBy(how = How.CSS,using = "[data-csi-automation='plugin-ApparelViews-ProductAlternativeSpecifications-ToolbarNewActions']")
    private WebElement ProductAlternativeActionBtn;

    @FindBy(how = How.XPATH,using = "(//span[contains(text(),'Size Specs')]/parent::div/parent::div/parent::div/preceding-sibling::div)[3]")
    private WebElement RightArrowBtn;

    @FindBy(how = How.CSS,using = "[data-csi-automation='plugin-SizeChartAdmin-LibrariesLibMaterial-ToolbarNewActions']")
    private WebElement MaterialLabelLibrariesAction;

    @FindBy(how = How.CSS,using = "[data-csi-automation='plugin-SizeChartAdmin-LibrariesLibSizeLabel-ToolbarNewActions']")
    private WebElement SizeLabelLibrariesAction;

    public WebElement getSizeLabelLibrariesAction() { return SizeLabelLibrariesAction; }

    public WebElement getMaterialLabelLibrariesAction() { return MaterialLabelLibrariesAction; }

    public WebElement getRightArrowBtn() { return RightArrowBtn; }

    public WebElement getProductAlternativeActionBtn() { return ProductAlternativeActionBtn; }
    public WebElement getProductAlternativeTab() { return ProductAlternativeTab;}

    public WebElement getLookUpDescTxtBox() { return LookUpDescTxtBox; }
    public WebElement getLookUpCodeTxtBox() { return LookUpCodeTxtBox; }
    public WebElement getLookUpNameTxtBox() { return LookUpNameTxtBox; }
    public WebElement getLookUpInputTxtBox() { return LookUpInputTxtBox; }
    public WebElement getLookUpActionBtn() { return LookUpActionBtn; }
    public WebElement getLookUpTab() { return LookUpTab;
    }
}
