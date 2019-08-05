package com.shootproof.qa.build.selenium.tests;


import org.junit.Test;

import com.shootproof.qa.build.selenium.framework.BaseFramework;
import com.shootproof.qa.build.selenium.pageobjects.homepage.HomePage;
import com.shootproof.qa.build.selenium.pageobjects.signuppage.SignUpPage;

public class BuildTest extends BaseFramework {
	
	HomePage homepage;
	SignUpPage signuppage;
	
	

	/** 
	 * Verify Home Page loads with body section
	 */
	@Test
	public void navigateToHomePage() { 
		driver.get(getConfiguration("HOMEPAGE"));
		HomePage homePage = new HomePage(driver, wait);
		
		softly.assertThat(homePage.homePageLoad())
			.as("Home Page loads with body section")
			.isTrue();
	}
	
	/** 
	 * Verify Current Url on Home Page (i.e. https://www.shootproof.com/)
	 * @throws InterruptedException
	 * @assert: Home Page - Current Url matches expected
	 */
	@Test
	public void verifyHomePageCurrentUrl() throws InterruptedException {

		// navigate to ShootProof.com
                driver.get(getConfiguration("HOMEPAGE"));
		HomePage homePage = new HomePage(driver, wait);
				
		// assert the Home page current Url matches expected
		softly.assertThat(homePage.verifyCurrentUrl())
		.as("Home Page - Current Url matches expected")
		.isTrue();
				
		}
	
	/** 
	 * Navigate to Home page and click on the GET STARTED button
	 * to verify Logo on Sign Up page
	 * @throws InterupptedException
	 * @assert: logo is displayed on Sign Up Page
	 */
	@Test
	public void verifySignUpPageLogo() throws InterruptedException {

		HomePage homePage = new HomePage(driver, wait);
		SignUpPage signUpPage = new SignUpPage(driver, wait);
		
		//  navigate to home page
		driver.get(getConfiguration("HOMEPAGE"));
		
		// click GET STARTED button via body
		homePage.clickGetStartedButton();

		// assert logo is displayed on Sign Up Page
		softly.assertThat(signUpPage.verifyLogo())
		.as("Sign Up Page - Logo displays as expected")
		.isTrue();
	}

	/** 
	 * Navigate to Home page and click on the GET STARTED button
	 * to verify Let's Get Started text on Sign Up page
	 * @throws InterupptedException
	 * @assert: Let's Get Started text matches as expected on Sign Up Page
	 */
	@Test
	public void verifySignUpPageLetsGetStartedText() throws InterruptedException {

		HomePage homePage = new HomePage(driver, wait);
		SignUpPage signUpPage = new SignUpPage(driver, wait);
		
		//  navigate to home page
		driver.get(getConfiguration("HOMEPAGE"));
		
		// click GET STARTED button via body
		homePage.clickGetStartedButton();

		// assert Let's Get Started text matches as expected on Sign Up Page
		softly.assertThat(signUpPage.verifyLetsGetStartedText())
		.as("Sign Up Page - Let's Get Started text matches as expected")
		.isTrue();
	}
	
	/** 
	 * Navigate to Home page and click on the GET STARTED button
	 * to verify Studio Name label text on Sign Up page
	 * @throws InterupptedException
	 * @assert: Studio Name label text matches as expected on Sign Up Page
	 */
	@Test
	public void verifySignUpPageStudioNameText() throws InterruptedException {

		HomePage homePage = new HomePage(driver, wait);
		SignUpPage signUpPage = new SignUpPage(driver, wait);
		
		//  navigate to home page
		driver.get(getConfiguration("HOMEPAGE"));
		
		// click GET STARTED button via body
		homePage.clickGetStartedButton();

		// assert Studio Name label text matches as expected on Sign Up Page
		softly.assertThat(signUpPage.verifyStudioNameLabel())
		.as("Sign Up Page - Studio Name label text matches as expected")
		.isTrue();
	}

