package DriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class RunAppInBackground {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "moto e40");
		cap.setCapability(MobileCapabilityType.UDID, "ZD22242NXY");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		
	        
	        URL url = new URL("http://localhost:4723/wd/hub");
	        AndroidDriver driver =new AndroidDriver (url,cap);
	      
	        
	      //opening api demo
			driver.startActivity("io.appium.android.apis",".ApiDemos");
		
		
			ScreenOrientation currentOrientation = driver.getOrientation();
			System.out.println(currentOrientation);
			driver.rotate(ScreenOrientation.LANDSCAPE);
			System.out.println(driver.getOrientation());
			driver.rotate(ScreenOrientation.PORTRAIT);
			System.out.println(driver.getOrientation());
			
            
	}

}
