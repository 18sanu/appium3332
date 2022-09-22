package DriverMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;
import io.appium.java_client.remote.MobileCapabilityType;

public class NetworkConnection {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();

		// common capability of android

		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "moto e40");
		cap.setCapability(MobileCapabilityType.UDID, "ZD22242NXY");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
         
		  URL url = new URL("http://localhost:4723/wd/hub");
	        
	        
	        AndroidDriver driver =new AndroidDriver (url,cap);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        Connection currentstate = driver.getConnection();
	    // System.out.println(currentstate);
	      //driver.setConnection(Connection.WIFI);
	       //System.out.println(driver.getConnection());
	      //driver.setConnection(Connection.DATA);
	       //System.out.println(driver.getConnection());
	     driver.setConnection(Connection.AIRPLANE);
	     //System.out.println(driver.getConnection());
	       

	}

}
