package venkat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo {
	@Test
	public void launch() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}

}
