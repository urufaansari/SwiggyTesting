package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {


	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/div/div/div[1]/div[2]/div[1]/div[1]")
	WebElement firstitem;
	
	@FindBy(xpath = "	//*[@id=\"root\"]/div[1]/div/div/div/div[1]/div/input")
	WebElement searchBox;
	
	public void searchBox(String str) {
		searchBox.sendKeys(Keys.ENTER);
	}
	
	
	public String getFirstItemDeliveryTime() {
		return firstitem.getText();
}
}