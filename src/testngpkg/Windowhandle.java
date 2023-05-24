package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandle{
WebDriver d;
@BeforeTest
public void setup() {
	d=new ChromeDriver();
}

@Test
public void test() {
	d.get("https://demo.guru99.com/popup.php");
	String parentwindow= d.getWindowHandle();
	System.out.println("Parent Window Title" +d.getTitle());
	d.findElement(By.xpath("/html/body/p/a")).click();
	Set<String>allwindowHandles=d.getWindowHandles();
	for(String handle:allwindowHandles) {
		System.out.println(handle);
		System.out.println(parentwindow);
		
		if(!handle.equalsIgnoreCase(parentwindow)) {
			d.switchTo().window(handle);
			
			String s=d.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td/h2")).getText();
			System.out.println(s);
			d.close();
		}
		d.switchTo().window(parentwindow);
	}
}
}
