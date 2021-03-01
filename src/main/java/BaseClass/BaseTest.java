package BaseClass;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseTest {
	
	
	  public static WebDriver driver = null;
	  
	  @BeforeClass public void initialize() throws IOException {
	  
	  System.setProperty("webdriver.chrome.driver",
	  "src/test/resources/chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  
	  // To maximize browser 
	  driver.manage().window().maximize();
	  
	   driver.manage().timeouts().implicitlyWait( 10,  TimeUnit.SECONDS);
	  
	   driver.get("https://www.swiggy.com/restaurants"); 
	  }
	  
	  @AfterClass // Test cleanup 
	  public void TeardownTest() {
	  BaseTest.driver.quit(); }
}
	 
