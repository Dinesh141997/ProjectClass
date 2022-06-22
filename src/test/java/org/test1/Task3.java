package org.test1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.test.BaseClass;
import org.test.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task3 extends BaseClass {
	@BeforeMethod
	private void beforeMethod() {
		browserlunch("chrome");
		implecityWait(10);

	}
	@AfterMethod
	private void afterMethod() {
		quitBrowser();

	}
	@Test
	private void Search() throws AWTException, InterruptedException {
	urlLunch("https://www.flipkart.com/");
	LoginPage l = new LoginPage();
	sendKeys(l.getTxtUserName(), "dinesh9viji@gmail.com");
	sendKeys(l.getTxtPassword(), "Dinesh@1997");
	buttonClick(l.getBtnCancel());
	WebElement searchPro = driver.findElement(By.name("q"));
	searchPro.sendKeys("I phone");
	Robot r= new Robot();
	int count =1;
	for (int i = 0; i <10; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(10);
		System.out.println(count+" "+getAttribute(searchPro));
		count++;
	}
	
}

}
