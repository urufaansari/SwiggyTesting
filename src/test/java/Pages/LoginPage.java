package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(xpath = "/html//div[@id='root']/div[@class='_3arMG']/div[@class='nDVxx']/div[@class='_1MdYR']//a[@class='x4bK8']")
WebElement loginbtn;

@FindBy(xpath = "/html//input[@id='mobile']")
static WebElement phonenumber;

@FindBy(xpath = "/html//div[@id='overlay-sidebar-root']//div[@class='_3vi_e']/div[@class='_12S7_']//form//a[@class='a-ayg']")
WebElement LoginBtn2;
//Initializing the Objects

@FindBy(xpath = "/html//div[@id='overlay-sidebar-root']//div[@class='_3vi_e']//div[@class='_3pYe-']/span[@class='_22fFW icon-close-thin']")
WebElement cancel;
private WebDriver driver;

public LoginPage(WebDriver driver)

{
			this.driver=driver;
            PageFactory.initElements(driver, this);

}
public void LoginClick()

{

            loginbtn.click();

}



//Specifiying email and psswd

public static String Login(String contact)

{

            phonenumber.sendKeys(contact);
            return "LoginFail";
             

}

//Clicking on Login button

public String clickLoginBtn()

{
            LoginBtn2.click();
            return "Login Fail";
}


public void cancelBtn() {
	cancel.click();
}
}