	/** 
	 * Navigate to Home page and click on the GET STARTED button
	 * to verify Studio Name form displays on Sign Up page
	 * @throws InterupptedException
	 * @assert: Studio Name form displays on Sign Up Page
	 */
	@Test
	public void verifySignUpPageStudioNameForm() throws InterruptedException {

		HomePage homePage = new HomePage(driver, wait);
		SignUpPage signUpPage = new SignUpPage(driver, wait);
		
		//  navigate to home page
		driver.get(getConfiguration("HOMEPAGE"));
		
		// click GET STARTED button via body
		homePage.clickGetStartedButton();

		// assert Studio Name label text matches as expected on Sign Up Page
		softly.assertThat(signUpPage.verifyStudioNameForm())
		.as("Sign Up Page - Studio Name form displays as expected")
		.isTrue();
	}

	/** 
	 * Navigate to Home page and click on the GET STARTED button
	 * to verify Email label text on Sign Up page
	 * @throws InterupptedException
	 * @assert: Email label text matches as expected on Sign Up Page
	 */
	@Test
	public void verifySignUpPageEmailText() throws InterruptedException {

		HomePage homePage = new HomePage(driver, wait);
		SignUpPage signUpPage = new SignUpPage(driver, wait);
		
		//  navigate to home page
		driver.get(getConfiguration("HOMEPAGE"));
		
		// click GET STARTED button via body
		homePage.clickGetStartedButton();

		// assert Email label text matches as expected on Sign Up Page
		softly.assertThat(signUpPage.verifyEmailLabel())
		.as("Sign Up Page - Email label text matches as expected")
		.isTrue();
	}

	/** 
	 * Navigate to Home page and click on the GET STARTED button
	 * to verify Email form displays on Sign Up page
	 * @throws InterupptedException
	 * @assert: Email form displays on Sign Up Page
	 */
	@Test
	public void verifySignUpPageEmailForm() throws InterruptedException {

		HomePage homePage = new HomePage(driver, wait);
		SignUpPage signUpPage = new SignUpPage(driver, wait);
		
		//  navigate to home page
		driver.get(getConfiguration("HOMEPAGE"));
		
		// click GET STARTED button via body
		homePage.clickGetStartedButton();

		// assert Email form displays on Sign Up Page
		softly.assertThat(signUpPage.verifyEmailForm())
		.as("Sign Up Page - Email form displays as expected")
		.isTrue();
	}

	/** 
	 * Navigate to Home page and click on the GET STARTED button
	 * to verify Password label text on Sign Up page
	 * @throws InterupptedException
	 * @assert: Password label text matches as expected on Sign Up Page
	 */
	@Test
	public void verifySignUpPagePasswordText() throws InterruptedException {

		HomePage homePage = new HomePage(driver, wait);
		SignUpPage signUpPage = new SignUpPage(driver, wait);
		
		//  navigate to home page
		driver.get(getConfiguration("HOMEPAGE"));
		
		// click GET STARTED button via body
		homePage.clickGetStartedButton();

		// assert Password label text matches as expected on Sign Up Page
		softly.assertThat(signUpPage.verifyPasswordLabel())
		.as("Sign Up Page - Password label text matches as expected")
		.isTrue();
	}

	/** 
	 * Navigate to Home page and click on the GET STARTED button
	 * to verify Password form displays on Sign Up page
	 * @throws InterupptedException
	 * @assert: Password form displays on Sign Up Page
	 */
	@Test
	public void verifySignUpPagePasswordForm() throws InterruptedException {

		HomePage homePage = new HomePage(driver, wait);
		SignUpPage signUpPage = new SignUpPage(driver, wait);
		
		//  navigate to home page
		driver.get(getConfiguration("HOMEPAGE"));
		
		// click GET STARTED button via body
		homePage.clickGetStartedButton();

		// assert Password form displays on Sign Up Page
		softly.assertThat(signUpPage.verifyPasswordForm())
		.as("Sign Up Page - Password form displays as expected")
		.isTrue();
	}

