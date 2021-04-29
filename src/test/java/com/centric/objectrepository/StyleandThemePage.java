package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class StyleandThemePage extends Commonactions{
	
	public StyleandThemePage() {
		PageFactory.initElements(Commonactions.driver, this);
	}
	
	@FindBy(xpath="//span[text()='Specification' or @data-csi-tab-name='Specification']")
	private WebElement Specification;
	
	@FindBy(xpath="//span[text()='Size Chart' or @data-csi-tab-name='Size Chart']")
	private WebElement SizeChart;
	
	@FindBy(xpath="(//span[text()='Dimensions' or @data-csi-tab-name='Dimensions'])[1]")
	private WebElement Dimensions;
	
	@FindBy(xpath="(//span[text()='Dimension Gallery' or @data-csi-tab-name='Dimension Gallery'])")
	private WebElement DimensionCards;
	
	@FindBy(xpath="(//span[text()='Increments' or @data-csi-tab-name='Increments'])[1]")
	private WebElement Increments;
	
	@FindBy(xpath="(//span[text()='Product Groups'])[1]")
	private WebElement productGrp;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'ProductGroups')]//div/div)[2]")
	private WebElement ProductGrpBtn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'ProductGroup')]/div)/div/input)[1]")
	private WebElement ProductGrpValue ;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Description')]/div)/div/input)[1]")
	private WebElement Description;
	
	@FindBy(xpath="//td//a[contains(text(),'PG - 01')]")
	private WebElement PG_Value;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'Dimension')]//div/div)[2]")
	private WebElement DimensionBtn;
	
	@FindBy(xpath="(//td[contains(text(),'A15E')]//preceding-sibling::td)[1]//input")
	private WebElement PG_1ChkBx;
	
	@FindBy(xpath="(//td[contains(text(),'A16S')]//preceding-sibling::td)[1]//input")
	private WebElement PG_2ChkBx;
	
	@FindBy(xpath="(//td[contains(text(),'A25FE')]//preceding-sibling::td)[1]//input")
	private WebElement PG_3ChkBx;
	
	@FindBy(xpath="(//td[contains(text(),'A26FS')]//preceding-sibling::td)[1]//input")
	private WebElement PG_4ChkBx;
	
	@FindBy(xpath="(//td[@data-csi-heading='ToleranceNegative::0'])[1]")
	private WebElement Tolerance;
	
	@FindBy(xpath="(//td[@data-csi-heading='Increments::0'])")
	private WebElement IncrementValue;
	
	@FindBy(xpath="//span[text()='home']")
	private WebElement home_Icon;
	
	@FindBy(xpath="//span[text()='Shape and Theme' or @data-csi-tab-name='Shape and Theme']")
	private WebElement ShapeAndTheme;
	
	@FindBy(xpath="(//span[text()='Shapes' or @data-csi-tab-name='Shapes'])[1]")
	private WebElement Shapes;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'Shapes')]//div/div)[2]")
	private WebElement ShapesBtn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Shape')]/div)/div/input)[1]")
	private WebElement Shapevalue;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'Seasons')]/div)[1]")
	private WebElement SeasonsValue;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'ThemeBOM')]/div)[1]")
	private WebElement BOM;
	
	@FindBy(xpath="//span[text()='Shape Masters' or @data-csi-tab-name='Shape Masters']")
	private WebElement ShapeMasters;
	
	@FindBy(xpath="//span[@data-csi-automation='plugin-ApparelViews-ShapeMasters-refresh']//span[@title='Refresh View']")
	private WebElement RefreshView;
	
	@FindBy(xpath="//td[@data-csi-heading='__Parent__::0']/preceding-sibling::td")
	private WebElement ShapeMasterName;
	
	@FindBy(xpath="//span[@data-csi-automation='plugin-ApparelViews-Shapes-refresh']//span[@title='Refresh View']")
	private WebElement RefreshViewShapes;
	
	@FindBy(xpath="((//a[text()='Circle Shape']/parent::td[@data-csi-act='Node Name::0'])/following-sibling::td/div/span[text()='content_copy'])[1]")
	private WebElement shapeCopy;
	
	@FindBy(xpath="((//a[text()='Square Shape']/parent::td[@data-csi-act='Node Name::0'])/following-sibling::td/div/span[text()='mode_edit'])[1]")
	private WebElement shapeedit;
	
	@FindBy(xpath="((//a[text()='Square Shape -edited']/parent::td[@data-csi-act='Node Name::0'])/following-sibling::td/div/span[text()='close'])[1]")
	private WebElement shapedelete;
	
	@FindBy(xpath="//span[text()='Shape Security Groups' or @data-csi-tab-name='Shape Security Groups']")
	private WebElement ShapeSecurityGroups;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'ShapeSecurityGroup')]//div/div)[2]")
	private WebElement ShapesecGrpBtn;
	
	@FindBy(xpath="//td[@data-csi-heading='__Parent__:Child:__Parent__:0']")
	private WebElement SG_Shape;
	
	@FindBy(xpath="(//tr/td[contains(@data-csi-act,'Node Name')]/a[text()='Circle Shape'])[2]")
	private WebElement ShapeName ;
	
	@FindBy(xpath="//td[@data-csi-heading='ShapeSizeRange::0']")
	private WebElement ShapeSizeRange;
	
	@FindBy(xpath="//span[text()='Styles' or @data-csi-tab-name='Styles']")
	private WebElement Shapestyles;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'ShapeStyles')]//div/div)[2]")
	private WebElement ShapeStyleBtn;
	
	@FindBy(xpath="(//td[contains(text(),'Accessories')]//preceding-sibling::td)[1]//input")
	private WebElement Style_1ChkBx;
	
	@FindBy(xpath="(//td[contains(text(),'Accessories - Only')]//preceding-sibling::td)[1]//input")
	private WebElement Style_2ChkBx;
	
	@FindBy(xpath="(//td[contains(text(),'Apparel')]//preceding-sibling::td)[1]//input")
	private WebElement Style_3ChkBx;
	
	@FindBy(xpath="((//a[text()='Accessories - No color and Size']/parent::td[@data-csi-heading='Node Name::0'])//following-sibling::td/div/span[text()='remove_circle_outline'])[1]")
	private WebElement Style_1Delete;
	
	@FindBy(xpath="((//a[text()='Accessories - Only Color']/parent::td[@data-csi-heading='Node Name::0'])//following-sibling::td/div/span[text()='remove_circle_outline'])[1]")
	private WebElement Style_2Delete;
	
	@FindBy(xpath="//span[text()='Samples' or @data-csi-tab-name='Samples']")
	private WebElement Samples;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'ShapeSamples')]//div/div)[2]")
	private WebElement SampleBtn;
	
	@FindBy(xpath="(//td[contains(text(),'small')]//preceding-sibling::td)//input")
	private WebElement SmallChkBx;
	
	@FindBy(xpath="(//div[text()='large']/parent::td//following-sibling::td/div//span[text()='mode_edit'])[1]")
	private WebElement Sample_Edit;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Sample')]/div)/div/input)[1]")
	private WebElement SampleValue;
	
	@FindBy(xpath="(//div[text()='large']/parent::td//following-sibling::td/div//span[text()='content_copy'])[1]")
	private WebElement Sample_Copy;
	
	@FindBy(xpath="(//div[text()='large']/parent::td//following-sibling::td/div//span[text()='close'])[2]")
	private WebElement Sample_Delete;
	
	@FindBy(xpath="//span[text()='Specification' or @data-csi-tab-name='Specification']")
	private WebElement Shape_Specification;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'SizeChart')]//div/div)[2]")
	private WebElement SizeChartBtn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'SizeChart')]/div)/div/input)[1]")
	private WebElement SizeChart_Value;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'Subtype')]/div)[1]")
	private WebElement SubType;
	
	@FindBy(xpath="(//div[contains(@class,'SizeChart')]//span[text()='+']/parent::div)[1]")
	private WebElement SizePluIcon;
	
	@FindBy(xpath="(//td[contains(@data-csi-heading,'SubrangeIncrement:Child:CurrentRevision')])[1]")
	private WebElement SCIncrement;
	
	@FindBy(xpath="//span[text()='Themes' or @data-csi-tab-name='Themes']")
	private WebElement Themes;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'Theme')]//div/div)[2]")
	private WebElement ThemeBtn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Theme')]/div)/div/input)[1]")
	private WebElement ThemeMasterValue;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Theme-Form-Node Name')]/div)/div/input)[2]")
	private WebElement ThemeValue;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'Theme')])[1]//tbody/tr/td[2]")
	private WebElement ThemeBtnExpand;
	
	@FindBy(xpath="//td[text()='New Theme from Style']")
	private WebElement StyleThemeBtn;
	
	@FindBy(xpath="(//td[contains(text(),'Apparel - Color and Size')]/preceding-sibling::td)[1]/div/input")
	private WebElement StyTheme_ChkBx;
	
	@FindBy(xpath="//td[text()='New Theme from Material']")
	private WebElement MaterialThemeBtn;
	
	@FindBy(xpath="(//td[contains(text(),'Rayon')]/preceding-sibling::td)[1]/div/input")
	private WebElement MatThemeChkBx;
	
	@FindBy(xpath="(//a[text()='Apparel - Color and Size']/parent::td//following-sibling::td/div//span[text()='content_copy'])[1]")
	private WebElement Theme_Copy;
	
	@FindBy(xpath="(//a[contains(text(),'Copied')]/parent::td//following-sibling::td/div//span[text()='mode_edit'])[1]")
	private WebElement Theme_Edit;
	
	@FindBy(xpath="(//a[contains(text(),'Copied')]/parent::td//following-sibling::td/div//span[text()='close'])[1]")
	private WebElement Theme_Delete;
	
	@FindBy(xpath="//span[text()='Theme Security Groups' or @data-csi-tab-name='Theme Security Groups']")
	private WebElement ThemeSecGrp;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'ThemeSecurity')]//div/div)[2]")
	private WebElement TSG_Btn;
	
	@FindBy(xpath="//span[text()='Theme Masters' or @data-csi-tab-name='Theme Masters']")
	private WebElement ThemeMaster;
	
	@FindBy(xpath="(//a[contains(text(),'Wild')]/parent::td//following-sibling::td[@data-csi-heading='__Parent__::0'])")
	private WebElement TSG_Value;
	
	@FindBy(xpath="//td[@data-csi-heading='Description::0']/preceding-sibling::td/a[contains(text(),'Apparel')]")
	private WebElement ThemeName;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'Theme-ColorColorway')]//div/div)[2]")
	private WebElement ThemeClrBtn;
	
	@FindBy(xpath="(//td[contains(text(),'Blue')]//following-sibling::td/div//span[text()='repeat'])[1]")
	private WebElement ThemeRepeatBtn;
	
	@FindBy(xpath="(//td[contains(text(),'Blue')]/preceding-sibling::td)[1]/div/input")
	private WebElement BlueChkBx;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'Theme-ColorColorway')])[1]//tbody/tr/td[2]")
	private WebElement ThemeClrExpandBtn;
	
	@FindBy(xpath="//td[text()='New Theme Colorway Colors from Styles']")
	private WebElement Style_ClrTheme;
	
	@FindBy(xpath="//td[text()='New from Color Specification']")
	private WebElement Style_ClrSpec;
	
	@FindBy(xpath="(//td[contains(text(),'GLASS')]/preceding-sibling::td)[1]/div/input")
	private WebElement GlassChkBx;
	
	@FindBy(xpath="(//a[contains(text(),'WHITE')]/parent::div/parent::td/preceding-sibling::td)[1]")
	private WebElement White_Value;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'ThemeProductAlternative')]//div/div)[2]")
	private WebElement ThemeProductBtn;
	
	@FindBy(xpath="(//td[contains(text(),'Italy')]//following-sibling::td/div//span[text()='content_copy'])[1]")
	private WebElement product_Copy;
	
	@FindBy(xpath="(//td[contains(text(),'Italy')]//following-sibling::td/div//span[text()='close'])[1]")
	private WebElement Product_Delete;
	
	@FindBy(xpath="(//td[contains(text(),'Vanilla')]//following-sibling::td/div//span[text()='close'])[1]")
	private WebElement Vanilla_Delete;
	
	@FindBy(xpath="//span[text()='Theme Colorway' or contains(@data-csi-tab-name,'Theme Colorway')]")
	private WebElement ThemeClrWay;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Documents' or text()='Documents']")
	private WebElement ThemeDocs;
	
	@FindBy(xpath="//span[text()='Style' or @data-csi-tab-name='Style']")
	private WebElement ThemeStyle;
	
	@FindBy(xpath="//span[text()='Style Product' or contains(@data-csi-tab-name,'Style Product')]")
	private WebElement ThemeStylePA;
	
	@FindBy(xpath="//span[text()='Style Gallery' or @data-csi-tab-name='Style Gallery']")
	private WebElement ThemeStyleGallery;
	
	@FindBy(xpath="//span[text()='Inspiration Styles' or @data-csi-tab-name='Inspiration Styles']")
	private WebElement ThemeInsStyle;
	
	@FindBy(xpath="//span[text()='Material' or @data-csi-tab-name='Material']")
	private WebElement ThemeMaterial;
	
	@FindBy(xpath="//span[text()='Theme Colorway Materials' or @data-csi-tab-name='Theme Colorway Materials']")
	private WebElement ThemeClrMat;
	
	@FindBy(xpath="//span[text()='Main Materials Gallery' or @data-csi-tab-name='Main Materials Gallery']")
	private WebElement ThemeMmatGal;
	
	@FindBy(xpath="//span[text()='Main Colored Materials Gallery' or @data-csi-tab-name='Main Colored Materials Gallery']")
	private WebElement ThemeMCMG;
	
	@FindBy(xpath="//span[text()='New Color Specifications Gallery' or @data-csi-tab-name='New Color Specifications Gallery']")
	private WebElement ThemeNCSG;
	
	@FindBy(xpath="//span[text()='Placements' or @data-csi-tab-name='Placements']")
	private WebElement ThemePlacements;
	
	@FindBy(xpath="//span[text()='Styles' or @data-csi-tab-name='Styles']")
	private WebElement ThemeStyles;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'Theme-Placements')])[1]//tbody/tr/td[2]")
	private WebElement ThemePlacExpBtn;
	
	@FindBy(xpath="//td[text()='New']")
	private WebElement CreateNew;
	
	@FindBy(xpath="(//td[@data-csi-act='Actual::0'])")
	private WebElement matCommon;
	
	@FindBy(xpath="//span[@data-csi-automation='plugin-Theme-Placements-refresh']//span[@title='Refresh View']")
	private WebElement RefreshPView;
	
	@FindBy(xpath="((//span[text()='Shoulder - placement']/parent::td[@data-csi-act='Node Name::0'])/following-sibling::td/div/span[text()='chat_bubble_outline'])[1]")
	private WebElement PlacementEdit;
	
	@FindBy(xpath="//div[@class='fr-element fr-view']/p")
	private WebElement EditCommValue;
	
	@FindBy(xpath="((//span[text()='Shoulder - placement']/parent::td[@data-csi-act='Node Name::0'])/following-sibling::td/div/span[text()='content_copy'])[1]")
	private WebElement PlaceCopy;
	
	@FindBy(xpath="((//span[text()='Shoulder - placement']/parent::td[@data-csi-act='Node Name::0'])/following-sibling::td/div/span[text()='close'])[2]")
	private WebElement PlaceDelete;
	
	@FindBy(xpath="//td[text()='New from Material']")
	private WebElement CreateNewfMat;
	
	@FindBy(xpath="(//td[contains(text(),'Accessories')]//preceding-sibling::td)[1]//input")
	private WebElement ThemeMatChkBx;
	
	@FindBy(xpath="((//div[@data-csi-act='MainMaterial::0'])/input)[2]")
	private WebElement mainMaterialBx;
	
	@FindBy(xpath="//td[text()='New from Theme Placement']")
	private WebElement CreateNfThemPlac;
	
	@FindBy(xpath="(//td[contains(text(),'Apparel - Color')]//preceding-sibling::td)[1]//input")
	private WebElement ThemePlaChkBx;
	
	@FindBy(xpath="(//td[contains(text(),'Shoulder')]//preceding-sibling::td)[1]//input")
	private WebElement ShoulderChkBx;
	
	@FindBy(xpath="(//td[text()='Select Section'])[2]")
	private WebElement CreateSelectSect;
	
	@FindBy(xpath="(//td[contains(text(),'fabric')]//preceding-sibling::td)[1]//input")
	private WebElement fabricChkBx;
	
	@FindBy(xpath="(//span[@class='attrPrimary']//parent::td/parent::tr/following-sibling::tr//td[contains(@class,'Button')])[2]")
	private WebElement Plus_Icon_Exp;
	
	@FindBy(xpath="(//td[contains(text(),'Copy')]//preceding-sibling::td)[1]//input")
	private WebElement Copy_ChkBx1;
	
	@FindBy(xpath="(//td[contains(text(),'Copy')]//preceding-sibling::td)[2]//input")
	private WebElement Copy_ChkBx2;
	
	@FindBy(xpath="(//a[text()='fabric section']/parent::td/following-sibling::td[@data-csi-heading='MPPColor::0'])[3]")
	private WebElement ColoredMatValue;
	
	@FindBy(xpath="(//a[text()='fabric section']/parent::div/parent::td/following-sibling::td[@data-csi-heading='MPPColor::0'])[3]")
	private WebElement ColoredMatValue1;
	
	@FindBy(xpath="(//td[text()='Create Section'])[2]")
	private WebElement CreateCreateSect;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'BOM')]/div)/div/input)[1]")
	private WebElement BomValue;
	
	@FindBy(xpath="(//span[@class='attrPrimary']//parent::td/parent::tr/following-sibling::tr//td[contains(@class,'Button')])[4]")
	private WebElement PlusAdoc_Exp;
	
	@FindBy(xpath="(//td[contains(text(),'Rayon')]//preceding-sibling::td)[1]//input")
	private WebElement Adhoc_ChkBx1;
	
	@FindBy(xpath="(//td[text()='Sections'])")
	private WebElement Sections;
	
	@FindBy(xpath="(//td[text()='Select Section'])[1]")
	private WebElement ActSelectSect;
	
	@FindBy(xpath="(//td[contains(text(),'All')]//preceding-sibling::td)[1]//input")
	private WebElement AllChkBx;
	
	@FindBy(xpath="(//span[@class='attrPrimary']//parent::td/parent::tr/following-sibling::tr//td[contains(@class,'Button')])[6]")
	private WebElement plusAll_Exp;
	
	@FindBy(xpath="(//td[text()='Create Section'])[1]")
	private WebElement ActCreateSect;
	
	@FindBy(xpath="(//span[@class='attrPrimary']//parent::td/parent::tr/following-sibling::tr//td[contains(@class,'Button')])[8]")
	private WebElement PlusCrea_Exp;
	
	@FindBy(xpath="(//td[text()='Arrange Section'])")
	private WebElement ActArrangeSect;
	
	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Close'])[1]")
	private WebElement CloseBtn;
	
	@FindBy(xpath="(//td[text()='Delete Section'])")
	private WebElement ActDeleteSect;
	
	@FindBy(xpath="(//td[contains(text(),'Theme Adhoc Section - 02')]//preceding-sibling::td)[1]//input")
	private WebElement DeleteTheChkBx;
	
	@FindBy(xpath="(//td[text()='Create Style BOMs'])")
	private WebElement CreateStyBOM;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'BOM')]/div)[1]")
	private WebElement BOM_Subtype;
	
	@FindBy(xpath="(//td[text()='Create and Update Style BOM Placements'])")
	private WebElement CreatUSBOMP;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'MassUpdateFromThemeForm-ColorColorways')]/div)[1]")
	private WebElement Update_Color;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'SynchBOMFromThemeForm-ColorColorways')]/div)[1]")
	private WebElement Update_Color1;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'IncludeBlankAttributes')]/input)[1]")
	private WebElement IncludeBlnkAttr;
	
	@FindBy(xpath="(//span[@class='attrPrimary']//parent::td/parent::tr/following-sibling::tr//td[contains(@class,'Button')])[8]")
	private WebElement PlusUpdate_Exp;
	
	@FindBy(xpath="//span[text()='Style' and @data-csi-tab-name='Style']")
	private WebElement ThemeStyleTab;
	
	@FindBy(xpath="//td[@data-csi-heading='ProductType::0']/preceding-sibling::td/a[contains(text(),'Apparel')]")
	private WebElement ThemeStyleName;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Specification' or text()='Specification']")
	private WebElement ThemeSpec;
	
	@FindBy(xpath="//span[@data-csi-tab-name='BOM' or text()='BOM']")
	private WebElement ThemeBOM;
	
	@FindBy(xpath="//td[@data-csi-heading='Subtype::0']/preceding-sibling::td/a[contains(text(),'Apparel')]")
	private WebElement ThemeBOMName;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Placements' or text()='Placements']")
	private WebElement ThemePartPlacements;
	
	@FindBy(xpath="(//span[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-refresh']//span[@title='Refresh View'])[2]")
	private WebElement RefreshBview;
	
	@FindBy(xpath="(//td[@data-csi-act='MPPRequest::0'])[1]")
	private WebElement MPPRequest1;
	
	@FindBy(xpath="(//td[@data-csi-act='MPPRequest::0'])[2]")
	private WebElement MPPRequest2;
	
	@FindBy(xpath="(//td[text()='Update existing Style BOM Placements'])")
	private WebElement CreatUeSBOMP;
	
	@FindBy(xpath="(//td[text()='Delete Style BOM Placements'])")
	private WebElement DeleteSBOMP;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'BomSect')]/div)[1]")
	private WebElement BomSect;
	
	@FindBy(xpath="((//span[text()='Neck - placement']/parent::td[@data-csi-act='Node Name::0'])/following-sibling::td/div/span[text()='close'])[1]")
	private WebElement neckDelete;
	
	@FindBy(xpath="//span[contains(@class,'ButonText') or text()='Select Style BOMs']")
	private WebElement SelectStyleBoms;
	
	@FindBy(xpath="(//td[contains(text(),'Neck')]//preceding-sibling::td)[1]//input")
	private WebElement neckChkBx;
	
	@FindBy(xpath="(//span//span[text()='Actions']/following-sibling::span)[3]")
	private WebElement ApproveActionsStyle;
	
	@FindBy(xpath="(//td[text()='Unlink From Theme'])")
	private WebElement UnlinkFTheme;
	
	@FindBy(xpath="(//tr[@data-csi-act='SynchBOMFromTheme']//td[text()='Synch BOM From Theme'])")
	private WebElement SynBOMFTheme;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'PlacementAttributes')]/input)[1]")
	private WebElement UpdatePlaAttr;

	public WebElement getSpecification() {
		return Specification;
	}

	public WebElement getSizeChart() {
		return SizeChart;
	}

	public WebElement getDimensions() {
		return Dimensions;
	}

	public WebElement getDimensionCards() {
		return DimensionCards;
	}

	public WebElement getIncrements() {
		return Increments;
	}

	public WebElement getProductGrp() {
		return productGrp;
	}

	public WebElement getProductGrpBtn() {
		return ProductGrpBtn;
	}

	public WebElement getProductGrpValue() {
		return ProductGrpValue;
	}

	public WebElement getDescription() {
		return Description;
	}

	public WebElement getPG_Value() {
		return PG_Value;
	}

	public WebElement getDimensionBtn() {
		return DimensionBtn;
	}

	public WebElement getPG_1ChkBx() {
		return PG_1ChkBx;
	}

	public WebElement getPG_2ChkBx() {
		return PG_2ChkBx;
	}

	public WebElement getPG_3ChkBx() {
		return PG_3ChkBx;
	}

	public WebElement getPG_4ChkBx() {
		return PG_4ChkBx;
	}

	public WebElement getTolerance() {
		return Tolerance;
	}

	public WebElement getIncrementValue() {
		return IncrementValue;
	}

	public WebElement getHome_Icon() {
		return home_Icon;
	}

	public WebElement getShapeAndTheme() {
		return ShapeAndTheme;
	}

	public WebElement getShapes() {
		return Shapes;
	}

	public WebElement getShapesBtn() {
		return ShapesBtn;
	}

	public WebElement getShapevalue() {
		return Shapevalue;
	}

	public WebElement getSeasonsValue() {
		return SeasonsValue;
	}

	public WebElement getShapeMasters() {
		return ShapeMasters;
	}

	public WebElement getRefreshView() {
		return RefreshView;
	}

	public WebElement getShapeMasterName() {
		return ShapeMasterName;
	}

	public WebElement getRefreshViewShapes() {
		return RefreshViewShapes;
	}

	public WebElement getShapeCopy() {
		return shapeCopy;
	}

	public WebElement getShapeedit() {
		return shapeedit;
	}

	public WebElement getShapedelete() {
		return shapedelete;
	}

	public WebElement getShapeSecurityGroups() {
		return ShapeSecurityGroups;
	}

	public WebElement getShapesecGrpBtn() {
		return ShapesecGrpBtn;
	}

	public WebElement getSG_Shape() {
		return SG_Shape;
	}

	public WebElement getShapeName() {
		return ShapeName;
	}

	public WebElement getShapeSizeRange() {
		return ShapeSizeRange;
	}

	public WebElement getShapestyles() {
		return Shapestyles;
	}

	public WebElement getShapeStyleBtn() {
		return ShapeStyleBtn;
	}

	public WebElement getStyle_1ChkBx() {
		return Style_1ChkBx;
	}

	public WebElement getStyle_2ChkBx() {
		return Style_2ChkBx;
	}

	public WebElement getStyle_3ChkBx() {
		return Style_3ChkBx;
	}

	public WebElement getStyle_1Delete() {
		return Style_1Delete;
	}

	public WebElement getStyle_2Delete() {
		return Style_2Delete;
	}

	public WebElement getSamples() {
		return Samples;
	}

	public WebElement getSampleBtn() {
		return SampleBtn;
	}

	public WebElement getSmallChkBx() {
		return SmallChkBx;
	}

	public WebElement getSample_Edit() {
		return Sample_Edit;
	}

	public WebElement getSampleValue() {
		return SampleValue;
	}

	public WebElement getSample_Copy() {
		return Sample_Copy;
	}

	public WebElement getSample_Delete() {
		return Sample_Delete;
	}

	public WebElement getShape_Specification() {
		return Shape_Specification;
	}

	public WebElement getSizeChartBtn() {
		return SizeChartBtn;
	}

	public WebElement getSizeChart_Value() {
		return SizeChart_Value;
	}

	public WebElement getSubType() {
		return SubType;
	}

	public WebElement getSizePluIcon() {
		return SizePluIcon;
	}

	public WebElement getSCIncrement() {
		return SCIncrement;
	}

	public WebElement getThemes() {
		return Themes;
	}

	public WebElement getThemeBtn() {
		return ThemeBtn;
	}

	public WebElement getThemeMasterValue() {
		return ThemeMasterValue;
	}

	public WebElement getThemeValue() {
		return ThemeValue;
	}

	public WebElement getThemeBtnExpand() {
		return ThemeBtnExpand;
	}

	public WebElement getStyleThemeBtn() {
		return StyleThemeBtn;
	}

	public WebElement getStyTheme_ChkBx() {
		return StyTheme_ChkBx;
	}

	public WebElement getMaterialThemeBtn() {
		return MaterialThemeBtn;
	}

	public WebElement getMatThemeChkBx() {
		return MatThemeChkBx;
	}

	public WebElement getTheme_Copy() {
		return Theme_Copy;
	}

	public WebElement getTheme_Edit() {
		return Theme_Edit;
	}

	public WebElement getTheme_Delete() {
		return Theme_Delete;
	}

	public WebElement getThemeSecGrp() {
		return ThemeSecGrp;
	}

	public WebElement getTSG_Btn() {
		return TSG_Btn;
	}

	public WebElement getThemeMaster() {
		return ThemeMaster;
	}

	public WebElement getTSG_Value() {
		return TSG_Value;
	}

	public WebElement getThemeName() {
		return ThemeName;
	}

	public WebElement getThemeClrBtn() {
		return ThemeClrBtn;
	}

	public WebElement getThemeRepeatBtn() {
		return ThemeRepeatBtn;
	}

	public WebElement getBlueChkBx() {
		return BlueChkBx;
	}

	public WebElement getThemeClrExpandBtn() {
		return ThemeClrExpandBtn;
	}

	public WebElement getStyle_ClrTheme() {
		return Style_ClrTheme;
	}

	public WebElement getStyle_ClrSpec() {
		return Style_ClrSpec;
	}

	public WebElement getGlassChkBx() {
		return GlassChkBx;
	}

	public WebElement getWhite_Value() {
		return White_Value;
	}

	public WebElement getThemeProductBtn() {
		return ThemeProductBtn;
	}

	public WebElement getProduct_Copy() {
		return product_Copy;
	}

	public WebElement getProduct_Delete() {
		return Product_Delete;
	}

	public WebElement getVanilla_Delete() {
		return Vanilla_Delete;
	}

	public WebElement getThemeClrWay() {
		return ThemeClrWay;
	}

	public WebElement getThemeDocs() {
		return ThemeDocs;
	}

	public WebElement getThemeStyle() {
		return ThemeStyle;
	}

	public WebElement getThemeStylePA() {
		return ThemeStylePA;
	}

	public WebElement getThemeStyleGallery() {
		return ThemeStyleGallery;
	}

	public WebElement getThemeInsStyle() {
		return ThemeInsStyle;
	}

	public WebElement getBOM() {
		return BOM;
	}

	public WebElement getThemeMaterial() {
		return ThemeMaterial;
	}

	public WebElement getThemeClrMat() {
		return ThemeClrMat;
	}

	public WebElement getThemeMmatGal() {
		return ThemeMmatGal;
	}

	public WebElement getThemeMCMG() {
		return ThemeMCMG;
	}

	public WebElement getThemeNCSG() {
		return ThemeNCSG;
	}

	public WebElement getThemePlacements() {
		return ThemePlacements;
	}

	public WebElement getThemePlacExpBtn() {
		return ThemePlacExpBtn;
	}

	public WebElement getCreateNew() {
		return CreateNew;
	}

	public WebElement getMatCommon() {
		return matCommon;
	}

	public WebElement getRefreshPView() {
		return RefreshPView;
	}

	public WebElement getPlacementEdit() {
		return PlacementEdit;
	}

	public WebElement getEditCommValue() {
		return EditCommValue;
	}

	public WebElement getPlaceCopy() {
		return PlaceCopy;
	}

	public WebElement getPlaceDelete() {
		return PlaceDelete;
	}

	public WebElement getCreateNewfMat() {
		return CreateNewfMat;
	}

	public WebElement getThemeMatChkBx() {
		return ThemeMatChkBx;
	}

	public WebElement getMainMaterialBx() {
		return mainMaterialBx;
	}

	public WebElement getCreateNfThemPlac() {
		return CreateNfThemPlac;
	}

	public WebElement getThemePlaChkBx() {
		return ThemePlaChkBx;
	}

	public WebElement getShoulderChkBx() {
		return ShoulderChkBx;
	}

	public WebElement getCreateSelectSect() {
		return CreateSelectSect;
	}

	public WebElement getFabricChkBx() {
		return fabricChkBx;
	}

	public WebElement getPlus_Icon_Exp() {
		return Plus_Icon_Exp;
	}

	public WebElement getCopy_ChkBx1() {
		return Copy_ChkBx1;
	}

	public WebElement getCopy_ChkBx2() {
		return Copy_ChkBx2;
	}

	public WebElement getColoredMatValue() {
		return ColoredMatValue;
	}
	
	public WebElement getColoredMatValue1() {
		return ColoredMatValue1;
	}

	public WebElement getCreateCreateSect() {
		return CreateCreateSect;
	}

	public WebElement getBomValue() {
		return BomValue;
	}

	public WebElement getPlusAdoc_Exp() {
		return PlusAdoc_Exp;
	}

	public WebElement getAdhoc_ChkBx1() {
		return Adhoc_ChkBx1;
	}

	public WebElement getSections() {
		return Sections;
	}

	public WebElement getActSelectSect() {
		return ActSelectSect;
	}

	public WebElement getAllChkBx() {
		return AllChkBx;
	}

	public WebElement getPlusAll_Exp() {
		return plusAll_Exp;
	}

	public WebElement getActCreateSect() {
		return ActCreateSect;
	}

	public WebElement getPlusCrea_Exp() {
		return PlusCrea_Exp;
	}

	public WebElement getActArrangeSect() {
		return ActArrangeSect;
	}

	public WebElement getCloseBtn() {
		return CloseBtn;
	}

	public WebElement getActDeleteSect() {
		return ActDeleteSect;
	}

	public WebElement getDeleteTheChkBx() {
		return DeleteTheChkBx;
	}

	public WebElement getCreateStyBOM() {
		return CreateStyBOM;
	}

	public WebElement getBOM_Subtype() {
		return BOM_Subtype;
	}

	public WebElement getCreatUSBOMP() {
		return CreatUSBOMP;
	}

	public WebElement getUpdate_Color() {
		return Update_Color;
	}
	
	public WebElement getUpdate_Color1() {
		return Update_Color1;
	}

	public WebElement getIncludeBlnkAttr() {
		return IncludeBlnkAttr;
	}

	public WebElement getPlusUpdate_Exp() {
		return PlusUpdate_Exp;
	}

	public WebElement getThemeStyleTab() {
		return ThemeStyleTab;
	}
	
	public WebElement getThemeStyles() {
		return ThemeStyles;
	}

	public WebElement getThemeStyleName() {
		return ThemeStyleName;
	}

	public WebElement getThemeSpec() {
		return ThemeSpec;
	}

	public WebElement getThemeBOM() {
		return ThemeBOM;
	}

	public WebElement getThemeBOMName() {
		return ThemeBOMName;
	}

	public WebElement getThemePartPlacements() {
		return ThemePartPlacements;
	}

	public WebElement getRefreshBview() {
		return RefreshBview;
	}

	public WebElement getMPPRequest1() {
		return MPPRequest1;
	}

	public WebElement getMPPRequest2() {
		return MPPRequest2;
	}

	public WebElement getCreatUeSBOMP() {
		return CreatUeSBOMP;
	}

	public WebElement getDeleteSBOMP() {
		return DeleteSBOMP;
	}

	public WebElement getBomSect() {
		return BomSect;
	}

	public WebElement getNeckDelete() {
		return neckDelete;
	}

	public WebElement getSelectStyleBoms() {
		return SelectStyleBoms;
	}

	public WebElement getNeckChkBx() {
		return neckChkBx;
	}

	public WebElement getApproveActionsStyle() {
		return ApproveActionsStyle;
	}

	public WebElement getUnlinkFTheme() {
		return UnlinkFTheme;
	}

	public WebElement getSynBOMFTheme() {
		return SynBOMFTheme;
	}

	public WebElement getUpdatePlaAttr() {
		return UpdatePlaAttr;
	}
	

	
	
}
