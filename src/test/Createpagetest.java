package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Createpage;

public class Createpagetest extends Baseclass {
//WebDriver driver;
//@BeforeTest
//public void setup() {
//	driver=new ChromeDriver();
//	driver.get("https://www.facebook.com");
//}

@Test
public void Createtest() {
	Createpage pg=new Createpage(driver);
	pg.createpageclick();
	pg.getstartedclick();
	
}
}
