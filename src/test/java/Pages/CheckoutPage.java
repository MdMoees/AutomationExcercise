package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
	WebDriver driver;
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
	}

	private By addressDelivery = By.xpath("//ul[contains(@id, 'address_delivery')]//li");
	private By addressInvoice = By.xpath("//ul[contains(@id, 'address_invoice')]//li");
	private By totalAmount = By.xpath("//section/div/div[5]/table/tbody/tr[3]/td[4]/p");
	private By comment = By.cssSelector("textarea[name='message']");
	private By placeOrderButton = By.cssSelector("a[href='/payment']");

	public WebElement addressDelivery() {
		return driver.findElement(addressDelivery);
	}

	public WebElement addressInvoice() {
		return driver.findElement(addressInvoice);
	}

	public WebElement totalAmount() {
		return driver.findElement(totalAmount);

	}

	public WebElement comment() {
		return driver.findElement(comment);
	}

	public WebElement placeOrderButton() {
		return driver.findElement(placeOrderButton);
	}
}
