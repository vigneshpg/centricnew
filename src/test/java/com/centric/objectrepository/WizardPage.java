package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class WizardPage extends Commonactions{

	public WizardPage() {
		PageFactory.initElements(Commonactions.driver, this);
	}
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'ApparelViews-AllStyles-')]//div[text()='New Style']")
	private WebElement new_style_action;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'ApparelViews-AllStyles-')]//td[contains(@class,'dijitArrowButton')])[1]")
	private WebElement new_style_arrowbutton;
	
	@FindBy(xpath="//td[text()='New from Style']")
	private WebElement new_from_style;
	
	@FindBy(xpath="//td[text()='Move Styles from']")
	private WebElement move_styles_from;
	
	@FindBy(xpath="(//div[@data-csi-automation='field-Style-HierarchyForm-ParentSeason']//div//input)[1]")
	private WebElement season_dropdown;
	
	@FindBy(xpath="//div[text()='1. Select Hierarchy Details']")
	private WebElement select_hierarchy_details;
	
	@FindBy(xpath="//div[text()='2. Enter Style Details']")
	private WebElement enter_style_details;
	
	@FindBy(xpath="//span[@role='heading' and text()='New Style']")
	private WebElement new_style_heading;
	
	@FindBy(xpath="//div[contains(text(),'winter season')]")
	private WebElement winter_select;
	
	@FindBy(xpath="(//div[@data-csi-automation='field-Style-Form-ProductType']//div//input)[1]")
	private WebElement style_type_dropdown;
	
	@FindBy(xpath="//div[text()='Apparel - Color and Size']")
	private WebElement apparel_select;
	
	@FindBy(xpath="(//div[@data-csi-automation='field-Style-Form-Node Name']//div//input)[2]")
	private WebElement style_input;
	
	@FindBy(xpath="(//div[@data-csi-automation='field-Style-CopyForm-Node Name']//div//input)[2]")
	private WebElement style_input_copy;
	

	@FindBy(xpath="//div[@data-csi-automation='field-Style-Form-Auto_Test']//input")
	private WebElement check_box_test;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Style-CopyForm-Auto_Test']//input")
	private WebElement check_box_test_copy;
	

	@FindBy(xpath="//td[contains(@data-csi-heading,'Node Name')]//a[text()='New Apparel - Wizard']")
	private WebElement new_apparel_wizard;
	
	@FindBy(xpath="//span[@title='Discard' and text()='Discard']")
	private WebElement discard_button;
	
	@FindBy(xpath="//td[text()='Accessories - Only Color']//preceding::div[1]/input[1]")
	private WebElement apparel_onlycolor_checkbox;
	
	@FindBy(xpath="//td[contains(@data-csi-heading,'Node Name')]//a[text()='New Accessories - Wizard']")
	private WebElement new_accessories_wizard;
	
	@FindBy(xpath="//td[text()='New Accessories - Wizard']//preceding::div[1]/input[1]")
	private WebElement accessories_wizard_checkbox;
	
	@FindBy(xpath="//div[contains(text(),'01 - Spring 2020')]")
	private WebElement spring_select;
	
	@FindBy(xpath="(//th//span[@data-csi-automation='filter-ApparelViews-AllStyles-Node Name'])[2]")
	private WebElement style_dropdown;
	
	@FindBy(xpath="//td[contains(@data-csi-heading,'Node Name')]//a[text()='Apparel - Color and Size']")
	private WebElement apparel_colorsize;
	
	@FindBy(xpath="//div[@data-csi-act='BrowseImage']")
	private WebElement browse_image;
	
	@FindBy(xpath="(//div[contains(@data-csi-heading,'Thumbnail')])[1]")
	private WebElement img_1;
	
	@FindBy(xpath="//span[@data-csi-automation='plugin-Style-Properties-Actions']//span[text()='Actions']")
	private WebElement action_dropdown_btn;
	
//	@FindBy(xpath="//td[@class='dijitReset dijitMenuItemLabel' and text()='Push Images to Styles']")
	@FindBy(xpath="//td[text()='Push Images to Styles']")
	private WebElement push_image_menu;
	
	
	@FindBy(xpath="//th//span[@data-csi-automation='filter-Style-PushImagesSelectStyles-Node Name']")
	private WebElement style_pushimage_dropdown;
	
	@FindBy(xpath="(//span[@title='Click to browse siblings of item'])[4]")
	private WebElement find_item_style;
	
