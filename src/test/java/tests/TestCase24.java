package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase24 {
	WebDriver driver;
	@BeforeTest
	public void browserinitilization() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
	}
	@Test
	public void downloadinvoice() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.cssSelector("a[href='/product_details/1']")).click();
		driver.findElement(By.cssSelector("button[class='btn btn-default cart']")).click();
		driver.findElement(By.xpath("//u[normalize-space()='View Cart']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Proceed To Checkout']")).click();
		driver.findElement(By.xpath("//u[normalize-space()='Register / Login']")).click();
		driver.findElement(By.cssSelector("input[data-qa='signup-name']")).sendKeys("Mohammad Moees");
		driver.findElement(By.cssSelector("input[data-qa='signup-email']")).sendKeys("moees@gmail.com");
		driver.findElement(By.cssSelector("button[data-qa='signup-button']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//b[contains(.,'Enter Account Information')]")).isDisplayed());
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("password")).sendKeys("1234");
		WebElement days = driver.findElement(By.id("days"));
		Select day= new Select(days);
		day.selectByVisibleText("15");
		WebElement months = driver.findElement(By.id("months"));
		Select month= new Select(months);
		month.selectByVisibleText("May");
		WebElement years = driver.findElement(By.id("years"));
		Select year=new Select(years);
		year.selectByVisibleText("1997");
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		driver.findElement(By.id("first_name")).sendKeys("Mohammad");
		driver.findElement(By.id("last_name")).sendKeys("Moees");
		driver.findElement(By.id("company")).sendKeys("Hyderabad");
		driver.findElement(By.id("address1")).sendKeys("Raheja Mindspace");
		driver.findElement(By.id("address2")).sendKeys("hitech city");
		driver.findElement(By.id("state")).sendKeys("Telangana");
		driver.findElement(By.id("city")).sendKeys("Hyderabad");
		driver.findElement(By.id("zipcode")).sendKeys("518005");
		driver.findElement(By.cssSelector("button[data-qa='create-account']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("h2[data-qa='account-created']")).isDisplayed());
		driver.findElement(By.cssSelector("a[data-qa='continue-button']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[10]/a/b")).isDisplayed());
		driver.findElement(By.cssSelector("a[href='/view_cart']")).click();
		driver.findElement(By.cssSelector("a[class='btn btn-default check_out']")).click();
		driver.findElement(By.xpath("//h2[normalize-space()='Address Details']")).isDisplayed();
		driver.findElement(By.xpath("//h2[normalize-space()='Review Your Order']")).isDisplayed();
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys("placing my order");
		driver.findElement(By.cssSelector("a[href='/payment']")).click();
		driver.findElement(By.cssSelector("input[data-qa='name-on-card']")).sendKeys("Mohammad Moees");
		driver.findElement(By.cssSelector("input[data-qa='card-number']")).sendKeys("123432144569");
		driver.findElement(By.cssSelector("input[data-qa='cvc']")).sendKeys("555");
		driver.findElement(By.cssSelector("input[data-qa='expiry-month']")).sendKeys("12");
		driver.findElement(By.cssSelector("input[data-qa='expiry-year']")).sendKeys("2024");
		driver.findElement(By.cssSelector("button[data-qa='pay-button']")).click();
		driver.findElement(By.cssSelector("div[class='col-sm-9 col-sm-offset-1'] p")).isDisplayed();
		driver.findElement(By.xpath("//header/div/div/div/div[2]/div/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Download Invoice']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Continue']")).click();
		driver.findElement(By.cssSelector("h2[data-qa='account-deleted']")).isDisplayed();
		driver.findElement(By.cssSelector("a[data-qa='continue-button']")).click();
		
		
		

	}
	@AfterTest
	public void browserclose() {

		driver.quit();
	}


}
