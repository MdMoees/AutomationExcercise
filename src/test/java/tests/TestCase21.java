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

public class TestCase21 {
	WebDriver driver;
	@BeforeTest
	public void browserinitilization() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
	}
	@Test
	public void addreview() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("a[href='/products']")).click();
        driver.findElement(By.xpath("//h2[normalize-space()='All Products']")).isDisplayed();
        driver.findElement(By.cssSelector("a[href='/product_details/1']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Write Your Review']")).isDisplayed();
        driver.findElement(By.id("name")).sendKeys("Mohammad");
        driver.findElement(By.id("email")).sendKeys("mdmoees31@gmail.com");
        driver.findElement(By.id("review")).sendKeys("Yours is the worst product");
        driver.findElement(By.id("button-review")).click();
        driver.findElement(By.cssSelector("div[class='alert-success alert'] span")).isDisplayed();
		
	}
	@AfterTest
	public void browserclose() {

		driver.quit();
	}


}
