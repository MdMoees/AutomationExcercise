package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterAccountInformationPage {
	WebDriver driver;
	public EnterAccountInformationPage(WebDriver driver) {
		this.driver=driver;
	}


	private By enterAccountInformation = By.xpath("//b[contains(.,'Enter Account Information')]");
	private By titleMrCheckbox = By.id("id_gender1");
	private By passwordInput = By.id("password");
	private By daysSelect = By.id("days");
	private By monthsSelect = By.id("months");
	private By yearsSelect = By.id("years");
	private By newsletterCheckbox = By.id("newsletter");
	private By specialOffersCheckbox = By.id("optin");
	private By firstNameInput = By.id("first_name");
	private By lastNameInput = By.id("last_name");
	private By companyInput = By.id("company");
	private By address1Input = By.id("address1");
	private By address2Input = By.id("address2");
	private By countrySelect = By.id("country");
	private By stateInput = By.id("state");
	private By cityInput = By.id("city");
	private By zipcodeInput = By.id("zipcode");
	private By mobileNumberInput = By.id("mobile_number");
	private By createAccountButton = By.cssSelector("button[data-qa='create-account']");
	
	
	public WebElement enterAccountInformation() {
		return driver.findElement(enterAccountInformation);
	}
	public WebElement titleMrCheckbox() {
		return driver.findElement(titleMrCheckbox);
	}
	public WebElement passwordInput () {
		return driver.findElement(passwordInput );
	}
	public WebElement daysSelect() {
		return driver.findElement(daysSelect);
	}
	public WebElement monthsSelect () {
		return driver.findElement(monthsSelect );
	}
	public WebElement yearsSelect () {
		return driver.findElement(yearsSelect );
	}
	public WebElement newsletterCheckbox () {
		return driver.findElement(newsletterCheckbox );
	
	}
	public WebElement specialOffersCheckbox() {
		return driver.findElement(specialOffersCheckbox);
	}
	public WebElement firstNameInput() {
		return driver.findElement(firstNameInput);
	}
	public WebElement lastNameInput () {
		return driver.findElement(lastNameInput );
	}
	public WebElement companyInput () {
		return driver.findElement(companyInput );
	}
	public WebElement address1Input() {
		return driver.findElement(address1Input);
	}
	public WebElement address2Input() {
		return driver.findElement(address2Input);
		
	}
	public WebElement countrySelect() {
		return driver.findElement(countrySelect);
	}
	public WebElement stateInput() {
		return driver.findElement(stateInput);
	}
	public WebElement cityInput() {
		return driver.findElement(cityInput);
	}
	public WebElement zipcodeInput() {
		return driver.findElement(zipcodeInput);
	}
	public WebElement mobileNumberInput() {
		return driver.findElement(mobileNumberInput);
	}
	public WebElement createAccountButton() {
		return driver.findElement(createAccountButton);
	}
	

}
