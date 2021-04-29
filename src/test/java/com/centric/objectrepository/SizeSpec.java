package com.centric.objectrepository;

import com.centric.resources.Commonactions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SizeSpec extends Commonactions {

    public SizeSpec() {
        PageFactory.initElements(Commonactions.driver, this);
    }

    @FindBy(xpath = "//span[text()='Size Specs']")
    private WebElement StyleSpecTab;

    @FindBy(how = How.CSS,using = "[data-csi-automation='plugin-ApparelViews-SizeSpecs-ToolbarNewActions']")
    private WebElement StyleSpecAction;

    @FindBy(how = How.CSS,using = "[data-csi-automation='field-SizeSpec-Form-Node Name'] .dijitInputInner")
    private WebElement StyleSpecInput;

    public WebElement getStyleSpecInput() { return StyleSpecInput; }
    public WebElement getStyleSpecAction() { return StyleSpecAction; }
    public WebElement getStyleSpecTab() { return StyleSpecTab; }

}
