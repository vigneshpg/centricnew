package com.centric.objectrepository;

import com.centric.resources.Commonactions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThemeRulePage extends Commonactions {
	public ThemeRulePage()
	{
		PageFactory.initElements(Commonactions.driver, this);
	}

	@FindBy(xpath="//*[text()='Family-01']")
	private WebElement family1text;
	
	@FindBy(xpath="//*[text()='Family-02']")
	private WebElement family2text;

	@FindBy(xpath="//span[text()='Color Matching Types' or @data-csi-tab-name='Color Matching Types']")
	private WebElement colormatchingtype;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'ColorMatchingTypes-ToolbarNewAction')])[1]//tbody/tr/td[1]")
	private WebElement colormatchbtn;

	@FindBy(xpath="//div[contains(@data-csi-automation,'field-ColorMatchingType-Form-Node Name')]/div/div/input[1]")
	private WebElement colormatchtypevalue;

	@FindBy(xpath="//div[contains(@data-csi-automation,'field-ColorMatchingType-Form-InitialColorSpec')]/div[3]/input[1]")
	private WebElement colorspecification;

	@FindBy(xpath="//td[text()='Dummy']//following::span[text()='close'][1]")
	private WebElement deletedummy;

	@FindBy(xpath="//span[text()='Seasons' or @data-csi-tab-name='Seasons']")
	private WebElement seasontab;

	@FindBy(xpath="(//span[text()='Material' or @data-csi-tab-name='Material'])[1]")
	private WebElement materialTab;

	@FindBy(xpath="//div[contains(@data-csi-automation,'field-Season-Form-Node Name')]/div/div/input[1]")
	private WebElement seasonvalue;

	@FindBy(xpath="//div[contains(@data-csi-automation,'Subtype')]/div[3]/input")
	private WebElement Themesubtype;

	@FindBy(xpath="//div[contains(@data-csi-automation,'ThemeSeasons')]/div[3]/input")
	private WebElement Themeseason;

	@FindBy(xpath="//a[text()='Color Rule Master']")
	private WebElement colorrulemaster;

	@FindBy(xpath="//span[contains(@data-csi-automation,'ThemeMaster-ThemeMasterProperty-CustomViewAction')]//span[text()='Views']")
	private WebElement Thememasterview;

	@FindBy(xpath="//tr[contains(@data-csi-automation,'ThemeMaster-ThemeMasterProperty-CustomViewManage')]//td[text()='Manage Views']")
	private WebElement Thememastermanage;

	@FindBy(xpath="//option[text()='Color Matching Type']")
	private WebElement colormatchingtext;

	@FindBy(xpath="//td[contains(@data-csi-act,'ColorMatchingType')]")
	private WebElement colormatchingtypeicon;

	@FindBy(xpath="//a[text()='Color Rule Theme']")
	private WebElement colorruletheme;

	@FindBy(xpath="//span[text()='Theme' or @data-csi-tab-name='Theme']")
	private WebElement colortheme;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'Theme-ColorColorwaysTable-ToolbarNewAction')])[1]//tbody/tr/td[1]")
	private WebElement newthemecolorway;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'Theme-ColorColorwaysTable-ToolbarNewAction')])//tbody/tr/td[2]")
	private WebElement themecolorwayexpand;

	@FindBy(xpath="//tr[@data-csi-act='NewFromColorSpecification']//td[text()='New from Color Specification']")
	private WebElement newfromcolorspecification;

	@FindBy(xpath="(//td[contains(text(),'EGRET')]//preceding-sibling::td)//input")
	private WebElement Egretcolor;

	@FindBy(xpath="//span[text()='Material' or @data-csi-tab-name='Material']")
	private WebElement colormaterial;
	
	@FindBy(xpath="//span[text()='Properties' or @data-csi-tab-name='Properties']")
	private WebElement properties;
	
	@FindBy(xpath="//span[text()='Color Rules' or @data-csi-tab-name='Color Rules']")
	private WebElement colorrules;

	@FindBy(xpath="//a[contains(text(),'Linen')]")
	private WebElement Linenmaterial;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'Material-ProductColors-ToolbarNewActions')])//tbody/tr/td[2]")
	private WebElement newcolormaterialexpand;

	@FindBy(xpath="//tr[@data-csi-act='NewFromColorSpecification']//td[text()='New from Color Specification']")
	private WebElement newfromcolormaterial;

	@FindBy(xpath="(//td[text()='11-0104 VANILLA ICE']//preceding-sibling::td//input)[1]")
	private WebElement vanillacolor;

	@FindBy(xpath="//span[text()='Color Specifications' or @data-csi-tab-name='Color Specifications']")
	private WebElement colorspec;

	@FindBy(xpath="//span[contains(@data-csi-automation,'Material-Properties-CustomViewActions')]//span[text()='Views']")
	private WebElement Colorruleview;

	@FindBy(xpath="//tr[contains(@data-csi-automation,'Material-Properties-CustomViewManage')]//td[text()='Manage Views']")
	private WebElement colorrulemanage;

	@FindBy(xpath="//option[contains(text(),'Colored')]")
	private WebElement coloredtext;

	@FindBy(xpath="//option[text()='OK for Color Specification']")
	private WebElement okforcolor;

	@FindBy(xpath="//td[contains(@data-csi-heading,'OKColorSpecs')]//input[@aria-checked='true']")
	private WebElement colorspeccheckboxtrue;

	@FindBy(xpath="//td[contains(@data-csi-heading,'OKColorSpecs')]//input[@aria-checked='false']")
	private WebElement colorspeccheckboxfalse;

	@FindBy(xpath="(//td[contains(text(),'ANTIQUE WHITE')]//preceding-sibling::td//input)[1]")
	private WebElement ANTIQUEcolor;

	@FindBy(xpath="(//td[contains(text(),'PAPYRUS')]//preceding-sibling::td//input)[1]")
	private WebElement PAPYRUScolor;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'Theme-Placements-ToolbarNewActionsCreate')])//tbody/tr/td[2]")
	private WebElement createexpand;

	@FindBy(xpath="//tr[@data-csi-act='AggregateFromItems']//td[text()='New from Material']")
	private WebElement newfrommaterialcolor;

	@FindBy(xpath="(//td[contains(text(),'Linen')]//preceding-sibling::td//input)[1]")
	private WebElement Linenecheckbox;

	@FindBy(xpath="(//td[contains(text(),'Cotton - Ok')]//preceding-sibling::td//input)[1]")
	private WebElement CottonCheckbox;

	@FindBy(xpath="//span[text()='Generate Color Rules' or @data-csi-act='GenerateColorMatchingRules']")
	private WebElement generatecolorrule;

	@FindBy(xpath="//span[text()='Placements' or @data-csi-tab-name='Placements']")
	private WebElement placements;

	@FindBy(xpath="(//td[contains(@data-csi-heading,'MainMaterial')]//input)[1]")
	private WebElement mainmaterial1;

	@FindBy(xpath="(//td[contains(@data-csi-heading,'MainMaterial')]//input)[2]")
	private WebElement mainmaterial2;
	
	//   (//a[contains(text(),'Linen')]//following::td[contains(@data-csi-heading,'MPPColor::0')])[1]

	@FindBy(xpath="(//a[contains(text(),'Linen')]//following::td[contains(@data-csi-heading,'MPPColor::0')])[1]")
	private WebElement Linencolor;
	
	@FindBy(xpath="(//a[contains(text(),'Cotton')]//following::td[contains(@data-csi-heading,'MPPColor::0')])[1]")
	private WebElement CottonColor;

	@FindBy(xpath="(//a[contains(text(),'Cotton')]//following::td[contains(@data-csi-heading,'MPPColorSpec')])[1]")
	private WebElement Cottoncolorcolorspec;

	@FindBy(xpath="(//a[contains(text(),'Linen')]//following::td[contains(@data-csi-heading,'MPPColorSpec')])[1]")
	private WebElement Linencolorcolorspec;

	@FindBy(xpath="//td[text()='Contrast']//following::a[text()='Theme Color Rule Season']")
	private WebElement themecolorruleseason;
			
	@FindBy(xpath="//span[text()='Theme' or @data-csi-tab-name='Theme']")
	private WebElement themeruleseasonTheme;

	@FindBy(xpath="//span[text()='Color Rules' or @data-csi-tab-name='Color Rules']")
	private WebElement themeColorRules;

	@FindBy(xpath="//span[contains(@data-csi-automation,'Season-ColorMatchingRules-Actions')]//span[text()='Actions']")
	private WebElement colorruleaction;

	@FindBy(xpath="//td[contains(text(),'Generate Color Rules from Theme')]")
	private WebElement generatecolorruleaction;

	@FindBy(xpath="//span[text()='close']")
	private WebElement deletetheme;

	@FindBy(xpath="//span[text()='Material Family Color Rules' or @data-csi-tab-name='Material Family Color Rules']")
	private WebElement materialfamilycolorrule;

	@FindBy(xpath="//span[contains(@data-csi-automation,'Season-MaterialFamilyColorRules-Actions')]//span[text()='Actions']")
	private WebElement materialaction;

	@FindBy(xpath="//tr[contains(@data-csi-automation,'MaterialFamilyColorRules-GenerateColorMatchingRulesFromThemes')]//td[text()='Generate Color Rules from Themes']")
	private WebElement materialgeneratecolorrule;

	@FindBy(xpath="//span[contains(@data-csi-automation,'Theme-Placements-CustomViewActions')]//span[text()='Views']")
	private WebElement placementview;

	@FindBy(xpath="//tr[contains(@data-csi-automation,'Theme-Placements-CustomViewManage')]//td[text()='Manage Views']")
	private WebElement placementmanage;

	@FindBy(xpath="//option[contains(text(),'Material Family')]")
	private WebElement materialfamilytext;

	@FindBy(xpath="//td[text()='Colorway Matrix']")
	private WebElement colorwaymatrix;

	@FindBy(xpath="//option[text()='Applied Color Rule']")
	private WebElement appliedcolorrule;

	@FindBy(xpath="(//td[contains(@data-csi-heading,'MainMaterialGroup')])[1]")
	private WebElement materialgrp1;

	@FindBy(xpath="(//td[contains(@data-csi-heading,'MainMaterialGroup')])[2]")
	private WebElement materialgrp2;

	@FindBy(xpath="(//td[contains(@data-csi-heading,'MaterialFamily')])[1]")
	private WebElement materialfamily1;

	@FindBy(xpath="(//td[contains(@data-csi-heading,'MaterialFamily')])[2]")
	private WebElement materialfamily2;

	@FindBy(xpath="//*[contains(@data-csi-automation,'ColorMatchingRules-ApplyColorRulesToTheme')]")
	private WebElement applycolorrule;
	
	@FindBy(xpath="(//td[contains(text(),'Color Rule Theme')]//preceding-sibling::td//input)[1]")
	private WebElement colorulecheckbox;

	@FindBy(xpath="//span[contains(@data-csi-automation,'Theme-Placements-Action')]//span[text()='Actions']")
	private WebElement placementaction;

	@FindBy(xpath="//td[contains(text(),'Apply Color Rules')]")
	private WebElement placementapplycolorrules;

	@FindBy(xpath="//span[text()='Specification' or @data-csi-tab-name='Specification']")
	private WebElement themecolorspecificationtab;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'Season-MaterialAvailability-ToolbarNewAction')])[1]//tbody/tr/td[1]")
	private WebElement colorAddMaterial;

	@FindBy(xpath="(//td[contains(text(),'Polyster')]//preceding-sibling::td//input)[1]")
	private WebElement Polystercheckbox;

	@FindBy(xpath="//td[contains(text(),'Generate Color Rules from Availability')]")
	private WebElement generatecolorrulefromavailability;

	@FindBy(xpath="//div[contains(@data-csi-automation,'GenerateColorMatchingRulesFromAvailabilityForm-MatchingTypes')]//span")
	private WebElement matchingtype;

	@FindBy(xpath="//label[contains(text(),'All')]//parent::div/div/input")
	private WebElement Allvalue;

	@FindBy(xpath="(//td[contains(@data-csi-act,'Color:Child:MaterialFamilyColorRules')])[1]")
	private WebElement MaterialFamilyColorRule1;

	@FindBy(xpath="(//td[contains(@data-csi-act,'State:Child:MaterialFamilyColorRules')])[1]")
	private WebElement MaterialFamilyApprove1;
	
	@FindBy(xpath="(//td[contains(@data-csi-act,'State:Child:MaterialFamilyColorRules')])[2]")
	private WebElement MaterialFamilyApprove2;

	@FindBy(xpath="//span[contains(@data-csi-automation,'AllMaterials')]//span[text()='Views']")
	private WebElement mainmaterialview;

	@FindBy(xpath="(//tr[contains(@data-csi-automation,'AllMaterials')]//td[text()='Manage Views'])")
	private WebElement mainmaterialmanage;

	@FindBy(xpath="//option[contains(text(),'Main Material')]")
	private WebElement mainmaterial;

	@FindBy(xpath="(//a[contains(text(),'Cotton - Ok')]//following::div[@data-csi-act='MainMaterial::0'])[1]")
	private WebElement cottonmainmaterial;

	@FindBy(xpath="(//a[contains(text(),'Linen')]//following::div[@data-csi-act='MainMaterial::0'])[1]")
	private WebElement linenmainmaterial;

	@FindBy(xpath="(//a[contains(text(),'Polyster')]//following::div[@data-csi-act='MainMaterial::0'])[1]")
	private WebElement polystermainmaterial;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'MaterialAvailability-ToolbarNewAction')])[1]//tbody/tr/td[1]")
	private WebElement addmaterialbtn;

	@FindBy(xpath="//span[@data-csi-automation='plugin-Season-MaterialAvailability-refresh']")
	private WebElement materialrefresh;

	public WebElement getFamily1text() {
		return family1text;
	}

	public WebElement getFamily2text() {
		return family2text;
	}

	public WebElement getColormatchingtype() {
		return colormatchingtype;
	}

	public WebElement getColormatchbtn() {
		return colormatchbtn;
	}

	public WebElement getColormatchtypevalue() {
		return colormatchtypevalue;
	}

	public WebElement getColorspecification() {
		return colorspecification;
	}

	public WebElement getDeletedummy() {
		return deletedummy;
	}

	public WebElement getSeasontab() {
		return seasontab;
	}

	public WebElement getSeasonvalue() {
		return seasonvalue;
	}

	public WebElement getThemesubtype() {
		return Themesubtype;
	}

	public WebElement getThemeseason() {
		return Themeseason;
	}

	public WebElement getColorrulemaster() {
		return colorrulemaster;
	}

	public WebElement getThememasterview() {
		return Thememasterview;
	}

	public WebElement getThememastermanage() {
		return Thememastermanage;
	}

	public WebElement getColormatchingtext() {
		return colormatchingtext;
	}

	public WebElement getColormatchingtypeicon() {
		return colormatchingtypeicon;
	}

	public WebElement getColorruletheme() {
		return colorruletheme;
	}

	public WebElement getColortheme() {
		return colortheme;
	}

	public WebElement getNewthemecolorway() {
		return newthemecolorway;
	}

	public WebElement getThemecolorwayexpand() {
		return themecolorwayexpand;
	}

	public WebElement getNewfromcolorspecification() {
		return newfromcolorspecification;
	}

	public WebElement getEgretcolor() {
		return Egretcolor;
	}

	public WebElement getColormaterial() {
		return colormaterial;
	}
	
	public WebElement getProperties() {
		return properties;
	}

	public WebElement getColorrules() {
		return colorrules;
	}

	public WebElement getLinenmaterial() {
		return Linenmaterial;
	}

	public WebElement getNewcolormaterialexpand() {
		return newcolormaterialexpand;
	}

	public WebElement getNewfromcolormaterial() {
		return newfromcolormaterial;
	}

	public WebElement getVanillacolor() {
		return vanillacolor;
	}

	public WebElement getColorspec() {
		return colorspec;
	}

	public WebElement getColorruleview() {
		return Colorruleview;
	}

	public WebElement getColorrulemanage() {
		return colorrulemanage;
	}

	public WebElement getColoredtext() {
		return coloredtext;
	}

	public WebElement getOkforcolor() {
		return okforcolor;
	}

	public WebElement getColorspeccheckboxtrue() {
		return colorspeccheckboxtrue;
	}

	public WebElement getColorspeccheckboxfalse() {
		return colorspeccheckboxfalse;
	}

	public WebElement getANTIQUEcolor() {
		return ANTIQUEcolor;
	}

	public WebElement getPAPYRUScolor() {
		return PAPYRUScolor;
	}

	public WebElement getCreateexpand() {
		return createexpand;
	}

	public WebElement getNewfrommaterialcolor() {
		return newfrommaterialcolor;
	}

	public WebElement getLinenecheckbox() {
		return Linenecheckbox;
	}

	public WebElement getCottonCheckbox() {
		return CottonCheckbox;
	}

	public WebElement getGeneratecolorrule() {
		return generatecolorrule;
	}

	public WebElement getPlacements() {
		return placements;
	}

	public WebElement getMainmaterial1() {
		return mainmaterial1;
	}

	public WebElement getMainmaterial2() {
		return mainmaterial2;
	}

	public WebElement getLinencolor() {
		return Linencolor;
	}

	public WebElement getCottonColor() {
		return CottonColor;
	}

	public WebElement getLinencolorcolorspec() {
		return Linencolorcolorspec;
	}

	public WebElement getCottoncolorcolorspec() {
		return Cottoncolorcolorspec;
	}

	public WebElement getThemecolorruleseason() {
		return themecolorruleseason;
	}

	public WebElement getThemeruleseasonTheme() {
		return themeruleseasonTheme;
	}

	public WebElement getThemeColorRules() {
		return themeColorRules;
	}

	public WebElement getColorruleaction() {
		return colorruleaction;
	}

	public WebElement getGeneratecolorruleaction() {
		return generatecolorruleaction;
	}

	public WebElement getDeletetheme() {
		return deletetheme;
	}

	public WebElement getMaterialfamilycolorrule() {
		return materialfamilycolorrule;
	}

	public WebElement getMaterialaction() {
		return materialaction;
	}

	public WebElement getMaterialgeneratecolorrule() {
		return materialgeneratecolorrule;
	}

	public WebElement getPlacementview() {
		return placementview;
	}

	public WebElement getPlacementmanage() {
		return placementmanage;
	}

	public WebElement getMaterialfamilytext() {
		return materialfamilytext;
	}

	public WebElement getColorwaymatrix() {
		return colorwaymatrix;
	}

	public WebElement getAppliedcolorrule() {
		return appliedcolorrule;
	}

	public WebElement getMaterialgrp1() {
		return materialgrp1;
	}

	public WebElement getMaterialgrp2() {
		return materialgrp2;
	}

	public WebElement getMaterialfamily1() {
		return materialfamily1;
	}

	public WebElement getMaterialfamily2() {
		return materialfamily2;
	}

	public WebElement getApplycolorrule() {
		return applycolorrule;
	}

	public WebElement getColorulecheckbox() {
		return colorulecheckbox;
	}

	public WebElement getPlacementaction() {
		return placementaction;
	}

	public WebElement getPlacementapplycolorrules() {
		return placementapplycolorrules;
	}

	public WebElement getThemecolorspecificationtab() {
		return themecolorspecificationtab;
	}

	public WebElement getColorAddMaterial() {
		return colorAddMaterial;
	}

	public WebElement getPolystercheckbox() {
		return Polystercheckbox;
	}

	public WebElement getGeneratecolorrulefromavailability() {
		return generatecolorrulefromavailability;
	}

	public WebElement getMatchingtype() {
		return matchingtype;
	}

	public WebElement getAllvalue() {
		return Allvalue;
	}

	public WebElement getMaterialTab() {
		return materialTab;
	}

	public WebElement getMaterialFamilyColorRule1() {
		return MaterialFamilyColorRule1;
	}

	public WebElement getMaterialFamilyApprove1() {
		return MaterialFamilyApprove1;
	}

	public WebElement getMaterialFamilyApprove2() {
		return MaterialFamilyApprove2;
	}

	public WebElement getMainmaterialview() {
		return mainmaterialview;
	}

	public WebElement getMainmaterialmanage() {
		return mainmaterialmanage;
	}

	public WebElement getMainmaterial() {
		return mainmaterial;
	}

	public WebElement getCottonmainmaterial() {
		return cottonmainmaterial;
	}

	public WebElement getLinenmainmaterial() {
		return linenmainmaterial;
	}

	public WebElement getPolystermainmaterial() {
		return polystermainmaterial;
	}

	public WebElement getAddmaterialbtn() {
		return addmaterialbtn;
	}

	public WebElement getMaterialrefresh() {
		return materialrefresh;
	}

	
}