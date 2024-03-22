package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.EnterAccountInformationPage;
import Pages.HomePage;
import Pages.LoginSignup;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase1 {
	WebDriver driver;
@Test
public void registeruser() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://automationexercise.com/");
	
	HomePage homepage=new HomePage(driver);
	Assert.assertTrue(homepage.home().isDisplayed());
	homepage.signuplogin().click();
	
	LoginSignup login= new LoginSignup(driver);
	Assert.assertTrue(login.newusersignup().isDisplayed());
	login.signupNameInput().sendKeys("Mois");
	login.signupEmailInput().sendKeys("Mois12@gmail.com");
	login.signupButton().click();
	
	EnterAccountInformationPage info=new EnterAccountInformationPage(driver);
	Assert.assertTrue(info.enterAccountInformation().isDisplayed());
	info.titleMrCheckbox().click();
	info.passwordInput().sendKeys("123");
	
	
	
	
	
	
}

}
