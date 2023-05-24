package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbloginpage;

public class Fblogintest extends Baseclass {
//WebDriver driver;
//@BeforeTest
//public void setup() {
//	driver=new ChromeDriver();
//	driver.get("https://www.facebook.com");
//}
	@Test
	public void testlogin() {
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setvalues("abc@gmail.com", "abc123");
		ob.login();
		
	}
}
