package com.centric.objectrepository;


import com.centric.resources.Commonactions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SetupPageTK extends Commonactions {

    public SetupPageTK() {
        PageFactory.initElements(Commonactions.driver, this);
    }

    @FindBy(how = How.CSS, using = "span[data-csi-tab-name='Enumerations']")
    private WebElement user_Enumerations;

    @FindBy(how = How.XPATH, using = "//span[@data-csi-automation='filter-Site-Enumerations-Node Name']")
    private WebElement User_EnumDropBox;

    @FindBy(how = How.CSS, using = "table[data-csi-automation='plugin-EnumList-Values-ToolbarNewActions']")
    private WebElement User_NewEnumValue;

    @FindBy(xpath="//div[@data-csi-automation='field-EnumValue-Form-Node Name']/div[2]/div/input")    
    private WebElement User_NewEnumName;
    
    @FindBy(how = How.CSS,using = "div[data-csi-automation='field-EnumValue-Form-Description'] .dijitInputInner")
    private WebElement User_NewEnumDescription;

    @FindBy(how = How.CSS,using = "span[data-csi-act='Save']")
    private WebElement PopUpSaveBtn;

    @FindBy(how = How.XPATH,using = "//span[@data-csi-automation='plugin-User-HeaderToolbar-Actions']")
    private WebElement SetupPageAction;

    @FindBy(how = How.XPATH,using = "//td[text()='Update Configuration']")
    private WebElement UpdateConfigBtn;

    @FindBy(how = How.XPATH,using = "//label[text()='Partial Configuration Update']")
    private WebElement PartialUpdateBtn;

    @FindBy(how = How.XPATH,using = "(//label[@for='UpdateConfigurationFull'])[1]")
    private WebElement FullUpdateBtn;

    @FindBy(how = How.XPATH,using = "//span[text()='Run']")
    private WebElement RunBtn;

    @FindBy(how = How.CSS,using = "[data-csi-automation='plugin-EnumList-Values-ToolbarNewActions']")
    private WebElement NewEnumValueBtn;

    @FindBy(how = How.CSS,using = "[data-csi-automation='field-EnumValue-Form-Node Name'] .dijitInputInner")
    private WebElement NewEnumValueInputTxtBx;

    public WebElement getNewEnumValueInputTxtBx() { return NewEnumValueInputTxtBx; }
    public WebElement getNewEnumValueBtn() { return NewEnumValueBtn; }

    public WebElement getRunBtn() {
        return RunBtn;
    }

    public WebElement getFullUpdateBtn() {
        return FullUpdateBtn;
    }

    public WebElement getPartialUpdateBtn() {
        return PartialUpdateBtn;
    }

    public WebElement getUpdateConfigBtn() {
        return UpdateConfigBtn;
    }

    public WebElement getSetupPageAction() {
        return SetupPageAction;
    }


    public WebElement getPopUpSaveBtn() {
        return PopUpSaveBtn;
    }

    public WebElement getUser_Enumerations() {
        return user_Enumerations;
    }

    public WebElement getUser_EnumDropBox() {
        return User_EnumDropBox;
    }

    public WebElement getUser_NewEnumValue() {
        return User_NewEnumValue;
    }

    public WebElement getUser_NewEnumName() {
        return User_NewEnumName;
    }

    public WebElement getUser_NewEnumDescription() {
        return User_NewEnumDescription;
    }
}
