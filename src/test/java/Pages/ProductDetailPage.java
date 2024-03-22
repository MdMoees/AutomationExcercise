package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailPage {
 WebDriver driver;
	public ProductDetailPage(WebDriver driver) {
		this.driver=driver;
	}
 
private By productName= By.cssSelector("div[class='product-information'] h2");
private By productCategory= By.xpath("//section/div/div/div[2]/div[2]/div[2]/div/p[1]");
private By productPrice= By.cssSelector("div[class='product-information'] span span");
private By productAvailability= By.xpath("//section/div/div/div[2]/div[2]/div[2]/div/p[2]");
private By productCondition= By.xpath("//section/div/div/div[2]/div[2]/div[2]/div/p[3]");
private By productBrand= By.xpath("//section/div/div/div[2]/div[2]/div[2]/div/p[4]");
private By quantityInput= By.id("quantity");
private By addToCartButton= By.cssSelector("button[class='btn btn-default cart']");
private By viewCartButton= By.cssSelector("a[href='/view_cart'] u");
private By writeYourReview= By.cssSelector("a[href='#reviews']");
private By yourNameInput= By.id("name");
private By emailAddress= By.id("email");
private By addReviewHere= By.id("review");
private By submitButton= By.id("button-review");
private By successMessage= By.cssSelector("div[class='alert-success alert'] span");

public WebElement productName() {
	return driver.findElement(productName);
}
public WebElement productCategory() {
	return driver.findElement(productCategory);
}
public WebElement productPrice() {
	return driver.findElement(productPrice);
}
public WebElement productAvailability() {
	return driver.findElement(productAvailability);
}
public WebElement productCondition() {
	return driver.findElement(productCondition);
}
public WebElement productBrand() {
	return driver.findElement(productBrand);
}
public WebElement quantityInput() {
	return driver.findElement(quantityInput);
}
public WebElement addToCartButton() {
	return driver.findElement(addToCartButton);
}
public WebElement viewCartButton() {
	return driver.findElement(viewCartButton);
}
public WebElement writeYourReview() {
	return driver.findElement(writeYourReview);
}
public WebElement yourNameInput() {
	return driver.findElement(yourNameInput);
}
public WebElement emailAddress() {
	return driver.findElement(emailAddress);
}
public WebElement addReviewHere() {
	return driver.findElement(addReviewHere);
}
public WebElement submitButton() {
	return driver.findElement(submitButton);
}
public WebElement successMessage() {
	return driver.findElement(successMessage);
}
 
 
}
