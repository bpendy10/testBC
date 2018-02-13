package com.build.qa.build.selenium.tests;


import org.junit.Test;

import com.build.qa.build.selenium.framework.BaseFramework;
import com.build.qa.build.selenium.pageobjects.bathroomfaucets.BathroomFaucetsPage;
import com.build.qa.build.selenium.pageobjects.homepage.HomePage;
import com.build.qa.build.selenium.pageobjects.shoppingcart.ShoppingCartPage;
import com.build.qa.build.selenium.pageobjects.sinkpage.SinkPage;

public class BuildTest extends BaseFramework {
	
	BathroomFaucetsPage bathroomfaucets;
	HomePage homepage;
	SinkPage sinkpage;
	ShoppingCartPage shoppingcart;
	
	
	/** 
	 * Extremely basic test that outlines some basic
	 * functionality and page objects as well as assertJ
	 */
	@Test
	public void navigateToHomePage() { 
		driver.get(getConfiguration("HOMEPAGE"));
		HomePage homePage = new HomePage(driver, wait);
		
		softly.assertThat(homePage.onBuildTheme())
			.as("The website should load up with the Build.com desktop theme.")
			.isTrue();
	}
	
	/** 
	 * Search for the Quoizel MY1613 from the search bar
	 * @throws InterruptedException
	 * @assert: That the product page we land on is what is expected by checking the product title
	 * @difficulty Easy
	 */
	@Test
	public void searchForProductLandsOnCorrectProduct() throws InterruptedException { 
		// TODO: Implement this test
		driver.get(getConfiguration("HOMEPAGE"));
		HomePage homePage = new HomePage(driver, wait);
		
		// close email newsletter popup if displays upon first launch of bathroom sinks page
		homePage.closeEmailPopup();
		// create string for Search text to enter into search box
		String searchText = "Quoizel MY1613";
		        
		// enter search text into search box and click submit button
		homePage.searchProduct(searchText);
				
		// assert the title of the search results page landed on contains text queried
		softly.assertThat(homePage.validateTitle(searchText))
		.as("The product page landed on is verified as product heading contains exptected title: Quoizel MY1613")
		.isTrue();
				
			}
	
	/** 
	 * Go to the Bathroom Sinks category directly (https://www.build.com/bathroom-sinks/c108504) 
	 * and add the second product on the search results (Category Drop) page to the cart.
	 * @throws InterupptedException
	 * @assert: the product that is added to the cart is what is expected
	 * @difficulty Easy-Medium
	 */
	@Test
	public void addProductToCartFromCategoryDrop() throws InterruptedException { 
		// TODO: Implement this test
		HomePage homePage = new HomePage(driver, wait);
		SinkPage sinkPage = new SinkPage(driver, wait);
		
		//navigate to Bathroom Sinks page directly
		driver.get(getConfiguration("SINKPAGE"));
		driver.manage().window().maximize();
			
		// close email newsletter popup if displays upon first launch of bathroom sinks page
		homePage.closeEmailPopup();
		Thread.sleep(3000);
		
		// select the 2nd product on the Bathroom Sinks product page
		sinkPage.selectProduct();

		// validate item in stock on product details page
		sinkPage.validateInStock();

		// validate item added to Shopping Cart
		sinkPage.validateJustAddedToCartMessage();

		// assert product selected/added to cart matches what is expected
		softly.assertThat(sinkPage.validateProductAddedToCart())
		.as("The product added to the cart matches what is expected.")
		.isTrue();
	}
	
	/** 
	 * Add a product to the cart and email the cart to yourself, also to my email address: jgilmore+SeleniumTest@build.com
	 * Include this message in the "message field" of the email form: "This is {yourName}, sending you a cart from my automation!"
	 * @throws Exception 
	 * @assert that the "Cart Sent" success message is displayed after emailing the cart
	 * @difficulty Medium-Hard
	 */
	@Test
	public void addProductToCartAndEmailIt() throws Exception { 
		// TODO: Implement this test
		HomePage homePage = new HomePage(driver, wait);
		ShoppingCartPage shoppingCart = new ShoppingCartPage(driver, wait);
		SinkPage sinkPage = new SinkPage(driver, wait);
		
		//navigate to Bathroom Sinks page directly
		driver.get(getConfiguration("SINKPAGE"));
		driver.manage().window().maximize();
					
		// close email newsletter popup if displays upon first launch of bathroom sinks page
		homePage.closeEmailPopup();
		Thread.sleep(3000);
		
		// select 3rd product item on Bathroom Sinks page
		sinkPage.selectProduct3();
		sinkPage.validateInStock();
		sinkPage.validateProductAddedToCartMessage();
		
		// select Email Your Cart button and submit cart
		shoppingCart.emailCart();
				
		// assert Cart Sent message is displayed upon successful email of shopping cart
		softly.assertThat(shoppingCart.validateCartSentEmail())
		.as("Cart Sent message displayed successfully")
		.isTrue();
	}
	
	/** 
	 * Go to a category drop page (such as Bathroom Faucets) and narrow by
	 * at least two filters (facets), e.g: Finish=Chromes and Theme=Modern
	 * @throws InterruptedException 
	 * @assert that the correct filters are being narrowed, and the result count
	 * is correct, such that each facet selection is narrowing the product count.
	 * @difficulty Hard
	 */
	@Test
	public void facetNarrowBysResultInCorrectProductCounts() throws InterruptedException { 
		// TODO: Implement this test
		// navigate to home page (https://build.com)
		driver.get(getConfiguration("HOMEPAGE"));
		driver.manage().window().maximize();
		
		BathroomFaucetsPage bathroomfaucets = new BathroomFaucetsPage(driver, wait);
		HomePage homePage = new HomePage(driver, wait);
		
		// close email newsletter popup if displays upon first launch of bathroom sinks page
		homePage.closeEmailPopup();
		Thread.sleep(3000);
		
		// select Bathroom Faucets category drop down
		bathroomfaucets.hoverAndSelect();
		Thread.sleep(5000);
		
		// get original Bathroom Faucets product total
		bathroomfaucets.originalProductCount();
		
		// select Chrome checkbox from Colors dropdown
		bathroomfaucets.selectChromesOption();
		Thread.sleep(5000);
		
		//select Modern checkbox from Themes dropdown
		bathroomfaucets.selectModernOptions();
		
		// get Bathroom Faucets filtered product total
		bathroomfaucets.finalProductCount();
		
		// assert 
		softly.assertThat(bathroomfaucets.compareProductCount())
		.as("Filtering options should narrow total Product count")
		.isTrue();
	}
}
