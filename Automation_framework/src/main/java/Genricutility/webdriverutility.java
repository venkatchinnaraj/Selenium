package Genricutility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class webdriverutility {
	/**
	 * This method is used to maxmize the window
	 * 
	 * @param driver
	 */
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();

	}

	/**
	 * This method is used to mouseHover in webpage
	 * 
	 * @param driver
	 * @param element
	 */
	public void mouseHover(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	/**
	 * This method is used to rightclick on webelement
	 * 
	 * @param driver
	 * @param element
	 */
	public void rigthClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).perform();

	}

	/**
	 * This method is used to clickandhold in webpage on webelement
	 * 
	 * @param driver
	 * @param element
	 */
	public void ClickandHold(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.clickAndHold(element).perform();
	}

	/**
	 * This method is used to dragandDrop in webpage of webelement
	 * 
	 * @param driver
	 * @param element
	 */
	public void DragandDrop(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.dragAndDrop(element, element).perform();
	}

	/**
	 * This method is used to select the option in dropdown based on index
	 * 
	 * @param element
	 * @param index
	 */

	public void SelectByIndex(WebElement element, int index) {
		Select sc = new Select(element);
		sc.selectByIndex(index);

	}

	/**
	 * This method is used to select the option in dropdown based on value
	 * 
	 * @param element
	 * @param value
	 */
	public void SelectByValue(WebElement element, String value) {
		Select sc = new Select(element);
		sc.selectByValue(value);

	}

	/**
	 * This method is used to select the option in dropdown based on visible text
	 * 
	 * @param element
	 * @param value
	 */
	public void SelectByvisibletext(WebElement element, String value) {
		Select sc = new Select(element);
		sc.selectByVisibleText(value);

	}

	public List<String> getalloptions(WebElement element) {
		Select sc = new Select(element);
		List<WebElement> alloptions = sc.getOptions();
		List<String> option = new ArrayList<>();
		for (WebElement opt : alloptions) {
			option.add(opt.getText());

		}
		return option;
	}

//second type
	public String[] getAlloptions(WebElement element) {
		Select sc = new Select(element);
		List<WebElement> alloptions = sc.getOptions();
		String[] options = new String[alloptions.size()];
		for (int i = 0; i < alloptions.size(); i++) {
			options[1] = alloptions.get(i).getText();

		}
		return options;
	}

	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	public void switchToFrame(WebDriver driver, String nameorid) {
		driver.switchTo().frame(nameorid);
	}

	public void switchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	public void switchToDefaultcontent(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	public void switchToParentFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}

	public Alert switchtoAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}

	/**
	 * This method is used to Switch to Window
	 * 
	 * @param driver
	 * @param acturl
	 */
	public void switchToMethod(WebDriver driver, String expurl) {
		Set<String> allids = driver.getWindowHandles();
		for (String id : allids) {
			driver.switchTo().window(id);
			String acturl = driver.getCurrentUrl();
			if (acturl.contains(expurl))
				;
			break;
		}
	}
	
	public void getPhotos(WebDriver driver) throws IOException {
		javautility jutil=new javautility();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot"+jutil.getSystemTime()+".png");
		FileHandler.copy(temp, dest);
		
	}
	public void jsScrollto(WebDriver driver,int x,int y ) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo("+x+","+y+")");
	}
}
