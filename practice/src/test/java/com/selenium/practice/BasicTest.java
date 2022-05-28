package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.practice.PageAction.BasicPage;
import com.selenium.practice.utility.GeneralMethods;

import resources.BaseTest;

public class BasicTest extends BaseTest {

	WebDriver driver;
	GeneralMethods gm;
	BasicPage bp;

	@BeforeClass
	public void setup() {
		driver = getDriver();
		bp = new BasicPage(driver);
		gm = new GeneralMethods(driver);
	}

	@BeforeMethod
	public void clickEscButton() {
		gm.clickOnEscapeButton();

	}

	@Test
	public void Test01_clickOnBasicForm() {
		bp.clickOnStart();
	}

	@Test(dependsOnMethods = "Test01_clickOnBasicForm")
	public void Test002_VerifySingleInputField() {
		bp.clickOnSampleDemo();
		bp.enterUserMessage("Hi Mohit");
		bp.showMessage();
		Assert.assertEquals(bp.getMessage(), "Hi Mohit");
	}

	@Test(dependsOnMethods = "Test01_clickOnBasicForm")
	public void Test002_VerifyTwoInputField() {
		bp.enterValues("2", "3");
		bp.clickOnGetTotal();
		Assert.assertEquals(bp.getTotal(), "5");
		bp.clickOnInputForm();
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
