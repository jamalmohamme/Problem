package com.jamal.pages.utils;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProblemDomain {
	protected static WebDriver driver;

	int implicitWait = 30;
	int pageLoadTime = 30;
	int explicitWait = 30;
	public ProblemDomain() {}

	
	public ProblemDomain(WebDriver dvr) {
		driver = dvr;
	}


	public final static String dir = System.getProperty("user.dir");

	private static final String String = null;

	/**
	 * 				- IMPLICIT WAIT - 
	 *  
	 *  below mentioned is the syntax of the implicit wait
	 */ 
	public void implicitLoadTime() {
		driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
	}

	/**
	 * 					-PAGE  LOAD WAIT-
	 * 
	 * below mentioned is the syntax of the page load wait
	 */
	public void pageLoadTime() {
		driver.manage().timeouts().pageLoadTimeout(pageLoadTime, TimeUnit.SECONDS);
	}

	/**
	 * find web element with xpath locator
	 * 
	 * @param xpathExpression
	 * @return web element
	 */
	public WebElement findXpath(String xpathExpression) {
		return driver.findElement(By.xpath(xpathExpression));
	}

	/**
	 * find list of web elements with xpath locator
	 * 
	 * @param xpathExpression
	 * @return
	 */
	public List<WebElement> findWebElementListByXpath(String xpathExpression) {
		return driver.findElements(By.xpath(xpathExpression));
	}

	/**
	 * find element with id locator
	 * 
	 * @param id
	 * @return web element
	 */
	public WebElement findId(String id) {
		return driver.findElement(By.id(id));
	}

	/**
	 * Verify the text based on the text of the web element and the expected
	 * text
	 * 
	 * @param testName
	 * @param we
	 * @param expectedText
	 * @return boolean status
	 */
	public boolean verifyText(String testName, WebElement element, String expectedText) {
		boolean status = false;
		String actualText = element.getText().trim();
		if (expectedText.equals(actualText)) {
			status = true;
		}
		return status;
	}
	


	
	

	public void assertText(WebElement element, String expectedText) {
		String actualText = element.getText().trim();
		//Assert.assertEquals(actualText, expectedText);
		//add external jar for the above
	}

	public static void sleep() throws InterruptedException {
		Thread.sleep(2000);
	}

	/**
	 * Mouse Hover and click on element
	 * 
	 * @param Mouse
	 *            Hover element
	 * @param Element
	 *            on which action need to be performed
	 * @return void
	 */
	public void mouseHoverAndClick(WebElement elementmouseHover, WebElement elementToPerformActions) {
		Actions action = new Actions(driver);
		action.moveToElement(elementmouseHover).moveToElement(elementToPerformActions).click().perform();
	}

	public void mouseOverActionDoubleclick(WebElement we, WebElement src) {
		Actions action = new Actions(driver);
		action.moveToElement(we).doubleClick(src).perform();

	}

	public void mouseOverAction(WebElement we) {
		Actions action = new Actions(driver);
		action.moveToElement(we).perform();
	}

	public void mouseOverAndClick(WebElement we) {
		Actions action = new Actions(driver);
		action.moveToElement(we).click().perform();
	}

	public void mouseOverAndDoubleClick(WebElement we) {
		Actions action = new Actions(driver);
		action.moveToElement(we).doubleClick().perform();
	}

	/**
	 * Perform keyboard action
	 * 
	 * @param key
	 * @param symbol
	 */
	public void keyBoard(Keys key, String symbol) {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.chord(key, symbol)).perform();
	}

	public void sendKeysKeyboard(WebElement element, String searchText) {
		element.clear();
		Actions act = new Actions(driver);
		act.sendKeys(element, searchText).perform();
	}

	/**
	 * perform right click on any element
	 * 
	 * @param we
	 */
	public void rightClick(WebElement we) {
		Actions act = new Actions(driver);
		act.contextClick(we).perform();
	}

	/**
	 * webDriver wait for linkText locator
	 * 
	 * @param linkName
	 */
	public void waitForLinkPresent(String linkName) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(linkName)));
	}

	/**
	 * webDriver wait for xpath locator
	 * 
	 * @param xpathExpression
	 */
	public void waitForXpathElementPresent(String xpathExpression) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathExpression)));

	}

	/**
	 * Switch to the alert and accept the alert
	 */
	public void acceptAlert() {
		Alert alt = driver.switchTo().alert();
		alt.getText();
		alt.accept();
	}

	/**
	 * Switch to the alert and cancel the alert
	 */
	public void cancelAlert() {
		Alert alt = driver.switchTo().alert();
		alt.getText();
		alt.dismiss();
	}

	/**
	 * Select a value(visibleText) from the drop down list using select class
	 * 
	 * @param xpathExpression
	 * @param visibleText
	 */
	public void select(String xpathExpression, String visibleText) {
		Select sel = new Select(driver.findElement(By.xpath(xpathExpression)));
		sel.selectByVisibleText(visibleText);
	}

	/**
	 * Select a value(Index) from the drop down list using select class
	 * 
	 * @param xpathExpression
	 * @param index
	 */
	public void select(String xpathExpression, int index) {
		Select sel = new Select(driver.findElement(By.xpath(xpathExpression)));
		sel.selectByIndex(index);
	}

	/**
	 * Get the text of the webelement
	 * 
	 * @param element
	 */
	public String getText(WebElement element) {
		String sElement = element.getText();
		System.out.println(element.getText());
		return sElement;
	}

	/**
	 * Getting current location of the project
	 * 
	 * @return getSystemProperties
	 */
	public static String getSystemProperties() {
		String getSystemProperty = System.getProperty("user.dir");
		return getSystemProperty;
	}

	public void switchToIFrame(WebElement element) {
		driver.switchTo().frame(element);
	}

	/**
	 * Switch to Iframe by index
	 * 
	 * @param i
	 */
	public void switchToIFrameIndex(int i) {
		driver.switchTo().frame(i);
	}

	public void changeColor(String id, String color) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("document.getElementById('" + id + "').setAttribute('value', '" + color + "')");
		// WebElement element = (WebElement)
		// executor.executeScript("document.getElementById('"+id+"').setAttribute('value',
		// '" +"#"+color+"')");
		// System.out.println(element);
	}

	public void findElementAndClick(By element) {
		waitForElementPresent(element);
		WebElement webElement = findByXpath(element);
		webElement.click();
	}

	public WebElement findByXpath(String xpathExpression) {
		return driver.findElement(By.xpath(xpathExpression));
	}

	public WebElement findById(String id) {
		return driver.findElement(By.id(id));
	}

	public void sleep(int milliSeconds) throws InterruptedException {
		Thread.sleep(milliSeconds);
	}

	public void waitForElementPresent(By element) {
		WebDriverWait wait = new WebDriverWait(driver, explicitWait);
		wait.until(ExpectedConditions.presenceOfElementLocated(element));
	}

	public void selectByText(String xpathExpression, String visibleText) {
		Select sel = new Select(driver.findElement(By.xpath(xpathExpression)));
		sel.selectByVisibleText(visibleText);
	}

	public void selectByText(By byExpression, String visibleText) {
		Select sel = new Select(findByXpath(byExpression));
		sel.selectByVisibleText(visibleText);
	}

	public void selectByIndex(String xpathExpression, int index) {
		Select sel = new Select(driver.findElement(By.xpath(xpathExpression)));
		sel.selectByIndex(index);
	}

	public static String getSystemProperties(String propName) {
		return System.getProperty(propName);
	}

	public void switchToIFrame(String element) {
		driver.switchTo().frame(element);
	}

	public void scrollDownJavaScript() {
		JavascriptExecutor javascriptExecutor = ((JavascriptExecutor) driver);
		javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public void scrollUPJavaScript() {
		JavascriptExecutor javascriptExecutor = ((JavascriptExecutor) driver);
		javascriptExecutor.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
	}

	public void scrollByXYPosition(String Xposition, String Yposition) {
		JavascriptExecutor javascriptExecutor = ((JavascriptExecutor) driver);
		javascriptExecutor.executeScript("window.scrollTo(" + Xposition + "," + Yposition + ")");
	}

	public void scrollToElement(WebElement webElement) {
		JavascriptExecutor javascriptExecutor = ((JavascriptExecutor) driver);
		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", webElement);

	}

	public WebElement findByXpath(By element) {
		/*
		 * if (waitFor) waitForElementPresent(element);
		 */
		return driver.findElement(element);
	}

	public String getAttribute(By element, String attribute) {

		return driver.findElement(element).getAttribute(attribute);
	}

	public void findElementAndSendkey(By element, String elementValue) {
		waitForElementPresent(element);
		WebElement webElement = findByXpath(element);
		webElement.sendKeys(elementValue);
	}

	public static String timeStamp(){

		return new SimpleDateFormat("yyMMddHHmmssSSS").format(new Date()); 
	}

	public boolean isElementPresent(By element){
		boolean b = false;

		try{
			driver.findElement(element);
			b = true;
		}

		catch(Exception e){
			b = false;
		}
		return b;
	}

	public int sizeOfElement(By element){
		return driver.findElements(element).size();

	}
	public String getAttributeCss(By element, String cssValue) {

		return driver.findElement(element).getCssValue(cssValue);
	}

	/**

	 * This function will take screenshot

	 * @param fileWithPath

	 * @throws Exception

	 */

	public void takeScreenShot(String batchId) throws Exception{

		File SrcFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(SrcFile, new File("C:\\Users\\Public\\Pictures\\"+batchId+".png"));
		// the above line will discuss later
	}


}



