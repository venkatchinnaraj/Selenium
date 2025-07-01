package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class welcomepage {

	//declartion  
	@FindBy(linkText = "Register")
	private WebElement registerlink;
	
	//initialization
	public  welcomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//getters

	public WebElement getRegisterlink() {
		return registerlink;
	}
	
	@FindBy(linkText = "Log in")
      private WebElement loginlink;

	public WebElement getLoginlink() {
		return loginlink;
	}
	
	
	
	
}
