package Jenkins_package;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class NewTest {

	WebDriver driver;
	@Test
	public void f() {
		driver = new ChromeDriver();
		
		driver.get("http://zero.webappsecurity.com/login.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}
	
}
