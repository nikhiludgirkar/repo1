package testapp.google.Test;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testapp.google.core.PropertyReader;

public class MouseOps extends TestApp{
	@BeforeClass
	public void setDriver(){
		setupDriver();
	}
	
	@Test
	public void test1(){
		/*WebElement source=driver.findElement(By.xpath("//a[contains(.,'BANK')]"));
		WebElement destination=driver.findElement(By.xpath("//div/child::ol[@id='bank']/child::li"));
		Actions action=new Actions(driver);
		action.dragAndDrop(source, destination).build().perform();*/
		
		/*WebElement we=driver.findElement(By.xpath("//h5[contains(.,'user1')]/parent::div/preceding-sibling::img"));
		Actions action=new Actions(driver);
		action.moveToElement(we).build().perform();
		WebElement text=driver.findElement(By.xpath("//h5[contains(.,'user1')]"));
		if (!text.isDisplayed())
			Assert.fail("Element not found");
		try{
			
		Thread.sleep(5000);
		}
		catch (InterruptedException i){}*/
		driver.findElement(By.linkText("Elemental Selenium")).click();
		
	}
	
//	@AfterClass
//	public void close(){
////		shutDown();
//		driver.close();
//	}
}
