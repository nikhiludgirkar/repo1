package testapp.google.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import testapp.google.core.PropertyReader;

//import testapp.google.core.PropertyReader;

//import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class TestApp {
	
	protected WebDriver driver;

//	@BeforeClass
	public void setupDriver(){
//		try{
//		Properties prop=new Properties();
		Properties prop=PropertyReader.readData();
		prop=PropertyReader.readData();
//		
		String browser=prop.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\Dev Tools\\chromedriver.exe");
			driver=new ChromeDriver();	
		}
		else
			if (browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "D:\\Dev Tools\\geckodriver.exe");
			driver=new FirefoxDriver();	
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void test1() throws IOException{
		driver.findElement(By.name("q")).sendKeys("Windows 10");
		WebDriverWait wait=new WebDriverWait(driver, 7);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='suggestions-inner-container']/descendant::span[contains(.,'windows 10')]/child::b[contains(.,'price')]")));
		driver.findElement(By.xpath("//div[@class='suggestions-inner-container']/descendant::span[contains(.,'price')]")).click();
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		WebElement we;
		try{
			boolean b=driver.findElement(By.xpath("//div[@id='hdtb-msb']/descendant::div[contains(.,'All')][1]")).isDisplayed();
		}catch (NoSuchElementException e){
			File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File("d:\\screenshot1.jpg"));
//			e.printStackTrace();
			Assert.fail("All element not found");
		}
		//		JavaScriptExecutor js=((JavaScriptExecutor)driver).execut
//		js.exec
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 500)");
//		driver.findElement(By.xpath("//h3[contains(.,'Windows 10 - Wikipedia')]")).click();
	}
	
//	@AfterClass
	public void shutDown(){
		if (driver!=null){
		driver.close();
		}
	}
}
