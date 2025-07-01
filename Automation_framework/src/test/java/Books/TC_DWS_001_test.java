package Books;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Genricutility.Baseclass;
import Genricutility.Listenerutility;
import objectrepository.Homepage;


@Listeners(Listenerutility.class)
public class TC_DWS_001_test extends Baseclass {
	@Test
	public void clickonbooks() {
		
		
		
	Homepage hp=new Homepage(driver);
	hp.getBookslink().click();
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books","Books page is not displayed");
	
	test.log(Status.PASS,"Books page is displayed");
	
	}
	
	
	
	
		
		
		
	

}
