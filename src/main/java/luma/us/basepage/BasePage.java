package luma.us.basepage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	public static WebDriver driver;
	public static Properties prop;
	public static Logger log;
	
	// we create a constructor
	public BasePage() {
		// we create a object of Properties class
		prop = new Properties();
		FileInputStream fils;
		log=Logger.getLogger("TestLead");
		PropertyConfigurator.configure("Log4j.Properties");
		try {
			fils = new FileInputStream ("./src/main/java/luma/us/config/Config.properties");
			prop.load(fils);
		} catch (IOException e) {
			
			e.printStackTrace();}
			finally {
				System.out.println( "config file is founding");
			}
		}
		
	

	public static void getAutomate() {
		
		String BrowserName= prop.getProperty("browser");
		
		if(BrowserName.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
	}
		else if(BrowserName.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
	}
			
		if(BrowserName.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
	}
		
	
	
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	//	driver.navigate().to("https://magento.softwaretestingboard.com/");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
}
}