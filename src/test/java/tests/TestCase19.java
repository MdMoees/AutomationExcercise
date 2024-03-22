package tests;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase19 {
	WebDriver driver;
	@BeforeTest
	public void browserinitilization() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
	}
	
	@Test
	public void viewcartbutton() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Assert.assertTrue(driver.findElement(By.cssSelector("div[class='brands-name']")).isDisplayed());
		driver.findElement(By.cssSelector("a[href='/brand_products/Polo']")).click();
		driver.findElement(By.xpath("//h2[normalize-space()='Brand - Polo Products']")).isDisplayed();
		driver.findElement(By.xpath("//a[@href='/brand_products/H&M']")).click();
		driver.findElement(By.xpath("//h2[normalize-space()='Brand - H&M Products']")).isDisplayed();
	}
	@AfterTest
	public void browserclose() {

		driver.quit();
	}
}
