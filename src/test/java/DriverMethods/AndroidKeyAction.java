package DriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AndroidKeyAction {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		//starting the server
		AppiumDriverLocalService server=AppiumDriverLocalService.buildDefaultService();
		server.start();
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "moto e40");
		cap.setCapability(MobileCapabilityType.UDID, "ZD22242NXY");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		
	        
	        URL url = new URL("http://localhost:4723/wd/hub");
	        AndroidDriver driver =new AndroidDriver (url,cap);
	        
	        System.out.println(AndroidKeyCode.KEYCODE_VOLUME_UP);
	        System.out.println(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
	        System.out.println(AndroidKeyCode.KEYCODE_VOLUME_MUTE);
	        System.out.println(AndroidKeyCode.BACK);
	        System.out.println(AndroidKeyCode.ENTER);
	        System.out.println(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
	        System.out.println(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
	        System.out.println(AndroidKeyCode.KEYCODE_CAMERA);
	        Thread.sleep(2000);
	        driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
	     
	        	driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);	
	        
	        
	        server.stop();

	}

}
