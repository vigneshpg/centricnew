package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class MaterialSpecificationPage extends Commonactions{
	
	public MaterialSpecificationPage() {
	
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[@data-csi-tab-name='Material Libraries']")
	private WebElement libraries;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Libraries']")
	private WebElement libraries1;
	
	@FindBy(xpath="//table[contains(@data-csi-context-parent,'SizeChartAdmin')]//td[@data-dojo-attach-event='onkeydown:_onArrowKeyDown']")
	private WebElement lib_drpdown;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'SizeChartAdmin')]//tr[@data-csi-act='NewLibMaterial']/td)[2]")
	private WebElement new_material_lib;
	
	@FindBy(xpath="//td[@data-csi-heading='Node Type::0']")
	private WebElement lib_node_type;
	
	@FindBy(xpath="//td[@data-csi-heading='Node Name::0']")
	private WebElement lib_node_value;
	
	@FindBy(xpath="//td[@data-csi-heading='Node Name::0']/a")
	private WebElement lib_node_name;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'LibMaterial')]//div[contains(text(),'New Material')])[1]")
	private WebElement material_btn;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'Material')]//div[contains(text(),'New Material')])[1]")
	private WebElement new_material_btn;
	
	@FindBy(xpath="//div[contains(@data-csi-automation,'field-Material')]/div[contains(@class,'Input')]/input[@role='textbox']")
	private WebElement material_value;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Material')]/div)/div/input)[1]")
	private WebElement material;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Material')]/div)/div/input)[2]")
	private WebElement material_code;
	
	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save'])[1]")
	private WebElement save_btn1;
	
	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save'])[2]")
	private WebElement save_btn2;
	
	@FindBy(xpath="//td[@data-csi-act='Node Name::0']/a[contains(text(),'Copy')]")
	private WebElement copy_name;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'Supplier')]/div)[1]")
	private WebElement Supplier_Value;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'Material-ProductColors')]//div/div)[2]")
	private WebElement new_colored_material_btn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'ColorMaterial')]/div)/div/input)[1]")
	private WebElement colored_material_value;
	
	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save & New'])")
	private WebElement saveAndNew_btn;
	
	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save'])[2]")
	private WebElement colorAndSize_save_btn;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'Size')]//div/div)[2]")
	private WebElement new_size_btn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'ProductSize')]/div)/div/input)[1]")
	private WebElement size_value;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'DimensionType')]/div)[3]/input)[1]")
	private WebElement dim_value;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'ProductSize')]/div)/input[@name='SizeCode']/preceding-sibling::input")
	private WebElement sortOrder;
	
	@FindBy(xpath="//span[text()='Supplier' or @data-csi-tab-name='Supplier']")
	private WebElement supplier;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'LibSourcing-Suppliers')]//div/div)[2]")
	private WebElement new_suppliier_Btn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Supplier')]/div)/div/input)[1]")
	private WebElement supplierValue;
	
	@FindBy(xpath="//input[@name='IsSupplier']")
	private WebElement isSupplier_ChkBox;
	
	@FindBy(xpath="//input[@name='IsAgent']")
	private WebElement isAgent_ChkBox;
	
	@FindBy(xpath="//div[@data-csi-act='IsWarehouse::0']/input")
	private WebElement isWareHouse_ChkBox;
	
	@FindBy(xpath="//span[text()='Samples' or @data-csi-tab-name='Samples']")
	private WebElement samples1;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'ProductSamples')]//div/div)[2]")
	private WebElement new_mat_Sample_Btn1;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'MaterialSample')]/div)/div/input)[1]")
	private WebElement mat_SampleValue1;
	
	@FindBy(xpath="(//tr[@data-csi-form-field='RequestSampleDimensions']//input[@role='textbox'])[1]")
	private WebElement color_sizeValue;
	
	@FindBy(xpath="//input[@name='RequestSampleCustomQuantity']")
	private WebElement qntyMatrix;
	
	@FindBy(xpath="(//table[contains(@class,'grid')]//th[text()='Quantity']//following-sibling::th//input[@tabindex='0'])[1]")
	private WebElement qntyValue;
	
	@FindBy(xpath="//td[@title='Blue']")
	private WebElement blue;
	
	@FindBy(xpath="//span[text()='SKUs' or @data-csi-tab-name='SKUs']")
	private WebElement SKU;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'ProductSKU')]//div/div)[2]")
	private WebElement new_mat_sku_Btn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'SKUMaterial')]/div)/div/input)[1]")
	private WebElement mat_sku_value;
	
	@FindBy(xpath="//input[@name='UseMatrix']")
	private WebElement useMatrix_chkBox;
	
	@FindBy(xpath="(//table[contains(@class,'grid')]//th[text()='Select All']//following-sibling::th//input[@tabindex='0'])[1]")
	private WebElement selectAll;
	
	@FindBy(xpath="(//table[contains(@class,'grid')]//th[text()='Select All']//following-sibling::th//input[@tabindex='0'])[2]")
	private WebElement selectParticular;
	
	@FindBy(xpath="//span[text()='Material Gallery' or @data-csi-tab-name='Material Gallery']")
	private WebElement material_gallery;
	
	@FindBy(xpath="//span[contains(@data-csi-automation,'ApparelViews-AllMaterialsGallery')]//span[text()='Views']")
	private WebElement MGViews;
	
	@FindBy(xpath="(//tr[contains(@data-csi-automation,'MaterialsGallery')]//td[text()='Manage Views'])")
	private WebElement MGMan_Views;
	
	@FindBy(xpath="(//select[@class='csiPreferenceSelect '])[1]/option")
	private WebElement MGSelectAll;
	
	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Add >'])[1]")
	private WebElement Add;
	
	@FindBy(xpath="((//label[contains(text(),'Filter')]//following-sibling::div)[1]/div[3]/input)[1]")
	private WebElement MGFilter;
	
	@FindBy(xpath="//span[text()='Material Security Groups' or @data-csi-tab-name='Material Security Groups']")
	private WebElement matSecGrps;
	
	@FindBy(xpath="//span[contains(@data-csi-automation,'MaterialSecurityGroups')]//span[text()='Views']")
	private WebElement MSGViews;
	
	@FindBy(xpath="(//tr[contains(@data-csi-automation,'MaterialSecurityGroup')]//td[text()='Manage Views'])")
	private WebElement MSG_manViews;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'MaterialSecurityGroups')]//div/div)[2]")
	private WebElement mat_SecGrp_Btn;
	
	@FindBy(xpath="//td[@data-csi-act='OnlyForMaterialTypes::0']")
	private WebElement onlyForMat;
	
	@FindBy(xpath="//label[text()='Fabric - Stanadlone']/preceding-sibling::div/input")
	private WebElement standalone_chkbox;
	
	@FindBy(xpath="//td[@data-csi-act='OnlyForMaterialTypes::0']/following-sibling::td[2]")
	private WebElement clickEmpty;
	
	@FindBy(xpath="//label[text()='Fabric - Structure Component']/preceding-sibling::div/input")
	private WebElement structure_Component;
	
	@FindBy(xpath="//label[text()='Fabric - Tool']/preceding-sibling::div/input")
	private WebElement tool;
	
	@FindBy(xpath="//span[text()='Colored Material' or @data-csi-tab-name='Colored Material']")
	private WebElement colored_mat;
	
	@FindBy(xpath="//span[text()='Material Samples' or @data-csi-tab-name='Material Samples']")
	private WebElement mat_samples;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'MaterialSamples')]//div/div)[2]")
	private WebElement new_mat_sample_Btn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'MaterialSample')]/div)/div/input)[1]")
	private WebElement mat_sample_Value;
	
	@FindBy(xpath="//div[contains(@class,'MaterialSamples')]//td[@data-csi-heading='Node Name::0']/div/a[1]")
	private WebElement click_materialSample;
	
	@FindBy(xpath="//span[text()='Promote Material']")
	private WebElement promote_material;
	
	@FindBy(xpath="//span[text()='Unlink']")
	private WebElement unLink;
	
	@FindBy(xpath="(//span[text()='Unlink'])[2]")
	private WebElement pp_unLink;
	
	@FindBy(xpath="//span[text()='Material SKUs' or @data-csi-tab-name='Material SKUs']")
	private WebElement mat_SKU;
	
	@FindBy(xpath="(//span[text()='Sourcing' or @data-csi-tab-name='Sourcing'])[2]")
	private WebElement sourcing;
	
	@FindBy(xpath="//span[text()='Supplier Quotes' or @data-csi-tab-name='Supplier Quotes']")
	private WebElement quotes;
	
	@FindBy(xpath="//span[text()='Supplier Requests' or @data-csi-tab-name='Supplier Requests']")
	private WebElement requests;
	
	@FindBy(xpath="//span[text()='Care Labels']")
	private WebElement care_label;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'CareSymbols')]//div/div)[2]")
	private WebElement new_care_label_btn;
	
	@FindBy(xpath="//td[@data-csi-act='SymbolType::0' or text()='Special Instructions']")
	private WebElement care_type;
	
	@FindBy(xpath="//span[text()='Composition Placements']")
	private WebElement comp_placement;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'CompositionPlacements')]//div/div)[2]")
	private WebElement new_comp_placement_Btn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'CompositionPlacement')]/div)/div/input)[1]")
	private WebElement comp_placement_value;
	
	@FindBy(xpath="//span[text()='Composition Materials']")
	private WebElement comp_materials;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'CompositionMaterials')]//div/div)[2]")
	private WebElement new_comp_material_Btn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Composition')]/div)/div/input)[1]")
	private WebElement comp_material_value;
	
	@FindBy(xpath="//span[text()='Placements']")
	private WebElement placement;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'Placement')]//div/div)[2]")
	private WebElement new_placement_Btn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Placement')]/div)/div/input)[1]")
	private WebElement placement_value;
	
	@FindBy(xpath="//span[text()='Product Symbols']")
	private WebElement product_symbols;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'ProductSymbols')]//div/div)[2]")
	private WebElement new_prodSymbol_Btn;
	
	@FindBy(xpath="//td[@data-csi-heading='LocalizedName::0']//following-sibling::td[@data-csi-act='SymbolType::0']")
	private WebElement prodSymbol_type;
	
	@FindBy(xpath="//span[text()='Languages']")
	private WebElement language;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'Language')]//div/div)[2]")
	private WebElement new_language_Btn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Language')]/div)/div/input)[1]")
	private WebElement lang_value;
	
	@FindBy(xpath="//span[text()='Product Structures']")
	private WebElement product_structure;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'ProductStructure')]//div/div)[2]")
	private WebElement new_prodStructure_Btn;
	
	@FindBy(xpath="//span[@data-csi-act='ActivateStructure' or text()='play_arrow']")
	private WebElement ActiveIcon;
	
	@FindBy(xpath="//td[@data-csi-heading='State::0']")
	private WebElement ActiveText;
	
	

	public WebElement getSupplier_Value() {
		return Supplier_Value;
	}

	public WebElement getIsWareHouse_ChkBox() {
		return isWareHouse_ChkBox;
	}

	public WebElement getLibraries() {
		return libraries;
	}

	public WebElement getLib_drpdown() {
		return lib_drpdown;
	}

	public WebElement getNew_material_lib() {
		return new_material_lib;
	}

	public WebElement getLib_node_type() {
		return lib_node_type;
	}

	public WebElement getLib_node_value() {
		return lib_node_value;
	}

	public WebElement getLib_node_name() {
		return lib_node_name;
	}

	public WebElement getMaterial_btn() {
		return material_btn;
	}

	public WebElement getMaterial_value() {
		return material_value;
	}

	public WebElement getMaterial() {
		return material;
	}

	public WebElement getMaterial_code() {
		return material_code;
	}

	public WebElement getSave_btn2() {
		return save_btn2;
	}
	
	public WebElement getSave_btn1() {
		return save_btn1;
	}

	public WebElement getNew_material_btn() {
		return new_material_btn;
	}

	public WebElement getCopy_name() {
		return copy_name;
	}

	public WebElement getNew_colored_material_btn() {
		return new_colored_material_btn;
	}

	public WebElement getColored_material_value() {
		return colored_material_value;
	}

	public WebElement getSaveAndNew_btn() {
		return saveAndNew_btn;
	}

	public WebElement getColorAndSize_save_btn() {
		return colorAndSize_save_btn;
	}

	public WebElement getNew_size_btn() {
		return new_size_btn;
	}

	public WebElement getSize_value() {
		return size_value;
	}
	
	public WebElement getDim_value() {
		return dim_value;
	}

	public WebElement getSortOrder() {
		return sortOrder;
	}

	public WebElement getSupplier() {
		return supplier;
	}

	public WebElement getNew_suppliier_Btn() {
		return new_suppliier_Btn;
	}

	public WebElement getSupplierValue() {
		return supplierValue;
	}

	public WebElement getIsSupplier_ChkBox() {
		return isSupplier_ChkBox;
	}

	public WebElement getSamples1() {
		return samples1;
	}

	public WebElement getNew_mat_Sample_Btn1() {
		return new_mat_Sample_Btn1;
	}

	public WebElement getMat_SampleValue1() {
		return mat_SampleValue1;
	}

	public WebElement getColor_sizeValue() {
		return color_sizeValue;
	}

	public WebElement getQntyMatrix() {
		return qntyMatrix;
	}

	public WebElement getQntyValue() {
		return qntyValue;
	}

	public WebElement getBlue() {
		return blue;
	}

	public WebElement getSKU() {
		return SKU;
	}

	public WebElement getNew_mat_sku_Btn() {
		return new_mat_sku_Btn;
	}

	public WebElement getMat_sku_value() {
		return mat_sku_value;
	}

	public WebElement getUseMatrix_chkBox() {
		return useMatrix_chkBox;
	}

	public WebElement getSelectAll() {
		return selectAll;
	}

	public WebElement getSelectParticular() {
		return selectParticular;
	}

	public WebElement getMaterial_gallery() {
		return material_gallery;
	}

	public WebElement getMGViews() {
		return MGViews;
	}

	public WebElement getMGMan_Views() {
		return MGMan_Views;
	}

	public WebElement getMGSelectAll() {
		return MGSelectAll;
	}

	public WebElement getAdd() {
		return Add;
	}

	public WebElement getMGFilter() {
		return MGFilter;
	}

	public WebElement getMatSecGrps() {
		return matSecGrps;
	}

	public WebElement getMSGViews() {
		return MSGViews;
	}

	public WebElement getMSG_manViews() {
		return MSG_manViews;
	}

	public WebElement getMat_SecGrp_Btn() {
		return mat_SecGrp_Btn;
	}

	public WebElement getOnlyForMat() {
		return onlyForMat;
	}

	public WebElement getStandalone_chkbox() {
		return standalone_chkbox;
	}

	public WebElement getClickEmpty() {
		return clickEmpty;
	}

	public WebElement getStructure_Component() {
		return structure_Component;
	}

	public WebElement getTool() {
		return tool;
	}

	public WebElement getColored_mat() {
		return colored_mat;
	}

	public WebElement getMat_samples() {
		return mat_samples;
	}

	public WebElement getNew_mat_sample_Btn() {
		return new_mat_sample_Btn;
	}

	public WebElement getMat_sample_Value() {
		return mat_sample_Value;
	}

	public WebElement getClick_materialSample() {
		return click_materialSample;
	}

	public WebElement getPromote_material() {
		return promote_material;
	}

	public WebElement getUnLink() {
		return unLink;
	}

	public WebElement getPp_unLink() {
		return pp_unLink;
	}

	public WebElement getMat_SKU() {
		return mat_SKU;
	}

	public WebElement getSourcing() {
		return sourcing;
	}

	public WebElement getQuotes() {
		return quotes;
	}

	public WebElement getRequests() {
		return requests;
	}

	public WebElement getCare_label() {
		return care_label;
	}

	public WebElement getNew_care_label_btn() {
		return new_care_label_btn;
	}

	public WebElement getCare_type() {
		return care_type;
	}

	public WebElement getComp_placement() {
		return comp_placement;
	}

	public WebElement getNew_comp_placement_Btn() {
		return new_comp_placement_Btn;
	}

	public WebElement getComp_placement_value() {
		return comp_placement_value;
	}

	public WebElement getComp_materials() {
		return comp_materials;
	}

	public WebElement getNew_comp_material_Btn() {
		return new_comp_material_Btn;
	}

	public WebElement getComp_material_value() {
		return comp_material_value;
	}

	public WebElement getPlacement() {
		return placement;
	}


	public WebElement getIsAgent_ChkBox() {
		return isAgent_ChkBox;
	}

	public WebElement getNew_placement_Btn() {
		return new_placement_Btn;
	}

	public WebElement getPlacement_value() {
		return placement_value;
	}

	public WebElement getProduct_symbols() {
		return product_symbols;
	}

	public WebElement getNew_prodSymbol_Btn() {
		return new_prodSymbol_Btn;
	}

	public WebElement getProdSymbol_type() {
		return prodSymbol_type;
	}

	public WebElement getLanguage() {
		return language;
	}

	public WebElement getNew_language_Btn() {
		return new_language_Btn;
	}

	public WebElement getLang_value() {
		return lang_value;
	}

	public WebElement getProduct_structure() {
		return product_structure;
	}

	public WebElement getNew_prodStructure_Btn() {
		return new_prodStructure_Btn;
	}

	public WebElement getActiveIcon() {
		return ActiveIcon;
	}

	public WebElement getActiveText() {
		return ActiveText;
	}
	
	
	

}
