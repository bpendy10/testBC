package com.build.qa.build.selenium.pageobjects.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import com.build.qa.build.selenium.pageobjects.BasePage;

public class HomePage extends BasePage {
	
	private By buildThemeBody;
	private By emailPopup;
	private By emailPopupClose;
	private By searchForm;
	private By searchButton;
	private By productTitle;
	boolean validateTitle;
	
	public HomePage(WebDriver driver, Wait<WebDriver> wait) {
		super(driver, wait);
		buildThemeBody = By.cssSelector("body.build-theme");
		emailPopup = By.id("email-subscribe-splash");
		emailPopupClose = By.xpath("//*[@id='email-subscribe-splash']/div/div/div[1]/button");
		searchForm = By.cssSelector(".search-site input");
		searchButton = By.cssSelector(".search-site-search");
		productTitle = By.id("heading");
	}
	
	public boolean onBuildTheme() { 
		return wait.until(ExpectedConditions.presenceOfElementLocated(buildThemeBody)) != null;
	}
	
	public void closeEmailPopup() throws InterruptedException {
    	if (wait.until(ExpectedConditions.presenceOfElementLocated(emailPopup)) != null) {
    		System.out.println("Email Popup located");
    		Thread.sleep(8000);
    		driver.findElement(emailPopupClose).click();
    	} else {
    		System.out.println("The Email Newsletter Popup is not displaying.");
    	}
    }

    public void searchProduct(String searchText) {
    	driver.findElement(searchForm).sendKeys(searchText);
    	driver.findElement(searchButton).click();
    }

    public boolean validateTitle(String title) {
		String productTitleText = driver.findElement(productTitle).getText();
		System.out.println("The Product Title is: " +productTitleText);
		validateTitle = productTitleText.contains(title);
		System.out.println("The Title is: " +title);
		return validateTitle;
	}

}
