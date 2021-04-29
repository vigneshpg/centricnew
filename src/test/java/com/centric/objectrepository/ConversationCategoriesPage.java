package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class ConversationCategoriesPage extends Commonactions{

	public ConversationCategoriesPage() {
		PageFactory.initElements(Commonactions.driver, this);
	}
	
	@FindBy(xpath="//span[@data-csi-tab-name='Conversation Categories' or text()='Conversation Categories']")
	private WebElement	conver_categories;
	
	@FindBy(xpath="(//span[text()='Teams']/parent::div/parent::div/parent::div/preceding-sibling::div)[3]")
	private WebElement pagesliderrightarrow;
	
	@FindBy(xpath="(//span[text()='Teams']/parent::div/parent::div/parent::div/preceding-sibling::div)[2]")
	private WebElement pagesliderleftarrow;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-Data-CommentCategorySetupList-ToolbarNewActions']//div//div[2]")
	private WebElement new_action_convercate;
	
	@FindBy(xpath="//div[@data-csi-automation='field-CommentCategorySetup-Form-Node Name']//div/div/input[1]")
	private WebElement conv_cat_value;
	
	@FindBy(xpath="//td[@data-csi-heading='Node Name::0' and text()='Designing the Style']")
	private WebElement Design_Field_Input;
	
	@FindBy(xpath="//textarea[@data-csi-automation='edit-Data-CommentCategorySetupList-Node Name:']")
	private WebElement textarea_input;
	
	@FindBy(xpath="//td[text()='Test Running']//following::span[@data-csi-act='Delete']")
	private WebElement test_delete_icon;
	
	@FindBy(xpath="//td[text()='Planning the Material']//following::td[@data-csi-heading='LocalizedName::0'][1]")
	private WebElement localize_name_planmaterial;
	
	@FindBy(xpath="//td[text()='Planning the Material']//following::td[@data-csi-heading='LocalizedName::0']//div[@class='csi-table-frozen-wrap']")
	private WebElement textarea_planmaterial;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Conversation Categories' or text()='Conversation Categories']")
	private WebElement conv_cat_busiobj;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-BusinessObject-CommentCategories-ToolbarNewActions']//div//div[2]")
	private WebElement select_conv_cat_action;
	
	@FindBy(xpath="//td[text()='Design Style']//preceding::div[1]/input[1]")
	private WebElement design_checkbox;
	
	@FindBy(xpath="//td[text()='Planning the style']//preceding::div[1]/input[1]")
	private WebElement plan_style_checkbox;
	
	@FindBy(xpath="//td[text()='Planning the Material']//preceding::div[1]/input[1]")
	private WebElement plan_material_checkbox;
	
	@FindBy(xpath="//td[text()='Plan for Seasons']//preceding::div[1]/input[1]")
	private WebElement plan_season_checkbox;

	@FindBy(xpath="//td[@data-csi-heading='Node Name::0']//a[text()='Style']")
	private WebElement style_link;
	
	@FindBy(xpath="//td[@data-csi-heading='Node Name::0']//a[text()='01 - Spring 2020']")
	private WebElement	style1_name;
	
	@FindBy(xpath="//span[@title='Neutral Face']")
	private WebElement neutral_face_butn;
	
	@FindBy(xpath="//button[@data-title='Travel & Places' or @data-param1='places']")
	private WebElement travel_icon;
	
	@FindBy(xpath="//span[@title='European Post Office']")
	private WebElement bank_icon;
	
	@FindBy(xpath="//button[@aria-pressed='true'][1]")
	private WebElement bold_icon_visble;
	
	@FindBy(xpath="//button[@aria-pressed='true'][2]")
	private WebElement italic_icon_visible;
	
	@FindBy(xpath="//button[@aria-pressed='true'][3]")
	private WebElement underline_icon_visible;
	
	@FindBy(xpath="//button[@data-title='More Misc' or @data-cmd='moreMisc']")
	private WebElement three_dot_btn;
	
	@FindBy(xpath="//button[@data-title='Font Family' or @data-cmd='fontFamily']")
	private WebElement font_icon_btn;
	
	@FindBy(xpath="//a[@title='Times New Roman' and text()='Times New Roman']")
	private WebElement font_Style_timesnewroman;
	
	@FindBy(xpath="//button[@data-title='Font Size' or @data-cmd='fontSize']")
	private WebElement font_size_btn;
	
	@FindBy(xpath="//a[@title='36' and text()='36']")
	private WebElement fon_Size_36;
	
	@FindBy(xpath="//button[@data-title='Paragraph Format' or @data-cmd='paragraphFormat']")
	private WebElement para_format_btn;
	
	@FindBy(xpath="//a[@title='Heading 2' and text()='Heading 2']")
	private WebElement para_fromat_heading2;
	
	@FindBy(xpath="//*[@data-title='Clear Formatting' or data-cmd='clearFormatting']")
	private WebElement clear_format_btn;
	
	@FindBy(xpath="//button[@data-title='Align' or @data-cmd='align']")
	private WebElement align_btn;
	
	@FindBy(xpath="//*[@data-title='Align Justify']")
	private WebElement align_justify_btn;
	
	@FindBy(xpath="//*[contains(@data-title,'Increase Indent') or @data-cmd='indent']")
	private WebElement indentation_btn;
	
	@FindBy(xpath="//*[@data-title='Insert Table']")
	private WebElement table_btn;
	
	@FindBy(xpath="//div[@id='mui-component-select-Category']")
	private WebElement category_dropdown;
	
	@FindBy(xpath="//button[contains(@id,'sendReadyButton')]")
	private WebElement send_icon;

	@FindBy(xpath="//a[text()='100% Cotton Jersey - Copy']")
	private WebElement material_name;
	
	//modified
	
	@FindBy(xpath="//span[contains(text(),'Mark as Resolved')]")
	private WebElement markasResolve;
	
	@FindBy(xpath="//li[@data-value='SelectAll']")
	private WebElement all_values_dropdownbtn;
	
	
	@FindBy(xpath="//span[contains(text(),'Plan for Season')]")
	private WebElement dorpdown_plan_season_value;
	
	@FindBy(xpath="//button[@type='submit']/span[text()='Save']")
	private WebElement save_btn;
	
	@FindBy(xpath="//span[text()='Planning for Spring']")
	private WebElement choose_planspring;
	
	@FindBy(xpath="//span[text()='Add a reply']")
	private WebElement add_reply;
	
	@FindBy(xpath="//button[@title='Edit' and @aria-label='Edit']")
	private WebElement edit_btn;

	@FindBy(xpath="//button[@title='Delete' and @aria-label='Delete']")
	private WebElement delete_btn;
	
	@FindBy(xpath="//span[text()='Marked as Resolved']")
	private WebElement marked_resolved;
	
	@FindBy(xpath="//span[text()='Mark as Resolved']")
	private WebElement mark_resolved;
	
	@FindBy(xpath="//div[@title='Conversations']/div")
	private WebElement conversation_tab;
	
	@FindBy(xpath="//span[text()='New Conversation']")
	private WebElement new_conversation;
	
	@FindBy(xpath="//label[text()='Subject']//parent::div/div/input[1]")
	private WebElement subject_conv;
	
	@FindBy(xpath="//span[text()='Start a conversation']//parent::div/div")
	private WebElement start_conver;
	
	@FindBy(xpath="//button[contains(@id,'emoticons')]")
	private WebElement face_emotion_icon;
	
	@FindBy(xpath="(//*[@class='MuiSvgIcon-root'])[4]")
	private WebElement horizontal_dots;
	
	@FindBy(xpath="//span[text()='Hide resolved conversations']")
	private WebElement hide_resolved_conv;
	
	@FindBy(xpath="//span[text()='Show resolved conversations']")
	private WebElement show_resolved_conversations;
	
	@FindBy(xpath="//span[text()='Show conversations on Season only']")
	private WebElement seasonwise_sort;
	
	@FindBy(xpath="//span[text()='Sort by date']")
	private WebElement date_sort;
	
	@FindBy(xpath="//span[text()='Conversations']")
	private WebElement conversation_title;
	
	@FindBy(xpath="//li/span[text()='Plan for Seasons']")
	private WebElement plan_season_dropdownbtn;
	
	@FindBy(xpath="//div[contains(@class,'MuiSelect-root') or (@aria-haspopup='listbox')]")
	private WebElement dropdown_season;
	
	@FindBy(xpath="//span[text()='Plan Material']")
	private WebElement plan_material_drop;
	
	public WebElement getPlan_material_drop() {
		return plan_material_drop;
	}

	public WebElement getMaterial_name() {
		return material_name;
	}

	public WebElement getAll_values_dropdownbtn() {
		return all_values_dropdownbtn;
	}

	public WebElement getPlan_season_dropdownbtn() {
		return plan_season_dropdownbtn;
	}

	public WebElement getDate_sort() {
		return date_sort;
	}

	public WebElement getConversation_title() {
		return conversation_title;
	}

	public WebElement getDropdown_season() {
		return dropdown_season;
	}

	public WebElement getSeasonwise_sort() {
		return seasonwise_sort;
	}

	public WebElement getShow_resolved_conversations() {
		return show_resolved_conversations;
	}

	public WebElement getHide_resolved_conv() {
		return hide_resolved_conv;
	}

	public WebElement getHorizontal_dots() {
		return horizontal_dots;
	}

	public WebElement getMarked_resolved() {
		return marked_resolved;
	}

	public WebElement getMark_resolved() {
		return mark_resolved;
	}

	public WebElement getDelete_btn() {
		return delete_btn;
	}
	
	public WebElement getEdit_btn() {
		return edit_btn;
	}

	public WebElement getSend_icon() {
		return send_icon;
	}

	public WebElement getAdd_reply() {
		return add_reply;
	}

	public WebElement getChoose_planspring() {
		return choose_planspring;
	}

	public WebElement getSave_btn() {
		return save_btn;
	}

	public WebElement getDorpdown_plan_season_value() {
		return dorpdown_plan_season_value;
	}

	public WebElement getCategory_dropdown() {
		return category_dropdown;
	}

	public void setCategory_dropdown(WebElement category_dropdown) {
		this.category_dropdown = category_dropdown;
	}

	public WebElement getTable_btn() {
		return table_btn;
	}

	public WebElement getPara_format_btn() {
		return para_format_btn;
	}

	public WebElement getPara_fromat_heading2() {
		return para_fromat_heading2;
	}

	public WebElement getClear_format_btn() {
		return clear_format_btn;
	}

	public WebElement getAlign_btn() {
		return align_btn;
	}

	public WebElement getAlign_justify_btn() {
		return align_justify_btn;
	}

	public WebElement getIndentation_btn() {
		return indentation_btn;
	}

	public WebElement getFon_Size_36() {
		return fon_Size_36;
	}

	public WebElement getFont_size_btn() {
		return font_size_btn;
	}

	public WebElement getFont_Style_timesnewroman() {
		return font_Style_timesnewroman;
	}

	public WebElement getFont_icon_btn() {
		return font_icon_btn;
	}

	public WebElement getThree_dot_btn() {
		return three_dot_btn;
	}

	public WebElement getBold_icon_visble() {
		return bold_icon_visble;
	}

	public WebElement getItalic_icon_visible() {
		return italic_icon_visible;
	}

	public WebElement getUnderline_icon_visible() {
		return underline_icon_visible;
	}

	public WebElement getBank_icon() {
		return bank_icon;
	}

	public WebElement getFace_emotion_icon() {
		return face_emotion_icon;
	}

	public WebElement getNeutral_face_butn() {
		return neutral_face_butn;
	}

	public WebElement getTravel_icon() {
		return travel_icon;
	}

	public WebElement getStart_conver() {
		return start_conver;
	}

	public WebElement getSubject_conv() {
		return subject_conv;
	}

	public WebElement getNew_conversation() {
		return new_conversation;
	}

	public void setNew_conversation(WebElement new_conversation) {
		this.new_conversation = new_conversation;
	}

	public WebElement getConversation_tab() {
		return conversation_tab;
	}

	public void setConversation_tab(WebElement conversation_tab) {
		this.conversation_tab = conversation_tab;
	}

	public WebElement getStyle1_name() {
		return style1_name;
	}

	public void setStyle1_name(WebElement style1_name) {
		this.style1_name = style1_name;
	}


	public WebElement getPlan_material_checkbox() {
		return plan_material_checkbox;
	}
	
	
	public WebElement getPlan_season_checkbox() {
		return plan_season_checkbox;
	}

	public WebElement getStyle_link() {
		return style_link;
	}


	public void setStyle_link(WebElement style_link) {
		this.style_link = style_link;
	}


	public WebElement getDesign_checkbox() {
		return design_checkbox;
	}


	public WebElement getPlan_style_checkbox() {
		return plan_style_checkbox;
	}


	public WebElement getSelect_conv_cat_action() {
		return select_conv_cat_action;
	}


	public WebElement getTextarea_planmaterial() {
		return textarea_planmaterial;
	}

	public WebElement getLocalize_name_planmaterial() {
		return localize_name_planmaterial;
	}

	public WebElement getTest_delete_icon() {
		return test_delete_icon;
	}

	public WebElement getTextarea_input() {
		return textarea_input;
	}

	public WebElement getDesign_Field_Input() {
		return Design_Field_Input;
	}

	public void setDesign_Field_Input(WebElement design_Field_Input) {
		Design_Field_Input = design_Field_Input;
	}

	public WebElement getNew_action_convercate() {
		return new_action_convercate;
	}

	public WebElement getConv_cat_value() {
		return conv_cat_value;
	}

	public WebElement getPagesliderrightarrow() {
		return pagesliderrightarrow;
	}

	public WebElement getConver_categories() {
		return conver_categories;
	}
	public WebElement getPagesliderleftarrow() {
		return pagesliderleftarrow;
	}

	public WebElement getConv_cat_busiobj() {
		return conv_cat_busiobj;
	}
	
	public WebElement getMarkasResolve() {
		return markasResolve;
	}
	
	
}
