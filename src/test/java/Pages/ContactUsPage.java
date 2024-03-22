package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage {
  WebDriver driver;
	public ContactUsPage(WebDriver driver) {
		this.driver=driver;
	}
  
  private By getInTouch= By.cssSelector("h2.title:nth-child(2)");
  private By nameInput= By.name("name");
  private By emailInput= By.name("email");
  private By subjectInput= By.name("subject");
  private By messageInput= By.id("message");
  private By uploadFileInput= By.name("upload_file");
  private By submitButton= By.name("submit");
  private By alertSuccess= By.cssSelector(".status.alert.alert-success");
  private By homePageButton= By.xpath("//a[@class='btn btn-success']");
  
  public WebElement getInTouch() {
	  return driver.findElement(getInTouch);
  }
  public WebElement nameInput() {
	  return driver.findElement(nameInput);
  }
  public WebElement emailInput() {
	  return driver.findElement(emailInput);
  }
  public WebElement subjectInput() {
	  return driver.findElement(subjectInput);
  }
  public WebElement messageInput() {
	  return driver.findElement(messageInput);
  }
  public WebElement uploadFileInput() {
	  return driver.findElement(uploadFileInput);
  }
  public WebElement submitButton() {
	  return driver.findElement(submitButton);
  }
  public WebElement alertSuccess() {
	  return driver.findElement(alertSuccess);
  }
  public WebElement homePageButton() {
	  return driver.findElement(homePageButton);
  }
  
}
