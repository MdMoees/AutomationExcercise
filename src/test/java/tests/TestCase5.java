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

public class TestCase5 {
	WebDriver driver;
	@BeforeTest
	public void browserinitilization() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		
	}
	@Test
	public void existingemail() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Assert.assertTrue(driver.findElement(By.cssSelector("div[class='item active'] img[alt='demo website for practice']")).isDisplayed());
		driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("div[class='login-form'] h2")).isDisplayed());
		driver.findElement(By.cssSelector("input[data-qa='signup-name']")).sendKeys("Mohammad Moees");
		driver.findElement(By.cssSelector("input[data-qa='signup-email']")).sendKeys("mdmoees31@gmail.com");
		driver.findElement(By.cssSelector("button[data-qa='signup-button']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//section/div/div/div[3]/div/form/p")).isDisplayed());
	}
	@AfterTest
	public void browserclose() {

		driver.quit();
	}

}
