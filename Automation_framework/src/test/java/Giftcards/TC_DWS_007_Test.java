package Giftcards;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Genricutility.Baseclass;
import Genricutility.Listenerutility;
import objectrepository.Homepage;

@Listeners(Listenerutility.class)
public class TC_DWS_007_Test extends Baseclass {
	@Test
	public void clickonGiftcard() {
		
		
	Homepage hp=new Homepage(driver);
	hp.getGclink().click();
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Gift Cards","Giftcard page is not displayed");
	
	test.log(Status.PASS,"Giftcard  page is displayed");
	
	}

}
