package com.sastodeal.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCustomerRegistrationPage extends BaseAutomationPage {

	@FindBy(xpath = "//h6[text()='My Account']")
	private WebElement btnMyAccount;

	@FindBy(xpath = "//a[text()='Sign In']")
	private WebElement btnSignIn;

	@FindBy(xpath = "//p[text()='New Customer?']")
	private WebElement txtNewCustomer;

	@FindBy(xpath = "//a[text()='Start Here']")
	private WebElement btnStartHere;

	@FindBy(xpath = "//span[text()='New Customer Registration']")
	private WebElement txtNewCustomerRegistration;

	@FindBy(xpath = "//span[text()='E-Mail']")
	private WebElement txtEmail;

	@FindBy(xpath = "//span[text()='Contact Number']")
	private WebElement txtContactNumber;

	@FindBy(xpath = "(//span[text()='First Name'])[1]")
	private WebElement txtFirstName;

	@FindBy(xpath = "(//span[text()='Last Name'])[1]")
	private WebElement txtLastName;

	@FindBy(xpath = "(//span[text()='Password'])[1]")
	private WebElement txtPassword;

	@FindBy(xpath = "(//span[text()='Confirm Password'])[1]")
	private WebElement txtConfirmPassword;

	@FindBy(xpath = "(//input[@id='email_address'])[1]")
	private WebElement btnEmail;

	@FindBy(xpath = "//input[@id='contact_numbers']")
	private WebElement btnContactNumber;

	@FindBy(xpath = "(//input[@id='firstname'])[1]")
	private WebElement btnFirstName;

	@FindBy(xpath = "(//input[@id='lastname'])[1]")
	private WebElement btnLastName;

	@FindBy(xpath = "(//input[@id='password'])[1]")
	private WebElement btnPassword;

	@FindBy(xpath = "(//input[@id='password-confirmation'])[1]")
	private WebElement btnConfirmPassword;

	@FindBy(xpath = "//button[@id='signUp']")
	private WebElement btnSignUp;

	@FindBy(xpath = "//div[@class='message-success success message']")
	private WebElement confirmationMessage;

	@FindBy(xpath = "//span[text()='Customer Login']")
	private WebElement txtCustomerLogin;

	@FindBy(xpath = "//div[@class='message-error error message']//div")
	private WebElement SignUpErrorMessage;

	private static final Logger logger = Logger.getLogger(NewCustomerRegistrationPage.class.getName());

	public NewCustomerRegistrationPage(WebDriver driver) {
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

	public void clickOnStartHereButton() {
		logger.info("Starting of clickOnStartHereButton method");

		this.btnStartHere.click();

		logger.info("Ending of clickOnStartHereButton method");

	}

	public String getNewCustomerRegistrationTxt() {
		logger.info("Starting of getNewCustomerRegistrationTxt method");
		logger.info("Ending of getNewCustomerRegistrationTxt method");

		return txtNewCustomerRegistration.getText();

	}

	public String getEmailTxt() {
		logger.info("Starting of getEmailTxt method");
		logger.info("Ending of getEmailTxt method");

		return txtEmail.getText();

	}

	public String getFirstNameTxt() {
		logger.info("Starting of getFirstNameTxt method");
		logger.info("Ending of getFirstNameTxt method");

		return txtFirstName.getText();

	}

	public String getContactNumberTxt() {
		logger.info("Starting of getContactNumberTxt method");
		logger.info("Ending of getContactNumberTxt method");

		return txtContactNumber.getText();

	}

	public String getLastNameTxt() {
		logger.info("Starting of getLastNameTxt method");
		logger.info("Ending of getLastNameTxt method");

		return txtLastName.getText();

	}

	public String getPasswordTxt() {
		logger.info("Starting of getPasswordTxt method");
		logger.info("Ending of getPasswordTxt method");

		return txtPassword.getText();

	}

	public String getConfirmPasswordTxt() {
		logger.info("Starting of getConfirmPasswordTxt method");
		logger.info("Ending of getConfirmPasswordTxt method");

		return txtConfirmPassword.getText();

	}

	public void setEmailField(String email) {
		logger.info("Starting of setEmailField method");

		this.btnEmail.click();
		this.btnEmail.sendKeys(email);

		logger.info("Ending of setEmailField method");

	}

	public void setContactNumberField(String contactnumber) {
		logger.info("Starting of setContactNumberField method");

		this.btnContactNumber.click();
		this.btnContactNumber.sendKeys(contactnumber);

		logger.info("Ending of setContactNumberField method");

	}

	public void setFirstNameField(String firstname) {
		logger.info("Starting of setFirstNameField method");

		this.btnFirstName.click();
		this.btnFirstName.sendKeys(firstname);

		logger.info("Ending of setFirstNameField method");

	}

	public void setLastNameField(String lastname) {
		logger.info("Starting of setLastNameField method");

		this.btnLastName.click();
		this.btnLastName.sendKeys(lastname);

		logger.info("Ending of setLastNameField method");

	}

	public void setpasswordField(String password) {
		logger.info("Starting of setpasswordField method");

		this.btnPassword.click();
		this.btnPassword.sendKeys(password);

		logger.info("Ending of setpasswordField method");

	}

	public void setConfirmpasswordField(String confirmpassword) {
		logger.info("Starting of setConfirmpasswordField method");

		this.btnConfirmPassword.click();
		this.btnConfirmPassword.sendKeys(confirmpassword);

		logger.info("Ending of setConfirmpasswordField method");

	}

	public void ClickOnSignUpButton() {
		logger.info("Starting of ClickOnSignUpButton method");

		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   
		   //Find element by link text and store in variable "Element"        		
	        WebElement Element = driver.findElement(By.xpath("(//span[text()='Sign Up'])[1]"));

	        //This will scroll the page till the element is found		
	        js.executeScript("arguments[0].scrollIntoView();", Element);
	        Element.click();
	        

		logger.info("Ending of ClickOnSignUpButton method");

	}

	public String getConfirmatinMessageTxt() {
		logger.info("Starting of getConfirmatinMessageTxt method");
		logger.info("Ending of getConfirmatinMessageTxt method");

		return confirmationMessage.getText();

	}

	public String getCostomerLoginTxt() {
		logger.info("Starting of getCostomerLoginTxt method");
		logger.info("Ending of getCostomerLoginTxt method");

		return txtCustomerLogin.getText();

	}

	public String getSignUpErrorTxt() {
		logger.info("Starting of getSignUpErrorxt method");
		logger.info("Ending of getSignUpErrorxt method");

		return SignUpErrorMessage.getText();

	}
	
}
