package testapp.google.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckboxTest extends TestApp{
	@BeforeClass
	public void setupDriver(){
		setupDriver();
	}
	
	@Test
	public void test1(){
		driver.findElement(By.xpath("//h3[contains(.,'Checkboxes')]/following-sibling::form/child::input[1]")).click();
		WebElement we2=driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
		if (we2.isSelected())
			we2.click();
		try{
			
			Thread.sleep(5000);
			}
			catch (InterruptedException i){}
			
	}
}
