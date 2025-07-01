package Genricutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objectrepository.Homepage;
import objectrepository.loginpage;
import objectrepository.welcomepage;

public class Baseclass {
	public static WebDriver driver;
	public static  ExtentReports ereport;
	public static ExtentTest test;
	
public	javautility juti=new javautility();
public	webdriverutility wutil=new webdriverutility();
public	Fileutility futil=new Fileutility();
	
	
	@BeforeSuite
	public void reportcongi() {
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_report/ExtentReport_"+juti.getSystemTime()+".html");
		ereport=new ExtentReports();
		ereport.attachReporter(spark);
	}
	@BeforeClass
	public void openbrowser() throws IOException {
		driver=new ChromeDriver();
		wutil.maximize(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(futil.getDataFromProperty("url"));
		}
	
	@BeforeMethod
	public void login() throws IOException {
		welcomepage wp =new welcomepage(driver);
		wp.getLoginlink().click();
		
		loginpage lp=new loginpage(driver);
		lp.getEmailtextfield().sendKeys(futil.getDataFromProperty("email"));
		lp.getPasswordtextfield().sendKeys(futil.getDataFromProperty("password"));
		lp.getLoginbtn().click();
		
	}
	
	@AfterMethod
		public void logout() {
			Homepage hp=new Homepage(driver);
			hp.getLogoutlink().click();
		}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
	@AfterSuite
	public void reportbackup() {
		ereport.flush();
	}

}
