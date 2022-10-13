package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBro {
    @Test
    public static void main()
    {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome");
        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();

        // Maximize the browser
        driver.manage().window().maximize();

        // Launch Website
        driver.get("https://www.geeksforgeeks.org/");
    }
}
