package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
 WebDriver driver;
	public ProductsPage(WebDriver driver) {
		this.driver=driver;
	}
 
private By titleTextCenter= By.cssSelector(".title.text-center");
private By viewProductOfFirstProductButton= By.cssSelector("a[href='/product_details/1']");
private By searchProductInput= By.id("search_product");
private By submitSearchInput= By.id("submit_search");
private By searchResultsNames= By.xpath("//div[contains(@class, 'productinfo text-center')]//p");
private By addToCartButton1= By.cssSelector("a[data-product-id='1']");
private By addToCartButton2= By.cssSelector("a[data-product-id='2']");
private By continueShoppingButton= By.cssSelector("button[data-dismiss='modal']");
private By viewCartButton= By.cssSelector("a[href='/view_cart'] u");
private By menCategory= By.cssSelector("a[href='#Men']");
private By tShirtsCategory= By.cssSelector("a[href='/category_products/3']");
private By brands= By.cssSelector("div[class='brands-name']");
private By  poloBrand= By.cssSelector("a[href='/brand_products/Polo']");
private By madameBrand= By.cssSelector("a[href='/brand_products/Madame']");
private By addButtons= By.cssSelector("a[class='btn btn-default add-to-cart']");

public WebElement titleTextCenter() {
	return driver.findElement(titleTextCenter);
}
public WebElement viewProductOfFirstProductButton() {
	return driver.findElement(viewProductOfFirstProductButton);
}
public WebElement searchProductInput() {
	return driver.findElement(searchProductInput);
}
public WebElement submitSearchInput() {
	return driver.findElement(submitSearchInput);
}
public WebElement searchResultsNames() {
	return driver.findElement(searchResultsNames);
}
public WebElement addToCartButton1() {
	return driver.findElement(addToCartButton1);
}
public WebElement addToCartButton2() {
	return driver.findElement(addToCartButton2);
}
public WebElement continueShoppingButton() {
	return driver.findElement(continueShoppingButton);
}
public WebElement viewCartButton() {
	return driver.findElement(viewCartButton);
}
public WebElement menCategory() {
	return driver.findElement(menCategory);
}
public WebElement tShirtsCategory() {
	return driver.findElement(tShirtsCategory);
}
public WebElement brands() {
	return driver.findElement(brands);
}
public WebElement poloBrand() {
	return driver.findElement(poloBrand);
}
public WebElement madameBrand() {
	return driver.findElement(madameBrand);
}
public WebElement addButtons() {
	return driver.findElement(addButtons);
}

}
