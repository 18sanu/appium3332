package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchApp {
	static AndroidDriver driver=null;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
       DesiredCapabilities cap=new DesiredCapabilities();
		
		//common capability of android
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "moto e40");
		cap.setCapability(MobileCapabilityType.UDID,"ZD22242NXY" );
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		
		//capability of app
		cap.setCapability("appPackage","jp.rallwell.siriuth.touchscreentest");
		cap.setCapability("appActivity",".TouchScreenTestActivity");
		 URL url=new URL("http://localhost:4723/wd/hub");  
		 //for opening the app
		driver = new AndroidDriver(url, cap);
		

		//opening general store
		cap.setCapability("appPackage","com.androidsample.generalstore");
		cap.setCapability("appActivity",".SplashActivity");
		//for opening the app
		driver = new AndroidDriver(url, cap);
		
		
		//opening api demo
		cap.setCapability("appPackage","io.appium.android.apis");
		cap.setCapability("appActivity",".ApiDemos");
		//for opening the app
		driver = new AndroidDriver(url, cap);
		
		//Appium server url
		
	 
	  
	 

	}

}
