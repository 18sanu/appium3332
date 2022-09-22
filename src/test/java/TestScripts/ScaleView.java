package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ScaleView {
	static AndroidDriver driver = null;

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();

		// common capability of android

		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "moto e40");
		cap.setCapability(MobileCapabilityType.UDID, "ZD22242NXY");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
        cap.setCapability(MobileCapabilityType.NO_RESET, "true");
        cap.setCapability(MobileCapabilityType.FULL_RESET, "false");
		// capability of app
		cap.setCapability("appPackage", "com.davemorrissey.labs.subscaleview.sample");
		cap.setCapability("appActivity", ".MainActivity");
	 
	 
		URL url = new URL("http://localhost:4723/wd/hub");
		// for opening the app
		driver = new AndroidDriver(url, cap);
		//driver.tap(1, 633, 1471, 500);
		//driver.tap(1, driver.findElement(By.id("android:id/button1")), 500);
		driver.tap(1, driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures")), 500);
		WebElement img = driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/imageView"));
		driver.zoom(img);
		driver.pinch(img);
	}

}
