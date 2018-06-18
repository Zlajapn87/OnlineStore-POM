import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Zlaja\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
	
		driver.get("https://facebook.com");
		driver.quit();

	}

}
