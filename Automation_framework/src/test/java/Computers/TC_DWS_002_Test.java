package Computers;

import static org.testng.Assert.assertEquals;

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
public class TC_DWS_002_Test extends Baseclass {
	@Test
	public void clickoncomputers() {
		
		
		
	Homepage hp=new Homepage(driver);
	
	webdriverutility wu=new webdriverutility();
	wu.mouseHover(driver,hp.getComputerslink());
	driver.findElement(By.partialLinkText("Desktops")).click();
	

	
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Desktops","Desktops page is not displayed");
	
	test.log(Status.PASS,"Desktops page is displayed");
	
	
	
	}

}
