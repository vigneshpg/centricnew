package com.centric.resources;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.centric.stepdefinition.HomePageSteps;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Commonactions{

	public static  WebDriver driver;
	private static String homeWindow = null;

	public WebDriver launch(String url) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", ".\\driver\\Chrome85\\chromedriver.exe");
		//InternetExplorerDriver ie=new InternetExplorerDriver();
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("disable-infobars");
		chromeOptions.addArguments("start-maximized");
		//---------------------------Headless-----------------------------\\
		     //  chromeOptions.addArguments("headless");
		     //  chromeOptions.addArguments("window-size=1200x600");
		//------------------------------------------------------------------\\
		//driver = new InternetExplorerDriver();
		driver = new ChromeDriver(chromeOptions);

		//--------------------------Clear Cache ----------------------------\\   
		/*	        driver.get("chrome://settings/clearBrowserData");
	        Thread.sleep(5000);
	        driver.switchTo().activeElement();
	        driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
	        Thread.sleep(5000);*/

		//---------------------------------------------------------------------\\   
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().setSize(new Dimension(1280, 680));
		//driver.manage().window().maximize();
		return driver;
	}
	
	public WebElement activeElement() {

		WebElement activeElement = driver.switchTo().activeElement();

		return activeElement;

	}

	public void insertText(WebElement element, String value) {
		try{
			try{
				element.clear();
			}catch(Exception e1){
				element.sendKeys(Keys.DELETE);
			}
		}catch (Exception e) {

		}
		element.sendKeys(value);

	}


	public void display(WebElement plusIcon, WebElement element) throws InterruptedException {

		for (int i = 0; i < 50; i++) {
			Commonactions.isElementPresent(plusIcon);
			click(plusIcon);
			if(element.isDisplayed()){
				Thread.sleep(1000);
				Commonactions.isElementPresent(element);
				click(element);
				break;
			}

		}

	}



	public void delete() {

		Actions a= new Actions(driver);
		a.sendKeys(Keys.DELETE);

	}

	public void insertTextjs(WebElement element, String value) {
		try{
			element.clear();
		}catch (Exception e) {

		}
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value', '" + value +"')", element);

	}

	public void click(WebElement element) {

		element.click();

	}

	public void doubleclick(WebElement element) {

		Actions a = new Actions(driver);
		a.doubleClick(element).build().perform();

	}

	public void eleToBeClickable() throws Throwable {

		Thread.sleep(5000);

	}

	public void save() throws Throwable {
		try{
			click(driver.findElement(By.xpath("(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save'])[1]")));

		}catch(Exception e){
			eleToBeClickable();
			click(driver.findElement(By.xpath("(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save'])[2]")));
			eleToBeClickable();
		}

	}

	public static void accept_Alert() {
		try {
			Alert alert = driver.switchTo().alert();
			try{
				String text = alert.getText();
				System.out.println("alert text :"+text);
			}catch(Exception e){

			}
			alert.accept();
			//Reporter.addStepLogPass("alert accepted successfully");
		} catch (Exception e) {
			//Reporter.addStepLogInfo("Alert is not accepted" + e.toString());
		}
	}

	public static String screenCapture(String imgLocation) {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(imgLocation));
			//Reporter.addStepLogPass("Captured screen successfully");
		} catch (IOException e) {
			//Reporter.addStepLogInfo("Screen is not captured" + e.toString());
		}
		return imgLocation;
	}

	/**
	 * Method to switch to the newly opened window
	 */
	public static void switchToWindow() {
		homeWindow = driver.getWindowHandle();
		for (String window : driver.getWindowHandles()) {
			driver.switchTo().window(window);
		}
	}

	/**
	 * To navigate to the main window from child window
	 */
	public static void switchToMainWindow() {
		for (String window : driver.getWindowHandles()) {
			if (!window.equals(homeWindow)) {
				driver.switchTo().window(window);
				driver.close();
			}
			driver.switchTo().window(homeWindow);
		}
	}

	/**
	 * This method returns the no.of windows present
	 * 
	 * @return
	 */
	public static int getWindowCount() {
		return driver.getWindowHandles().size();
	}

	/****************** frames *********************/

	public static void frames(WebElement frameElement) {
		try {
			driver.switchTo().frame(frameElement);
			//Reporter.addStepLogPass("successfully switched to frame");
		} catch (Exception e) {
			//Reporter.addStepLogInfo("failed while switching to frame");
		}
	}

	public static void switchToDefaultcontent() {
		try {
			driver.switchTo().defaultContent();
		} catch (NoSuchElementException e) {
		}
	}

	public static void navigateToUrl(String url) {
		try {
			driver.navigate().to(url);
			//Reporter.addStepLogPass("Application launched successfully to" + url);

		} catch (Exception e) {
			//Reporter.addStepLogInfo("Failed to load the url" + url + e.getMessage());
		}
	}

	public static void closeBrowser() {
		try {
			driver.close();
			//Reporter.addStepLogPass("Browser closed successfully");
		} catch (Exception e) {
			//Reporter.addStepLogInfo("Browser is not closed");
		}
	}

	public static boolean isElementPresent(WebElement element) {
		boolean elementPresent = false;
		try {
			Thread.sleep(1000);
			waitForElementVisibility(element);
			if (element.isDisplayed()) {
				elementPresent = true;
			}
			//Reporter.addStepLogPass(element.toString() + "is Displayed successfully");
		} catch (Exception e) {
			//Reporter.addStepLogInfo("Verify Element Present failed" + e.toString());
		}
		return elementPresent;
	}

	/**
	 * Verifying the visibility of element only for assert conditions
	 */

	public static boolean isElementNotPresent(WebElement element) {
		boolean elementNotPresent = true;
		try {
			if (element.isDisplayed()) {
				elementNotPresent = false;
			}
			//Reporter.addStepLogPass("Element is Displayed successfully");
		} catch (Exception e) {
			//Reporter.addStepLogInfo("Verify Element Present failed" + e.getMessage());
		}
		return elementNotPresent;
	}

	public static String getText(WebElement element) {
		String text = null;
		try {
			waitForElementVisibility(element);
			if (element.getText() != null) {
				text = element.getText();
			}
			//Reporter.addStepLogPass("text retrieved successfully from element" + element.toString());
		} catch (Exception e) {
			//Reporter.addStepLogInfo("text is not retrieved from element" + element.toString() + e.getMessage());
		}
		return text;
	}

	/**
	 * Method to get the value from textbox
	 * 
	 * @param element
	 * @return
	 */
	public static String getValue(WebElement element) {
		String value = null;
		try {
			waitForElementVisibility(element);
			if (element.getAttribute("value") != null) {
				value = element.getAttribute("value");
			}
			//Reporter.addStepLogPass("text retrieved successfully from element" + element.toString());
		} catch (Exception e) {
			//Reporter.addStepLogInfo("text is not retrieved from element" + element.toString() + e.getMessage());
		}
		return value;
	}

	/**
	 * Method to select the option from dropdown by value
	 */
	public static void selectByValue(WebElement element, String value) {
		try {
			Select obj_select = new Select(element);
			obj_select.selectByValue(value);
			//Reporter.addStepLogPass(value + "selected from dropdown " + element.toString());
		} catch (Exception e) {
			//Reporter.addStepLogInfo("failed to select" + value + "from " + element.toString());
		}
	}

	/**
	 * Method to select the option from drop down by visible text
	 */
	public static void selectByText(WebElement element, String text) {
		try {
			Select obj_select = new Select(element);
			obj_select.selectByVisibleText(text);
			//Reporter.addStepLogPass(text + "selected from dropdown " + element.toString());
		} catch (Exception e) {
			//Reporter.addStepLogInfo("failed to select" + text + "from " + element.toString());
		}
	}

	/**
	 * Method to select the option from dropdown by index
	 */
	public static void selectByIndex(WebElement element, int index) {
		try {
			Select obj_select = new Select(element);
			obj_select.selectByIndex(index);
			//Reporter.addStepLogPass(index + "index selected from dropdown " + element.toString());
		} catch (Exception e) {
			//Reporter.addStepLogInfo("failed to select" + index + "index" + "from " + element.toString());
		}
	}

	/**
	 * To pause execution until get expected elements visibility
	 * 
	 * @param element
	 */
	public static void waitForElementVisibility(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void waitForElementClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void draganddrop(WebElement element1,WebElement element2) {
		try {
			Actions action = new Actions(driver);
			action.dragAndDrop(element1,element2).build().perform();
			//Reporter.addStepLogPass("Mouseover to the element" + element.toString() + "is success");
		} catch (Exception e) {
			//Reporter.addStepLogPass("Mouseover to the element" + element.toString() + "is failed");
		}
	}

	/**
	 * To pause the execution @throws
	 */
	public static void pause(int milliSeconds) throws InterruptedException {
		Thread.sleep(milliSeconds);
	}

	/**
	 * To create a connectivity to Database and update the scenario execution
	 * status
	 */
	/*	public static void createDBConnection(String scName, String scStatus) {
		try {
			// convert current date from string to sql date data type
			String currentDate = getCurrentDate();
			DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date date = dateFormatter.parse(currentDate);
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());

			String[] tcName = scName.split("-");
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			String url = "jdbc:ucanaccess://src\\main\\resources\\lib\\Sabre_Automation_Reports.accdb";
			Connection conn = DriverManager.getConnection(url);
			String qry = "INSERT INTO TestCaseStatus (TestCase_Name, TestScenario_Name, Exec_Date, Execution_Status)"
					+ "VALUES (?, ?, ?, ?)";
			PreparedStatement stment = conn.prepareStatement(qry);

			stment.setString(1, tcName[0]);
			stment.setString(2, tcName[1]);
			stment.setDate(3, sqlDate);
			stment.setString(4, scStatus);
			stment.executeUpdate();
			conn.commit();
			conn.close();
		} catch (Exception err) {
		}
	}*/

	/**
	 * Method to get the available option from dropdown
	 * 
	 * @return
	 */
	public static List<String> getOptionFromDropDown(WebElement element) {
		List<String> AvailableOptions = new ArrayList<String>();
		try {

			Select obj_select = new Select(element);

			List<WebElement> optionElements = obj_select.getOptions();
			for (int i = 0; i < optionElements.size(); i++) {
				AvailableOptions.add(optionElements.get(i).getText());
			}
			//Reporter.addStepLogPass("get available options from dropdown is success" + element.toString());
		} catch (Exception e) {
			//Reporter.addStepLogInfo(
			//	"get available options from dropdown is failed" + e.getMessage() + element.toString());
		}
		return AvailableOptions;
	}


	public void jsScrollPagedowntoEnd() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		}
		catch (Exception e) {
			//Reporter.addStepLogInfo("page is not scrolled up ");
		}
	}

	/**
	 * Method to perform mouseover action on required element
	 * 
	 * @param element
	 * 
	 * 
	 * 
	 */


	public void jsMouseOver() {
		try {
			Actions a = new Actions(driver);
			Thread.sleep(100);
			a.sendKeys(Keys.DOWN).build().perform();
			a.sendKeys(Keys.TAB).build().perform();
		} catch (Exception e) {
			//Reporter.addStepLogPass("Mouseover to the element" + element.toString() + "is failed");
		}
	}

	public void jsMouseOver1() {
		try {
			Actions a = new Actions(driver);
			Thread.sleep(100);
			a.sendKeys(Keys.DOWN).build().perform();
			a.sendKeys(Keys.DOWN).build().perform();
			a.sendKeys(Keys.TAB).build().perform();
		} catch (Exception e) {
			//Reporter.addStepLogPass("Mouseover to the element" + element.toString() + "is failed");
		}
	}

	public void jsMouseOver(WebElement element) {
		try {
			String code = "var fireOnThis = arguments[0];" + "var evObj = document.createEvent('MouseEvents');"
					+ "evObj.initEvent( 'mouseover', true, true );" + "fireOnThis.dispatchEvent(evObj);";
			((JavascriptExecutor) driver).executeScript(code, element);
			//Reporter.addStepLogPass("Mouseover to the element" + element.toString() + "is success");

		} catch (Exception e) {
			//Reporter.addStepLogPass("Mouseover to the element" + element.toString() + "is failed");
		}
	}

	public static void mouseOver(WebElement element) {
		try {
			Actions action = new Actions(driver);
			action.moveToElement(element).build().perform();
			//Reporter.addStepLogPass("Mouseover to the element" + element.toString() + "is success");
		} catch (Exception e) {
			//Reporter.addStepLogPass("Mouseover to the element" + element.toString() + "is failed");
		}
	}

	/**
	 * Method to wait for page load using javascript
	 * @throws Throwable 
	 */
	public static void jsWaitForPageLoad() throws Throwable {
		System.out.println("*********************in***************************");
		for(int i=0; i < 500; i++){
			JavascriptExecutor js = (JavascriptExecutor)driver;
			if((boolean)js.executeScript("return document.readyState").toString().equals("complete")){
				break;
			}else{
				Thread.sleep(1000);
			}

		}
		System.out.println("*********************out***************************");

	}

	public static String getRandomString(int length) {
		char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			char c = chars[random.nextInt(chars.length)];
			sb.append(c);
		}
		return sb.toString();
	}

	public static String getRandomNumber(int length) {
		char[] chars = "1234567890".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			char c = chars[random.nextInt(chars.length)];
			sb.append(c);
		}
		return sb.toString();
	}

	public String dropDownSelectedValue(WebElement element) {
		Select select = new Select(element);
		String selectedOption = select.getFirstSelectedOption().getText();
		return selectedOption;
	}

	public static BigDecimal truncateDecimal(double x, int numberofDecimals) {
		if (x > 0) {
			return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_FLOOR);
		} else {
			return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_CEILING);
		}
	}

	/**
	 * To get default selected value from drop down
	 * 
	 * @param element
	 * @return String
	 */

	public static String getDefaultDropDownValue(WebElement element) throws InterruptedException {

		Select obj_select = new Select(element);
		return obj_select.getFirstSelectedOption().getText();

	}

	/**
	 * To get checkbox is selected or not from list of checkboxes
	 * 
	 * @param List
	 *            <WebElement>
	 * @return
	 */
	public static boolean isCheckBoxSelectedInDropdown(List<WebElement> elements) {
		boolean flag = true;
		int noOfCheckBox = elements.size();
		for (int i = 0; i < noOfCheckBox; i++) {
			flag = elements.get(i).isSelected();
			if (flag == true)
				break;
		}
		return flag;
	}

	public static void clickjs(WebElement element) {
		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);
			//Reporter.addStepLogPass(element.toString() + "element is clicked successfully");
		} catch (Exception e) {
			//Reporter.addStepLogInfo(element.toString() + "element is not clicked" + e.getMessage());
		}
	}

	/**
	 * Method to scroll page up for element visibility using java script
	 * 
	 * 
	 */
	public void jsScrollPageUp(WebElement element) {
		try {
			int yScrollPosition = element.getLocation().getY();
			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0, " + -yScrollPosition + ")", "");

			//Reporter.addStepLogPass("scroll page up" + "page is scrolled up successfully");
		} catch (Exception e) {
			//Reporter.addStepLogInfo("page is not scrolled up ");
		}
	}

	/**
	 * Method to get size of list
	 * 

	 * @param List
	 * @return size of list
	 */
	public static int getListSize(List<WebElement> element) {
		int size = 0;
		try {
			size = element.size();
			//Reporter.addStepLogPass("size of list retrieved successfuly");
		} catch (Exception e) {
			//Reporter.addStepLogInfo("value is not retrieved from textbox" + e.toString());
		}
		return size;
	}

	/**
	 * quit Browser
	 * 

	 * 
	 */
	public static void quitBrowser() {
		try {
			driver.quit();
			//Reporter.addStepLogPass("Browser quited successfully");
		} catch (Exception e) {
			//Reporter.addStepLogInfo("Browser is not quited");
		}
	}


	public static void waitForAlert(WebDriver driver) throws Throwable
	{
		int i=0;
		while(i++<200)
		{
			try
			{
				Alert alert = driver.switchTo().alert();
				String text = alert.getText();
				System.out.println("alert message is :"+text);
				alert.accept();
				break;
			}
			catch(NoAlertPresentException e)
			{
				Thread.sleep(1000);
				continue;
			}
		}


		try{
			driver.navigate().refresh();
			Thread.sleep(1000);
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("alert message is :"+text);
			alert.accept();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * verify if list in Ascending Order
	 * 
	 * @param list

	 * @return boolean
	 */
	public boolean checkAscendingOrder(List<String> list) {
		String previous = "";// empty string

		boolean flag = true;
		for (String current : list) {
			if (current.compareTo(previous) < 0) {
				flag = false;
				return flag;
			}

			previous = current;
		}
		return flag;
	}

	/**
	 * verify if list in descending Order
	 * 
	 * @param list

	 * @return boolean
	 */

	public boolean checkDescendingOrder(List<String> list) {
		String previous = list.get(0);
		boolean flag = true;
		for (String current : list) {
			if (previous.compareTo(current) < 0) {

				flag = false;
				return flag;
			}

			previous = current;
		}
		return flag;
	}

	/**
	 * verify Option is available In DropDown
	 * 
	 * @param Dropdown
	 *            and option

	 * @return boolean
	 */

	public boolean verifyOptionIsAvailableInDropDown(WebElement dropDown, String option) {
		boolean flag = false;
		List<String> TaxSetupOption = getOptionFromDropDown(dropDown);
		for (String string : TaxSetupOption) {
			if (string.contains(option)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	/**
	 * select Multiple Values From ListBox
	 * 
	 * @param list

	 * @return List of selected values
	 */


	/**
	 * verify if list of integer in Descending Order
	 * 

	 * @return boolean
	 */
	public boolean checkDescendingOrderForInteger(List<Integer> list) {
		int previous = list.get(0);// empty string

		boolean flag = true;
		for (Integer current : list) {
			if (current > previous) {
				flag = false;
				return flag;
			}

			previous = current;
		}
		return flag;
	}

	/**
	 * verify if list of integer in Ascending Order

	 * @return boolean
	 */
	public boolean checkAscendingOrderForInteger(List<Integer> list) {
		int previous = list.get(0);// empty string
		boolean flag = true;
		for (Integer current : list) {

			if (current < previous) {
				flag = false;
				return flag;
			}

			previous = current;
		}
		return flag;
	}

	/**
	 * get random special characters
	 * 

	 * @return boolean
	 */
	public static String getRandomSpecialCharacters(int length) {
		char[] chars = "!#$%&'()*+|\\,-./:;<=>?@[]^_`{|}~".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			char c = chars[random.nextInt(chars.length)];
			sb.append(c);
		}
		return sb.toString();
	}

	/**
	 * Method to clear the text box

	 */

	public static void clearTextBox(WebElement element) {
		waitForElementVisibility(element);
		element.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
	}

	public static void waitForElementTodisappear(By ByElement) {
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(ByElement));

	}

	/*	public static String getCurrentDateMMMDDYYYY() {
		DateTimeFormatter fmt = DateTimeFormat.forPattern("MMM. dd, YYYY");
		LocalDate now = LocalDate.now();
		String exec_Date = now.toString(fmt);
		return exec_Date;
	}
	 */
	/**
	 * Modify drop down value if something is already selected
	 * 
]
	 * @return
	 */
	public void modifyDDValue(WebElement element) {
		List<String> option = getOptionFromDropDown(element);
		String DDSelectedValue = dropDownSelectedValue(element);
		System.out.println("DDSelectedValue " + DDSelectedValue);
		for (String text : option) {
			System.out.println("option in list " + text);
			if (text.isEmpty()) {
				System.out.println("continue...");
				continue;
			} else if (!text.equals(DDSelectedValue)) {
				selectByText(element, text);
				break;
			}
		}
	}

	/**
	 * enter integer number using keypress

	 * @return
	 * @throws InterruptedException
	 * @throws AWTException
	 */
	public void enterNumberUsingkeypress(String number) throws InterruptedException, AWTException {
		Robot robot = new Robot();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('0', KeyEvent.VK_0);
		map.put('1', KeyEvent.VK_1);
		map.put('2', KeyEvent.VK_2);
		map.put('3', KeyEvent.VK_3);
		map.put('4', KeyEvent.VK_4);
		map.put('5', KeyEvent.VK_5);
		map.put('6', KeyEvent.VK_6);
		map.put('7', KeyEvent.VK_7);
		map.put('8', KeyEvent.VK_8);
		map.put('9', KeyEvent.VK_9);
		int lenght = number.length();
		// System.out.println("number lenght "+lenght);
		char[] numberInChar = number.toCharArray();
		int keyInput[] = new int[lenght];
		for (int i = 0; i < numberInChar.length; i++) {
			if (numberInChar != null && map != null) {
				keyInput[i] = map.get(numberInChar[i]);
			}

		}
		for (int i = 0; i < keyInput.length; i++) {
			robot.keyPress(keyInput[i]);
			pause(1000);
		}
	}

	/**
	 * click on specific co-ordinates for a Webelement
	 * 

	 * @return
	 * @throws InterruptedException
	 * @throws AWTException
	 */
	public void clickOnSpecificCoordinate(WebElement element, int x, int y) {
		Actions clicker = new Actions(driver);
		clicker.moveToElement(element).moveByOffset(x, y).click().perform();
	}

	/**

	 * @param element
	 * @throws Throwable 
	 */
	public void jsScrollPageDown(WebElement element) throws Throwable {

		//int yScrollPosition = element.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);",element);
		Thread.sleep(2000);
		////Reporter.addStepLogPass("scroll page down" + "page is scrolled down successfully");

	}

	/**
	 * verify specific string is available in a list of String

	 * @param List
	 * @return flag
	 */
	public boolean verifyTextInList(List<String> list, String text) {
		boolean flag = false;
		for (String string : list) {
			if (string.contains(text)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	/**
	 * Method to verify a field is disabled
	 * 

	 */

	public static boolean elementDisabled(WebElement element) {
		boolean flag = false;
		waitForElementVisibility(element);
		String disabled = element.getAttribute("class");
		if (disabled.contains("disabled")) {
			flag = true;
		}
		return flag;
	}

	public static void assertText(WebElement element,String expectedText) {
		waitForElementVisibility(element);
		String ActualText = element.getText();
		if ((!ActualText.isEmpty())) {
			Assert.assertEquals(expectedText, ActualText);
			System.out.println(ActualText + " " + " - True");
		} else {
			System.out.println("The assert was unsuccessful");
		}
	}

	public static void PopUpCommonButtonsVerification(WebElement element,WebElement Save,WebElement SaveAndGo,WebElement SaveAndNew, WebElement Cancel) {
		Commonactions.isElementPresent(element);
		try {
			assert element != null;
			if (element.isDisplayed()) {
				element.click();
				Thread.sleep(2000);
				Commonactions.assertText(Save, "Save");
				Commonactions.assertText(SaveAndGo, "Save & Go");
				Commonactions.assertText(SaveAndNew, "Save & New");
				Commonactions.assertText(Cancel, "Cancel");
				Cancel.click();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("The verification for the common pop buttons is failed");
		}
	}

	public static void navigateToTab(WebElement homePageTabSelection, WebElement ModuleTab, WebElement rightArrow) throws Throwable {
		Actions actions = new Actions(driver);
		Commonactions.isElementPresent(homePageTabSelection);
		homePageTabSelection.click();
		jsWaitForPageLoad();
		try {
			waitForElementClickable(rightArrow);
			Commonactions.isElementPresent(rightArrow);
			actions.moveToElement(rightArrow).doubleClick(ModuleTab).build().perform();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}finally {
			Commonactions.isElementPresent(ModuleTab);
			actions.moveToElement(ModuleTab).click(ModuleTab).build().perform();
		}
	}

	public static void CustomView(WebElement CV, WebElement ManageView, WebElement CopyBtn, WebElement CustomName){
		Actions actions = new Actions(driver);
		Commonactions.isElementPresent(CV);
		Commonactions ca = new Commonactions();
		try {
			if (CV.isDisplayed()) {
				CV.click();
				Commonactions.isElementPresent(ManageView);
				ManageView.click();
				Commonactions.isElementPresent(CopyBtn);
				CopyBtn.click();
				Commonactions.isElementPresent(CopyBtn);
				CustomName.clear();
				ca.insertText(CustomName,"CV_Auto");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}