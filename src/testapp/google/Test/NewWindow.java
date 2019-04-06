package testapp.google.Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewWindow extends TestApp{

	@BeforeClass
	public void intialize(){
		setupDriver();
	}
	
	@Test
	
	public void test1(){
		String windowHandle=driver.getWindowHandle();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> set=driver.getWindowHandles();
		System.out.println(set.size());
		for (String s : set){
			if (!s.equals(windowHandle)){
//				System.out.println();
				driver.switchTo().window(s);
			}
		}
		WebDriverWait wait=new WebDriverWait(driver, 15);
		WebElement we=driver.findElement(By.xpath("//h3[contains(.,'New Window')]"));
		wait.until(ExpectedConditions.visibilityOf(we));
		boolean b=driver.findElement(By.xpath("//h3[contains(.,'New Window')]")).isDisplayed();
		if (!b)
			System.out.println("window switching not successful");
		driver.close();
		driver.switchTo().window(windowHandle);

		boolean t=driver.findElement(By.xpath("//a[contains(.,'Elemental Selenium')]")).isDisplayed();
		if (!t)
			System.out.println("window switching not  successful");
	
	}
	
	public void abc(){
		System.out.println("printing");
	}
	
	@AfterClass
	public void close(){
		driver.close();
//		driver.quit();
	}
}
