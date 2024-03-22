package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase13 {
	WebDriver driver;
	@BeforeTest
	public void browserinitilization() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
	}
	@Test
	public void varifyproductquantityincart() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Assert.assertTrue(driver.findElement(By.cssSelector("div[class='item active'] img[alt='demo website for practice']")).isDisplayed());
		driver.findElement(By.cssSelector("a[href='/product_details/1']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("div[class='product-information'] h2")).isDisplayed());
		driver.findElement(By.id("quantity")).clear();
		driver.findElement(By.id("quantity")).sendKeys("4");
		driver.findElement(By.cssSelector("button[class='btn btn-default cart']")).click();
		driver.findElement(By.cssSelector("a[href='/view_cart'] u")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//button[normalize-space()='4']")).isDisplayed());
		
		
		
	}
	@AfterTest
	public void browserclose() {

		driver.quit();
	}
	

}
