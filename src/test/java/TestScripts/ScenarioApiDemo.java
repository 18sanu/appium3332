package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
/**
 * this is a class to automate apidemo app
 * @author sanu
 *
 */

public class ScenarioApiDemo {
	static AndroidDriver driver=null;
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		   
		   //common  capability of app
		   
		   cap.setCapability(MobileCapabilityType.DEVICE_NAME,"moto e40" );
		   cap.setCapability(MobileCapabilityType.UDID, "ZD22242NXY");
		   cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"android" );
		   cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		   
		 //opening api demo
			cap.setCapability("appPackage","io.appium.android.apis");
			cap.setCapability("appActivity",".ApiDemos");
			 URL url=new URL("http://localhost:4723/wd/hub"); 
			
			 //for opening the app
			driver = new AndroidDriver(url, cap);
			
			//taping on continue
			driver.tap(1, 636, 1460, 500);
			
			//taping on ok
			WebElement ok = driver.findElement(By.id("android:id/button1"));
			driver.tap(1, ok, 500);
			
			//taping on views
			WebElement views = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]"));
            driver.tap(1, views, 500);
            
            //taping on controls
            WebElement controls = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Controls\"]"));
	        driver.tap(1, controls, 500);
	        
	        //taping on lightTheme
	        WebElement lightTheme = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Light Theme\"]"));
	        driver.tap(1, lightTheme, 500);
	        
	        //typing in textbox
	        WebElement textbox = driver.findElement(By.id("io.appium.android.apis:id/edit"));
	        textbox.sendKeys("sanu");
	        
	        //hiding keyboard
	        driver.hideKeyboard();
	        
	        //checking the checkbox1
	        WebElement checkbox1 = driver.findElement(By.id("io.appium.android.apis:id/check1"));
	        driver.tap(1, checkbox1, 500);
	      
	        //checking the checkbox2
	        WebElement checkbox2 = driver.findElement(By.id("io.appium.android.apis:id/check2"));
	        driver.tap(1, checkbox2, 500);
	        
	        //selecting radio button1
	        WebElement radiobutton1 = driver.findElement(By.id("io.appium.android.apis:id/radio1"));
	        driver.tap(1, radiobutton1, 500);
	        
	        //selecting radio button2
	        WebElement radiobutton2 = driver.findElement(By.id("io.appium.android.apis:id/radio2"));
	        driver.tap(1, radiobutton2, 500);
	        
	        //selecting star
	        WebElement star = driver.findElement(By.id("io.appium.android.apis:id/star"));
	        driver.tap(1,star, 500);
	      
	        //turning on toggle1
	        WebElement toggle1 = driver.findElement(By.id("io.appium.android.apis:id/toggle1"));
	        driver.tap(1, toggle1, 500);
	      
	        //turning on toggle2
	        WebElement toggle2 = driver.findElement(By.id("io.appium.android.apis:id/toggle2"));
	        driver.tap(1, toggle2, 500);
	      
	        //tapping on dropdown
	        WebElement dropdown = driver.findElement(By.id("io.appium.android.apis:id/spinner1"));
	        driver.tap(1, dropdown, 500);
	        
	        //printing option
	        for(int i=1;i<9;i++) {
	        	WebElement planet = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView["+i+"]"));
	        System.out.println(planet.getText());
	        }
	        
	        //tapping on jupiter
	        WebElement jupiter = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[5]"));
	        driver.tap(1, jupiter, 500);
	      
	        //taping on save button
	        WebElement save = driver.findElement(By.id("io.appium.android.apis:id/button"));
	        driver.tap(1, save, 500);
	        
	}

}
