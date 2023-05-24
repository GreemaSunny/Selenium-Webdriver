package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage {

WebDriver driver;
By fbemail=By.id("email");
By fbpassword=By.name("pass");
By fbloginbutton=By.name("login");

public Fbloginpage(WebDriver driver) {
	this.driver=driver;
}

public void setvalues(String email,String paswd) {
	driver.findElement(fbemail).sendKeys(email);
	driver.findElement(fbpassword).sendKeys(paswd);
}
public void login() {
	driver.findElement(fbloginbutton).click();
}

}
