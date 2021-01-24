package irctc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserInvoke {
	public static WebDriver driver;
	public Properties prop;
	String browserProp;
	FileInputStream fis;
	
	public WebDriver initializeDriver() throws IOException
	{
		prop = new Properties();
		browserProp = System.getProperty("user.dir") +"\\src\\main\\resources\\properties\\browserInfo.properties";
		fis = new FileInputStream(browserProp);
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		//If browser = Google Chrome invoke below section
		if(browserName.equalsIgnoreCase("Chrome")) {
			String chromeDriverPath = System.getProperty("user.dir") + "\\src\\main\\resources\\driver\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			driver = new ChromeDriver();
		}
		//If browser = Firefox invoke below section
		else if (browserName.equalsIgnoreCase("firefox")) {
			String firefoxDriverPath = System.getProperty("user.dir") + "\\src\\main\\resources\\driver\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
			driver = new FirefoxDriver();
			
		}
		//If browser = edge invoke below section
		else if (browserName.equalsIgnoreCase("internet explorer")) {
			String edgeDriverPath = System.getProperty("user.dir") + "\\src\\main\\resources\\driver\\msedgedriver.exe";
			System.setProperty("webdriver.edge.driver", edgeDriverPath);
			driver = new EdgeDriver();
		}
		
		String waitTime = prop.getProperty("waitTime");
		driver.manage().timeouts().implicitlyWait((Long.parseLong(waitTime)), TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public String getUrl() {
		String urlLink = prop.getProperty("webPage");
		return urlLink;
	}
	
	

}
