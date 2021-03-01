package com.project.swiggy.SwiggyApplication;

import org.testng.annotations.Test;

import BaseClass.BaseTest;
import Pages.HomePage;
import Pages.SearchPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class HomePageTest  extends BaseTest{

	@Test
	public void test1() throws Exception { 
  
        // driver.get("https:// www.gmail.com"); 
        HomePage homepage =  PageFactory.initElements(driver, HomePage.class); 
     // SearchPage searchpage =  PageFactory.initElements(driver, SearchPage.class); 
        homepage.setLocation("mumbai");
        homepage.getCmpltLocation();
       // homepage.clickFindFood();
        //searchpage.searchBox("Pizza");
        homepage.searchButton();
        homepage.searchBox("Pizza");
        homepage.searchBoxEnter();
        
       System.out.println(homepage.resturantName());
   /*     loginpage.setEmail("abc@gmail.com"); 
        loginpage.clickOnNextButton(); 
        loginpage.setPassword("23456@qwe"); 
        loginpage.clickOnNextButton(); 
*/
     }
}