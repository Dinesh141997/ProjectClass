package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public  LoginPage() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	private WebElement txtUserName;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement btnCancel;
	
	@FindBy(xpath = "(//a[@role='button'])[2]")
	private WebElement createNew;
	
	public WebElement getCreateNew() {
		return createNew;
	}
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getBtnCancel() {
		return btnCancel;
	}

}
