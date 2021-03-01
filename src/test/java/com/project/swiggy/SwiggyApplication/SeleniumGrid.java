package com.project.swiggy.SwiggyApplication;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SeleniumGrid {

	@Test

	public void initialize() throws MalformedURLException {
		DesiredCapabilities dr = null;
		String browserType = "chrome";
		System.out.println(browserType);
		if (browserType.equals("firefox")) {
			dr = DesiredCapabilities.firefox();
			dr.setBrowserName("firefox");
			dr.setPlatform(Platform.WINDOWS);
		}
		
		else {
			dr = DesiredCapabilities.internetExplorer();
			dr.setBrowserName("chrome");
			dr.setPlatform(Platform.WINDOWS);
		}

		//RemoteWebDriver remoteWebDriver = new RemoteWebDriver(new URL("http://192.168.0.106:4444/wd/hub"), dr);

		URL myRURL = new URL("http://localhost:5555/wd/hub");
	    RemoteWebDriver driver = new RemoteWebDriver(myRURL, dr);
		driver.get("https://www.swiggy.com/restaurants");

	}
	
	
	  @Test
	  
	  public void initialize2() throws MalformedURLException { DesiredCapabilities
	  dr = null; String browserType = "firefox"; System.out.println(browserType);
	  if (browserType.equals("firefox")) { dr = DesiredCapabilities.firefox();
	  dr.setBrowserName("firefox"); dr.setPlatform(Platform.WINDOWS); }
	  
	  else { dr = DesiredCapabilities.internetExplorer();
	  dr.setBrowserName("chrome"); dr.setPlatform(Platform.WINDOWS); }
	  
	  // RemoteWebDriver remoteWebDriver = new RemoteWebDriver(new
	  URL("http://192.168.0.106:4444/wd/hub"), dr);
	  
	  URL myRURL = new URL("http://localhost:5555/wd/hub"); RemoteWebDriver driver
	  = new RemoteWebDriver(myRURL, dr);
	  driver.get("https://www.swiggy.com/restaurants");
	  
	  }
	 

	 
	 
} 

