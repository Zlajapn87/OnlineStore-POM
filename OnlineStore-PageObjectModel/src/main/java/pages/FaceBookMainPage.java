package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FaceBookMainPage {
	
	public static final String PAGE_TITLE = "Facebook - Log In or Sign Up";
	public static final String PAGE_URL = "https:/facebook.com";
	
	@FindBy(id = "email") WebElement field_EmailLogin;
	@FindBy(id = "pass") WebElement field_PasswordLogin;
	@FindBy(css = "#loginbutton>input") WebElement button_Login;
	
	
	
	WebDriver driver;
	
	public FaceBookMainPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setText_EmailLogin(String text) {
	field_EmailLogin.sendKeys(text);
	Assert.assertEquals(text, field_EmailLogin.getAttribute("value"));
	
		
	}
	
	public void setText_PasswordLogin(String text) {
		field_PasswordLogin.sendKeys(text);
		Assert.assertEquals(text, field_PasswordLogin.getAttribute("value"));
	}
	
	public void clickLoginMain() {
		button_Login.click();
	}
	
	

}
