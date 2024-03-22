package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSignup {

	WebDriver driver;
	public LoginSignup(WebDriver driver) {
		this.driver=driver;
	}
	
	 private By newusersignup= By.cssSelector("div[class='signup-form'] h2");
	 private By loginToYourAccount= By.cssSelector("div[class='login-form'] h2");
	 private By loginEmailInput= By.cssSelector("input[data-qa='login-email']");
	 private By loginPasswordInput= By.cssSelector("input[data-qa='login-password']");
	 private By loginButton = By.cssSelector("button[data-qa='login-button']");
	 private By errorLogin= By.xpath("/html/body/section/div/div/div[1]/div/form/p");
	 private By signupNameInput= By.cssSelector("input[data-qa='signup-name']");
	 private By signupEmailInput= By.cssSelector("input[data-qa='signup-email']");
	 private By signupButton= By.cssSelector("button[data-qa='signup-button']");
	 private By emailAddressAlreadyExist= By.xpath("//section/div/div/div[3]/div/form/p");
	 
	 public WebElement newusersignup() {
		 return driver.findElement(newusersignup);
	 }

		public WebElement loginToYourAccount() {
		 return driver.findElement(loginToYourAccount);
	 }
	 public WebElement loginEmailInput() {
		 return driver.findElement(loginEmailInput);
	 }
	public WebElement loginPasswordInput() {
		return driver.findElement(loginPasswordInput);	
	}
	public WebElement loginButton() {
		return driver.findElement(loginButton);
	}
	 public WebElement errorLogin() {
		 return driver.findElement(errorLogin);
	 }
	public WebElement signupNameInput() {
		return driver.findElement(signupNameInput);
	}
	public WebElement signupEmailInput() {
		return driver.findElement(signupEmailInput);
	}
	public WebElement signupButton() {
		return driver.findElement(signupButton);
	}
	public WebElement emailAddressAlreadyExist() {
		return driver.findElement(emailAddressAlreadyExist);
	}
}

