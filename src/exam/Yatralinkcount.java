package exam;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Yatralinkcount {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.yatra.com");
	}
	
	@ Test
	public void linkcount() {
		List <WebElement> Li=driver.findElements(By.tagName("a"));
		System.out.println("Total link count= "+Li.size());
		
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
