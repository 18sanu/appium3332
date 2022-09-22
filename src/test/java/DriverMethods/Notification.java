package DriverMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Notification {
	static AndroidDriver driver=null;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
DesiredCapabilities cap=new DesiredCapabilities();

		
		//common capability of android
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "moto e40");
		cap.setCapability(MobileCapabilityType.UDID,"ZD22242NXY" );
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap.setCapability(MobileCapabilityType.FULL_RESET, false);
		
	
		cap.setCapability("appPackage","io.appium.android.apis");
		cap.setCapability("appActivity",".ApiDemos");
		 URL url=new URL("http://localhost:4723/wd/hub");
		//for opening the app
		driver = new AndroidDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement app = driver.findElementByAccessibilityId("App");
		driver.tap(1, app, 500);
		
		WebElement notification = driver.findElementByAccessibilityId("Notification");
		driver.tap(1, notification, 500);
		
		WebElement incomingMessage = driver.findElementByAccessibilityId("IncomingMessage");
		driver.tap(1, incomingMessage, 500);
		
		WebElement showAppNotification = driver.findElementByAccessibilityId("Show App Notification");
		driver.tap(1, showAppNotification, 500);
		
		Thread.sleep(2000);
		
		driver.openNotifications();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Joe']")).click();
		
		
		
		
		
		
		
		

	}

}
