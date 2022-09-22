package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Time {
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();

		// common capability of android

		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "moto e40");
		cap.setCapability(MobileCapabilityType.UDID, "ZD22242NXY");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
        //launch browser
	
		
		cap.setCapability("browserName", "Chrome");
		//Appium server port no.
		 URL url = new URL("http://localhost:4723/wd/hub");
		 AndroidDriver driver =new AndroidDriver (url,cap);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.get("https://time.com");
	        driver.findElement(By.xpath("//img[@id='close_icon']")).click();
	        driver.findElement(By.xpath("//img[@id='close_icon_fw']")).click();
	        driver.findElement(By.xpath("//div[@class='menu-btn-box']")).click();
	        driver.findElement(By.xpath("//button[@class='signin-button visible']")).click();
	        driver.findElement(By.xpath("//button[@id='sign-up-google']")).click();
	        
	        
	}
	

}
