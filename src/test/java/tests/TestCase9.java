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

public class TestCase9 {
	WebDriver driver;
	@BeforeTest
	public void browserinitilization() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
	}
	@Test
	public void searchproduct() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Assert.assertTrue(driver.findElement(By.cssSelector("div[class='item active'] img[alt='demo website for practice']")).isDisplayed());
		driver.findElement(By.cssSelector("a[href='/products']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector(".title.text-center")).isDisplayed());
		driver.findElement(By.id("search_product")).sendKeys("Mens Shirt");
		driver.findElement(By.id("submit_search")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='Searched Products']")).isDisplayed());
	}
	@AfterTest
	public void browserclose() {

		driver.quit();
	}

}
