package com.shootproof.qa.build.selenium.pageobjects.signuppage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import com.shootproof.qa.build.selenium.pageobjects.BasePage;
import com.shootproof.qa.build.selenium.pageobjects.homepage.HomePage;

public class SignUpPage extends BasePage {
	
	private By logo;
	private By letsGetStartedLabel;
	private By studioNameLabel;
	private By studioNameForm;
	private By emailLabel;
	private By emailForm;
	private By passwordLabel;
	private By passwordForm;
	private By countryLabel;
	private By countrySelect;
	private By acceptTerms;
	private By termsOfService;
	private By privacyPolicy;
	private By startTrialBtn;
	private By promoCode;
	private By promoCodeForm;
	private By studioNameErrorLabel;
	private By emailErrorLabel;
	private By passwordErrorLabel;
	private By acceptTermsErrorText;
	
	boolean elementValidation;

	HomePage homePage;
	
	public SignUpPage(WebDriver driver, Wait<WebDriver> wait) {
		super(driver, wait);
		logo = By.cssSelector(".shootproof-logo.svg");
		letsGetStartedLabel = By.cssSelector(".page-signup h2");
		studioNameLabel = By.xpath(".//label[text()='Studio Name']");
		studioNameForm = By.xpath(".//*[@id='studio_name']");
		emailLabel = By.xpath(".//label[text()='Email']");
		emailForm = By.xpath(".//*[@id='email']");
		passwordLabel = By.xpath(".//label[text()='Password']");
		passwordForm = By.xpath(".//*[@id='password']");
		countryLabel = By.xpath(".//label[text()='Country']");
		countrySelect = By.xpath("//*[@id=\"locale\"]");
		acceptTerms = By.cssSelector(".form-group.accept-terms input#doesAcceptTerms");
		termsOfService = By.cssSelector(".form-group.accept-terms label a:nth-child(1)");
		privacyPolicy = By.cssSelector(".form-group.accept-terms label a:nth-child(2)");
		startTrialBtn = By.cssSelector("#signup button#start-trial.btn");
		promoCode = By.cssSelector(".form-group.promo-code a");
		promoCodeForm = By.cssSelector(".form-group.promo-code input");
		studioNameErrorLabel = By.xpath("//ul[contains(@class,'errors')]//li[contains(text(), 'Enter a Studio Name')]");
		emailErrorLabel = By.xpath("//ul[contains(@class,'errors')]//li[contains(text(), 'Enter a valid Email Address')]");
		passwordErrorLabel = By.xpath("//ul[contains(@class,'errors')]//li[contains(text(), 'Enter a Password')]");
		acceptTermsErrorText = By.cssSelector(".form-group.accept-terms li");

	}

	public boolean verifyCurrentUrl() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.shootproof.com/signup";
		System.out.println("Current Url: " +currentUrl);
		System.out.println("Expected Url: " +expectedUrl);

