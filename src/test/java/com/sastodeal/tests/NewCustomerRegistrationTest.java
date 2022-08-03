package com.sastodeal.tests;

import static com.sastodeal.util.Constants.*;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sastodeal.pages.NewCustomerRegistrationPage;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("Sign Up")
@Feature("Sign Up Functionality")
public class NewCustomerRegistrationTest extends BaseAutomationTest {
	private NewCustomerRegistrationPage newCustomerRegistrationPage = null;
	public static WebDriver driver = null;
	private static final Logger logger = Logger.getLogger(NewCustomerRegistrationTest.class.getName());

	@BeforeTest
	@Parameters({ "browser" })
	public void StartingSastoDealTest(String browser) throws Exception {
		logger.info("Starting of StartingSastoDealTest method");

		NewCustomerRegistrationTest.driver = this.getWebDriver(browser, WEB_DRIVER.LOGIN_DRIVER);
		this.goToSite(NewCustomerRegistrationTest.driver);
		this.newCustomerRegistrationPage = new NewCustomerRegistrationPage(driver);

		logger.info("Ending of StartingSastoDealTest method");

	}

	@Test(priority = 1, description = "Verifying MyAccount Functionality")
	@Description("Test Description: Verifying MyAccount Functionality")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verifying MyAccount Functionality")
	public void testMyAccount() {
		logger.info("Starting of testMyAccount method");

		try {
			newCustomerRegistrationPage.clickOnMyAccountButton();

			String lblsignin = this.newCustomerRegistrationPage.getSignInTxt();
			Assert.assertEquals(lblsignin, expectedAssertionsProp.getProperty(SIGNIN_TXT));

			String lblnewcustomer = this.newCustomerRegistrationPage.getNewCustomerTxt();
			Assert.assertEquals(lblnewcustomer, expectedAssertionsProp.getProperty(NEW_CUSTOMER_TXT));

			String lblstarthere = this.newCustomerRegistrationPage.getStartHereTxt();
			Assert.assertEquals(lblstarthere, expectedAssertionsProp.getProperty(START_HERE_TXT));
		} catch (Exception e) {
			Assert.fail("Error accured while testing MyAccount page: " + e.getMessage());

			logger.error("Error accured while testing MyAccount page: " + e);
		}

		logger.info("Ending of testMyAccount method");

	}

	@Test(priority = 2, description = "Verifying StartHere in MyAccount Functionality")
	@Description("Test Description: Verifying StartHere in MyAccount Functionality")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verifying StartHere in  MyAccount Functionality")
	public void testStartHere() {
		logger.info("Starting of testMyAccount method");

		try {
			newCustomerRegistrationPage.clickOnStartHereButton();

			String lblnewcustomerRegistartion = this.newCustomerRegistrationPage.getNewCustomerRegistrationTxt();
			Assert.assertEquals(lblnewcustomerRegistartion,
					expectedAssertionsProp.getProperty(NEW_CUSTOMER_REGISTARTION_TXT));

			String lblemail = this.newCustomerRegistrationPage.getEmailTxt();
			Assert.assertEquals(lblemail, expectedAssertionsProp.getProperty(EMAIL_TXT));

			String lblfirstname = this.newCustomerRegistrationPage.getFirstNameTxt();
			Assert.assertEquals(lblfirstname, expectedAssertionsProp.getProperty(FIRSTNAME_TXT));

			String lblLastname = this.newCustomerRegistrationPage.getLastNameTxt();
			Assert.assertEquals(lblLastname, expectedAssertionsProp.getProperty(LASTNAME_TXT));

			String lblcontactnumber = this.newCustomerRegistrationPage.getContactNumberTxt();
			Assert.assertEquals(lblcontactnumber, expectedAssertionsProp.getProperty(CONTACT_NUMBER_TXT));

			String lblpassword = this.newCustomerRegistrationPage.getPasswordTxt();
			Assert.assertEquals(lblpassword, expectedAssertionsProp.getProperty(PASSWORD_TXT));

			String lblconfirmpassword = this.newCustomerRegistrationPage.getConfirmPasswordTxt();
			Assert.assertEquals(lblconfirmpassword, expectedAssertionsProp.getProperty(CONFIRM_PASSWORD_TXT));

		} catch (Exception e) {
			Assert.fail("Error accured while testing StartHere page: " + e.getMessage());

			logger.error("Error accured while testing StartHere page: " + e);
		}

		logger.info("Ending of testMyAccount method");

	}

