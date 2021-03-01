package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PizzaHutPage {
	WebDriver driver;
	
	public  PizzaHutPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	@FindBy(xpath = "//*[@id=\"menu-content\"]/div[1]/div[1]/div/div/div[1]/div/a[7]/div")
	WebElement nonVegSection;
	
	@FindBy(xpath = "//*[@id=\"h-820871264\"]/div[2]/div[1]/div[1]/div/div[1]/div[2]/span")
	WebElement item1;
	
	@FindBy(xpath = "//*[@id=\"h-820871264\"]/div[2]/div[2]/div/div/div[1]/div[2]/span")
	WebElement item2;
	
	@FindBy(xpath = "//*[@id=\"h-820871264\"]/div[2]/div[1]/div[1]/div/div[2]/div[2]/div/div[1]")
	WebElement item1AddBtn;
	
	@FindBy(xpath="//*[@id=\"h-820871264\"]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]")
	WebElement item2AddBtn;
	
	
	
	public void clickOnNonVegSection() {
		nonVegSection.click();
		
	}
	
	public void  item1AddToCartBtn() {
		item1AddBtn.click();
		
	}
	public void  item2AddToCartBtn() {
		item2AddBtn.click();
		
	}
}
