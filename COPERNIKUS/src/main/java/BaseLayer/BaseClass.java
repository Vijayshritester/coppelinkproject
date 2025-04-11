package BaseLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	protected static  WebDriver driver;
	
	public static Properties prop;
	
	public static FileInputStream fis;
	public BaseClass()
	{
		File f= new File(System.getProperty("user.dir")+"/src/main/java/ConfiguratioLayer/a.propertie");
		
		prop=new Properties();
		
		try {
			fis = new FileInputStream(f);
		} catch (Exception e) {
		
			e.printStackTrace();
		}

		
		
	}
	
	
	public static void intialize()
	{
		
		//System.setProperty("webdriver.chrome.driver","/Users/dhananjay/eclipse-workspace/COPERNIKUS/chromepath/chromedriver-mac-x64 2/chromedriver");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)).pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.get("https://cds.climate.copernicus.eu/user/register");
		
	}

}
