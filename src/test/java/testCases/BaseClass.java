package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

		public WebDriver driver;

		@BeforeClass
		public void setup()
		{
			//ChromeOptions options=new ChromeOptions();
			//options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
			
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//driver.get("http://localhost/opencart/upload/index.php");
			driver.get("https://demo.opencart.com/index.php");
			
			driver.manage().window().maximize();
		}
		
		
}
