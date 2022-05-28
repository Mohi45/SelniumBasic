package com.selenium.practice.PageAction;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicPage {
	
	private WebDriver driver;
	private WebDriverWait wait;

	@FindBy(id = "user-message")
	private WebElement enterMsg;

	@FindBy(id = "btn_basic_example")
	private WebElement btnBasic;

	@FindBy(xpath = "//div[@class='list-group']//a[text()='Simple Form Demo']")
	private WebElement simpleForm;

	@FindBy(xpath = "//button[text()='Show Message']")
	private WebElement showMsg;

	@FindBy(id = "display")
	private WebElement message;

	@FindBy(id = "sum1")
	private WebElement sumA;

	@FindBy(id = "sum2")
	private WebElement sumB;

	@FindBy(xpath = "//button[text()='Get Total']")
	private WebElement getTotal;

	@FindBy(id = "displayvalue")
	private WebElement total;

	@FindBy(xpath = "//a[text()='No, thanks!']")
	private WebElement alertclose;
	
	@FindBy(xpath="//a[text()='Input Forms']")
	private WebElement inputForms;

	public BasicPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(120, 1));
	}

	public void clickOnStart() {
		btnBasic.click();
		System.out.println("User clicks on practice button");
	}

	public void clickOnSampleDemo() {
		wait.until(ExpectedConditions.elementToBeClickable(simpleForm));
		simpleForm.click();
		System.out.println("User clicks on the simple Demo form");
	}

	public void enterUserMessage(String message) {
		enterMsg.sendKeys(message);
		System.out.println("User enters the message= " + message);
	}

	public void showMessage() {
		showMsg.click();
		System.out.println("User clicks on the show message button");
	}

	public String getMessage() {
		String getMessage = message.getText();
		return getMessage;
	}

	public void enterValues(String a, String b) {
		sumA.sendKeys(a);
		sumB.sendKeys(b);
		System.out.println("user enters values=" + a + " and " + b);
	}

	public void clickOnGetTotal() {
		getTotal.click();
		System.out.println("User clicks on the get total button");
	}

	public String getTotal() {
		String sum = total.getText();
		return sum;
	}
	
	public void clickOnInputForm() {
		inputForms.click();
		System.out.println("Users clicks on the input forms button");
	}

}
