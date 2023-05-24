package pkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firstscript {

	public static void main(String[] args) {
		
		//FirefoxDriver driver=new FirefoxDriver();
		
		//ChromeDriver driver=new ChromeDriver();
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
	}
	

	
	

}
