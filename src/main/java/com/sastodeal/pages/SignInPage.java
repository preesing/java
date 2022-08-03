package com.sastodeal.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BaseAutomationPage {

	@FindBy(xpath = "//h6[text()='My Account']")
	private WebElement btnMyAccount;

	@FindBy(xpath = "//a[text()='Sign In']")
	private WebElement btnSignIn;

	@FindBy(xpath = "//p[text()='New Customer?']")
	private WebElement txtNewCustomer;

	@FindBy(xpath = "//a[text()='Start Here']")
	private WebElement btnStartHere;

	@FindBy(xpath = "//span[text()='Customer Login']")
	private WebElement txtCustomerLogin;

	@FindBy(xpath = "(//span[text()='Email'])[1]")
	private WebElement txtEmail;

	@FindBy(xpath = "(//span[text()='Password'])[1]")
	private WebElement txtPassword;

	@FindBy(xpath = "(//button[@id='send2'])[1]")
	private WebElement btnLogin;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement btnEmail;

	@FindBy(xpath = "(//input[@id='pass'])[1]")
	private WebElement btnPassword;

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement txtMyAccount;

	@FindBy(xpath = "//span[text()='Welcome, saishma']")
	private WebElement txtWelcome;

	@FindBy(xpath = "//div[@id='email-error']")
	private WebElement txtErrorMessage;

	@FindBy(xpath = "//div[@id='email-error']")
	private WebElement txtFieldRequired;

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement btnLogout;

	private static final Logger logger = Logger.getLogger(SignInPage.class.getName());

	public SignInPage(WebDriver driver) {
		super(driver);

	}

	public void clickOnMyAccountButton() {
		logger.info("Starting of clickOnMyAccountButton method");

		this.btnMyAccount.click();

		logger.info("Ending of clickOnMyAccountButton method");

	}

	public String getSignInTxt() {
		logger.info("Starting of getSignInTxt method");
		logger.info("Ending of getSignInTxt method");

		return btnSignIn.getText();

	}

	public String getNewCustomerTxt() {
		logger.info("Starting of getNewCustomerTxt method");
		logger.info("Ending of getNewCustomerTxt method");

		return txtNewCustomer.getText();

	}

	public String getStartHereTxt() {
		logger.info("Starting of getStartHereTxt method");
		logger.info("Ending of getStartHereTxt method");

		return btnStartHere.getText();

	}

	public void clickOnSignInButton() {
		logger.info("Starting of clickOnSignInButton method");

		this.btnSignIn.click();

		logger.info("Ending of clickOnSignInButton method");

	}

	public String getEmailTxt() {
		logger.info("Starting of getEmailTxt method");
		logger.info("Ending of getEmailTxt method");

		return txtEmail.getText();

	}

	public String getPasswordTxt() {
		logger.info("Starting of getPasswordTxt method");
		logger.info("Ending of getPasswordTxt method");

		return txtPassword.getText();

	}

	public void clickOnLoginButton() {
		logger.info("Starting of clickOnLoginButton method");

		this.btnLogin.click();

		logger.info("Ending of clickOnLoginButton method");
	}

	public void setEmailField(String email) {
		logger.info("Starting of setEmailField method");

		this.btnEmail.click();
		this.btnEmail.clear();
		this.btnEmail.sendKeys(email);

		logger.info("Ending of setEmailField method");

	}

	public void setpasswordField(String password) {
		logger.info("Starting of setpasswordField method");

		this.btnPassword.click();
		this.btnPassword.clear();
		this.btnPassword.sendKeys(password);

		logger.info("Ending of setpasswordField method");

	}

	public String getMyAccontTxt() {
		logger.info("Starting of getMyAccontTxt method");
		logger.info("Ending of getMyAccontTxt method");

		return txtMyAccount.getText();

	}

	public String getWelcomeTxt() {
		logger.info("Starting of getWelcomeTxt method");
		logger.info("Ending of getWelcomeTxt method");

		return txtWelcome.getText();

	}

	public String getErrormessageTxt() {
		logger.info("Starting of getErrormessageTxt method");
		logger.info("Ending of getErrormessageTxt method");

		return txtErrorMessage.getText();

	}

	public String getFieldRequiredTxt() {
		logger.info("Starting of getFieldRequiredTxt method");
		logger.info("Ending of getFieldRequiredTxt method");

		return txtFieldRequired.getText();

	}

	public void clickOnLogoutButton() {
		logger.info("Starting of clickOnLogOutButton method");

		this.btnMyAccount.click();
		this.btnLogout.click();
		this.btnMyAccount.click();
		this.btnSignIn.click();

		logger.info("Ending of clickOnLogOutButton method");

	}
	public void scrollDown(int scroll) {
		logger.info("Starting of scrollDown method");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(2, " + scroll + ")");

		logger.info("Ending of scrollDown method");
	}
	
}
