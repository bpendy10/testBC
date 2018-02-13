package com.build.qa.build.selenium.pageobjects.bathroomfaucets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import com.build.qa.build.selenium.pageobjects.BasePage;

public class BathroomFaucetsPage extends BasePage {
	
	private By headerMenu;
	private By bathroomCategory;
	private By bathroomFaucetsCategory;
	private By colorsChrome;
	private By colorsChromeLabel;
	private By filtersModern;
	private By filtersModernLabel;
	private By productCount;
	
	boolean validateCount;

	public BathroomFaucetsPage(WebDriver driver, Wait<WebDriver> wait) {
		super(driver, wait);
		headerMenu = By.cssSelector("ul.table");
		bathroomCategory = By.xpath("//li[@class='header-menu-style']/a[@data-tracking = 'nav:menu:category:Bathroom']");
		bathroomFaucetsCategory = By.xpath("//div[@class='table mega-categories']/a[@data-tracking = 'nav:menu:category:Bathroom:Bathroom Faucets']");
		colorsChrome = By.cssSelector("label.sub-item.qa-facetGroup-Colors-facetValue-Chromes input");
		colorsChromeLabel = By.cssSelector(".qa-facetGroup-Colors-facetValue-Chromes");
		filtersModernLabel = By.cssSelector(".qa-facetGroup-Theme-facetValue-Modern");
		filtersModern = By.cssSelector("label.sub-item.qa-facetGroup-Theme-facetValue-Modern input");
		productCount = By.cssSelector(".js-num-results");
	}
	
	public void hoverAndSelect() {
		Actions actions = new Actions(driver);
		WebElement menu = driver.findElement(headerMenu);
		wait.until(ExpectedConditions.elementToBeClickable(headerMenu));
		actions.moveToElement(menu).build().perform();
		
		WebElement bathroomMenu = driver.findElement(bathroomCategory);
		wait.until(ExpectedConditions.elementToBeClickable(bathroomCategory));
		actions.moveToElement(bathroomMenu).build().perform();

		WebElement subMenu = driver.findElement(bathroomFaucetsCategory);
		wait.until(ExpectedConditions.elementToBeClickable(subMenu));
		actions.moveToElement(subMenu).click().build().perform();
	}
	
	public int originalProductCount() {
		String originalCount = driver.findElement(productCount).getText();
		System.out.println("Total Bathroom Faucets Count: "+originalCount);
		originalCount = originalCount.replaceAll(",","");
		System.out.println("Total Bathroom Faucets Count after removal: " +originalCount);
		int origCount = Integer.parseInt(originalCount);
		System.out.println("Total Bathroom Faucets Count (integer): "+origCount);
		return origCount;
	}
	
	public void selectChromesOption() {
		Actions actions = new Actions(driver);
		WebElement chromes = driver.findElement(colorsChromeLabel);
		wait.until(ExpectedConditions.elementToBeClickable(chromes));
		actions.moveToElement(chromes).build().perform();
		driver.findElement(colorsChrome).click();
	}
	
	public void selectModernOptions() {
		Actions actions = new Actions(driver);
		WebElement modern = driver.findElement(filtersModernLabel);
		wait.until(ExpectedConditions.elementToBeClickable(modern));
		actions.moveToElement(modern).build().perform();
		driver.findElement(filtersModern).click();
	}
	
	public int finalProductCount() {
		String finalCount = driver.findElement(productCount).getText();
		System.out.println("Total Product Results Count is: " +finalCount);
		finalCount = finalCount.replaceAll(",","");
		System.out.println("Total Product Results Count after removal is: " +finalCount);
		int finalProdCount = Integer.parseInt(finalCount);
		System.out.println("Total Product Results Count (integer)" +finalProdCount);
		return finalProdCount;	
	}
	
	public boolean compareProductCount() {
		if(originalProductCount() < finalProductCount()) {
			validateCount = true;
		} else {
			validateCount = false;
		}
		return validateCount;
	}
}