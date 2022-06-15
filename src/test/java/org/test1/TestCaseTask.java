package org.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.test.BaseClass;
import org.testng.annotations.Test;

public class TestCaseTask extends BaseClass {
	@Test
	private void TestCase() {
		browserlunch("chrome");
		implecityWait(15);
		urlLunch("https://www.flipkart.com/");
		WebElement textUsername = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		textUsername.sendKeys("dinesh9viji@gmail.com");
		WebElement txextPassword = driver.findElement(By.xpath("//input[@type='password']"));
		txextPassword.sendKeys("Dinesh9@2022");
		quitBrowser();
	}
	@Test
	private void TestCase1() {
	browserlunch("chrome");
	implecityWait(15);
	urlLunch("https://www.flipkart.com/");
	WebElement textUsername = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	textUsername.sendKeys("dinesh9viji@gmail.com");
	WebElement txextPassword = driver.findElement(By.xpath("//input[@type='password']"));
	txextPassword.sendKeys("Dinesh");
	quitBrowser();
}
	@Test
	private void TestCase2() {
	browserlunch("chrome");
	implecityWait(15);
	urlLunch("https://www.flipkart.com/");
	WebElement textUsername = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	textUsername.sendKeys("dinesh@gmail.com");
	WebElement txextPassword = driver.findElement(By.xpath("//input[@type='password']"));
	txextPassword.sendKeys("Dinesh9@2022");
	quitBrowser();
}
	@Test
	private void TestCase3() {
	browserlunch("chrome");
	implecityWait(15);
	urlLunch("https://www.flipkart.com/");
	WebElement textUsername = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	textUsername.sendKeys("dinesh@gmail.com");
	WebElement txextPassword = driver.findElement(By.xpath("//input[@type='password']"));
	txextPassword.sendKeys("Dinesh@2022");
	quitBrowser();
}
	@Test
	private void TestCase4() {
	browserlunch("chrome");
	implecityWait(15);
	urlLunch("https://www.flipkart.com/");
	WebElement textUsername = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	textUsername.sendKeys("9976342176");
	WebElement txextPassword = driver.findElement(By.xpath("//input[@type='password']"));
	txextPassword.sendKeys("Dinesh9@2022");
	quitBrowser();
}
	@Test
	private void TestCase5() {
	browserlunch("chrome");
	implecityWait(15);
	urlLunch("https://www.flipkart.com/");
	WebElement textUsername = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	textUsername.sendKeys("9976342177");
	WebElement txextPassword = driver.findElement(By.xpath("//input[@type='password']"));
	txextPassword.sendKeys("Dinesh9@2022");
	quitBrowser();
}
	@Test
	private void TestCase6() {
	browserlunch("chrome");
	implecityWait(15);
	urlLunch("https://www.flipkart.com/");
	WebElement textUsername = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	textUsername.sendKeys("9976342176");
	WebElement txextPassword = driver.findElement(By.xpath("//input[@type='password']"));
	txextPassword.sendKeys("Dinesh");
	quitBrowser();
}
	@Test
	private void TestCase7() {
	browserlunch("chrome");
	implecityWait(15);
	urlLunch("https://www.flipkart.com/");
	WebElement textUsername = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	textUsername.sendKeys("9976342176");
	WebElement txextPassword = driver.findElement(By.xpath("//input[@type='password']"));
	txextPassword.sendKeys("Dinesh9");
	quitBrowser();
}
}
