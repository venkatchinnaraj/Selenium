package jewelry;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Genricutility.Baseclass;
import Genricutility.Listenerutility;
import objectrepository.Homepage;

@Listeners(Listenerutility.class)
public class TC_DWS_006_Test extends Baseclass {
	@Test
	public void clickonjewelery() {
		
		
	Homepage hp=new Homepage(driver);
	hp.getJewelrylink().click();
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Jewelry","jewelery page is not displayed");
	
	test.log(Status.PASS,"jewelery page is displayed");
	
	}
}
