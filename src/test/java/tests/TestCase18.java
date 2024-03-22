package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase18 {

	WebDriver driver;
	@BeforeTest
	public void browserinitilization() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
	}
	@Test
	public void categoryproduct() {
		driver.findElement(By.id("accordian")).isDisplayed();
		driver.findElement(By.xpath("//*[@id='accordian']/div[1]/div[1]/h4/a/span/i")).click();
		driver.findElement(By.xpath("//div[@id='Women']//a[contains(text(),'Dress')]")).click();
		driver.findElement(By.xpath("//h2[normalize-space()='Women - Dress Products']")).isDisplayed();
		driver.findElement(By.xpath("//a[normalize-space()='Men']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Tshirts']")).click();
		driver.findElement(By.xpath("//h2[contains(text(),'Men -')]")).isDisplayed();
	}
	@AfterTest
	public void browserclose() {

		driver.quit();
	}

	

}

