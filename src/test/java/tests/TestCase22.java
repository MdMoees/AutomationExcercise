package tests;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase22 {
	WebDriver driver;
	@BeforeTest
	public void browserinitilization() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
	}
	@Test
	public void addtocartfromrecommended() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,7000)");
		Assert.assertTrue(driver.findElement(By.cssSelector("div[class='recommended_items'] h2")).isDisplayed());
		driver.findElement(By.xpath("//div[@class='item']//div[1]//div[1]//div[1]//div[1]//a[1]")).click();
		driver.findElement(By.xpath("//u[normalize-space()='View Cart']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//a[normalize-space()='Blue Top']")).isDisplayed());
	
	}
	@AfterTest
	public void browserclose() {

		driver.quit();
	}

}
