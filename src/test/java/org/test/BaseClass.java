
package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	private static WebElement src;
		//BrowserLunch Type 1
//			public static WebDriver browserlunch() {
//			WebDriverManager.chromedriver().setup();
//			driver=new ChromeDriver();
//			return driver;
//		}	
		//BrowserLunch Type 2
		public static WebDriver browserlunch(String browserName) {
			if(browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}else if(browserName.equalsIgnoreCase("firfox")) {
				WebDriverManager.firefoxdriver().setup();
				driver =new FirefoxDriver();
			}else if(browserName.equalsIgnoreCase("opera")) {
				WebDriverManager.operadriver().setup();
				driver = new OperaDriver();
			}
			return driver;
		}
		//Url lunch
		public static void urlLunch(String url) {
			driver.manage().window().maximize();
			driver.get(url);	
		}
		//Wait
		public static void implecityWait(long time) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		//getCurrent Url
		public static String getCurrentUrl() {
			String currentUrl = driver.getCurrentUrl();
			return currentUrl;
		}
		//Title
		public static String getTitle(){
		return driver.getTitle();
		}
		//quit
		public static void quitBrowser() {
			driver.quit();
		}
		//SendKeys
		public static void sendKeys(WebElement e,String value) {
			e.sendKeys(value);
		}
		//Click
		public static void buttonClick(WebElement e){
			e.click();
		}
		//GetAttribute
		public static String getAttribute(WebElement e) {
			return e.getAttribute("value");
		}
		//GetText
		public static String gettext(WebElement e) {
			String text = e.getText();
			return text;
		}
		//Action
		//MovetoElement
		public static void moveToEleement(WebElement e) {
			Actions a=new Actions(driver);
			a.moveToElement(e).perform();
		}
		//Drag&Drop
		public static void dragAndDrop(WebElement src,WebElement des) {
			Actions a= new Actions(driver);
			a.dragAndDrop(src, des).perform();
		}
		//Select
		//SelectbyIndex
		public static void selectByIndex(WebElement e,int index) {
			Select s = new Select(e);
			s.selectByIndex(index);
		}
		//select by Value
		public static void selectByValue(WebElement e,String value) {
			Select s = new Select(e);
			s.selectByValue(value);
		}
		//Select By Visible Text
		public static void SelectByVisibleText(WebElement e,String a) {
			Select s= new Select(e);
			s.selectByVisibleText(a);
		}
		//Deselect by Index
		public static void deSelectByIndex(WebElement e,int a) {
			Select s= new Select(e);
			s.deselectByIndex(a);
		}
		//Deselect by value
		public static void deSelectByValue(WebElement e,String a) {
			Select s= new Select(e);
			s.deselectByValue(a);
		}
		//Deselect by VisibleText
		public static void deSelectByVisibleText(WebElement e,String a) {
			Select s= new Select(e);
			s.deselectByVisibleText(a);	
		}
		//Deselect by VisibleText
		public static void deSelectByAll(WebElement e) {
			Select s= new Select(e);
			s.deselectAll();	
		}
		//FindElements	
		public static WebDriver findElement(String locatorName,String locatorValue) {
		    WebElement value =null;
				if(locatorName.equals("id")) {
					  value = driver.findElement(By.id(locatorName));
				}
				else if(locatorName.equals("name")) {
					 value = driver.findElement(By.name(locatorValue));
					 
				}
				
				else if(locatorName.equals("xpath")) {
					value = driver.findElement(By.xpath(locatorValue));
				}
				return driver;
			   }
		
		//javaScriptExcutor
		//setAttribute
		public static void javaScriptsendkeys(WebElement e,String name,int a) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[a].setAttribute('value','"+name+"')", e);
		}
		//getAttribute
		public static String javaScript(WebElement e) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			Object obj = js.executeScript("return arguments[0].getAttribute('value')", e);
			String atUser = obj.toString();
			return atUser;
		}
		//click
		public static void javaScriptclick(WebElement e,int b) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[b].click()", e);
		}
		//scrollup and Scroll Down
		public static void scrollup(int b,WebElement e) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[b].scrillIntoView('true)", e);
		}
		public static void scrollDown(WebElement e,int b) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[b].scrillIntoView('false)", e);
		}
		
		//Windows handling
		public static  void handling() {
			String parentId1 = driver.getWindowHandle();
			Set<String> allId = driver.getWindowHandles();
			for(String eachid:allId) {
				if(!parentId1.equals(eachid)) {
					driver.switchTo().window(eachid);
				}
			}
		}
		
		public static void screenShort(String imagename) throws IOException {
			TakesScreenshot tk=(TakesScreenshot)driver;
			File source = tk.getScreenshotAs(OutputType.FILE);
			File des= new File(System.getProperty("user.dir")+"\\ScreenShorts\\"+imagename+".png");
			FileUtils.copyFile(source, des);

		}
		
		
		//Data Driven frame Work
//		public static String getExceldata() {
//			File loc = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Mining\\src\\test\\resources\\FLEET UPLOAD.xlsx");
//			FileInputStream fi = new FileInputStream(loc);
//			workbook w= new HSSFWorkbook();
//		}

}
