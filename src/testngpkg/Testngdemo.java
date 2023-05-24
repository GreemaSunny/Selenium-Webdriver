package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test(priority=1,invocationCount=3)
	public void titleverification() {
		String exptitle="Rediffmail Free Unlimited Storage";
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		
		if(exptitle.equals(actualtitle))
		{
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	}
	
	@Test(priority=2)
	public void buttonenabled() {
		Boolean button=driver.findElement(By.xpath("//input[@id='Register']")).isEnabled();
	    if(button) {
	    	System.out.println("create my account button is enabled");
	    }
	    else {
	    	System.out.println("create my account button is not enabled");
	    	}
	}
	
	@Test(priority=3,dependsOnMethods= {"buttonenabled"})
	public void buttontextverification() {
		
WebElement T=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]"));
		
		String actual=T.getAttribute("value") ;
		String exp="Check availability";
		if(exp.equals(actual))
		{
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	}
	@AfterMethod
	public void mtd() {
		System.out.println("aftermethod");
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
