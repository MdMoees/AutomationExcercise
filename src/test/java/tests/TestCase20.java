package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase20 {
	WebDriver driver;
	@BeforeTest
	public void browserinitilization() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
	}
	@Test
	public void varifyproductafterlogin() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("a[href='/products']")).click();
		driver.findElement(By.xpath("//h2[normalize-space()='All Products']")).isDisplayed();
		driver.findElement(By.id("search_product")).sendKeys("Polo");
		driver.findElement(By.id("submit_search")).click();
		driver.findElement(By.xpath("//h2[normalize-space()='Searched Products']")).isDisplayed();
		driver.findElement(By.xpath("//div[@class='overlay-content']//p[contains(text(),'Premium Polo T-Shirts')]")).isDisplayed();
		driver.findElement(By.xpath("//a[normalize-space()='View Product']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();
		driver.findElement(By.xpath("//u[normalize-space()='View Cart']")).click();
		driver.findElement(By.cssSelector("a[href='/login']")).click();
		driver.findElement(By.cssSelector("input[data-qa='login-email']")).sendKeys("mdmoees31@gmail.com");
		driver.findElement(By.cssSelector("input[data-qa='login-password']")).sendKeys("Mois25@1996");
		driver.findElement(By.cssSelector("button[data-qa='login-button']")).click();
		driver.findElement(By.cssSelector("a[href='/view_cart']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Premium Polo T-Shirts']")).isDisplayed();
		
		
		
	}
	@AfterTest
	public void browserclose() {

		driver.quit();
	}

}