	@Test(priority = 3, description = "Verifying NewCustomerRegistration With Already Registered Mail")
	@Description("Test Description: Verifying NewCustomerRegistration With Already Registered Mail")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verifying NewCustomerRegistration With Already Registered Mail")
	public void testNewCustomerRegistrationWithAlreadyRegisteredMail() {
		logger.info("Starting of testNewCustomerRegistrationWithAlreadyRegisteredMail method");

		try {
			newCustomerRegistrationPage.setEmailField(testDataProp.getProperty(REGISTERED_EMAIL));
			newCustomerRegistrationPage.setContactNumberField(testDataProp.getProperty(CONTACT_NUMBER));
			newCustomerRegistrationPage.setFirstNameField(testDataProp.getProperty(FIRST_NAME));
			newCustomerRegistrationPage.setLastNameField(testDataProp.getProperty(LAST_NAME));
			newCustomerRegistrationPage.setpasswordField(testDataProp.getProperty(PASSWORD));
			newCustomerRegistrationPage.setConfirmpasswordField(testDataProp.getProperty(CONFIRM_PASSWORD));
			
			newCustomerRegistrationPage.ClickOnSignUpButton();

			String lblsignuperrormessage = this.newCustomerRegistrationPage.getSignUpErrorTxt();
			Assert.assertEquals(lblsignuperrormessage, expectedAssertionsProp.getProperty(SIGNUP_ERROR_MESSAGE_TXT));

		} catch (Exception e) {
			Assert.fail("Error accured while testing  With NewCustomerRegistration With Already Registered Mail: "
					+ e.getMessage());

			logger.error("Error accured while testing With NewCustomerRegistration With Already Registered Mail: " + e);
		}

		logger.info("Ending of testNewCustomerRegistrationWithAlreadyRegisteredMail method");

	}

	
	@Test(priority = 4, description = "Verifying NewCustomerRegistration Functionality")
	@Description("Test Description: Verifying NewCustomerRegistration Functionality")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verifying NewCustomerRegistration Functionality")
	public void testNewCustomerRegistration() {
		logger.info("Starting of testNewCustomerRegistration method");

		try {
			newCustomerRegistrationPage.setEmailField(testDataProp.getProperty(EMAIL));
			newCustomerRegistrationPage.setContactNumberField(testDataProp.getProperty(CONTACT_NUMBER));
			newCustomerRegistrationPage.setFirstNameField(testDataProp.getProperty(FIRST_NAME));
			newCustomerRegistrationPage.setLastNameField(testDataProp.getProperty(LAST_NAME));
			newCustomerRegistrationPage.setpasswordField(testDataProp.getProperty(PASSWORD));
			newCustomerRegistrationPage.setConfirmpasswordField(testDataProp.getProperty(CONFIRM_PASSWORD));
			newCustomerRegistrationPage.ClickOnSignUpButton();

			String lblconfirmationmessage = this.newCustomerRegistrationPage.getConfirmatinMessageTxt();
			Assert.assertEquals(lblconfirmationmessage, expectedAssertionsProp.getProperty(CONFIRMATION_MESSAGE_TXT));

			String lblcustomerlogin = this.newCustomerRegistrationPage.getCostomerLoginTxt();
			Assert.assertEquals(lblcustomerlogin, expectedAssertionsProp.getProperty(CUSTOMER_LOGIN_TXT));

		} catch (Exception e) {
			Assert.fail("Error accured while testing SignUp page: " + e.getMessage());

			logger.error("Error accured while testing SignUp page: " + e);
		}

		logger.info("Ending of testNewCustomerRegistration method");

	}

	@AfterClass
	public void quit() {
		driver.quit();
	}
}
