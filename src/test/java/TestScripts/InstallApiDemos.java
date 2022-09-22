package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallApiDemos {
	static AndroidDriver driver=null;

	public static void main(String[] args) throws MalformedURLException {
DesiredCapabilities cap=new DesiredCapabilities();
		
		//common capability of android
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "moto e40");
		cap.setCapability(MobileCapabilityType.UDID,"ZD22242NXY" );
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		
		//capability of app
		cap.setCapability("app","C:\\Users\\n\\Downloads\\ApiDemos-debug.apk");
		
		
		 URL url=new URL("http://localhost:4723/wd/hub");  
		 //for opening the app
		driver = new AndroidDriver(url, cap);
		
		
		

	}

}
