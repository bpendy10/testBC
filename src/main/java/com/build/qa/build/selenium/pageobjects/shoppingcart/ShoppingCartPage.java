package com.build.qa.build.selenium.pageobjects.shoppingcart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

import com.build.qa.build.selenium.pageobjects.BasePage;

public class ShoppingCartPage extends BasePage {
	
	boolean validateCartEmail;
	
	private By emailYourCartButton;
	private By emailCartDialog;
	private By yourName;
	private By yourEmail;
	private By recipientsName;
	private By recipientsEmail;
	private By otherRecipientsEmail;
	private By quoteMessage;
	private By projectTitle;
	private By emailCartButton;
	private By emailSentMessage;
	
	public ShoppingCartPage(WebDriver driver, Wait<WebDriver> wait) {
		super(driver, wait);
		emailYourCartButton = By.cssSelector("button.btn-standard.btn-secondary.btn-email.js-email-cart-button");
		emailCartDialog = By.id("cart-email");
		yourName = By.id("yourName");
		yourEmail = By.id("yourEmail");
		recipientsName = By.id("recipientName");
		recipientsEmail = By.id("recipientEmail");
		otherRecipientsEmail = By.id("otherRecipients");
		projectTitle = By.id("projectTitle");
		quoteMessage = By.id("quoteMessage");
		emailCartButton = By.cssSelector("button.button-primary.button.js-email-cart-submit-button");
		emailSentMessage = By.cssSelector("div.js-notifications.notifications.text-center");
	}

	public void emailCart() throws Exception {
		boolean emailYourCartButtonPresence = driver.findElement(emailYourCartButton).isEnabled();
		
		if(emailYourCartButtonPresence == true) {
			Thread.sleep(4000);
			driver.findElement(emailYourCartButton).click();
		} else {
			System.out.println("Email Your Cart Button did NOT display");
		}

        boolean emailCartDialogPresence = driver.findElement(emailCartDialog).isDisplayed();
        

        if(emailCartDialogPresence == true) {
        	driver.findElement(yourName).sendKeys("Brandon");
        	driver.findElement(yourEmail).sendKeys("bpendy20@yahoo.com");
        	driver.findElement(recipientsName).sendKeys("build.com");
        	driver.findElement(recipientsEmail).sendKeys("bpendy20@yahoo.com");
        	driver.findElement(otherRecipientsEmail).sendKeys("jgilmore+SeleniumTest@build.com");
        	driver.findElement(projectTitle).sendKeys("Test Project");
        	driver.findElement(quoteMessage).sendKeys("This is Brandon, sending you a cart from my automation!");
        	Thread.sleep(4000);
        	driver.findElement(emailCartButton).click();
        	Thread.sleep(4000);
        } else {
        	System.out.println("Email dialog did NOT display");
        	System.out.println("Email Your Cart Button did not display");
        	
        }
	}
	
	public boolean validateCartSentEmail() {
		boolean emailSentMessagePresence = driver.findElement(emailSentMessage).isDisplayed();
		String cartSentMessageText = driver.findElement(emailSentMessage).getText();
		System.out.println("Cart Sent Message Text is: " +cartSentMessageText);
		
		if(emailSentMessagePresence == true) {
			validateCartEmail = true;
			System.out.println("Email Cart message displayed");
		} else {
			validateCartEmail = false;
			System.out.println("Email Cart message NOT displayed");
		}
		return validateCartEmail;
	}
}
