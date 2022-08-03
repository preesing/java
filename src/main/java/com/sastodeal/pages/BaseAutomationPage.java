package com.sastodeal.pages;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BaseAutomationPage {
	public WebDriver driver = null;

	protected static final Logger logger = Logger.getLogger(BaseAutomationPage.class.getName());

	public static String TEST_FILE_PATH = null;

	public String getTestFilePath() {
		String path = "src/test/resources";

		File file = new File(path);
		return file.getAbsolutePath();
	}

	public BaseAutomationPage(WebDriver driver) {
		this.driver = driver;

		if (TEST_FILE_PATH == null) {

			TEST_FILE_PATH = getTestFilePath();

			logger.debug("In Constructor " + TEST_FILE_PATH);
		}

		PageFactory.initElements(driver, this);
	}

	public void impicitWait() {
		logger.info("Starting of impicitWait method");

		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

		logger.info("Ending of impicitWait method");
	}

	public void scrollUntilElementVisible() {
		logger.info("Starting of scrollUntilElementVisible method");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Find element by link text and store in variable "Element"
		WebElement Element = driver.findElement(By.xpath(""));

		// This will scroll the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();", Element);

		Element.click();

		logger.info("Ending of scrollUntilElementVisible method");
	}

	public void scrollDownBottomOfThePage() {
		logger.info("Starting of scrollDownBottomOfThePage method");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// This will scroll the web page till end.
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		logger.info("Ending of scrollDownBottomOfThePage method");
	}

	// to get the title : driver.getTitle();

	public void toGetColourCode() {
		logger.info("Starting of toGetColourCode method");

		WebElement t = driver.findElement(By.id("login-button"));
		String s = t.getCssValue("color");
		String c = Color.fromString(s).asHex();
		System.out.println("Color is :" + s);
		System.out.println("Hex code for color:" + c);

		logger.info("Ending of toGetColourCode method");
	}

	public void toselectdropdown() {
		logger.info("Starting of toselectdropdown method");

		// select value from dropdown
		
		Select drpCountry = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
		drpCountry.selectByVisibleText("Name (Z to A)");

		// to print the no of elements present in dropdown
		Select dropDown = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
		List<WebElement> elementCount = dropDown.getOptions();
		int itemSize = elementCount.size();
		System.out.println("total number:" + itemSize);
		
		// to print the elemnents present in dropdown
		
		Select drp = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
		List<WebElement> elementCount1 = drp.getOptions();
		int itemSize1 = elementCount1.size();
		for (int i = 0; i < itemSize; i++) {
			String optionsValue = elementCount1.get(i).getText();
			System.out.println(optionsValue);

		}
		
		

		logger.info("Ending of toselectdropdown method");
	}

}