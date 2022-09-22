package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class OpenFb {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();

		// common capability of android

		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "moto e40");
		cap.setCapability(MobileCapabilityType.UDID, "ZD22242NXY");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
        //launch browser
	
		//cap.setCapability("chromedriverExecutable","C:\\Users\\n\\eclipse-workspace101\\Appium3332\\chromedriver.exe");
		cap.setCapability("browserName", "Chrome");
		//Appium server port no.
		 URL url = new URL("http://localhost:4723/wd/hub");
		 AndroidDriver driver =new AndroidDriver (url,cap);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://m.facebook.com");
	        driver.findElement(By.xpath("//input[@id='m_login_email']")).sendKeys("18sanu.k0@gmail.com");
	        driver.findElement(By.xpath("//input[@id='m_login_password']")).sendKeys("Sanu@9204");
	       driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}
