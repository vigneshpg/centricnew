package com.centric.stepdefinition;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.centric.objectrepository.ConfigurationPage;
import com.centric.objectrepository.PopupPage;
import com.centric.resources.Commonactions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConfigurationPageSteps extends Commonactions {

	Commonactions ca=new Commonactions();
	ConfigurationPage cp=new ConfigurationPage();
	PopupPage pp=new PopupPage();
	static String style1,style2,style3,style4=null;

	@When("User creates style type {string},{string},{string},{string}")
	public void user_creates_style_type(String A, String B, String C, String D) throws Throwable {
		style1=A;
		style2=B;
		style3=C;
		style4=D;
		//ca.eleToBeClickable();ca.isElementPresent(element);
		Commonactions.clickjs(cp.getStyle_Types());
		Commonactions.jsWaitForPageLoad();
		//ca.eleToBeClickable();ca.isElementPresent(element);
		//	ca.clickjs(driver.findElement(By.xpath("(//span[contains(@class,'fullScreen')])[3]")));
		colourAndSize(A);
		onlyColours(B);
		onlySize(C);
		noDatas(D);

		getStyleActive();

		System.out.println("style type created successfully");
		System.out.println("checkbox clicked successfully");
		//	ca.clickjs(driver.findElement(By.xpath("//span[@title='Exit Full Screen']")));

	}

	@When("User fill the style type attributes fields")
	public void user_fill_the_style_type_attributes_fields() throws Throwable {
		////ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getStyle_Type_DataSheets());
		Commonactions.clickjs(cp.getStyle_Type_DataSheets());
		//ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getStyle_Type_DataSheets_RefreshBtn());
		try{
			Commonactions.clickjs(cp.getStyle_Type_DataSheets_RefreshBtn());
		}catch(Exception e){

		}
		ca.eleToBeClickable();
		//ca.clickjs(driver.findElement(By.xpath("(//span[contains(@class,'fullScreen')])[3]")));
		List<WebElement> nRows = driver.findElements(By.xpath("((//div[contains(@class,'TDS')])/div[@class='csiDialogScroll']//table)//tr[@data-csi-act='ViewSelect']"));
		int i = nRows.size();
		for (int j = 1; j <=i; j++) {
			ca.eleToBeClickable();
			WebElement text = driver.findElement(By.xpath("((((//div[contains(@class,'TDS')])/div[@class='csiDialogScroll']//table)//tr[@data-csi-act='ViewSelect'])["+j+"]/td)[1]"));
			//String s = String.valueOf(j);
			//style=null;
			String text2 = text.getText();
			System.out.println("text is :"+text2);

			if(text2.equals(style1)){
				for (int j2 = 1; j2 <= 12; j2++) {
					if(j2<=5){
						ca.eleToBeClickable();
						Commonactions.clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));
						//ca.eleToBeClickable(cp.getStyle_Colour());
					}else{
						ca.eleToBeClickable();
						Commonactions.clickjs(driver.findElement(By.xpath("(//span[text()='+']/parent::div)[3]")));
						ca.eleToBeClickable();
						Commonactions.clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));

					}
				}
				for(int k=0; k < 8; k++){
					Commonactions.clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[3]")));
				}
			}else if(text2.equals(style2)){
				for (int j2 = 1; j2 <= 12; j2++) {

					if(j2<=5){
						ca.eleToBeClickable();
						Commonactions.clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));
						//ca.eleToBeclickjsable(cp.getStyle_Colour());
					}else{
						ca.eleToBeClickable();
						Commonactions.clickjs(driver.findElement(By.xpath("(//span[text()='+']/parent::div)[3]")));
						ca.eleToBeClickable();
						Commonactions.clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));

					}

				}for(int k=0; k < 8; k++){
					Commonactions.clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[3]")));
				}
			}else if(text2.equals(style3)){
				for (int j2 = 1; j2 <= 12; j2++) {

					if(j2<=5){
						ca.eleToBeClickable();
						Commonactions.clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));
						//ca.eleToBeclickjsable(cp.getStyle_Colour());
					}else{
						ca.eleToBeClickable();
						Commonactions.clickjs(driver.findElement(By.xpath("(//span[text()='+']/parent::div)[3]")));
						ca.eleToBeClickable();
						Commonactions.clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));
					}

				}
				for(int k=0; k < 8; k++){
					Commonactions.clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[3]")));
				}
			}else if(text2.equals(style4)){
				for (int j2 = 1; j2 <= 12; j2++) {

					if(j2<=5){
						ca.eleToBeClickable();
						Commonactions.clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));
						//ca.eleToBeclickjsable(cp.getStyle_Colour());
					}else{
						ca.eleToBeClickable();
						Commonactions.clickjs(driver.findElement(By.xpath("(//span[text()='+']/parent::div)[3]")));
						ca.eleToBeClickable();
						Commonactions.clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));
					}

				}
				for(int k=0; k < 8; k++){
					Commonactions.clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[3]")));
				}
			}else{
			}
			System.out.println("name doesn't matched");
		}


		System.out.println("style type attributes created successfully");
		System.out.println("checkbox clicked successfully");
	}
	//ca.clickjs(driver.findElement(By.xpath("//span[@title='Exit Full Screen']")));



	@When("User creates material type {string},{string},{string}")
	public void user_creates_material_type(String A, String B, String C) throws Throwable {

		ca.eleToBeClickable();
		Commonactions.clickjs(cp.getMaterial_Types());
		//ca.clickjs(driver.findElement(By.xpath("(//span[contains(@class,'fullScreen')])[3]")));
		standaloneMaterial(A);
		structureMaterial(B);
		toolMaterial(C);

		System.out.println("material type created successfully");
		System.out.println("checkbox clicked successfully");
		//ca.clickjs(driver.findElement(By.xpath("//span[@title='Exit Full Screen']")));
	}

	@When("User creates BOM type {string},{string}")
	public void user_creates_BOM_type(String A, String B) throws Throwable {



		Commonactions.isElementPresent(cp.getBOM_Types());
		Commonactions.clickjs(cp.getBOM_Types());
		Commonactions.isElementPresent(cp.getNew_BOM_Type_Btn());
		Commonactions.clickjs(cp.getNew_BOM_Type_Btn());
		Commonactions.isElementPresent(pp.getBOM_Type_Value());
		ca.insertText(pp.getBOM_Type_Value(), A);
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		Commonactions.clickjs(pp.getConfig_save_Btn());
		Commonactions.isElementPresent(cp.getBOM_FilterQuotesByColor());
		Commonactions.clickjs(cp.getBOM_FilterQuotesByColor());
		Commonactions.isElementPresent(cp.getBOM_LockThemePlacementList());
		Commonactions.clickjs(cp.getBOM_LockThemePlacementList());
		Commonactions.isElementPresent(cp.getBOM_expose());
		Commonactions.clickjs(cp.getBOM_expose());
		Commonactions.isElementPresent(pp.getOK_Btn());
		try{
			Commonactions.clickjs(pp.getOK_Btn());
			ca.eleToBeClickable();
		}catch (Exception e) {
			// TODO: handle exception
		}
		Commonactions.clickjs(cp.getBOM_AutPlaceTracking());
		ca.eleToBeClickable();
		getActive();

		Commonactions.isElementPresent(cp.getNew_materialBOM_Type_Btn());
		Commonactions.clickjs(cp.getNew_materialBOM_Type_Btn());
		Commonactions.isElementPresent(pp.getBOM_Type_Value());
		ca.insertText(pp.getBOM_Type_Value(), B);
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		Commonactions.clickjs(pp.getConfig_save_Btn());
		Commonactions.isElementPresent(cp.getMaterial_BOM_FilterQuotesByColor());
		Commonactions.clickjs(cp.getMaterial_BOM_FilterQuotesByColor());
		Commonactions.isElementPresent(cp.getMaterialBOM_expose());
		Commonactions.clickjs(cp.getMaterialBOM_expose());
		Commonactions.isElementPresent(pp.getOK_Btn());
		try{
			Commonactions.clickjs(pp.getOK_Btn());
			ca.eleToBeClickable();
		}catch (Exception e) {
			// TODO: handle exception
		}
		getActive();
		ca.eleToBeClickable();

		System.out.println("style & material BOM created successfully");
		System.out.println("checkbox clicked successfully");

	}

	@When("User creates size chart type {string},{string},{string},{string}")
	public void user_creates_size_chart_type(String All, String List, String Value, String Tolerance) throws Throwable {




		Commonactions.isElementPresent(cp.getSizeChart_Types());
		Commonactions.clickjs(cp.getSizeChart_Types());

		Commonactions.isElementPresent(cp.getNew_sizeChart_Types_Btn());
		Commonactions.clickjs(cp.getNew_sizeChart_Types_Btn());
		Commonactions.isElementPresent(pp.getSizeChart_Type_Value());
		ca.insertText(pp.getSizeChart_Type_Value(), All);
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		Commonactions.clickjs(pp.getConfig_save_Btn());
		Commonactions.isElementPresent(cp.getSizeChart_Tolerance());
		Commonactions.clickjs(cp.getSizeChart_Tolerance());
		Commonactions.isElementPresent(cp.getSizeChart_DimensionValues());
		Commonactions.clickjs(cp.getSizeChart_DimensionValues());
		Commonactions.isElementPresent(cp.getSizeChart_DimensionList());
		Commonactions.clickjs(cp.getSizeChart_DimensionList());


		Commonactions.isElementPresent(cp.getNew_sizeChart_Types_Btn());
		Commonactions.clickjs(cp.getNew_sizeChart_Types_Btn());
		Commonactions.isElementPresent(pp.getSizeChart_Type_Value());
		ca.insertText(pp.getSizeChart_Type_Value(), List);
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		Commonactions.clickjs(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getSizeChart_DimensionList());
		Commonactions.clickjs(cp.getSizeChart_DimensionList());

		Commonactions.isElementPresent(cp.getNew_sizeChart_Types_Btn());
		Commonactions.clickjs(cp.getNew_sizeChart_Types_Btn());
		Commonactions.isElementPresent(pp.getSizeChart_Type_Value());
		ca.insertText(pp.getSizeChart_Type_Value(), Value);
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		Commonactions.clickjs(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getSizeChart_DimensionValues());
		Commonactions.clickjs(cp.getSizeChart_DimensionValues());


		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getNew_sizeChart_Types_Btn());
		Commonactions.clickjs(cp.getNew_sizeChart_Types_Btn());
		Commonactions.isElementPresent(pp.getSizeChart_Type_Value());
		ca.insertText(pp.getSizeChart_Type_Value(), Tolerance);
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		Commonactions.clickjs(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getSizeChart_Tolerance());
		Commonactions.clickjs(cp.getSizeChart_Tolerance());
		ca.eleToBeClickable();
		//getActive();
		getSizeActive();
		ca.eleToBeClickable();

		System.out.println("size chart created successfully");
		System.out.println("checkbox clicked successfully");
	}


	@When("User creates spec type {string},{string}")
	public void user_creates_spec_type(String A,String B) throws Throwable {

		Commonactions.isElementPresent(cp.getSpec_Types());
		Commonactions.clickjs(cp.getSpec_Types());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getNew_spec_type_Btn());
		Commonactions.clickjs(cp.getNew_spec_type_Btn());
		Commonactions.isElementPresent(pp.getSpec_Type_Value());
		ca.insertText(pp.getSpec_Type_Value(), A);
		Commonactions.isElementPresent(pp.getConfig_cancel_Btn());
		Commonactions.clickjs(pp.getConfig_cancel_Btn());


		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getNew_spec_type_Btn());
		Commonactions.clickjs(cp.getNew_spec_type_Btn());
		Commonactions.isElementPresent(pp.getSpec_Type_Value());
		ca.insertText(pp.getSpec_Type_Value(), B);
		Commonactions.isElementPresent(pp.getConfig_cancel_Btn());
		Commonactions.clickjs(pp.getConfig_cancel_Btn());
		Commonactions.isElementPresent(cp.getSpec_EnableA());
		Thread.sleep(1000);
		Commonactions.clickjs(cp.getSpec_EnableA());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getSpec_EnableB());
		Commonactions.clickjs(cp.getSpec_EnableB());
		ca.eleToBeClickable();
		getSpecActive();
		ca.eleToBeClickable();

		System.out.println("spec type created successfully");
		System.out.println("checkbox clicked successfully");

	}

	@When("User creates test type {string},{string},{string}")
	public void user_creates_test_type(String A,String B,String C) throws Throwable {



		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getTest_Types());
		Commonactions.clickjs(cp.getTest_Types());
		Commonactions.isElementPresent(cp.getNew_test_type_Btn());
		Commonactions.clickjs(cp.getNew_test_type_Btn());
		Commonactions.isElementPresent(pp.getTest_Type_Value());
		ca.insertText(pp.getTest_Type_Value(), A);
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		Commonactions.clickjs(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		ca.eleToBeClickable();


		Commonactions.isElementPresent(cp.getNew_test_type_Btn());
		Commonactions.clickjs(cp.getNew_test_type_Btn());
		Commonactions.isElementPresent(pp.getTest_Type_Value());
		ca.insertText(pp.getTest_Type_Value(), B);
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		Commonactions.clickjs(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		ca.eleToBeClickable();


		Commonactions.isElementPresent(cp.getNew_test_type_Btn());
		Commonactions.clickjs(cp.getNew_test_type_Btn());
		Commonactions.isElementPresent(pp.getTest_Type_Value());
		ca.insertText(pp.getTest_Type_Value(), C);
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		Commonactions.clickjs(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		getTestActive();
		ca.eleToBeClickable();

		System.out.println("test type created successfully");
		System.out.println("checkbox clicked successfully");


	}


	@When("User performing delete action")
	public void user_performing_delete_action() throws Throwable {

		List<WebElement> actives = driver.findElements(By.xpath("(//span[@data-csi-act='Delete'])"));
		for (int i = 0; i < actives.size(); i++) {

			if(i==actives.size()-1){

				int j = 1+i;
				System.out.println(i+"&"+j);
				ca.eleToBeClickable();
				Commonactions.clickjs(driver.findElement(By.xpath("(//span[@data-csi-act='Delete'])["+j+"]")));
				break;
			}


		}

		Commonactions.clickjs(pp.getDelete_Btn());


		System.out.println("deleted successfully");


	}

	@When("User creates inspection type {string},{string},{string},{string},{string}")
	public void user_creates_inspection_type(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {

		Commonactions.isElementPresent(cp.getInsp_Types());
		Commonactions.clickjs(cp.getInsp_Types());
		Commonactions.isElementPresent(cp.getNew_InspTypes_Btn());
		ca.eleToBeClickable();
		Commonactions.clickjs(cp.getNew_InspTypes_Btn());
		Commonactions.isElementPresent(pp.getConfig_InspectionType_Value());
		ca.insertText(pp.getConfig_InspectionType_Value(), arg1);
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		Commonactions.clickjs(pp.getConfig_save_Btn());
		ca.eleToBeClickable();


		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getNew_InspTypes_Btn());
		Commonactions.clickjs(cp.getNew_InspTypes_Btn());
		Commonactions.isElementPresent(pp.getConfig_InspectionType_Value());
		ca.insertText(pp.getConfig_InspectionType_Value(), arg2);
		Commonactions.isElementPresent(pp.getConfig_inspection_DropDown());
		ca.click(pp.getConfig_inspection_DropDown());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("((//div[@data-csi-automation='field-FinalInspectionSectionSubtype-Form-LinkingType'])[2]/div)[3]")));
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		Commonactions.clickjs(pp.getConfig_save_Btn());
		ca.eleToBeClickable();

		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getNew_InspTypes_Btn());
		Commonactions.clickjs(cp.getNew_InspTypes_Btn());
		Commonactions.isElementPresent(pp.getConfig_InspectionType_Value());
		ca.insertText(pp.getConfig_InspectionType_Value(), arg3);
		Commonactions.isElementPresent(pp.getConfig_inspection_DropDown());
		ca.click(pp.getConfig_inspection_DropDown());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("((//div[@data-csi-automation='field-FinalInspectionSectionSubtype-Form-LinkingType'])[2]/div)[4]")));
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		Commonactions.clickjs(pp.getConfig_save_Btn());
		ca.eleToBeClickable();

		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getNew_InspTypes_Btn());
		Commonactions.clickjs(cp.getNew_InspTypes_Btn());
		Commonactions.isElementPresent(pp.getConfig_InspectionType_Value());
		ca.insertText(pp.getConfig_InspectionType_Value(), arg4);
		Commonactions.isElementPresent(pp.getConfig_inspection_DropDown());
		ca.click(pp.getConfig_inspection_DropDown());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("((//div[@data-csi-automation='field-FinalInspectionSectionSubtype-Form-LinkingType'])[2]/div)[5]")));
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		Commonactions.clickjs(pp.getConfig_save_Btn());
		ca.eleToBeClickable();

		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getNew_InspTypes_Btn());
		Commonactions.clickjs(cp.getNew_InspTypes_Btn());
		Commonactions.isElementPresent(pp.getConfig_InspectionType_Value());
		ca.insertText(pp.getConfig_InspectionType_Value(), arg5);
		Commonactions.isElementPresent(pp.getConfig_inspection_DropDown());
		ca.click(pp.getConfig_inspection_DropDown());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("((//div[@data-csi-automation='field-FinalInspectionSectionSubtype-Form-LinkingType'])[2]/div)[6]")));
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		Commonactions.clickjs(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		ca.eleToBeClickable();

		getInspectionActive();

		System.out.println("inspection type created successfully");
		System.out.println("checkbox clicked successfully");

	}

	@When("User creates contractual documents {string},{string},{string},{string},{string}")
	public void user_creates_contractual_documents(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {

		try{

			ca.eleToBeClickable();
			Commonactions.clickjs(driver.findElement(By.xpath("//button[@aria-label='Scroll Right']")));
		}catch(Exception e){
		}

		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getContract_Types());
		Commonactions.clickjs(cp.getContract_Types());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getNew_contractTypes_Btn());
		Commonactions.clickjs(cp.getNew_contractTypes_Btn());
		Commonactions.isElementPresent(pp.getConfig_contractType_Value());
		ca.insertText(pp.getConfig_contractType_Value(), arg1);
		ca.eleToBeClickable();
		Commonactions.clickjs(pp.getConfig_save_Btn());
		Commonactions.isElementPresent(cp.getContrct_HED());
		Commonactions.clickjs(cp.getContrct_HED());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getContrct_RA());
		Commonactions.clickjs(cp.getContrct_RA());
		ca.eleToBeClickable();
		//	//ca.eleToBeClickable();ca.isElementPresent(element);
		//	ca.clickjs(cp.getContrct_HRD());
		//	//ca.eleToBeClickable();ca.isElementPresent(element);


		Commonactions.isElementPresent(cp.getNew_contractTypes_Btn());
		Commonactions.clickjs(cp.getNew_contractTypes_Btn());
		Commonactions.isElementPresent(pp.getConfig_contractType_Value());
		ca.insertText(pp.getConfig_contractType_Value(), arg2);
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		Commonactions.clickjs(pp.getConfig_save_Btn());
		ca.eleToBeClickable();


		Commonactions.isElementPresent(cp.getNew_contractTypes_Btn());
		Commonactions.clickjs(cp.getNew_contractTypes_Btn());
		Commonactions.isElementPresent(pp.getConfig_contractType_Value());
		ca.insertText(pp.getConfig_contractType_Value(), arg3);
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		Commonactions.clickjs(pp.getConfig_save_Btn());
		Commonactions.isElementPresent(cp.getContrct_RA());
		ca.eleToBeClickable();
		Commonactions.clickjs(cp.getContrct_RA());
		ca.eleToBeClickable();


		Commonactions.isElementPresent(cp.getNew_contractTypes_Btn());
		Commonactions.clickjs(cp.getNew_contractTypes_Btn());
		Commonactions.isElementPresent(pp.getConfig_contractType_Value());
		ca.insertText(pp.getConfig_contractType_Value(), arg4);
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		Commonactions.clickjs(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getContrct_HED());
		Commonactions.clickjs(cp.getContrct_HED());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getContrct_RA());
		Commonactions.clickjs(cp.getContrct_RA());
		ca.eleToBeClickable();


		Commonactions.isElementPresent(cp.getNew_contractTypes_Btn());
		Commonactions.clickjs(cp.getNew_contractTypes_Btn());
		Commonactions.isElementPresent(pp.getConfig_contractType_Value());
		ca.insertText(pp.getConfig_contractType_Value(), arg5);
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		Commonactions.clickjs(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getContrct_HED());
		Commonactions.clickjs(cp.getContrct_HED());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getContrct_RA());
		Commonactions.clickjs(cp.getContrct_RA());
		ca.eleToBeClickable();

		Commonactions.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='HasRenewalPeriod:Child:SetupSettings:0']/input[@tabindex='0'])[3]")));

		Commonactions.isElementPresent(cp.getContrct_HRD());
		Commonactions.clickjs(cp.getContrct_HRD());
		ca.eleToBeClickable();



		getInspectionActive();

		Commonactions.isElementPresent(cp.getContrct_RPOR());
		Commonactions.clickjs(cp.getContrct_RPOR());
		ca.eleToBeClickable();

		System.out.println("contractual document type created successfully");
		System.out.println("checkbox clicked successfully");



	}

	@When("User creates LookUp items {string},{string},{string}")
	public void user_creates_LookUp_items(String arg1,String B,String C) throws Throwable {

		try{

			ca.eleToBeClickable();
			Commonactions.clickjs(driver.findElement(By.xpath("//button[@aria-label='Scroll Right']")));
		}catch(Exception e){
		}

		Commonactions.isElementPresent(cp.getLookUp_Types());
		Commonactions.clickjs(cp.getLookUp_Types());
		Commonactions.isElementPresent(cp.getNew_LookUp_Btn());
		Commonactions.clickjs(cp.getNew_LookUp_Btn());
		Commonactions.isElementPresent(pp.getConfig_lookUp_Value());
		ca.insertText(pp.getConfig_lookUp_Value(), arg1);
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		Commonactions.clickjs(pp.getConfig_save_Btn());
		ca.eleToBeClickable();


		Commonactions.clickjs(cp.getNew_LookUp_Btn());
		Commonactions.isElementPresent(pp.getConfig_lookUp_Value());
		ca.insertText(pp.getConfig_lookUp_Value(), B);
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		Commonactions.clickjs(pp.getConfig_save_Btn());
		ca.eleToBeClickable();


		Commonactions.clickjs(cp.getNew_LookUp_Btn());
		Commonactions.isElementPresent(pp.getConfig_lookUp_Value());
		ca.insertText(pp.getConfig_lookUp_Value(), C);
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		Commonactions.clickjs(pp.getConfig_save_Btn());
		ca.eleToBeClickable();

		getTestActive();

		System.out.println("Look up item created successfully");
		System.out.println("checkbox clicked successfully");
		//getLookActive();

	}

	@When("User creates theme master {string},{string},{string},{string}")
	public void user_creates_theme_master(String arg1, String arg2, String arg3, String arg4) throws Throwable {

		try{
			ca.eleToBeClickable();
			Commonactions.clickjs(driver.findElement(By.xpath("//button[@aria-label='Scroll Right']")));
		}catch(Exception e){

		}

		Commonactions.isElementPresent(cp.getTheme_Types());
		Commonactions.clickjs(cp.getTheme_Types());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getNew_theme_Btn());
		Commonactions.clickjs(cp.getNew_theme_Btn());
		Commonactions.isElementPresent(pp.getConfig_themeType_Value());
		ca.insertText(pp.getConfig_themeType_Value(), arg1);
		Commonactions.isElementPresent(pp.getConfig_theme_DropDown());
		ca.click(pp.getConfig_theme_DropDown());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("((//div[@data-csi-automation='field-ThemeMasterSubtype-Form-ThemeToSeason'])[2]/div)[5]")));
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		Commonactions.clickjs(pp.getConfig_save_Btn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cp.getTheme_Types());
		Commonactions.clickjs(cp.getTheme_Types());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getNew_theme_Btn());
		Commonactions.clickjs(cp.getNew_theme_Btn());
		Commonactions.isElementPresent(pp.getConfig_themeType_Value());
		ca.insertText(pp.getConfig_themeType_Value(), arg2);
		Commonactions.isElementPresent(pp.getConfig_theme_DropDown());
		ca.click(pp.getConfig_theme_DropDown());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("((//div[@data-csi-automation='field-ThemeMasterSubtype-Form-ThemeToSeason'])[2]/div)[4]")));
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		Commonactions.clickjs(pp.getConfig_save_Btn());
		ca.eleToBeClickable();

		ca.eleToBeClickable();Commonactions.isElementPresent(cp.getTheme_Types());
		Commonactions.clickjs(cp.getTheme_Types());
		Commonactions.isElementPresent(cp.getNew_theme_Btn());
		ca.eleToBeClickable();
		Commonactions.clickjs(cp.getNew_theme_Btn());
		Commonactions.isElementPresent(pp.getConfig_themeType_Value());
		ca.insertText(pp.getConfig_themeType_Value(), arg3);
		Commonactions.isElementPresent(pp.getConfig_theme_DropDown());
		ca.click(pp.getConfig_theme_DropDown());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("((//div[@data-csi-automation='field-ThemeMasterSubtype-Form-ThemeToSeason'])[2]/div)[3]")));
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		Commonactions.clickjs(pp.getConfig_save_Btn());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cp.getTheme_Types());
		Commonactions.clickjs(cp.getTheme_Types());
		Commonactions.isElementPresent(cp.getNew_theme_Btn());
		Commonactions.isElementPresent(cp.getNew_theme_Btn());
		Commonactions.clickjs(cp.getNew_theme_Btn());
		Commonactions.isElementPresent(pp.getConfig_themeType_Value());
		ca.insertText(pp.getConfig_themeType_Value(), arg4);
		Commonactions.isElementPresent(pp.getConfig_theme_DropDown());
		ca.click(pp.getConfig_theme_DropDown());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("((//div[@data-csi-automation='field-ThemeMasterSubtype-Form-ThemeToSeason'])[2]/div)[4]")));
		ca.eleToBeClickable();
		Commonactions.clickjs(driver.findElement(By.xpath("//input[@name='AllowMaterialVariationPerColorway']")));
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		Commonactions.clickjs(pp.getConfig_save_Btn());
		ca.eleToBeClickable();

		getSizeActive();
		//getThemeActive();

		System.out.println("theme master type created successfully");
		System.out.println("checkbox clicked successfully");


	}


	@Then("validate and accept the alert")
	public void validate_and_accept_the_alert() throws Throwable {

		Commonactions.waitForAlert(driver);
		System.out.println("alert accepted");

		//driver.close();

	}

