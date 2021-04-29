package com.centric.objectrepository;

import com.centric.resources.Commonactions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SIzeChartTK extends Commonactions {

    public SIzeChartTK() {
        PageFactory.initElements(Commonactions.driver, this);
    }

    @FindBy(xpath = "//span[text()='Dimensions']")
    private WebElement SizeChartTab;

    @FindBy(how = How.CSS,using = "[data-csi-automation='plugin-SizeChartAdmin-Dimensions-ToolbarNewActions']")
    private WebElement SizeChartActionBtn;

    @FindBy(how = How.CSS,using = "[data-csi-automation='field-ApparelDimension-Form-Node Name'] .dijitInputInner")
    private WebElement SizeChartInputBox;

    @FindBy(how = How.CSS,using = "[data-csi-automation='field-ApparelDimension-Form-Description'] .dijitInputInner")
    private WebElement SizeChartDescInputBox;

    @FindBy(xpath = "//span[text()='Increments']")
    private WebElement SizeChartIncrementTab;

    @FindBy(how = How.CSS,using = "[data-csi-automation='plugin-SizeChartAdmin-Increments-ToolbarNewActions']")
    private WebElement SizeChartIncrementActionBtn;

    @FindBy(how = How.CSS,using = "[data-csi-automation='field-Increment-Form-Node Name'] .dijitInputInner")
    private WebElement SizeChartIncrementInputBox;

    @FindBy(how = How.CSS,using = "//div[@class='dijitTooltipContainer']//span[@class='dijitPlaceHolder dijitInputField']")
    private WebElement SelectOrAddInputBox;

    @FindBy(how = How.CSS,using = "[data-csi-tab-name='Dimensions']")
    private WebElement SizeChartDimensionTab;

    @FindBy(how = How.CSS,using = "[data-csi-tab-name='Product Groups']")
    private WebElement SizeChartPGTab;

    @FindBy(how = How.CSS,using = "[data-csi-automation='plugin-SizeChartAdmin-ProductGroups-ToolbarNewActions']")
    private WebElement SizeChartPGActionBtn;

    @FindBy(how = How.XPATH,using = "(//div[@data-csi-automation='field-ProductGroup-Form-Node Name']//following::input[@class='dijitReset dijitInputInner'])[1]")
    private WebElement SizeChartPGInputBtn;

    @FindBy(how = How.XPATH,using = "(//div[@data-csi-automation='field-ProductGroup-Form-Node Name']//following::input[@class='dijitReset dijitInputInner'])[2]")
    private WebElement SizeChartPGDescBtn;

    public WebElement getSizeChartPGDescBtn() { return SizeChartPGDescBtn; }
    public WebElement getSizeChartPGInputBtn() { return SizeChartPGInputBtn; }
    public WebElement getSizeChartPGActionBtn() { return SizeChartPGActionBtn; }
    public WebElement getSizeChartPGTab() { return SizeChartPGTab; }
    public WebElement getSizeChartDimensionTab() { return SizeChartDimensionTab; }
    public WebElement getSelectOrAddInputBox() { return SelectOrAddInputBox; }
    public WebElement getSizeChartIncrementInputBox() { return SizeChartIncrementInputBox; }
    public WebElement getSizeChartIncrementActionBtn() { return SizeChartIncrementActionBtn; }
    public WebElement getSizeChartIncrementTab() { return SizeChartIncrementTab; }
    public WebElement getSizeChartDescInputBox() { return SizeChartDescInputBox; }
    public WebElement getSizeChartInputBox() { return SizeChartInputBox; }
    public WebElement getSizeChartActionBtn() { return SizeChartActionBtn; }
    public WebElement getSizeChartTab() {
        return SizeChartTab;
    }}
