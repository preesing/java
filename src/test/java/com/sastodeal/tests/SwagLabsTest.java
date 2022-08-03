package com.sastodeal.tests;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sastodeal.pages.SwagLabsPage;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class SwagLabsTest extends BaseAutomationTest {

	private SwagLabsPage swagLabsPage = null;
	public static WebDriver driver = null;
	private static final Logger logger = Logger.getLogger(NewCustomerRegistrationTest.class.getName());

	@BeforeTest
	@Parameters({ "browser" })
	public void StartingOfSwagLabsTest(String browser) throws Exception {
		logger.info("Starting of StartingOfSwagLabsTest method");

		SwagLabsTest.driver = this.getWebDriver(browser, WEB_DRIVER.LOGIN_DRIVER);
		this.goToSite(SwagLabsTest.driver);
		this.swagLabsPage = new SwagLabsPage(driver);

		// get title
		System.out.println("Page title is : " + driver.getTitle());

		// colors
		WebElement t = driver.findElement(By.id("login-button"));
		String s = t.getCssValue("color");
		String c = Color.fromString(s).asHex();
		System.out.println("Color is :" + s);
		System.out.println("Hex code for color:" + c);

		// login
		WebElement email = driver.findElement(By.id("user-na"));
		email.click();
		email.clear();
		email.sendKeys("standard_user");
		WebElement password = driver.findElement(By.xpath("(//input[@id='password'])[1]"));
		password.click();
		password.clear();
		password.sendKeys("secret_sauce");

		WebElement login = driver.findElement(By.id("login-button"));
		login.click();

		logger.info("Ending of StartingOfSwagLabsTest method");

	}

	@Test(priority = 1, description = "Verifying MyAccount Functionality")

	@Description("Test Description: Verifying MyAccount Functionality")

	@Severity(SeverityLevel.BLOCKER)

	@Story("Verifying MyAccount Functionality")
	public void selectValueFromDropDown() {
		logger.info("Starting of selectValueFromDropDown method");

		/*
		 * Select drpCountry = new Select(driver.findElement(By.xpath(
		 * "//select[@class='product_sort_container']")));
		 * drpCountry.selectByVisibleText("Name (Z to A)");
		 */

		Select dropDown = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
		List<WebElement> elementCount = dropDown.getOptions();
		int itemSize = elementCount.size();
		System.out.println("total number:" + itemSize);
		for (int i = 0; i < itemSize; i++) {
			String optionsValue = elementCount.get(i).getText();
			System.out.println(optionsValue);

		}

		logger.info("Ending of selectValueFromDropDown method");

	}

}