	/** 
	 * Navigate to Home page and click on the GET STARTED button
	 * to verify Country label text on Sign Up page
	 * @throws InterupptedException
	 * @assert: Country label text matches as expected on Sign Up Page
	 */
	@Test
	public void verifySignUpPageCountryText() throws InterruptedException {

		HomePage homePage = new HomePage(driver, wait);
		SignUpPage signUpPage = new SignUpPage(driver, wait);
		
		//  navigate to home page
		driver.get(getConfiguration("HOMEPAGE"));
		
		// click GET STARTED button via body
		homePage.clickGetStartedButton();

		// assert Country label text matches as expected on Sign Up Page
		softly.assertThat(signUpPage.verifyCountryLabel())
		.as("Sign Up Page - Country label text matches as expected")
		.isTrue();
	}

	/** 
	 * Navigate to Home page and click on the GET STARTED button
	 * to verify Country select dropdown is enabled on Sign Up page
	 * @throws InterupptedException
	 * @assert: Country select dropdown is enabled on Sign Up Page
	 */
	@Test
	public void verifySignUpPageCountrySelect() throws InterruptedException {

		HomePage homePage = new HomePage(driver, wait);
		SignUpPage signUpPage = new SignUpPage(driver, wait);
		
		//  navigate to home page
		driver.get(getConfiguration("HOMEPAGE"));
		
		// click GET STARTED button via body
		homePage.clickGetStartedButton();

		// assert Country select dropdown is enabled on Sign Up Page
		softly.assertThat(signUpPage.verifyCountrySelect())
		.as("Sign Up Page - Country select dropdown is enabled as expected")
		.isTrue();
	}

	/** 
	 * Navigate to Home page and click on the GET STARTED button
	 * to verify Accept Terms checkbox is displayed on Sign Up page
	 * @throws InterupptedException
	 * @assert: Accept Terms checkbox is displayed on Sign Up Page
	 */
	@Test
	public void verifySignUpPageAcceptTerms() throws InterruptedException {

		HomePage homePage = new HomePage(driver, wait);
		SignUpPage signUpPage = new SignUpPage(driver, wait);
		
		//  navigate to home page
		driver.get(getConfiguration("HOMEPAGE"));
		
		// click GET STARTED button via body
		homePage.clickGetStartedButton();

		// assert Accept Terms checkbox displays on Sign Up Page
		softly.assertThat(signUpPage.verifyAcceptTerms())
		.as("Sign Up Page - Accept Terms checkbox is displayed as expected")
		.isTrue();
	}

	/** 
	 * Navigate to Home page and click on the GET STARTED button
	 * to verify Terms Of Service link on Sign Up page
	 * @throws InterupptedException
	 * @assert: Terms Of Service link matches as expected on Sign Up Page
	 */
	@Test
	public void verifySignUpPageTermsOfServiceLink() throws InterruptedException {

		HomePage homePage = new HomePage(driver, wait);
		SignUpPage signUpPage = new SignUpPage(driver, wait);
		
		//  navigate to home page
		driver.get(getConfiguration("HOMEPAGE"));
		
		// click GET STARTED button via body
		homePage.clickGetStartedButton();

		// assert Terms Of Service link matches as expected on Sign Up Page
		softly.assertThat(signUpPage.verifyTermsOfServiceLink())
		.as("Sign Up Page - Terms Of Service link matches as expected")
		.isTrue();
	}

