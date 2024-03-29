package recursos;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public WebDriver driver;

	public static void main(String[] args) {
		

	}
	
	public WebDriver inicializarDriver() throws IOException {
		
		Properties propiedad = new Properties();
		FileInputStream path = new FileInputStream("C:\\Users\\Katiusca\\eclipse-workspace\\Sophos Solutions\\E2EProject\\src\\main\\java\\recursos\\data.properties");
		
		propiedad.load(path);
	String browsername = propiedad.getProperty("browser");
	
	if (browsername.equals("chrome")) {
		
		//Ejecuta el chromedriver 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Katiusca\\eclipse-workspace\\Sophos Solutions\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
				
	}
	else if (browsername.equals("firefox")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Katiusca\\eclipse-workspace\\Sophos Solutions\\E2EProject\\drivers");
		driver = new FirefoxDriver();
		
	}
	else if (browsername.equals("IE")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Katiusca\\eclipse-workspace\\Sophos Solutions\\drivers");
	    driver = new ChromeDriver();
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver; 
		
	}
	
	public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;


	}
	
	
	
		
		
}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


