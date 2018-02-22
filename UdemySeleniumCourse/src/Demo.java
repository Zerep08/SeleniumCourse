import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1459751\\Documents\\Libraries\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		/*
		driver.get("https://www.facebook.com/");
		////tagname[@attribute = 'value'] - xpath
		
		// tagname[attribute = 'value'] - cssSelector
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Hola que tal");
		
		*/
		
		
		/*
		Select web elements with regular expresions
		driver.get("http://www.rediff.com/");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Hello");
		driver.findElement(By.cssSelector("input#password")).sendKeys("1234");
		driver.findElement(By.xpath("//input[contains(@name ='procee')]")).click();
		*/
		
		
		//Parent to child xpath
		driver.get("https://www.google.com.mx");
		driver.findElement(By.xpath("//*[@id=\'lst-ib\']")).sendKeys("Hello parent");
		
		//*[@id="lst-ib"]
		
		
		
		
		
		
		
	}

}
