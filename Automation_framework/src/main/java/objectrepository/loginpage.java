package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	@FindBy(linkText = "Log in")
	private WebElement loginlink;

	public loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLoginlink() {
		return loginlink;
	}

	@FindBy(id = "Email")
	private WebElement Emailtextfield;

	public WebElement getEmailtextfield() {
		return Emailtextfield;
	}

	@FindBy(id = "Password")
	private WebElement passwordtextfield;

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	@FindBy(xpath = "(//input[@type=\"submit\"])[2]")
	private WebElement loginbtn;

	public WebElement getLoginbtn() {
		return loginbtn;
	}

}
