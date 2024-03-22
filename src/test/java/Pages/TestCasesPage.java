package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCasesPage {
 WebDriver driver;
 public TestCasesPage(WebDriver driver) {
		this.driver=driver;
	}
 
private By testCases= By.cssSelector("h2[class='title text-center'] b");

public WebElement testCases() {
	return driver.findElement(testCases);
}
 
}
