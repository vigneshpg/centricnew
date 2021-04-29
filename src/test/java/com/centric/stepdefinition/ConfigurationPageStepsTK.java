package com.centric.stepdefinition;

import com.centric.objectrepository.ConfigurationPage;
import com.centric.objectrepository.PopupPage;
import com.centric.resources.Commonactions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ConfigurationPageStepsTK extends Commonactions {
    Commonactions ca=new Commonactions();
    ConfigurationPage cp=new ConfigurationPage();
    PopupPage pp=new PopupPage();
    static String style1,style2,style3,style4=null;

    @When("User creates style type in setup page {string},{string},{string},{string}")
    public void user_creates_style_type(String A, String B, String C, String D) throws Throwable {
        style1=A;
        style2=B;
        style3=C;
        style4=D;
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_Types());
        Commonactions.jsWaitForPageLoad();
        ca.eleToBeClickable();
        //	ca.clickjs(driver.findElement(By.xpath("(//span[contains(@class,'fullScreen')])[3]")));
        colourAndSizeTK(A);
        onlyColoursTK(B);
        onlySizeTK(C);
        noDatasTK(D);

        getStyleActiveTK();

        System.out.println("style type created successfully");
        System.out.println("checkbox clicked successfully");
        //	ca.clickjs(driver.findElement(By.xpath("//span[@title='Exit Full Screen']")));

    }

    @When("User fills all the style type attributes fields")
    public void user_fill_the_style_type_attributes_fieldsTK() throws Throwable {
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_Type_DataSheets());
        ca.eleToBeClickable();
        try{
            ca.clickjs(cp.getStyle_Type_DataSheets_RefreshBtn());
        }catch(Exception e){

        }
        ca.eleToBeClickable();
        //ca.clickjs(driver.findElement(By.xpath("(//span[contains(@class,'fullScreen')])[3]")));
        List<WebElement> nRows = driver.findElements(By.xpath("((//div[contains(@class,'TDS')])/div[@class='csiDialogScroll']//table)//tr[@data-csi-act='ViewSelect']"));
        int i = nRows.size();
        for (int j = 1; j <=i; j++) {
            ca.eleToBeClickable();
            WebElement text = driver.findElement(By.xpath("((((//div[contains(@class,'TDS')])/div[@class='csiDialogScroll']//table)//tr[@data-csi-act='ViewSelect'])["+j+"]/td)[1]"));
            //String s = String.valueOf(j);
            //style=null;
            String text2 = text.getText();
            System.out.println("text is :"+text2);

            if(text2.equals(style1)){
                for (int j2 = 1; j2 <= 12; j2++) {
                    if(j2<=5){
                        ca.eleToBeClickable();
                        ca.clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));
                        //ca.eleToBeClickable(cp.getStyle_Colour());
                    }
                    else{
                        //ca.eleToBeClickable();
                        //ca.clickjs(driver.findElement(By.xpath("(//span[text()='+']/parent::div)[3]")));
                        ca.eleToBeClickable();
                        ca.clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));

                    }

                }
            }else if(text2.equals(style2)){
                for (int j2 = 1; j2 <= 12; j2++) {

                    if(j2<=5){
                        ca.eleToBeClickable();
                        ca.clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));
                        //ca.eleToBeclickjsable(cp.getStyle_Colour());
                    }else{
                       // ca.eleToBeClickable();
                       // ca.clickjs(driver.findElement(By.xpath("(//span[text()='+']/parent::div)[3]")));
                        ca.eleToBeClickable();
                        ca.clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));

                    }

                }
            }else if(text2.equals(style3)){
                for (int j2 = 1; j2 <= 12; j2++) {

                    if(j2<=5){
                        ca.eleToBeClickable();
                        ca.clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));
                        //ca.eleToBeclickjsable(cp.getStyle_Colour());
                    }else{
                       // ca.eleToBeClickable();
                       // ca.clickjs(driver.findElement(By.xpath("(//span[text()='+']/parent::div)[3]")));
                        ca.eleToBeClickable();
                        ca.clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));
                    }

                }
            }else if(text2.equals(style4)){
                for (int j2 = 1; j2 <= 12; j2++) {

                    if(j2<=5){
                        ca.eleToBeClickable();
                        ca.clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));
                        //ca.eleToBeclickjsable(cp.getStyle_Colour());
                    }else{
                        //ca.eleToBeClickable();
                       // ca.clickjs(driver.findElement(By.xpath("(//span[text()='+']/parent::div)[3]")));
                        ca.eleToBeClickable();
                        ca.clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));
                    }

                }
            }else{
            }
            System.out.println("name doesn't matched");
        }


        System.out.println("style type attributes created successfully");
        System.out.println("checkbox clicked successfully");
    }
    //ca.clickjs(driver.findElement(By.xpath("//span[@title='Exit Full Screen']")));

    public void colourAndSizeTK(String value) throws Throwable {

        ca.eleToBeClickable();
        ca.clickjs(cp.getNew_styleType_Btn());
        Commonactions.jsWaitForPageLoad();
        ca.eleToBeClickable();
        ca.insertText(pp.getConfig_styleType_ValueA(), value);
        ca.clickjs(pp.getConfig_save_Btn());
        Commonactions.jsWaitForPageLoad();
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_Colour());
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_Active());
        ca.eleToBeClickable();
        try{
            for(int i=0; i < 8; i++){
                ca.clickjs(driver.findElement(By.xpath("(//span[text()='+']/parent::div)[2]")));
            }}catch (Exception e) {
            // TODO: handle exception
        }
        ca.clickjs(cp.getStyle_Brands());
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_Features());
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_Functions());
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_InAssortment());
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_IsAssortment());
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_EnableSKU());
        ca.eleToBeClickable();
        try{
            for(int i=0; i < 7; i++){
                ca.clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[2]")));
            }}catch (Exception e) {
            // TODO: handle exception
        }
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_EnableStyle());
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_Size());
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_Validate_MCM());
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_Reference_Img());
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_Allow_ColourSpec());
        ca.eleToBeClickable();

        try{

            ca.clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[2]")));
        }catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void onlyColoursTK(String value) throws Throwable {

        ca.eleToBeClickable();
        Commonactions.jsWaitForPageLoad();
        ca.clickjs(cp.getNew_styleType_Btn());
        Commonactions.jsWaitForPageLoad();
        ca.eleToBeClickable();
        ca.insertText(pp.getConfig_styleType_ValueB(), value);
        Commonactions.jsWaitForPageLoad();
        ca.clickjs(pp.getConfig_save_Btn());
        Commonactions.jsWaitForPageLoad();
        ca.eleToBeClickable();
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_Colour());
        ca.eleToBeClickable();
        //	ca.clickjs(cp.getStyle_Active());
        //	ca.eleToBeClickable();
        try{
            for(int i=0; i < 8; i++){
                ca.clickjs(driver.findElement(By.xpath("(//span[text()='+']/parent::div)[2]")));
            }}catch (Exception e) {
            // TODO: handle exception
        }
        ca.clickjs(cp.getStyle_Brands());
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_Features());
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_Functions());
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_InAssortment());
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_IsAssortment());
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_EnableSKU());
        ca.eleToBeClickable();
        try{
            for(int i=0; i < 7; i++){
                ca.clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[2]")));
            }}catch (Exception e) {
            // TODO: handle exception
        }
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_EnableStyle());
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_Validate_MCM());
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_Reference_Img());
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_Allow_ColourSpec());
        ca.eleToBeClickable();
        try{

            ca.clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[2]")));
        }catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void onlySizeTK(String value) throws Throwable {

        ca.eleToBeClickable();
        Commonactions.jsWaitForPageLoad();
        ca.clickjs(cp.getNew_styleType_Btn());
        Commonactions.jsWaitForPageLoad();
        ca.eleToBeClickable();
        ca.insertText(pp.getConfig_styleType_ValueB(), value);
        Commonactions.jsWaitForPageLoad();
        ca.clickjs(pp.getConfig_save_Btn());
        Commonactions.jsWaitForPageLoad();
        //ca.eleToBeClickable();
        //	ca.eleToBeClickable();
        //	ca.clickjs(cp.getStyle_Active());
        //ca.eleToBeClickable();
        ca.eleToBeClickable();
        try{
            for(int i=0; i < 8; i++){
                ca.clickjs(driver.findElement(By.xpath("(//span[text()='+']/parent::div)[2]")));
            }}catch(Exception e){

        }
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_Size());
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_Brands());
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_Features());
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_Functions());
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_InAssortment());
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_IsAssortment());
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_EnableSKU());
        ca.eleToBeClickable();
        try{
            for(int i=0; i < 7; i++){
                ca.clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[2]")));
            }}catch (Exception e) {
            // TODO: handle exception
        }
        ca.eleToBeClickable();
        ca.clickjs(cp.getStyle_EnableStyle());
        ca.eleToBeClickable();
        try{

            ca.clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[2]")));
        }catch (Exception e) {
            // TODO: handle exception
        }
    }
    public void noDatasTK(String value) throws Throwable {

        ca.eleToBeClickable();
        Commonactions.jsWaitForPageLoad();
        ca.clickjs(cp.getNew_styleType_Btn());
        Commonactions.jsWaitForPageLoad();
        ca.eleToBeClickable();
        ca.insertText(pp.getConfig_styleType_ValueB(), value);
        Commonactions.jsWaitForPageLoad();
        ca.clickjs(pp.getConfig_save_Btn());
        Commonactions.jsWaitForPageLoad();
        //	ca.eleToBeClickable();
        //	ca.clickjs(cp.getStyle_Active());

    }
    public void getStyleActiveTK() throws Throwable{
        List<WebElement> actives = driver.findElements(By.xpath("(//div[@data-csi-act='Available:Child:Config:0']/input[@tabindex='0'])"));
        int i=actives.size();
        System.out.println("size :"+i);
        int  j=i-1;
        int  k=i-2;
        int  l=i-3;
        int  m=i-4;
        try{
            ca.eleToBeClickable();
            ca.jsScrollPageDown(driver.findElement(By.xpath("(//div[@data-csi-act='Available:Child:Config:0']/input[@tabindex='0'])["+i+"]")));

        }catch (Exception e) {
            // TODO: handle exception

        }

        ca.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Available:Child:Config:0']/input[@tabindex='0'])["+i+"]")));
        ca.eleToBeClickable();
        ca.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Available:Child:Config:0']/input[@tabindex='0'])["+j+"]")));
        ca.eleToBeClickable();
        ca.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Available:Child:Config:0']/input[@tabindex='0'])["+k+"]")));
        ca.eleToBeClickable();



    }


    @And("User deselects the colour specification option {string}")
    public void userDeselectsTheColourSpecificationOption(String a) throws Throwable {
        Thread.sleep(500);
        WebElement allowColorSpec = driver.findElement(By.xpath("(//td[contains(text(),'" + a + "')]//following::div[@data-csi-act='AllowCreateColorSpecOnColorway:Child:Config:0'])[1]"));
        ca.eleToBeClickable();
        ca.click(allowColorSpec);
    }
}
