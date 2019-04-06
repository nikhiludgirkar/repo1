package testapp.google.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ListOfElements extends TestApp{
	@BeforeClass
	public void setupDriver(){
		setupDriver();
	}
	
	@Test
	public void te1(){
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		for (WebElement we : li)
			System.out.println(we.getText());
	}
	
	
}
