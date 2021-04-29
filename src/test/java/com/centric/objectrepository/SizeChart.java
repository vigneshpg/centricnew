package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class SizeChart extends Commonactions {

	public SizeChart() {
		PageFactory.initElements(Commonactions.driver, this);
	}

	@FindBy(xpath="//a[text()='Pants Grade Rule']")
	private WebElement pangraderulename;
	
	@FindBy(xpath="//span[text()='Increment']")
	private WebElement Increment;
	
	@FindBy(xpath="//a[text()='PG - 01']")
	private WebElement PG01;
	
	@FindBy(xpath="//span[contains(@data-csi-automation,'ProductGroup-Dimensions-CustomViewActions')]//span[text()='Views']")
	private WebElement ProdgrpView;
	
	@FindBy(xpath="//tr[contains(@data-csi-automation,'ProductGroup-Dimensions-CustomViewManage')]//td[text()='Manage Views']")
	private WebElement Prodgrpmanage;
	
	@FindBy(xpath="//input[@value='Product Group Dimension']//parent::div/input[1]")
	private WebElement ProdgrpDim;

	@FindBy(xpath="//option[text()='Grainline']")
	private WebElement Grainline;
	
	@FindBy(xpath="//td[@data-csi-heading='Grainline:Child:GroupDimension:0']")
	private WebElement Grainlinearea;
	
	@FindBy(xpath="//span[@data-csi-tab-name='TDS']")
	private WebElement TDS;
	
	@FindBy(xpath="//td[contains(@data-csi-act,'Group')]")
	private WebElement prodgrp;

	@FindBy(xpath="//td[contains(@data-csi-act,'SubrangeIncrement:Child:SizeChartSubSizeRanges')]")
	private WebElement sizeincrement;
	
	@FindBy(xpath="//span[contains(@data-csi-automation,'plugin-SizeChartRevision-TDS-htmlToolbars')]//span/span/span[1]")
	private WebElement toolbars;
	
	@FindBy(xpath="//span[contains(text(),'Default (Default)')]")
	private WebElement defalt;
	
	@FindBy(xpath="//option[text()='Shrinkage']")
	private WebElement shrinkage;
	
	@FindBy(xpath="//td[text()='Size Matrix']")
	private WebElement sizematrix;

	@FindBy(xpath="//option[text()='Pattern']")
	private WebElement pattern;
	
	@FindBy(xpath="//option[text()='Pattern with Shrinkage']")
	private WebElement patternshrinkage;
	
	@FindBy(xpath="(//span[@data-csi-automation='plugin-SizeChartRevision-Properties-CustomViewActions']//span[text()='Views'])[1]")
	private WebElement TDSview;
	
	@FindBy(xpath="(//tr[@data-csi-automation='plugin-SizeChartRevision-Properties-CustomViewManage']//td[text()='Manage Views'])")
	private WebElement TDSManage;
	
	@FindBy(xpath="//option[text()='Warp Shrinkage']")
	private WebElement warpShrinkage;

	@FindBy(xpath="//option[text()='Weave Shrinkage']")
	private WebElement weaveShrinkage;
	
	@FindBy(xpath="//option[text()='Grainline Designation']")
	private WebElement gralinedesignation;
	
	@FindBy(xpath="//td[contains(@data-csi-act,'WarpShrinkage')]")
	private WebElement warpShrinkagevalue;
	
	@FindBy(xpath="//td[contains(@data-csi-act,'WeaveShrinkage')]")
	private WebElement weaveShrinkagevalue;
	
	@FindBy(xpath="(//td[contains(@data-csi-act,'Pattern::0{SizeChartDimensionSummaryMatrix')])[1]")
	private WebElement smallpattern;
	
	@FindBy(xpath="//td[contains(@data-csi-act,'GrainlineDesignation')]")
	private WebElement Grainlinevalue;

	@FindBy(xpath="(//span[@data-csi-automation='plugin-SizeChartRevision-Dimensions-Actions']//span[text()='Actions'])[1]")
	private WebElement DimensionAction;
	
	@FindBy(xpath="//td[text()='Restore Increments']")
	private WebElement RestoreIncrement;
	
	@FindBy(xpath="//td[text()='Restore Tolerances']")
	private WebElement Restoretolerance;
	
	@FindBy(xpath="(//td[contains(@data-csi-act,'Shrinkage')])[6] ")
	private WebElement Shrinkagevalue1;
	
	@FindBy(xpath="(//td[contains(@data-csi-act,'Shrinkage')])[10]")
	private WebElement Shrinkagevalue2;

	@FindBy(xpath="//td[text()='Restore Shrinkage']")
	private WebElement restoreshrinkage;
	
	@FindBy(xpath="//td[text()='Reset Pattern']")
	private WebElement Resetpattern;
	
	@FindBy(xpath="//td[contains(@data-csi-act,'IncrementSizeRange')]")
	private WebElement IncrementSizeRange;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-Increment-Dimensions-ToolbarNewActions']//div[text()='New from Dimension']")
	private WebElement Dimensionadd;
	
	@FindBy(xpath="(//td[contains(text(),'A')]//parent::tr//div/input)[1]")
	private WebElement dimvalue1;

	@FindBy(xpath="(//td[contains(text(),'A')]//parent::tr//div/input)[3]")
	private WebElement dimvalue2;
	
	@FindBy(xpath="(//td[contains(text(),'A')]//parent::tr//div/input)[5]")
	private WebElement dimvalue3;
	
	@FindBy(xpath="//div[text()='New Product Group']")
	private WebElement NewProductGroup;
	
	@FindBy(xpath="//div[@data-csi-automation='field-ProductGroup-Form-Node Name']//div[2]/div/input")
	private WebElement NewProductGrpvalue;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-ProductGroup-Dimensions-ToolbarNewActions']//div[text()='New from Dimension']")
	private WebElement newfromdimension;

	@FindBy(xpath="(//td[contains(@data-csi-act,'ToleranceNegative')])[1]")
	private WebElement Tolerancevalue1;
	
	@FindBy(xpath="(//td[contains(@data-csi-act,'ToleranceNegative')])[2]")
	private WebElement Tolerancevalue2;
	
	@FindBy(xpath="(//td[contains(@data-csi-act,'ToleranceNegative')])[3]")
	private WebElement Tolerancevalue3;
	
	@FindBy(xpath="//a[text()='Apparel SC - 01']")
	private WebElement ApparelSC01name;
	
	@FindBy(xpath="//td[text()='Change Product Group']")
	private WebElement changeproductgroup;
	
	@FindBy(xpath="//div[@data-csi-automation='field-SizeChartRevision-ProductGroupSelect-Group']/div[3]/input[1]")
	private WebElement newProdgrp;

	@FindBy(xpath="//label[text()='Reset from library']//parent::div//parent::div//input[@name='tolerances']")
	private WebElement Resetfromlibrary;
	
	@FindBy(xpath="//label[text()='Discard']//parent::div//parent::div//input[@name='addedDimensions']")
	private WebElement discardDimension;
	
	@FindBy(xpath="//td[text()='Change Increments']")
	private WebElement changeincrement;
	
	@FindBy(xpath="//div[@data-csi-automation='field-SizeChartSubSizeRange-SubrangeIncrementSelect-SubrangeIncrement']/div[3]/input[1]")
	private WebElement Newincrement;
	
	@FindBy(xpath="//label[contains(text(),'Change Product Group')]//parent::div//input")
	private WebElement changePGcheckbox;

	@FindBy(xpath="//label[text()='Maintain']//parent::div//parent::div//input[1]")
	private WebElement maintain2;
	
	@FindBy(xpath="(//label[text()='Reset from library']//parent::div//parent::div//input)[1]")
	private WebElement resetfromlibrary2;
	
	@FindBy(xpath="(//label[text()='Reset from library']//parent::div//parent::div//input)[2]")
	private WebElement resetfromlibrary3;
	
	@FindBy(xpath="(//label[text()='Discard']//parent::div//parent::div//input)[2]")
	private WebElement discard2;
	
	@FindBy(xpath="//td[text()='Change Size Range']")
	private WebElement changesizerange;

	@FindBy(xpath="//span[text()='open_in_new']//parent::div/span[1]")
	private WebElement allsize;
	
	@FindBy(xpath="//label[text()='medium']//parent::div/div/input")
	private WebElement mediumchkbox;
	
	@FindBy(xpath="//span[@data-csi-automation='plugin-SizeChart-Breadcrumb-Actions']")
	private WebElement TDSAction;
	
	@FindBy(xpath="//tr[@data-csi-automation='plugin-SizeChart-Breadcrumb-ReviewStart']")
	private WebElement evalulate;
	
	@FindBy(xpath="//div[@data-csi-automation='field-SizeChartReview-Form-ReviewRequest']/div[3]/input[1]")
	private WebElement supplierrequest;

	@FindBy(xpath="//div[@data-csi-automation='field-SizeChartReview-Form-SizeChartReviewCreateSamples']/input")
	private WebElement createsample;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Sample-Form-RequestSampleDimensions']/div[3]/input[1]")
	private WebElement sampledimension;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Sample-Form-Colors']/div[3]/input[1]")
	private WebElement samplecolor;
	
	@FindBy(xpath="(//span[contains(text(),'EGRET')]//parent::*//parent::div/div/input)[1]")
	private WebElement egretcolor1;
	
	@FindBy(xpath="//*[contains(text(),'EGRET - Copy')]//parent::label//parent::div/div/input")
	private WebElement egretcolor2;

	@FindBy(xpath="//div[@data-csi-automation='field-Sample-Form-Sizes']/div[3]/input[1]")
	private WebElement samplesizes;
	
	@FindBy(xpath="//*[text()='small']//parent::label//parent::div/div/input")
	private WebElement smallsize;
	
	@FindBy(xpath="//span[text()='Evaluation' or data-csi-tab-name='Evaluation']")
	private WebElement Evaluation;
	
	/*@FindBy(xpath="//span[@data-csi-tab-name='TDS']")
	private WebElement ApparelTDS;*/
	
	@FindBy(xpath="//td[text()='Pass']")
	private WebElement TDSpass;

	public WebElement getPangraderulename() {
		return pangraderulename;
	}

	public WebElement getIncrement() {
		return Increment;
	}
	
	public WebElement getPG01() {
		return PG01;
	}

	public WebElement getProdgrpView() {
		return ProdgrpView;
	}

	public WebElement getProdgrpmanage() {
		return Prodgrpmanage;
	}

	public WebElement getProdgrpDim() {
		return ProdgrpDim;
	}

	public WebElement getGrainline() {
		return Grainline;
	}

	public WebElement getGrainlinearea() {
		return Grainlinearea;
	}

	public WebElement getTDS() {
		return TDS;
	}

	public WebElement getProdgrp() {
		return prodgrp;
	}

	public WebElement getSizeincrement() {
		return sizeincrement;
	}

	public WebElement getToolbars() {
		return toolbars;
	}

	public WebElement getDefalt() {
		return defalt;
	}

	public WebElement getShrinkage() {
		return shrinkage;
	}

	public WebElement getSizematrix() {
		return sizematrix;
	}

	public WebElement getPattern() {
		return pattern;
	}

	public WebElement getPatternshrinkage() {
		return patternshrinkage;
	}

	public WebElement getTDSview() {
		return TDSview;
	}

	public WebElement getTDSManage() {
		return TDSManage;
	}

	public WebElement getWarpShrinkage() {
		return warpShrinkage;
	}

	public WebElement getWeaveShrinkage() {
		return weaveShrinkage;
	}

	public WebElement getGralinedesignation() {
		return gralinedesignation;
	}

	public WebElement getWarpShrinkagevalue() {
		return warpShrinkagevalue;
	}

	public WebElement getWeaveShrinkagevalue() {
		return weaveShrinkagevalue;
	}

	public WebElement getSmallpattern() {
		return smallpattern;
	}
	
	public WebElement getGrainlinevalue() {
		return Grainlinevalue;
	}

	public WebElement getDimensionAction() {
		return DimensionAction;
	}

	public WebElement getRestoreIncrement() {
		return RestoreIncrement;
	}

	public WebElement getRestoretolerance() {
		return Restoretolerance;
	}

	public WebElement getShrinkagevalue1() {
		return Shrinkagevalue1;
	}

	public WebElement getShrinkagevalue2() {
		return Shrinkagevalue2;
	}

	public WebElement getRestoreshrinkage() {
		return restoreshrinkage;
	}

	public WebElement getResetpattern() {
		return Resetpattern;
	}

	public WebElement getIncrementSizeRange() {
		return IncrementSizeRange;
	}

	public WebElement getDimensionadd() {
		return Dimensionadd;
	}

	public WebElement getDimvalue1() {
		return dimvalue1;
	}

	public WebElement getDimvalue2() {
		return dimvalue2;
	}

	public WebElement getDimvalue3() {
		return dimvalue3;
	}

	public WebElement getNewProductGroup() {
		return NewProductGroup;
	}

	public WebElement getNewProductGrpvalue() {
		return NewProductGrpvalue;
	}

	public WebElement getNewfromdimension() {
		return newfromdimension;
	}

	public WebElement getTolerancevalue1() {
		return Tolerancevalue1;
	}

	public WebElement getTolerancevalue2() {
		return Tolerancevalue2;
	}

	public WebElement getTolerancevalue3() {
		return Tolerancevalue3;
	}

	public WebElement getApparelSC01name() {
		return ApparelSC01name;
	}

	public WebElement getChangeproductgroup() {
		return changeproductgroup;
	}

	public WebElement getNewProdgrp() {
		return newProdgrp;
	}

	public WebElement getResetfromlibrary() {
		return Resetfromlibrary;
	}

	public WebElement getDiscardDimension() {
		return discardDimension;
	}

	public WebElement getChangeincrement() {
		return changeincrement;
	}

	public WebElement getNewincrement() {
		return Newincrement;
	}

	public WebElement getChangePGcheckbox() {
		return changePGcheckbox;
	}

	public WebElement getMaintain2() {
		return maintain2;
	}

	public WebElement getResetfromlibrary2() {
		return resetfromlibrary2;
	}

	public WebElement getResetfromlibrary3() {
		return resetfromlibrary3;
	}

	public WebElement getDiscard2() {
		return discard2;
	}

	public WebElement getChangesizerange() {
		return changesizerange;
	}

	public WebElement getAllsize() {
		return allsize;
	}

	public WebElement getMediumchkbox() {
		return mediumchkbox;
	}

	public WebElement getTDSAction() {
		return TDSAction;
	}

	public WebElement getEvalulate() {
		return evalulate;
	}

	public WebElement getSupplierrequest() {
		return supplierrequest;
	}

	public WebElement getCreatesample() {
		return createsample;
	}

	public WebElement getSampledimension() {
		return sampledimension;
	}

	public WebElement getSamplecolor() {
		return samplecolor;
	}

	public WebElement getEgretcolor1() {
		return egretcolor1;
	}

	public WebElement getEgretcolor2() {
		return egretcolor2;
	}

	public WebElement getSamplesizes() {
		return samplesizes;
	}

	public WebElement getSmallsize() {
		return smallsize;
	}

	public WebElement getEvaluation() {
		return Evaluation;
	}

	/*public WebElement getApparelTDS() {
		return ApparelTDS;
	}*/
	
	public WebElement getTDSpass() {
		return TDSpass;
	}
	
	
}
