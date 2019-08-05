package com.shootproof.qa.build.selenium.pageobjects.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import com.shootproof.qa.build.selenium.pageobjects.BasePage;

public class HomePage extends BasePage {
	
	private By homePageFtdArea;
	private By getStartedBtn;

	boolean elementValidation;
	
	public HomePage(WebDriver driver, Wait<WebDriver> wait) {
		super(driver, wait);
		homePageFtdArea = By.cssSelector(".row.feature-text");
		getStartedBtn = By.cssSelector("p#navbar-button-trigger a.btn.btn-shootproof.google-ads-signup-tracking");
	}
	
	public boolean homePageLoad() { 
		return wait.until(ExpectedConditions.presenceOfElementLocated(homePageFtdArea)) != null;
	}
	
	public boolean verifyCurrentUrl() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
    		System.out.println("Actual Url: = " +currentUrl);
    		String expectedUrl = "https://www.shootproof.com/";
    		System.out.println("Expected Url: " +expectedUrl);

    		if ((expectedUrl).matches(currentUrl)) {
    			elementValidation = true;
    		} else {
    			elementValidation = false;
    		}
    		return elementValidation;
    }

    public void clickGetStartedButton() {
    	driver.findElement(getStartedBtn).click();
    }
}