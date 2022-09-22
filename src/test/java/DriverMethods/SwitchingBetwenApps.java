package DriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SwitchingBetwenApps {
	static AndroidDriver driver=null;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		 URL url=new URL("http://localhost:4723/wd/hub");  
		DesiredCapabilities cap=new DesiredCapabilities();
	
			//common capability of android
			
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "moto e40");
			cap.setCapability(MobileCapabilityType.UDID,"ZD22242NXY" );
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
			driver = new AndroidDriver(url, cap);
			
			  //opening general store
			driver.startActivity("com.androidsample.generalstore",".SplashActivity");
			Thread.sleep(5000);
			
			//opening api demo
			driver.startActivity("io.appium.android.apis",".ApiDemos");
			//Thread.sleep(5000);
		    
	
			
			
		

	}

}