	/** 
	 * Navigate to Home page and click on the GET STARTED button
	 * to verify Privacy Policy link on Sign Up page
	 * @throws InterupptedException
	 * @assert: Privacy Policy link matches as expected on Sign Up Page
	 */
	@Test
	public void verifySignUpPagePrivacyPolicyLink() throws InterruptedException {

		HomePage homePage = new HomePage(driver, wait);
		SignUpPage signUpPage = new SignUpPage(driver, wait);
		
		//  navigate to home page
		driver.get(getConfiguration("HOMEPAGE"));
		
		// click GET STARTED button via body
		homePage.clickGetStartedButton();

		// assert Privacy Policy link matches as expected on Sign Up Page
		softly.assertThat(signUpPage.verifyPrivacyPolicyLink())
		.as("Sign Up Page - Privacy Policy link matches as expected")
		.isTrue();
	}

	/** 
	 * Navigate to Home page and click on the GET STARTED button
	 * to verify Start Trial button is enabled on Sign Up page
	 * @throws InterupptedException
	 * @assert: Start Trial button is enabled on Sign Up Page
	 */
	@Test
	public void verifySignUpPageStartTrialButton() throws InterruptedException {

		HomePage homePage = new HomePage(driver, wait);
		SignUpPage signUpPage = new SignUpPage(driver, wait);
		
		//  navigate to home page
		driver.get(getConfiguration("HOMEPAGE"));
		
		// click GET STARTED button via body
		homePage.clickGetStartedButton();

		// assert Start Trial Button is enabled on Sign Up Page
		softly.assertThat(signUpPage.verifyStartTrialButton())
		.as("Sign Up Page - Start Trial button is enabled as expected")
		.isTrue();
	}

	/** 
	 * Navigate to Home page and click on the GET STARTED button
	 * to verify Promo Code link on Sign Up page
	 * @throws InterupptedException
	 * @assert: Promo Code link matches as expected on Sign Up Page
	 */
	@Test
	public void verifySignUpPagePromoCodeLink() throws InterruptedException {

		HomePage homePage = new HomePage(driver, wait);
		SignUpPage signUpPage = new SignUpPage(driver, wait);
		
		//  navigate to home page
		driver.get(getConfiguration("HOMEPAGE"));
		
		// click GET STARTED button via body
		homePage.clickGetStartedButton();

		// assert Promo Code link matches as expected on Sign Up Page
		softly.assertThat(signUpPage.verifyPromoCodeLink())
		.as("Sign Up Page - Promo Code link matches as expected")
		.isTrue();
	}

	/** 
	 * Navigate to Home page and click on the GET STARTED button
	 * to verify Promo Code form is enabled on Sign Up page
	 * @throws InterupptedException
	 * @assert: Promo Code form is enabled on Sign Up Page
	 */
	@Test
	public void verifySignUpPagePromoCodeForm() throws InterruptedException {

		HomePage homePage = new HomePage(driver, wait);
		SignUpPage signUpPage = new SignUpPage(driver, wait);
		
		//  navigate to home page
		driver.get(getConfiguration("HOMEPAGE"));
		
		// click GET STARTED button via body
		homePage.clickGetStartedButton();

		// click on Promo Code link
		signUpPage.selectPromoCode();

		// assert Promo Code form is enabled on Sign Up Page
		softly.assertThat(signUpPage.verifyPromoCodeForm())
		.as("Sign Up Page - Promo Code form is enabled as expected")
		.isTrue();
	}

	/** 
	 * Navigate to Home page and click on the GET STARTED button
	 * verify Studio Name Error Label displays and matches expected text
	 * @throws InterupptedException
	 * @assert: Studio Name Error Label matches expected on Sign Up Page
	 */
	@Test
	public void verifySignUpPageStudioNameErrorLabel() throws InterruptedException {

		HomePage homePage = new HomePage(driver, wait);
		SignUpPage signUpPage = new SignUpPage(driver, wait);
		
		//  navigate to home page
		driver.get(getConfiguration("HOMEPAGE"));
		
		// click GET STARTED button via body
		homePage.clickGetStartedButton();

		// click Studio Name form
		signUpPage.selectStudioNameForm();

		// click Email form (i.e. to trigger Studio Name Error label)
		signUpPage.selectEmailForm();

		// assert Studio Name label text matches as expected on Sign Up Page
		softly.assertThat(signUpPage.verifyStudioNameErrorLabel())
		.as("Sign Up Page - Studio Name Error label matches as expected")
		.isTrue();
	}

