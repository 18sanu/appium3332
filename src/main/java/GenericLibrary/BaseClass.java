 package GenericLibrary;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseClass {
	AppiumDriverLocalService service;
	public AndroidDriver driver;
	public static AndroidDriver sdriver;
	
	
	@BeforeSuite
	public void startDataBaseConnection() {
		System.out.println("making data base connection");
	}
	@AfterSuite
	public void stopDataBaseConnection() {
		System.out.println("stoping data base connection");
	}
	@BeforeTest
	public void parallelExecution() {
		System.out.println("starting parallel execution");
	}
	@AfterTest
	public void stopParallelExecution() {
		
	}
	@BeforeClass
	public void startServer() {
		// service=AppiumDriverLocalService.buildDefaultService();
		// service.start();
	}
	@AfterClass
	public void stopServer() {
		//service.stop();
	}
	@BeforeMethod
	public void launchApplication() throws IOException {
		FileUtility f = new FileUtility();
		String deviceName=f.getDataFromProperty("deviceName");
		String platformName=f.getDataFromProperty("platformName");
		String udid=f.getDataFromProperty("udid");
		String platformVersion=f.getDataFromProperty("platformVersion");
		
		ExcelUtility excel = new ExcelUtility();
		String appPackage=excel.getDataFromExcel("Sheet1", 1, 1);
		String appActivity=excel.getDataFromExcel("Sheet1", 1, 2);
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		cap.setCapability(MobileCapabilityType.UDID, udid);
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
		cap.setCapability("appPackage", appPackage);
		cap.setCapability("appActivity", appActivity);
		URL url = new URL("http://localhost:4723/wd/hub");
		driver=new AndroidDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		sdriver=driver; 
		//driver.launchApp();
	}
	@AfterMethod
	public void closeApplication() {
		driver.closeApp();
	}
	

}
