package com.centric.stepdefinition;

import com.centric.objectrepository.*;
import com.centric.resources.Commonactions;
import cucumber.api.java.en.Then;
import org.openqa.selenium.interactions.Actions;

public class ProductAlternativeSteps extends Commonactions {

    Commonactions ca = new Commonactions();
    SetupPageTK sp = new SetupPageTK();
    PopupPage pp = new PopupPage();
    HomePage hp = new HomePage();
    SpecificationPage spec = new SpecificationPage();
    SpecificationHierarchyPageTK shp = new SpecificationHierarchyPageTK();
    ColorSpecificationPageTK cp = new ColorSpecificationPageTK();
    PopupPage pup=new PopupPage();
    StylePage spk =new StylePage();
    SizeLabelPage sl = new SizeLabelPage();
    SIzeChartTK sc = new SIzeChartTK();
    LookUpPage lp = new LookUpPage();

    @Then("user creates the product alternative data {string}")
    public void userCreatesTheProductAlternativeData(String a) throws Throwable {
        Actions actions = new Actions(driver);
        String[] pa;
        pa = a.split(",");
        ca.eleToBeClickable();
        ca.click(lp.getProductAlternativeTab());
        jsWaitForPageLoad();
        for (int i = 0; i < pa.length; i++) {
            ca.eleToBeClickable();
            ca.click(lp.getProductAlternativeActionBtn());
            ca.eleToBeClickable();
            ca.insertText(spec.getRF_InputText(),pa[i]);
            ca.eleToBeClickable();
            ca.click(lp.getProductAlternativeTab());
        }
    }
}
