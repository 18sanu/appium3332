package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Swipe {
	static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
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
				//getting height
				int h=driver.manage().window().getSize().getHeight();
				//getting width
				int w=driver.manage().window().getSize().getWidth();
				System.out.println(h+" "+w);
				//for swiping
				driver.swipe(0,h/2+74,w,h/2+74, 500);
				driver.swipe(0,h/4+74,w,h/4+74, 500);
				driver.swipe(0,(h/2+74)+h/4,w,(h/2+74)+h/4, 500);
				driver.swipe(w/2, 100, w/2, h, 3000);
				driver.swipe(w/4, 100, w/4, h, 3000);
				driver.swipe(w/2+w/4, 100, w/2+w/4, h, 2000);
				
				//for swiping horizontally
				//driver.swipe(3, 733, 3+width/2, 733, width);

	}

}
