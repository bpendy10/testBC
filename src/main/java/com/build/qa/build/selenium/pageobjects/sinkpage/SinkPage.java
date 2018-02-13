package com.build.qa.build.selenium.pageobjects.sinkpage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

import com.build.qa.build.selenium.pageobjects.BasePage;
import com.build.qa.build.selenium.pageobjects.homepage.HomePage;

public class SinkPage extends BasePage {
	private By sinkItem2;
	private By sinkItem3;
	private By productTitle;
	private By inStockMessage;
	private By addToCartButton;
	private By addedToCartMessage;
	private By productAddedToCartMessage;
    private By proceedToCartButton;
	private By shoppingCartHeader;
	private By itemTitle;
	
	boolean titleValidation;
	boolean productValidation;

	HomePage homePage;
	
	public SinkPage(WebDriver driver, Wait<WebDriver> wait) {
		super(driver, wait);
		sinkItem2 = By.xpath("(//div[@class='product-title-description'])[2]");
		sinkItem3 = By.xpath("(//div[@class='product-title-description'])[3]");
		productTitle = By.id("heading");
		inStockMessage = By.cssSelector("span.stock-message.js-stock-message.text-accent");
		addToCartButton = By.cssSelector("button.btn-standard.add-to-cart.js-add-to-cart");
		addedToCartMessage = By.cssSelector("div.container div.row h3");
		productAddedToCartMessage = By.cssSelector(".heading-s");
		proceedToCartButton = By.cssSelector("button.btn-standard.header-cart-button.js-cart-button");
		shoppingCartHeader = By.cssSelector("h1.inline-block.margin-right.pull-left");
		itemTitle = By.cssSelector("a.item-title");
	}

	public void selectProduct() {
		driver.findElement(sinkItem2).click();
		String productTitleText = driver.findElement(productTitle).getText();
		System.out.println("The 2nd sink item title is: " +productTitleText);
	}
	
	public void selectProduct3() {
		driver.findElement(sinkItem3).click();
		String productTitleText = driver.findElement(productTitle).getText();
		System.out.println("The 3rd sink item title is: " +productTitleText);
	}
	
	public void validateInStock() throws InterruptedException {
		boolean inStockMessagePresence = driver.findElement(inStockMessage).isDisplayed();
		boolean inStockMessageText = driver.findElement(inStockMessage).getText().contains("In Stock");

		if(inStockMessagePresence == true && inStockMessageText == true) {
			System.out.println("Element is Visible");
			Thread.sleep(4000);
			driver.findElement(addToCartButton).sendKeys(Keys.ENTER);
			Thread.sleep(4000);
		} else {
			System.out.println("Element is NOT visible");	
		}
	}

	public void validateProductAddedToCartMessage() throws InterruptedException {
		boolean productAddedToCartMessagePresence = driver.findElement(productAddedToCartMessage).isDisplayed();
		String productAddedToCartMessageText = driver.findElement(productAddedToCartMessage).getText();
		
		if(productAddedToCartMessagePresence == true) {
			System.out.println("Product added message is: " +productAddedToCartMessageText);
			System.out.println("Added to Cart message displayed");
			driver.findElement(proceedToCartButton).click();
			Thread.sleep(4000);
		} else {
			System.out.println("Product added to Cart message is NOT visible");
		}

	}
	
	public void validateJustAddedToCartMessage() throws InterruptedException {
		boolean addedToCartMessagePresence = driver.findElement(addedToCartMessage).isDisplayed();
		String addedToCartMessageText = driver.findElement(addedToCartMessage).getText();
				
		if(addedToCartMessagePresence == true) {
		System.out.println("Product added message is: " +addedToCartMessageText);
		System.out.println("Added to Cart message displayed");
		driver.findElement(proceedToCartButton).click();
		Thread.sleep(4000);
		} else {
			System.out.println("Just Added to Cart message is NOT visible");
		}
	}

	public boolean validateProductAddedToCart() throws InterruptedException {
		boolean shoppingCartHeaderPresense = driver.findElement(shoppingCartHeader).isDisplayed();
		String productLabel = "Miseno MNO2113RU";

		if(shoppingCartHeaderPresense == true) {
			String cartAddedItem = driver.findElement(itemTitle).getText();
			System.out.println("Item Title is " +cartAddedItem);

			if((productLabel).contains(cartAddedItem)) {
			productValidation = true;
			System.out.println("The product title added to cart matches");
			} else {
			productValidation = false;
			System.out.println("The product doesn't match");
			}
			return productValidation;
		}
		return false;
	}
}
