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

public class TestCase6 {
	WebDriver driver;
	@BeforeTest
	public void browserinitilization() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		
	}
	@Test
	public void contactusform() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Assert.assertTrue(driver.findElement(By.cssSelector("div[class='item active'] img[alt='demo website for practice']")).isDisplayed());
		driver.findElement(By.cssSelector("a[href='/contact_us']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("h2.title:nth-child(2)")).isDisplayed());
		driver.findElement(By.name("name")).sendKeys("Mohammad Moees");
		driver.findElement(By.name("email")).sendKeys("mdmoees31@gmail.com");
		driver.findElement(By.name("subject")).sendKeys("Automation testing");
		driver.findElement(By.name("message")).sendKeys("This is only for my project purposr");
		driver.findElement(By.name("upload_file")).sendKeys("C:\\Users\\moham\\OneDrive\\Desktop\\images.jpg");
		driver.findElement(By.name("submit")).click();
		
	}
	@AfterTest
	public void browserclose() {

		driver.quit();
	}


}