//	@FindBy(xpath="//td[@class='dijitReset dijitMenuItemLabel' and text()='Push Colorways to Styles']")
	@FindBy(xpath="//td[text()='Push Colorways to Styles']")
	private WebElement push_colorways_menu;
	
	@FindBy(xpath="(//div[@data-csi-automation='field-Style-PushColorwaysSelectColorways-Colorways']//div//input)[1]")
	private WebElement colorway_dropdown;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Style-PushColorwaysSelectColorways-AddToBOMs']//input")
	private WebElement style_bom_checkbox;
	
	@FindBy(xpath="//th//span[@data-csi-automation='filter-Style-PushColorwaysSelectStyles-Node Name']")
	private WebElement style_pushcoloway_dropdown;
	
	@FindBy(xpath="//td[text()='New Apparel - Wizard']//preceding::div[1]/input[1]")
	private WebElement apparel_wizard_checkbox;
	
	public WebElement getApparel_wizard_checkbox() {
		return apparel_wizard_checkbox;
	}

	public WebElement getStyle_pushcoloway_dropdown() {
		return style_pushcoloway_dropdown;
	}

	public WebElement getStyle_bom_checkbox() {
		return style_bom_checkbox;
	}

	public WebElement getColorway_dropdown() {
		return colorway_dropdown;
	}

	public WebElement getPush_colorways_menu() {
		return push_colorways_menu;
	}

	public WebElement getFind_item_style() {
		return find_item_style;
	}

	public WebElement getStyle_pushimage_dropdown() {
		return style_pushimage_dropdown;
	}

	public WebElement getPush_image_menu() {
		return push_image_menu;
	}

	public WebElement getAction_dropdown_btn() {
		return action_dropdown_btn;
	}

	public WebElement getImg_1() {
		return img_1;
	}

	public WebElement getBrowse_image() {
		return browse_image;
	}

	public WebElement getApparel_colorsize() {
		return apparel_colorsize;
	}

	public WebElement getStyle_dropdown() {
		return style_dropdown;
	}

	public WebElement getSpring_select() {
		return spring_select;
	}

	public WebElement getAccessories_wizard_checkbox() {
		return accessories_wizard_checkbox;
	}

	public WebElement getStyle_input_copy() {
		return style_input_copy;
	}
	
	public WebElement getCheck_box_test_copy() {
		return check_box_test_copy;
	}
	
	public WebElement getNew_accessories_wizard() {
		return new_accessories_wizard;
	}

	public WebElement getApparel_onlycolor_checkbox() {
		return apparel_onlycolor_checkbox;
	}

	public WebElement getDiscard_button() {
		return discard_button;
	}

	public WebElement getNew_apparel_wizard() {
		return new_apparel_wizard;
	}

	public WebElement getCheck_box_test() {
		return check_box_test;
	}

	public WebElement getStyle_input() {
		return style_input;
	}

	public WebElement getApparel_select() {
		return apparel_select;
	}

	public WebElement getStyle_type_dropdown() {
		return style_type_dropdown;
	}

	public WebElement getWinter_select() {
		return winter_select;
	}

	public WebElement getNew_style_heading() {
		return new_style_heading;
	}

	public WebElement getSelect_hierarchy_details() {
		return select_hierarchy_details;
	}

	public WebElement getEnter_style_details() {
		return enter_style_details;
	}

	public WebElement getSeason_dropdown() {
		return season_dropdown;
	}

	public WebElement getNew_from_style() {
		return new_from_style;
	}

	public WebElement getMove_styles_from() {
		return move_styles_from;
	}

	public WebElement getNew_style_arrowbutton() {
		return new_style_arrowbutton;
	}

	public WebElement getNew_style_action() {
		return new_style_action;
	}
	
	@FindBy(xpath="//th//span[@data-csi-automation='filter-ApparelViews-AllStyles-Node Name']")
    private WebElement stylepagefilter;
    
    @FindBy(xpath="//label[contains(text(),'Color and Size')]//parent::div/div/input")
    private WebElement Apparelcolorndsizecheckbox;
    
    public WebElement getStylepagefilter() {
        return stylepagefilter;
    }

     public WebElement getApparelcolorndsizecheckbox() {
        return Apparelcolorndsizecheckbox;
    }
}