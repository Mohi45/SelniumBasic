package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LaunchBro {
    @Test
    public static void main()
    {
        System.out.println("1 Line inside Method !!!");
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        System.out.println("2 Line inside Method !!!");
        ChromeOptions options = new ChromeOptions();
        System.out.println("3 Line inside Method !!!");
        options.addArguments("start-maximized"); // open Browser in maximized mode
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("--no-sandbox"); // Bypass OS security model
        options.addArguments("--headless");
        System.out.println("4 Line inside Method !!!");
        WebDriver driver = new ChromeDriver(options);
        System.out.println("5 Line inside Method !!!");
        driver.get("https://google.com");
    }
}
