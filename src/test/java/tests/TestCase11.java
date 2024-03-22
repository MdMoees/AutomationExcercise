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

public class TestCase11 {
	WebDriver driver;
	@BeforeTest
	public void browserinitilization() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
	}
	@Test
	public void viewsubscriptionincart() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Assert.assertTrue(driver.findElement(By.cssSelector("div[class='item active'] img[alt='demo website for practice']")).isDisplayed());
		driver.findElement(By.cssSelector("a[href='/view_cart']")).click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,8500)");
		driver.findElement(By.xpath("//h2[normalize-space()='Subscription']")).isDisplayed();
		driver.findElement(By.xpath("//input[@id='susbscribe_email']")).sendKeys("mdmoees31@gmil.com");
		driver.findElement(By.xpath("//button[@id='subscribe']")).click();
	}
	@AfterTest
	public void browserclose() {

		driver.quit();
	}


}
