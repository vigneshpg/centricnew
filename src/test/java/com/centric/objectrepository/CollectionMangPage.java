package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class CollectionMangPage {
	
	
	public CollectionMangPage() {
		PageFactory.initElements(Commonactions.driver, this);
	}

	@FindBy(xpath="//input[@value='MarketingSegmentName']")
	private WebElement enum_marketingsegment;
	
	@FindBy(xpath="//td[contains(@data-csi-act,'LocaleName')]")
	private WebElement enum_displayname;
	
	@FindBy(xpath="(//span[text()='Currencies'])[1]")
	private WebElement currency;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'Data-Currency')]//div/div)[2]")
	private WebElement currencybtn;
	
	@FindBy(xpath="(//div[text()='New Currency']//following::span[@data-csi-act='Delete'])[1]")
	private WebElement currencydeletebtn;
	
	@FindBy(xpath="//span[text()='Delete Currency?']//following::span[text()='Cancel']")
	private WebElement currencycancel;
	
	@FindBy(xpath="(//span[text()='Currency Tables'])[1]")
	private WebElement CurrencyTable;
	
	@FindBy(xpath="(//td[contains(@data-csi-act,'CurrencyExchangeTable')])[1]")
	private WebElement Currencytable;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'Data-CurrencyTables')]//div/div)[2]")
	private WebElement Currencytablebtn;
	
	@FindBy(xpath="(//div//span[contains(text(),'Go to Dialog')])")
	private WebElement gotodialog;
	
	@FindBy(xpath="(//td[contains(text(),'Dollar')]//preceding-sibling::td)//input")
	private WebElement Dollar;
	
	@FindBy(xpath="(//td[contains(text(),'Rupee')]//preceding-sibling::td)//input")
	private WebElement Rupee;
	
	@FindBy(xpath="//td[@data-csi-heading='Node Name::0']/a")
	private WebElement Currencyname;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'CurrencyExchangeTable-ExchangeRates')]//div/div)[2]")
	private WebElement newfromcurrencybtn;
	
	@FindBy(xpath="//span[text()='Sales Setup']")
	private WebElement salessetup;
	
	@FindBy(xpath="//span[text()='Sales Markets']")
	private WebElement salesmarket;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'SalesMarkets')]//div/div)[2]")
	private WebElement salesmarketbtn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'SalesMarket')]/div)/div/input)[1]")
	private WebElement salemarketvalue;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'SalesMarket-Form-Currency')])/div[3]/input[1]")
	private WebElement currencyvalue;
	
	@FindBy(xpath="//span[text()='Sales Divisions']")
	private WebElement saledivision;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'SalesDivisions')]//div/div)[2]")
	private WebElement salesdivisionbtn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'SalesDivision')]/div)/div/input)[1]")
	private WebElement salesdivisionvalue;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'SourcingItem-Contacts')]//div/div)[2]")
	private WebElement newcontactbtn;
	
	@FindBy(xpath="((//a[text()='michel']/parent::td[@data-csi-act='Node Name::0'])/following-sibling::td/div/span[text()='content_copy'])[1]")
	private WebElement copycontact;
	
	@FindBy(xpath="//a[contains(text(),'COPY')]//following::span[@data-csi-act='Delete']")
	private WebElement deletecontact;
	
	@FindBy(xpath="(//span[text()='Sales Divisions'])[2]")
	private WebElement saledivision2;
	
	@FindBy(xpath="//span[contains(@data-csi-tab-name,'Marketing Collections') or text()='Marketing Collections']")
	private WebElement marketingcollection ;
	
	@FindBy(xpath="//span[contains(@data-csi-tab-name,'Marketing Looks') or text()='Marketing Looks']")
	private WebElement MarketingLook;
	
	@FindBy(xpath="//span[contains(@data-csi-tab-name,'Marketing Tools') or text()='Marketing Tools']")
	private WebElement MarketingTool;
	
	@FindBy(xpath="//span[contains(@data-csi-tab-name,'Sales Order') or text()='Sales Order']")
	private WebElement SalesOrder;
	
	@FindBy(xpath="//span[contains(@data-csi-tab-name,'Sales Order Groups') or text()='Sales Order Groups']")
	private WebElement salesordergroup;
	
	@FindBy(xpath="//span[contains(@data-csi-tab-name,'Catalog Configuration') or text()='Catalog Configuration']")
	private WebElement catalogconfig;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'MarketingLooks')]//div/div)[2]")
	private WebElement marketinglookbtn;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'MarketingTools')]//div/div)[2]")
	private WebElement marketingtoolbtn;
	
	@FindBy(xpath="//a[contains(text(),'Banner')]//following::div/input[@type='checkbox']")
	private WebElement bannercheckbox;
	
	@FindBy(xpath="//a[contains(text(),'Canoply')]//following::div/input[@type='checkbox']")
	private WebElement canoplycheckbox;
	
	@FindBy(xpath="//a[contains(text(),'Canoply')]//following::span[@data-csi-act='Delete']")
	private WebElement canoplydelete;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'MarketingCollections')]//div/div)[2]")
	private WebElement marketingcoll_btn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'MarketingCollection')]/div)/div/input)[1]")
	private WebElement marketingcollvalue;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'MarketingCollection-Form-BaseCurrency')])/div/input)[3]")
	private WebElement marketingcurrenyvalue;

	@FindBy(xpath="//span[contains(@data-csi-tab-name,'Marketing Products') or  text()='Marketing Products']")
	private WebElement marketingproduct;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'MCProducts')])[1]//tbody/tr/td[2]")
	private WebElement MProductExpand;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'MCProducts')])//td[text()='New from Style']")
	private WebElement newfromstyle;
	
	@FindBy(xpath="(//td[contains(text(),'Color and Size')]//preceding-sibling::td)//input")
	private WebElement apparelcolorandsizecheckbox;
	
	@FindBy(xpath="(//a//parent::td//following::td[contains(@data-csi-act,'LocalizedName')])[1]")
	private WebElement localizedname;
	
	@FindBy(xpath="//div[contains(@class,'scrollbar')]//span[text()='+']/parent::div")
	private WebElement scrollicon;
	
	@FindBy(xpath="(//a//parent::td//following::td[contains(@data-csi-act,'Code')])[1]")
	private WebElement MPcode;
	
	@FindBy(xpath="(//a//parent::td//following::td[contains(@data-csi-act,'WholesalePrice')])[1]")
	private WebElement wholesaleprice;
	
	@FindBy(xpath="(//a//parent::td//following::td[contains(@data-csi-act,'RetailPrice')])[1]")
	private WebElement retailproce;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'MCProduct')]//div/div)[2]")
	private WebElement marketingproductbtn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'MCProduct')]/div)/div/input)[1]")
	private WebElement marketingproductvalue;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'MCProduct-Form-Code')]/div)/div/input)[1]")
	private WebElement marketingproductcode;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'MCProduct-Form-ProductStyleType')])//div[3]/input[1]")
	private WebElement styletype;
	
	@FindBy(xpath="//td[contains(@data-csi-act,'WholesalePrice')]")
	private WebElement MPrdtWSP;
	
	@FindBy(xpath="//td[contains(@data-csi-act,'RetailPrice')]")
	private WebElement MPRetailPrice;
	
	@FindBy(xpath="//td[contains(@data-csi-act,'MCSizeRange')]")
	private WebElement MPsizeRange;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'MCProductColors')]//div/div)[2]")
	private WebElement newmarketingcolorway;
	
	@FindBy(xpath="((//a[text()='Blue']/parent::td[@data-csi-act='Node Name::0'])/following-sibling::td/div/span[text()='content_copy'])[1]")
	private WebElement Bluecopy;
	
	@FindBy(xpath="//a[contains(text(),'Shirt')]")
	private WebElement Materialproductname;

	@FindBy(xpath="//span[contains(@data-csi-tab-name,'Marketing Materials') or text()='Marketing Materials']")
	private WebElement Marketingmaterial;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'MarketingCollection-MCMaterials')]//div/div)[2]")
	private WebElement NewfrommaterialBtn;
	
	@FindBy(xpath="(//span[contains(text(),'New from Material')]//following::div/input[@role='checkbox'])[1]")
	private WebElement Newfrommaterialcheckbox;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'MarketingCollection-MarketingLooks')]//div/div)[2]")
	private WebElement MarketingLookBtn;
	
	@FindBy(xpath="(//td[contains(text(),'Color and Size')]//preceding-sibling::td)//input")
	private WebElement colorsizecheckbox;
	
	@FindBy(xpath="(//td[contains(text(),'MP')]//preceding-sibling::td)//input")
	private WebElement MPcheckbox;
	
	@FindBy(xpath="(//a[contains(text(),'Apparel')]//parent::td//following::td[contains(@data-csi-act,'MainMaterial')])[1]")
	private WebElement Apparelmaterial;
	
	@FindBy(xpath="(//a[contains(text(),'MP')]//parent::td//following::td[contains(@data-csi-act,'MainMaterial')])[1]")
	private WebElement MPMaterial;
	
	@FindBy(xpath="//span[contains(@data-csi-tab-name,'Marketing Segments') or text()='Marketing Segments']")
	private WebElement marketingsegment;
	
	@FindBy(xpath="//span[contains(@data-csi-tab-name,'Marketing Collection') or text()='Marketing Collection']")
	private WebElement marketingColl;
	
	@FindBy(xpath="//td[contains(@data-csi-heading,'Segment')]")
	private WebElement segmentvalue;
	
	@FindBy(xpath="(//a[contains(text(),'Apparel')]//parent::td//following::td[contains(@data-csi-act,'MarketingSegment')])[1]")
	private WebElement segment1;
	
	@FindBy(xpath="(//a[contains(text(),'MP')]//parent::td//following::td[contains(@data-csi-act,'MarketingSegment')])[1]")
	private WebElement segment2;
	
	@FindBy(xpath="//span[@data-csi-act='CMReleaseToMarkets']")
	private WebElement Releasetomarket;
	
	@FindBy(xpath="//span[@data-csi-act='CMReleaseToCustomers']")
	private WebElement ReleasetoCustomer;
	
	@FindBy(xpath="//span[text()='Select Sales Markets']")
	private WebElement selectsalesmarket;
	
	@FindBy(xpath="(//td[contains(text(),'US')]//preceding-sibling::td)//input")
	private WebElement usmarketcheckbox;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'MarketingCollection-SalesCollections')])[2]")
	private WebElement pushmarketproduct;
	
	@FindBy(xpath="//td[contains(@data-csi-act,'State')]")
	private WebElement selectstate;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'SalesOrders')]//div/div)[2]")
	private WebElement NewSalesOrderbtn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'field-SalesOrder')]/div)/div/input)[1]")
	private WebElement salesorderValue;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'SalesOrder-Form-Market')]/div)[3]/input)[1]")
	private WebElement salesmarketvalue;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'field-SalesMarket-Form-Node')]/div)[2]/div/input)[1]")
	private WebElement salesmarketvalue1;
	
	@FindBy(xpath="//div[@data-csi-automation='field-MarketingCollection-Form-SKUBasedOrdering']/input")
	private WebElement SKUOrder;
	
	@FindBy(xpath="(//td[contains(@data-csi-act,'LocalizedName')])[1]")
	private WebElement LocalName;
	
	@FindBy(xpath="(//td[contains(@data-csi-act,'Code')])[1]")
	private WebElement code;
	
	@FindBy(xpath="//td[contains(@data-csi-act,'CurrencyExchangeTable::0')]")
	private WebElement currencyTable;
	
	@FindBy(xpath="(//td[contains(text(),'100% Cotton/Rayon Jersey')]//preceding-sibling::td)//input")
	private WebElement matAChkBx;
	
	@FindBy(xpath="(//td[contains(text(),'100% Cotton/Rayon Jersey - Copy')]//preceding-sibling::td)//input")
	private WebElement matBChkBx;
	
	@FindBy(xpath="//td[contains(@data-csi-act,'MainMaterial:Child:ToCustomer')]")
	private WebElement MPinmaterila;
	
	@FindBy(xpath="(//td[contains(@data-csi-act,'MainMaterialColor:Child') or contains(@data-csi-heading,'MainMaterialColor:Child:Colors')])[2]")
	private WebElement materialcolor;
	
	@FindBy(xpath="(//td[contains(text(),'Indian Market')]//preceding-sibling::td)//input")
	private WebElement indainmarketcheckbox;
	
	@FindBy(xpath="(//div[text()='Sales Markets']//following::td[contains(@data-csi-heading,'Node Name')]/a)[1]")
	private WebElement salemarketname;
	
	@FindBy(xpath="//td[contains(@data-csi-act,'SMCustomers')]")
	private WebElement SMCustomer;
	
	@FindBy(xpath="//label[contains(text(),'H&M')]//parent::div/div/input")
	private WebElement Hmchecckbox;
	
	@FindBy(xpath="//td[contains(@data-csi-act,'SMSalesDivisions')]")
	private WebElement SMSalesDivision;
	
	@FindBy(xpath="//label[contains(text(),'India - North')]//parent::div/div/input")
	private WebElement northcheckbox;
	
	@FindBy(xpath="//label[contains(text(),'India - South')]//parent::div/div/input")
	private WebElement southcheckbox;
	
	@FindBy(xpath="//span[contains(@data-csi-tab-name,'Sales Products') or text()='Sales Products']")
	private WebElement salesproduct;
	
	@FindBy(xpath="//span[contains(@data-csi-tab-name,'Promotions') or text()='Promotions']")
	private WebElement Promotion;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'SalesPromos')]//div/div)[2]")
	private WebElement salespromBtn;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-SalesOrder-Form-Seller')]/div[3]/input)[1]")
	private WebElement seller;
	
	@FindBy(xpath="//div[contains(@data-csi-automation,'field-SalesOrder-Form-Buyer')]/div[3]/input")
	private WebElement Buyer;
	
	@FindBy(xpath="//div[@data-csi-automation='field-SalesOrder-Form-SKUBasedOrder']/input")
	private WebElement SKUsalesorder;
	
	@FindBy(xpath="((//a[contains(text(),'Indian')]//parent::td)/following-sibling::td/div/span[text()='content_copy'])[1]")
	private WebElement Copy1;
	
	@FindBy(xpath="((//a[contains(text(),'Indian')]//parent::td)/following-sibling::td/div/span[text()='close'])[1]")
	private WebElement delete1;
	
	@FindBy(xpath="//span[contains(@data-csi-tab-name,'Marketing Tools') or text()='Marketing Tools']")
	private WebElement marketingtools;
	
	@FindBy(xpath="(//td[contains(text(),'Banner')]//preceding-sibling::td)//input")
	private WebElement Banercheckbox;
	
	@FindBy(xpath="(//div[@data-csi-automation='field-SalesOrderGroup-Form-Market']/div[3])/input[1]")
	private WebElement smvalue;
	
	@FindBy(xpath="(//div[@data-csi-automation='field-SalesOrderGroup-Form-Customer']/div[3])/input[1]")
	private WebElement smcustomer;
	
	public WebElement getBanercheckbox() {
		return Banercheckbox;
	}

	@FindBy(xpath="//td/a[contains(text(),'Indian')]")
	private WebElement salesordername;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'SalesOrder-LineItemsSKU')]//div/div)[2]")
	private WebElement salesskubtn;
	
	@FindBy(xpath="(//td[contains(text(),'Blue')]//preceding-sibling::td)//input")
	private WebElement bluecolorcheckbox;
	
	@FindBy(xpath="(//td[contains(text(),'Green')]//preceding-sibling::td)//input")
	private WebElement greencolorchecckbox;
	
	@FindBy(xpath="(//td[contains(@data-csi-heading,'Quantity')])[1]")
	private WebElement quantityblue;
	
	@FindBy(xpath="(//td[contains(@data-csi-heading,'Quantity')])[2]")
	private WebElement quantitygreen;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'SalesOrderGroups')]//div/div)[2]")
	private WebElement salesorderbutton;
	
	@FindBy(xpath="((//div[@data-csi-automation='field-SalesOrderGroup-Form-Node Name']/div)/div/input)[1]")
	private WebElement salesordervalue;
	
	@FindBy(xpath="(//div[@data-csi-automation='field-SalesOrderGroup-Form-Customer']/div[3])/input[1]")
	private WebElement customer;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'SalesOrderGroup')])[2]//tbody/tr/td[2]")
	private WebElement salesorderexpand;
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'SalesOrderGroup-SalesOrders')]//td[text()='Add Existing Sales Orders']")
	private WebElement Existingsalesorder;
	
	@FindBy(xpath="(//td[contains(text(),'TShirt')]//preceding-sibling::td)//input")
	private WebElement indinasalescheckbox;
	
	@FindBy(xpath="(//td/a[contains(text(),'South')])[1]")
	private WebElement southsalename;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'SalesOrder-LineItems')]//div/div)[2]")
	private WebElement salescolorwaybtn;
	
	@FindBy(xpath="//a[contains(text(),'Blue')]//following::span[text()='content_copy']")
	private WebElement bluecolorcopy;
	
	@FindBy(xpath="//td[contains(text(),'COPY')]//following::span[text()='close']")
	private WebElement bluedelete;
	
	@FindBy(xpath="(//td[@data-csi-act='WholesalePrice:Child:MCProductSKUs:0{MCProductSKUs}'])[1]")
	private WebElement SKUverify;

	public WebElement getEnum_marketingsegment() {
		return enum_marketingsegment;
	}

	public WebElement getEnum_displayname() {
		return enum_displayname;
	}

	public WebElement getCurrency() {
		return currency;
	}

	public WebElement getCurrencybtn() {
		return currencybtn;
	}

	public WebElement getCurrencydeletebtn() {
		return currencydeletebtn;
	}

	public WebElement getCurrencycancel() {
		return currencycancel;
	}

	public WebElement getCurrencyTable() {
		return CurrencyTable;
	}
	
	public WebElement getCurrencytable() {
		return Currencytable;
	}

	public WebElement getCurrencytablebtn() {
		return Currencytablebtn;
	}

	public WebElement getGotodialog() {
		return gotodialog;
	}

	public WebElement getDollar() {
		return Dollar;
	}

	public WebElement getRupee() {
		return Rupee;
	}

	public WebElement getCurrencyname() {
		return Currencyname;
	}

	public WebElement getNewfromcurrencybtn() {
		return newfromcurrencybtn;
	}

	public WebElement getSalessetup() {
		return salessetup;
	}

	public WebElement getSalesmarket() {
		return salesmarket;
	}

	public WebElement getSalesmarketbtn() {
		return salesmarketbtn;
	}

	public WebElement getSalemarketvalue() {
		return salemarketvalue;
	}

	public WebElement getCurrencyvalue() {
		return currencyvalue;
	}

	public WebElement getSaledivision() {
		return saledivision;
	}

	public WebElement getSalesdivisionbtn() {
		return salesdivisionbtn;
	}

	public WebElement getSalesdivisionvalue() {
		return salesdivisionvalue;
	}

	public WebElement getNewcontactbtn() {
		return newcontactbtn;
	}

	public WebElement getCopycontact() {
		return copycontact;
	}

	public WebElement getDeletecontact() {
		return deletecontact;
	}

	public WebElement getSaledivision2() {
		return saledivision2;
	}

	public WebElement getMarketingcollection() {
		return marketingcollection;
	}

	public WebElement getMarketingLook() {
		return MarketingLook;
	}

	public WebElement getMarketingTool() {
		return MarketingTool;
	}

	public WebElement getSalesOrder() {
		return SalesOrder;
	}

	public WebElement getSalesordergroup() {
		return salesordergroup;
	}

	public WebElement getCatalogconfig() {
		return catalogconfig;
	}

	public WebElement getMarketinglookbtn() {
		return marketinglookbtn;
	}
	
	public WebElement getMarketingtoolbtn() {
		return marketingtoolbtn;
	}

	public WebElement getBannercheckbox() {
		return bannercheckbox;
	}

	public WebElement getCanoplycheckbox() {
		return canoplycheckbox;
	}

	public WebElement getCanoplydelete() {
		return canoplydelete;
	}

	public WebElement getMarketingcoll_btn() {
		return marketingcoll_btn;
	}

	public WebElement getMarketingcollvalue() {
		return marketingcollvalue;
	}

	public WebElement getMarketingcurrenyvalue() {
		return marketingcurrenyvalue;
	}

	public WebElement getMarketingproduct() {
		return marketingproduct;
	}

	public WebElement getMProductExpand() {
		return MProductExpand;
	}

	public WebElement getNewfromstyle() {
		return newfromstyle;
	}

	public WebElement getApparelcolorandsizecheckbox() {
		return apparelcolorandsizecheckbox;
	}

	public WebElement getLocalizedname() {
		return localizedname;
	}

	public WebElement getScrollicon() {
		return scrollicon;
	}

	public WebElement getMPcode() {
		return MPcode;
	}

	public WebElement getWholesaleprice() {
		return wholesaleprice;
	}

	public WebElement getRetailproce() {
		return retailproce;
	}

	public WebElement getMarketingproductbtn() {
		return marketingproductbtn;
	}

	public WebElement getMarketingproductvalue() {
		return marketingproductvalue;
	}

	public WebElement getMarketingproductcode() {
		return marketingproductcode;
	}

	public WebElement getStyletype() {
		return styletype;
	}

	public WebElement getMPrdtWSP() {
		return MPrdtWSP;
	}

	public WebElement getMPRetailPrice() {
		return MPRetailPrice;
	}

	public WebElement getMPsizeRange() {
		return MPsizeRange;
	}

	public WebElement getNewmarketingcolorway() {
		return newmarketingcolorway;
	}

	public WebElement getBluecopy() {
		return Bluecopy;
	}

	public WebElement getMaterialproductname() {
		return Materialproductname;
	}

	public WebElement getMarketingmaterial() {
		return Marketingmaterial;
	}

	public WebElement getNewfrommaterialBtn() {
		return NewfrommaterialBtn;
	}

	public WebElement getNewfrommaterialcheckbox() {
		return Newfrommaterialcheckbox;
	}

	public WebElement getMarketingLookBtn() {
		return MarketingLookBtn;
	}

	public WebElement getColorsizecheckbox() {
		return colorsizecheckbox;
	}

	public WebElement getMPcheckbox() {
		return MPcheckbox;
	}

	public WebElement getApparelmaterial() {
		return Apparelmaterial;
	}

	public WebElement getMPMaterial() {
		return MPMaterial;
	}

	public WebElement getMarketingsegment() {
		return marketingsegment;
	}
	
	public WebElement getMarketingColl() {
		return marketingColl;
	}

	public WebElement getSegmentvalue() {
		return segmentvalue;
	}

	public WebElement getSegment1() {
		return segment1;
	}

	public WebElement getSegment2() {
		return segment2;
	}

	public WebElement getReleasetomarket() {
		return Releasetomarket;
	}

	public WebElement getReleasetoCustomer() {
		return ReleasetoCustomer;
	}

	public WebElement getSelectsalesmarket() {
		return selectsalesmarket;
	}

	public WebElement getUsmarketcheckbox() {
		return usmarketcheckbox;
	}

	public WebElement getPushmarketproduct() {
		return pushmarketproduct;
	}

	public WebElement getSelectstate() {
		return selectstate;
	}

	public WebElement getNewSalesOrderbtn() {
		return NewSalesOrderbtn;
	}

	public WebElement getSalesorderValue() {
		return salesorderValue;
	}

	public WebElement getSalesmarketvalue() {
		return salesmarketvalue;
	}
	
	public WebElement getSalesmarketvalue1() {
		return salesmarketvalue1;
	}

	public WebElement getSKUOrder() {
		return SKUOrder;
	}

	public WebElement getLocalName() {
		return LocalName;
	}

	public WebElement getCode() {
		return code;
	}

	public WebElement getMatAChkBx() {
		return matAChkBx;
	}

	public WebElement getMatBChkBx() {
		return matBChkBx;
	}

	public WebElement getMPinmaterila() {
		return MPinmaterila;
	}

	public WebElement getMaterialcolor() {
		return materialcolor;
	}

	public WebElement getIndainmarketcheckbox() {
		return indainmarketcheckbox;
	}

	public WebElement getSalemarketname() {
		return salemarketname;
	}

	public WebElement getSMCustomer() {
		return SMCustomer;
	}

	public WebElement getHmchecckbox() {
		return Hmchecckbox;
	}

	public WebElement getSMSalesDivision() {
		return SMSalesDivision;
	}

	public WebElement getNorthcheckbox() {
		return northcheckbox;
	}

	public WebElement getSouthcheckbox() {
		return southcheckbox;
	}

	public WebElement getSalesproduct() {
		return salesproduct;
	}

	public WebElement getPromotion() {
		return Promotion;
	}

	public WebElement getSalespromBtn() {
		return salespromBtn;
	}

	public WebElement getSeller() {
		return seller;
	}

	public WebElement getBuyer() {
		return Buyer;
	}

	public WebElement getSKUsalesorder() {
		return SKUsalesorder;
	}

	public WebElement getCopy1() {
		return Copy1;
	}

	public WebElement getDelete1() {
		return delete1;
	}

	public WebElement getMarketingtools() {
		return marketingtools;
	}

	public WebElement getSalesordername() {
		return salesordername;
	}

	public WebElement getSalesskubtn() {
		return salesskubtn;
	}

	public WebElement getBluecolorcheckbox() {
		return bluecolorcheckbox;
	}

	public WebElement getGreencolorchecckbox() {
		return greencolorchecckbox;
	}

	public WebElement getQuantityblue() {
		return quantityblue;
	}

	public WebElement getQuantitygreen() {
		return quantitygreen;
	}

	public WebElement getSalesorderbutton() {
		return salesorderbutton;
	}

	public WebElement getSalesordervalue() {
		return salesordervalue;
	}

	public WebElement getCustomer() {
		return customer;
	}

	public WebElement getSalesorderexpand() {
		return salesorderexpand;
	}

	public WebElement getExistingsalesorder() {
		return Existingsalesorder;
	}

	public WebElement getIndinasalescheckbox() {
		return indinasalescheckbox;
	}

	public WebElement getSouthsalename() {
		return southsalename;
	}

	public WebElement getSalescolorwaybtn() {
		return salescolorwaybtn;
	}

	public WebElement getBluecolorcopy() {
		return bluecolorcopy;
	}

	public WebElement getBluedelete() {
		return bluedelete;
	}

	public WebElement getSKUverify() {
		return SKUverify;
	}

	public WebElement getSmvalue() {
		return smvalue;
	}

	public WebElement getSmcustomer() {
		return smcustomer;
	}
	
	

}
