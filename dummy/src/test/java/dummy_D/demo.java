package dummy_D;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo {
	@Test
	public void lainch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/login");
		driver.close();
		
	}

}
