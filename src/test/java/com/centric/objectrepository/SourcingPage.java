package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class SourcingPage  extends Commonactions{

	public SourcingPage() {
		PageFactory.initElements(Commonactions.driver, this);
	}

	@FindBy(xpath="(//div[@data-csi-automation='field-SupplierReview-Form-Supplier']//div/input)[3]")
	private WebElement supplierValue1;
	
	@FindBy(xpath="//div[contains(@class,'Shipment')]//span[text()='+']/parent::div")
	private WebElement shipmentPlus;

	@FindBy(xpath="//span[text()='Setup' or @data-csi-tab-name='Setup']")
	private WebElement Setup;

	@FindBy(xpath="(//span[text()='Capabilities'])[1]")
	private WebElement capability;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'SourcingCapabilities')]//div/div)[2]")
	private WebElement NewCapabilityBtn;

	@FindBy(xpath="//td[@data-csi-heading='For::0']")
	private WebElement CapFor;

	@FindBy(xpath="//td[text()='Shipping Port']//following-sibling::td[contains(@class,'action')]/div/span[text()='content_copy']")
	private WebElement copy_shipping;

	@FindBy(xpath="(//td[text()='Shipping Port']//following-sibling::td[contains(@class,'extra-column')])[1]")
	private WebElement cap_extacolumn;

	@FindBy(xpath="//td[text()='Factory']//following-sibling::td[contains(@class,'action')]/div/span[text()='content_copy']")
	private WebElement copy_factory;

	@FindBy(xpath="//a[contains(text(),'COPY')]/parent::td//following-sibling::td[text()='Factory']//following-sibling::td/div/span[@data-csi-act='Delete']")
	private WebElement delete_factory ;

	@FindBy(xpath="(//span[text()='Operation Groups'])[1]")
	private WebElement OperationGroup;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'RoutingGroups')]//div/div)[2]")
	private WebElement newOGroupBtn;

	@FindBy(xpath="(//span[text()='Operation Group'])[3]")
	private WebElement OG_extracolumn;

	@FindBy(xpath="(//td[@data-csi-heading='RoutingGroup::0'])")
	private WebElement OperatingGroup1;

	@FindBy(xpath="(//td[@data-csi-heading='RoutingGroup::0'])[4]")
	private WebElement OperatingGroup2;

	@FindBy(xpath="(//span[text()='Sub Routings'])[1]")
	private WebElement sub_Routing ;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'SubRoutings')]//div/div)[2]")
	private WebElement newsubRoutingBtn;

	@FindBy(xpath="((//div[contains(@data-csi-automation,'SubRouting')]/div)/div/input)[1]")
	private WebElement subRoutingvalue;

	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save & Go'])[1]")
	private WebElement saveAndGoBtn;

	@FindBy(xpath="//div[@data-csi-act='Active:Child:__Parent__:0']/input")
	private WebElement Activechkbox;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'placeholder-SubRoutingRevision-Items-ActionsNew')]//td)[1]")
	private WebElement AddCapability;

	@FindBy(xpath="(//td[text()='Supplier']//preceding-sibling::td)[1]//input")
	private WebElement SupplierchkBox;

	@FindBy(xpath="(//td[text()='Factory']//preceding-sibling::td)[1]//input")
	private WebElement FactorychkBox;

	@FindBy(xpath="(//td[text()='Shipping Port']//preceding-sibling::td)[1]//input")
	private WebElement ShippingPortChkBox;

	@FindBy(xpath="((//span[text()='Actions'])//following-sibling::span)[1]")
	private WebElement ApproveActions;
	
	@FindBy(xpath="((//a[text()='MAKE Subrouting']/parent::td[@data-csi-act='Node Name::0'])/following-sibling::td/div/span[text()='check_circle'])[1]")
	private WebElement ApproveActionsSR;
	
	@FindBy(xpath="((//a[contains(text(),'Sourcing')]/parent::td[@data-csi-act='Node Name::0'])/following-sibling::td/div/span[text()='check_circle'])[1]")
	private WebElement ApproveActionsRT;

	@FindBy(xpath="(//td[text()='Approve'])")
	private WebElement Approve;
	
	@FindBy(xpath="((//tr[contains(@data-csi-automation,'plugin-TestRun-Breadcrumb-Approve')])//td[text()='Approve'])[3]")
	private WebElement ApproveTestRun;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'placeholder-SubRoutingRevision-Items-ActionsNew')]//td)[2]")
	private WebElement AddCapabilityDown;

	@FindBy(xpath="//td[contains(text(),'Add Sub Routing')]")
	private WebElement AddSubRouting;

	@FindBy(xpath="(//td[@data-csi-heading='Active:Child:__Parent__:0']//preceding-sibling::td)[1]//input")
	private WebElement ApprovedChkBox;

	@FindBy(xpath="(//span[text()='refresh'])[1]")
	private WebElement SRrefresh;

	@FindBy(xpath="(//table[@data-csi-automation='actionRow-SubRoutingRevision-Items-root']//td)[2]")
	private WebElement plusIcondown;

	@FindBy(xpath="//td[contains(text(),'New Divider')]")
	private WebElement divider;

	@FindBy(xpath="//td[@data-csi-heading='Actual::0']//following-sibling::td[contains(@class,'extra-column')]")
	private WebElement Sr_extracolumn;

	@FindBy(xpath="//td[contains(text(),'New Special')]")
	private WebElement special;

	@FindBy(xpath="(//span[text()='Countries'])[1]")
	private WebElement Countries;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'Countries')]//div/div)[2]")
	private WebElement NewCountriesBtn;

	@FindBy(xpath="//td[@data-csi-heading='Region::0']//following-sibling::td[contains(@class,'extra-column')]")
	private WebElement Cntry_extraColumn;

	@FindBy(xpath="//td[@data-csi-heading='Code::0']")
	private WebElement CntryCode;

	@FindBy(xpath="//td[@data-csi-heading='Region::0']")
	private WebElement Region;

	@FindBy(xpath="(//span[text()='Sales Region Specs'])[1]")
	private WebElement salesRegionSpecs;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'ProductSalesRegionSpecs')]//div/div)[2]")
	private WebElement newSalesReginBtn;

	@FindBy(xpath="((//div[contains(@data-csi-automation,'ProductSalesRegionSpec')]/div)/div/input)[1]")
	private WebElement salesRegionValue;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'SellingCountries')]/div)[1]")
	private WebElement sellingcntryValue;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'SecondarySalesRegions')]/div)[1]")
	private WebElement SecondarySRValue ;

	@FindBy(xpath="//span[text()='HTS Codes']")
	private WebElement HTSCode;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'plugin-SourcingViews-DutyRates-ToolbarNewActions')]//div/div)[2]")
	private WebElement NewHTSCodeBtn;

	@FindBy(xpath="(//td[@data-csi-act='CountryFrom::0'])")
	private WebElement FromCountry;

	@FindBy(xpath="(//td[@data-csi-act='CountryTo::0'])")
	private WebElement ToCountry;

	@FindBy(xpath="//span[text()='content_copy']")
	private WebElement copy;

	@FindBy(xpath="(//td[@data-csi-act='Description::0'])")
	private WebElement Description;

	@FindBy(xpath="(//td[@data-csi-act='DutyPct::0'])")
	private WebElement Duty;

	@FindBy(xpath="//td[@data-csi-heading='MaxWeightLbs::0']//following-sibling::td[contains(@class,'extra-column')]")
	private WebElement SC_extraColumn;

	@FindBy(xpath="//td[@data-csi-act='TaxId::0']")
	private WebElement TaxId;

	@FindBy(xpath="//td[@data-csi-act='TaxId::0']//following-sibling::td[contains(@class,'extra-column')]")
	private WebElement SP_extraColumn;

	@FindBy(xpath="((//td[@data-csi-act='TaxId::0'])/following-sibling::td/div/span[text()='content_copy'])[1]")
	private WebElement SP_Copy ;

	@FindBy(xpath="//a[contains(text(),'COPY')]//parent::td//following-sibling::td/div/span[text()='close']")
	private WebElement SP_Delete ;

	@FindBy(xpath="//td[@data-csi-act='PortOfOrigin::0']")
	private WebElement origin;

	@FindBy(xpath="//td[@data-csi-act='PortOfDestination::0']")
	private WebElement Destination;

	@FindBy(xpath="//td[@data-csi-act='Container::0']")
	private WebElement container;

	@FindBy(xpath="//span[contains(@data-csi-automation,'SiteLibSupplierItem-SupplierRequestTemplates')]//span[text()='Views']")
	private WebElement TempViews;

	@FindBy(xpath="(//tr[contains(@data-csi-automation,'SiteLibSupplierItem-SupplierRequestTemplates')]//td[text()='Manage Views'])")
	private WebElement Temp_ManViews ;

	@FindBy(xpath="(//select[@class='csiPreferenceSelect '])[1]/option[text()='Inspiration Style Type']")
	private WebElement InspirationStyleType;

	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Add >'])[1]")
	private WebElement add;

	@FindBy(xpath="((//td[@data-csi-heading='Description::0'])/preceding-sibling::td[@data-csi-heading='Node Name::0']//following-sibling::td[contains(@class,'extra-column')])")
	private WebElement Routing_extraColumn;

	@FindBy(xpath="((//div[contains(@data-csi-automation,'SupplierQuote')]/div)/div/input)[1]")
	private WebElement SQTValue ;

	@FindBy(xpath="//div[contains(@class,'RequestTemplates')]//span[text()='+']/parent::div")
	private WebElement PlusIcon ;

	@FindBy(xpath="(//div[contains(@class,'Factor')]//span[text()='+']/parent::div)[1]")
	private WebElement PlusIcon_1 ;

	@FindBy(xpath="(//div[contains(@class,'Factor')]//span[text()='-']/parent::div)[1]")
	private WebElement MinusIcon ;

	@FindBy(xpath="//td[@data-csi-act='InspirationStyleType::0']")
	private WebElement InspirStyleTyevalue ;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'SRTSuppliers')]/div)[1]")
	private WebElement SRTSuppliersValue ;

	@FindBy(xpath="((//div[contains(@data-csi-automation,'SupplierRequestTemplate')]/div)/div/input)[1]")
	private WebElement SRTValue ;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'Type')]/div)[1]")
	private WebElement SRTType ;


	@FindBy(xpath="//span[text()='Shipping Containers']")
	private WebElement shippingContainer ;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'plugin-SourcingViews-ShippingContainers-ToolbarNewActions')]//div/div)[2]")
	private WebElement NewShipContainerBtn;

	@FindBy(xpath="(//td[@data-csi-act='MaxVolumeCBM::0'])")
	private WebElement MaxVolume;

	@FindBy(xpath="(//td[@data-csi-act='MaxWeightLbs::0'])")
	private WebElement MaxWeight;

	@FindBy(xpath="(//td[@data-csi-act='PackingEfficiency::0'])")
	private WebElement PAckingEff;

	@FindBy(xpath="(//td[@data-csi-heading='CalcVolumeCBM::0'])/following-sibling::td/div/span[text()='content_copy']")
	private WebElement Copy_shipContainer;

	@FindBy(xpath="(//td[contains(text(),'COPY')])/following-sibling::td/div/span[text()='close']")
	private WebElement delete_shipContainer;

	@FindBy(xpath="//span[text()='Shipping Ports']")
	private WebElement shippingport;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'plugin-LibSourcing-ShippingPorts-ToolbarNewActions')]//div/div)[2]")
	private WebElement NewShippingPortBtn;

	@FindBy(xpath="//td[@data-csi-act='Country::0']")
	private WebElement SPcountry;

	@FindBy(xpath="//span[text()='Shipping Rates']")
	private WebElement shippingRate;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'plugin-SourcingViews-ShippingRates-ToolbarNewActions')]//div/div)[2]")
	private WebElement NewShippingRateBtn;

	@FindBy(xpath="((//div[contains(@data-csi-automation,'ShippingRate')]/div)/div/input)[1]")
	private WebElement ShippingRateValue;

	@FindBy(xpath="((//span[@data-csi-context-parent='centric:'])[1]/parent::div/parent::div//preceding-sibling::div)[1]//table/tbody/tr[1]/td[2]/div/div/div[2] ")
	private WebElement shippingtype;

	@FindBy(xpath="((//div[contains(@data-csi-automation,'field-ShippingRate-Form-Rate')]/div)[2]/input)[1]")
	private WebElement FreightRate;

	@FindBy(xpath="((//td[@data-csi-heading='Container::0'])/following-sibling::td/div/span[text()='content_copy'])[1]")
	private WebElement ShippingRateCopy ;

	@FindBy(xpath="//td[contains(text(),'Copy')]//parent::td//following-sibling::td/div/span[text()='close']")
	private WebElement DeleteshipRate;

	@FindBy(xpath="//span[contains(text(),'Templates')]")
	private WebElement Template;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'plugin-SiteLibSupplierItem-SupplierRequestTemplates-ToolbarNewActions')]//div/div)[2]")
	private WebElement NewSRTBtn;

	@FindBy(xpath="(((//span[@data-csi-context-parent='centric:'])[1]/parent::div/parent::div//preceding-sibling::div)[1]//table/tbody/tr[1]/td[2]//div/input)[2]")
	private WebElement supplierRequest;

	@FindBy(xpath="(((//span[@data-csi-context-parent='centric:'])[1]/parent::div/parent::div//preceding-sibling::div)[1]//table/tbody/tr[2]/td//div/input)[3]")
	private WebElement Type;

	@FindBy(xpath="(//td[@data-csi-heading='SampleType::0'])/following-sibling::td/div/span[text()='content_copy']")
	private WebElement templatecopy;

	@FindBy(xpath="(//td[@data-csi-heading='SampleType::0'])/following-sibling::td/div/span[text()='close']\r\n")
	private WebElement templateclose;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'plugin-SiteLibSupplierItem-SupplierItemTemplates-ToolbarNewActions')]//div/div)[2]")
	private WebElement NewSQTBtn;

	@FindBy(xpath="(((//span[@data-csi-context-parent='centric:'])[1]/parent::div/parent::div//preceding-sibling::div)[1]//table/tbody/tr[1]//div/input)[2]")
	private WebElement supplierDate;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'plugin-SiteLibSupplierItem-RoutingTemplates-ToolbarNewActions')]//div/div)[2]")
	private WebElement NewRoutingBtn;

	@FindBy(xpath="(//td[@data-csi-heading='Description::0'])/following-sibling::td/div/span[text()='content_copy']")
	private WebElement NewRoutingCopy;

	@FindBy(xpath="(//td[@data-csi-heading='Description::0'])/following-sibling::td/div/span[text()='close']")
	private WebElement NewRoutingDelete;

	@FindBy(xpath="//td[@data-csi-heading='For::0']//following-sibling::td[contains(@class,'extra-column')]")
	private WebElement CapExtraColumn;

	@FindBy(xpath="(//span[text()='Reviews Setup' or @data-csi-tab-name='Reviews Setup'])[1]")
	private WebElement Reviewsetup;

	@FindBy(xpath="(//span[text()='Question Subsections'])[1]")
	private WebElement QuestionSetup;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'plugin-QuestionSection-Subsections-ToolbarNewActions')]//div/div)[2]")
	private WebElement NewQuestionSubSectionBtn;

	@FindBy(xpath="//span[text()='Details']")
	private WebElement ReviewsExtraColumn;

	@FindBy(xpath="(//td[@data-csi-act='PointsPossible:Child:LatestRevision:1'])[1]")
	private WebElement pointspossible1;

	@FindBy(xpath="(//span[@class='attrPrimary']//parent::td/parent::tr/following-sibling::tr//td[contains(@class,'Button')])[3]")
	private WebElement plusicon1;

	@FindBy(xpath="(//td[@data-csi-act='PointsPossible:Child:LatestRevision:1'])[2]")
	private WebElement pointspossible2;

	@FindBy(xpath="(//span[text()='more_horiz'])[1]")
	private WebElement Approveicon1;

	@FindBy(xpath="(//td[text()='Approve'])[1]")
	private WebElement Approve1;

	@FindBy(xpath="(//td[@data-csi-heading='Tags::1']//following-sibling::td[contains(@class,'action')]/div/span[@title='Copy'])[4]")
	private WebElement copy1;

	@FindBy(xpath="(//td[@data-csi-heading='Tags::1']//following-sibling::td[contains(@class,'action')]/div/span[@title='Copy'])[5]")
	private WebElement copy2;

	@FindBy(xpath="(//a[contains(text(),'COPY-COPY')])//parent::span//parent::td//following-sibling::td/div/span[text()='close']")
	private WebElement reviewDelete;

	@FindBy(xpath="(//span[text()='more_horiz'])[2]")
	private WebElement Approveicon2;

	@FindBy(xpath="(//span[text()='more_horiz'])[3]")
	private WebElement Approveicon3;

	@FindBy(xpath="(//td[text()='Approve'])[2]")
	private WebElement Approve2;

	@FindBy(xpath="(//td[text()='Approve'])[1]")
	private WebElement Approve3;

	@FindBy(xpath="(//tr/td[text()='Question Details'])")
	private WebElement QuestionDetail1;

	@FindBy(xpath="(//table[@data-csi-automation='plugin-QuestionRevision-SubQuestions-ToolbarNewActions']//div/div)[2]")
	private WebElement NewSubQuestionBtn;

	@FindBy(xpath="(//span[@data-csi-act='Close'])")
	private WebElement close;

	@FindBy(xpath="(//tr/td[text()='Revise'])")
	private WebElement Revise;

	@FindBy(xpath="(//tr/td[text()='Question Details'])")
	private WebElement QuestionDetail2;

	@FindBy(xpath="(//div[@data-csi-automation='field-SubQuestion-Form-Node Name']//div/input)[2]")
	private WebElement SubSectionValue;

	@FindBy(xpath="//div[@data-csi-automation='field-SubQuestion-Form-ApplicableQuestionResponse']//div[3]/input")
	private WebElement Applicableforreason;

	@FindBy(xpath="//span[text()='Questions']")
	private WebElement Questions;

	@FindBy(xpath="//div[text()='Displaying 3 results']")
	private WebElement DisplayResult;

	@FindBy(xpath="//span[text()='Review Templates']")
	private WebElement ReviewTemplate;

	@FindBy(xpath="(//table[@data-csi-automation='plugin-QualityViews-FactoryReviewTemplates-ToolbarNewActions']//div/div)[2]")
	private WebElement NewSourcingBtn;

	@FindBy(xpath="//td[@data-csi-heading='State:Child:LatestRevision:0']//following-sibling::td[contains(@class,'extra-column')]")
	private WebElement sourcingExtraColumn;

	@FindBy(xpath="(//td[@data-csi-heading='Node Name::0'])//a[contains(text(),'Sourcing Review Template - Automation')]")
	private WebElement reviewtemp;

	@FindBy(xpath="(//div[@data-csi-automation='plugin-ORTSection-ORTSectionQuestions-ToolbarNewActions' or text()='Select Question Subsections'])")
	private WebElement selectQuestion;

	@FindBy(xpath="(//div/div[@data-csi-automation='plugin-ORTSection-ORTSectionQuestions-ToolbarNewActions' or text()='Select Question Subsections'])/parent::div/div/parent::div/parent::td/parent::tr//td[2]")
	private WebElement selectdropdown;

	@FindBy(xpath="(//td[text()='Select Questions'])")
	private WebElement selectQuestions;

	@FindBy(xpath="//th/div/input[@type='checkbox']")
	private WebElement chkbox;

	@FindBy(xpath="//span[text()='Factory' or @data-csi-tab-name='Factory']")
	private WebElement Factory;

	@FindBy(xpath="//table[@data-csi-automation='plugin-LibSourcing-Factories-ToolbarNewActions']")
	private WebElement NewFactoryBtn;

	@FindBy(xpath="//td[@data-csi-act='State::0']")
	private WebElement Pending;

	@FindBy(xpath="//td[contains(@data-csi-heading,'Commission')]")
	private WebElement commision;

	@FindBy(xpath="//td[contains(@data-csi-heading,'MinOrderAmt')]")
	private WebElement minorderamt;

	@FindBy(xpath="//td[contains(@data-csi-heading,'MinOrderSurcharge')]")
	private WebElement minordersurchage;

	@FindBy(xpath="//td[contains(@data-csi-heading,'VolumeCapacity')]")
	private WebElement volCapacity;

	@FindBy(xpath="//td[contains(@data-csi-heading,'MOQInitial')]")
	private WebElement MOQInitial;

	@FindBy(xpath="//td[contains(@data-csi-heading,'MOQReorder')]")
	private WebElement MOQReorder;

	@FindBy(xpath="(//tr/td[contains(@data-csi-act,'Node Name')]/a)[2]")
	private WebElement chennai;

	@FindBy(xpath="(//table[@data-csi-automation='plugin-SourcingItem-Contacts-ToolbarNewActions']//div/div)[2]")
	private WebElement NewContactBtn;

	@FindBy(xpath="//span[text()='Reviews' or @data-csi-tab-name='Reviews']")
	private WebElement Reviews;

	@FindBy(xpath="(//table[@data-csi-automation='plugin-Data-AllSupplierReviews-ToolbarNewActions']//div/div)[2]")
	private WebElement NewSupplierReview;

	@FindBy(xpath="//span[@data-csi-tab-name='Factory Reviews']")
	private WebElement FactoryReviews;

	@FindBy(xpath="(//table[@data-csi-automation='plugin-Data-AllFactoryReviews-ToolbarNewActions']//div/div)[2]")
	private WebElement factoryReviewBtn;

	@FindBy(xpath="//div[@data-csi-automation='field-FactoryReview-Form-ORTemplateRevision']//div[3]/input[1]")
	private WebElement tempaltevalue;

	@FindBy(xpath="//div[@data-csi-automation='field-FactoryReview-Form-Factory']//div[3]/input[1]")
	private WebElement Factoryvalue;

	@FindBy(xpath="//div[@data-csi-automation='field-FactoryReview-Form-Node Name']//div[2]/div/input")
	private WebElement factoryreviewDesc;

	@FindBy(xpath="(//span[text()='Save & Go'])")
	private WebElement saveandgo;

	@FindBy(xpath="//span[@title='Submit' or data-csi-act='ORToPending']")
	private WebElement submit;

	@FindBy(xpath="//div[contains(text(),'Need answer for')]")
	private WebElement Errormessage;

	@FindBy(xpath="//td[contains(@data-csi-act,'Response')]")
	private WebElement Response;

	@FindBy(xpath="//td[contains(@data-csi-act,'Response')]//following::td[1]")
	private WebElement reponseText;

	@FindBy(xpath="//td[contains(@data-csi-act,'Response')]//following::td[2]")
	private WebElement pointscored;

	@FindBy(xpath="//span[@data-csi-tab-name='Conclusion']")
	private WebElement conclusion;

	@FindBy(xpath="//span[@data-csi-tab-name='Supplier Reviews']")
	private WebElement SupplierReview;

	@FindBy(xpath="//div[@data-csi-automation='field-SupplierReview-Form-ORTemplateRevision']//div[3]/input[1]")
	private WebElement supTemplateValue;
	
	@FindBy(xpath="((//div[@data-csi-automation='field-SupplierItem-Form-Supplier']/div)[3]/input)[1]")
	private WebElement supplierValue;

	@FindBy(xpath="//div[@data-csi-automation='field-SupplierReview-Form-Node Name']//div[2]/div/input")
	private WebElement supplierviewdesc;

	@FindBy(xpath="//td//a[contains(text(),'Template-COPY')]")
	private WebElement routTemp_Name;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'placeholder-RoutingRevision-Items-ActionsNew')]//td)[1]")
	private WebElement Routing_AddCapabilty;

	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Toolbars'])[1]")
	private WebElement Toolbar ;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'RoutingRevision-Items')])[1]//tbody/tr/td[2]")
	private WebElement AddCapExpand;

	@FindBy(xpath="((//td[@data-csi-act='ID::0'])/following-sibling::td/div/span[text()='content_copy'])[1]")
	private WebElement RoutingCapCopy;

	@FindBy(xpath="(//td[@data-csi-heading='RoutingFactories:Child:__Parent__:0'])")
	private WebElement Factories;

	@FindBy(xpath="(//td[contains(text(),'Factory')]//preceding-sibling::td)[1]//input")
	private WebElement FactChkBx;

	@FindBy(xpath="//td//a[contains(text(),'Quote')]")
	private WebElement QuoteName;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'plugin-SupplierItemRevision-DutyPerUsage-ToolbarNewActions')]//div/div)[2]")
	private WebElement HtsQuoteBtn;

	@FindBy(xpath="(//td[contains(text(),'India')]//preceding-sibling::td)[1]//input")
	private WebElement IndiaHtsChkBx;

	@FindBy(xpath="//span[text()='Cost Scenario' or @data-csi-tab-name='Cost Scenario']")
	private WebElement Cost_Scenario;

	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Manage Cost Scenario'])[1]")
	private WebElement ManageCostScenario;

	@FindBy(xpath="//span[contains(@data-csi-automation,'plugin-CostRoutingGroup-Summary-CustomViewActions')]//span[text()='Views']")
	private WebElement QuoteViews;

	@FindBy(xpath="(//tr[contains(@data-csi-automation,'plugin-CostRoutingGroup-Summary-CustomViewManage')]//td[text()='Manage Views'])")
	private WebElement QuoteManageViews;

	@FindBy(xpath="((//div[contains(@id,'customViews')]//div[contains(@role,'combobox')]/div)[3]/input[@role='textbox'])")
	private WebElement customValue;

	@FindBy(xpath="(//select[@class='csiPreferenceSelect '])[1]/option[text()='Fixed OH Rate']")
	private WebElement Fixed;

	@FindBy(xpath="(//select[@class='csiPreferenceSelect '])[1]/option[text()='Variable OH Rate']")
	private WebElement Variable;

	@FindBy(xpath="(//td[@data-csi-heading='LaborRate:Child:Attributes:0'])")
	private WebElement Labour_rate;

	@FindBy(xpath="(//td[@data-csi-heading='FixedOHRate:Child:Attributes:0'])")
	private WebElement Fixed_rate;

	@FindBy(xpath="(//td[@data-csi-heading='VariableOHRate:Child:Attributes:0'])")
	private WebElement variable_rate;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'plugin-CostRoutingGroup-MaterialCosts-ToolbarNewActions')]//div/div)[2]")
	private WebElement materialCostBtn;

	@FindBy(xpath="(//td[@data-csi-heading='Quantity::0'])")
	private WebElement Qty;

	@FindBy(xpath="(//span[@data-csi-tab-name='Supplier Quote'])[1]")
	private WebElement supplier_Quote;

	@FindBy(xpath="(//td[@data-csi-heading='FOBFullPrice::0'])")
	private WebElement Fob;

	@FindBy(xpath="//span[text()='Templates' or @data-csi-tab-name='Templates']")
	private WebElement SpecTemp;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'plugin-SizeChartAdmin-DataPackageTemplates-ToolbarNewActions')]//div/div)[2]")
	private WebElement DataPacktempBtn;

	@FindBy(xpath="(//div[@data-csi-automation='field-DataPackageTemplate-Form-Node Name']//div/input)[2]")
	private WebElement DPTValue;

	@FindBy(xpath="(//div[@data-csi-automation='field-DataPackageTemplate-Form-TemplateType']//div)[1]")
	private WebElement DPTType;

	@FindBy(xpath="//span[text()='Customers' or @data-csi-tab-name='Customers']")
	private WebElement customer;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'plugin-LibSourcing-Customers-ToolbarNewActions')]//div/div)[2]")
	private WebElement NewCustBtn;

	@FindBy(xpath="(//div[@data-csi-automation='field-Customer-Form-Node Name']//div/input)[2]")
	private WebElement customerValue;

	@FindBy(xpath="(//td[@data-csi-heading='Country::0'])")
	private WebElement country;

	@FindBy(xpath="(//span[text()='Shipment' or @data-csi-tab-name='Shipment'])[1]")
	private WebElement shipment;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'plugin-LibSourcing-ShipmentTerms-ToolbarNewActions')]//div/div)[2]")
	private WebElement NewshipmentBtn;

	@FindBy(xpath="//td[contains(@data-csi-act,'RequestedShipDate')]")
	private WebElement requesDate;

	@FindBy(xpath="//div[@data-csi-automation='edit-LibSourcing-ShipmentTerms-RequestedShipDate:']//td[contains(@class,'CurrentDate')]")
	private WebElement currentDate;

	@FindBy(xpath="//td[contains(@data-csi-act,'ConfirmedShipDate')]")
	private WebElement confirmedDate;

	@FindBy(xpath="//div[@data-csi-automation='edit-LibSourcing-ShipmentTerms-ConfirmedShipDate:']//td[contains(@class,'CurrentDate')]/following-sibling::td[2]")
	private WebElement confiDate;
	
	@FindBy(xpath="(//div[@data-csi-automation='edit-LibSourcing-ShipmentTerms-ConfirmedShipDate:']//td[contains(@class,'CurrentDate')]/parent::tr/following-sibling::tr/td)[1]")
	private WebElement confiDate1;

	@FindBy(xpath="//td[contains(@data-csi-act,'ExpectedShipDate')]")
	private WebElement expecteDate;

	@FindBy(xpath="//div[@data-csi-automation='edit-LibSourcing-ShipmentTerms-ExpectedShipDate:']//td[contains(@class,'CurrentDate')]/following-sibling::td[2]")
	private WebElement ExpecDate;
	
	@FindBy(xpath="(//div[@data-csi-automation='edit-LibSourcing-ShipmentTerms-ExpectedShipDate:']//td[contains(@class,'CurrentDate')]/parent::tr/following-sibling::tr/td)[1]")
	private WebElement ExpecDate1;

	@FindBy(xpath="//td[contains(@data-csi-act,'PortOfOrigin')]")
	private WebElement portofshipment;

	@FindBy(xpath="//td[contains(@data-csi-act,'PortOfDestination')]")
	private WebElement shipTo;

	@FindBy(xpath="//span[@data-csi-tab-name='Sourcing' or text()='Sourcing']")
	private WebElement seasonsourcing;

	@FindBy(xpath="//span[@data-csi-tab-name='Supplier Quotes']")
	private WebElement supplierquotes;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'PriceList')]//div/div)[2]")
	private WebElement newPriceList;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'Supplier')]//div/div)[2]")
	private WebElement newSuplrqute;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-SupplierItem-Form-Supplier')]//div[3]/input[1])[1]")
	private WebElement SupplierValue;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'SupplierItemDimensions')]/div)[1]")
	private WebElement colorSIze;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'SupplierItem-Form-Colors')]/div)[1]")
	private WebElement SuppItemColorSel;

	@FindBy(xpath="//div[contains(@data-csi-automation,'SupplierItem-Form-Colors')]//div//span[contains(text(),'Go to Dialog...')]")
	private WebElement SuppItemDialog;

	@FindBy(xpath="(//td[contains(text(),'Blue')]//preceding-sibling::td)[1]//input")
	private WebElement BlueChkBx;

	@FindBy(xpath="(//td[contains(text(),'Green')]//preceding-sibling::td)[1]//input")
	private WebElement GreenChkBx;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-SupplierItem-Form-ProductSizes')]/div)[1]")
	private WebElement Sizes;

	@FindBy(xpath="//div[contains(@data-csi-automation,'SupplierItem-Form-ProductSizes')]//div//span[contains(text(),'Go to Dialog...')]")
	private WebElement SuppSizesDialog;

	@FindBy(xpath="(//td[@data-csi-heading='Node Name::0']/a[contains(text(),'Blue')])[1]")
	private WebElement NewSupplQteName;

	@FindBy(xpath="//span[@data-csi-tab-name='Select Sets']")
	private WebElement selectSet;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'SelectSets')]//div/div)[2]")
	private WebElement selectsetBtn;

	@FindBy(xpath="//div[contains(@data-csi-automation,'SelectSet')]/div[2]/div/input")
	private WebElement selectsetvalue;

	@FindBy(xpath="//div[@data-csi-crumb-type='Style']//a")
	private WebElement Apparealcoroandsizename;

	@FindBy(xpath="//table[contains(@data-csi-automation,'ProductSourcing-BlendedCost')]//div/div[2]")
	private WebElement newproductbendcost;

	@FindBy(xpath="//div[contains(@class,'Product')]//span[text()='+']/parent::div")
	private WebElement ProductPlusIcon;

	@FindBy(xpath="//td[contains(@data-csi-heading,'SelectedBlendedCost')]//div/div/input")
	private WebElement blendcostcheckbox;

	@FindBy(xpath="//span[contains(@data-csi-automation,'actions-ProductSourcing-BlendedCosts')]")
	private WebElement BlendcostAction;

	@FindBy(xpath="//td[text()='Select Supplier Quotes']")
	private WebElement selectsuppQuotes;

	@FindBy(xpath="(//span[text()='Select Supplier Quotes']//parent::div//parent::div//tr[@data-csi-act='ViewSelect']/td/div/input)[1]")
	private WebElement selectsupquotechecckbox;

	@FindBy(xpath="//span[@data-csi-tab-name='Supplier Requests']")
	private WebElement supplierrequest;

	@FindBy(xpath="((//table[contains(@data-csi-automation,'SupplierRequests')])//div[contains(text(),'New Supplier Request')])[1] ")
	private WebElement newsupplierrequestbtn;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'SRTemplate')]/div)[1]")
	private WebElement srttemplateExpand;

	@FindBy(xpath="//div[contains(@data-csi-automation,'SupplierRequest')]//div[2]/div/input")
	private WebElement supplierreqvalue;

	@FindBy(xpath="//span[@data-csi-tab-name='Setup']")
	private WebElement setup;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'SupplierRequest-StyleLineItems')]//div/div)[2]")
	private WebElement Addproduct;

	@FindBy(xpath="(//td[contains(text(),'Only Color')]//preceding-sibling::td)[1]//input")
	private WebElement Addprodcutcheckbox;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Supplier Quotes']")
	private WebElement SRQuotes;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Samples']")
	private WebElement SRSamples;

	@FindBy(xpath="//span[@data-csi-tab-name='Supplier Request']")
	private WebElement supplierreq;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'StyleLineItem')])[1]//tbody/tr/td[2]")
	private WebElement AddproductExpand;

	@FindBy(xpath="//table[contains(@data-csi-automation,'SupplierRequest')]//td[2][contains(text(),'New Inspiration Style')]")
	private WebElement newInspirationStyle;

	@FindBy(xpath="//div[contains(@data-csi-automation,'field-Style-NewInspirationStyle-Node Name')]/div[2]/div/input")
	private WebElement newinspirationstyleValue;

	@FindBy(xpath="//span[contains(@data-csi-automation,'plugin-SupplierRequest-StyleQuotes-CustomViewActions')]//span[text()='Views']")
	private WebElement SupplierQuteViews;

	@FindBy(xpath="//tr[contains(@data-csi-automation,'plugin-SupplierRequest-StyleQuotes-CustomViewManage')]//td[text()='Manage Views']")
	private WebElement SupplierQteManageViews;

	@FindBy(xpath="(//select[@class='csiPreferenceSelect '])[1]/option[contains(text(),'Adopted')]")
	private WebElement AdoptedStyle;

	@FindBy(xpath="(//select[@class='csiPreferenceSelect '])[1]/option[contains(text(),'Adoption')]")
	private WebElement Adoption;

	@FindBy(xpath="//span[@data-csi-tab-name-name='Copy Templates' or text()='Copy Templates']")
	private WebElement copyTemplate;

	@FindBy(xpath="//table[contains(@data-csi-automation,'CopyTemplates')]//div[contains(text(),'Style Copy Template')]")
	private WebElement newstylecopytemplatebtn;

	@FindBy(xpath="//div[contains(@data-csi-automation,'NewStyleCopyTemplate')]//div/div/input")
	private WebElement stylecopytempvalue;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'NewStyleCopyTemplate')]//div)[5]")
	private WebElement styletypevalue;

	@FindBy(xpath="//span[contains(@data-csi-automation,'plugin-Site-CopyTemplates-CustomViewActions')]//span[text()='Views']")
	private WebElement CopTemViews;

	@FindBy(xpath="//tr[contains(@data-csi-automation,'plugin-Site-CopyTemplates-CustomViewManage')]//td[text()='Manage Views']")
	private WebElement CopTemManViews;

	@FindBy(xpath="(//select[@class='csiPreferenceSelect '])[1]/option[contains(text(),'OK for Adoption')]")
	private WebElement OKforAdoption;

	@FindBy(xpath="//td[contains(@data-csi-heading,'OKForAdoption')]/div/input")
	private WebElement okforadoptionchecckbox;

	@FindBy(xpath="(//td[@data-csi-heading='Node Name::0']/a[contains(text(),'Apparel - SR')])[1]")
	private WebElement SuppRequstName;
	
	@FindBy(xpath="(//td[@data-csi-heading='Node Name::0']/a[contains(text(),'SR - Delete')])[1]")
	private WebElement SuppRequstName1;

	@FindBy(xpath="//div[contains(@class,'SupplierRequest-StyleQuotes')]//span[text()='+']/parent::div")
	private WebElement SupplierRequestPlus;

	@FindBy(xpath="(//a[contains(text(),'Inspiration')]/parent::td)[1]//following-sibling::td[@data-csi-heading='AdoptionStatus::0']")
	private WebElement ActionAdoption;

	@FindBy(xpath="//a[text()='Adopt as Style' and @data-csi-act='AdoptAsStyle']")
	private WebElement AdoptAsstyle;

	@FindBy(xpath="//a[text()='Style - Proto-Supplier']/parent::div/parent::td/preceding-sibling::td//a[text()='Auto Inspiration']/parent::td//following-sibling::td//div/span[text()='content_copy']")
	private WebElement AdoptCopy;

	@FindBy(xpath="(//div[@data-csi-automation='field-SupplierItem-Form-Node Name']//div/input)[2]")
	private WebElement SupplierQteValue;
	
	@FindBy(xpath="(//div[@data-csi-automation='field-Sample-Form-Node Name']//div/input)[2]")
	private WebElement SampleQteValue;

	@FindBy(xpath="(//td[text()='Mass Adopt As Styles'])")
	private WebElement massadoptasstyle;
	
	

	public WebElement getApproveTestRun() {
		return ApproveTestRun;
	}

	public WebElement getFactoryvaluepo() {
		return factoryvaluepo;
	}
	
	public WebElement getSampleQteValue() {
		return SampleQteValue;
	}
	
	public WebElement getBlue_supplierquote() {
		return Blue_supplierquote;
	}
	
	public WebElement getGreen_supplierquote() {
		return Green_supplierquote;
	}
	
	public WebElement getErrormsg() {
		return errormsg;
	}
	
	public WebElement getQcdelete() {
		return qcdelete;
	}
	
	public WebElement getSupplierpo() {
		return supplierpo;
	}

	public WebElement getPogroup() {
		return pogroup;
	}

	public WebElement getNewpogroupbtn() {
		return newpogroupbtn;
	}

	public WebElement getPoextracolumn1() {
		return poextracolumn1;
	}

	public WebElement getDeletepogroup() {
		return deletepogroup;
	}

	public WebElement getSupplierpotab() {
		return supplierpotab;
	}

	public WebElement getNewsupplierpobtn() {
		return newsupplierpobtn;
	}

	public WebElement getSupplierPOVaule() {
		return supplierPOVaule;
	}
	

	public WebElement getSRQuotes() {
		return SRQuotes;
	}

	public WebElement getSRSamples() {
		return SRSamples;
	}

	public WebElement getSupplierexpand() {
		return supplierexpand;
	}

	public WebElement getSuppliervalue() {
		return suppliervalue;
	}

	public WebElement getFactoryexpand() {
		return factoryexpand;
	}

	public WebElement getSAVEANDGO() {
		return SAVEANDGO;
	}

	public WebElement getColorbasedcheckbox() {
		return colorbasedcheckbox;
	}

	public WebElement getPohead() {
		return pohead;
	}

	public WebElement getCommissionrate() {
		return commissionrate;
	}

	public WebElement getPaymentterm() {
		return paymentterm;
	}

	public WebElement getNewdividerbtn() {
		return newdividerbtn;
	}

	public WebElement getNewdeviceexpand() {
		return newdeviceexpand;
	}

	public WebElement getNewcolorwayorder() {
		return newcolorwayorder;
	}

	public WebElement getReset() {
		return reset;
	}

	public WebElement getStyleselect() {
		return styleselect;
	}

	public WebElement getApparealcheckbox() {
		return apparealcheckbox;
	}

	public WebElement getColorwayordername() {
		return colorwayordername;
	}

	public WebElement getBluecheckbox1() {
		return bluecheckbox1;
	}

	public WebElement getGreencheckbox1() {
		return greencheckbox1;
	}

	public WebElement getHeader() {
		return header;
	}

	public WebElement getB_supplierquote() {
		return b_supplierquote;
	}

	public WebElement getB_discountpct() {
		return b_discountpct;
	}

	public WebElement getB_discountvalue() {
		return b_discountvalue;
	}

	public WebElement getPlusicon() {
		return plusicon;
	}

	public WebElement getB_allowancepercentage() {
		return b_allowancepercentage;
	}

	public WebElement getB_allowancevalue() {
		return b_allowancevalue;
	}

	public WebElement getG_supplierquote() {
		return g_supplierquote;
	}

	public WebElement getG_discountpct() {
		return g_discountpct;
	}

	public WebElement getG_discountvalue() {
		return g_discountvalue;
	}

	public WebElement getG_allowancepercentage() {
		return g_allowancepercentage;
	}

	public WebElement getG_allowancevalue() {
		return g_allowancevalue;
	}

	public WebElement getPOHeader() {
		return POHeader;
	}

	public WebElement getEdit() {
		return Edit;
	}

	public WebElement getEditText() {
		return EditText;
	}

	public WebElement getNewcomment() {
		return Newcomment;
	}
	
	public WebElement getComments() {
		return comments;
	}

	public WebElement getNewcommentsubject() {
		return Newcommentsubject;
	}
	public WebElement getInstruction() {
		return Instruction;
	}

	public WebElement getDisplay() {
		return display;
	}
	public WebElement getOrders() {
		return orders;
	}

	public WebElement getBlueUnitPerSize() {
		return BlueUnitPerSize;
	}

	public WebElement getGreenUnitPerSize() {
		return GreenUnitPerSize;
	}
	
	public WebElement getBlueshipmentqty1() {
		return blueshipmentqty1;
	}
	public WebElement getGreenShipmentqty1() {
		return greenShipmentqty1;
	}


	public WebElement getExtracolumn() {
		return extracolumn;
	}

	public WebElement getUnitpackBlue1() {
		return unitpackBlue1;
	}

	public WebElement getUnitpackGreen1() {
		return unitpackGreen1;
	}

	public WebElement getUnitpackBlue2() {
		return unitpackBlue2;
	}

	public WebElement getUnitpackGreen2() {
		return unitpackGreen2;
	}

	public WebElement getPlusicon2() {
		return plusicon2;
	}

	public WebElement getOrdersummary() {
		return ordersummary;
	}

	public WebElement getPoshipment() {
		return poshipment;
	}

	public WebElement getNewshipmentexpand() {
		return newshipmentexpand;
	}

	public WebElement getSelectshipment() {
		return selectshipment;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getNewshipmentorder() {
		return newshipmentorder;
	}

	public WebElement getBlueshipmentqty() {
		return blueshipmentqty;
	}

	public WebElement getGreenShipmentqty() {
		return greenShipmentqty;
	}

	public WebElement getQualitycontrol() {
		return qualitycontrol;
	}

	public WebElement getNewQCIssue() {
		return newQCIssue;
	}

	public WebElement getQccopy() {
		return qccopy;
	}

	/*	public WebElement getSelectset() {
		return selectset;
	}

	public WebElement getNewselectsetbtn() {
		return newselectsetbtn;
	}

	public WebElement getSelectsetvalue() {
		return selectsetvalue;
	}*/

	public WebElement getCustomerPO() {
		return customerPO;
	}

	public WebElement getNewcustomerPObtn() {
		return newcustomerPObtn;
	}

	public WebElement getCustomerPOvalue() {
		return customerPOvalue;
	}

	public WebElement getCustomerexpand() {
		return customerexpand;
	}

	public WebElement getSelecttarget() {
		return selecttarget;
	}

	public WebElement getNewdividerexpand() {
		return newdividerexpand;
	}

	public WebElement getNewcolorwaybtn() {
		return newcolorwaybtn;
	}

	public WebElement getB_quantity() {
		return b_quantity;
	}

	public WebElement getB_baseprice() {
		return b_baseprice;
	}

	public WebElement getG_quantity() {
		return g_quantity;
	}

	public WebElement getG_baseprice() {
		return g_baseprice;
	}

	public WebElement getProperties() {
		return properties;
	}

	public WebElement getWinterseason() {
		return winterseason;
	}

	public WebElement getColorandsizename() {
		return colorandsizename;
	}

	public WebElement getPos() {
		return Pos;
	}

	public WebElement getSupplierpos() {
		return supplierpos;
	}

	public WebElement getNegotiationarrow() {
		return Negotiationarrow;
	}

	public WebElement getReadyArrow() {
		return ReadyArrow;
	}

	public WebElement getIssuedArrow() {
		return issuedArrow;
	}

	public WebElement getCustomerpos() {
		return customerpos;
	}

	public WebElement getdisplay() {
		return display;
	}

	public WebElement getCustomer() {
		return customer;
	}

	public WebElement getNewCustBtn() {
		return NewCustBtn;
	}

	public WebElement getCustomerValue() {
		return customerValue;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getFactory() {
		return Factory;
	}

	public WebElement getNewFactoryBtn() {
		return NewFactoryBtn;
	}

	public WebElement getPending() {
		return Pending;
	}

	public WebElement getCommision() {
		return commision;
	}

	public WebElement getMinorderamt() {
		return minorderamt;
	}

	public WebElement getMinordersurchage() {
		return minordersurchage;
	}

	public WebElement getVolCapacity() {
		return volCapacity;
	}

	public WebElement getMOQInitial() {
		return MOQInitial;
	}

	public WebElement getMOQReorder() {
		return MOQReorder;
	}

	public WebElement getChennai() {
		return chennai;
	}

	public WebElement getNewContactBtn() {
		return NewContactBtn;
	}

	public WebElement getReviews() {
		return Reviews;
	}

	public WebElement getNewSupplierReview() {
		return NewSupplierReview;
	}

	public WebElement getFactoryReviews() {
		return FactoryReviews;
	}

	public WebElement getFactoryReviewBtn() {
		return factoryReviewBtn;
	}

	public WebElement getTempaltevalue() {
		return tempaltevalue;
	}

	public WebElement getFactoryvalue() {
		return Factoryvalue;
	}

	public WebElement getFactoryreviewDesc() {
		return factoryreviewDesc;
	}

	public WebElement getSaveandgo() {
		return saveandgo;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getErrormessage() {
		return Errormessage;
	}

	public WebElement getResponse() {
		return Response;
	}


	public WebElement getMinusIcon() {
		return MinusIcon;
	}

	public WebElement getReponseText() {
		return reponseText;
	}

	public WebElement getPointscored() {
		return pointscored;
	}

	public WebElement getConclusion() {
		return conclusion;
	}

	public WebElement getSupplierReview() {
		return SupplierReview;
	}

	public WebElement getSupTemplateValue() {
		return supTemplateValue;
	}

	public WebElement getSupplierValue() {
		return supplierValue;
	}

	public WebElement getSupplierviewdesc() {
		return supplierviewdesc;
	}


	public WebElement getCapExtraColumn() {
		return CapExtraColumn;
	}

	public WebElement getSetup() {
		return Setup;
	}

	public WebElement getHTSCode() {
		return HTSCode;
	}

	public WebElement getNewHTSCodeBtn() {
		return NewHTSCodeBtn;
	}

	public WebElement getFromCountry() {
		return FromCountry;
	}

	public WebElement getToCountry() {
		return ToCountry;
	}

	public WebElement getCopy() {
		return copy;
	}

	public WebElement getShippingContainer() {
		return shippingContainer;
	}

	public WebElement getNewShipContainerBtn() {
		return NewShipContainerBtn;
	}

	public WebElement getMaxVolume() {
		return MaxVolume;
	}

	public WebElement getMaxWeight() {
		return MaxWeight;
	}

	public WebElement getPAckingEff() {
		return PAckingEff;
	}

	public WebElement getCopy_shipContainer() {
		return Copy_shipContainer;
	}

	public WebElement getDelete_shipContainer() {
		return delete_shipContainer;
	}

	public WebElement getShippingport() {
		return shippingport;
	}

	public WebElement getNewShippingPortBtn() {
		return NewShippingPortBtn;
	}

	public WebElement getSPCountry() {
		return SPcountry;
	}

	public WebElement getShippingRate() {
		return shippingRate;
	}

	public WebElement getNewShippingRateBtn() {
		return NewShippingRateBtn;
	}

	public WebElement getShippingRateValue() {
		return ShippingRateValue;
	}

	public WebElement getShippingtype() {
		return shippingtype;
	}

	public WebElement getFreightRate() {
		return FreightRate;
	}

	public WebElement getShippingRateCopy() {
		return ShippingRateCopy;
	}

	public WebElement getDeleteshipRate() {
		return DeleteshipRate;
	}

	public WebElement getTemplate() {
		return Template;
	}

	public WebElement getNewSRTBtn() {
		return NewSRTBtn;
	}

	public WebElement getCapability() {
		return capability;
	}

	public WebElement getNewCapabilityBtn() {
		return NewCapabilityBtn;
	}

	public WebElement getCapFor() {
		return CapFor;
	}

	public WebElement getCopy_shipping() {
		return copy_shipping;
	}

	public WebElement getCap_extacolumn() {
		return cap_extacolumn;
	}

	public WebElement getCopy_factory() {
		return copy_factory;
	}

	public WebElement getDelete_factory() {
		return delete_factory;
	}

	public WebElement getOperationGroup() {
		return OperationGroup;
	}

	public WebElement getNewOGroupBtn() {
		return newOGroupBtn;
	}

	public WebElement getOG_extracolumn() {
		return OG_extracolumn;
	}

	public WebElement getOperatingGroup1() {
		return OperatingGroup1;
	}

	public WebElement getOperatingGroup2() {
		return OperatingGroup2;
	}

	public WebElement getSub_Routing() {
		return sub_Routing;
	}

	public WebElement getNewsubRoutingBtn() {
		return newsubRoutingBtn;
	}

	public WebElement getSubRoutingvalue() {
		return subRoutingvalue;
	}

	public WebElement getSaveAndGoBtn() {
		return saveAndGoBtn;
	}

	public WebElement getActivechkbox() {
		return Activechkbox;
	}

	public WebElement getAddCapability() {
		return AddCapability;
	}

	public WebElement getSupplierchkBox() {
		return SupplierchkBox;
	}

	public WebElement getFactorychkBox() {
		return FactorychkBox;
	}

	public WebElement getShippingPortChkBox() {
		return ShippingPortChkBox;
	}

	public WebElement getApproveActions() {
		return ApproveActions;
	}
	
	public WebElement getApproveActionsSR() {
		return ApproveActionsSR;
	}
	
	public WebElement getApproveActionsRT() {
		return ApproveActionsRT;
	}

	public WebElement getApprove() {
		return Approve;
	}

	public WebElement getAddCapabilityDown() {
		return AddCapabilityDown;
	}

	public WebElement getAddSubRouting() {
		return AddSubRouting;
	}

	public WebElement getApprovedChkBox() {
		return ApprovedChkBox;
	}

	public WebElement getSRrefresh() {
		return SRrefresh;
	}

	public WebElement getPlusIcondown() {
		return plusIcondown;
	}

	public WebElement getDivider() {
		return divider;
	}

	public WebElement getSr_extracolumn() {
		return Sr_extracolumn;
	}

	public WebElement getSpecial() {
		return special;
	}

	public WebElement getCountries() {
		return Countries;
	}

	public WebElement getNewCountriesBtn() {
		return NewCountriesBtn;
	}

	public WebElement getCntry_extraColumn() {
		return Cntry_extraColumn;
	}

	public WebElement getCntryCode() {
		return CntryCode;
	}

	public WebElement getRegion() {
		return Region;
	}

	public WebElement getSalesRegionSpecs() {
		return salesRegionSpecs;
	}

	public WebElement getNewSalesReginBtn() {
		return newSalesReginBtn;
	}

	public WebElement getSalesRegionValue() {
		return salesRegionValue;
	}

	public WebElement getSellingcntryValue() {
		return sellingcntryValue;
	}

	public WebElement getSecondarySRValue() {
		return SecondarySRValue;
	}

	public WebElement getSPcountry() {
		return SPcountry;
	}

	public WebElement getSupplierRequest() {
		return supplierRequest;
	}

	public WebElement getType() {
		return Type;
	}

	public WebElement getTemplatecopy() {
		return templatecopy;
	}

	public WebElement getTemplateclose() {
		return templateclose;
	}

	public WebElement getNewSQTBtn() {
		return NewSQTBtn;
	}

	public WebElement getSupplierDate() {
		return supplierDate;
	}

	public WebElement getNewRoutingBtn() {
		return NewRoutingBtn;
	}

	public WebElement getNewRoutingCopy() {
		return NewRoutingCopy;
	}

	public WebElement getNewRoutingDelete() {
		return NewRoutingDelete;
	}

	public WebElement getDescription() {
		return Description;
	}

	public WebElement getDuty() {
		return Duty;
	}

	public WebElement getSC_extraColumn() {
		return SC_extraColumn;
	}

	public WebElement getTaxId() {
		return TaxId;
	}

	public WebElement getSP_extraColumn() {
		return SP_extraColumn;
	}

	public WebElement getSP_Copy() {
		return SP_Copy;
	}

	public WebElement getSP_Delete() {
		return SP_Delete;
	}

	public WebElement getOrigin() {
		return origin;
	}

	public WebElement getDestination() {
		return Destination;
	}

	public WebElement getContainer() {
		return container;
	}

	public WebElement getTempViews() {
		return TempViews;
	}

	public WebElement getTemp_ManViews() {
		return Temp_ManViews;
	}

	public WebElement getInspirationStyleType() {
		return InspirationStyleType;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getRouting_extraColumn() {
		return Routing_extraColumn;
	}

	public WebElement getSQTValue() {
		return SQTValue;
	}

	public WebElement getPlusIcon() {
		return PlusIcon;
	}

	public WebElement getInspirStyleTyevalue() {
		return InspirStyleTyevalue;
	}

	public WebElement getSRTSuppliersValue() {
		return SRTSuppliersValue;
	}

	public WebElement getSRTValue() {
		return SRTValue;
	}

	public WebElement getSRTType() {
		return SRTType;
	}

	public WebElement getReviewsetup() {
		return Reviewsetup;
	}

	public WebElement getQuestionSetup() {
		return QuestionSetup;
	}

	public WebElement getNewQuestionSubSectionBtn() {
		return NewQuestionSubSectionBtn;
	}

	public WebElement getReviewsExtraColumn() {
		return ReviewsExtraColumn;
	}

	public WebElement getPointspossible1() {
		return pointspossible1;
	}

	public WebElement getPlusicon1() {
		return plusicon1;
	}

	public WebElement getPointspossible2() {
		return pointspossible2;
	}

	public WebElement getApproveicon1() {
		return Approveicon1;
	}

	public WebElement getApprove1() {
		return Approve1;
	}

	public WebElement getCopy1() {
		return copy1;
	}

	public WebElement getCopy2() {
		return copy2;
	}

	public WebElement getReviewDelete() {
		return reviewDelete;
	}

	public WebElement getApproveicon2() {
		return Approveicon2;
	}

	public WebElement getApproveicon3() {
		return Approveicon3;
	}

	public WebElement getApprove2() {
		return Approve2;
	}

	public WebElement getApprove3() {
		return Approve3;
	}

	public WebElement getQuestionDetail1() {
		return QuestionDetail1;
	}

	public WebElement getNewSubQuestionBtn() {
		return NewSubQuestionBtn;
	}

	public WebElement getClose() {
		return close;
	}

	public WebElement getRevise() {
		return Revise;
	}

	public WebElement getQuestionDetail2() {
		return QuestionDetail2;
	}

	public WebElement getSubSectionValue() {
		return SubSectionValue;
	}

	public WebElement getApplicableforreason() {
		return Applicableforreason;
	}

	public WebElement getQuestions() {
		return Questions;
	}

	public WebElement getDisplayResult() {
		return DisplayResult;
	}

	public WebElement getReviewTemplate() {
		return ReviewTemplate;
	}

	public WebElement getNewSourcingBtn() {
		return NewSourcingBtn;
	}

	public WebElement getSourcingExtraColumn() {
		return sourcingExtraColumn;
	}

	public WebElement getReviewtemp() {
		return reviewtemp;
	}

	public WebElement getSelectQuestion() {
		return selectQuestion;
	}

	public WebElement getSelectdropdown() {
		return selectdropdown;
	}

	public WebElement getSelectQuestions() {
		return selectQuestions;
	}

	public WebElement getChkbox() {
		return chkbox;
	}

	public WebElement getPlusIcon_1() {
		return PlusIcon_1;
	}

	public WebElement getRoutTemp_Name() {
		return routTemp_Name;
	}

	public WebElement getRouting_AddCapabilty() {
		return Routing_AddCapabilty;
	}

	public WebElement getToolbar() {
		return Toolbar;
	}

	public WebElement getAddCapExpand() {
		return AddCapExpand;
	}

	public WebElement getRoutingCapCopy() {
		return RoutingCapCopy;
	}

	public WebElement getFactories() {
		return Factories;
	}

	public WebElement getFactChkBx() {
		return FactChkBx;
	}

	public WebElement getQuoteName() {
		return QuoteName;
	}

	public WebElement getHtsQuoteBtn() {
		return HtsQuoteBtn;
	}

	public WebElement getIndiaHtsChkBx() {
		return IndiaHtsChkBx;
	}

	public WebElement getCost_Scenario() {
		return Cost_Scenario;
	}

	public WebElement getManageCostScenario() {
		return ManageCostScenario;
	}

	public WebElement getQuoteViews() {
		return QuoteViews;
	}

	public WebElement getQuoteManageViews() {
		return QuoteManageViews;
	}

	public WebElement getCustomValue() {
		return customValue;
	}

	public WebElement getFixed() {
		return Fixed;
	}

	public WebElement getVariable() {
		return Variable;
	}

	public WebElement getLabour_rate() {
		return Labour_rate;
	}

	public WebElement getFixed_rate() {
		return Fixed_rate;
	}

	public WebElement getVariable_rate() {
		return variable_rate;
	}

	public WebElement getMaterialCostBtn() {
		return materialCostBtn;
	}

	public WebElement getQty() {
		return Qty;
	}

	public WebElement getSupplier_Quote() {
		return supplier_Quote;
	}

	public WebElement getFob() {
		return Fob;
	}

	public WebElement getSpecTemp() {
		return SpecTemp;
	}

	public WebElement getDataPacktempBtn() {
		return DataPacktempBtn;
	}

	public WebElement getDPTValue() {
		return DPTValue;
	}

	public WebElement getDPTType() {
		return DPTType;
	}

	public WebElement getShipment() {
		return shipment;
	}

	public WebElement getNewshipmentBtn() {
		return NewshipmentBtn;
	}

	public WebElement getRequesDate() {
		return requesDate;
	}

	public WebElement getCurrentDate() {
		return currentDate;
	}

	public WebElement getConfirmedDate() {
		return confirmedDate;
	}

	public WebElement getConfiDate() {
		return confiDate;
	}
	
	public WebElement getConfiDate1() {
		return confiDate1;
	}

	public WebElement getExpecteDate() {
		return expecteDate;
	}

	public WebElement getExpecDate() {
		return ExpecDate;
	}
	
	public WebElement getExpecDate1() {
		return ExpecDate1;
	}

	public WebElement getPortofshipment() {
		return portofshipment;
	}

	public WebElement getShipTo() {
		return shipTo;
	}

	public WebElement getSeasonsourcing() {
		return seasonsourcing;
	}

	public WebElement getSupplierquotes() {
		return supplierquotes;
	}

	public WebElement getNewPriceList() {
		return newPriceList;
	}

	public WebElement getNewSuplrqute() {
		return newSuplrqute;
	}

	public WebElement getColorSIze() {
		return colorSIze;
	}

	public WebElement getSuppItemColorSel() {
		return SuppItemColorSel;
	}

	public WebElement getSuppItemDialog() {
		return SuppItemDialog;
	}

	public WebElement getBlueChkBx() {
		return BlueChkBx;
	}

	public WebElement getGreenChkBx() {
		return GreenChkBx;
	}

	public WebElement getSizes() {
		return Sizes;
	}

	public WebElement getSuppSizesDialog() {
		return SuppSizesDialog;
	}

	public WebElement getNewSupplQteName() {
		return NewSupplQteName;
	}

	public WebElement getSelectSet() {
		return selectSet;
	}

	public WebElement getSelectsetBtn() {
		return selectsetBtn;
	}

	public WebElement getSelectsetvalue() {
		return selectsetvalue;
	}

	public WebElement getApparealcoroandsizename() {
		return Apparealcoroandsizename;
	}

	public WebElement getNewproductbendcost() {
		return newproductbendcost;
	}

	public WebElement getProductPlusIcon() {
		return ProductPlusIcon;
	}

	public WebElement getBlendcostcheckbox() {
		return blendcostcheckbox;
	}

	public WebElement getBlendcostAction() {
		return BlendcostAction;
	}

	public WebElement getSelectsuppQuotes() {
		return selectsuppQuotes;
	}

	public WebElement getSelectsupquotechecckbox() {
		return selectsupquotechecckbox;
	}

	public WebElement getSupplierrequest() {
		return supplierrequest;
	}

	public WebElement getNewsupplierrequestbtn() {
		return newsupplierrequestbtn;
	}

	public WebElement getSrttemplateExpand() {
		return srttemplateExpand;
	}

	public WebElement getSupplierreqvalue() {
		return supplierreqvalue;
	}

	public WebElement getAddproduct() {
		return Addproduct;
	}

	public WebElement getAddprodcutcheckbox() {
		return Addprodcutcheckbox;
	}

	public WebElement getSupplierreq() {
		return supplierreq;
	}

	public WebElement getAddproductExpand() {
		return AddproductExpand;
	}

	public WebElement getNewInspirationStyle() {
		return newInspirationStyle;
	}

	public WebElement getNewinspirationstyleValue() {
		return newinspirationstyleValue;
	}

	public WebElement getSupplierQuteViews() {
		return SupplierQuteViews;
	}

	public WebElement getSupplierQteManageViews() {
		return SupplierQteManageViews;
	}

	public WebElement getAdoptedStyle() {
		return AdoptedStyle;
	}

	public WebElement getAdoption() {
		return Adoption;
	}

	public WebElement getCopyTemplate() {
		return copyTemplate;
	}

	public WebElement getNewstylecopytemplatebtn() {
		return newstylecopytemplatebtn;
	}

	public WebElement getStylecopytempvalue() {
		return stylecopytempvalue;
	}

	public WebElement getStyletypevalue() {
		return styletypevalue;
	}

	public WebElement getCopTemViews() {
		return CopTemViews;
	}

	public WebElement getCopTemManViews() {
		return CopTemManViews;
	}

	public WebElement getOKforAdoption() {
		return OKforAdoption;
	}

	public WebElement getOkforadoptionchecckbox() {
		return okforadoptionchecckbox;
	}

	public WebElement getSuppRequstName() {
		return SuppRequstName;
	}
	
	public WebElement getSuppRequstName1() {
		return SuppRequstName1;
	}

	public WebElement getSupplierRequestPlus() {
		return SupplierRequestPlus;
	}

	public WebElement getActionAdoption() {
		return ActionAdoption;
	}

	public WebElement getAdoptAsstyle() {
		return AdoptAsstyle;
	}

	public WebElement getAdoptCopy() {
		return AdoptCopy;
	}

	public WebElement getSupplierQteValue() {
		return SupplierQteValue;
	}

	public WebElement getMassadoptasstyle() {
		return massadoptasstyle;
	}


	@FindBy(xpath="//span[text()='Supplier PO' or @data-csi-tab-name='Supplier PO']")
	private WebElement supplierpo;

	@FindBy(xpath="//span[text()='PO Group' or@data-csi-tab-name='PO Group']")
	private WebElement pogroup;

	@FindBy(xpath="//div[contains(text(),'New PO Group')]")
	private WebElement newpogroupbtn;

	@FindBy(xpath="//td[contains(@data-csi-heading,'PurchasedOrders')]//following::td//span[text()='close']")
	private WebElement deletepogroup;

	@FindBy(xpath="(//td[contains(@data-csi-heading,'PurchasedOrders')]//following-sibling::td[contains(@class,'extra-column')])")
	private WebElement extracolumn;

	@FindBy(xpath="(//span[text()='Supplier PO' or @data-csi-tab-name='Supplier PO'])[2]")
	private WebElement supplierpotab;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'PurchasedOrders')]//div/div)[2]")
	private WebElement newsupplierpobtn;

	@FindBy(xpath="//div[contains(@data-csi-automation,'PurchasedOrder-Form-Node')]//div[2]/div/input")
	private WebElement supplierPOVaule;

	@FindBy(xpath="//div[@data-csi-automation='field-PurchasedOrder-Form-POSupplier']/div[1]/input")
	private WebElement supplierexpand;

	@FindBy(xpath="//div[@data-csi-automation='field-PurchasedOrder-Form-POSupplier']//div[text()='Supplier']")
	private WebElement suppliervalue;

	@FindBy(xpath="//div[@data-csi-automation='field-PurchasedOrder-Form-POFactory']/div[1]/input")
	private WebElement factoryexpand;

	@FindBy(xpath="//div[@data-csi-automation='field-PurchasedOrder-Form-POFactory']/div[text()='Los Angels Factory']")
	private WebElement factoryvaluepo;

	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save & Go'])")
	private WebElement SAVEANDGO;

	@FindBy(xpath="//tr[@data-csi-form-field='OrdersByColor']//div/div/input")
	private WebElement colorbasedcheckbox;

	@FindBy(xpath="//td[contains(@data-csi-heading,'Parent')]")
	private WebElement pohead;

	@FindBy(xpath="//td[contains(@data-csi-act,'CommissionPercentage')]")
	private WebElement commissionrate;

	@FindBy(xpath="//td[contains(@data-csi-act,'PaymentTerm')]")
	private WebElement paymentterm;

	@FindBy(xpath="(//div[contains(text(),'New Divider')])[2]")
	private WebElement newdividerbtn;

	@FindBy(xpath="(//table[@data-csi-automation='placeholder-PurchasedOrder-Orders-ActionsNew']//td[2])[1]")
	private WebElement newdeviceexpand;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'placeholder-PurchasedOrder')]//tr/td[2])[2]")
	private WebElement newcolorwayorder;

	@FindBy(xpath="//span[@data-csi-automation='plugin-BasePurchaseOrder-OrderSelectColorways-filter']//span[2]/span")
	private WebElement reset;

	@FindBy(xpath="//span[@data-csi-automation='filter-BasePurchaseOrder-OrderSelectColorways-Node Name:Child:Style']/span")
	private WebElement styleselect;

	@FindBy(xpath="//div/label[contains(text(),'Apparel')]//parent::div/div/input")
	private WebElement apparealcheckbox;

	@FindBy(xpath="/span[text()='New Colorways Order']")
	private WebElement colorwayordername;

	@FindBy(xpath="//td[text()='Blue Color faded']//parent::tr/td/div/input")
	private WebElement bluecheckbox1;

	@FindBy(xpath="//td[text()='Green Color faded']//parent::tr/td/div/input")
	private WebElement greencheckbox1;

	@FindBy(xpath="//div[contains(@class,'title-PurchasedOrder-Orders') and text()='Orders']")
	private WebElement header;

	@FindBy(xpath="//td[text()='Blue Color faded']//following-sibling::td[contains(@data-csi-act,'OrderQuote')]/preceding-sibling::td[@data-csi-heading='Description::0']")
	private WebElement b_supplierquote;

	@FindBy(xpath="//td[text()='Blue Color faded']//parent::tr/td[contains(@data-csi-act,'DiscountPct')]")
	private WebElement b_discountpct;

	@FindBy(xpath="//td[text()='Blue Color faded']//parent::tr/td[contains(@data-csi-act,'DiscountValue')]")
	private WebElement b_discountvalue;

	@FindBy(xpath="//div[contains(@class,'scrollbar')]//span[text()='+']/parent::div")
	private WebElement plusicon;

	@FindBy(xpath="//td[text()='Blue Color faded']//parent::tr/td[contains(@data-csi-act,'AllowancePct')]")
	private WebElement b_allowancepercentage;

	@FindBy(xpath="//td[text()='Blue Color faded']//parent::tr/td[contains(@data-csi-act,'AllowanceValue')]")
	private WebElement b_allowancevalue;

	@FindBy(xpath="//td[text()='Green Color faded']//following-sibling::td[contains(@data-csi-act,'OrderQuote')]/preceding-sibling::td[@data-csi-heading='Description::0']")
	private WebElement g_supplierquote;

	@FindBy(xpath="//td[text()='Green Color faded']//parent::tr/td[contains(@data-csi-act,'DiscountPct')]")
	private WebElement g_discountpct;

	@FindBy(xpath="//td[text()='Green Color faded']//parent::tr/td[contains(@data-csi-act,'DiscountValue')]")
	private WebElement g_discountvalue;

	@FindBy(xpath="//td[text()='Green Color faded']//parent::tr/td[contains(@data-csi-act,'AllowancePct')]")
	private WebElement g_allowancepercentage;

	@FindBy(xpath="//td[text()='Green Color faded']//parent::tr/td[contains(@data-csi-act,'AllowanceValue')]")
	private WebElement g_allowancevalue;

	@FindBy(xpath="//td[contains(@data-csi-heading,'POHeader')]")
	private WebElement POHeader;

	@FindBy(xpath="//div/a[text()='Edit']")
	private WebElement Edit;

	@FindBy(xpath="//div[contains(@class,'element')]")
	private WebElement EditText;

	@FindBy(xpath="//div[contains(@data-csi-heading,'Instructions')]")
	private WebElement Instruction;

	@FindBy(xpath="//span[text()='New Comment']")
	private WebElement Newcomment;
	
	@FindBy(xpath="//div[contains(@title,'Comments')]/div")
	private WebElement comments;

	@FindBy(xpath="//label[text()='Subject']//following-sibling::div/input")
	private WebElement Newcommentsubject;

	@FindBy(xpath="//span[text()='Orders' and @data-csi-tab-name='Orders']")
	private WebElement orders;

	@FindBy(xpath="(//td[text()='Blue Color faded']/following-sibling::td[contains(@data-csi-heading,'UnitsPerSize')]//span[@class='attrPrimary'])")
	private WebElement BlueUnitPerSize;

	@FindBy(xpath="//td[text()='Green Color faded']/following-sibling::td[contains(@data-csi-heading,'UnitsPerSize')]//span[@class='attrPrimary'])")
	private WebElement GreenUnitPerSize;

	@FindBy(xpath="(//td[text()='Green Color faded']/following-sibling::td[4])[2]")
	private WebElement poextracolumn1;

	@FindBy(xpath="(//td[text()='Blue Color faded']/following-sibling::td[contains(@data-csi-heading,'UnitPerPack')])[2]")
	private WebElement unitpackBlue2;

	@FindBy(xpath="(//td[text()='Green Color faded']/following-sibling::td[contains(@data-csi-heading,'UnitPerPack')])[2]")
	private WebElement unitpackGreen2;

	@FindBy(xpath="(//td[text()='Blue Color faded']/following-sibling::td[contains(@data-csi-heading,'UnitPerPack')])")
	private WebElement unitpackBlue1;

	@FindBy(xpath="(//td[text()='Green Color faded']/following-sibling::td[contains(@data-csi-heading,'UnitPerPack')])")
	private WebElement unitpackGreen1;

	@FindBy(xpath="(//div[contains(@class,'scrollbar')]//span[text()='+']/parent::div)[2]")
	private WebElement plusicon2;

	@FindBy(xpath="//span[text()='Summary' or @data-csi-tab-name='Summary']")
	private WebElement ordersummary;

	@FindBy(xpath="//span[text()='Shipment' or @data-csi-tab-name='Shipment']")
	private WebElement poshipment;

	@FindBy(xpath="(//table[@data-csi-automation='plugin-PurchasedOrder-Shipment-ToolbarNewActions']//td[2])[1]")
	private WebElement newshipmentexpand;

	@FindBy(xpath="//table[@data-csi-automation='plugin-PurchasedOrder-Shipment-ToolbarNewActions']//td[contains(text(),'Select Shipment')]")
	private WebElement selectshipment;

	@FindBy(xpath="//span[text()='Select Shipment']//parent::div//parent::div//table//tr//td[text()='Fedex']//preceding-sibling::td/div/input")
	private WebElement checkbox;

	@FindBy(xpath="//table[@data-csi-automation='plugin-ShipmentTerms-ShipmentOrders-ToolbarNewActions']//div[contains(text(),'New Shipment Order')]")
	private WebElement newshipmentorder;

	@FindBy(xpath="//td[text()='Blue Color faded']//parent::tr/td[5]")
	private WebElement blueshipmentqty;

	@FindBy(xpath="//td[text()='Green Color faded']//parent::tr/td[5]")
	private WebElement greenShipmentqty;

	@FindBy(xpath="(//td[text()='Blue Color faded']//parent::tr/td[5])[2]")
	private WebElement blueshipmentqty1;

	
	@FindBy(xpath="(//td[text()='Green Color faded']//parent::tr/td[5])[2]")
	private WebElement greenShipmentqty1;

	@FindBy(xpath="//span[text()='Quality Control' or @data-csi-tab-name='Quality Control']")
	private WebElement qualitycontrol;

	@FindBy(xpath="//table[@data-csi-automation='plugin-ShipmentTerms-ShipmentQCIssues-ToolbarNewActions']//div[contains(text(),'New QC Issue')]")
	private WebElement newQCIssue;

	@FindBy(xpath="//td[text()='qc issue']//following-sibling::td[contains(@class,'action')]/div/span[text()='content_copy']")
	private WebElement qccopy;

	/*@FindBy(xpath="//span[text()='Select Sets' and @data-csi-tab='Selectable-SelectSets']")
	private WebElement selectset;

	@FindBy(xpath="//table[@data-csi-automation='plugin-Selectable-SelectSets-ToolbarNewActions']//div[contains(text(),'New Select Set')]")
	private WebElement newselectsetbtn;

	@FindBy(xpath="//div[@data-csi-automation='field-SelectSet-Form-Node Name']//div[2]/div/input")
	private WebElement selectsetvalue;*/

	@FindBy(xpath="//span[text()='Customer PO' or @data-csi-tab-name='Customer PO']")
	private WebElement customerPO;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'CustomerPurchaseOrders')]//div/div)[2]")
	private WebElement newcustomerPObtn;

	@FindBy(xpath="//div[@data-csi-automation='field-CustomerPurchaseOrder-Form-Node Name']//div[2]/div/input")
	private WebElement customerPOvalue;

	@FindBy(xpath="//div[@data-csi-automation='field-CustomerPurchaseOrder-Form-POCustomer']//div[1]/input")
	private WebElement customerexpand;

	@FindBy(xpath="//div[@data-csi-automation='field-CustomerPurchaseOrder-Form-POCustomer']/div[contains(text(),'get')]")
	private WebElement selecttarget;

	@FindBy(xpath="(//table[@data-csi-automation='plugin-CustomerPurchaseOrder-Orders-ToolbarNewActions']//td[2])[1]")
	private WebElement newdividerexpand;

	@FindBy(xpath="(//table[@data-csi-automation='plugin-CustomerPurchaseOrder-Orders-ToolbarNewActions']/tbody/tr/td[2])[2]")
	private WebElement newcolorwaybtn;

	@FindBy(xpath="//td[text()='Blue Color faded']//parent::tr/td[contains(@data-csi-act,'Quantity::0')]")
	private WebElement b_quantity;

	@FindBy(xpath="//td[text()='Blue Color faded']//parent::tr/td[contains(@data-csi-act,'BasePrice')]")
	private WebElement b_baseprice;

	@FindBy(xpath="//td[text()='Green Color faded']//parent::tr/td[contains(@data-csi-act,'Quantity::0')]")
	private WebElement g_quantity;

	@FindBy(xpath="//td[text()='Green Color faded']//parent::tr/td[contains(@data-csi-act,'BasePrice')]")
	private WebElement g_baseprice;

	@FindBy(xpath="//span[text()='Properties' and @data-csi-tab-name='Properties']")
	private WebElement properties;

	@FindBy(xpath="//td[contains(@class,'firstColumn') and @data-csi-heading='Node Name::0']/a [text()='winter season']")
	private WebElement winterseason;

	@FindBy(xpath="//a[text()='Apparel - Color and Size']")
	private WebElement colorandsizename;

	@FindBy(xpath="//span[text()='POs' or @data-csi-tab-name='POs']")
	private WebElement Pos;

	@FindBy(xpath="//span[text()='Supplier POs' or @data-csi-tab-name='Supplier POs']")
	private WebElement supplierpos;

	@FindBy(xpath="//span[@data-csi-act='POToNegotiation' and text()='arrow_forward']")
	private WebElement Negotiationarrow;

	@FindBy(xpath="//span[@data-csi-act='POToReady' and text()='arrow_forward']")
	private WebElement ReadyArrow;

	@FindBy(xpath="//span[@data-csi-act='POToIssued' and text()='arrow_forward']")
	private WebElement issuedArrow;

	@FindBy(xpath="//span[text()='Customer POs' or @data-csi-tab-name='POs']")
	private WebElement customerpos;

	@FindBy(xpath="(//div[@class='footContent']/div[contains(text(),'Displaying')])")
	private WebElement display;

	@FindBy(xpath="//td[contains(text(),'COPY')]//following-sibling::td[contains(@class,'action')]/div/span[@data-csi-act='Delete']")
	private WebElement qcdelete;
	
	@FindBy(xpath="//span[text()='Error']")
	private WebElement errormsg;
	
	@FindBy(xpath="//td[text()='Blue Color faded']//following-sibling::td[contains(@data-csi-heading,'OrderQuote')]/a")
	private WebElement Blue_supplierquote;

	@FindBy(xpath="//td[text()='Green Color faded']//following-sibling::td[contains(@data-csi-heading,'OrderQuote')]/a")
	private WebElement Green_supplierquote;
	
	@FindBy(xpath="//span[text()='Style' or @data-csi-tab-name='Style']")
	private WebElement StyleUpdate;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-Sample-Form-Supplier')]/div)[1]")
	private WebElement SampleSupplier;
	
	@FindBy(xpath="(//a[contains(text(),'Changshu')]/parent::td[@data-csi-heading='Node Name::0'])[1]")
	private WebElement nameModify1;
	
	@FindBy(xpath="(//a[contains(text(),'Changshu')]/parent::td[@data-csi-heading='Node Name::0'])[2]")
	private WebElement nameModify2;
	
	@FindBy(xpath="(//a[contains(text(),'Frontline')]/parent::td[@data-csi-heading='Node Name::0'])[1]")
	private WebElement nameModify3;
	
	@FindBy(xpath="(//a[contains(text(),'Frontline')]/parent::td[@data-csi-heading='Node Name::0'])[2]")
	private WebElement nameModify4;
	
	@FindBy(xpath="(//a[contains(text(),'Supplier')]/parent::td[@data-csi-heading='Node Name::0'])[1]")
	private WebElement nameSuModify1;
	
	@FindBy(xpath="(//a[contains(text(),'Supplier')]/parent::td[@data-csi-heading='Node Name::0'])[2]")
	private WebElement nameSuModify2;
	
	public WebElement getNameSuModify1() {
		return nameSuModify1;
	}

	public WebElement getNameSuModify2() {
		return nameSuModify2;
	}
	
	public WebElement getNameModify3() {
		return nameModify3;
	}

	public WebElement getNameModify4() {
		return nameModify4;
	}


	@FindBy(xpath="//td[@data-csi-heading='Node Name::0']")
	private WebElement element;
	
	public WebElement getElement() {
		return element;
	}
	
	@FindBy(xpath="//td[@data-csi-heading='Node Name:Child:__Parent__:0']")
	private WebElement element1;
	
	public WebElement getElement1() {
		return element1;
	}

	@FindBy(xpath="(//span[contains(@data-csi-automation,'filter-Style-ProductSamples-Node Name')]/span)[1]")
	private WebElement StySampleFilter;
	
	@FindBy(xpath="(//span[contains(@class,'material-icons')  and text()='add'])[1]")
	private WebElement selectValue;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'filter-Style-ProductSamples-Node Name')]//div[contains(@class,'ArrowButton')])/following-sibling::div[2]/input)[1]")
	private WebElement searchValue;
	
	@FindBy(xpath="//div[contains(@data-csi-automation,'UseMatrix')]/input")
	private WebElement setMatrix;
	
	@FindBy(xpath="(//th[contains(text(),'Select')]//following-sibling::th)[1]//input[@tabindex='0']")
	private WebElement AllChckBx;
	
	@FindBy(xpath="(//div[@data-csi-automation='field-SupplierRequest-Form-SRSuppliers']//div)[1]")
	private WebElement SupplierSRreq;
	
	@FindBy(xpath="(//table[@data-csi-automation='plugin-SupplierRequest-StyleQuotes-ToolbarNewActions']/tbody/tr/td[2])[1]")
	private WebElement newsupplierreqExpand;
	
	@FindBy(xpath="(//table[@data-csi-automation='plugin-SupplierRequest-MaterialQuotes-ToolbarNewActions']/tbody/tr/td[2])[1]")
	private WebElement newsupplierreqMExpand;
	
	@FindBy(xpath="(//span[contains(@data-csi-automation,'SupplierRequest-SRLineItemProductSupplierItems-Node Name')]/span)[2]")
	private WebElement SR_SQ_Filter;
	
	@FindBy(xpath="//span[(text()='Product')]//parent::div/parent::th/preceding-sibling::th//input")
	private WebElement DeleteAllChkBx;
	
	@FindBy(xpath="(//div[contains(@class,'SupplierRequest')]//td[@data-csi-heading='Node Name::0'])[2]")
	private WebElement nameSQmodify1;
	
	@FindBy(xpath="(//div[contains(@class,'SupplierRequest')]//td[@data-csi-heading='Node Name::0'])[3]")
	private WebElement nameSQmodify2;
	
	@FindBy(xpath="(//div[contains(@class,'SupplierRequest')]//td[@data-csi-heading='Node Name::0'])[4]")
	private WebElement nameSQmodify3;
	
	@FindBy(xpath="(//div[contains(@class,'SupplierRequest')]//td[@data-csi-heading='Node Name::0'])[5]")
	private WebElement nameSQmodify4;
	
	@FindBy(xpath="(//div[contains(@class,'SupplierRequest')]//td[@data-csi-heading='Node Name::0'])[6]")
	private WebElement nameSQmodify5;
	
	@FindBy(xpath="(//span[contains(@data-csi-automation,'filter-SupplierRequest-StyleQuotes-Node Name:Child:__Parent__/Child:Supplier')]/span)[1]")
	private WebElement SR_SQ_SuppFilter;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'SupplierRequest-StyleSamples')]/tbody/tr/td[2])[1]")
	private WebElement newSampleExpand;
	
	@FindBy(xpath="//td[text()='Select Samples']")
	private WebElement selectSamples;
	
	@FindBy(xpath="(//span[contains(@data-csi-automation,'SupplierRequest-SRSuppliersStyleSamples-Node Name')]/span)[2]")
	private WebElement SR_SA_Filter;
	
	@FindBy(xpath="//span[(text()='Style')]//parent::div/parent::th/preceding-sibling::th//input")
	private WebElement DeleteAllChkBx1;
	
	@FindBy(xpath="//span[contains(@data-csi-automation,'plugin-SupplierRequest-StyleSamples-CustomViewActions')]//span[text()='Views']")
	private WebElement SampleViews;
	
	@FindBy(xpath="//tr[contains(@data-csi-automation,'plugin-SupplierRequest-StyleSamples-CustomViewManage')]//td[text()='Manage Views']")
	private WebElement SampleManViews;
	
	@FindBy(xpath="(//select[@class='csiPreferenceSelect '])[1]/option[text()='Product Supplier']")
	private WebElement ProductSupplier;
	
	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Up'])[1]")
	private WebElement UPBtn;
	
	@FindBy(xpath="(//a[contains(text(),'Changshu')]//parent::td//following-sibling::td//div/span[text()='remove_circle_outline'])[1]")
	private WebElement DeleteChangshu;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Supplier-DeleteSupplierForm-DeleteQuotes']/input")
	private WebElement DeleteSuppQuotes;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Supplier-DeleteSupplierForm-DeleteSamples']/input")
	private WebElement DeleteSamples;
	
	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Remove'])[1]")
	private WebElement Remove;
	
	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Delete'])[1]")
	private WebElement Delete;
	
	@FindBy(xpath="(//span[contains(@data-csi-automation,'filter-SupplierRequest-StyleSamples-Node Name')]/span)[2]")
	private WebElement SR_SAM_Filters;
	
	@FindBy(xpath="//div[contains(@class,'SupplierRequest-StyleSamples')]//div[contains(@data-dojo-attach-event,'QueryMessageCount')]")
	private WebElement SRSampleCount;
	
	@FindBy(xpath="//div[contains(@class,'SupplierRequest-StyleQuotes')]//div[contains(@data-dojo-attach-event,'QueryMessageCount')]")
	private WebElement SRQuoteCount;
	
	@FindBy(xpath="(//a[contains(text(),'Supplier')]//parent::td//following-sibling::td//div/span[text()='remove_circle_outline'])[1]")
	private WebElement DeleteSupplier;
	
	@FindBy(xpath="(//span[contains(@data-csi-automation,'filter-StyleSourcing-SupplierItems-Node Name')]/span)[1]")
	private WebElement SupplierQuote_Filter;
	
	@FindBy(xpath="//div[contains(@class,'StyleSourcing-SupplierItems')]//div[contains(@data-dojo-attach-event,'QueryMessageCount')]")
	private WebElement SRQteCount;
	
	@FindBy(xpath="(//span[contains(@data-csi-automation,'filter-Style-ProductSamples-Node Name')]/span)[1]")
	private WebElement Sample_Filter;
	
	@FindBy(xpath="//div[contains(@class,'Style-ProductSamples')]//div[contains(@data-dojo-attach-event,'QueryMessageCount')]")
	private WebElement SampleCount;
	
	@FindBy(xpath="(//span[@data-csi-automation='plugin-SupplierRequest-Breadcrumb-Copy'])")
	private WebElement copySR;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'field-Sample-Form-RequestSampleQuantity')]/div)[2]/input)[1]")
	private WebElement quantityValue;
	
	@FindBy(xpath="//span[@data-csi-act='IssueRequest']")
	private WebElement arrowForward;
	
	@FindBy(xpath="(//td[contains(text(),'Only Size')]//preceding-sibling::td)[1]//input")
	private WebElement OnlySizecheckbox;
	
	@FindBy(xpath="(//td[@data-csi-heading='Node Name::0']/a[contains(text(),'Cotton/Rayon Jersey - Copy')])[1]")
	private WebElement CopyCottonName;
	
	@FindBy(xpath="(//td[contains(text(),'Red')]//preceding-sibling::td)[1]//input")
	private WebElement RedCheckbox;
	
	@FindBy(xpath="(//td[contains(@data-csi-heading,'Node Name::0')]//preceding-sibling::td)[1]//input")
	private WebElement ThirtySize;
	
	@FindBy(xpath="(//td[contains(@data-csi-heading,'Node Name::0')]//preceding-sibling::td)[2]//input")
	private WebElement ThirtyTwoSize;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Supplier Requests'and text()='Supplier Requests']")
	private WebElement MaterialSuppReq;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'SupplierRequest-Suppliers')]//div/div)[2]")
	private WebElement AddSuppliers;
	
	@FindBy(xpath="(//td[contains(text(),'Changshu')]//preceding-sibling::td)[1]//input")
	private WebElement ChangshuCheckbox;
	
	@FindBy(xpath="//div[contains(@class,'MaterialSourcing-SupplierItems')]//div[contains(@data-dojo-attach-event,'QueryMessageCount')]")
	private WebElement MRQuoteCount;
	
	@FindBy(xpath="(//td[@data-csi-heading='Node Name::0']/a[contains(text(),'SR')])[1]")
	private WebElement MaterialSRName;
	
	@FindBy(xpath="(//td[contains(text(),'Supplier')]//preceding-sibling::td)[1]//input")
	private WebElement SupplierCheckbox;
	
	@FindBy(xpath="(//td[contains(text(),'Supplier')]//preceding-sibling::td)[5]//input")
	private WebElement SupplierMatCheckbox;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'SupplierRequest-MaterialLineItems')]//div/div)[2]")
	private WebElement AddMaterialProduct;
	
	@FindBy(xpath="(//td[contains(text(),'Jersey')]//preceding-sibling::td)[1]//input")
	private WebElement JerseyChkbx;
	
	@FindBy(xpath="(//td[contains(text(),'Rayon Jersey')]//preceding-sibling::td)[1]//input")
	private WebElement Jersey2Chkbx;
	
	@FindBy(xpath="//div[contains(@class,'SupplierRequest-MaterialSamples')]//div[contains(@data-dojo-attach-event,'QueryMessageCount')]")
	private WebElement MRSampleCount;

	
	
	public WebElement getArrowForward() {
		return arrowForward;
	}

	public WebElement getOnlySizecheckbox() {
		return OnlySizecheckbox;
	}

	public WebElement getCopyCottonName() {
		return CopyCottonName;
	}

	public WebElement getRedCheckbox() {
		return RedCheckbox;
	}

	public WebElement getThirtySize() {
		return ThirtySize;
	}

	public WebElement getThirtyTwoSize() {
		return ThirtyTwoSize;
	}

	public WebElement getMaterialSuppReq() {
		return MaterialSuppReq;
	}

	public WebElement getAddSuppliers() {
		return AddSuppliers;
	}

	public WebElement getChangshuCheckbox() {
		return ChangshuCheckbox;
	}

	public WebElement getMRQuoteCount() {
		return MRQuoteCount;
	}

	public WebElement getMaterialSRName() {
		return MaterialSRName;
	}

	public WebElement getSupplierCheckbox() {
		return SupplierCheckbox;
	}
	
	public WebElement getSupplierMatCheckbox() {
		return SupplierMatCheckbox;
	}

	public WebElement getAddMaterialProduct() {
		return AddMaterialProduct;
	}

	public WebElement getJerseyChkbx() {
		return JerseyChkbx;
	}

	public WebElement getJersey2Chkbx() {
		return Jersey2Chkbx;
	}

	public WebElement getMRSampleCount() {
		return MRSampleCount;
	}

	public WebElement getQuantityValue() {
		return quantityValue;
	}

	public WebElement getStyleUpdate() {
		return StyleUpdate;
	}

	public WebElement getSampleSupplier() {
		return SampleSupplier;
	}

	public WebElement getNameModify1() {
		return nameModify1;
	}

	public WebElement getNameModify2() {
		return nameModify2;
	}

	public WebElement getStySampleFilter() {
		return StySampleFilter;
	}

	public WebElement getSelectValue() {
		return selectValue;
	}
	
	public WebElement getSearchValue() {
		return searchValue;
	}

	public WebElement getSetMatrix() {
		return setMatrix;
	}

	public WebElement getAllChckBx() {
		return AllChckBx;
	}

	public WebElement getSupplierSRreq() {
		return SupplierSRreq;
	}

	public WebElement getNewsupplierreqExpand() {
		return newsupplierreqExpand;
	}
	
	public WebElement getNewsupplierreqMExpand() {
		return newsupplierreqMExpand;
	}

	public WebElement getSR_SQ_Filter() {
		return SR_SQ_Filter;
	}

	public WebElement getDeleteAllChkBx() {
		return DeleteAllChkBx;
	}

	public WebElement getNameSQmodify1() {
		return nameSQmodify1;
	}

	public WebElement getNameSQmodify2() {
		return nameSQmodify2;
	}

	public WebElement getNameSQmodify3() {
		return nameSQmodify3;
	}

	public WebElement getNameSQmodify4() {
		return nameSQmodify4;
	}

	public WebElement getNameSQmodify5() {
		return nameSQmodify5;
	}

	public WebElement getSR_SQ_SuppFilter() {
		return SR_SQ_SuppFilter;
	}

	public WebElement getNewSampleExpand() {
		return newSampleExpand;
	}

	public WebElement getSelectSamples() {
		return selectSamples;
	}

	public WebElement getSR_SA_Filter() {
		return SR_SA_Filter;
	}

	public WebElement getDeleteAllChkBx1() {
		return DeleteAllChkBx1;
	}

	public WebElement getSampleViews() {
		return SampleViews;
	}

	public WebElement getSampleManViews() {
		return SampleManViews;
	}

	public WebElement getProductSupplier() {
		return ProductSupplier;
	}

	public WebElement getUPBtn() {
		return UPBtn;
	}

	public WebElement getDeleteChangshu() {
		return DeleteChangshu;
	}

	public WebElement getDeleteSuppQuotes() {
		return DeleteSuppQuotes;
	}

	public WebElement getDeleteSamples() {
		return DeleteSamples;
	}

	public WebElement getRemove() {
		return Remove;
	}

	public WebElement getDelete() {
		return Delete;
	}

	
	public WebElement getSR_SAM_Filters() {
		return SR_SAM_Filters;
	}

	public WebElement getSRSampleCount() {
		return SRSampleCount;
	}
	
	public WebElement getSRQuoteCount() {
		return SRQuoteCount;
	}

	public WebElement getDeleteSupplier() {
		return DeleteSupplier;
	}

	public WebElement getSupplierQuote_Filter() {
		return SupplierQuote_Filter;
	}

	public WebElement getSRQteCount() {
		return SRQteCount;
	}

	public WebElement getSample_Filter() {
		return Sample_Filter;
	}

	public WebElement getSampleCount() {
		return SampleCount;
	}

	public WebElement getCopySR() {
		return copySR;
	}

	public WebElement getShipmentPlus() {
		return shipmentPlus;
	}

	public WebElement getSupplierValue1() {
		return supplierValue1;
	}
	
	


}
