package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.practice.PageAction.BasicPage;
import com.selenium.practice.PageAction.CheckBoxRadioPage;
import com.selenium.practice.utility.GeneralMethods;

import resources.BaseTest;

public class CheckBoxRadioTest extends BaseTest {

	WebDriver driver;
	GeneralMethods gm;
	CheckBoxRadioPage cp;
	BasicPage bp;
	DropDown_AJax_JqueyPage dp;

	@BeforeClass
	public void setup() {
		driver = getDriver();
		cp = new CheckBoxRadioPage(driver);
		gm = new GeneralMethods(driver);
		bp = new BasicPage(driver);
		dp = new DropDown_AJax_JqueyPage(driver);
	}

	@BeforeMethod
	public void clickEscButton() {
		gm.clickOnEscapeButton();

	}

	@Test
	public void Test001_clickonRadioAndCheckBox() {
		bp.clickOnInputForm();
		cp.clickOnCheckBoxInput();
		cp.clickOnCheckBox();
		bp.clickOnInputForm();
		cp.clickOnRadio();
		cp.clickOnGenderButton();

	}

	@Test
	public void Test002_DropDown_Ajax_Jquery() {
		bp.clickOnInputForm();
		dp.clickOnDropdown();
		dp.selectDay("Sunday");
	}

	@Test
	public void Test003_BootPopUp() {
		dp.clickOnAlert();
		dp.clickOnBootModel();
		dp.clickOnLaunchModel();
		dp.clickOnCloseModel();
	}

	@Test
	public void Test004_JavaScriptAlert() {
		dp.clickOnAlert();
		dp.clickOnJsAlert();
		dp.clickOnClickMeAlert();
		dp.alertAccept();
		dp.clickOnClickMeConfimAlert();
		dp.alertDissmiss();
		dp.clickOnClickMeEnterAlert();
		dp.enterTextAlert("Hello Mohit !!!");
		dp.alertAccept();
	}

	 @AfterClass
	public void closeBrowser() {
		driver.close();
	}
}
