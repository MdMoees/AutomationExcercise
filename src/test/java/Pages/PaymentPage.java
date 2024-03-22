package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage {
 WebDriver  driver;
 public PaymentPage(WebDriver driver) {
		this.driver=driver;
	}
 
private By nameOnCardInput= By.cssSelector("input[data-qa='name-on-card']");
private By cardNumberInput= By.cssSelector("input[data-qa='card-number']");
private By cvcInput= By.cssSelector("input[data-qa='cvc']");
private By expirationMonthInput= By.cssSelector("input[data-qa='expiry-month']");
private By expirationYearInput= By.cssSelector("input[data-qa='expiry-year']");
private By payAndConfirmOrderButton= By.cssSelector("button[data-qa='pay-button']");
private By alertSuccess= By.xpath("//div[contains(@id, 'success_message')]/div");
private By successMessage= By.cssSelector("div[class='col-sm-9 col-sm-offset-1'] p");
private By downloadInvoiceButton=By.cssSelector("a[class='btn btn-default check_out']");
private By continueButton= By.cssSelector("a[data-qa='continue-button']");

public WebElement nameOnCardInput() {
	return driver.findElement(nameOnCardInput);
}
public WebElement cardNumberInput() {
	return driver.findElement(cardNumberInput);
}
public WebElement cvcInput() {
	return driver.findElement(cvcInput);
}
public WebElement expirationMonthInput() {
	return driver.findElement(expirationMonthInput);
}
public WebElement expirationYearInput() {
	return driver.findElement(expirationYearInput);
}
public WebElement payAndConfirmOrderButton() {
	return driver.findElement(payAndConfirmOrderButton);
}
public WebElement alertSuccess() {
	return driver.findElement(alertSuccess);
}
public WebElement successMessage() {
	return driver.findElement(successMessage);
}
public WebElement downloadInvoiceButton() {
	return driver.findElement(downloadInvoiceButton);
}
public WebElement continueButton() {
	return driver.findElement(continueButton);
}
 
}
