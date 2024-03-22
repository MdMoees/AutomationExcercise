package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase15 {
	
	WebDriver driver;
	@BeforeTest
	public void browserinitilization() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
	}
	@Test
	public void registerbeforecheckout() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Assert.assertTrue(driver.findElement(By.cssSelector("div[class='item active'] img[alt='demo website for practice']")).isDisplayed());
		driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
		driver.findElement(By.cssSelector("input[data-qa='signup-name']")).sendKeys("Mohammad Moees");
		driver.findElement(By.cssSelector("input[data-qa='signup-email']")).sendKeys("brig@gmail.com");
		driver.findElement(By.cssSelector("button[data-qa='signup-button']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//b[contains(.,'Enter Account Information')]")).isDisplayed());
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("password")).sendKeys("1234");
		WebElement days = driver.findElement(By.id("days"));
		Select day= new Select(days);
		day.selectByVisibleText("15");
		WebElement months = driver.findElement(By.id("months"));
		Select month= new Select(months);
		month.selectByVisibleText("May");
		WebElement years = driver.findElement(By.id("years"));
		Select year=new Select(years);
		year.selectByVisibleText("1997");
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		driver.findElement(By.id("first_name")).sendKeys("Mohammad");
		driver.findElement(By.id("last_name")).sendKeys("Moees");
		driver.findElement(By.id("company")).sendKeys("Hyderabad");
		driver.findElement(By.id("address1")).sendKeys("Raheja Mindspace");
		driver.findElement(By.id("address2")).sendKeys("hitech city");
		driver.findElement(By.id("state")).sendKeys("Telangana");
		driver.findElement(By.id("city")).sendKeys("Hyderabad");
		driver.findElement(By.id("zipcode")).sendKeys("518005");
		driver.findElement(By.id("mobile_number")).sendKeys("987654321");
		driver.findElement(By.cssSelector("button[data-qa='create-account']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("h2[data-qa='account-created']")).isDisplayed());
		driver.findElement(By.cssSelector("a[data-qa='continue-button']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[10]/a/b")).isDisplayed());
		driver.findElement(By.cssSelector("a[href='/product_details/1']")).click();
		driver.findElement(By.cssSelector("div[class='modal-content'] a[href='/view_cart']")).click();
		driver.findElement(By.cssSelector("a[data-product-id='1']")).isDisplayed();
		driver.findElement(By.cssSelector("a[class='btn btn-default check_out']")).click();
		driver.findElement(By.xpath("//h2[normalize-space()='Address Details']")).isDisplayed();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys("asdodhoaisf");
		driver.findElement(By.cssSelector("a[href='/payment']")).click();
		
		

		

	}
	@AfterTest
	public void browserclose() {

		driver.quit();
	}
	

}
