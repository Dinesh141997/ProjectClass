package org.test1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.remote.server.handler.interactions.SendKeyToActiveElement;
import org.seleniumhq.jetty9.util.thread.ExecutionStrategy.Producer;
import org.test.BaseClass;
import org.test.LoginPage;
import org.test.ProductPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Enter;

public class TaskDay1 extends BaseClass {
	@Test
	private void mobileName() {
		browserlunch("chrome");
		implecityWait(10);
		urlLunch("https://www.flipkart.com/");
		LoginPage l = new LoginPage();
		sendKeys(l.getTxtUserName(), "dinesh9viji@gmail.com");
		sendKeys(l.getTxtPassword(), "Dinesh@1997");
		buttonClick(l.getBtnCancel());
		WebElement searchPro = driver.findElement(By.name("q"));
		searchPro.sendKeys("I phone");
		WebElement btnSearch = driver.findElement(By.className("L0Z3Pu"));
		btnSearch.click();
		List<WebElement> proName = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		int size = proName.size();
		for (int i = 0; i <size; i++) {
			WebElement allName = proName.get(i);
			String text = allName.getText();
			System.out.println(text);
		}	
	}
	@Test
	private void mobilePrice() {
		browserlunch("chrome");
		implecityWait(10);
		urlLunch("https://www.flipkart.com/");
		LoginPage l = new LoginPage();
		sendKeys(l.getTxtUserName(), "dinesh9viji@gmail.com");
		sendKeys(l.getTxtPassword(), "Dinesh@1997");
		buttonClick(l.getBtnCancel());
		WebElement searchPro = driver.findElement(By.name("q"));
		searchPro.sendKeys("I phone");
		WebElement btnSearch = driver.findElement(By.className("L0Z3Pu"));
		btnSearch.click();
		List<WebElement> mobPrice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		int size = mobPrice.size();
		for (int i = 0; i <size; i++) {
			WebElement allPrice = mobPrice.get(i);
			String text = allPrice.getText();
			System.out.println(text);
		}
	}
}
