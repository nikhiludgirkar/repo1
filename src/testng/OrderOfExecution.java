package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrderOfExecution {

	@BeforeSuite
	public void suit1(){
		System.out.println("I am in suite");
	}
	

	
	@BeforeClass
	public void bclass1(){
		System.out.println("I am in before class");
	}
	
	@Test
	public void  mytest2(){
		System.out.println("I am in test annotation method2");
	}
	
	@BeforeMethod
	public void bmethod1(){
		System.out.println("in  before method");
	}
	
	@AfterMethod
	public void amethod1(){
		System.out.println("in  after method");
	}
	
	@AfterClass
	public void aclass1(){
		System.out.println("I am in after class");
	}
	
	@AfterTest
	public void atest1(){
		System.out.println("I am in  after test");
	}
	
	@AfterSuite
	public void afterSuit1(){
		System.out.println("I am in  after suite");
	}
	
	@BeforeTest
	public void test1(){
		System.out.println("I am in before test");
	}
}
