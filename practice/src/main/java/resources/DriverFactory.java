package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import com.selenium.practice.BrowserType;

public class DriverFactory {
	
	//Singleton design pattern
	
	private static DriverFactory instance= new DriverFactory();
	
	private DriverFactory() {}
	
	public static DriverFactory getInstance() {
		return instance;
	}
	
	//Factory Design pattern
	
	private static ThreadLocal<WebDriver> threadLocal=new ThreadLocal<WebDriver>();
	
	public WebDriver getDriver(BrowserType type) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--whitelisted-ips");
		//options.addArguments("--headless");

		switch (type) {
		case CHROME:
			threadLocal.set(new ChromeDriver(options));
			break;
			
		case EDGE:
			threadLocal.set(new EdgeDriver());
			break;

		default:
			break;
		}
		return threadLocal.get();
		
	}

}
