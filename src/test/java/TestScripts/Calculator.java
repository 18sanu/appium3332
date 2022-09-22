package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		
		//common capability of android
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "moto e40");
		cap.setCapability(MobileCapabilityType.UDID,"ZD22242NXY" );
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		
		//capability of app
		cap.setCapability("appPackage","com.google.android.calculator");
		cap.setCapability("appActivity","com.android.calculator2.Calculator");
		
		//Appium server url
		
	  URL url=new URL("http://localhost:4723/wd/hub");
	  
	  AndroidDriver driver = new AndroidDriver(url, cap);
	  
	  WebElement five = driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
	  five.click();
	  WebElement plus = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
	  plus.click();
	  WebElement eight = driver.findElement(By.id("com.google.android.calculator:id/digit_8"));
	  eight.click();
	  WebElement equals = driver.findElement(By.id("com.google.android.calculator:id/eq"));
	  equals.click();
	  WebElement resultScreen = driver.findElement(By.id("com.google.android.calculator:id/result_final"));
	  String result = resultScreen.getText();
	  System.out.println(result);
	  
	  
	  
	}

}
