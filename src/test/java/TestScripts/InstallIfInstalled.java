package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallIfInstalled {
	static AndroidDriver driver=null;
	public static void main(String[] args) throws MalformedURLException {
DesiredCapabilities cap=new DesiredCapabilities();
		
		//common capability of android
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "moto e40");
		cap.setCapability(MobileCapabilityType.UDID,"ZD22242NXY" );
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		 URL url=new URL("http://localhost:4723/wd/hub");  
		driver=new AndroidDriver(url,cap);
		
		if(driver.isAppInstalled("io.appium.android.apis")) {
			System.out.println(driver.isAppInstalled("io.appium.android.apis"));
			driver.removeApp("io.appium.android.apis");
		
		}
		driver.installApp("C:\\Users\\n\\Downloads\\ApiDemos-debug.apk");
		driver.launchApp();
	}

}
