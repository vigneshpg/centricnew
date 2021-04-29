package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class StylePage extends Commonactions{
	
	public StylePage() {
		PageFactory.initElements(Commonactions.driver, this);
	}
	
	@FindBy(xpath="//span[text()='Seasons' or @data-csi-tab-name='Seasons']")
	private WebElement season_Btn;
	
	@FindBy(xpath="//span[text()='Styles' or @data-csi-tab-name='Styles']")
	private WebElement styles_Btn;
	
	@FindBy(xpath="//span[text()='Hierarchy' or @data-csi-tab-name='Hierarchy']")
	private WebElement hierarchy_btn;
	
	@FindBy(xpath="//span[text()='Style Gallery' or @data-csi-tab-name='Style Gallery']")
	private WebElement style_Gallery_Btn;
	
	@FindBy(xpath="//span[text()='Colorways' or @data-csi-tab-name='Colorways']")
	private WebElement colorwaysBtn;
	
	@FindBy(xpath="//span[text()='Samples' or @data-csi-tab-name='Samples']")
	private WebElement samplesBtn;
	
	@FindBy(xpath="//span[text()='Sample Storage' or @data-csi-tab-name='Sample Storage']")
	private WebElement sampleStorageBtn;
	
	@FindBy(xpath="//span[text()='Style SKUs' or @data-csi-tab-name='Style SKUs']")
	private WebElement style_SKU_Btn;
	
	@FindBy(xpath="//span[text()='Competitive Styles' or @data-csi-tab-name='Competitive Styles']")
	private WebElement competitive_style_Btn;
	
	@FindBy(xpath="//span[text()='Inspiration' or @data-csi-tab-name='Inspiration']")
	private WebElement inspiration_Btn;
	
	@FindBy(xpath="//span[text()='Supplier Requests' or @data-csi-tab-name='Supplier Requests']")
	private WebElement supplier_req_Btn;
	
	@FindBy(xpath="//table[@data-csi-url='centric:']")
	private WebElement new_season_Btn;
	
	@FindBy(xpath="(//span[contains(@class,'material-icons') and text()='add_a_photo'])[1]")
	private WebElement img_icon;
	
	@FindBy(xpath="(//div[@class='dgrid-content ui-widget-content'])[1]/div[6]/table/tr/td[1]")
	private WebElement upload_Btn;
	
	@FindBy(xpath="(//div[@class='attrImage'])[1]/img")
	private WebElement select_img_Btn;
	
	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save'])")
	private WebElement save_img_Btn;
	
	@FindBy(xpath="(//span[@data-csi-act='Edit'])[1]")
	private WebElement edit_Btn;
	
	@FindBy(xpath="//td[contains(@class,'firstColumn') and @data-csi-heading='Node Name::0']/a")
	private WebElement select_season;

	@FindBy(css="[data-csi-automation='field-Collection-Form-LabelTemplate'] .dijitArrowButton")
	private WebElement CollectionTempBtn;
	
	public WebElement getHierarchy_btn() {
		return hierarchy_btn;
	}

	public WebElement getCollectionTempBtn() {
		return CollectionTempBtn;
	}

	public WebElement getSelect_season() {
		return select_season;
	}

	public WebElement getEdit_Btn() {
		return edit_Btn;
	}

	public WebElement getSeason_Btn() {
		return season_Btn;
	}

	public WebElement getStyles_Btn() {
		return styles_Btn;
	}

	public WebElement getStyle_Gallery_Btn() {
		return style_Gallery_Btn;
	}

	public WebElement getColorwaysBtn() {
		return colorwaysBtn;
	}

	public WebElement getSamplesBtn() {
		return samplesBtn;
	}

	public WebElement getSampleStorageBtn() {
		return sampleStorageBtn;
	}

	public WebElement getStyle_SKU_Btn() {
		return style_SKU_Btn;
	}

	public WebElement getCompetitive_style_Btn() {
		return competitive_style_Btn;
	}

	public WebElement getInspiration_Btn() {
		return inspiration_Btn;
	}

	public WebElement getSupplier_req_Btn() {
		return supplier_req_Btn;
	}

	public WebElement getNew_season_Btn() {
		return new_season_Btn;
	}

	public WebElement getImg_icon() {
		return img_icon;
	}

	public WebElement getUpload_Btn() {
		return upload_Btn;
	}

	public WebElement getSelect_img_Btn() {
		return select_img_Btn;
	}

	public WebElement getSave_img_Btn() {
		return save_img_Btn;
	}
	
	

}
