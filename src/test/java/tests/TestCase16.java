package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase16 {
	WebDriver driver;
	@BeforeTest
	public void browserinitilization() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
	}
	@Test
	public void loginbeforecheckout() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Assert.assertTrue(driver.findElement(By.cssSelector("div[class='item active'] img[alt='demo website for practice']")).isDisplayed());
		driver.findElement(By.cssSelector("a[href='/login']")).click();
		driver.findElement(By.cssSelector("input[data-qa='login-email']")).sendKeys("mdmoees31@gmail.com");
		driver.findElement(By.cssSelector("input[data-qa='login-password']")).sendKeys("Mois25@1996");
		driver.findElement(By.cssSelector("button[data-qa='login-button']")).click();
		driver.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[10]/a/b")).isDisplayed();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.cssSelector("a[href='/product_details/1']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();
		driver.findElement(By.xpath("//u[normalize-space()='View Cart']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Proceed To Checkout']")).click();
		driver.findElement(By.xpath("//h2[normalize-space()='Address Details']")).isDisplayed();
		driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys("asdfasdfds");
		driver.findElement(By.cssSelector("a[href='/payment']")).click();
		driver.findElement(By.cssSelector("input[data-qa='name-on-card']")).sendKeys("Mohammad Moees");
		driver.findElement(By.cssSelector("input[data-qa='card-number']")).sendKeys("123432144569");
		driver.findElement(By.cssSelector("input[data-qa='cvc']")).sendKeys("555");
		driver.findElement(By.cssSelector("input[data-qa='expiry-month']")).sendKeys("12");
		driver.findElement(By.cssSelector("input[data-qa='expiry-year']")).sendKeys("2024");
		driver.findElement(By.cssSelector("button[data-qa='pay-button']")).click();
		driver.findElement(By.cssSelector("div[class='col-sm-9 col-sm-offset-1'] p")).isDisplayed();
		driver.findElement(By.cssSelector("a[data-qa='continue-button']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Delete Account']")).click();
		driver.findElement(By.cssSelector("h2[data-qa='account-deleted']")).isDisplayed();
		driver.findElement(By.cssSelector("a[data-qa='continue-button']")).click();	
		
		
		
	}
	@AfterTest
	public void browserclose() {

		driver.quit();
	}
	

}
