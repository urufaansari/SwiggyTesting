package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.bytebuddy.asm.Advice.Return;

public class HomePage {
WebDriver driver;
public HomePage(WebDriver driver) {
	this.driver=driver;
}

@FindBy(xpath = "//*[@id=\"location\"]")
WebElement location;

@FindBy(xpath = "/html//div[@id='root']/div[@class='_3arMG']/div[@class='nDVxx']/div[@class='_1MdYR']//div[@class='_1oLDb']/div[1]/span[@class='_2W-T9']")
WebElement selectLocation;

@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[2]/a")
WebElement btnFood;

@FindBy(xpath = "/html//div[@id='root']/div[@class='_3arMG']//ul[@class='_1JNGZ']//span[.='Search']")
WebElement searchbtn;

@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/div/div/div[1]/div/input")
WebElement searchBox;

@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/div/div/div[2]/div[2]/div/div[1]/div/div[1]/div[1]/a/div/div/div[2]/div[1]")
WebElement getresturantnamElement;
public void setLocation(String locat) {
	location.sendKeys(locat);
}


public void getCmpltLocation() {
	selectLocation.click(); 
}


public void searchBox(String str) {
	searchBox.sendKeys(str);
}
public void searchBoxEnter() {
	searchBox.sendKeys(Keys.ENTER);
}

public void searchButton() {
	searchbtn.click();
}

public String resturantName() {
	return getresturantnamElement.getText();
}

}

