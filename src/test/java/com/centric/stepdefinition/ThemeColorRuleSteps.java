package com.centric.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.centric.objectrepository.BusinessPlanningPage;
import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.InspectionPage;
import com.centric.objectrepository.MaterialSpecificationPage;
import com.centric.objectrepository.PopupPage;
import com.centric.objectrepository.QualityPage;
import com.centric.objectrepository.SourcingPage;
import com.centric.objectrepository.SpecificationHierarchyPage;
import com.centric.objectrepository.StyleMaterialSamplepage;
import com.centric.objectrepository.StylePage;
import com.centric.objectrepository.StyleandThemePage;
import com.centric.objectrepository.ThemeRulePage;
import com.centric.objectrepository.UserManagementPage;
import com.centric.resources.Commonactions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ThemeColorRuleSteps extends Commonactions{

	HomePage hp = new HomePage();
	Commonactions ca = new Commonactions();
	MaterialSpecificationPage mp = new MaterialSpecificationPage();
	//SpecificationHierarchyPage sh = new SpecificationHierarchyPage();
	PopupPage pp = new PopupPage();
	SourcingPage sp = new SourcingPage();
	ThemeRulePage tr = new ThemeRulePage();
	StyleandThemePage sat = new StyleandThemePage();
	// QualityPage  qp = new QualityPage();
	StylePage st = new StylePage();
	// StyleMaterialSamplepage sm = new StyleMaterialSamplepage();
	// PopupPage pup=new PopupPage();

	@When("Navigate to Theme – Color Matching type, Create Color Matching type with Delete option  {string},{string}")
	public void navigate_to_Theme_Color_Matching_type_Create_Color_Matching_type_with_Delete_option(String string, String string2) throws Throwable {

		String[] color = string.split(",");

		Commonactions.isElementPresent(hp.getShapeandthemeBtn());
		ca.click(hp.getShapeandthemeBtn());
		Commonactions.isElementPresent(tr.getColormatchingtype());
		ca.click(tr.getColormatchingtype());
		Commonactions.isElementPresent(tr.getColormatchbtn());
		ca.click(tr.getColormatchbtn());

		Commonactions.isElementPresent(tr.getColormatchtypevalue());
		ca.insertText(tr.getColormatchtypevalue(), color[0]);
		Commonactions.isElementPresent(tr.getColorspecification());
		ca.insertText(tr.getColorspecification(), string2);
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(tr.getColormatchtypevalue());
		ca.insertText(tr.getColormatchtypevalue(), color[1]);
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		ca.click(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(tr.getColormatchtypevalue());
		ca.insertText(tr.getColormatchtypevalue(), color[2]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(tr.getDeletedummy());
		ca.click(tr.getDeletedummy());
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());


		System.out.println("Color matching type created successfully");

	}

	@When("Create a New Season {string}")
	public void create_a_New_Season(String a) throws Throwable {


		Commonactions.isElementPresent(hp.getStyleBtn());
		ca.click(hp.getStyleBtn());
		Commonactions.isElementPresent(st.getNew_season_Btn());
		ca.click(st.getNew_season_Btn());
		Commonactions.isElementPresent(pp.getSeason_Value());
		ca.insertText(pp.getSeason_Value(), a);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();


		System.out.println("Season for theme created successfully");
	}

	BusinessPlanningPage bp = new BusinessPlanningPage();

	@When("Create three Material with Colored Material and Enable “Ok for Color Specification” – True and False {string}")
	public void create_three_Material_with_Colored_Material_and_Enable_Ok_for_Color_Specification_True_and_False(String string) throws Throwable {

		String[] a = string.split(",");

		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn()); 	     
		System.out.println("home tab clicked successfully");	     
		Commonactions.isElementPresent(hp.getMaterialBtn()); 		
		ca.click(hp.getMaterialBtn());
		Commonactions.isElementPresent(driver.findElement(By.xpath("(//span[text()='Material' or @data-csi-tab='ApparelViews-AllMaterials'])[2]"))); 		
		ca.click(driver.findElement(By.xpath("(//span[text()='Material' or @data-csi-tab='ApparelViews-AllMaterials'])[2]")));
		Commonactions.isElementPresent(mp.getNew_material_btn());
		ca.click(mp.getNew_material_btn());
		Commonactions.isElementPresent(mp.getMaterial_value());
		ca.insertText(mp.getMaterial_value(), "Fabric - Stanadlone");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getMaterial());
		ca.insertText(mp.getMaterial(), a[0] + " - Ok for CS - False");
		Commonactions.isElementPresent(mp.getSave_btn1());
		Commonactions.clickjs(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();


		Commonactions.isElementPresent(mp.getMaterial());
		ca.insertText(mp.getMaterial(), a[1] + " - Ok for CS - True");
		Commonactions.isElementPresent(mp.getSaveAndNew_btn());
		Commonactions.clickjs(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(mp.getMaterial());
		ca.insertText(mp.getMaterial(), a[2] + " - Ok for CS - False");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		System.out.println("Theme material created successfully");

		Commonactions.isElementPresent(tr.getLinenmaterial());
		ca.click(tr.getLinenmaterial());
		Commonactions.isElementPresent(tr.getColormaterial());
		ca.click(tr.getColormaterial());
		Commonactions.isElementPresent(tr.getProperties());
		ca.click(tr.getProperties());		
		Commonactions.isElementPresent(tr.getNewcolormaterialexpand());
		ca.click(tr.getNewcolormaterialexpand());
		Commonactions.isElementPresent(tr.getNewfromcolormaterial());
		ca.click(tr.getNewfromcolormaterial());
		Commonactions.isElementPresent(tr.getEgretcolor());
		ca.click(tr.getEgretcolor());
		Commonactions.isElementPresent(tr.getVanillacolor());
		ca.click(tr.getVanillacolor());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		//ca.jsScrollPageUp(tr.getColorspec());
		Commonactions.isElementPresent(tr.getColorruleview());
		ca.click(tr.getColorruleview());
		Commonactions.isElementPresent(tr.getColorrulemanage());
		ca.click(tr.getColorrulemanage());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "Color Rule - CS");
		ca.click(tr.getColoredtext());
		for(int i=0;i<30;i++)
		{
			Actions a1 = new Actions(driver);
			a1.sendKeys(Keys.DOWN).build().perform();	
		}
		Commonactions.isElementPresent(tr.getOkforcolor());
		ca.click(tr.getOkforcolor());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();


		Commonactions.isElementPresent(bp.getFinditem());
		ca.click(bp.getFinditem());
		ca.eleToBeClickable();
		WebElement a6 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a6, "Cotton - Ok for CS - True");
		ca.eleToBeClickable();
		a6.sendKeys(Keys.ENTER);
		ca.eleToBeClickable();

		Commonactions.isElementPresent(tr.getColorspeccheckboxfalse());
		ca.click(tr.getColorspeccheckboxfalse());
		Commonactions.isElementPresent(tr.getNewcolormaterialexpand());
		ca.click(tr.getNewcolormaterialexpand());
		Commonactions.isElementPresent(tr.getNewfromcolormaterial());
		ca.click(tr.getNewfromcolormaterial());
		Commonactions.isElementPresent(tr.getANTIQUEcolor());
		ca.click(tr.getANTIQUEcolor());
		Commonactions.isElementPresent(tr.getPAPYRUScolor());
		ca.click(tr.getPAPYRUScolor());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(bp.getFinditem());
		ca.click(bp.getFinditem());
		ca.eleToBeClickable();
		WebElement a7 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a7, "Polyster");
		ca.eleToBeClickable();
		a7.sendKeys(Keys.ENTER);
		ca.eleToBeClickable();

		Commonactions.isElementPresent(tr.getColorspeccheckboxfalse());
		ca.click(tr.getColorspeccheckboxfalse());

		System.out.println("Material color value added successfully");

	}

	@When("Create New Theme value with above created Season {string},{string},{string}")
	public void create_New_Theme_value_with_above_created_Season(String string, String string2, String string3) throws Throwable {

		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn()); 
		Commonactions.isElementPresent(sat.getShapeAndTheme());
		ca.click(sat.getShapeAndTheme());
		Commonactions.isElementPresent(sat.getThemes());
		ca.click(sat.getThemes());
		Commonactions.isElementPresent(sat.getThemeBtn());
		ca.click(sat.getThemeBtn());
		Commonactions.isElementPresent(sat.getSubType());
		ca.click(sat.getSubType());
		ca.eleToBeClickable();
		WebElement a6 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a6, string2);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(sat.getThemeMasterValue());
		ca.insertText(sat.getThemeMasterValue(), string3+" Master");
		Commonactions.isElementPresent(sat.getThemeValue());
		ca.insertText(sat.getThemeValue(), string3+" Theme");
		Commonactions.isElementPresent(sat.getSeasonsValue());
		ca.click(sat.getSeasonsValue());
		ca.eleToBeClickable();
		WebElement a5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a5, string);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		System.out.println("Theme for single season created successfully");	


	}
	UserManagementPage up = new UserManagementPage();

	@When("Navigate into the Theme Master and Create Custom view in properties level")
	public void navigate_into_the_Theme_Master_and_Create_Custom_view_in_properties_level() throws Throwable {
		for(int i=0;i<100;i++)
		{
			driver.findElement(By.xpath("//div[text()='New Theme']//following::div[contains(@class,'Slider')]//span[text()='+']/parent::div")).click();
		}
		Commonactions.isElementPresent(tr.getColorrulemaster());
		ca.click(tr.getColorrulemaster());
		Commonactions.isElementPresent(tr.getThememasterview());
		ca.click(tr.getThememasterview());
		Commonactions.isElementPresent(tr.getThememastermanage());
		ca.click(tr.getThememastermanage());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "Color Rule");
		Commonactions.isElementPresent(tr.getColormatchingtext());
		ca.click(tr.getColormatchingtext());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();



	}


	@When("Select the {string} value in Color Matching type")
	public void select_the_value_in_Color_Matching_type(String string) throws Throwable {

		Commonactions.isElementPresent(tr.getColormatchingtypeicon());
		ca.click(tr.getColormatchingtypeicon());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, string);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();


	}

	@When("Navigate to above create Theme node value")
	public void navigate_to_above_create_Theme_node_value() {

		Commonactions.isElementPresent(tr.getColorruletheme());
		ca.click(tr.getColorruletheme());

	}

	@When("Add two Theme Colorway values {string},{string}")
	public void add_two_Theme_Colorway_values(String string, String string2) throws Throwable {

		Commonactions.isElementPresent(tr.getColortheme());
		ca.click(tr.getColortheme());
		Commonactions.isElementPresent(tr.getNewthemecolorway());
		ca.click(tr.getNewthemecolorway());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, string);
		ca.eleToBeClickable();
		a.sendKeys(Keys.TAB);

		Commonactions.isElementPresent(tr.getThemecolorwayexpand());
		ca.click(tr.getThemecolorwayexpand());
		Commonactions.isElementPresent(tr.getNewfromcolorspecification());
		ca.click(tr.getNewfromcolorspecification());
		Commonactions.isElementPresent(tr.getEgretcolor());
		ca.insertText(tr.getEgretcolor(), string2);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("Theme colorway added successfully");

	}

	@When("Go & Check the Theme – Material tab > Color Rule should be displayed after refreshing the page")
	public void go_Check_the_Theme_Material_tab_Color_Rule_should_be_displayed_after_refreshing_the_page() throws Throwable {

		ca.jsScrollPageUp(tr.getColormaterial());
		Commonactions.isElementPresent(tr.getColormaterial());
		ca.click(tr.getColormaterial());
		driver.navigate().refresh();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(tr.getColorrules());
		ca.click(tr.getColorrules());
		System.out.println("color rules appeared in Color Rule Theme");

	}

	@When("Add above created two Material placements")
	public void add_above_created_two_Material_placements() throws Throwable {
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(hp.getShapeandthemeBtn());
		ca.click(hp.getShapeandthemeBtn());
		Commonactions.isElementPresent(sat.getThemes());
		ca.click(sat.getThemes());
		Commonactions.isElementPresent(tr.getColorruletheme());
		ca.click(tr.getColorruletheme());
		Commonactions.isElementPresent(tr.getColormaterial());
		ca.click(tr.getColormaterial());
		Commonactions.isElementPresent(tr.getPlacements());
		ca.click(tr.getPlacements());
		Commonactions.isElementPresent(tr.getCreateexpand());
		ca.click(tr.getCreateexpand());
		Commonactions.isElementPresent(tr.getNewfrommaterialcolor());
		ca.click(tr.getNewfrommaterialcolor());
		Commonactions.isElementPresent(tr.getLinenecheckbox());
		ca.click(tr.getLinenecheckbox());
		Commonactions.isElementPresent(tr.getCottonCheckbox());
		ca.click(tr.getCottonCheckbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();



		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//a[contains(text(),'Linen')]//ancestor::tr/td[@data-csi-act='Node Name::0']")));
		ca.eleToBeClickable();
		WebElement e11 = ca.activeElement();
		ca.eleToBeClickable();
		e11.sendKeys("Shoulder");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//a[contains(text(),'Cotton')]//ancestor::tr/td[@data-csi-act='Node Name::0']")));
		ca.eleToBeClickable();
		WebElement e12 = ca.activeElement();
		ca.eleToBeClickable();
		e12.sendKeys("Neck");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		System.out.println("Material placements added successfully");	

		Commonactions.isElementPresent(tr.getColorrules());
		ca.click(tr.getColorrules());
		Commonactions.isElementPresent(tr.getGeneratecolorrule());
		ca.click(tr.getGeneratecolorrule());		


	}

	@When("Set Main Material for both Material Placements")
	public void set_Main_Material_for_both_Material_Placements() {

		Commonactions.isElementPresent(tr.getPlacements());
		ca.click(tr.getPlacements());
		Commonactions.isElementPresent(tr.getMainmaterial1());
		ca.click(tr.getMainmaterial1());
		Commonactions.isElementPresent(tr.getMainmaterial2());
		ca.click(tr.getMainmaterial2());

		System.out.println("Main material checkbox clicked successfully");

	}

	@When("Set a Color Specification common value for {int} placement")
	public void set_a_Color_Specification_common_value_for_placement(Integer int1) throws Throwable {

		for(int j = 1; j <=100; j++ ){
			ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
			if(tr.getLinencolor().isDisplayed()){

				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));

				ca.eleToBeClickable();
				break;
			}
		}



		Commonactions.isElementPresent(tr.getCottoncolorcolorspec());
		ca.click(tr.getCottoncolorcolorspec());
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a2, "PAPYRUS");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		try{
			Commonactions.isElementPresent(tr.getLinencolorcolorspec());
			ca.click(tr.getLinencolorcolorspec());
			ca.eleToBeClickable();
			WebElement a3 = ca.activeElement();
			ca.eleToBeClickable();
			ca.insertText(a3, "PAPYRUS");
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();
		}catch (Exception e) {	}
		finally
		{	System.out.println("condition met");	}

		System.out.println("Color Spec added successfully");
		ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));

	}

	@When("Set a Colored Material common value for {int} placement")
	public void set_a_Colored_Material_common_value_for_placement(Integer int1) throws Throwable {
		Commonactions.isElementPresent(tr.getLinencolor());
		ca.click(tr.getLinencolor());
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, "EGRET");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		System.out.println("Color material added successfully");
	}

	@Then("Now Click Generate Color Rule verify > It will Generate two Theme Color rule – Check the Status message status with condition")
	public void now_Click_Generate_Color_Rule_verify_It_will_Generate_two_Theme_Color_rule_Check_the_Status_message_status_with_condition() {

		Commonactions.isElementPresent(tr.getColorrules());
		ca.click(tr.getColorrules());
		Commonactions.isElementPresent(tr.getGeneratecolorrule());
		ca.click(tr.getGeneratecolorrule());	

	}

	InspectionPage in = new InspectionPage();

	@Then("Navigate to Theme Placement Change the Colored Material value and Check again Generate Color Rule")
	public void navigate_to_Theme_Placement_Change_the_Colored_Material_value_and_Check_again_Generate_Color_Rule() throws Throwable {

		Commonactions.isElementPresent(tr.getThemecolorruleseason());
		ca.click(tr.getThemecolorruleseason());
		Commonactions.isElementPresent(tr.getThemeruleseasonTheme());
		ca.click(tr.getThemeruleseasonTheme());
		Commonactions.isElementPresent(tr.getThemeColorRules());
		ca.click(tr.getThemeColorRules());
		Commonactions.isElementPresent(tr.getColorruleaction());
		ca.click(tr.getColorruleaction());
		Commonactions.isElementPresent(tr.getGeneratecolorruleaction());
		ca.click(tr.getGeneratecolorruleaction());

		Commonactions.isElementPresent(in.getHomeArrowIcon());
		ca.click(in.getHomeArrowIcon());
		Commonactions.isElementPresent(in.getSelectlastview());
		ca.click(in.getSelectlastview());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(tr.getPlacements());
		ca.click(tr.getPlacements());

		for(int j = 1; j <=100; j++ ){
			ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
			if(tr.getCottonColor().isDisplayed()){

				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));

				ca.eleToBeClickable();
				break;
			}
		}

		driver.findElement(By.xpath("(//a[contains(text(),'Cotton')]//following::td[contains(@data-csi-heading,'DSSection')])[1]")).click();
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		a2.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		Actions aa = new Actions(driver);
		aa.sendKeys(Keys.DOWN).build().perform();
		aa.sendKeys(Keys.DOWN).build().perform();
		ca.eleToBeClickable();
		WebElement a0 = ca.activeElement();
		ca.eleToBeClickable();
		a0.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(a0, "GREEN");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		driver.findElement(By.xpath("(//a[contains(text(),'Linen')]//following::td[contains(@data-csi-heading,'DSSection')])[1]")).click();
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		a1.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		aa.sendKeys(Keys.DOWN).build().perform();
		aa.sendKeys(Keys.DOWN).build().perform();
		ca.eleToBeClickable();
		WebElement a01 = ca.activeElement();
		ca.eleToBeClickable();
		a01.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(a01, "VANILLA");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(tr.getColorrules());
		ca.click(tr.getColorrules());
		Commonactions.isElementPresent(tr.getGeneratecolorrule());
		ca.click(tr.getGeneratecolorrule());
		Commonactions.isElementPresent(tr.getThemecolorruleseason());
		ca.click(tr.getThemecolorruleseason());
		Commonactions.isElementPresent(tr.getThemeruleseasonTheme());
		ca.click(tr.getThemeruleseasonTheme());
		Commonactions.isElementPresent(tr.getThemeColorRules());
		ca.click(tr.getThemeColorRules());
		Commonactions.isElementPresent(tr.getColorruleaction());
		ca.click(tr.getColorruleaction());
		Commonactions.isElementPresent(tr.getGeneratecolorruleaction());
		ca.click(tr.getGeneratecolorruleaction());
		ca.eleToBeClickable();

		System.out.println("Theme color rule generated");

		ca.eleToBeClickable();
		List<WebElement> size = driver.findElements(By.xpath("//span[text()='close']"));
		for (int i = 0; i < size.size(); i++) {
			ca.eleToBeClickable();
			ca.click(driver.findElement(By.xpath("(//span[text()='close'])[1]")));
			Commonactions.isElementPresent(pp.getDelete_Btn());
			ca.click(pp.getDelete_Btn());
			ca.eleToBeClickable();
		}

		System.out.println("Theme color rule deleted");

		Commonactions.isElementPresent(tr.getMaterialfamilycolorrule());
		ca.click(tr.getMaterialfamilycolorrule());
		Commonactions.isElementPresent(tr.getMaterialaction());
		ca.click(tr.getMaterialaction());
		Commonactions.isElementPresent(tr.getMaterialgeneratecolorrule());
		ca.click(tr.getMaterialgeneratecolorrule());
		ca.eleToBeClickable();

		System.out.println("Material family color rule generated");

	}

	@When("Navigate to same Theme used above scenario")
	public void navigate_to_same_Theme_used_above_scenario() {

		Commonactions.isElementPresent(hp.getShapeandthemeBtn());
		ca.click(hp.getShapeandthemeBtn());
		Commonactions.isElementPresent(sat.getThemes());
		ca.click(sat.getThemes());
		/*Commonactions.isElementPresent(tr.getColorrulemaster());
		ca.click(tr.getColorrulemaster());*/
		Commonactions.isElementPresent(tr.getColorruletheme());
		ca.click(tr.getColorruletheme());

	}

	@When("Change the Main Material Set to True for {int}st placements and Set false for {int}nd placements")
	public void change_the_Main_Material_Set_to_True_for_st_placements_and_Set_false_for_nd_placements(Integer int1, Integer int2) {
		Commonactions.isElementPresent(tr.getColormaterial());
		ca.click(tr.getColormaterial());
		Commonactions.isElementPresent(tr.getPlacements());
		ca.click(tr.getPlacements());
		Commonactions.isElementPresent(tr.getMainmaterial2());
		ca.click(tr.getMainmaterial2());

		System.out.println("main material set false");

	}

	@When("Add Material Family from the Custom view in Theme – Placement table")
	public void add_Material_Family_from_the_Custom_view_in_Theme_Placement_table() throws Throwable {

		Commonactions.isElementPresent(tr.getColormaterial());
		ca.click(tr.getColormaterial());
		Commonactions.isElementPresent(tr.getPlacements());
		ca.click(tr.getPlacements());
		Commonactions.isElementPresent(tr.getPlacementview());
		ca.click(tr.getPlacementview());
		Commonactions.isElementPresent(tr.getPlacementmanage());
		ca.click(tr.getPlacementmanage());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "Material Family");
		Commonactions.isElementPresent(tr.getMaterialfamilytext());
		ca.click(tr.getMaterialfamilytext());
		// materialfamilytext -->	//option[contains(text(),'Material Family')]
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		for (int i = 0; i < 15; i++) 
		{ ca.click(in.getUp()); }
		Commonactions.isElementPresent(tr.getColorwaymatrix());
		ca.click(tr.getColorwaymatrix());
		Commonactions.isElementPresent(tr.getAppliedcolorrule());
		ca.click(tr.getAppliedcolorrule());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		System.out.println("Color rule cusom view generated");

	}

	@When("Set Colored Material common value for both Material Placements")
	public void set_Colored_Material_common_value_for_both_Material_Placements() throws Throwable {

		for(int j = 1; j <=100; j++ ){
			ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
			if(tr.getCottonColor().isDisplayed()){
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='+']/parent::div")));
				ca.eleToBeClickable();
				break;
			}
		}


		Commonactions.isElementPresent(tr.getCottonColor());
		ca.click(tr.getCottonColor());
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a2, "ANTIQUE");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		System.out.println("Common color value added successfully");

	}

	@When("Set Theme Main Material Group value for both placements “Set – Group”")
	public void set_Theme_Main_Material_Group_value_for_both_placements_Set_Group() throws Throwable {
		try{
			for(int j = 1; j <=12; j++ ){
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='-']/parent::div")));
				if(tr.getMaterialgrp1().isDisplayed()){
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='-']/parent::div")));
					ca.eleToBeClickable();
					break;	
				}
			}}
		catch(Exception e)		{System.out.println("- slider not worked ");}
		Commonactions.isElementPresent(tr.getMaterialgrp1());
		ca.click(tr.getMaterialgrp1());
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a2, "Group-01");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(tr.getMaterialgrp2());
		ca.click(tr.getMaterialgrp2());
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, "Group-01");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		System.out.println("Group value added successfully");
	}

	@When("Set Material Family for {int}nd placements")
	public void set_Material_Family_for_nd_placements(Integer int1) throws Throwable {
		try{
			for(int j = 1; j <=120; j++ ){
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='-']/parent::div")));
				if(tr.getMaterialfamily2().isDisplayed()){
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='-']/parent::div")));
					ca.click(driver.findElement(By.xpath("//div[contains(@class,'Placements')]//span[text()='-']/parent::div")));
					ca.eleToBeClickable();
					break;	
				}
			}}
		catch(Exception e)		{System.out.println("- slider not worked ");}
		Commonactions.isElementPresent(tr.getMaterialfamily2());
		ca.click(tr.getMaterialfamily2());
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, "Family-01");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		System.out.println("Family name added successfully");
	}

	@When("Click Action – Generate Color Rule")
	public void click_Action_Generate_Color_Rule() throws Throwable {

		Commonactions.isElementPresent(tr.getColorrules());
		ca.click(tr.getColorrules());
		Commonactions.isElementPresent(tr.getGeneratecolorrule());
		ca.click(tr.getGeneratecolorrule());
		ca.eleToBeClickable();
		System.out.println("Color rule generated successfully");

	}

	@When("Navigate to Season – Theme – Color Rule, Click Action > Apply Color for Theme value and set option is displayed window and click save > Verify it is applied color rule theme correctly")
	public void navigate_to_Season_Theme_Color_Rule_Click_Action_Apply_Color_for_Theme_value_and_set_option_is_displayed_window_and_click_save_Verify_it_is_applied_color_rule_theme_correctly() {

		Commonactions.isElementPresent(tr.getThemecolorruleseason());
		ca.click(tr.getThemecolorruleseason());
		Commonactions.isElementPresent(tr.getThemeruleseasonTheme());
		ca.click(tr.getThemeruleseasonTheme());
		Commonactions.isElementPresent(tr.getThemeColorRules());
		ca.click(tr.getThemeColorRules());

	}

	@When("Navigate to Theme – Placements tab >> Add “Applied Color Rule” in Custom view Color Matrix and check values are updated correctly")
	public void navigate_to_Theme_Placements_tab_Add_Applied_Color_Rule_in_Custom_view_Color_Matrix_and_check_values_are_updated_correctly() {

		Commonactions.isElementPresent(tr.getColorruleaction());
		ca.click(tr.getColorruleaction());
		Commonactions.isElementPresent(tr.getApplycolorrule());
		ca.click(tr.getApplycolorrule());
		Commonactions.isElementPresent(tr.getColorulecheckbox());
		ca.click(tr.getColorulecheckbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		System.out.println("1 Theme were updated by applying color rule");
		System.out.println("applied color rule successfully");

	}

	@When("Change the Color, Material Family Color Rule name, State in season level and verify it updated on theme level")
	public void change_the_Color_Material_Family_Color_Rule_name_State_in_season_level_and_verify_it_updated_on_theme_level() throws Throwable {

		Commonactions.isElementPresent(in.getHomeArrowIcon());
		ca.click(in.getHomeArrowIcon());
		Commonactions.isElementPresent(in.getSelectlastview());
		ca.click(in.getSelectlastview());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(tr.getPlacements());
		ca.click(tr.getPlacements());
		Commonactions.isElementPresent(tr.getPlacementaction());
		ca.click(tr.getPlacementaction());
		Commonactions.isElementPresent(tr.getPlacementapplycolorrules());
		ca.click(tr.getPlacementapplycolorrules());
		System.out.println("colr rule were applied  on 2 theme 	colrway material");

	}

	@Then("Delete Existing ColorRule in ThemeRuleSeason")
	public void Delete_Existing_ColorRule_in_ThemeRuleSeason() throws Throwable
	{

		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(hp.getShapeandthemeBtn());
		ca.click(hp.getShapeandthemeBtn());
		Commonactions.isElementPresent(sat.getThemes());
		ca.click(sat.getThemes());
		ca.eleToBeClickable();
		driver.findElement(By.xpath("//a[text()='Color Rule Theme']//following::a[text()='Theme Color Rule Season']")).click();
		Commonactions.isElementPresent(tr.getThemeruleseasonTheme());
		ca.click(tr.getThemeruleseasonTheme());
		Commonactions.isElementPresent(tr.getThemeColorRules());
		ca.click(tr.getThemeColorRules());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//span[text()='close'])[1]")));
		//ca.eleToBeClickable();
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());
		ca.eleToBeClickable();
	}

	@And("Approve Red Fmaily and Blule Family")
	public void Approve_Red_Fmaily_and_Blule_Family() throws Throwable
	{
		for(int j = 1; j <=100; j++ ){
			ca.click(driver.findElement(By.xpath("//div[contains(@class,'ColorMatchingRules')]//span[text()='+']/parent::div")));
			if(tr.getMaterialFamilyApprove1().isDisplayed()){
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'ColorMatchingRules')]//span[text()='+']/parent::div")));
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'ColorMatchingRules')]//span[text()='+']/parent::div")));
				ca.eleToBeClickable();
				break;
			}
		}
		ca.click(tr.getMaterialFamilyApprove1());
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		a1.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(a1, "Approved");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		for(int i=0;i<30;i++)
		{
			ca.click(driver.findElement(By.xpath("//div[contains(@class,'ColorMatchingRules')]//span[text()='-']/parent::div")));
			if(driver.findElement(By.xpath("//*[text()='Theme']//following::a[text()='Color Rule Theme']")).isDisplayed()){
				for(int j=0;j<15;j++)
				{
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'ColorMatchingRules')]//span[text()='-']/parent::div")));
				}
				ca.eleToBeClickable();
				break;
			}
		}
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//*[text()='Contrast']//following::a[text()='Color Rule Theme']")));
		Commonactions.isElementPresent(tr.getColormaterial());
		ca.click(tr.getColormaterial());
		Commonactions.isElementPresent(tr.getColorrules());
		ca.click(tr.getColorrules());
		Commonactions.isElementPresent(tr.getGeneratecolorrule());
		ca.click(tr.getGeneratecolorrule());
		ca.eleToBeClickable();
		System.out.println("Blue(Family - 01) family Approved");

		Commonactions.isElementPresent(in.getHomeArrowIcon());
		ca.click(in.getHomeArrowIcon());
		Commonactions.isElementPresent(in.getSelectlastview());
		ca.click(in.getSelectlastview());
		ca.eleToBeClickable();

		for(int j = 1; j <=100; j++ ){
			ca.click(driver.findElement(By.xpath("//div[contains(@class,'ColorMatchingRules')]//span[text()='+']/parent::div")));
			if(tr.getMaterialFamilyApprove2().isDisplayed()){
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'ColorMatchingRules')]//span[text()='+']/parent::div")));
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'ColorMatchingRules')]//span[text()='+']/parent::div")));
				ca.eleToBeClickable();
				break;
			}
		}
		ca.click(tr.getMaterialFamilyApprove2());
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		a2.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(a2, "Approved");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		ca.click(driver.findElement(By.xpath("//*[text()='Theme']//following::a[text()='Color Rule Theme']")));
		Commonactions.isElementPresent(tr.getColormaterial());
		ca.click(tr.getColormaterial());
		Commonactions.isElementPresent(tr.getColorrules());
		ca.click(tr.getColorrules());
		Commonactions.isElementPresent(tr.getGeneratecolorrule());
		ca.click(tr.getGeneratecolorrule());
		ca.eleToBeClickable();
		System.out.println("Red (Family - 02) family Approved");

	}

	@Then("Navigate to Material and Set Main Material = True for {int} Materials i.e. created above scenario")
	public void navigate_to_Material_and_Set_Main_Material_True_for_Materials_i_e_created_above_scenario(Integer int1) throws Throwable {
		Commonactions.isElementPresent(hp.getUser_homeBtn());
		ca.click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(hp.getMaterialBtn());
		ca.click(hp.getMaterialBtn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(tr.getMainmaterialview());
		ca.click(tr.getMainmaterialview());
		Commonactions.isElementPresent(tr.getMainmaterialmanage());
		ca.click(tr.getMainmaterialmanage());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "main material");
		ca.click(tr.getColoredtext());
		for(int i=0;i<30;i++)
		{
			Actions a1 = new Actions(driver);
			a1.sendKeys(Keys.DOWN).build().perform();	
		}
		Commonactions.isElementPresent(tr.getMainmaterial());
		ca.click(tr.getMainmaterial());
		Commonactions.isElementPresent(mp.getAdd());
		ca.click(mp.getAdd());
		ca.eleToBeClickable();
		for (int i = 0; i < 13; i++) 
		{ ca.click(in.getUp()); }
		ca.eleToBeClickable();
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();

		ca.click(tr.getLinenmainmaterial());
		ca.click(tr.getCottonmainmaterial());
		ca.click(tr.getPolystermainmaterial());
		System.out.println("Added main material and clicked True for all 3 material");

	}

	@And("Navigate to Style – Season, Create a Season Color Rule – Availability")
	public void navigate_to_Style_Season_Create_a_Season_Color_Rule_Availability() throws Throwable {

		Commonactions.isElementPresent(hp.getStyleBtn());
		ca.click(hp.getStyleBtn());
		Commonactions.isElementPresent(st.getNew_season_Btn());
		ca.click(st.getNew_season_Btn());
		Commonactions.isElementPresent(pp.getSeason_Value());
		ca.insertText(pp.getSeason_Value(), "Color Rule - from availability");
		Commonactions.isElementPresent(sp.getSaveandgo());
		ca.click(sp.getSaveandgo());
		ca.eleToBeClickable();
		System.out.println("New Season for theme created successfully");

	}

	@And("Navigate to Season – Specification, Add {int} Materials")
	public void navigate_to_Season_Specification_Add_Materials(Integer int1) throws Throwable {
		Commonactions.isElementPresent(tr.getThemecolorspecificationtab());
		ca.click(tr.getThemecolorspecificationtab());
		Commonactions.isElementPresent(tr.getAddmaterialbtn());
		ca.click(tr.getAddmaterialbtn());
		Commonactions.isElementPresent(tr.getLinenecheckbox());
		ca.click(tr.getLinenecheckbox());
		ca.click(tr.getCottonCheckbox());
		ca.click(tr.getPolystercheckbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(tr.getMaterialrefresh());
		ca.click(tr.getMaterialrefresh());
		ca.eleToBeClickable();
		System.out.println("Material refreshed and values reflected in Theme-Specification Tab");
	}

	@Then("Go to Season – Theme – Color Rule and Click Action - Generate Color rules from Availability")
	public void go_to_Season_Theme_Color_Rule_and_Click_Action_Generate_Color_rules_from_Availability() {
		Commonactions.isElementPresent(tr.getThemeruleseasonTheme());
		ca.click(tr.getThemeruleseasonTheme());
		Commonactions.isElementPresent(tr.getThemeColorRules());
		ca.click(tr.getThemeColorRules());
		System.out.println("Theme Color Rules Clicked");

	}
	@Then("Verify Color Rule generate from availability")
	public void verify_Color_Rule_generate_from_availability() throws Throwable {
		Commonactions.isElementPresent(tr.getColorruleaction());
		ca.click(tr.getColorruleaction());
		Commonactions.isElementPresent(tr.getGeneratecolorrulefromavailability());
		ca.click(tr.getGeneratecolorrulefromavailability());
		Commonactions.isElementPresent(tr.getMatchingtype());
		ca.click(tr.getMatchingtype());
		Commonactions.isElementPresent(tr.getAllvalue());
		ca.click(tr.getAllvalue());	
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		a2.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		System.out.println("values Refelcted in color Rules from availability");
	}



}
