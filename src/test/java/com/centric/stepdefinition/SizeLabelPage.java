package com.centric.stepdefinition;

import com.centric.objectrepository.*;
import com.centric.resources.Commonactions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SizeLabelPage extends Commonactions {

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
    ConfigurationPage configurationPage = new ConfigurationPage();

    @When("user creates the size spec data for size label module {string}")
    public void userCreatesTheSizeSpecDataForSizeLabelModule(String sizeSpec) throws Throwable {
        String[] sizeSpecSetup;
        ca.eleToBeClickable();
        sizeSpecSetup = sizeSpec.split(",");
        ca.eleToBeClickable();
        ca.click(sl.getSetupStyleSpecTab());
        jsWaitForPageLoad();
        for (int i = 0; i < sizeSpecSetup.length; i++) {
            ca.eleToBeClickable();
            ca.click(sl.getStyleSpecActionBtn());
            Thread.sleep(3000);
            ca.insertText(sl.getNewSpecInputBtn(),sizeSpecSetup[i]);
            ca.eleToBeClickable();
            ca.click(pp.getSave_Btn());
            Thread.sleep(3000);
            driver.findElement(By.xpath("(//a[@class='browse' and text()='" + sizeSpecSetup[i] + "']//following::input[@type='checkbox'])[1]")).click();
        }
        System.out.println("Size spec types are created");
        Thread.sleep(3000);
        driver.navigate().refresh();
        jsWaitForPageLoad();
        ca.eleToBeClickable();
        driver.findElement(By.xpath("(//a[@class='browse' and text()='" + sizeSpecSetup[0] + "']//following::div[@data-csi-act='EnableValueAttributes:Child:SetupSettings:0'])[1]")).click();
    }

    @When("user navigates to size label tab")
    public void userNavigatesToSizeLabelTab() throws Throwable {
        try {
        	 ca.eleToBeClickable();
             Commonactions.isElementPresent(hp.getUser_settingsBtn1());
             ca.click(hp.getUser_settingsBtn1()); 
     	     
     	     System.out.println("Setup tab clicked successfully");
       
             Commonactions.isElementPresent(hp.getData_Spec());
             ca.click(hp.getData_Spec());
             ca.eleToBeClickable();
             Commonactions.isElementPresent(hp.getSetupSearch());
             ca.insertText(hp.getSetupSearch(), "Size Labels");
             ca.eleToBeClickable();
            ca.click(sl.getStyleSpecTab());
            jsWaitForPageLoad();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @And("user creates the size label {string}")
    public void userCreatesTheSizeLabel(String a) throws Throwable {
        String[] sizeLabel;
        sizeLabel = a.split(",");
        for (int i = 0; i < sizeLabel.length; i++) {
            Commonactions.isElementPresent(sl.getNewSpecActionBtn());
            ca.click(sl.getNewSpecActionBtn());
            Commonactions.isElementPresent(spec.getRF_InputText());
            ca.insertText(spec.getRF_InputText(), sizeLabel[i]);
            ca.eleToBeClickable();
        }
    }

    @Then("Validate the options like copy and delete for size label {string},{string}")
    public void validateTheOptionsLikeCopyAndDeleteForSizeLabel(String a, String colorName) throws Throwable {
        java.util.List<WebElement> optionCount = driver.findElements(By.xpath("//span[@data-csi-act='Copy']"));
        optionCount.size();
        Thread.sleep(2000);
        WebElement copyBtn = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + colorName + "']//following::span[@data-csi-act='Copy'])[1]"));
        copyBtn.click();
        ca.eleToBeClickable();
        WebElement delete = driver.findElement(By.xpath("//a[@class='browse' and text()='" + a + "']//following::span[@data-csi-act='Delete']"));
        Thread.sleep(1000);
        delete.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[contains(text(),'Delete')])[2]")).click();
        System.out.println("The copy color specification is deleted ");
    }

    @And("User navigates to type config")
    public void userNavigatesToTypeConfig() throws Throwable {
    ca.eleToBeClickable();
    ca.click(configurationPage.getUser_TypeConfig());
    Thread.sleep(3000);
    }
}
