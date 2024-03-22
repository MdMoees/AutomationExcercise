package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	
	WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By productName= By.xpath("//td[contains(@class, 'cart_description')]//a");
	private By price= By.xpath("//td[contains(@class, 'cart_price')]/p");
	private By quantity= By.xpath("//td[contains(@class, 'cart_quantity')]/button");
	private By totalPrice= By.xpath("//p[contains(@class, 'cart_total_price')]");
	private By shoppingCart= By.cssSelector("li[class='active']");
	private By proceedToCheckoutButton= By.cssSelector("a[class='btn btn-default check_out']");
	private By registerLoginButton= By.cssSelector("a[href='/login'] u");
	private By xButton1= By.cssSelector("a[data-product-id='1']");
	private By xButton2= By.cssSelector("a[data-product-id='2']");
	private By emptyCartSpan= By.id("id = \"empty_cart");
	private By xButtons= By.cssSelector("a[class='cart_quantity_delete']");
	
	public WebElement productName() {
		return driver.findElement(productName);
	}
	public WebElement price() {
		return driver.findElement(price);
	}
	public WebElement quantity() {
		return driver.findElement(quantity);
	}
	public WebElement totalPrice() {
		return driver.findElement(totalPrice);
	}
    public WebElement shoppingCart() {
    	return driver.findElement(shoppingCart);
    
    }
    public WebElement proceedToCheckoutButton() {
    	return driver.findElement(proceedToCheckoutButton);
    }
    public WebElement registerLoginButton() {
    	return driver.findElement(registerLoginButton);
    }
    public WebElement xButton1() {
    	return driver.findElement(xButton1);
    }
    public WebElement xButton2() {
    	return driver.findElement(xButton2);
   
    }
    public WebElement emptyCartSpan() {
    	return driver.findElement(emptyCartSpan);   
    	
    }
    public WebElement xButtons() {
    	return driver.findElement(xButtons);
    }
}
