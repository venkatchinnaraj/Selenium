package Electronics;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Genricutility.Baseclass;
import Genricutility.Listenerutility;
import Genricutility.webdriverutility;
import objectrepository.Homepage;

@Listeners(Listenerutility.class)
public class TC_DWS_003_Test extends Baseclass {
	@Test
	public void clickonelectronics() {
		
		
		
	Homepage hp=new Homepage(driver);
	
	webdriverutility wu=new webdriverutility();
	wu.mouseHover(driver,hp.getElectronicslink());
	driver.findElement(By.partialLinkText("Cell phones ")).click();
	

	
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Cell phones","Cell phones page is not displayed");
	
	test.log(Status.PASS,"Cell phones page is displayed");
	
	
	
	
		
	}
	
	
		
		
		
		
	}


