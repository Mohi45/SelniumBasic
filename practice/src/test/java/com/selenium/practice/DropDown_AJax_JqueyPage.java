package com.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Factory;

public class DropDown_AJax_JqueyPage {

	private WebDriver driver;
	private WebDriverWait wait;

	public DropDown_AJax_JqueyPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(120, 1));
	}

	@FindBy(xpath = "//ul[@id='treemenu']//a[text()='Select Dropdown List']")
	private WebElement dropdown;

	@FindBy(id = "select-demo")
	private WebElement countryDropdown;

	@FindBy(xpath = "//ul[@id='treemenu']//a[text()='Alerts & Modals']")
	private WebElement alert;

	@FindBy(xpath = "//div[text()='Single Modal Example']/..//a[text()='Launch modal']")
	private WebElement launchModel;
	
	@FindBy(xpath = "//ul[@id='treemenu']//a[text()='Bootstrap Modals']")
	private WebElement bootModel;

	@FindBy(xpath ="//h4[text()='Modal Title']/../..//a[text()='Close']")
	private WebElement closeModel;
	
	@FindBy(xpath ="//ul[@id='treemenu']//a[text()='Javascript Alerts']")
	private WebElement jsAlert;
	
	@FindBy(xpath ="//div[text()='Java Script Alert Box']/..//p[contains(text(),'When an')]/..//button")
	private WebElement clickMeAccept;
	
	@FindBy(xpath="//div[text()='Java Script Confirm Box']/..//p[contains(text(),'When a con')]/..//button")
	private WebElement confim;
	
	@FindBy(xpath="//div[text()='Java Script Alert Box']/..//p[contains(text(),'When a prompt box pops up, user can click \"OK\" or \"Cancel\" to proceed')]/..//button")
	private WebElement entertextAlert;
	/*
	 * =============================================================================
	 */

	public void clickOnDropdown() {
		dropdown.click();
		System.out.println("User clicks on the dropdown");
	}

	public void selectDay(String dayOfWeek) {
		Select day = new Select(countryDropdown);
		day.selectByVisibleText(dayOfWeek);
	}

	public void clickOnAlert() {
		alert.click();
		System.out.println("User clicks on the Alert");
	}
	
	public void clickOnLaunchModel() {
		launchModel.click();
		System.out.println("User click on the launch model button");
	}
	
	public void clickOnBootModel() {
		bootModel.click();
		System.out.println("User clicks on the Boot model");
	}
	
	public void clickOnCloseModel() {
		closeModel.click();
		System.out.println("User click on the close button");
	}
	
	public void clickOnJsAlert() {
		jsAlert.click();
	}
	
	public void clickOnClickMeAlert() {
		clickMeAccept.click();
	}
	public void clickOnClickMeConfimAlert() {
		confim.click();
	}
	public void clickOnClickMeEnterAlert() {
		entertextAlert.click();
	}
	
	public void alertDissmiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public void alertAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public String getTextAlert() {
		String text = this.driver.switchTo().alert().getText();
		return text;
	}
	
	public void enterTextAlert(String text) {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().alert().sendKeys(text);
		System.out.println("User Enters the "+ text);
	}

}
