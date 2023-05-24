package testngpkg;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngGrouping {
 @BeforeTest(alwaysRun=true)
 public void setup() {
	 System.out.println("browser open");
 }
	
	@Test(groups= {"smoke"})
 public void test1() {
	 System.out.println("Test1");
 }
 @Test(groups= {"smoke"})
 public void test2() {
	 System.out.println("Test2");
 }
 @Test(groups= {"smoke"})
 public void test3() {
	 System.out.println("Test3");
 }
 @Test(groups= {"sanity"})
 public void test4() {
	 System.out.println("Test4");
 }
 @Test(groups= {"regression"})
 public void test5() {
	 System.out.println("Test5");
 } 
 @Test(groups= {"regression"})
 public void test6() {
	 System.out.println("Test6");
 } 
 @Test(groups= {"sanity"})
 public void test7() {
	 System.out.println("Test7");
 } 
 @Test(groups= {"smoke","sanity"})
 public void test8() {
	 System.out.println("Test8");
 } 
 @Test(groups= {"regression","sanity"})
 public void test9() {
	 System.out.println("Test9");
 } 
}
