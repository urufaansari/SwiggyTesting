package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCartStepDefination {
	public static WebDriver driver;
@Given("^the swiggy home page is displayed$")
public void the_swiggy_home_page_is_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 // Write code here that turns the phrase above into concrete actions
	System.out.println("home page is displayed");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Urufa\\eclipse-workspace\\SwiggyApplication\\src\\test\\resources\\chromedriver.exe");

driver = new ChromeDriver();

 driver.manage().window().maximize(); 

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.swiggy.com/");
}

@Given("^customer Select delivery Location$")
public void customer_Select_delivery_Location() throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	System.out.println("customer Select delivery Location");
	driver.findElement(By.xpath("/html//input[@id='location']")).sendKeys("Mumbai");
	driver.findElement(
			By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[2]/div/div[3]/div[1]/span[2]"))
			.click();
}

@When("^the customer searches for “Momos\"$")
public void the_customer_searches_for_Momos() throws Throwable {
	 // Write code here that turns the phrase above into concrete actions
	// Write code here that turns the phrase above into concrete actions
	System.out.println("customer searches for “Momos");
	driver.findElement(By.linkText("Search")).click();
	driver.findElement(By.xpath("/html//div[@id='root']/div[@class='_3arMG']/div[@class='nDVxx']//input"))
			.sendKeys("Momos");

	driver.findElement(By.xpath("/html//div[@id='root']/div[@class='_3arMG']/div[@class='nDVxx']//input"))
			.sendKeys(Keys.ENTER);

}

@When("^the customer adds the first result to the cart$")
public void the_customer_adds_the_first_result_to_the_cart() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("customer adds the first result to the cart");
	driver.findElement(
			By.xpath("/html//div[@id='root']/div[@class='_3arMG']/div[@class='nDVxx']//button[.='Dishes']"))
			.click();
	driver.findElement(By.xpath(
			"/html//div[@id='root']/div[@class='_3arMG']/div[@class='nDVxx']/div[@class='_1LkiC']//div[@class='_23oa6']/div[@class='EiD4d']//div[@class='c_Wl4']/div[@class='_1N1IJ']/div[1]/div[@class='NwavL']/div[1]//div[@class='_1RPOp']"))
			.click();
	driver.findElement(By.xpath("/html//div[@id='modal-placeholder']//div[@class='_1Kr-y _3EeZR']/div[@class='_26cJ9']//span[@class='_38xdN']")).click();

}

@Then("^the cart has one plate of Momos$")
public void the_cart_has_one_plate_of_Momos() throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("/html//div[@id='root']/div[@class='_3arMG']/header[@class='_76q0O']//ul[@class='_1JNGZ']//a[@href='/checkout']/span[.='Cart']")).click();
	String addeditem = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div[1]/div")).getText();
	String expectedResult = "Chicken Momos";
	addeditem.contains(expectedResult);

}


}