	/** 
	 * Navigate to Home page and click on the GET STARTED button
	 * verify Email Error Label displays and matches expected text
	 * @throws InterupptedException
	 * @assert: Email Error Label matches expected on Sign Up Page
	 */
	@Test
	public void verifySignUpPageEmailErrorLabel() throws InterruptedException {

		HomePage homePage = new HomePage(driver, wait);
		SignUpPage signUpPage = new SignUpPage(driver, wait);
		
		//  navigate to home page
		driver.get(getConfiguration("HOMEPAGE"));
		
		// click GET STARTED button via body
		homePage.clickGetStartedButton();

		// click Email form
		signUpPage.selectEmailForm();

		// click Password form (i.e. to triger Email Error label)
		signUpPage.selectPasswordForm();

		// assert Email label text matches as expected on Sign Up Page
		softly.assertThat(signUpPage.verifyEmailErrorLabel())
		.as("Sign Up Page - Email Error label matches as expected")
		.isTrue();
	}

	/** 
	 * Navigate to Home page and click on the GET STARTED button
	 * verify Password Error Label displays and matches expected text
	 * @throws InterupptedException
	 * @assert: Password Error Label matches expected on Sign Up Page
	 */
	@Test
	public void verifySignUpPagePasswordErrorLabel() throws InterruptedException {

		HomePage homePage = new HomePage(driver, wait);
		SignUpPage signUpPage = new SignUpPage(driver, wait);
		
		//  navigate to home page
		driver.get(getConfiguration("HOMEPAGE"));
		
		// click GET STARTED button via body
		homePage.clickGetStartedButton();

		// click Password form
		signUpPage.selectPasswordForm();

		// click Email form (i.e. to trigger Password Error label)
		signUpPage.selectEmailForm();
		
		// assert Password label text matches as expected on Sign Up Page
		softly.assertThat(signUpPage.verifyPasswordErrorLabel())
		.as("Sign Up Page - Password Error label matches as expected")
		.isTrue();
	}

	/** 
	 * Navigate to Home page and click on the GET STARTED button
	 * verify Accept Terms Error Label displays and matches expected text
	 * @throws InterupptedException
	 * @assert: Accept Terms Error Label matches expected on Sign Up Page
	 */
	@Test
	public void verifySignUpPageAcceptTermsErrorLabel() throws InterruptedException {

		HomePage homePage = new HomePage(driver, wait);
		SignUpPage signUpPage = new SignUpPage(driver, wait);
		
		//  navigate to home page
		driver.get(getConfiguration("HOMEPAGE"));
		
		// click GET STARTED button via body
		homePage.clickGetStartedButton();

		// click Studio Name form and enter text into form
		signUpPage.selectStudioNameForm();
		// Enter Studio Name form with text
		String txtName = "Brandon's Studio";
		signUpPage.enterKeysStudioNameForm(txtName);

		// click Email form
		signUpPage.selectEmailForm();
		// Enter Email form with an email address
		String txtEmail = "testbp@testtestbp.com";
		signUpPage.enterKeysEmailForm(txtEmail);

		// change Country select dropdown value from default (US --> Argentina);
		signUpPage.selectCountryArgentina();

		// click Start Trial Button (i.e. triggers Accept Terms error label)
		signUpPage.selectStartTrialButton();

		// assert Accept Terms Error label text matches as expected on Sign Up Page
		softly.assertThat(signUpPage.verifyAcceptTermsErrorLabel())
		.as("Sign Up Page - Accpet Terms Error label matches as expected")
		.isTrue();
	}
}
