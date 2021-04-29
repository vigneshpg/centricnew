package com.centric.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.centric.objectrepository.ConfigurationPage;
import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.PopupPage;
import com.centric.objectrepository.UserManagementPage;
import com.centric.resources.Commonactions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps extends Commonactions {
	
	Commonactions ca=new Commonactions();
	HomePage hp=new HomePage();
	
	@Given("User selects language {string}")
	public void user_selects_language(String a) throws Throwable {
		Commonactions.jsWaitForPageLoad(); 
		driver.findElement(By.xpath("//span[contains(@data-csi-automation,'PageUser')]")).isDisplayed();
				Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[contains(@data-csi-automation,'PageUser')]")).click();
	   SelectLanguage(a); 
	 //  ca.screenCapture("C:\\Users\\yuvar\\eclipse-workspace\\Centric\\target\\screenshots");
	}
	

    public static void SelectLanguage(String Language) throws InterruptedException {
              for (int i = 0; i < 250; i++) {
           WebElement dr = driver.findElement(By.xpath("(//td[@class='csiHeadingColumn']//td[contains(@data-csi-heading,'')])[9]"));
           Thread.sleep(100);          
           dr.click();
                Actions a = new Actions(driver);
              for (int j = 0; j <= i; j++) {
            	  Thread.sleep(100);
             a.sendKeys(Keys.DOWN).build().perform();
            // Thread.sleep(300);
                         }

                a.sendKeys(Keys.TAB).build().perform();
             //   Thread.sleep(300);
            if (dr.getText().equalsIgnoreCase(Language)) {
                    break;
                      }
                  Thread.sleep(500);
                     }
               System.out.println(Language + "Language selected");
                   Thread.sleep(500);
                 driver.findElement(By.xpath("//span[contains(text(),'Defaults')]")).click();
               Thread.sleep(500);
              driver.findElement(By.xpath("//span[contains(text(),'User Profile')]")).click();
             Thread.sleep(500);
                   driver.navigate().refresh();
                   Thread.sleep(300);
}
	
	@Given("Click style tab and get the listed season name in the style tab")
	public void click_style_tab_and_get_the_listed_season_name_in_the_style_tab() throws Throwable {
		Commonactions.jsWaitForPageLoad(); 
	    ca.click(hp.getStyleBtn());
	    
	    System.out.println("style tab clicked successfully");

	}

	
	@Then("Go to homepage")
	public void go_to_homepage() throws Throwable {
		Commonactions.jsWaitForPageLoad();
		ca.eleToBeClickable();
		Thread.sleep(3000);
		try{
        ca.doubleclick(hp.getUser_homeBtn());
        ca.eleToBeClickable();
        ca.click(hp.getUser_homeBtn_verify());
        ca.eleToBeClickable();
        System.out.println("home tab clicked successfully");
		}catch (Exception e) {
			ca.click(hp.getUser_homeBtn());
	        ca.eleToBeClickable();
		}
        
	     System.out.println("home tab clicked successfully");
	     
	    ca.eleToBeClickable(); 
	      
	}
	
ConfigurationPage cp = new ConfigurationPage();
PopupPage pp = new PopupPage();
	
	@And("User Click on setup icon")
	public void user_Click_on_setup_icon() throws Throwable {
		Commonactions.jsWaitForPageLoad();
		Thread.sleep(3000);
		Commonactions.jsWaitForPageLoad();
		try{
			Commonactions.jsWaitForPageLoad();
			//temp-----------------------------------------
		    //ca.click(hp.getUser_setupBtn());

			ca.click(hp.getUser_settingsBtn());
			Commonactions.clickjs(hp.getSystem_config());
			
			//---------------------------------------------
		}catch(Exception e){
			e.printStackTrace();
		}
		
try{
	Thread.sleep(2000);
	ca.click(cp.getUser_config());
}catch (Exception e) {
	// TODO: handle exception
}
		Commonactions.jsWaitForPageLoad();
		ca.eleToBeClickable();
		ca.click(cp.getUser_TypeConfig());
		Commonactions.jsWaitForPageLoad();
		
		System.out.println("type config clicked successfully");
		
	}
	
	UserManagementPage up=new UserManagementPage();
	
	@Given("User click on setup icon and roles under user management")
	public void user_click_on_setup_icon_and_roles_under_user_management() throws Throwable {
	    
		Commonactions.jsWaitForPageLoad();
		Thread.sleep(3000);
		Commonactions.jsWaitForPageLoad();
		try{
			Commonactions.jsWaitForPageLoad();
			
			//temp-----------------------------------------
		    //ca.click(hp.getUser_setupBtn());
			
			ca.click(hp.getUser_settingsBtn());
			Commonactions.clickjs(hp.getSystem_config());
			
			//---------------------------------------------
		}catch(Exception e){
			e.printStackTrace();
		}
		
		Thread.sleep(2000);
		ca.click(up.getUsrManagement());
		Commonactions.jsWaitForPageLoad();
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Roles());
		Commonactions.jsWaitForPageLoad();
		
		System.out.println("roles under user management clicked successfully");
		
	}
	
	@Given("User click on setup icon and announcement under user management")
	public void user_click_on_setup_icon_and_announcement_under_user_management() throws Throwable {
		
		Commonactions.jsWaitForPageLoad();
		Thread.sleep(3000);
		Commonactions.jsWaitForPageLoad();
		try{
			Commonactions.jsWaitForPageLoad();
		ca.click(hp.getUser_setupBtn());
		}catch(Exception e){
			e.printStackTrace();
		}
		
		Thread.sleep(2000);
		ca.click(up.getUsrManagement());
		Commonactions.jsWaitForPageLoad();
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Ancmnts());
		Commonactions.jsWaitForPageLoad();
		
		System.out.println("announcements under user management clicked successfully");
	    
	}
	
	@Then("User click on update cnfiguration")
	public void user_click_on_update_cnfiguration() throws Throwable {
	    
		Commonactions.isElementPresent(hp.getUser_settingsBtn());
		ca.click(hp.getUser_settingsBtn());
		Commonactions.isElementPresent(hp.getUpdate_config());
		ca.click(hp.getUpdate_config());
		Commonactions.isElementPresent(pp.getUpdate_fullUpdateConfiguration());
		ca.click(pp.getUpdate_fullUpdateConfiguration());
		Commonactions.isElementPresent(pp.getUpdate_Run_Btn());
		ca.click(pp.getUpdate_Run_Btn());
		
		Thread.sleep(20000);
		
		driver.navigate().refresh();
		Commonactions.waitForAlert(driver);
		
		System.out.println("update configuration clicked successfully");
	}
}
