package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TapAction {
	static AndroidDriver driver=null;

	public static void main(String[] args) throws MalformedURLException {
	   DesiredCapabilities cap=new DesiredCapabilities();
	   
	   //common  capability of app
	   
	   cap.setCapability(MobileCapabilityType.DEVICE_NAME,"moto e40" );
	   cap.setCapability(MobileCapabilityType.UDID, "ZD22242NXY");
	   cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"android" );
	   cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		
		//capability of app
		cap.setCapability("appPackage","com.google.android.calculator");
		cap.setCapability("appActivity","com.android.calculator2.Calculator");
		
		//Appium server url
		
	  URL url=new URL("http://localhost:4723/wd/hub");
	  
	  driver = new AndroidDriver(url, cap);
	  
	  WebElement five = driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
	  tapActions(1, five, 500);
	  WebElement plus = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
	  tapActions(1, plus, 500);
	  WebElement eight = driver.findElement(By.id("com.google.android.calculator:id/digit_8"));
	  tapActions(1, 273, 896, 500);
	  WebElement equals = driver.findElement(By.id("com.google.android.calculator:id/eq"));
	  tapActions(1, 613, 1407, 500);
	  WebElement resultScreen = driver.findElement(By.id("com.google.android.calculator:id/result_final"));
	  String result = resultScreen.getText();
	  System.out.println(result);
	  
	
	  }
	
	public static void tapActions(int finger,WebElement element,int duration) {
		  driver.tap(finger,element,duration);
	}
	
	public static void tapActions(int fingers,int x, int y,int duration) {
		driver.tap( fingers, x,y , duration);
	}
	}