		if ((expectedUrl).matches(currentUrl)) {
			elementValidation = true;
			System.out.println("Sign Up: Current URL matches");
		} else {
			elementValidation = false;
			System.out.println("Sign Up: Current URL did NOT match");
			}
		return elementValidation;
	}

	public boolean verifyLogo() throws InterruptedException {
		boolean logoPresence = driver.findElement(logo).isDisplayed();

		if (logoPresence == true) {
			elementValidation = true;
			System.out.println("Logo is displayed");
		} else {
			elementValidation = false;
			System.out.println("Logo is NOT displayed");
			}
		return elementValidation;
	}

	public boolean verifyLetsGetStartedText() throws InterruptedException {
		String letsGetStartedLabelText = driver.findElement(letsGetStartedLabel).getText();
		String letsGetStartedExpectedText = "Let’s get started";
		System.out.println("Actual Text: " +letsGetStartedLabelText);
		System.out.println("Expected Text: " +letsGetStartedExpectedText);

		if ((letsGetStartedExpectedText).matches(letsGetStartedLabelText)) {
			elementValidation = true;
		} else {
			elementValidation = false;
			}
		return elementValidation;
	}

	public boolean verifyStudioNameLabel() throws InterruptedException {
		String studioNameLabelText = driver.findElement(studioNameLabel).getText();
		String studioNameLabelExpectedText = "Studio Name";
		System.out.println("Actual Text: " +studioNameLabelText);
		System.out.println("Expected Text: " +studioNameLabelExpectedText);

		if ((studioNameLabelExpectedText).matches(studioNameLabelText)) {
			elementValidation = true;
		} else {
			elementValidation = false;
			}
		return elementValidation;
	}

	public boolean verifyStudioNameForm() throws InterruptedException {
		boolean studioNameFormPresence = driver.findElement(studioNameForm).isDisplayed();

		if (studioNameFormPresence == true) {
			elementValidation = true;
		} else {
			elementValidation = false;
		}
		return elementValidation;
	}

	public boolean verifyEmailLabel() throws InterruptedException {
		String emailLabelText = driver.findElement(emailLabel).getText();
		String emailLabelExpectedText = "Email";
		System.out.println("Actual Text: " +emailLabelText);
		System.out.println("Expected Text: " +emailLabelExpectedText);

		if ((emailLabelExpectedText).matches(emailLabelText)) {
			elementValidation = true;
		} else {
			elementValidation = false;
			}
		return elementValidation;
	}

	public boolean verifyEmailForm() throws InterruptedException {
		boolean emailFormPresence = driver.findElement(emailForm).isDisplayed();

		if (emailFormPresence == true) {
			elementValidation = true;
		} else {
			elementValidation = false;
		}
		return elementValidation;
	}

	public boolean verifyPasswordLabel() throws InterruptedException {
		String passwordLabelText = driver.findElement(passwordLabel).getText();
		String passwordLabelExpectedText = "Password";
		System.out.println("Actual Text: " +passwordLabelText);
		System.out.println("Expected Text: " +passwordLabelExpectedText);

		if ((passwordLabelExpectedText).matches(passwordLabelText)) {
			elementValidation = true;
		} else {
			elementValidation = false;
			}
		return elementValidation;
	}

	public boolean verifyPasswordForm() throws InterruptedException {
		boolean passwordFormPresence = driver.findElement(passwordForm).isDisplayed();

		if (passwordFormPresence == true) {
			elementValidation = true;
		} else {
			elementValidation = false;
		}
		return elementValidation;
	}

	public boolean verifyCountryLabel() throws InterruptedException {
		String countryLabelText = driver.findElement(countryLabel).getText();
		String countryLabelExpectedText = "Country";
		System.out.println("Actual Text: " +countryLabelText);
		System.out.println("Expected Text: " +countryLabelExpectedText);

		if ((countryLabelExpectedText).matches(countryLabelText)) {
			elementValidation = true;
		} else {
			elementValidation = false;
			}
		return elementValidation;
	}

	public boolean verifyCountrySelect() throws InterruptedException {
		boolean countrySelectPresence = driver.findElement(countrySelect).isEnabled();

		if (countrySelectPresence == true) {
			elementValidation = true;
		} else {
			elementValidation = false;
		}
		return elementValidation;
	}

	public boolean verifyAcceptTerms() throws InterruptedException {
		boolean acceptTermsPresence = driver.findElement(acceptTerms).isDisplayed();

		if (acceptTermsPresence == true) {
			elementValidation = true;
		} else {
			elementValidation = false;
		}
		return elementValidation;
	}

	public boolean verifyTermsOfServiceLink() throws InterruptedException {
		String termsOfServiceLink = driver.findElement(termsOfService).getAttribute("href");
		String termsOfServiceExpectedLink = "https://www.shootproof.com/legal/terms-of-use";
		System.out.println("Actual Link: " +termsOfServiceLink);
		System.out.println("Expected Link: " +termsOfServiceExpectedLink);

		if ((termsOfServiceExpectedLink).matches(termsOfServiceLink)) {
			elementValidation = true;
		} else {
			elementValidation = false;
			}
		return elementValidation;
	}

	public boolean verifyPrivacyPolicyLink() throws InterruptedException {
		String privacyPolicyLink = driver.findElement(privacyPolicy).getAttribute("href");
		String privacyPolicyExpectedLink = "https://www.shootproof.com/legal/privacy-policy";
		System.out.println("Actual Link: " +privacyPolicyLink);
		System.out.println("Expected Link: " +privacyPolicyExpectedLink);

		if ((privacyPolicyExpectedLink).matches(privacyPolicyLink)) {
			elementValidation = true;
		} else {
			elementValidation = false;
			}
		return elementValidation;
	}

	public boolean verifyStartTrialButton() throws InterruptedException {
		boolean startTrialButtonPresence = driver.findElement(startTrialBtn).isEnabled();

		if (startTrialButtonPresence == true) {
			elementValidation = true;
		} else {
			elementValidation = false;
		}
		return elementValidation;
	}

	public boolean verifyPromoCodeLink() throws InterruptedException {
		String promoCodeLink = driver.findElement(promoCode).getAttribute("href");
		String promoCodeExpectedLink = "https://www.shootproof.com/signup#";
		System.out.println("Actual Link: " +promoCodeLink);
		System.out.println("Expected Link: " +promoCodeExpectedLink);

		if ((promoCodeExpectedLink).matches(promoCodeLink)) {
			elementValidation = true;
		} else {
			elementValidation = false;
			}
		return elementValidation;
	}

	public boolean verifyPromoCodeForm() throws InterruptedException {
		boolean promoCodeFormPresence = driver.findElement(promoCodeForm).isEnabled();

		if (promoCodeFormPresence == true) {
			elementValidation = true;
		} else {
			elementValidation = false;
		}
		return elementValidation;
	}

	public boolean verifyStudioNameErrorLabel() throws InterruptedException {
		String studioNameErrorLabelText = driver.findElement(studioNameErrorLabel).getText();
		String studioNameErrorLabelExpectedText = "Enter a Studio Name";
		System.out.println("Actual Text: " +studioNameErrorLabelText);
		System.out.println("Expected Text: " +studioNameErrorLabelExpectedText);

		if ((studioNameErrorLabelExpectedText).matches(studioNameErrorLabelText)) {
			elementValidation = true;
		} else {
			elementValidation = false;
			}
		return elementValidation;
	}

	public boolean verifyEmailErrorLabel() throws InterruptedException {
		String emailErrorLabelText = driver.findElement(emailErrorLabel).getText();
		String emailErrorLabelExpectedText = "Enter a valid Email Address";
		System.out.println("Actual Text: " +emailErrorLabelText);
		System.out.println("Expected Text: " +emailErrorLabelExpectedText);

		if ((emailErrorLabelExpectedText).matches(emailErrorLabelText)) {
			elementValidation = true;
		} else {
			elementValidation = false;
			}
		return elementValidation;
	}

	public boolean verifyPasswordErrorLabel() throws InterruptedException {
		String passwordErrorLabelText = driver.findElement(passwordErrorLabel).getText();
		String passwordErrorLabelExpectedText = "Enter a Password";
		System.out.println("Actual Text: " +passwordErrorLabelText);
		System.out.println("Expected Text: " +passwordErrorLabelExpectedText);

		if ((passwordErrorLabelExpectedText).matches(passwordErrorLabelText)) {
			elementValidation = true;
		} else {
			elementValidation = false;
			}
		return elementValidation;
	}

	public boolean verifyAcceptTermsErrorLabel() throws InterruptedException {
		String acceptTermsErrorLabelText = driver.findElement(acceptTermsErrorText).getText();
		String acceptTermsErrorExpectedText = "Please review and confirm your acceptance of the Terms of Service and Privacy Policy.";
		System.out.println("Actual Text: " +acceptTermsErrorLabelText);
		System.out.println("Expected Text: " +acceptTermsErrorExpectedText);

		if ((acceptTermsErrorExpectedText).matches(acceptTermsErrorLabelText)) {
			elementValidation = true;
		} else {
			elementValidation = false;
			}
		return elementValidation;
	}

	public void selectStudioNameForm() {
		driver.findElement(studioNameForm).click();
	}
	
	public void enterKeysStudioNameForm(String txtName) {
		driver.findElement(studioNameForm).sendKeys(txtName);
	}

	public void selectEmailForm() {
		driver.findElement(emailForm).click();
	}
	
	public void enterKeysEmailForm(String txtEmail) {
		driver.findElement(emailForm).sendKeys(txtEmail);
	}

	public void selectPasswordForm() {
		driver.findElement(passwordForm).click();
	}

	public void selectAcceptTerms() {
		driver.findElement(acceptTerms).click();
	}

	public void selectStartTrialButton() {
		driver.findElement(startTrialBtn).click();
	}

	public void selectPromoCode() {
		driver.findElement(promoCode).click();
	}

	public void selectPromoCodeForm() {
		driver.findElement(promoCodeForm).click();
	}

	public void selectCountryArgentina() {
		Select drpCountry = new Select(driver.findElement(countrySelect));
		drpCountry.selectByVisibleText("Argentina");
	}
}