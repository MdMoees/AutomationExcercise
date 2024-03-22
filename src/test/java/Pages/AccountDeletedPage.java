package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountDeletedPage {
	WebDriver driver;
	public AccountDeletedPage(WebDriver driver) {
		this.driver=driver;
	}

	private By accountDeleted = By.cssSelector("h2[data-qa='account-deleted']");
	private By continueButton = By.cssSelector("a[data-qa='continue-button']");
	
	public WebElement accountDeleted() {
		return driver.findElement(accountDeleted);
	}
    public WebElement continueButton() {
    	return driver.findElement(continueButton);
    }
}
