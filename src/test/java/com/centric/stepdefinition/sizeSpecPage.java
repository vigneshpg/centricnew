package com.centric.stepdefinition;

import com.centric.objectrepository.*;
import com.centric.resources.Commonactions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class sizeSpecPage extends Commonactions {

    Commonactions ca = new Commonactions();
    SetupPageTK sp = new SetupPageTK();
    PopupPage pp = new PopupPage();
    HomePage hp = new HomePage();
    SpecificationPage spec = new SpecificationPage();
    SpecificationHierarchyPageTK shp = new SpecificationHierarchyPageTK();
    ColorSpecificationPageTK cp = new ColorSpecificationPageTK();
    PopupPage pup=new PopupPage();
    StylePage spk =new StylePage();
    SizeLabel sl = new SizeLabel();
    SIzeChartTK sc = new SIzeChartTK();
    SizeSpec ss = new SizeSpec();


    @When("user navigates to size spec tab")
    public void userNavigatesToSizeSpecTab() throws Throwable {
        try {
        	 ca.eleToBeClickable();
             Commonactions.isElementPresent(hp.getUser_settingsBtn1());
             ca.click(hp.getUser_settingsBtn1()); 
     	     
     	     System.out.println("Setup tab clicked successfully");
       
             Commonactions.isElementPresent(hp.getData_Spec());
             ca.click(hp.getData_Spec());
             ca.eleToBeClickable();
             Commonactions.isElementPresent(hp.getSetupSearch());
             ca.insertText(hp.getSetupSearch(), "Size Specs");
             ca.eleToBeClickable();
            ca.click(ss.getStyleSpecTab());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @And("user creates the size spec {string}")
    public void userCreatesTheSizeSpec(String a) throws Throwable {
        String[] sizeSpec;
        ca.eleToBeClickable();
        sizeSpec = a.split(",");
        ca.eleToBeClickable();
        for (int i = 0; i < sizeSpec.length; i++) {
            ca.eleToBeClickable();
            ca.click(ss.getStyleSpecAction());
            ca.eleToBeClickable();
            ca.insertText(ss.getStyleSpecInput(), sizeSpec[i]);
            ca.eleToBeClickable();
            ca.click(pp.getSave_Btn());
        }
    }

    @Then("Validate the options like copy and delete for size spec {string}")
    public void validateTheOptionsLikeCopyAndDeleteForSizeSpec(String a) throws Throwable {
        java.util.List<WebElement> optionCount = driver.findElements(By.xpath("//span[@data-csi-act='Copy']"));
        optionCount.size();
        Thread.sleep(2000);
        WebElement copyBtn = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + a + "']//following::span[@data-csi-act='Copy'])[1]"));
        copyBtn.click();
        ca.eleToBeClickable();
//        ca.insertText(ss.getStyleSpecInput(), "12");
//        ca.eleToBeClickable();
        driver.findElement(By.xpath("//span[@data-csi-act='Save']")).click();
        ca.eleToBeClickable();
        WebElement delete = driver.findElement(By.xpath("//a[@class='browse' and text()='" + a + "']//following::span[@data-csi-act='Delete']"));
        ca.eleToBeClickable();
        delete.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[contains(text(),'Delete')])[2]")).click();
        System.out.println("The copy color specification is deleted ");
    }

}
