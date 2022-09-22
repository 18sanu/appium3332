package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DragAndDrop {
	static AndroidDriver driver=null;
   
	@Parameters({"deviceName","UDID","PLATFORM_VERSION","port"})
	@Test
	public static void dragAndDrop(String deviceName,String UDID,String PLATFORM_VERSION,String port) throws MalformedURLException {
DesiredCapabilities cap=new DesiredCapabilities();
		
		//common capability of android
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		cap.setCapability(MobileCapabilityType.UDID,UDID );
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, PLATFORM_VERSION);
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap.setCapability(MobileCapabilityType.FULL_RESET, false);
		
	
		cap.setCapability("appPackage","io.appium.android.apis");
		cap.setCapability("appActivity",".ApiDemos");
		 URL url=new URL("http://localhost:"+port+"/wd/hub");
		//for opening the app
		driver = new AndroidDriver(url, cap);
    
		
		//taping on views
		WebElement views = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]"));
        driver.tap(1, views, 500);
        
        //taping on drag and drop
        WebElement dragAndDrop = driver.findElementByAccessibilityId("Drag and Drop");
        driver.tap(1, dragAndDrop, 500);
       
        WebElement src = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
        WebElement dest = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_2"));
        
        TouchAction to = new TouchAction(driver);
        to.longPress(src).waitAction().moveTo(dest).perform().release();
		
		

	}

}
