package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo {
	ChromeDriver driver;
	
	@Before
	public void setup() {
		 driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void titleverification()
	{
		String exp="Google";
		String actual=driver.getTitle();
		if(exp.equals(actual)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
}
