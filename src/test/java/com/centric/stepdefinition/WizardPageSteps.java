package com.centric.stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.centric.objectrepository.BusinessPlanningPage;
import com.centric.objectrepository.ConversationCategoriesPage;
import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.InspectionPage;
import com.centric.objectrepository.PopupPage;
import com.centric.objectrepository.QualityPage;
import com.centric.objectrepository.StylePage;
import com.centric.objectrepository.WizardPage;
import com.centric.resources.Commonactions;
import com.centric.objectrepository.StyleMaterialSamplepage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WizardPageSteps extends Commonactions {
	Commonactions ca = new Commonactions();
	HomePage hp = new HomePage();
	StylePage st = new StylePage();
	WizardPage wp= new WizardPage();
	QualityPage  qp = new QualityPage();
	BusinessPlanningPage bp=new BusinessPlanningPage();
	ConversationCategoriesPage cc=new ConversationCategoriesPage();
	StyleMaterialSamplepage sp=new StyleMaterialSamplepage(); 
	InspectionPage ii = new InspectionPage();

	@Then("Navigate to style tab and create new style with name as wizard {string}")
	public void navigate_to_style_tab_and_create_new_style_with_name_as_wizard(String string)throws Throwable {
		ca.eleToBeClickable();
		Commonactions.isElementPresent(hp.getStyleBtn());
		hp.getStyleBtn().click();
		Commonactions.isElementPresent(st.getStyles_Btn());
		st.getStyles_Btn().click();
		Commonactions.isElementPresent(wp.getNew_style_arrowbutton());
		wp.getNew_style_arrowbutton().click();
		Commonactions.isElementPresent(wp.getNew_from_style());
		Commonactions.isElementPresent(wp.getMove_styles_from());
		System.out.println("Completed verifying style dropdown");
		Commonactions.isElementPresent(wp.getNew_style_action());
		wp.getNew_style_action().click();
		boolean verify=Commonactions.isElementPresent(wp.getNew_style_heading());
		if (verify==true){
			Commonactions.isElementPresent(wp.getNew_style_heading());
			Commonactions.isElementPresent(wp.getSelect_hierarchy_details());
			Commonactions.isElementPresent(wp.getSeason_dropdown());
			wp.getSeason_dropdown().click();
			Commonactions.isElementPresent(wp.getWinter_select());
			wp.getWinter_select().click();
			Thread.sleep(1000);
			Commonactions.isElementPresent(qp.getNext());
			ca.click(qp.getNext());
			System.out.println("next clicked");
			ca.eleToBeClickable();
			Commonactions.isElementPresent(wp.getStyle_type_dropdown());
			ca.click(wp.getStyle_type_dropdown());
			Commonactions.isElementPresent(wp.getApparel_select());
			ca.click(wp.getApparel_select());			
			Commonactions.isElementPresent(wp.getStyle_input());
			ca.click(wp.getStyle_input());
			ca.insertText(wp.getStyle_input(),"New Apparel - Wizard");
			Commonactions.isElementPresent(bp.getStyleEnumvalue());
			ca.insertText(bp.getStyleEnumvalue(),"Enum A1");
			WebElement a2 = ca.activeElement();
			ca.eleToBeClickable();
			a2.sendKeys(Keys.TAB);			
			Commonactions.isElementPresent(wp.getCheck_box_test());
			ca.click(wp.getCheck_box_test());			
			Commonactions.isElementPresent(qp.getFinish());
			ca.click(qp.getFinish());
			ca.eleToBeClickable();
			Commonactions.isElementPresent(wp.getNew_apparel_wizard());
			ca.eleToBeClickable();
			System.out.println("Completed creating new style");
		}

	}	
	@When("Navigate to new from style")
	public void navigate_to_new_from_style()throws Throwable {
		Commonactions.isElementPresent(wp.getNew_style_arrowbutton());
		wp.getNew_style_arrowbutton().click();
		Commonactions.isElementPresent(wp.getNew_from_style());
		wp.getNew_from_style().click();
		ca.eleToBeClickable();
		Commonactions.clickjs(driver.findElement(By.xpath("//tr[2]//div[@data-csi-act='ViewSelect']/input[@tabindex='0']")));	
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(wp.getDiscard_button());
		wp.getDiscard_button().click();
		Commonactions.isElementPresent(wp.getNew_style_arrowbutton());
		wp.getNew_style_arrowbutton().click();
		Commonactions.isElementPresent(wp.getNew_from_style());
		wp.getNew_from_style().click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(wp.getApparel_onlycolor_checkbox());
		wp.getApparel_onlycolor_checkbox().click();
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		ca.eleToBeClickable();		
		Commonactions.isElementPresent(wp.getSeason_dropdown());
		wp.getSeason_dropdown().click();
		Commonactions.isElementPresent(wp.getWinter_select());
		wp.getWinter_select().click();
		Thread.sleep(1000);
		Commonactions.isElementPresent(qp.getNext());
		ca.click(qp.getNext());
		System.out.println("Completed verifying new from style");
		Commonactions.mouseOver(wp.getSelect_hierarchy_details());
		Commonactions.isElementPresent(driver.findElement(By.xpath("(//div[text()='winter season'])[1]")));
		Commonactions.isElementPresent(wp.getStyle_input_copy());
		System.out.println("input the style name");
		ca.insertText(wp.getStyle_input_copy(), "New Accessories - Wizard");
		ca.eleToBeClickable();
		Commonactions.isElementPresent(qp.getFinish());
		ca.click(qp.getFinish());	
		Commonactions.isElementPresent(wp.getCheck_box_test_copy());
		ca.click(wp.getCheck_box_test_copy());
		Commonactions.isElementPresent(qp.getFinish());
		ca.click(qp.getFinish());
		Commonactions.isElementPresent(wp.getNew_accessories_wizard());
	}

	@When("Create Move Style from within the style tab")
	public void create_Move_Style_from_within_the_style_tab()throws Throwable {

		for(int i=0;i<2;i++)
		{ 
			Commonactions.isElementPresent(wp.getNew_style_arrowbutton());
			wp.getNew_style_arrowbutton().click();
			Commonactions.isElementPresent(wp.getMove_styles_from());
			wp.getMove_styles_from().click();
			Commonactions.isElementPresent(wp.getStyle_dropdown());
			wp.getStyle_dropdown().click();
			ca.eleToBeClickable();
			WebElement a2 = ca.activeElement();
			ca.eleToBeClickable();
			a2.sendKeys("New Accessories - Wizard");
			ca.eleToBeClickable();

			Commonactions.isElementPresent(driver.findElement(By.xpath("//div/input[@value='New Accessories - Wizard']")));
			ca.click(driver.findElement(By.xpath("//div/input[@value='New Accessories - Wizard']")));
			ca.eleToBeClickable();
			WebElement a3 = ca.activeElement();
			ca.eleToBeClickable();
			a3.sendKeys(Keys.TAB);
			ca.eleToBeClickable();

			System.out.println("Style for move style from created successfully");
			Commonactions.isElementPresent(wp.getAccessories_wizard_checkbox());
			wp.getAccessories_wizard_checkbox().click();
			Commonactions.isElementPresent(qp.getNext());
			ca.click(qp.getNext());
			Commonactions.isElementPresent(wp.getSeason_dropdown());
			wp.getSeason_dropdown().click();
			Commonactions.isElementPresent(wp.getSpring_select());
			wp.getSpring_select().click();
			Commonactions.isElementPresent(qp.getFinish());
			ca.click(qp.getFinish());
			ca.eleToBeClickable();
			try{	ca.click(ii.getCancel());}
			catch(Exception e){break;}
		}
		System.out.println("Completed moving style from new style");

	}

	@When("Navigate to apparel color and size style add image")
	public void navigate_to_apparel_color_and_size_style_add_image()throws Throwable {

		Commonactions.isElementPresent(wp.getStylepagefilter());
		ca.click(wp.getStylepagefilter());
		ca.eleToBeClickable();
		WebElement h1 = ca.activeElement();
		ca.eleToBeClickable();
		h1.sendKeys("Apparel - Color and Size");
		ca.eleToBeClickable();   
		Commonactions.isElementPresent(wp.getApparelcolorndsizecheckbox());
		ca.click(wp.getApparelcolorndsizecheckbox());       
		ca.eleToBeClickable();	
		driver.findElement(By.xpath("//span[text()='Style Type']")).click();
		ca.eleToBeClickable();
		Commonactions.isElementNotPresent(wp.getApparel_colorsize());
		wp.getApparel_colorsize().click();
		Commonactions.isElementPresent(wp.getBrowse_image());
		wp.getBrowse_image().click();
		Thread.sleep(1000);
		Commonactions.isElementPresent(wp.getImg_1());
		wp.getImg_1().click();
		ca.click(driver.findElement(By.xpath("(//span[text()='Save'])")));
		ca.eleToBeClickable();	
		Commonactions.isElementPresent(wp.getAction_dropdown_btn());
		wp.getAction_dropdown_btn().click();
		Commonactions.isElementPresent(wp.getPush_image_menu());
		wp.getPush_image_menu().click();
		Thread.sleep(1000);
		boolean verify1=Commonactions.isElementPresent(driver.findElement(By.xpath("//span[@role='heading' and text()='Push Images to Styles']")));
		if (verify1==true) {
			Commonactions.isElementPresent(driver.findElement(By.xpath("//div[contains(text(),'Choose Styles')]")));
			Commonactions.isElementPresent(driver.findElement(By.xpath("//div[contains(text(),'Choose Images')]")));
			ca.click(driver.findElement(By.xpath("//div[@data-csi-act='ViewSelect']")));
			Commonactions.isElementPresent(qp.getNext());
			ca.click(qp.getNext());
			Commonactions.isElementPresent(wp.getStyle_pushimage_dropdown());
			wp.getStyle_pushimage_dropdown().click();
			ca.eleToBeClickable();
			WebElement a4 = ca.activeElement();
			ca.eleToBeClickable();
			a4.sendKeys("New Apparel - Wizard");
			ca.eleToBeClickable();		
			Commonactions.isElementPresent(driver.findElement(By.xpath("//div/input[@value='New Apparel - Wizard']")));
			ca.click(driver.findElement(By.xpath("//div/input[@value='New Apparel - Wizard']")));
			ca.eleToBeClickable();
			WebElement a3 = ca.activeElement();
			ca.eleToBeClickable();
			a3.sendKeys(Keys.TAB);
			ca.eleToBeClickable();
			Commonactions.isElementPresent(wp.getApparel_wizard_checkbox());
			wp.getApparel_wizard_checkbox().click();
			Commonactions.isElementPresent(qp.getFinish());
			ca.click(qp.getFinish());		
		}
		Commonactions.isElementPresent(wp.getFind_item_style());
		wp.getFind_item_style().click();
		ca.eleToBeClickable();
		WebElement a5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a5, "New Apparel - Wizard");
		ca.eleToBeClickable();
		a5.sendKeys(Keys.DOWN);
		a5.sendKeys(Keys.ENTER);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(wp.getFind_item_style());
		wp.getFind_item_style().click();
		WebElement a6 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a6, "Apparel - Color and Size");
		a6.sendKeys(Keys.DOWN);
		a6.sendKeys(Keys.ENTER);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(wp.getAction_dropdown_btn());
		wp.getAction_dropdown_btn().click();
		Commonactions.isElementPresent(wp.getPush_colorways_menu());
		wp.getPush_colorways_menu().click();
		boolean verify2=Commonactions.isElementPresent(driver.findElement(By.xpath("//span[@role='heading' and text()='Push Colorways to Styles']")));
		if(verify2==true) {
			Commonactions.isElementPresent(wp.getColorway_dropdown());
			wp.getColorway_dropdown().click();
			Commonactions.isElementPresent(driver.findElement(By.xpath("//div//label[text()='11-0103 EGRET']")));
			ca.click(driver.findElement(By.xpath("//div//label[text()='11-0103 EGRET']")));
			Commonactions.isElementPresent(driver.findElement(By.xpath("//div//label[text()='11-0103 EGRET - Copy']")));
			ca.click(driver.findElement(By.xpath("//div//label[text()='11-0103 EGRET - Copy']")));
			wp.getColorway_dropdown().click();
			Commonactions.isElementPresent(wp.getStyle_bom_checkbox());
			ca.click(wp.getStyle_bom_checkbox());
			Commonactions.isElementPresent(qp.getNext());
			ca.click(qp.getNext());
			Commonactions.isElementPresent(wp.getStyle_pushcoloway_dropdown());
			ca.click(wp.getStyle_pushcoloway_dropdown());
			ca.eleToBeClickable();
			WebElement a7 = ca.activeElement();
			ca.eleToBeClickable();
			a7.sendKeys("New Apparel - Wizard");
			ca.eleToBeClickable();
			Commonactions.isElementPresent(driver.findElement(By.xpath("//div/input[@value='New Apparel - Wizard']")));
			ca.click(driver.findElement(By.xpath("//div/input[@value='New Apparel - Wizard']")));
			ca.eleToBeClickable();
			WebElement a8 = ca.activeElement();
			ca.eleToBeClickable();
			a8.sendKeys(Keys.TAB);
			ca.eleToBeClickable();			
			Commonactions.isElementPresent(wp.getApparel_wizard_checkbox());
			wp.getApparel_wizard_checkbox().click();
			Commonactions.isElementPresent(qp.getFinish());
			ca.click(qp.getFinish());		
			System.out.println("navigated image to another style");
		}
	}
	@When("Navigate to new apparel wizard colorway verify data visible")
	public void navigate_to_new_apparel_wizard_colorway_verify_data_visible()throws Throwable  {
		Commonactions.isElementPresent(wp.getFind_item_style());
		wp.getFind_item_style().click();
		ca.eleToBeClickable();
		WebElement c1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(c1, "New Apparel - Wizard");
		ca.eleToBeClickable();
		c1.sendKeys(Keys.DOWN);
		c1.sendKeys(Keys.ENTER);
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getColorways());
		sp.getColorways().click();
		Commonactions.isElementPresent(driver.findElement(By.xpath("(//td//a[text()='11-0103 EGRET'])[1]")));
		Commonactions.isElementPresent(driver.findElement(By.xpath("//td//a[text()='11-0103 EGRET - Copy']")));
		ca.eleToBeClickable();
		System.out.println("apparel coloway pushed ");
	}
}
