package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By home=By.xpath("//i[@class='fa fa-home']");
	private By signuplogin= By.xpath("//a[normalize-space()='Signup / Login']");
	private By productbutton= By.xpath("//a[@href='/products']");
	private By cartbutton= By.xpath("//a[normalize-space()='Cart']//i[@class='fa fa-shopping-cart']");
	private By contactusbutton= By.cssSelector("a[href='/contact_us']");
	private By testcasebutton=By.cssSelector("a[href='/test_cases']");
	private By viewproductbutton= By.cssSelector("a[href='/product_details/1']");
	private By categories= By.id("accordian");
	private By womencategory= By.xpath("[@id='accordian']/div[1]/div[1]/h4/a/span/i");
	private By dresscategory= By.cssSelector("a[href='/category_products/1']");
	private By recommendeditems= By.cssSelector("div[class='recommended_items'] h2");
	private By blueTopAddToCartButton= By.cssSelector("div[id='recommended-item-carousel'] a[class='btn btn-default add-to-cart']");
	private By viewcartbutton= By.cssSelector("div[class='modal-content'] a[href='/view_cart']");
	private By scrollupbutton= By.id("scrollUp");
	private By subscription= By.cssSelector("div[class='single-widget'] h2");
	private By subscribeemail= By.id("susbscribe_email");
	private By subscribebutton= By.id("subscribe");
	private By alertsuccesssubscribe= By.id("success-subscribe");
	
	public WebElement home() {
		return driver.findElement(home);
	}
	
	public WebElement signuplogin() {
		return driver.findElement(signuplogin);
		
	}
	public WebElement productbutton() {
		return driver.findElement(productbutton);
	}
	public WebElement cartbutton() {
		return driver.findElement(cartbutton);
	}
	public WebElement contactusbutton() {
		return driver.findElement(contactusbutton);
	}
	public WebElement testcasebutton() {
		return driver.findElement(testcasebutton);
	}
	public WebElement viewproductbutton() {
		return driver.findElement(viewproductbutton);
	}
	public WebElement categories() {
		return driver.findElement(categories);
	}
	public WebElement womencategory() {
		return driver.findElement(womencategory);
	}
	public WebElement dresscategory() {
		return driver.findElement(dresscategory);
	}
	public WebElement recommendeditems() {
		return driver.findElement(recommendeditems);
	}
	public WebElement blueTopAddToCartButton() {
		return driver.findElement(blueTopAddToCartButton);
		
	}
	public WebElement viewcartbutton() {
		return driver.findElement(viewcartbutton);
	}
	public WebElement scrollupbutton() {
		return driver.findElement(scrollupbutton);
	}
	public WebElement subscription() {
		return driver.findElement(subscription);
	}
	public WebElement subscribeemail() {
		return driver.findElement(subscribeemail);
	}
	public WebElement subscribebutton() {
		return driver.findElement(subscribebutton);
		
	}
	public WebElement alertsuccesssubscribe() {
		return driver.findElement(alertsuccesssubscribe);
	}
	
	
	
	
	
	

}
