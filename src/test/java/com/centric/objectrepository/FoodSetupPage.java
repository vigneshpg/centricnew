package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class FoodSetupPage extends Commonactions{

	public FoodSetupPage() {
		PageFactory.initElements(Commonactions.driver, this);
	}
	
	@FindBy(xpath="//a[text()='Food Setup']")
	private WebElement foodsetup;

	@FindBy(xpath="//span[text()='Food Allergens']")
	private WebElement foodallergens;
	
	@FindBy(xpath="//span[text()='Food Claims']")
	private WebElement foodclaims;
	
	@FindBy(xpath="//span[text()='Food Ingredients']")
	private WebElement foodingredient;
	
	@FindBy(xpath="//span[text()='Food Nutrients']")
	private WebElement foodnutri;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-Data-FoodAllergens-ToolbarNewActions']//div/div[2]")
	private WebElement foodalleraction;
	
	@FindBy(xpath="//div[@data-csi-automation='field-FoodAllergen-Form-Node Name']//div/div/input")
	private WebElement foodallerinput;	
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-Data-FoodClaims-ToolbarNewActions']//div/div[2]")
	private WebElement foodclaimaction;	
	
	@FindBy(xpath="//div[@data-csi-automation='field-FoodClaim-Form-Node Name']//div/div/input")
	private WebElement foodclaiminput;	
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-Data-FoodIngredients-ToolbarNewActions']//div/div[2]")
	private WebElement foodingreaction;		
	
	@FindBy(xpath="//div[@data-csi-automation='field-FoodIngredient-Form-Node Name']//div/div/input")
	private WebElement foodingredinput;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-Data-FoodNutrients-ToolbarNewActions']//div/div[2]")
	private WebElement foodnutriaction;
	
	@FindBy(xpath="(//td[text()='Eggs']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement eggusinp;
	
	@FindBy(xpath="(//td[text()='Fish']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement fishusinp;
	
	@FindBy(xpath="(//td[text()='Milk']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement milkusinp;
	
	@FindBy(xpath="(//td[text()='Wheat']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement wheatusinp;
	
	@FindBy(xpath="(//td[text()='Sodium']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement sodiumusinp;
	
	@FindBy(xpath="(//td[text()='Sugar']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement sugarusinp;
	
	@FindBy(xpath="(//td[text()='Calcium']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement calciumusinp;
	
	@FindBy(xpath="(//td[text()='Fibre']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement fibreusinp;
	
	@FindBy(xpath="(//td[text()='Pepper']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement pepperusinp;
	
	@FindBy(xpath="(//td[text()='Oil']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement oilusinp;
	
	@FindBy(xpath="(//td[text()='Salt']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement saltusinp;
	
	@FindBy(xpath="(//td[text()='Flour']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement flourusinp;
	

	@FindBy(xpath="(//td[text()='Minerals']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement mineralusinp;	
	
	@FindBy(xpath="(//td[text()='Proteins']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement protienusinp;
	
	@FindBy(xpath="(//td[text()='Vitamins']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement vitaminusinp;
	
	@FindBy(xpath="(//td[text()='Lipids']//following::td[@data-csi-act='Languages::0{Languages}'])[1]")
	private WebElement lipidusinp;
	
	
	public WebElement getPepperusinp() {
		return pepperusinp;
	}

	public WebElement getOilusinp() {
		return oilusinp;
	}

	public WebElement getSaltusinp() {
		return saltusinp;
	}

	public WebElement getFlourusinp() {
		return flourusinp;
	}

	public WebElement getSodiumusinp() {
		return sodiumusinp;
	}

	public WebElement getSugarusinp() {
		return sugarusinp;
	}


	public WebElement getCalciumusinp() {
		return calciumusinp;
	}


	public WebElement getFibreusinp() {
		return fibreusinp;
	}


	public WebElement getMilkusinp() {
		return milkusinp;
	}


	public WebElement getWheatusinp() {
		return wheatusinp;
	}


	public WebElement getFishusinp() {
		return fishusinp;
	}


	public WebElement getEggusinp() {
		return eggusinp;
	}


	public WebElement getFoodingredient() {
		return foodingredient;
	}


	public WebElement getFoodnutri() {
		return foodnutri;
	}


	public WebElement getFoodclaimaction() {
		return foodclaimaction;
	}


	public WebElement getFoodclaiminput() {
		return foodclaiminput;
	}


	public WebElement getFoodingreaction() {
		return foodingreaction;
	}


	public WebElement getFoodingredinput() {
		return foodingredinput;
	}


	public WebElement getFoodnutriaction() {
		return foodnutriaction;
	}


	public WebElement getFoodalleraction() {
		return foodalleraction;
	}


	public WebElement getFoodallerinput() {
		return foodallerinput;
	}


	public WebElement getFoodallergens() {
		return foodallergens;
	}


	public WebElement getFoodclaims() {
		return foodclaims;
	}


	public WebElement getFoodsetup() {
		return foodsetup;
	}

	public WebElement getMineralusinp() {
		return mineralusinp;
	}

	public WebElement getProtienusinp() {
		return protienusinp;
	}

	public WebElement getVitaminusinp() {
		return vitaminusinp;
	}

	public WebElement getLipidusinp() {
		return lipidusinp;
	}
	
	
}