public void colourAndSize(String value) throws Throwable {
		
		Commonactions.isElementPresent(cp.getNew_styleType_Btn());
		Commonactions.clickjs(cp.getNew_styleType_Btn());
		Commonactions.jsWaitForPageLoad();
		Commonactions.isElementPresent(pp.getConfig_styleType_ValueA());
		ca.insertText(pp.getConfig_styleType_ValueA(), value);
		Commonactions.clickjs(pp.getConfig_save_Btn());
		Commonactions.jsWaitForPageLoad();
		Commonactions.isElementPresent(cp.getStyle_Colour());
		Commonactions.clickjs(cp.getStyle_Colour());
		
		
		//Commonactions.isElementPresent(cp.getStyle_Active());
		//Commonactions.clickjs(cp.getStyle_Active());
		//ca.eleToBeClickable();
		try{
		for(int i=0; i < 30; i++){
			ca.click(driver.findElement(By.xpath("//div[contains(@class,'Style')]//span[text()='+']/parent::div")));
		}}catch (Exception e) {
			// TODO: handle exception
		}
		Commonactions.clickjs(cp.getStyle_Brands());
		Commonactions.isElementPresent(cp.getStyle_Features());
		Commonactions.clickjs(cp.getStyle_Features());
		Commonactions.isElementPresent(cp.getStyle_Functions());
		Commonactions.clickjs(cp.getStyle_Functions());
		Commonactions.isElementPresent(cp.getStyle_InAssortment());
		Commonactions.clickjs(cp.getStyle_InAssortment());
		Commonactions.isElementPresent(cp.getFood_assortment());
		Commonactions.clickjs(cp.getFood_assortment());
	    Commonactions.isElementPresent(cp.getStyle_IsAssortment());
		Commonactions.clickjs(cp.getStyle_IsAssortment());
		Commonactions.isElementPresent(cp.getStyle_EnableSKU());
		Commonactions.clickjs(cp.getStyle_EnableSKU());
	    ca.eleToBeClickable();
		try{
		for(int i=0; i < 20; i++){
			ca.click(driver.findElement(By.xpath("//div[contains(@class,'Style')]//span[text()='-']/parent::div")));
		}}catch (Exception e) {
			// TODO: handle exception
		}
		Commonactions.isElementPresent(cp.getStyle_EnableStyle());
		Commonactions.clickjs(cp.getStyle_EnableStyle());
		Commonactions.isElementPresent(cp.getStyle_Size());
		Commonactions.clickjs(cp.getStyle_Size());
		Commonactions.isElementPresent(cp.getStyle_Validate_MCM());
		Commonactions.clickjs(cp.getStyle_Validate_MCM());
		Commonactions.isElementPresent(cp.getStyle_Reference_Img());
		Commonactions.clickjs(cp.getStyle_Reference_Img());
		Commonactions.isElementPresent(cp.getStyle_Allow_ColourSpec());
		Commonactions.clickjs(cp.getStyle_Allow_ColourSpec());
		ca.eleToBeClickable();
		
		try{

		ca.click(driver.findElement(By.xpath("//div[contains(@class,'Style')]//span[text()='-']/parent::div")));
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void onlyColours(String value) throws Throwable {
		
		ca.eleToBeClickable();
		Commonactions.jsWaitForPageLoad();
		Commonactions.clickjs(cp.getNew_styleType_Btn());
		Commonactions.jsWaitForPageLoad();
		Commonactions.isElementPresent(pp.getConfig_styleType_ValueB());
		ca.insertText(pp.getConfig_styleType_ValueB(), value);
		Commonactions.jsWaitForPageLoad();
		Commonactions.clickjs(pp.getConfig_save_Btn());
		Commonactions.jsWaitForPageLoad();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getStyle_Colour());
		Commonactions.clickjs(cp.getStyle_Colour());
		ca.eleToBeClickable();
		//Commonactions.isElementPresent(cp.getStyle_Active());
		//Commonactions.clickjs(cp.getStyle_Active());
		//ca.eleToBeClickable();
		try{
		for(int i=0; i < 30; i++){
			ca.click(driver.findElement(By.xpath("//div[contains(@class,'Style')]//span[text()='+']/parent::div")));
		}}catch (Exception e) {
			// TODO: handle exception
		}
		Commonactions.clickjs(cp.getStyle_Brands());
		Commonactions.isElementPresent(cp.getStyle_Features());
		Commonactions.clickjs(cp.getStyle_Features());
		Commonactions.isElementPresent(cp.getStyle_Functions());
		Commonactions.clickjs(cp.getStyle_Functions());
		Commonactions.isElementPresent(cp.getStyle_InAssortment());
		Commonactions.clickjs(cp.getStyle_InAssortment());
		Commonactions.isElementPresent(cp.getFood_assortment());
		Commonactions.clickjs(cp.getFood_assortment());
	    Commonactions.isElementPresent(cp.getStyle_IsAssortment());
		Commonactions.clickjs(cp.getStyle_IsAssortment());
		Commonactions.isElementPresent(cp.getStyle_EnableSKU());
		Commonactions.clickjs(cp.getStyle_EnableSKU());
		 ca.eleToBeClickable();
		try{
		for(int i=0; i < 20; i++){
			ca.click(driver.findElement(By.xpath("//div[contains(@class,'Style')]//span[text()='-']/parent::div")));
		}}catch (Exception e) {
			// TODO: handle exception
		}
		Commonactions.isElementPresent(cp.getStyle_EnableStyle());
		Commonactions.clickjs(cp.getStyle_EnableStyle());
		Commonactions.isElementPresent(cp.getStyle_Validate_MCM());
		Commonactions.clickjs(cp.getStyle_Validate_MCM());
		Commonactions.isElementPresent(cp.getStyle_Reference_Img());
		Commonactions.clickjs(cp.getStyle_Reference_Img());
		Commonactions.isElementPresent(cp.getStyle_Allow_ColourSpec());
		Commonactions.clickjs(cp.getStyle_Allow_ColourSpec());
		ca.eleToBeClickable();
		try{

		ca.click(driver.findElement(By.xpath("//div[contains(@class,'Style')]//span[text()='-']/parent::div")));
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void onlySize(String value) throws Throwable {
		
		ca.eleToBeClickable();
		Commonactions.jsWaitForPageLoad();
		Commonactions.clickjs(cp.getNew_styleType_Btn());
		Commonactions.jsWaitForPageLoad();
		Commonactions.isElementPresent(pp.getConfig_styleType_ValueB());
		ca.insertText(pp.getConfig_styleType_ValueB(), value);
		Commonactions.jsWaitForPageLoad();
		Commonactions.clickjs(pp.getConfig_save_Btn());
		Commonactions.jsWaitForPageLoad();
		//Commonactions.isElementPresent(cp.getStyle_Active());
		//Commonactions.clickjs(cp.getStyle_Active());
		//ca.eleToBeClickable();
		//ca.eleToBeClickable();
		try{
		for(int i=0; i < 30; i++){
			ca.click(driver.findElement(By.xpath("//div[contains(@class,'Style')]//span[text()='+']/parent::div")));
		}}catch(Exception e){
			
		}
		Commonactions.isElementPresent(cp.getStyle_Size());
		Commonactions.clickjs(cp.getStyle_Size());
		Commonactions.isElementPresent(cp.getStyle_Brands());
		Commonactions.clickjs(cp.getStyle_Brands());
		Commonactions.isElementPresent(cp.getStyle_Features());
		Commonactions.clickjs(cp.getStyle_Features());
		Commonactions.isElementPresent(cp.getStyle_Functions());
		Commonactions.clickjs(cp.getStyle_Functions());
		Commonactions.isElementPresent(cp.getStyle_InAssortment());
		Commonactions.clickjs(cp.getStyle_InAssortment());
		Commonactions.isElementPresent(cp.getFood_assortment());
		Commonactions.clickjs(cp.getFood_assortment());
	    Commonactions.isElementPresent(cp.getStyle_IsAssortment());
		Commonactions.clickjs(cp.getStyle_IsAssortment());
		Commonactions.isElementPresent(cp.getStyle_EnableSKU());
		Commonactions.clickjs(cp.getStyle_EnableSKU());
		ca.eleToBeClickable();
		try{
		for(int i=0; i < 20; i++){
			ca.click(driver.findElement(By.xpath("//div[contains(@class,'Style')]//span[text()='-']/parent::div")));
		}}catch (Exception e) {
			// TODO: handle exception
		}
		Commonactions.isElementPresent(cp.getStyle_EnableStyle());
		Commonactions.clickjs(cp.getStyle_EnableStyle());
		ca.eleToBeClickable();
		try{

		ca.click(driver.findElement(By.xpath("//div[contains(@class,'Style')]//span[text()='-']/parent::div")));
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void noDatas(String value) throws Throwable {
		
		ca.eleToBeClickable();
		Commonactions.jsWaitForPageLoad();
		Commonactions.clickjs(cp.getNew_styleType_Btn());
		Commonactions.jsWaitForPageLoad();
		Commonactions.isElementPresent(pp.getConfig_styleType_ValueB());
		ca.insertText(pp.getConfig_styleType_ValueB(), value);
		Commonactions.jsWaitForPageLoad();
		Commonactions.clickjs(pp.getConfig_save_Btn());
		Commonactions.jsWaitForPageLoad();
		//Commonactions.isElementPresent(cp.getStyle_Active());
		//Commonactions.clickjs(cp.getStyle_Active());
		//ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getStyle_Colour());
		Commonactions.clickjs(cp.getStyle_Colour());
		ca.eleToBeClickable();
		try{
			for(int i=0; i < 30; i++){
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Style')]//span[text()='+']/parent::div")));
			}}catch(Exception e){
				
			}
			Commonactions.isElementPresent(cp.getStyle_Size());
			Commonactions.clickjs(cp.getStyle_Size());
			Commonactions.isElementPresent(cp.getStyle_Brands());
			Commonactions.clickjs(cp.getStyle_Brands());
			Commonactions.isElementPresent(cp.getStyle_Features());
			Commonactions.clickjs(cp.getStyle_Features());
			Commonactions.isElementPresent(cp.getStyle_Functions());
			Commonactions.clickjs(cp.getStyle_Functions());
			Commonactions.isElementPresent(cp.getStyle_InAssortment());
			Commonactions.clickjs(cp.getStyle_InAssortment());
			Commonactions.isElementPresent(cp.getFood_assortment());
			Commonactions.clickjs(cp.getFood_assortment());
		    Commonactions.isElementPresent(cp.getStyle_IsAssortment());
			Commonactions.clickjs(cp.getStyle_IsAssortment());
			Commonactions.isElementPresent(cp.getStyle_EnableSKU());
			Commonactions.clickjs(cp.getStyle_EnableSKU());
			ca.eleToBeClickable();
			try{
			for(int i=0; i < 20; i++){
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'Style')]//span[text()='-']/parent::div")));
			}}catch (Exception e) {
				// TODO: handle exception
			}
			Commonactions.isElementPresent(cp.getStyle_EnableStyle());
			Commonactions.clickjs(cp.getStyle_EnableStyle());
			ca.eleToBeClickable();
			try{

			ca.click(driver.findElement(By.xpath("//div[contains(@class,'Style')]//span[text()='-']/parent::div")));
			}catch (Exception e) {
				// TODO: handle exception
			}
	}

	

	public void standaloneMaterial(String value) throws Throwable {

		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getNew_material_TypeBtn());
		Commonactions.clickjs(cp.getNew_material_TypeBtn());
		Commonactions.isElementPresent(pp.getConfig_materialType_ValueA());
		ca.insertText(pp.getConfig_materialType_ValueA(), value);
		Commonactions.isElementPresent(pp.getConfig_material_DropDown());
		ca.click(pp.getConfig_material_DropDown());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("((//div[@data-csi-automation='field-MaterialType-Form-MaterialUsage'])[2]/div)[3]")));
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		Commonactions.clickjs(pp.getConfig_save_Btn());
		materialCheckBoxes();

	}

	public void structureMaterial(String value) throws Throwable {

		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getNew_material_TypeBtn());
		Commonactions.clickjs(cp.getNew_material_TypeBtn());
		Commonactions.isElementPresent(pp.getConfig_materialType_ValueB());
		ca.insertText(pp.getConfig_materialType_ValueB(), value);
		Commonactions.isElementPresent(pp.getConfig_material_DropDown());
		ca.click(pp.getConfig_material_DropDown());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("((//div[@data-csi-automation='field-MaterialType-Form-MaterialUsage'])[2]/div)[4]")));
		Commonactions.clickjs(pp.getConfig_save_Btn());
		materialCheckBoxes();

	}

	public void toolMaterial(String value) throws Throwable {

		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getNew_material_TypeBtn());
		Commonactions.clickjs(cp.getNew_material_TypeBtn());
		Commonactions.isElementPresent(pp.getConfig_materialType_ValueB());
		ca.insertText(pp.getConfig_materialType_ValueB(), value);
		Commonactions.isElementPresent(pp.getConfig_material_DropDown());
		ca.click(pp.getConfig_material_DropDown());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("((//div[@data-csi-automation='field-MaterialType-Form-MaterialUsage'])[2]/div)[5]")));
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		Commonactions.clickjs(pp.getConfig_save_Btn());
		materialCheckBoxes();

	}

	public void materialCheckBoxes() throws Throwable {

		Commonactions.isElementPresent(cp.getMaterial_Colour());
		Thread.sleep(1000);
		Commonactions.clickjs(cp.getMaterial_Colour());
		Commonactions.isElementPresent(cp.getMaterial_Active());
		Commonactions.clickjs(cp.getMaterial_Active());
		ca.eleToBeClickable();

		for(int i=0; i < 5; i++){
			ca.eleToBeClickable();
			ca.click(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='+']/parent::div")));
			if(cp.getMaterial_BOM().isDisplayed()){

				//	ca.click(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='+']/parent::div")));
				break;
			}}
		Commonactions.clickjs(cp.getMaterial_BOM());

		for(int i=0; i < 5; i++){
			ca.eleToBeClickable();
			ca.click(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='+']/parent::div")));
			if(cp.getMaterial_Routing().isDisplayed()){
				//	ca.click(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='+']/parent::div")));
				break;
			}}
		Commonactions.isElementPresent(cp.getMaterial_Routing());
		Commonactions.clickjs(cp.getMaterial_Routing());

		for(int i=0; i < 5; i++){
			ca.eleToBeClickable();
			ca.click(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='+']/parent::div")));
			if(cp.getMaterial_DataSheet().isDisplayed()){
				//	ca.click(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='+']/parent::div")));
				break;
			}}
		Commonactions.isElementPresent(cp.getMaterial_DataSheet());
		Commonactions.clickjs(cp.getMaterial_DataSheet());

		for(int i=0; i < 5; i++){
			ca.eleToBeClickable();
			ca.click(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='+']/parent::div")));
			if(cp.getMaterial_TestRun().isDisplayed()){
				//ca.click(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='+']/parent::div")));
				break;
			}}
		Commonactions.isElementPresent(cp.getMaterial_TestRun());
		Commonactions.clickjs(cp.getMaterial_TestRun());
		ca.eleToBeClickable();

		for(int i=0; i < 7; i++){
			ca.eleToBeClickable();
			ca.click(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='-']/parent::div")));
			if(cp.getMaterial_Highest_Cost().isDisplayed()){
				//	ca.click(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='-']/parent::div")));
				break;
			}}
		Commonactions.clickjs(cp.getMaterial_Highest_Cost());

		for(int i=0; i < 4; i++){
			ca.eleToBeClickable();
			ca.click(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='-']/parent::div")));
			if(cp.getMaterial_Default_Season().isDisplayed()){
				//ca.click(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='-']/parent::div")));
				break;
			}}
		Commonactions.isElementPresent(cp.getMaterial_Default_Season());
		Commonactions.clickjs(cp.getMaterial_Default_Season());

		for(int i=0; i < 4; i++){
			ca.eleToBeClickable();
			ca.click(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='-']/parent::div")));
			if(cp.getMaterial_EnableSKU().isDisplayed()){
				//	ca.click(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='-']/parent::div")));
				break;
			}}
		Commonactions.isElementPresent(cp.getMaterial_EnableSKU());
		Commonactions.clickjs(cp.getMaterial_EnableSKU());

		for(int i=0; i < 4; i++){
			ca.eleToBeClickable();
			ca.click(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='-']/parent::div")));
			if(cp.getMaterial_Size().isDisplayed()){
				//ca.click(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='-']/parent::div")));
				break;
			}}
		Commonactions.isElementPresent(cp.getMaterial_Size());
		Commonactions.clickjs(cp.getMaterial_Size());

		for(int i=0; i < 4; i++){
			ca.eleToBeClickable();
			ca.click(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='-']/parent::div")));
			if(cp.getMaterial_Allow_Coloured().isDisplayed()){
				//ca.click(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='-']/parent::div")));
				break;
			}}
		Commonactions.isElementPresent(cp.getMaterial_Allow_Coloured());
		Commonactions.clickjs(cp.getMaterial_Allow_Coloured());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='-']/parent::div")));
		ca.click(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='-']/parent::div")));

	}

	// int j;

	public void getActive() throws Throwable {

		List<WebElement> actives = driver.findElements(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])"));
		for (int i = 0; i < actives.size(); i++) {

			if(i==actives.size()-1){

				int j = 1+i;
				System.out.println(i+"&"+j);
				ca.eleToBeClickable();
				Commonactions.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+j+"]")));
				break;
			}


		}


	}

	public void getLookActive() throws Throwable {

		List<WebElement> actives = driver.findElements(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])"));
		for (int i = 0; i < actives.size(); i++) {

			if(i==actives.size()-1){

				int j = 1+i;
				int k = 1+j;
				System.out.println(i+"&"+j);
				ca.eleToBeClickable();
				Commonactions.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+k+"]")));
				break;
			}


		}


	}

	public void getSizeActive() throws Throwable{
		List<WebElement> actives = driver.findElements(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])"));
		int i=actives.size();
		System.out.println("size :"+i);
		int  j=i-1;
		int  k=i-2;
		int  l=i-3;
		Commonactions.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+i+"]")));
		ca.eleToBeClickable();
		Commonactions.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+j+"]")));
		ca.eleToBeClickable();
		Commonactions.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+k+"]")));
		ca.eleToBeClickable();
		Commonactions.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+l+"]")));



	}

	public void getThemeActive() throws Throwable{
		List<WebElement> actives = driver.findElements(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])"));
		int i=actives.size();
		System.out.println("size :"+i);
		int  i1=i+1;   
		int  j=i;
		int  k=i-1;
		int  l=i-2;
		Commonactions.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+i1+"]")));
		ca.eleToBeClickable();
		Commonactions.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+j+"]")));
		ca.eleToBeClickable();
		Commonactions.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+k+"]")));
		ca.eleToBeClickable();
		Commonactions.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+l+"]")));



	}

	public void getInspectionActive() throws Throwable{
		List<WebElement> actives = driver.findElements(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])"));
		int i=actives.size();
		System.out.println("size :"+i);
		int  j=i-1;
		int  k=i-2;
		int  l=i-3;
		int  m=i-4;
		try{
			ca.eleToBeClickable();
			ca.jsScrollPageDown(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+i+"]")));

		}catch (Exception e) {
			// TODO: handle exception

		}

		Commonactions.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+i+"]")));
		ca.eleToBeClickable();
		Commonactions.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+j+"]")));
		ca.eleToBeClickable();
		Commonactions.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+k+"]")));
		ca.eleToBeClickable();
		Commonactions.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+l+"]")));
		ca.eleToBeClickable();
		Commonactions.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+m+"]")));



	}

	public void getSpecActive() throws Throwable{
		List<WebElement> actives = driver.findElements(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])"));
		int i=actives.size();
		System.out.println("size :"+i);
		int  j=i-1;
		int  k=i-2;
		int  l=i-3;
		int  m=i-4;
		Commonactions.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+i+"]")));
		ca.eleToBeClickable();
		Commonactions.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+j+"]")));




	}

	public void getSpecBActive() throws Throwable{
		List<WebElement> actives = driver.findElements(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])"));
		int i=actives.size();
		System.out.println("size :"+i);
		int  j=i-1;
		int  k=i-2;
		int  l=i-3;
		int  m=i-4;
		Commonactions.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])[1]")));
		ca.eleToBeClickable();
		Commonactions.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])[2]")));




	}

	public void getTestActive() throws Throwable{
		List<WebElement> actives = driver.findElements(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])"));
		int i=actives.size();
		System.out.println("size :"+i);
		int  j=i-1;
		int  k=i-2;
		int  l=i-3;
		int  m=i-4;
		Commonactions.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+i+"]")));
		ca.eleToBeClickable();
		Commonactions.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+j+"]")));
		ca.eleToBeClickable();//ca.eleToBeClickable();ca.isElementPresent(element);
		Commonactions.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+k+"]")));



	}

	public void getStyleActive() throws Throwable{
		List<WebElement> actives = driver.findElements(By.xpath("(//div[@data-csi-act='Available:Child:Config:0']/input[@tabindex='0'])"));
		int i=actives.size();
		System.out.println("size :"+i);
		int  j=i-1;
		int  k=i-2;
		int  l=i-3;
		int  m=i-4;
		try{
			ca.eleToBeClickable();
			ca.jsScrollPageDown(driver.findElement(By.xpath("(//div[@data-csi-act='Available:Child:Config:0']/input[@tabindex='0'])["+i+"]")));

		}catch (Exception e) {
			// TODO: handle exception

		}

		Commonactions.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Available:Child:Config:0']/input[@tabindex='0'])["+i+"]")));
		ca.eleToBeClickable();//ca.eleToBeClickable();ca.isElementPresent(element);
		Commonactions.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Available:Child:Config:0']/input[@tabindex='0'])["+j+"]")));
		ca.eleToBeClickable();
		Commonactions.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Available:Child:Config:0']/input[@tabindex='0'])["+k+"]")));
		ca.eleToBeClickable();



	}

	@Given("User creates theme BOM type {string},{string}")
	public void user_creates_theme_BOM_type(String string, String string2) throws Throwable {

		Commonactions.isElementPresent(cp.getBOM_Types());
		Commonactions.clickjs(cp.getBOM_Types());
		Commonactions.isElementPresent(cp.getNew_BOM_Type_Btn());
		Commonactions.clickjs(cp.getNew_BOM_Type_Btn());
		Commonactions.isElementPresent(pp.getBOM_Type_Value());
		ca.insertText(pp.getBOM_Type_Value(), string);
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		Commonactions.clickjs(pp.getConfig_save_Btn());
		Commonactions.isElementPresent(cp.getBOM_FilterQuotesByColor());
		Commonactions.clickjs(cp.getBOM_FilterQuotesByColor());
		Commonactions.isElementPresent(cp.getBOM_LockThemePlacementList());
		Commonactions.clickjs(cp.getBOM_LockThemePlacementList());
		Commonactions.isElementPresent(cp.getBOM_expose());
		Commonactions.clickjs(cp.getBOM_expose());
		Commonactions.isElementPresent(pp.getOK_Btn());
		try{
			Commonactions.clickjs(pp.getOK_Btn());
			ca.eleToBeClickable();
		}catch (Exception e) {
			// TODO: handle exception
		}
		Commonactions.clickjs(cp.getBOM_AutPlaceTracking());
		ca.eleToBeClickable();
		//getActive();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(cp.getNew_BOM_Type_Btn());
		Commonactions.clickjs(cp.getNew_BOM_Type_Btn());
		Commonactions.isElementPresent(pp.getBOM_Type_Value());
		ca.insertText(pp.getBOM_Type_Value(), string2);
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		Commonactions.clickjs(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		getSpecBActive();


		System.out.println("Theme BOM created succesfully");

	}

	@And("User Creates FoodTypes and FoodlabelDatasheetvalues {string},{string}")
	public void user_Creates_FoodTypes_and_FoodlabelDatasheetvalues(String FType, String FLabel) throws Throwable 
	{
		String[] foodtype = FType.split(",");
		String[] foodlabel = FLabel.split(",");

		Commonactions.isElementPresent(cp.getFoodtypetab());
		ca.click(cp.getFoodtypetab());
		for(int i=0;i<foodtype.length;i++)
		{
			Commonactions.isElementPresent(cp.getNewfoodtypebtn());
			ca.click(cp.getNewfoodtypebtn());
			Commonactions.isElementPresent(cp.getFoodtypename());
			ca.insertText(cp.getFoodtypename(), foodtype[i]);
			ca.eleToBeClickable();
			cp.save();
			System.out.println("food type"+i+" is created");
			ca.eleToBeClickable();

//			try{
				Commonactions.isElementPresent(cp.getFoodactivechkbox());
				ca.click(cp.getFoodactivechkbox());
				Commonactions.isElementPresent(cp.getDatasheet());
				ca.click(cp.getDatasheet());
				ca.eleToBeClickable();
				Commonactions.isElementPresent(cp.getArtworkchkbox());
				ca.click(cp.getArtworkchkbox());
				Commonactions.isElementPresent(cp.getFoodlabelchkbox());
				ca.click(cp.getFoodlabelchkbox());
				Commonactions.isElementPresent(cp.getReviewchkbox());
				ca.click(cp.getReviewchkbox());
				Commonactions.isElementPresent(cp.getSpecificationchkbox());
				ca.click(cp.getSpecificationchkbox());
				Commonactions.isElementPresent(cp.getTestrunchkbox());
				ca.click(cp.getTestrunchkbox());
//			}
//			catch(Exception e)
//			{System.out.println("dependent chk box not listed");
//			}
		}
		driver.findElement(By.xpath("(//button[@aria-label='Scroll Right'])[3]")).click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(cp.getFoodlabeldatasheettab());
		ca.click(cp.getFoodlabeldatasheettab());
		for(int j=0;j<foodlabel.length;j++)
		{
			Commonactions.isElementPresent(cp.getFoodlabelsatasheetbtn());
			ca.click(cp.getFoodlabelsatasheetbtn());
			Commonactions.isElementPresent(cp.getFoodlabeltypename());
			ca.insertText(cp.getFoodlabeltypename(), foodlabel[j]);
			cp.save();
			System.out.println("food label"+j+" is created");
			ca.eleToBeClickable();
			Commonactions.isElementPresent(cp.getFoodlabelactivechkbox());
			ca.click(cp.getFoodlabelactivechkbox());
		}
		Commonactions.isElementPresent(cp.getFoodlabeldatasheet());
		ca.click(cp.getFoodlabeldatasheet());
		Commonactions.isElementPresent(cp.getNonecheckbox());
		ca.click(cp.getNonecheckbox());
		Commonactions.isElementPresent(cp.getFoodingredientchkbox());
		ca.click(cp.getFoodingredientchkbox());
		Commonactions.isElementPresent(cp.getFoodlabeldatasheettab());
		ca.click(cp.getFoodlabeldatasheettab());
		System.out.println("Food ingredient selected");

	}

	@Then("Navigate to Project Types and Create ProjectType {string}")
	public void Navigate_to_Project_Types_and_Create_ProjectType(String string)throws Throwable {
		String[] ProjectTypesNames;
		ProjectTypesNames=string.split(",");

		try{
            ca.eleToBeClickable();
            Commonactions.clickjs(driver.findElement(By.xpath("//button[@aria-label='Scroll Right']")));
        }catch(Exception e){
        }
        Commonactions.isElementPresent(cp.getprojecttypetab());
        ca.click(cp.getprojecttypetab());
        ca.eleToBeClickable();

        Commonactions.isElementPresent(cp.getnewpjcttypebtn());
        ca.click(cp.getnewpjcttypebtn());
        Commonactions.isElementPresent(cp.getpjcttypename());
        ca.insertText(cp.getpjcttypename(),ProjectTypesNames[0]);
        ca.save();
        Commonactions.jsWaitForPageLoad();
        ca.eleToBeClickable();
        Commonactions.isElementPresent(cp.getproductactivechkbox());
        Commonactions.clickjs(cp.getproductactivechkbox());
        ca.eleToBeClickable();
        System.out.println("Created 'All types ' project type");

        Commonactions.isElementPresent(cp.getnewpjcttypebtn());
        ca.click(cp.getnewpjcttypebtn());
        Commonactions.isElementPresent(cp.getpjcttypename());
        ca.insertText(cp.getpjcttypename(),ProjectTypesNames[1]);
        ca.save();
        ca.eleToBeClickable();
        Commonactions.isElementPresent(cp.getproductactivechkbox());
        ca.click(cp.getproductactivechkbox());
        ca.eleToBeClickable();
        Commonactions.isElementPresent(cp.getListProducttype());
        ca.click(cp.getListProducttype());
        Commonactions.isElementPresent(cp.getNonecheckbox());
        ca.click(cp.getNonecheckbox());
        Commonactions.isElementPresent(cp.getstylechkbox());
        ca.click(cp.getstylechkbox());
        ca.eleToBeClickable();
        ca.click(cp.getprojecttypetab());
        ca.eleToBeClickable();
        System.out.println("Created the 'Style' project type");

        Commonactions.isElementPresent(cp.getnewpjcttypebtn());
        ca.click(cp.getnewpjcttypebtn());
        Commonactions.isElementPresent(cp.getpjcttypename());
        ca.insertText(cp.getpjcttypename(),ProjectTypesNames[2]);
        ca.save();
        ca.eleToBeClickable();
        Commonactions.isElementPresent(cp.getproductactivechkbox());
        ca.click(cp.getproductactivechkbox());
        ca.eleToBeClickable();

        Commonactions.isElementPresent(cp.getListProducttype());
        ca.click(cp.getListProducttype());
        Commonactions.isElementPresent(cp.getNonecheckbox());
        ca.click(cp.getNonecheckbox());
        Commonactions.isElementPresent(cp.getfoodcheckbox());
        ca.click(cp.getfoodcheckbox());
        ca.eleToBeClickable();
        ca.click(cp.getprojecttypetab());
        ca.eleToBeClickable();
        System.out.println("Created the 'Food' project type");
	}			
}
