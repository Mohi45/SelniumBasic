package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBro {
    @Test
    public static void main()
    {
        System.out.println("1st Line inside Method !!!");
         System.out.println("1st Line inside Method !!!");
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        System.out.println("2nd Line inside Method !!!");
        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();
        System.out.println("3rd Line inside Method !!!");

        // Maximize the browser
        driver.manage().window().maximize();
        System.out.println("4th Line inside Method !!!");
        // Launch Website
        driver.get("https://www.geeksforgeeks.org/");
        System.out.println("5th Line inside Method !!!");
    }
}
