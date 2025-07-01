package DigitalDownloads;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Genricutility.Baseclass;
import Genricutility.Listenerutility;
import objectrepository.Homepage;

@Listeners(Listenerutility.class)
public class TC_DWS_005_Test extends Baseclass {
	@Test
	public void clickonDigitalDownloads() {
		
		
		
	Homepage hp=new Homepage(driver);
	hp.getDdlink().click();
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Digital downloads","DigitalDownloads page is not displayed");
	
	test.log(Status.PASS,"DigitalDownloads page is displayed");
	
	}

}
