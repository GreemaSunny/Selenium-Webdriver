package pkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responecode {

	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
}
	@ Test
	public void linkdisplay() {
		
		List <WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("Total no of links="+li.size());
		
		for(WebElement s:li) {
			
		   String link=s.getAttribute("href");
		   verify(link);
		}	
	}
		
	private void verify(String link) {
		try {
			URL u=new URL(link);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			con.connect();
			if(con.getResponseCode()==200) {
				System.out.println("Successful response code=200---"+link);
			}else if(con.getResponseCode()==404){
			System.out.println("broken link 404---"+link);
			}
		    }
		
			catch(Exception e){
			System.out.println(e.getMessage());
			}
	   }	
	}
	
	
	
