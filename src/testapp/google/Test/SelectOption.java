package testapp.google.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SelectOption {
	public WebDriver driver;
	@BeforeClass
	public void setupDriver(){
		System.setProperty("webdriver.chrome.driver", "D:\\Dev Tools\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/dropdown");
	}
	
	@Test
	public void test1() throws InterruptedException {
		WebElement dd;
		dd=driver.findElement(By.xpath("//select[@id='dropdown']"));
		Select dropdown=new Select(dd);
		
		dropdown.selectByVisibleText("Option 2");
		Thread.sleep(5000);
		
	}

	@AfterClass
	public void shutDown(){
		if (driver!=null){
		driver.close();
		}
	}
}
