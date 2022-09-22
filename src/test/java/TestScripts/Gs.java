package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Gs {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "moto e40");
		caps.setCapability(MobileCapabilityType.UDID, "ZD22242NXY");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		caps.setCapability("appPackage", "com.androidsample.generalstore");
		caps.setCapability("appActivity", ".SplashActivity");

		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		AndroidElement dropDown = driver.findElement(By.id("spinnerCountry"));
		driver.tap(1, dropDown, 10);

		String text= "Australia";
		String scroll = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\""+text+"\"))";
		driver.findElementByAndroidUIAutomator(scroll).click();
		
		driver.findElement(By.id("nameField")).sendKeys("");
		driver.findElement(By.id("radioMale")).click();

		driver.findElement(By.id("btnLetsShop")).click();
		
		String actualToastMessage = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("text");
		System.out.println(actualToastMessage);

		String expectedToastMessage= "Please enter your name";

		if (actualToastMessage.equals(expectedToastMessage)) {
			System.out.println("Pass : Toast Message is Verified ");
		} else {
			System.out.println("Fail : Toast Message is not Verified ");
		}
		
		driver.findElement(By.id("nameField")).sendKeys("Shan");
		driver.findElement(By.id("radioMale")).click();
		driver.findElement(By.id("btnLetsShop")).click();
		
		String text1="Air Jordan 9 Retro";
		String scroll1 = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\""+text1+"\"))";
		driver.findElementByAndroidUIAutomator(scroll1);
		
		 WebElement addToCart = driver.findElement(By.xpath("//android.widget.TextView[@text='Air Jordan 9 Retro']/parent::android.widget.LinearLayout//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart']"));
		    addToCart.click();		
		driver.findElement(By.id("appbar_btn_cart")).click();
		driver.findElementByClassName("android.widget.CheckBox").click();
		driver.findElementByClassName("android.widget.Button").click();
		
		Thread.sleep(10000);
		
		java.util.Set<String> contextNames = driver.getContextHandles();
		for (String contextName : contextNames) {
			System.out.println(contextName);
		}
		driver.context("WEBVIEW_com.androidsample.generalstore");
		

	}

}
