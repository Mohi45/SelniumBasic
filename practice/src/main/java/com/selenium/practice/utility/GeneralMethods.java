package com.selenium.practice.utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class GeneralMethods {

	private WebDriver driver;
	
	public GeneralMethods(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	

	public void clickOnEscapeButton() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		System.out.println("User clicks on the Escape Button");
	}

}
