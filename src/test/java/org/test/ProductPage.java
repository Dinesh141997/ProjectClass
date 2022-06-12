package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BaseClass {
	public ProductPage() {
		PageFactory.initElements(driver,this);	
	}
	@FindBy(name = "q")
	private WebElement txtSearch;
	public WebElement getTxtSearch() {
		return txtSearch;
	}
	@FindBy(className = "L0Z3Pu")
	private WebElement btnSearch;
	public WebElement getBtnSearch() {
		return btnSearch;
	}
	@FindBy(xpath = "//div[@class='_4rR01T']")
	private WebElement btnProduct;
	public WebElement getBtnProduct() {
		return btnProduct;
	}

}
