package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class CalendarPage  extends Commonactions{
	
	public CalendarPage() {
		PageFactory.initElements(Commonactions.driver, this);
	} 
	
	@FindBy(xpath="(//a[text()='Apparel - Color and Size']//following::a[text()='winter season'])[1]")
	private WebElement winterseason;

	@FindBy(xpath="(//div[text()='New Style']//following::div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div)[1]")
	private WebElement styleslider;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Master Calendar']")
	private WebElement mastercalander;
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'MasterCalendarContainer-MasterCalendar')]//div[text()='New from Template Calendar']")
	private WebElement templatecalendaraction;		

	@FindBy(xpath="//td[contains(text(),'Calendar')]//parent::tr/td/div/input")
	private WebElement calendarseasoncheckbox;
	
	@FindBy(xpath="//a[text()='Calendar_Season']")
	private WebElement calendarseasonlink;
	
	@FindBy(xpath="(//div[text()='Manual']//following::td[@data-csi-heading='TargetDate::0'])[1]")
	private WebElement targetdatemanual;
	
	@FindBy(xpath="(//div[text()='Milestone']//following::td[@data-csi-heading='TargetDate::0'])[1]")
	private WebElement targetdatemilestone;
	
	@FindBy(xpath="(//div[text()='Artwork Track']//following::td[@data-csi-heading='TargetDate::0'])[1]")
	private WebElement targetdateartwork;
	
	@FindBy(xpath="(//div[text()='IDS Track']//following::td[@data-csi-heading='TargetDate::0'])[1]")
	private WebElement targetdateidswork;
	
	@FindBy(xpath="//a[@title='Season: winter season' and text()='winter season']")
	private WebElement winterseasonlink;
	
	@FindBy(xpath="//a[text()='Calendar_Season']//following::div[@data-csi-act='Propagate2New::0']")
	private WebElement propagatenewcheckbox;
	
	@FindBy(xpath="//span[contains(@data-csi-automation,'MasterCalendarContainer-MasterCalendar')]//span[text()='more_horiz']")
	private WebElement threedotline;
	
	@FindBy(xpath="//td[@role='presentation' and text()='Freeze']")
	private WebElement freeze;
	
	@FindBy(xpath="//td[@role='presentation' and text()='Apply Calendar']")
	private WebElement applycalendar;
	
	@FindBy(xpath="(//td[text()='Apparel - Color and Size']//preceding::div[@data-csi-act='ViewSelect']/input)[3]")
	private WebElement colorsizecheckbox;
	
	@FindBy(xpath="(//a[text()='Apparel - Color and Size']//following::a[text()='Denim'])[1]")
	private WebElement denimseason;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Calendar']")
	private WebElement brandcalendartab;
	
	@FindBy(xpath="(//td[@data-csi-heading='Node Name:Child:__Parent__:0']//span//span)[2]")
	private WebElement rightarrowcolorsize;
	
	@FindBy(xpath="//span[text()='Style Hierarchy' or data-csi-tab-name='Style Hierarchy']")
	private WebElement 	styleheirarchytab;
	
	@FindBy(xpath="(//a[text()='Denim']/following::td[@data-csi-heading='CompletionDate:Child:CalendarRollup:0'])[1]")
	private WebElement manualdate;
	
	@FindBy(xpath="//span[contains(@data-csi-automation,'Calendar-CalendarStyleHierarchy')]//span[text()='refresh']")
	private WebElement refresh;
	
	@FindBy(xpath="(//div[text()='Style']//following::div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div)[1]")
	private WebElement calendarslider;
			
	@FindBy(xpath="//a[text()='Apparel - Color and Size']//following::td[@data-csi-act='CompletionDate:Child:CalendarRollup:0']")
	private WebElement milestonedate;
	
	@FindBy(xpath="//a[text()='Apparel - Color and Size']")
	private WebElement apparelcolorsize;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Specification']")
	private WebElement specificationtab;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Artwork']")
	private WebElement artworktab;	
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'Style-Artworks')]//div[text()='New Artwork']")
	private WebElement newartworkaction;
	
	@FindBy(xpath="//div[text()='New Artwork']//following::a[text()='Calendar Artwork']//following::span[@data-csi-act='EndPhase']")
	private WebElement artworkcheckcircle;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Image']")
	private WebElement imagetab;
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'Style-ImageDataSheets')]//div[text()='New Image Data Sheet']")
	private WebElement imagedatasheetaction;
	
	@FindBy(xpath="(//div[text()='New Image Data Sheet']//following::a[text()='Calendar IDS']//following::span[@data-csi-act='EndPhase'])[1]")
	private WebElement calendardatasheetcircle;
	
	@FindBy(xpath="//span[text()='SKUs' or @data-csi-tab-name='SKUs']")
	private WebElement SKU;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'ProductSKU')]//div/div)[2]")
	private WebElement new_mat_sku_Btn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'SKUMaterial')]/div)/div/input)[1]")
	private WebElement mat_sku_value;
	
	@FindBy(xpath="//input[@name='UseMatrix']")
	private WebElement useMatrix_chkBox;
	
	@FindBy(xpath="//span[contains(@class,'csi-breadcrumb-dashboard-btn')]")
	private WebElement homeicon;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Material Security Groups']")
	private WebElement materialsecutab;
	
	@FindBy(xpath="//div[text()='New Material Security Group']//following::a[text()='MSG-Standalone']")
	private WebElement materialmsgstandalone;
	
	@FindBy(xpath="//a[text()='MSG-Standalone']")
	private WebElement msgstandalone;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'MaterialSecurityGroup-SecurityGroupMaterials')]//td[2])[1]")
	private WebElement materialdownarrow;
	
	@FindBy(xpath="//td[text()='Add Materials']")
	private WebElement addmaterials;
	
	@FindBy(xpath="(//td[text()='100% Cotton/Rayon Jersey']//preceding::td//div[@data-csi-act='ViewSelect'])[2]")
	private WebElement cotraychkbox;
	
	@FindBy(xpath="(//div[text()='BOM Track']//following::td[@data-csi-heading='TargetDate::0'])[1]")
	private WebElement targetbomtrack;
	
	@FindBy(xpath="(//div[text()='Color Data Sheet Track']//following::td[@data-csi-heading='TargetDate::0'])[1]")
	private WebElement targetcdstrack;
	
	@FindBy(xpath="(//div[text()='Test Run Track']//following::td[@data-csi-heading='TargetDate::0'])[1]")
	private WebElement targettestrun;
	
	@FindBy(xpath="//a[@title='Material Security Group: MSG-Standalone' and text()='MSG-Standalone']")
	private WebElement msgstandalonelink;
	
	@FindBy(xpath="(//a[text()='Calendar_MSG']//following::td//div//input)[1]")
	private WebElement calendarmsgchkbox;
	
	@FindBy(xpath="//a[text()='Calendar_MSG']//following::div[@data-csi-act='Propagate2New::0']")
	private WebElement propagatenewcalmsgchkbx;
	
	@FindBy(xpath="//a[text()='Calendar_MSG']//following::span[text()='more_horiz']")
	private WebElement threedotcalmsg;
	
	@FindBy(xpath="(//div[text()='New from Template Calendar']//following::div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div)[1]")
	private WebElement mastercalslider;
	
	@FindBy(xpath="//a[text()='Calendar_MSG']//following::td[@data-csi-heading='FreezeStatus::0']//input")
	private WebElement frozenchkbox;
	
	@FindBy(xpath="(//td[text()='100% Cotton/Rayon Jersey']//preceding::td//div[@data-csi-act='ViewSelect'])")
	private WebElement cottonrayon;
	
	@FindBy(xpath="//span[@data-csi-automation='plugin-MasterCalendarContainer-MasterCalendar-refresh']//span[text()='refresh']")
	private WebElement refreshmastercalpg;
	
	@FindBy(xpath="//span[text()='Materials' or @data-csi-tab-name='Materials']")
	private WebElement materialstab;
	
	@FindBy(xpath="//a[text()='100% Cotton/Rayon Jersey']")
	private WebElement cotrayjersey;
	
	@FindBy(xpath="//span[@title='Material: 100% Cotton/Rayon Jersey']")
	private WebElement cotrayjerlink;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Activities']")
	private WebElement activitiestab;
	
	@FindBy(xpath="(//a[text()='Manual']/following::td[@data-csi-heading='CompletionDate::0'])[1]")
	private WebElement calmanualcompdate;
	
	@FindBy(xpath="//span[@data-csi-tab-name='BOM']")
	private WebElement bomtab;
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'Material-BOMs')]//div[text()='New Material BOM']")
	private WebElement actionmatbom;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'MaterialBOM-Form')]//input)[1]")
	private WebElement subtypeinput;
	
	@FindBy(xpath="(//div[@data-csi-automation='field-MaterialBOM-Form-Node Name']//input)[2]")
	private WebElement matbominput;
	
	@FindBy(xpath="//a[text()='Calendar BOM']//following::span[@data-csi-act='EndPhase' and text()='check_circle']")
	private WebElement calbomenable;
	
	@FindBy(xpath="(//a[text()='Calendar BOM']//following::span[@data-csi-act='EndPhase' and text()='check_circle'])[2]")
	private WebElement calbomenable2;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Material Data Sheets']")
	private WebElement MDStab;
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'Material-MaterialDataSheets')]//div[text()='New Material Data Sheet']")
	private WebElement actionMDS;
	
	@FindBy(xpath="//a[text()='Calendar MDS']//following::span[text()='more_horiz']")
	private WebElement threedotcalMDS;
	
	@FindBy(xpath="//td[text()='Approve']")
	private WebElement approve;
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'Material-ColorDataSheets')]//div[text()='New Material Color Data Sheet']")
	private WebElement actionMCDS;
	
	@FindBy(xpath="//div[contains(@data-csi-automation,'field-ColorDataSheet-NewMaterialColorDataSheet')]/div[3]/input[1]")
	private WebElement colorvalue;
	
	@FindBy(xpath="//a[text()='11-0103 EGRET']//following::span[@data-csi-act='EndPhase']")
	private WebElement egrchkcircle;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Sourcing']")
	private WebElement sourcingtab;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Supplier PO']")
	private WebElement suppotab;
	
	@FindBy(xpath="//span[@data-csi-tab-name='PO Group']")
	private WebElement pogrptab;
	
	@FindBy(xpath="(//a[text()='order po group'])[2]")
	private WebElement ordpogrp;
	
	@FindBy(xpath="//td[text()='Calendar_PO']//preceding::td//div[@data-csi-act='ViewSelect']")
	private WebElement calpochkbox;
	
	@FindBy(xpath="//a[text()='Calendar_PO']//following::td[@data-csi-heading='Propagate2New::0']//input")
	private WebElement calpopropagchk;
	
	@FindBy(xpath="//a[text()='Calendar_PO']")
	private WebElement calandarpo;
	
	@FindBy(xpath="(//div[text()='Manual']//following::td[@data-csi-heading='TargetDate::0'])[1]")
	private WebElement manualtardate;
	
	@FindBy(xpath="(//div[text()='Style Review Track']//following::td[@data-csi-heading='TargetDate::0'])[1]")
	private WebElement styrevtardate;
	
	@FindBy(xpath="(//div[text()='Size Chart Review']//following::td[@data-csi-heading='TargetDate::0'])[1]")
	private WebElement sizechartardate;
	
	@FindBy(xpath="(//div[text()='Mile']//following::td[@data-csi-heading='TargetDate::0'])[1]")
	private WebElement miltardate;
	
	@FindBy(xpath="//a[@title='PO Group: order po group']")
	private WebElement orderpogrplink;
	
	@FindBy(xpath="//a[text()='Calendar_PO']//following::span[text()='more_horiz']")
	private WebElement calpothreedot;
	
	@FindBy(xpath="//td[text()='PO-AP1123-colorbased']//preceding::td//div[@data-csi-act='ViewSelect']")
	private WebElement pocolorbasedchkbox;
	
	@FindBy(xpath="//a[text()='order po group']//following::td[@data-csi-act='CompletionDate:Child:CalendarRollup:0']")
	private WebElement ordpomanualdate;
	
	@FindBy(xpath="//span[@data-csi-automation='plugin-Calendar-CalendarPOHierarchy-refresh']//span[text()='refresh']")
	private WebElement calporefresh;
		
	@FindBy(xpath="//span[text()='arrow_back']")
	private WebElement backarrowbtn;
	
	@FindBy(xpath="//div[text()='Apparel - Color and Size']")
	private WebElement apparelcolsize;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Reviews']")
	private WebElement reviewtab;
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'Style-StyleReviews')]//div[text()='New Style Review']")
	private WebElement stylerevaction;
	
	@FindBy(xpath="(//a[text()='Calendar Style Review']//following::span[text()='more_horiz'])[1]")
	private WebElement calstylerevthreedot;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Size Chart']")
	private WebElement sizecharttab;
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'Style-SizeCharts')]//div[text()='New Size Chart']")
	private WebElement sizechartaction;
	
	@FindBy(xpath="//div[@data-csi-automation='field-SizeChart-Form-Node Name']//div[2]//input")
	private WebElement sizecharinput;
	
	@FindBy(xpath="//td[@role='presentation' and text()='Iterate']")
	private WebElement iterate;
	
	public WebElement getCalendarmsgchkbox() {
		return calendarmsgchkbox;
	}

	public WebElement getMaterialdownarrow() {
		return materialdownarrow;
	}

	public WebElement getAddmaterials() {
		return addmaterials;
	}

	public WebElement getCotraychkbox() {
		return cotraychkbox;
	}

	public WebElement getTargetbomtrack() {
		return targetbomtrack;
	}

	public WebElement getTargetcdstrack() {
		return targetcdstrack;
	}

	public WebElement getTargettestrun() {
		return targettestrun;
	}

	public WebElement getMsgstandalonelink() {
		return msgstandalonelink;
	}

	public WebElement getHomeicon() {
		return homeicon;
	}

	public WebElement getMaterialsecutab() {
		return materialsecutab;
	}

	public WebElement getMaterialmsgstandalone() {
		return materialmsgstandalone;
	}

	public WebElement getMsgstandalone() {
		return msgstandalone;
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
	
	public WebElement getArtworkcheckcircle() {
		return artworkcheckcircle;
	}

	public WebElement getImagetab() {
		return imagetab;
	}

	public WebElement getImagedatasheetaction() {
		return imagedatasheetaction;
	}

	public WebElement getCalendardatasheetcircle() {
		return calendardatasheetcircle;
	}

	public WebElement getApparelcolorsize() {
		return apparelcolorsize;
	}

	public WebElement getSpecificationtab() {
		return specificationtab;
	}

	public WebElement getArtworktab() {
		return artworktab;
	}

	public WebElement getNewartworkaction() {
		return newartworkaction;
	}

	public WebElement getRefresh() {
		return refresh;
	}

	public WebElement getMilestonedate() {
		return milestonedate;
	}

	public WebElement getRightarrowcolorsize() {
		return rightarrowcolorsize;
	}
	
	public WebElement getStyleheirarchytab() {
		return styleheirarchytab;
	}
	

	public WebElement getManualdate() {
		return manualdate;
	}

	public WebElement getApplycalendar() {
		return applycalendar;
	}

	public WebElement getColorsizecheckbox() {
		return colorsizecheckbox;
	}

	public WebElement getDenimseason() {
		return denimseason;
	}

	public WebElement getBrandcalendartab() {
		return brandcalendartab;
	}

	public WebElement getWinterseasonlink() {
		return winterseasonlink;
	}

	public WebElement getPropagatenewcheckbox() {
		return propagatenewcheckbox;
	}

	public WebElement getThreedotline() {
		return threedotline;
	}

	public WebElement getFreeze() {
		return freeze;
	}

	public WebElement getCalendarseasoncheckbox() {
		return calendarseasoncheckbox;
	}

	public WebElement getCalendarseasonlink() {
		return calendarseasonlink;
	}

	
	public WebElement getTargetdatemanual() {
		return targetdatemanual;
	}

	public WebElement getTargetdatemilestone() {
		return targetdatemilestone;
	}

	public WebElement getTargetdateartwork() {
		return targetdateartwork;
	}

	public WebElement getTargetdateidswork() {
		return targetdateidswork;
	}
	
	public WebElement getMastercalander() {
		return mastercalander;
	}

	public WebElement getTemplatecalendaraction() {
		return templatecalendaraction;
	}

	public WebElement getWinterseason() {
		return winterseason;
	}

	public WebElement getStyleslider() {
		return styleslider;
	}
	
	public WebElement getCalendarslider() {
		return calendarslider;
	}

	public WebElement getPropagatenewcalmsgchkbx() {
		return propagatenewcalmsgchkbx;
	}

	public WebElement getThreedotcalmsg() {
		return threedotcalmsg;
	}

	public WebElement getMastercalslider() {
		return mastercalslider;
	}
	
	public WebElement getFrozenchkbox() {
		return frozenchkbox;
	}
	
	public WebElement getCottonrayon() {
		return cottonrayon;
	}
	
	public WebElement getRefreshmastercalpg() {
		return refreshmastercalpg;
	}

	public WebElement getMaterialstab() {
		return materialstab;
	}
	
	public WebElement getCotrayjersey() {
		return cotrayjersey;
	}

	public WebElement getCotrayjerlink() {
		return cotrayjerlink;
	}

	public WebElement getActivitiestab() {
		return activitiestab;
	}

	public WebElement getCalmanualcompdate() {
		return calmanualcompdate;
	}

	public WebElement getBomtab() {
		return bomtab;
	}

	public WebElement getActionmatbom() {
		return actionmatbom;
	}

	public WebElement getSubtypeinput() {
		return subtypeinput;
	}

	public WebElement getMatbominput() {
		return matbominput;
	}

	public WebElement getCalbomenable() {
		return calbomenable;
	}
	
	public WebElement getCalbomenable2() {
		return calbomenable2;
	}
	
	public WebElement getMDStab() {
		return MDStab;
	}

	public WebElement getActionMDS() {
		return actionMDS;
	}

	public WebElement getThreedotcalMDS() {
		return threedotcalMDS;
	}

	public WebElement getApprove() {
		return approve;
	}
	
	public WebElement getActionMCDS() {
		return actionMCDS;
	}

	public WebElement getColorvalue() {
		return colorvalue;
	}

	public WebElement getEgrchkcircle() {
		return egrchkcircle;
	}

	public WebElement getSourcingtab() {
		return sourcingtab;
	}

	public WebElement getSuppotab() {
		return suppotab;
	}

	public WebElement getPogrptab() {
		return pogrptab;
	}

	public WebElement getOrdpogrp() {
		return ordpogrp;
	}

	public WebElement getCalpochkbox() {
		return calpochkbox;
	}

	public WebElement getCalpopropagchk() {
		return calpopropagchk;
	}

	public WebElement getCalandarpo() {
		return calandarpo;
	}

	public WebElement getManualtardate() {
		return manualtardate;
	}

	public WebElement getStyrevtardate() {
		return styrevtardate;
	}

	public WebElement getSizechartardate() {
		return sizechartardate;
	}

	public WebElement getMiltardate() {
		return miltardate;
	}

	public WebElement getOrderpogrplink() {
		return orderpogrplink;
	}

	public WebElement getCalpothreedot() {
		return calpothreedot;
	}

	public WebElement getPocolorbasedchkbox() {
		return pocolorbasedchkbox;
	}

	public WebElement getOrdpomanualdate() {
		return ordpomanualdate;
	}

	public WebElement getCalporefresh() {
		return calporefresh;
	}

	public WebElement getBackarrowbtn() {
		return backarrowbtn;
	}

	public WebElement getApparelcolsize() {
		return apparelcolsize;
	}

	public WebElement getReviewtab() {
		return reviewtab;
	}

	public WebElement getStylerevaction() {
		return stylerevaction;
	}

	public WebElement getCalstylerevthreedot() {
		return calstylerevthreedot;
	}

	public WebElement getSizecharttab() {
		return sizecharttab;
	}

	public WebElement getSizechartaction() {
		return sizechartaction;
	}

	public WebElement getSizecharinput() {
		return sizecharinput;
	}

	public WebElement getIterate() {
		return iterate;
	}
	
	@FindBy(xpath="//a[text()='order po group']//following::td[@data-csi-heading='CompletionDate:Child:CalendarRollup:0']")
	private WebElement ordpotardate;
	
	@FindBy(xpath="(//a[text()='Calendar Style Review']//following::span[@data-csi-act='Delete'])[2]")
	private WebElement calstylrevdelete;
	

	public WebElement getOrdpotardate() {
		return ordpotardate;
	}

	public WebElement getCalstylrevdelete() {
		return calstylrevdelete;
	}
	
	@FindBy(xpath="//a[text()='Calendar_MSG']")
	private WebElement calendarmsgname;
	
	public WebElement getCalendarmsgname() {
		return calendarmsgname;
	}
	
	@FindBy(xpath="//span[contains(@data-csi-automation,'plugin-MasterCalendar-MasterActivities-refresh')]//span[text()='refresh']")
	private WebElement mastercalrefresh;
	
	public WebElement getMastercalrefresh() {
		return mastercalrefresh;
	}
	
	@FindBy(xpath="//span[@data-csi-automation='plugin-MasterCalendarContainer-MasterCalendar-refresh']//span[text()='refresh']")
	private WebElement mastercalporefresh;
	
	public WebElement getMastercalporefresh() {
		return mastercalrefresh;
	}
	
	
	
	
}
