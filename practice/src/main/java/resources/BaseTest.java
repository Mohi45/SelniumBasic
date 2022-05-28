package resources;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import com.selenium.practice.BrowserType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
private static List<WebDriver> driverPool=new ArrayList<WebDriver>();
	
	@BeforeSuite
	public void setUp() {
		System.out.println("I am here");
		WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
	}

	public WebDriver getDriver(BrowserType type,String baseUrl) {
		WebDriver driver=DriverFactory.getInstance().getDriver(type);
		driverPool.add(driver);
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;		
	}
	
	 public WebDriver getDriver() {
		return getDriver(BrowserType.CHROME, "https://demo.seleniumeasy.com/");
	}
	 
}