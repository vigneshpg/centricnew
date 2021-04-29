package com.centric.objectrepository;

import com.centric.resources.Commonactions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SizeLabel extends Commonactions {

    public SizeLabel() {
        PageFactory.initElements(Commonactions.driver, this);
    }
    @FindBy(how = How.CSS,using = "[data-csi-tab-name='Spec Types']")
    private WebElement SetupStyleSpecTab;

    @FindBy(how = How.CSS,using = "[data-csi-automation='plugin-SizeChartAdmin-SizeLabels-ToolbarNewActions']")
    private WebElement NewSpecActionBtn;

    @FindBy(how = How.CSS,using = "[data-csi-automation='field-SpecificationDataSheetSubtype-Form-Node Name'] .dijitInputInner")
    private WebElement NewSpecInputBtn;

    @FindBy(xpath = "//span[text()='Size Labels']")
    private WebElement StyleSpecTab;

    @FindBy(how = How.CSS,using = "[data-csi-automation='plugin-Site-SpecificationDataSheetSubtypes-ToolbarNewActions']")
    private WebElement StyleSpecActionBtn;

    public WebElement getStyleSpecActionBtn() { return StyleSpecActionBtn; }
    public WebElement getStyleSpecTab() { return StyleSpecTab; }
    public WebElement getNewSpecInputBtn() { return NewSpecInputBtn; }
    public WebElement getNewSpecActionBtn() { return NewSpecActionBtn; }
    public WebElement getSetupStyleSpecTab() { return SetupStyleSpecTab;
    }
}
