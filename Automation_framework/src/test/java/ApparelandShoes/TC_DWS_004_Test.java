package ApparelandShoes;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Genricutility.Baseclass;
import objectrepository.Homepage;

public class TC_DWS_004_Test extends Baseclass {
	@Test
	public void clickonApparelandShoes() {
		ExtentTest test = ereport.createTest("clickonApparelandShoes");
		test.log(Status.INFO,"Login is completed");
		
		
	Homepage hp=new Homepage(driver);
	hp.getASlink1().click();
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Apparel & Shoes","Apparel and Shoes page is not displayed");
	
	test.log(Status.PASS,"Apparel and Shoes page is displayed");
	
	}

}
