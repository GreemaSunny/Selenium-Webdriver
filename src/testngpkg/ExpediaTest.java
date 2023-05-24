package testngpkg;

import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.Keys;

//EXPEDIA assignment --using selenium ide record option
public class ExpediaTest {
  private WebDriver driver;
  //JavascriptExecutor js;

@BeforeTest
  public void setUp() {
    driver = new ChromeDriver();
    
  }

@AfterTest
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void expedia() {
    driver.get("https://www.expedia.com/");
    driver.findElement(By.xpath("//li[2]/a/span")).click();
    //driver.findElement(By.cssSelector("#location-field-leg1-origin-menu .uitk-fake-input")).click();
    driver.findElement(By.xpath("//input[@id=\'location-field-leg1-origin\']")).sendKeys("Brussels",Keys.ENTER);

  //  driver.findElement(By.cssSelector("#location-field-leg1-destination-menu .uitk-fake-input")).click();
    driver.findElement(By.id("location-field-leg1-destination")).sendKeys("Newyork");
    driver.findElement(By.id("location-field-leg1-destination")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector(".uitk-link-no-wrap > .uitk-icon")).click();
    driver.findElement(By.cssSelector(".uitk-layout-flex:nth-child(1) > .uitk-layout-flex > .uitk-layout-flex-item:nth-child(3) .uitk-icon")).click();
    driver.findElement(By.cssSelector(".uitk-layout-flex:nth-child(2) > .uitk-layout-flex > .uitk-layout-flex-item:nth-child(3) .uitk-icon")).click();
    driver.findElement(By.id("child-age-input-0-0")).click();
    {
      WebElement dropdown = driver.findElement(By.id("child-age-input-0-0"));
      dropdown.findElement(By.xpath("//option[. = '12']")).click();
    }
    driver.findElement(By.cssSelector(".uitk-button-floating-full-width")).click();
    driver.findElement(By.cssSelector("#preferred-class-input-trigger > .uitk-icon")).click();
    driver.findElement(By.cssSelector(".uitk-list-item:nth-child(4) > .uitk-menu-list-item-label")).click();
    driver.findElement(By.id("d1-btn")).click();
    driver.findElement(By.cssSelector(".uitk-date-picker-month:nth-child(2) tr:nth-child(2) > .uitk-date-picker-day-number:nth-child(4) > .uitk-date-picker-day")).click();
    driver.findElement(By.cssSelector(".uitk-layout-flex-item-flex-shrink-0 > .uitk-button")).click();
    driver.findElement(By.id("d2-btn")).click();
    driver.findElement(By.cssSelector(".uitk-date-picker-month:nth-child(2) tr:nth-child(4) > .uitk-date-picker-day-number:nth-child(6) > .uitk-date-picker-day")).click();
    driver.findElement(By.cssSelector(".uitk-layout-flex-item-flex-shrink-0 > .uitk-button")).click();
    driver.findElement(By.cssSelector(".uitk-layout-grid-item > .uitk-button")).click();
  }
}
