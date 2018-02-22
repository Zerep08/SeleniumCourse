import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/zerep08/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		////tagname[@attribute = 'value'] - xpath
		
		// tagname[attribute = 'value'] - cssSelector
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Hola que tal");
	}

}
