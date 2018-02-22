import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/zerep08/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com.mx");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
	}

}
