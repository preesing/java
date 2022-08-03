package com.sastodeal.tests;

import static com.sastodeal.util.Constants.*;
import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.sastodeal.pages.SignInPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("Sign In")
@Feature("Sign In Functionality")
public class SignInTest extends BaseAutomationTest {
	private SignInPage signInPage = null;
	public static WebDriver driver = null;
	private static final Logger logger = Logger.getLogger(SignInTest.class.getName());

	@BeforeClass
	@Parameters({ "browser", "siteURL" })
	public void StartingSastoDeal(String browser, String siteURL) throws Exception {
		logger.info("Starting of StartingSastoDeal method");

		SignInTest.driver = this.getWebDriver(browser, WEB_DRIVER.LOGIN_DRIVER);
		this.goToSite(SignInTest.driver);
		this.signInPage = new SignInPage(driver);
		signInPage.scrollDown(2);

		logger.info("Ending of StartingSastoDeal method");

	}

	@Test(priority = 1, description = "Verifying MyAccount Functionality")

	@Description("Test Description: Verifying MyAccount Functionality")

	@Severity(SeverityLevel.BLOCKER)

	@Story("Verifying MyAccount Functionality")
	public void testMyAccount() {
		logger.info("Starting of testMyAccount method");

		try {

			signInPage.clickOnMyAccountButton();

			String lblsignin = this.signInPage.getSignInTxt();
			Assert.assertEquals(lblsignin, expectedAssertionsProp.getProperty(SIGNIN_TXT));

			String lblnewcustomer = this.signInPage.getNewCustomerTxt();
			Assert.assertEquals(lblnewcustomer, expectedAssertionsProp.getProperty(NEW_CUSTOMER_TXT));

			String lblstarthere = this.signInPage.getStartHereTxt();
			Assert.assertEquals(lblstarthere, expectedAssertionsProp.getProperty(START_HERE_TXT));

		} catch (Exception e) {
			Assert.fail("Error accured while testing MyAccount page: " + e.getMessage());

			logger.error("Error accured while testing MyAccount page: " + e);
		}

		logger.info("Ending of testMyAccount method");

	}

	@Test(priority = 2, description = "Verifying SignIn With Empty Fields")

	@Description("Test Description: Verifying SignIn with Empty Fields")

	@Severity(SeverityLevel.NORMAL)

	@Story("Verifying SignIn  with Empty Fields")
	public void testSignInWithEmptyFields() {
		logger.info("Starting of testSignInWithEmptyFields method");

		try {
			signInPage.scrollDown(2);
			signInPage.clickOnSignInButton();

			String lblemail = this.signInPage.getEmailTxt();
			Assert.assertEquals(lblemail, expectedAssertionsProp.getProperty(EMAIL_SIGNIN_TXT));

			String lblpassword = this.signInPage.getPasswordTxt();
			Assert.assertEquals(lblpassword, expectedAssertionsProp.getProperty(PASSWORD_TXT));

			signInPage.clickOnLoginButton();

			String lblfieldrequired = this.signInPage.getFieldRequiredTxt();
			Assert.assertEquals(lblfieldrequired, expectedAssertionsProp.getProperty(FIELD_REQUIRED_TXT));

		} catch (Exception e) {
			Assert.fail("Error accured while testing SignInWithEmptyFields: " + e.getMessage());

			logger.error("Error accured while testing SignInWithEmptyFields: " + e);
		}

		logger.info("Ending of testSignInWithEmptyFields method");

	}

	@Test(priority = 3, description = "Verifying SignIn With Invalid credentials ")

	@Description("Test Description: Verifying SignIn with Invalid credentials")

	@Severity(SeverityLevel.NORMAL)

	@Story("Verifying SignIn  with Invalid credentials")
	public void testSignInWithInvalidcredentials() {
		logger.info("Starting of testSignInWithInvalidcredentials method");

		try {

			signInPage.setEmailField(testDataProp.getProperty(INVALID_EMAIL));
			signInPage.setpasswordField(testDataProp.getProperty(INVALID_PASSWORD));
			signInPage.clickOnLoginButton();

			String lblerrormessage = this.signInPage.getErrormessageTxt();
			Assert.assertEquals(lblerrormessage, expectedAssertionsProp.getProperty(ERRORMESSAGE_SIGNIN_TXT));

		} catch (Exception e) {
			Assert.fail("Error accured while testing SignInWithInvalidcredentials: " + e.getMessage());

			logger.error("Error accured while testing SignInWithInvalidcredentials: " + e);
		}

		logger.info("Ending of testSignInWithInvalidcredentials method");

	}

	@Test(priority = 4, description = "Verifying SignIn with valid credentials Functionality")

	@Description("Test Description: Verifying gnIn with valid credentials Functionality")

	@Severity(SeverityLevel.BLOCKER)

	@Story("Verifying gnIn with valid credentials Functionality")
	public void testSignInWithValidCredentials() {
		logger.info("Starting of testSignInWithValidCredentials method");

		try {

			signInPage.setEmailField(testDataProp.getProperty(EMAIL_SIGNIN));
			signInPage.setpasswordField(testDataProp.getProperty(PASSWORD_SIGNIN));
			signInPage.clickOnLoginButton();

			String lblwelcome = this.signInPage.getWelcomeTxt();
			Assert.assertEquals(lblwelcome, expectedAssertionsProp.getProperty(WELCOME_TXT));

		} catch (Exception e) {
			Assert.fail("Error accured while testing SignIn page: " + e.getMessage());

			logger.error("Error accured while testing SignIn page: " + e);
		}

		logger.info("Ending of testSignInWithValidCredentials method");

	}

	@AfterClass
	public void quit() {
		driver.quit();
	}

}