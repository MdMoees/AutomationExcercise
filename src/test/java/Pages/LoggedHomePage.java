package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoggedHomePage {
 WebDriver driver;
 public LoggedHomePage(WebDriver driver) {
		this.driver=driver;
	}
 
 By username= By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[10]/a/b");
 By deleteAccountButton= By.xpath("//header/div/div/div/div[2]/div/ul/li[5]/a");
 By logoutButton= By.xpath("//header/div/div/div/div[2]/div/ul/li[4]/a");
 
 public WebElement username() {
	 return driver.findElement(username);
	 
 }
 public WebElement deleteAccountButton() {
	 return driver.findElement(deleteAccountButton);
 }
 public WebElement logoutButton() {
	 return driver.findElement(logoutButton);
 }
}
