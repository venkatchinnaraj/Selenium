package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(linkText = "Log out")
	private WebElement logoutlink;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}
	@FindBy(partialLinkText = "APPAREL & SHOES")
	private WebElement ASlink;

	public WebElement getASlink1() {
		return ASlink;
	}

	@FindBy(partialLinkText = "DIGITAL DOWNLOADS")
	private WebElement ddlink;

	public WebElement getDdlink() {
		return ddlink;
	}

	@FindBy(partialLinkText = "GIFT CARDS")
	private WebElement gclink;

	public WebElement getGclink() {
		return gclink;
	}
	@FindBy(partialLinkText = "BOOKS")
	private WebElement bookslink;
	
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computerslink;
	
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement electronicslink;

	public WebElement getBookslink() {
		return bookslink;
	}

	public WebElement getComputerslink() {
		return computerslink;
	}

	public WebElement getElectronicslink() {
		return electronicslink;
	}
	@FindBy(partialLinkText = "JEWELRY")
	private WebElement jewelrylink;

	public WebElement getJewelrylink() {
		return jewelrylink;
	}

	
    
	

	}


	


