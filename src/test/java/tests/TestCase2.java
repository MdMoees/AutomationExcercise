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

public class TestCase2 {
	WebDriver driver;
	@BeforeTest
	public void browserinitilization() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
	}
	@Test
	public void LoginwithCorrectEmailandPass() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Assert.assertTrue(driver.findElement(By.cssSelector("div[class='item active'] img[alt='demo website for practice']")).isDisplayed());
		driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
		driver.findElement(By.cssSelector("div[class='login-form'] h2")).isDisplayed();
		Assert.assertTrue(driver.findElement(By.cssSelector("div[class='login-form'] h2")).isDisplayed());
		driver.findElement(By.cssSelector("input[data-qa='login-email']")).sendKeys("mdmoees31@gmail.com");
		driver.findElement(By.cssSelector("input[data-qa='login-password']")).sendKeys("Mois25@1996");
		driver.findElement(By.cssSelector("button[data-qa='login-button']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[10]/a/b")).isDisplayed());
		driver.findElement(By.xpath("//header/div/div/div/div[2]/div/ul/li[5]/a")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("h2[data-qa='account-deleted']")).isDisplayed());
		
		

		
	}
	
	@AfterTest
	public void browserclose() {

		driver.quit();
	}


}
