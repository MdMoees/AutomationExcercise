package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountCreatedPaage {
	WebDriver driver;
	public AccountCreatedPaage(WebDriver driver) {
		this.driver=driver;
	}

	private By accountcreated = By.cssSelector("h2[data-qa='account-created']");
	private By continueButton = By.cssSelector("a[data-qa='continue-button']");

	public WebElement accountcreated() {
		return driver.findElement(accountcreated);

	}

	public WebElement continueButton() {
		return driver.findElement(continueButton);

	}
}
