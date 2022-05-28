package com.selenium.practice.PageAction;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxRadioPage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	
	public CheckBoxRadioPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(120, 1));
	}

	@FindBy(xpath="//label[text()='Click on this check box']")
	private WebElement checkBox;
	
	@FindBy(xpath="//ul[@id='treemenu']//a[text()='Radio Buttons Demo']")
	private WebElement radioButton;
	
	@FindBy(xpath="//div[text()='Radio Button Demo']/..//label//input[@value='Male']")
	private WebElement genderF;
	
	@FindBy(xpath="//ul[@id='treemenu']//a[text()='Checkbox Demo']")
	private WebElement checkboxDemo;
	
	public void clickOnCheckBox() {
		checkBox.click();
		System.out.println("User click on the checkbox");
	}
	
	public void clickOnRadio() {
		radioButton.click();
		System.out.println("User click on the Radio Button");
	}
	
	public void clickOnGenderButton() {
		genderF.click();
		System.out.println("User click on the Radio button Male");
		
	}
	public void clickOnCheckBoxInput() {
		checkboxDemo.click();
		System.out.println("Users clicks on the CheckBox Input button");
	}
	
	
	
	
}
