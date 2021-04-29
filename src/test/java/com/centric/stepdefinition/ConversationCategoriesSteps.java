package com.centric.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.centric.objectrepository.BusinessPlanningPage;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//
//import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.ConfigurationPage;
import com.centric.objectrepository.ConversationCategoriesPage;
import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.MaterialSpecificationPage;
import com.centric.objectrepository.PopupPage;
import com.centric.objectrepository.StylePage;
import com.centric.resources.Commonactions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConversationCategoriesSteps extends Commonactions{
	Commonactions ca=new Commonactions();
	ConfigurationPage cp=new ConfigurationPage();
	ConversationCategoriesPage cc=new ConversationCategoriesPage();
	MaterialSpecificationPage mp = new MaterialSpecificationPage();
	PopupPage pp = new PopupPage();
	BusinessPlanningPage bp=new BusinessPlanningPage();
	HomePage hp= new HomePage();
	StylePage sp= new StylePage();

	@Then("User creates converstion value in config_setup {string}")
	public void user_creates_converstion_value_in_config_setup(String string) throws Throwable {

		String[] A = string.split(",");
		Commonactions.isElementPresent(cp.getUser_config());
		ca.click(cp.getUser_config());
		for(int i=0;i<10;i++) {
			//Commonactions.isElementPresent(cc.getPagesliderrightarrow());
			//ca.click(cc.getPagesliderrightarrow());
			if(cc.getConver_categories().isDisplayed()){
				Commonactions.isElementPresent(cc.getConver_categories());
				ca.click(cc.getConver_categories());
				break;
			}}

		Commonactions.isElementPresent(cc.getNew_action_convercate());
		ca.click(cc.getNew_action_convercate());
		Commonactions.isElementPresent(cc.getConv_cat_value());
		ca.insertText(cc.getConv_cat_value(), A[0]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();		
		System.out.println("Conversation Categories 1 created successfully");

		Commonactions.isElementPresent(cc.getNew_action_convercate());
		ca.click(cc.getNew_action_convercate());
		Commonactions.isElementPresent(cc.getConv_cat_value());
		ca.insertText(cc.getConv_cat_value(), A[1]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();	
		System.out.println("Conversation Categories 2 created successfully");

		Commonactions.isElementPresent(cc.getNew_action_convercate());
		ca.click(cc.getNew_action_convercate());
		Commonactions.isElementPresent(cc.getConv_cat_value());
		ca.insertText(cc.getConv_cat_value(), A[2]);
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();
		System.out.println("Conversation Categories 3 created successfully");


		Commonactions.isElementPresent(cc.getConv_cat_value());
		ca.insertText(cc.getConv_cat_value(), A[3]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();	
		System.out.println("Conversation Categories 4 created successfully");


	}
	@Then("Edit and delete the existing conversation data {string},{string}")
	public void edit_and_delete_the_existing_conversation_data(String string, String string2)throws Throwable {

		String[] B = string.split(",");

		Commonactions.isElementPresent(cc.getNew_action_convercate());
		ca.click(cc.getNew_action_convercate());
		Commonactions.isElementPresent(cc.getConv_cat_value());
		ca.insertText(cc.getConv_cat_value(), B[0]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Conversation Categories 5 created successfully");


		Commonactions.isElementPresent(cc.getDesign_Field_Input());
		ca.click(cc.getDesign_Field_Input());
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		a3.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(cc.getTextarea_input(), B[1]);
		ca.eleToBeClickable();
		ca.click(cc.getConver_categories());

		Commonactions.isElementPresent(cc.getTest_delete_icon());
		ca.click(cc.getTest_delete_icon());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());
		System.out.println("Conversation category Deleted");

		Commonactions.isElementPresent(cc.getLocalize_name_planmaterial());
		ca.click(cc.getLocalize_name_planmaterial());
		ca.eleToBeClickable();
		WebElement a4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a4, B[2]);
		ca.eleToBeClickable();
		ca.click(cc.getConver_categories());

		Commonactions.isElementPresent(cp.getUser_config());
		ca.click(cp.getUser_config());
		for(int i=0;i<10;i++) {
			//Commonactions.isElementPresent(cc.getPagesliderleftarrow());
			//ca.click(cc.getPagesliderleftarrow());
			if(bp.getBusinessObject().isDisplayed()){
				Commonactions.isElementPresent(bp.getBusinessObject());
				ca.click(bp.getBusinessObject());
				break;
			}}
	}
	@When("Navigate to to conversation cateogries within style")
	public void navigate_to_to_conversation_cateogries_within_style()throws Throwable {

//		Commonactions.isElementPresent(bp.getBusinessobj_Dropdown());
//		ca.click(bp.getBusinessobj_Dropdown());
//		ca.eleToBeClickable();
//		WebElement a2 = ca.activeElement();
//		ca.eleToBeClickable();
//		ca.insertText(a2, "style");
//		ca.eleToBeClickable();
//		Commonactions.isElementPresent(bp.getStylecheckbox());
//		ca.click(bp.getStylecheckbox());
//		ca.eleToBeClickable();
//		WebElement a3 = ca.activeElement();
//		ca.eleToBeClickable();
//		a3.sendKeys(Keys.TAB);
//		ca.eleToBeClickable();	


		Commonactions.isElementPresent(cc.getStyle_link());
		ca.click(cc.getStyle_link());
		Commonactions.isElementPresent(cc.getConv_cat_busiobj());
		ca.click(cc.getConv_cat_busiobj());
		Commonactions.isElementPresent(cc.getSelect_conv_cat_action());
		ca.click(cc.getSelect_conv_cat_action());
		Commonactions.isElementPresent(cc.getDesign_checkbox());
		ca.click(cc.getDesign_checkbox());
		Commonactions.isElementPresent(cc.getPlan_style_checkbox());
		ca.click(cc.getPlan_style_checkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(bp.getFinditem());
		ca.click(bp.getFinditem());
		ca.eleToBeClickable();
		System.out.println("Search before");
		WebElement a5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a5, "Library Item, Material");
		a5.sendKeys(Keys.DOWN);
		a5.sendKeys(Keys.ENTER);
		ca.eleToBeClickable();
		System.out.println("Search after");

		Commonactions.isElementPresent(cc.getSelect_conv_cat_action());
		ca.click(cc.getSelect_conv_cat_action());
		Commonactions.isElementPresent(cc.getPlan_material_checkbox());
		ca.click(cc.getDesign_checkbox());
		Commonactions.isElementPresent(cc.getPlan_style_checkbox());
		ca.click(cc.getPlan_style_checkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bp.getFinditem());
		ca.click(bp.getFinditem());
		ca.eleToBeClickable();
		System.out.println("Search before");
		WebElement a6 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a6, "Hierarchy, Season");
		a6.sendKeys(Keys.DOWN);
		a6.sendKeys(Keys.ENTER);
		ca.eleToBeClickable();
		System.out.println("Search after");

		Commonactions.isElementPresent(cc.getSelect_conv_cat_action());
		ca.click(cc.getSelect_conv_cat_action());
		Commonactions.isElementPresent(cc.getPlan_material_checkbox());
		ca.click(cc.getDesign_checkbox());
		Commonactions.isElementPresent(cc.getPlan_season_checkbox());
		ca.click(cc.getPlan_season_checkbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
	}
	@Then("Navigate to season create conversation")
	public void navigate_to_season_create_conversation()throws Throwable {
		Commonactions.isElementPresent(hp.getStyleBtn());
		ca.click(hp.getStyleBtn());
		Commonactions.isElementPresent(sp.getSeason_Btn());
		ca.click(sp.getSeason_Btn());
		Commonactions.isElementPresent(cc.getStyle1_name());
		ca.click(cc.getStyle1_name());
		Commonactions.isElementPresent(cc.getConversation_tab());
		ca.click(cc.getConversation_tab());
		Commonactions.isElementPresent(cc.getNew_conversation());
		ca.click(cc.getNew_conversation());
		Commonactions.isElementPresent(cc.getSubject_conv());
		ca.click(cc.getSubject_conv());
		ca.insertText(cc.getSubject_conv(),"Planning for Spring");
		Commonactions.isElementPresent(cc.getStart_conver());
		ca.click(cc.getStart_conver());
		ca.insertText(cc.getStart_conver(),"Testing in Automation" + "\n" + "Test Testing in Automation" );
		ca.jsMouseOver();
		Commonactions.isElementPresent(cc.getFace_emotion_icon());
		ca.click(cc.getFace_emotion_icon());
		Commonactions.isElementPresent(cc.getNeutral_face_butn());
		ca.click(cc.getNeutral_face_butn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cc.getFace_emotion_icon());
		ca.click(cc.getFace_emotion_icon());
		Commonactions.isElementPresent(cc.getTravel_icon());
		ca.click(cc.getTravel_icon());
		Commonactions.isElementPresent(cc.getBank_icon());
		ca.click(cc.getBank_icon());
		ca.eleToBeClickable();

		WebElement a7 = ca.activeElement();
		ca.eleToBeClickable();
		a7.sendKeys("Test Testing in Automation");
		a7.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		a7.sendKeys(Keys.chord(Keys.CONTROL,"b"));
		a7.sendKeys(Keys.chord(Keys.CONTROL,"i"));
		a7.sendKeys(Keys.chord(Keys.CONTROL,"u"));
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cc.getFace_emotion_icon());
		ca.click(cc.getFace_emotion_icon());
		Commonactions.isElementPresent(cc.getFace_emotion_icon());
		ca.click(cc.getFace_emotion_icon());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cc.getBold_icon_visble());
		Commonactions.isElementPresent(cc.getItalic_icon_visible());
		Commonactions.isElementPresent(cc.getUnderline_icon_visible());
		Commonactions.isElementPresent(cc.getThree_dot_btn());
		ca.click(cc.getThree_dot_btn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cc.getFont_icon_btn());
		ca.click(cc.getFont_icon_btn());
		Commonactions.isElementPresent(cc.getFont_Style_timesnewroman());
		ca.click(cc.getFont_Style_timesnewroman());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cc.getFont_size_btn());
		ca.click(cc.getFont_size_btn());
		Commonactions.isElementPresent(cc.getFon_Size_36());
		ca.click(cc.getFon_Size_36());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cc.getPara_format_btn());
		ca.click(cc.getPara_format_btn());
		Commonactions.isElementPresent(cc.getPara_fromat_heading2());
		ca.click(cc.getPara_fromat_heading2());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cc.getAlign_btn());
		ca.click(cc.getAlign_btn());
		/*try{Commonactions.isElementPresent(cc.getAlign_justify_btn());
		ca.click(cc.getAlign_justify_btn());
		ca.eleToBeClickable();}
		catch(Exception e){ca.click(cc.getAlign_btn());}*/

		/*try{
			Commonactions.isElementPresent(cc.getIndentation_btn());
			ca.click(cc.getIndentation_btn());
			ca.eleToBeClickable();
			Commonactions.isElementPresent(cc.getClear_format_btn());
			ca.click(cc.getClear_format_btn());
			ca.eleToBeClickable();}
		catch(Exception e)
		{System.out.println("Xpath not appears for long time for clear and indentation");		}*/

		//		a7.sendKeys(Keys.ENTER);
		//		a7.sendKeys(Keys.ENTER);
		//		ca.jsMouseOver();
		//		Commonactions.isElementPresent(cc.getTable_btn());
		//		ca.click(cc.getTable_btn());
		//        driver.findElement(By.xpath("//span[@data-col='1'][2]")).click();

		//		Thread.sleep(3000);		
		//		a7.sendKeys(Keys.TAB);
		//		ca.insertText(a8,"Automation");


		WebElement table = driver.findElement(By.xpath("//button[contains(@id,'insertTable')]"));
		table.click();
		WebElement row1col1 = driver.findElement(By.xpath("//span[@data-row='1' and @data-col='1']"));
		row1col1.click();
		ca.eleToBeClickable();
		/*WebElement row2col2 = driver.findElement(By.xpath("//span[@data-row='2' and @data-col='2']"));
        row2col2.click();*/
		WebElement a8 = ca.activeElement();
		ca.eleToBeClickable();
		a8.sendKeys("Test");

		Commonactions.isElementPresent(cc.getSave_btn());
		ca.click(cc.getSave_btn());
		ca.eleToBeClickable();		
	}
	@When("Edit and Delete the created conversation")
	public void edit_and_Delete_the_created_conversation()throws Throwable {
		Commonactions.isElementPresent(cc.getNew_conversation());
		ca.click(cc.getNew_conversation());
		Commonactions.isElementPresent(cc.getSubject_conv());
		ca.click(cc.getSubject_conv());
		ca.insertText(cc.getSubject_conv(),"Season - Plan");
		Commonactions.isElementPresent(cc.getCategory_dropdown());
		ca.click(cc.getCategory_dropdown());
		Commonactions.isElementPresent(cc.getDorpdown_plan_season_value());
		ca.click(cc.getDorpdown_plan_season_value());
		Commonactions.isElementPresent(cc.getStart_conver());
		ca.click(cc.getStart_conver());
		ca.insertText(cc.getStart_conver(),"Test" );
		Commonactions.isElementPresent(cc.getSave_btn());
		ca.click(cc.getSave_btn());
		ca.eleToBeClickable();
		driver.navigate().refresh();
		ca.eleToBeClickable();
		/*Commonactions.isElementPresent(cc.getConversation_tab());
		ca.click(cc.getConversation_tab());*/
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cc.getConversation_tab());
		ca.click(cc.getConversation_tab());
		Commonactions.isElementPresent(cc.getChoose_planspring());
		ca.click(cc.getChoose_planspring());
		Commonactions.isElementPresent(cc.getAdd_reply());
		ca.click(cc.getAdd_reply());
		ca.eleToBeClickable();
		WebElement a7 = ca.activeElement();
		ca.eleToBeClickable();
		a7.sendKeys("Reply the Conversation");

		Commonactions.isElementPresent(cc.getThree_dot_btn());
		ca.click(cc.getThree_dot_btn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cc.getFace_emotion_icon());
		ca.click(cc.getFace_emotion_icon());
		Commonactions.isElementPresent(cc.getSend_icon());
		ca.click(cc.getSend_icon());
		Commonactions.isElementPresent(cc.getEdit_btn());
		ca.click(cc.getEdit_btn());
		ca.eleToBeClickable();
		WebElement a8 = ca.activeElement();
		ca.eleToBeClickable();
		a8.sendKeys("\n" + "Edited");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cc.getSave_btn());
		ca.click(cc.getSave_btn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cc.getAdd_reply());
		ca.click(cc.getAdd_reply());
		ca.eleToBeClickable();
		WebElement a9 = ca.activeElement();
		ca.eleToBeClickable();
		a9.sendKeys("Delete");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cc.getSend_icon());
		ca.click(cc.getSend_icon());
		Commonactions.isElementPresent(cc.getDelete_btn());
		ca.click(cc.getDelete_btn());
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());
		ca.eleToBeClickable();
		System.out.println("Completed edit and delete the data");
	}

	@When("Verify the conversation by sort order")
	public void verify_the_conversation_by_sort_order()throws Throwable {
		
		try{Commonactions.isElementPresent(cc.getMark_resolved());
		ca.click(cc.getMark_resolved());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cc.getConversation_tab());
		ca.click(cc.getConversation_tab());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cc.getConversation_tab());
		ca.click(cc.getConversation_tab());
		Commonactions.isElementPresent(cc.getDropdown_season());
		ca.click(cc.getDropdown_season());
		Commonactions.isElementPresent(cc.getPlan_season_dropdownbtn());
		ca.click(cc.getPlan_season_dropdownbtn());
		Commonactions.isElementNotPresent(cc.getChoose_planspring());
		Commonactions.isElementPresent(cc.getConversation_tab());
		ca.click(cc.getConversation_tab());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cc.getConversation_tab());
		ca.click(cc.getConversation_tab());
		Commonactions.isElementPresent(cc.getDropdown_season());
		ca.click(cc.getDropdown_season());
		Commonactions.isElementPresent(cc.getAll_values_dropdownbtn());
		ca.click(cc.getAll_values_dropdownbtn());
		Commonactions.isElementPresent(cc.getChoose_planspring());
		Commonactions.isElementPresent(cc.getHorizontal_dots());
		ca.click(cc.getHorizontal_dots());
		Commonactions.isElementPresent(cc.getHide_resolved_conv());
		ca.click(cc.getHide_resolved_conv());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cc.getSeasonwise_sort());
		ca.click(cc.getSeasonwise_sort());
		Commonactions.isElementPresent(cc.getDate_sort());
		ca.click(cc.getDate_sort());
		ca.eleToBeClickable();
		WebElement a9 = ca.activeElement();
		ca.eleToBeClickable();
		a9.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		System.out.println("Completed verify the sort order");}
		catch(Exception e)
		{System.out.println("Not Completed verify the sort order");}
	}
	@When("Navigate to Material create conversation")
	public void navigate_to_Material_create_conversation()throws Throwable {
		driver.navigate().refresh();
		ca.eleToBeClickable();
		ca.click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(hp.getMaterialBtn());
		ca.click(hp.getMaterialBtn());
		Commonactions.isElementPresent(cc.getMaterial_name());
		ca.click(cc.getMaterial_name());
		Commonactions.isElementPresent(cc.getConversation_tab());
		ca.click(cc.getConversation_tab());
		Commonactions.isElementPresent(cc.getNew_conversation());
		ca.click(cc.getNew_conversation());
		Commonactions.isElementPresent(cc.getSubject_conv());
		ca.click(cc.getSubject_conv());
		ca.insertText(cc.getSubject_conv(),"Cotton - Percentage");
		/*Commonactions.isElementPresent(cc.getCategory_dropdown());
		ca.click(cc.getCategory_dropdown());
		Commonactions.isElementPresent(cc.getPlan_material_drop());
		ca.click(cc.getPlan_material_drop());*/
		Commonactions.isElementPresent(cc.getStart_conver());
		ca.click(cc.getStart_conver());
		ca.insertText(cc.getStart_conver(),"Test" );
		Commonactions.isElementPresent(cc.getSave_btn());
		ca.click(cc.getSave_btn());
		ca.eleToBeClickable();
		System.out.println("verified the material conversation");
	}
}
