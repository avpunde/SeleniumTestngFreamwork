package Resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationPageObjects {
	
	private By Firstname = By.xpath("//label[text()='First Name']");
	private By LastName = By.xpath("//label[text()='Last Name']");
	private By EMail = By.xpath("//label[text()='E-Mail']");
	private By Telephone = By.xpath("//label[text()='Telephone']");
	private By Password = By.xpath("//label[text()='Password']");
	private By PasswordConfirm = By.xpath("//label[text()='Password Confirm']");
	private By agree = By.xpath("//input[@name='agree']");
	
private By Continue = By.xpath("//input[@value='Continue']");

public WebElement FirstName() {
		// driver.findElement()by.xpath " ")
		return driver.findElement(Firstname);
	}

	public WebElement LastName() {

		return driver.findElement(LastName);
	}

	public WebElement EMail() {

		return driver.findElement(EMail);
	}

	public WebElement Telephone() {

		return driver.findElement(Telephone);
	}

	public WebElement Password() {

		return driver.findElement(Password);
	}

	public WebElement PasswordConfirm() {

		return driver.findElement(PasswordConfirm);
}

	public WebElement agree() {

		return driver.findElement(agree);
	}

	public WebElement Continue() {

		return driver.findElement(Continue);
	}

}
